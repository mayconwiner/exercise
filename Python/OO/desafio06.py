''' Faça uma abastração de uma conta corrente que tenha no mínimo 3 métodos (sacar,depositar,transferir), 
instancie a classe poupança herdando de conta corrente, porém deve realizar um método com polimorfismo 
e incrementar o método render juros.'''


class Conta():
    '''Tentando abstrair uma conta corrente '''

    def __init__(self, titular, numero, saldo):
        self.titular = ''
        self.numero = 1
        self.saldo = 0

    def sacar(self, valor):
        self.saldo -= valor

    def depositar(self, valor):
        self.saldo += valor

    def transferir(self, valor, conta):
        self.sacar(valor)
        conta.depositar(valor)
        
 
c1 = Conta('Maycon', 3932, 1500)
print(c1.saldo, c1.titular, sep='\n')

c2 = Conta('Maycon', 3932, 1500)
print(c2.saldo, c2.titular, sep='\n')

    #continuar exercicio OO conta ###