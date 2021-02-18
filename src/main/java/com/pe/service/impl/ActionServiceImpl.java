package com.pe.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pe.dto.ResponseDTO;
import com.pe.service.ActionService;

@Service
public class ActionServiceImpl implements ActionService {

    private RestTemplate restTemplate = null;

    @Override
    public List<String> convert() {
        String urlWS = "https://jsonplaceholder.typicode.com/comments";
	
	restTemplate = new RestTemplate();
	ResponseDTO[] responseArray = restTemplate.getForEntity(urlWS, ResponseDTO[].class).getBody();
	
	List<ResponseDTO> responseList = Arrays.asList(responseArray);
	List<String> dataList = responseList.stream().map(r -> formatData(r)).collect(Collectors.toList());
	
	return dataList;
    }
    
    private String formatData(ResponseDTO r) {
	return r.getPostId()+"|"+r.getId()+"|"+r.getEmail();
    }

}
