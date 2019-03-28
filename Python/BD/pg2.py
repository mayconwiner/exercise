#!/usr/bin/python3
import psycopg2
try:
    con = psycopg2.connect(
        'host=localhost dbname=projeto1 user=admin password=4linux')
    cur = con.cursor()
except Exception as e:
    print('Erro {}'.format(e))
    exit()

cur.execute("insert into usuarios(nome,idade) values ('Gabriel',17);")
cur.execute("insert into usuarios(nome,idade) values ('João',20);")
cur.execute("insert into usuarios(nome,idade) values ('Merika',19);")
cur.execute("insert into usuarios(nome,idade) values ('Carolina ',16);")
cur.execute("insert into usuarios(nome,idade) values ('Amanda',15);")
con.commit()

cur.close()
con.close()

