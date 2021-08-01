package com.vsvdev.init.web;

import com.vsvdev.init.model.Hit;
import com.vsvdev.init.repo.HitRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hits")
@RequiredArgsConstructor
public class HitController {

  private final HitRepository hitRepository;

  @GetMapping
  public List<Hit> findAll() {
    return hitRepository.findAll();
  }

}
