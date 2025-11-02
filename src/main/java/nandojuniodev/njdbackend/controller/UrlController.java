package nandojuniodev.njdbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import nandojuniodev.njdbackend.dtos.RequestDtoUrl;
import nandojuniodev.njdbackend.dtos.ResponseDtoUrl;
import nandojuniodev.njdbackend.model.ImageUrl;
import nandojuniodev.njdbackend.service.UrlService;

@Controller
@RequestMapping("/images")
public class UrlController {

@Autowired
private UrlService urlService;


@GetMapping("/buscar")
public ResponseEntity<List<ImageUrl>> buscarUrls() {
    List<ImageUrl> urls = urlService.obterTodosRegistros();
    return ResponseEntity.ok(urls);

}

@PostMapping("/criar")
public ResponseEntity<ResponseDtoUrl> criarUrl(@RequestBody RequestDtoUrl dto) {
    ResponseDtoUrl novaUrl = urlService.criarRegistro(dto);

    return new ResponseEntity<>(novaUrl,HttpStatus.CREATED);



}

}