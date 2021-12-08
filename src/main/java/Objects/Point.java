package Objects;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Point {
    Double x;
    Double y;
}
