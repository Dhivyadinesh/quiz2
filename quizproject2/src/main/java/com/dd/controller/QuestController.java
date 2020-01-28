package com.dd.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.dd.entity.Answer;
import com.dd.entity.Electric;
import com.dd.entity.Program;
import com.dd.entity.User;
import com.dd.service.QuestService;
import com.dd.service.UserAuthenticationService;


@Controller
public class QuestController {
	
    @Autowired
    private UserAuthenticationService userAuthenticationService;
    
	@Autowired
	private QuestService<?> questService;
	
	@Autowired
	private User user;
	
	@Autowired
	private Answer ans;
	
	@Autowired
	private Program program;

	@GetMapping("/")
	public String getForm() {
		return "mainpage";
	}
	
	@GetMapping("/userregister")
	public String getUserpage() {
		return "userregister";
	}

	@GetMapping("/admin")
	public String getAdminpage(){
	     ModelAndView model = new ModelAndView();
	     model.setViewName("admin");
	     return "admininfo";
	}
	   
    @GetMapping("/admin/accessDenied")
	public String accessDenied(){
	     ModelAndView model = new ModelAndView();
	     model.setViewName("accessDenied");
	     return "admin";
	}
    
	@PostMapping("/saveDetails")
	public String saveDetails(@RequestParam("name") String userName, @RequestParam("uname") String username,
			@RequestParam("passwd") String password, Map<String, Object> model) {
		user.setName(userName);
		user.setUname(username);
		user.setPasswd(password);
		questService.adduser(user);
		User tmpuser  = questService.finduserByUsername(username);
		model.put("user", tmpuser);
		return "questionpath";
	}

	
	@PostMapping("/program")
	public ModelAndView getQuestions( @RequestParam("userId") int userId){
		ModelAndView model = new ModelAndView();
		
		List<Program> Programques= new ArrayList<>();
		Programques=questService.getProgram();
		
		for(Program q : Programques){
			System.out.println(q.gettext());
			System.out.println(q.getOpt_1());
		}
		
		Map<String,Object> allObjectsMap = new HashMap<String,Object>();
	    allObjectsMap.put("Question", Programques);
	    allObjectsMap.put("userId", userId);
	    model.addAllObjects(allObjectsMap);
	    model.setViewName("program");
	    return model;
	    
	   }
	
	@PostMapping("/electric")
	public ModelAndView getEQuestions( @RequestParam("userId") int userId){
		ModelAndView model = new ModelAndView();
		
		List<Electric> Electricques= new ArrayList<>();
		Electricques=questService.getElectric();
		
		for(Electric e : Electricques){
			System.out.println(e.gettext());
			System.out.println(e.getOpt_1());
		}
		
		Map<String,Object> allObjectsMap = new HashMap<String,Object>();
	    allObjectsMap.put("Electric", Electricques);
	    allObjectsMap.put("userId", userId);
	    model.addAllObjects(allObjectsMap);

	    model.setViewName("electric");
	    return model;
	    
	   }
	
	@PostMapping("/saveAns")
    public String saveAns(@RequestParam("1")String colour){		
			ans.setQ_ques_id(1);
			ans.setQ_ans_text(colour);
			ans.setE_ques_id(1);
			ans.setQ_ans_text(colour);
			questService.saveAnswers(ans);
			return "score";
		}

	public UserAuthenticationService getUserAuthenticationService() {
		return userAuthenticationService;
	}

	public void setUserAuthenticationService(UserAuthenticationService userAuthenticationService) {
		this.userAuthenticationService = userAuthenticationService;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
	
}
