package cn.kgc.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bills {
    private Integer id;

    private String title;

    private Date billTime;

    private Integer typeId;

    private Integer price;

    private String bexplain;

    private String bname;

}