package ico.fes.intro.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    private int id;
    private double sueldo;
    private String nombre;
    private String departamento;
    private String fechaNacimiento;
}
