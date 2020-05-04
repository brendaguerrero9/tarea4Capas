package com.uca.capas.tarea3nCapas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea3nCapas.domain.Producto;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView producto(@ModelAttribute Producto product) {
		ModelAndView mav= new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav= new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("nombre", product.getNombre());
			mav.setViewName("resultado");
		}
		return mav;
		}
}
