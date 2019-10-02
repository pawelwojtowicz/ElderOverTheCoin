package com.gutfilin.overthecoin.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyCollectionService {
	@Autowired
	MoneyCollectionRepository repository;

}
