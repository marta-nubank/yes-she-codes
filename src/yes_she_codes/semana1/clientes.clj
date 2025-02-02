(ns yes-she-codes.semana1.clientes
  (:use [clojure pprint])
  (:require [yes-she-codes.semana1.db :as y.db]
            [yes-she-codes.semana1.logic :as y.logic]))

(defn novo-cliente
  [nome cpf email]
  {:NOME nome :CPF cpf :EMAIL email})

(defn lista-clientes
  [clientes]
  (map (fn [[nome cpf email]]
         (novo-cliente nome cpf email))
       clientes))

(defn listar-clientes-csv
  [filepath]
  (y.logic/csv-data->maps (y.logic/read-csv filepath)))

(def clientes (lista-clientes y.db/clientes))
(def meus-clientes (listar-clientes-csv "/Users/marta.lima/Desktop/YSC/yes-she-codes/src/yes_she_codes/semana1/clientes.csv"))

(pprint "Função listar clientes a partir do db")
(pprint clientes)

(pprint "Função listar clientes a partir do csv")
(pprint meus-clientes)
