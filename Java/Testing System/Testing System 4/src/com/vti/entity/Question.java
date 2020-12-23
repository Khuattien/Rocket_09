package com.vti.entity;

import java.time.LocalDate;

public class Question {
	int id;
    String content;
    CategoryQuestion categoryId;
    TypeQuestion typeId;
    Account account;
    LocalDate createDate;
}
