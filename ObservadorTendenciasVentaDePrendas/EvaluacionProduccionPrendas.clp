(deftemplate EvaluacionProduccion
   (slot Prenda
       (type STRING)
       (default ?DERIVE))
   (slot Temporada
       (type STRING)
       (default ?DERIVE))
   (slot Mes
       (type STRING)
       (default ?DERIVE))
   (slot DiasFestivos
       (type STRING)
       (default ?DERIVE))
   (slot Material
       (type STRING)
       (default ?DERIVE))
   (slot Color
       (type STRING)
       (default ?DERIVE))
   (slot Demanda
        (type INTEGER)
        (default 0))
   (slot Costo
        (type INTEGER)
        (default 0))
   (slot Evaluacion
       (type STRING)
       (default ?DERIVE))
)

(deffacts EvaluacionProduccion
;; i=0;;
(
EvaluacionProduccion
(Prenda "Top")
(Temporada "verano")
(Mes "enero")
(DiasFestivos "")
(Material "algodon")
(Color "blanco")
(Demanda 80)
(Costo -20)
(Evaluacion "45 prendas por dia"))
;; i=1;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "verano")
(Mes "febrero")
(DiasFestivos "")
(Material "algodon")
(Color "rosado")
(Demanda 80)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=2;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "verano")
(Mes "marzo")
(DiasFestivos "")
(Material "algodon")
(Color "rojo")
(Demanda 80)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=3;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "verano")
(Mes "abril")
(DiasFestivos "")
(Material "algodon")
(Color "turquesa")
(Demanda 80)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=4;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "verano")
(Mes "mayo")
(DiasFestivos "")
(Material "algodon")
(Color "gris")
(Demanda 80)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=5;;
(EvaluacionProduccion
(Prenda "Short")
(Temporada "verano")
(Mes "febrero")
(DiasFestivos "")
(Material "Jersey")
(Color "blanco")
(Demanda 80)
(Costo -20)
(Evaluacion "40 prendas por dia"))
;; i=6;;
(EvaluacionProduccion
(Prenda "Short")
(Temporada "verano")
(Mes "abril")
(DiasFestivos "")
(Material "Jersey")
(Color "beige")
(Demanda 80)
(Costo -20)
(Evaluacion "40 prendas por dia"))
;; i=7;;
(EvaluacionProduccion
(Prenda "Short")
(Temporada "verano")
(Mes "abril")
(DiasFestivos "")
(Material "Jersey")
(Color "gris")
(Demanda 80)
(Costo -20)
(Evaluacion "40 prendas por dia"))
;; i=8;;
(EvaluacionProduccion
(Prenda "Short")
(Temporada "verano")
(Mes "mayo")
(DiasFestivos "")
(Material "Jersey")
(Color "azul")
(Demanda 80)
(Costo -20)
(Evaluacion "45 prendas por dia"))
;; i=9;;
(EvaluacionProduccion
(Prenda "Maxi falda")
(Temporada "verano")
(Mes "enero")
(DiasFestivos "")
(Material "Lycra")
(Color "negro")
(Demanda 80)
(Costo -20)
(Evaluacion "45 prendas por dia"))
;; i=10;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "otoño")
(Mes "abril")
(DiasFestivos "")
(Material "Jersey")
(Color "azul")
(Demanda 20)
(Costo -20)
(Evaluacion "30 prendas por dia"))
;; i=11;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "otoño")
(Mes "mayo")
(DiasFestivos "")
(Material "Jersey")
(Color "gris")
(Demanda 60)
(Costo -20)
(Evaluacion "30 prendas por dia"))
;; i=12;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "otoño")
(Mes "junio")
(DiasFestivos "")
(Material "Jersey")
(Color "negro")
(Demanda 80)
(Costo -20)
(Evaluacion "30 prendas por dia"))
;; i=13;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "otoño")
(Mes "mayo")
(DiasFestivos "")
(Material "algodon")
(Color "blanco")
(Demanda 80)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=14;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "otoño")
(Mes "junio")
(DiasFestivos "")
(Material "algodon")
(Color "gris")
(Demanda 20)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=15;;
(EvaluacionProduccion
(Prenda "Top")
(Temporada "otoño")
(Mes "julio")
(DiasFestivos "fiestas patrias")
(Material "algodon")
(Color "negro")
(Demanda 60)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=16;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "otoño")
(Mes "junio")
(DiasFestivos "")
(Material "algodon")
(Color "blanco")
(Demanda 20)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=17;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "otoño")
(Mes "julio")
(DiasFestivos "fiestas patrias")
(Material "algodon")
(Color "gris")
(Demanda 60)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=18;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "otoño")
(Mes "agosto")
(DiasFestivos "")
(Material "algodon")
(Color "negro")
(Demanda 60)
(Costo -5)
(Evaluacion "25 prendas por dia"))
;; i=19;;
(EvaluacionProduccion
(Prenda "Joggin")
(Temporada "invierno")
(Mes "julio")
(DiasFestivos "fiestas patrias")
(Material "Jersey")
(Color "rojo")
(Demanda 80)
(Costo -10)
(Evaluacion "15 prendas por dia"))
;; i=20;;
(EvaluacionProduccion
(Prenda "Joggin")
(Temporada "invierno")
(Mes "agosto")
(DiasFestivos "")
(Material "Jersey")
(Color "azul")
(Demanda 20)
(Costo -10)
(Evaluacion "15 prendas por dia"))
;; i=21;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "invierno")
(Mes "julio")
(DiasFestivos "fiestas patrias")
(Material "Jersey")
(Color "azul")
(Demanda 80)
(Costo -10)
(Evaluacion "20 prendas por dia"))
;; i=22;;
(EvaluacionProduccion
(Prenda "Joggin")
(Temporada "invierno")
(Mes "septiembre")
(DiasFestivos "")
(Material "Jersey")
(Color "negro")
(Demanda 80)
(Costo -10)
(Evaluacion "15 prendas por dia"))
;; i=23;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "invierno")
(Mes "agosto")
(DiasFestivos "")
(Material "Jersey")
(Color "gris")
(Demanda 20)
(Costo -10)
(Evaluacion "20 prendas por dia"))
;; i=24;;
(EvaluacionProduccion
(Prenda "Camison")
(Temporada "invierno")
(Mes "septiembre")
(DiasFestivos "")
(Material "Jersey")
(Color "negro")
(Demanda 80)
(Costo -10)
(Evaluacion "20 prendas por dia"))
;; i=25;;
(EvaluacionProduccion
(Prenda "Blusa")
(Temporada "primavera")
(Mes "septiembre")
(DiasFestivos "")
(Material "Viscosa")
(Color "blanco")
(Demanda 80)
(Costo -15)
(Evaluacion "25 prendas por dia"))
;; i=26;;
(EvaluacionProduccion
(Prenda "Blusa")
(Temporada "primavera")
(Mes "octubre")
(DiasFestivos "")
(Material "Viscosa")
(Color "beige")
(Demanda 80)
(Costo -15)
(Evaluacion "25 prendas por dia"))
;; i=27;;
(EvaluacionProduccion
(Prenda "Blusa")
(Temporada "primavera")
(Mes "noviembre")
(DiasFestivos "")
(Material "Viscosa")
(Color "negro")
(Demanda 20)
(Costo -15)
(Evaluacion "25 prendas por dia"))
;; i=28;;
(EvaluacionProduccion
(Prenda "Vestidos")
(Temporada "primavera")
(Mes "octubre")
(DiasFestivos "")
(Material "Chalis")
(Color "blanco")
(Demanda 20)
(Costo -5)
(Evaluacion "20 prendas por dia"))
;; i=29;;
(EvaluacionProduccion
(Prenda "Vestidos")
(Temporada "primavera")
(Mes "noviembre")
(DiasFestivos "")
(Material "algodon")
(Color "beige")
(Demanda 80)
(Costo -5)
(Evaluacion "20 prendas por dia"))
;; i=30;;
(EvaluacionProduccion
(Prenda "Vestidos")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "Chalis")
(Color "rosado")
(Demanda 80)
(Costo -5)
(Evaluacion "20 prendas por dia"))
;; i=31;;
(EvaluacionProduccion
(Prenda "Vestidos")
(Temporada "primavera")
(Mes "enero ")
(DiasFestivos "")
(Material "Chalis")
(Color "turquesa ")
(Demanda 20)
(Costo -5)
(Evaluacion "20 prendas por dia"))
;; i=32;;
(EvaluacionProduccion
(Prenda "Short ")
(Temporada "primavera")
(Mes "noviembre")
(DiasFestivos "")
(Material "Jersey")
(Color "blanco")
(Demanda 20)
(Costo -10)
(Evaluacion "45 prendas por dia"))
;; i=33;;
(EvaluacionProduccion
(Prenda "Short")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "Jersey")
(Color "beige")
(Demanda 70)
(Costo -15)
(Evaluacion "45 prendas por dia"))
;; i=34;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "amarillo")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=35;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "beige")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=36;;
(EvaluacionProduccion
(Prenda "Vestidos")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "Chalis")
(Color "rosado")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=37;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "rojo")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=38;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "turquesa")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=39;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "azul")
(Demanda 70)
(Costo -10)
(Evaluacion "30 prendas por dia"))
;; i=40;;
(EvaluacionProduccion
(Prenda "Polo")
(Temporada "primavera")
(Mes "diciembre")
(DiasFestivos "navidad")
(Material "algodon")
(Color "gris")
(Demanda 70)
(Costo -10)
(Evaluacion "45 prendas por dia"))
)
