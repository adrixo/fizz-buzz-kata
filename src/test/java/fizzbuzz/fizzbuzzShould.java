package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzShould {

    @Test
    public void
    convert_1_to_1() {
        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
    }

    @Test
    public void
    convert_2_to_2() {
        assertThat(FizzBuzz.convert(2)).isEqualTo("2");
    }

    @Test
    public void
    convert_4_to_4() {
        assertThat(FizzBuzz.convert(4)).isEqualTo("4");
    }


    
}