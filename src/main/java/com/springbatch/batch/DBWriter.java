package com.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbatch.model.User;

import com.springbatch.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		log.info("Data Saved For Users " + users);
		userRepository.saveAll(users);
	}

}
