package com.yc.cinema.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cinema {
    private Integer id;
    private String name;
    private String address;
    private String gps;
    private String img;
}
