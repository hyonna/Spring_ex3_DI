package com.iu.s3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.board.BoardDAO;
import com.iu.board.BoardService;
import com.iu.board.Test;
import com.iu.car.Engine;
import com.iu.car.MyCar;
import com.iu.car.Wheel;
import com.iu.notice.NoticeService;
import com.iu.util.DBConnector;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
//	@Inject
//	private Wheel wheel;
//	
//	@Inject
//	private Engine engine;
	
//	@Inject
//	private MyCar myCar;
	
	
//	@Inject
//	private BoardService boardService;
	
	@Inject
	private NoticeService noticeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		try {
			
			noticeService.insert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for (Wheel wheel : myCar.getWheels()) {
//			
//			System.out.println(wheel.getBrand());
//			System.out.println(wheel.getSize());
//			
//		}
//
//		myCar.getWheels().get(0).setBrand("KOREA");
//		
//		for (Wheel wheel : myCar.getWheels()) {
//			
//			System.out.println(wheel.getBrand());
//			System.out.println(wheel.getSize());
//			
//		}
//
//		
//		System.out.println(myCar.getEngine().getFuel());
//		System.out.println(myCar.getEngine().getHp());
//		System.out.println(myCar.getEngine().getCompany());
		
		return "home";
	}
	
}
