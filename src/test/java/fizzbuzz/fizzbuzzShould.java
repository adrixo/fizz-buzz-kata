package fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class fizzbuzzShould {

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "2,2",
        "4,4"
    })
    public void
    convert_numbers(int input, String result) {
        assertThat(FizzBuzz.convert(input)).isEqualTo(result);
    }

}