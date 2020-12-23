package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	int id;
    String code;
    String title;
    String categoryId;
    int duration;
    Account account;
    LocalDate createDate;
    Question[] questions;
}
