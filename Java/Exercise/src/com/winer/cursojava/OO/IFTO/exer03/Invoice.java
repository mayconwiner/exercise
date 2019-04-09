public class Invoice {
    //Atributos:

    private String numero;
    private String descricao;
    private int quantComprada;
    private double precoUnit;

    public Invoice(String num, String des, int quant, double pre) {
        this.setNumero(num);
        this.setDescricao(des);
        this.setQuantComprada(quant);
        this.setPrecoUnit(pre);
    }

    public String getNumero() {
        return this.numero;
    }

    private void setNumero(String num) {
        this.numero = num;
    }

    public String getDescricao() {
        return this.descricao;

    }

    private void setDescricao(String des) {
        this.descricao = des;
    }

    public int getQuantComprada() {
        return this.quantComprada;
    }

    private void setQuantComprada(int quant) {
        this.quantComprada = quant;
    }

    public double getPrecoUnit() {
        return this.precoUnit;
    }

    private void setPrecoUnit(double pre) {
        this.precoUnit = pre;
    }

    public double getInvoiceAmount() {
        double valorFat = this.getQuantComprada() * this.getPrecoUnit();
        return valorFat;
    }

    public static void main(String[] args) {
        Invoice hd = new Invoice("001", "HD 2 tb, Sata, 7200 RPM", 2, 400.0);
        Invoice mem = new Invoice("002", "Memória DDR 5, 4 gb, 1333 GHz", 4, 100.0);
        System.out.println(" Número: " + hd.getNumero());
        System.out.println(" Produto: " + hd.getDescricao());
        System.out.printf(" Preço unit: R$ %.2f \n ", hd.getPrecoUnit());
        System.out.println("Quant. comprada: " + hd.getQuantComprada());
        System.out.printf(" Total da Fatura: R$ %.2f \n ", hd.getInvoiceAmount());
        System.out.println("--------------------------------------");

        System.out.println(
                " Número: " + mem.getNumero());
        System.out.println(
                " Produto: " + mem.getDescricao());
        System.out.printf(
                " Preço unit.: R$ %.2f \n ", mem.getPrecoUnit());
        System.out.println(
                "Quant. comprada: " + mem.getQuantComprada());
        System.out.printf(
                " Total da Fatura: R$ %.2f \n ", mem.getInvoiceAmount());

    }

}
