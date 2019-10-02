package com.gutfilin.overthecoin.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyCollectionController {
	@Autowired
	MoneyCollectionService service;

}
