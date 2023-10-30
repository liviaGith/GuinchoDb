public class Veiculo {

        private String tipo;
        private String estadoConservacao;

        public Veiculo(String carro, String novo) {
        }

        public void Veiculo(String tipo, String estadoConservacao) {
            this.tipo = tipo;
            this.estadoConservacao = estadoConservacao;
        }

        // getters e setters

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getEstadoConservacao() {
            return estadoConservacao;
        }

        public void setEstadoConservacao(String estadoConservacao) {
            this.estadoConservacao = estadoConservacao;
        }
    }



