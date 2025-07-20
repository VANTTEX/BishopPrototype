package com.example.BishopPrototype.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.T1Debut.exception.QueueOverflowException;
import ru.T1Debut.model.Command;
import ru.T1Debut.service.CommandService;

@RestController
@RequestMapping("/demo")
public class CommandController {

    private final CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    @PostMapping("/command")
    public ResponseEntity<?> receiveCommand(@Valid @RequestBody Command command) throws  QueueOverflowException {
        commandService.process(command);
        return ResponseEntity.ok().build();
    }
}



