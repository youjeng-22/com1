package com.springstudy.shop.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class ItemController {


    @GetMapping(value = "/admin/item/new")
    public String item(){
        return "item/itemForm";
    }


}
