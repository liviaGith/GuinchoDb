public class Guincho {


        private String tipo;
        private double taxaDeslocamento;

        public Guincho(String tipo, double taxaDeslocamento) {
            this.tipo = tipo;
            this.taxaDeslocamento = taxaDeslocamento;
        }

        public double calcularCustoDeslocamento(double distancia) {
            return distancia * taxaDeslocamento;
        }

        // getters e setters

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getTaxaDeslocamento() {
            return taxaDeslocamento;
        }

        public void setTaxaDeslocamento(double taxaDeslocamento) {
            this.taxaDeslocamento = taxaDeslocamento;
        }
    }



