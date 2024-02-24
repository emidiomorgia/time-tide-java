package info.morgia.timetide.bff.controllers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class HelloResponseGetDto {

    private String name;
    private int id;

    public HelloResponseGetDto(String name, int id) {
        this.setName(name);
        this.setId(id);
    }
}