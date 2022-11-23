package projekti.kahvikauppa;

import java.math.BigDecimal;

import org.hibernate.dialect.pagination.NoopLimitHandler;

public class Tuote {
    private String nimi;
    private String kuvaus;
    private BigDecimal hinta;
    private Blob tuotekuva;

}