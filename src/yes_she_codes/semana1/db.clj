(ns yes-she-codes.semana1.db
  (:require [java-time :as t]))

(def clientes
  [["Feiticeira Escarlate" "000.111.22-33" "feiticeira.poderosa@vingadoras.com.br"]
   ["Viúva Negra" "333.444.555-66" "viuva.casca.grossa@vingadoras.com.br"]
   ["Hermione Granger" "666.777.888-99" "hermione.salvadora@hogwarts.com"]
   ["Daenerys Targaryen" "999.123.456-78" "mae.dos.dragoes@got.com"]])

(def cartoes
  [[1234123412341234 111 (t/format (t/year-month (t/local-date 2023 01))) 1000 "000.111.22-33"]
   [4321432143214321 222 (t/format (t/year-month (t/local-date 2024 02))) 2000 "333.444.555-66"]
   [1598159815981598 333 (t/format (t/year-month (t/local-date 2021 03))) 3000 "666.777.888-99"]
   [6655665566556655 444 (t/format (t/year-month (t/local-date 2025 04))) 4000 "666.777.888-99"]
   [3939393939393939 555 (t/format (t/year-month (t/local-date 2026 05))) 5000 "999.123.456-78"]])

(def compras
  [[(t/format (t/local-date 2022 01 01)) 129.90 "Outback" "Alimentação" 1234123412341234]
   [(t/format (t/local-date 2022 01 02)) 260.00 "Dentista" "Saúde" 1234123412341234]
   [(t/format (t/local-date 2022 02 01)) 20.00 "Cinema" "Lazer" 1234123412341234]
   [(t/format (t/local-date 2022 01 10)) 150.00 "Show" "Lazer" 4321432143214321]
   [(t/format (t/local-date 2022 02 10)) 289.99 "Posto de gasolina" "Automóvel" 4321432143214321]
   [(t/format (t/local-date 2022 02 20)) 79.90 "iFood" "Alimentação" 4321432143214321]
   [(t/format (t/local-date 2022 03 01)) 85.00 "Alura" "Educação" 4321432143214321]
   [(t/format (t/local-date 2022 01 30)) 85.00 "Alura" "Educação" 1598159815981598]
   [(t/format (t/local-date 2022 01 31)) 350.00 "Tok&Stok" "Casa" 1598159815981598]
   [(t/format (t/local-date 2022 02 01)) 400.00 "Leroy Merlin" "Casa" 1598159815981598]
   [(t/format (t/local-date 2022 03 01)) 50.00 "Madero" "Alimentação" 6655665566556655]
   [(t/format (t/local-date 2022 03 01)) 70.00 "Teatro" "Lazer" 6655665566556655]
   [(t/format (t/local-date 2022 03 04)) 250.00 "Hospital" "Saúde" 6655665566556655]
   [(t/format (t/local-date 2022 04 10)) 130.00 "Drogaria" "Saúde" 6655665566556655]
   [(t/format (t/local-date 2022 03 10)) 100.00 "Show de pagode" "Lazer" 3939393939393939]
   [(t/format (t/local-date 2022 03 11)) 25.90 "Dogão" "Alimentação" 3939393939393939]
   [(t/format (t/local-date 2022 03 12)) 215.87 "Praia" "Lazer" 3939393939393939]
   [(t/format (t/local-date 2022 04 01)) 976.88 "Oficina" "Automóvel" 3939393939393939]
   [(t/format (t/local-date 2022 04 10)) 85.00 "Alura" "Educação" 3939393939393939]])












