package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HelloController {
//	@RequestMapping("/hello")
//    public String sayHello(Model model) {             
//        model.addAttribute("msg", "Hello Ganesh");       
//        return "hello";
//    }
	
	@RequestMapping("/Another")
    public ModelAndView getlogin(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {             
		ModelAndView mav=new ModelAndView("First");
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		int f=0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/CASESTUDYDB","root","admin@123");
			PreparedStatement p1=con.prepareStatement("select userid from user where username=? and PASSWORD=?");
			p1.setString(1, username);
			p1.setString(2, password);
			ResultSet rs=p1.executeQuery();
			if(rs.next()) {
				f=1;
				return mav;
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return new ModelAndView("index");
	}
}
