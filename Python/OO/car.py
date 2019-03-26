#!/usr/bin/python
#criando a classe Car
class Car():
    #criando o metodo construtor 
    def __init__(self,marca,modelo,ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.combustivel = 'gasolina'
    #criando os metodos (comportamentos)
    def acelerar(self):
        print ('Vruuumm')
    def freiar(self):
        print('ckhuuuuulll')
class Car_Eletric(Car):
    def __init__(self, marca,modelo,ano):
        super().__init__(marca,modelo,ano)
        self.combustivel = 'eletrico'
    def acelerar(self):
        print ('shiiiiiiiuuuuu')





#instanciando os objetos
car1 = Car('BM2', 'I320', 2016)
print(car1.modelo, car1.combustivel)
car1.acelerar()

car2 = Car_Eletric('chevrolet', 'bolt', 2018)
print(car2.modelo, car2.combustivel)
car2.acelerar()


    

