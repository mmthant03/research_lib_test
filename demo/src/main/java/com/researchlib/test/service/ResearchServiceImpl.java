package com.researchlib.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.researchlib.test.dto.ResearchViewDto;
import com.researchlib.test.model.Professor;
import com.researchlib.test.model.Research;
import com.researchlib.test.model.ResearchProfessor;
import com.researchlib.test.model.ResearchResearcher;
import com.researchlib.test.model.Researcher;
import com.researchlib.test.repository.ProfessorRepository;
import com.researchlib.test.repository.ResearchProfessorRepository;
import com.researchlib.test.repository.ResearchRepository;
import com.researchlib.test.repository.ResearchResearcherRepository;
import com.researchlib.test.repository.ResearcherRepository;

@Service
public class ResearchServiceImpl implements ResearchService{

	@Autowired
	ResearchRepository researchRepository;
	@Autowired
	ResearcherRepository researcherRepository;
	@Autowired
	ProfessorRepository professorRepository;
	@Autowired
	ResearchProfessorRepository researchProfessorRepository;
	@Autowired
	ResearchResearcherRepository researchResearcherRepository;
	
	@Override
	public List<Research> extractResearch() {
		return researchRepository.findAll();
	}
	
	 public static double similarity(String s1, String s2) {
		 
		 String longer = s1, shorter = s2;
		 if (s1.length() < s2.length()) { // longer should always have greater length
			longer = s2; shorter = s1;
		 }
		 	int longerLength = longer.length();
		    if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
		    	return (longerLength - editDistance(longer, shorter)) / (double) longerLength;

		  }

		  public static int editDistance(String s1, String s2) {
		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();

		    int[] costs = new int[s2.length() + 1];
		    for (int i = 0; i <= s1.length(); i++) {
		      int lastValue = i;
		      for (int j = 0; j <= s2.length(); j++) {
		        if (i == 0)
		          costs[j] = j;
		        else {
		          if (j > 0) {
		            int newValue = costs[j - 1];
		            if (s1.charAt(i - 1) != s2.charAt(j - 1))
		              newValue = Math.min(Math.min(newValue, lastValue),
		                  costs[j]) + 1;
		            costs[j - 1] = lastValue;
		            lastValue = newValue;
		          }
		        }
		      }
		      if (i > 0)
		        costs[s2.length()] = lastValue;
		    }
		    return costs[s2.length()];
		  }

		  public static void printSimilarity(String s, String t) {
		    System.out.println(String.format(
		      "%.3f is the similarity between \"%s\" and \"%s\"", similarity(s, t), s, t));
		  }
		  
		  @Override
		  public List<Research> searchResearches(String searchString){
			  List<Research> researches = researchRepository.findAll();
			  List<Research> selectedResearches = new ArrayList<>();
 			  
			 
			  
			  for(Research r : researches) {
				  String rname = r.getName();
				  Double similarity = similarity(searchString, rname);
				  if(similarity > 0.000) {	
					  selectedResearches.add(r);
				  }
			  }
			  
			  return selectedResearches;
		  }
		  
		  @Override
		  public ResearchViewDto getResearch(Integer researchId) {
			  Research selectedResearch = researchRepository.getOne(researchId);
			  List<ResearchResearcher> researchers = researchResearcherRepository.findByResearchId(researchId);
			  List<ResearchProfessor> professors = researchProfessorRepository.findByResearchId(researchId);
			  
			  List<String> researcherNames = new ArrayList<>();
			  List<String> professorNames = new ArrayList<>();
			  
			  for (ResearchResearcher rr : researchers) {
				  Researcher r = researcherRepository.getOne(rr.getResearcherId());
				  researcherNames.add(r.getName());
			  }
			  
			  for (ResearchProfessor rp : professors) {
				  Professor p = professorRepository.getOne(rp.getProfessorId());
				  professorNames.add(p.getName());
			  }
			  
			  ResearchViewDto researchView = new ResearchViewDto();
			  researchView.setResearchName(selectedResearch.getName());
			  researchView.setResearchFile(selectedResearch.getFile());
			  researchView.setDescription(selectedResearch.getDescription());
			  researchView.setProfessorNames(professorNames);
			  researchView.setStudentNames(researcherNames);
			  
			  return researchView;
		  }

}
