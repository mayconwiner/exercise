#!/usr/bin/python
class Dog():
    '''abstraindo um cachorro'''

    def __init__(self,nome,raca,idade):
        self.nome = nome
        self.raca = raca
        self.idade = idade
        self.energia = 10
        self.sede = 10
        self.fome = 10

    def latir(self):
        print('latindo')

    def andar(self):
        print("Andando")
        self.energia -= 1
        self.fome    -= 1
        self.sede    -=1

    def dormir(self):
        print("Dormingo")
    def comer(self):
        print("comendo...")
    
    

dog1 = Dog('bilu', 'pitbull',2)
 

dog1.andar()
print(dog1.nome, '''
                    energia{}
                    fome{}
                    sede{}

'''.format(dog1.energia, dog1.fome, dog1.sede),sep='\n')
int(dog1.nome, '''
                    energia{}
                    fome{}
                    sede{}

'''.format(dog1.energia, dog1.fome, dog1.sede),sep='\n')