# PRIMER PUNTO

followers_general = open("presenciaredes.csv", "r")

for dato in followers_general:
    datos = dato.split(",")

    if (datos[0] == "TWITTER" and datos[1] == "SEGUIDORES (FOLLOWERS)"):

        followers_enero = int(datos[3])
        followers_junio = int(datos[8])

        print("La diferencia de seguidores (followers) en Twitter entre el mes de enero y junio es de: ",
              followers_junio - followers_enero, "\n")

followers_general.close()

# SEGUNDO PUNTO

print("Selección de meses para calcular diferencia de visualizaciones:\n"
      "ENE - 1\n"
      "FEB - 2\n"
      "MAR - 3\n"
      "ABR - 4\n"
      "MAY - 5\n"
      "JUN - 6\n")

print("Introduce el indice de los meses que quieres comparar las visualizaciones de youtube:")

mes_1 = int(input("Mes 1: "))
mes_2 = int(input("Mes 2: "))

if mes_1 > mes_2:
    print("Esa operación no es posible")

else:
    followers_general = open("presenciaredes.csv", "r")

    for dato in followers_general:
        datos = dato.split(",")
        if(datos[0] == 'YOUTUBE' and datos[1] == 'VISUALIZACIONES'):
            num1 = int(datos[mes_1 + 2])
            num2 = int(datos[mes_2 + 2])
            diferencia = num2 - num1
            print("La diferencia de visualizaciones de YouTube entre los meses seleccionados por teclado es de:", diferencia)

followers_general.close()

# TERCER PUNTO

followers_general = open("presenciaredes.csv", "r")

#TWITTER
for r in followers_general:
    datos = r.split(",")
    if (datos[0] == 'TWITTER' and datos[1] == 'CRECIMIENTO DE FOLLOWERS'):

        suma_tw = int(datos[3]) + int(datos[4]) + int(datos[5]) + int(datos[6]) + int(datos[7]) + + int(datos[8])
        promedio_tw = suma_tw / 6
        print("\nEl promedio de crecimiento de Twitter entre los meses de enero a junio es de:", round(promedio_tw), "seguidores por mes")

followers_general.close()

#FACEBOOK

followers_general = open("presenciaredes.csv", "r")

for r in followers_general:
    datos = r.split(",")
    if (datos[0] == 'FACEBOOK' and datos[1] == 'CRECIMIENTO (SEGUIDORES)'):

        suma_fb= int(datos[3]) + int(datos[4]) + int(datos[5]) + int(datos[6]) + int(datos[7]) + + int(datos[8])
        promedio_fb = suma_fb / 6
        print("El promedio de crecimiento de Facebook entre los meses de enero a junio es de:", round(promedio_fb), "seguidores por mes")

followers_general.close()
