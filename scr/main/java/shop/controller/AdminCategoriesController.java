package shop.controller;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import shop.entity.Category;
import shop.service.CategoryService;

@Controller
@RequestMapping(value = "/adminCat")
public class AdminCategoriesController implements HandlerExceptionResolver {

	@Autowired
	private CategoryService cs;
	

	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categories", cs.listCategories());
		return "categories";
	}

	@RequestMapping(value = "/saveCat")
	public String saveCat(@Valid Category c, BindingResult bindingResult,
			MultipartFile file, Model model) throws Exception {

		if (bindingResult.hasErrors()) {
			model.addAttribute("categories", cs.listCategories());
			return "categories";
		}

		if (!file.isEmpty()) {
			c.setPhoto(file.getBytes());
			c.setNamePhoto(file.getOriginalFilename());
		} else {
			if (c.getId() != null) {
				Category cat = cs.getCategory(c.getId());
				if (cat.getPhoto() != null) {
					c.setPhoto(cat.getPhoto());
				}
			}

		}

		if (c.getId() == null)
			cs.addCategory(c);
		
		else
			cs.editCategory(c);

		model.addAttribute("category", new Category());
		model.addAttribute("categories", cs.listCategories());

		return "categories";
	}

	
	@RequestMapping(value = "/suppCat")
	public String suppCat(Long idCat, Model model) {
		cs.removeCategrory(idCat);
		model.addAttribute("category", new Category());
		model.addAttribute("categories", cs.listCategories());

		return "categories";
	}

	

	@RequestMapping(value = "/editCat")
	public String editCat(Long idCat, Model model) {
		Category c = cs.getCategory(idCat);
		model.addAttribute("categorie", c);
		model.addAttribute("categories", cs.listCategories());
		return "categories";
	}

	
	@RequestMapping(value = "/photoCat", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] photoCat(Long idCat) throws Exception {

		Category categorie = cs.getCategory(idCat);
		byte[] photo = categorie.getPhoto();

		if (photo != null)
			return IOUtils.toByteArray(new ByteArrayInputStream(photo));
		else
			return null;
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception ex) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("categorie", new Category());
		mv.addObject("exception", ex.getMessage());
		mv.setViewName("categories");
		return mv;
	}

}
