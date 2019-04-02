#!/usr/bin/python3
from core import user_table,engine
con = engine.connect()
ins = user_table.insert()
#insert pessoa

#new = ins.values(idade=24, nome='teste','senha='testando')
#con.execute(new)
#insert pessoas
con.execute(ins,[
    {'nome':'Maycon','idade'=20,'senha':'abcdwoid'}])
con.execute(ins,[
    {'nome':'Italo','idade'=20,'senha':'abcdwoid'}])
con.execute(ins,[
    {'nome':'Beatriz','idade'=20,'senha':'abcdwoid'}])
