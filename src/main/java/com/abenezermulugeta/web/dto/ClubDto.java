package com.abenezermulugeta.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClubDto {
    private Long id;
    private String title;
    private String photoUrl;
    private String content;
    private LocalDate createdOn;
    private LocalDate updatedOn;
}
