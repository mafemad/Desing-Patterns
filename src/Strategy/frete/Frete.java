package Strategy.frete;

import Strategy.Produto;

import java.time.LocalDate;

public interface Frete {

    double cacular(Produto p, LocalDate d);
}
