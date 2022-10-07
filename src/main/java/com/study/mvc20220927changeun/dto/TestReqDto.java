package com.study.mvc20220927changeun.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data // @EqualsAndHashCode, @Setter, @Getter, @ToString을 묶어서 @Data 로 사용 가능
public class TestReqDto {
    private  String strData;
    private  String name;
    private  int number;


}
