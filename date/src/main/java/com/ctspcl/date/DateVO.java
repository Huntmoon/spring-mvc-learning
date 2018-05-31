package com.ctspcl.date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author wangtao
 * @since 2018/5/28
 */
@Data
@Builder
public class DateVO {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate localDate;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime localDateTime;
}
