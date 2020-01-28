package com.dd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dd.entity.Answer;
import com.dd.entity.Electric;
import com.dd.entity.Program;
import com.dd.entity.User;
import com.dd.repository.AnswerRepository;
import com.dd.repository.ElectricRepository;
import com.dd.repository.ProgramRepository;
import com.dd.repository.UserRepository;

@Service
public class QuestService<adduser> {
	
	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
	private ProgramRepository programRepository;
	
	@Autowired
	private ElectricRepository electricRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private Answer ans;
	
	@Autowired
	User user;

	public void adduser(User user) {
		userRepository.save(user);
	}
	
	public User finduserByUsername(String username) {
		User user=userRepository.finduserByUsername(username);
		return user;
	}
	
	public User finduserById(int id) {
		user=userRepository.findByuserId(id);
		return user;
	}
	
	public List<Program> getProgram(){
		List<Program> programs= programRepository.findAll();
		return programs;
	}
	
	public void save (Program program){
	        programRepository.save(program);
	}

	public List<Electric> getElectric(){
		List<Electric> electric= electricRepository.findAll();
		return electric;
	}
	
    public void save (Electric electric){
	       electricRepository.save(electric);
	}

	public void saveAnswers(Answer ans) {
		answerRepository.save(ans);
		
	}

   
}
