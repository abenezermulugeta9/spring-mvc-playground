package com.abenezermulugeta.web.service;

import com.abenezermulugeta.web.dto.ClubDto;
import com.abenezermulugeta.web.model.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
