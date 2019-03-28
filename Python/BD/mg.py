#!/usr/bin/python3
from pymongo import MongoClient
from pprint import pprint

try:
    con = MongoClient()
    db = con['projetos']
except Exception as e:
    print("Erro {}".format(e))
    exit()
#db.usuarios.insert({'_id':2, 'nome':'pedro', 'idade:'47})
#print(db.usuarios.find_one()) 
#print(db.usuarios.find_one()['nome']) 
#print(db.usuarios.find()) #traz um objeto do tipo cursor , prec de um loop para exibilo 
# for x in db.usuarios.find():
#     print(x) 
#print([x for x in db.usuarios.fine()])

#db.usuarios.remove({'_id':3})
#print([x for x in db.usuarios.fine()])

# db.usuarios.update({'_id':1}, {'$set':{'projetos':[]}})
# pprint([x for x in db.usuarios.fine()])

# db.usuarios.update({'_id':1}, {'$push':{'projetos':{'nome':'bevops','desc':'api'}}})
# pprint([x for x in db.usuarios.fine()])

db.usuarios.update({'_id':1}, {'$pull':{'projetos':{'nome':'bevops'}}})
pprint([x for x in db.usuarios.fine()])
