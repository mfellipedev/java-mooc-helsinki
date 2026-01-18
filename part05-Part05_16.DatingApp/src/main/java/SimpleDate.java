
import java.util.Objects;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;

    }

    public boolean before(SimpleDate compared) { //Metodo que compara as datas, e retorna true se o objeto for mais velho que o comparado
        compared = Objects.requireNonNull(compared, "É preciso uma data valida"); //Testei a meneira de verificar se é null

        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() { //Metodo para avancar os dias
        this.day++;
        if (this.day > 30) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }

        /*Icrementa seguindos um dia, seguindo as verificacoes
        Se os dias forem maiores que 30, icremente o mes em mais um, e resete os dias para 1
        Se os meses forem maiores que 12, icremente o ano em mais um, e resete os meses para 1*/
    }

    public void advance(int howManyDays) { //Metodo para avancar os dias por um periodo informado
        int i = 0;
        while (i < howManyDays) {//Loop para rodar o metodo advance seguindos a quantidade de dias informados por parametros
            advance();
            i++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) { //Metodo que cria um novo objeto com a mesma data dos atributos da classe, e aumenta os dias do novo objeto seguindo o parametro days
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;

    }

}
