public class NoEstudo {
        private int dado;
        private No proximo;

        public NoEstudo(int dado, No proximo) {
            this.dado = dado;
            this.proximo = proximo;
        }

        public int getDado() {
            return dado;
        }

        public No getProximo() {
            return proximo;
        }

        public void setDado(int dado) {
            this.dado = dado;
        }

        public void setProximo(No proximo) {
            this.proximo = proximo;
        }
    }
