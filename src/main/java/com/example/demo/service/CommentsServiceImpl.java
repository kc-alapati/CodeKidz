package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Comments;
import com.example.demo.repository.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentsService {

	private CommentsRepository comRepo;

	public CommentsServiceImpl(CommentsRepository comRepo) {

		this.comRepo = comRepo;
	}

	@Override
	public List<Comments> commentsList() {
		return comRepo.findAll();
	}

	@Override
	public Comments addComment(String comment) {
		Comments c = new Comments();
		c.setComments(comment);
		return comRepo.save(c);
	}

}
