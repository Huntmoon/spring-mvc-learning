package com.ctspcl.date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.SerializerFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author wangtao
 * @since 2018/5/30
 */
public class Jackson {
    public static void main(String[] args) throws IOException {
        StringDO stringDO = new StringDO();
        stringDO.setStr("test");
        ObjectWriter writer = new ObjectMapper().writer();
        SerializerFactory serializerFactory = BeanSerializerFactory.instance.withSerializerModifier(new DictBeanSerializerModifier());
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializerFactory(serializerFactory);
        System.out.println(objectMapper.writer().writeValueAsString(stringDO));

//        Object o = new ObjectMapper().readerFor(StringDO.class).readValue("{\"str\":\"test\",\"strDictName\":\"testDict\"}");
//
//        System.out.println(o);
//        System.out.println(writer.writeValueAsString(stringDO));
    }
}
