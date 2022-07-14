package DataStructures.Implementation;

import DataStructures.Applications.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Node {
    private Car data;
    private Node nextNode;
    private Node prevNode;
}
