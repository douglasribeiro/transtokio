package com.developer.tokio.transtokio.controllers;

import com.developer.tokio.transtokio.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/transfer")
@AllArgsConstructor
public class TransferController {

    private final TransferService transferService;


}
