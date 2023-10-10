package com.daro.ChiffreRomain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.converter.ArgumentConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class ChiffreRomainTest {
    ChiffreRomain chiffreRomain;
    @Test
    void convertir_1_reture_I(){
        //given
        int i=1;
        //when
        String result= chiffreRomain.convert(i);
        //then
        assertThat(result).isEqualTo("I");
    }
}
