#!/usr/bin/python3
from sqlalchemy import update
from core import user_table,engine
con = engine.connect()
atualizar = update(user_table).where(user_table.c.nome=="teste")
atualizar = atualizar.values(nome='daniel')
result = con.execute(atualizar)
print(result.rowcount)


atualizar = update(user_table).where(user_table.c.nome=='daniel')
atualizar = atualizar.values(idade=(user_table.c.idade =1))
result = con.execute(atualizar)
print(result.rowcount)
