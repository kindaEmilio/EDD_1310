from asyncio.windows_events import NULL
from claseArreglo import Arreglo
from claseTrabajador import Trabajador


class Nomina:
    salto_de_linea = "\n"
    coma = ","
    empleados = NULL;
    nombreCompania = ""
    rutaArchivo = ""

    def __init__(self, rutaArchivo="", nombreCompania=""):
        self.rutaArchivo = rutaArchivo
        self.nombreCompania = nombreCompania
        content = ""

        entry = open(self.rutaArchivo, "r")
        entry.readline()
        linea = entry.readline()
        while linea != "":
            content += linea
            linea = entry.readline()

        separadoPorSaltosDeLinea = content.split(self.salto_de_linea)

        self.empleados = Arreglo(len(separadoPorSaltosDeLinea))
        for i in range(len(separadoPorSaltosDeLinea)):
            separadoPorComas = separadoPorSaltosDeLinea[i].split(self.coma)
            trabajadorTemp = Trabajador()
            trabajadorTemp.setNumeroTrabajador(int(separadoPorComas[0]))
            trabajadorTemp.setNombre(separadoPorComas[1])
            trabajadorTemp.setPaterno(separadoPorComas[2])
            trabajadorTemp.setMaterno(separadoPorComas[3])
            trabajadorTemp.setHorasExtra(int(separadoPorComas[4]))
            trabajadorTemp.setSueldoBase(float(separadoPorComas[5]))
            trabajadorTemp.setAnioIngreso(int(separadoPorComas[6]))

            self.empleados.setItem(i, trabajadorTemp)

    def calcularSueldo(self):
        for i in range(self.empleados.getLength()):
            print(self.empleados.getItem(i));
            print("Sueldo total: " + str(self.empleados.getItem(i).calcularSueldo()));

    def obtenerMaxMin(self):
        maxTrabajador = self.empleados.getItem(0);
        minTrabajador = self.empleados.getItem(0);
        for currTrabajador in self.empleados:
            if (currTrabajador.getAnioIngreso() > maxTrabajador.getAnioIngreso()):
                maxTrabajador = currTrabajador
            if (currTrabajador.getAnioIngreso() < minTrabajador.getAnioIngreso()):
                minTrabajador = currTrabajador

        print("Trabajadores con mayor y menor antiguedad en : " + self.nombreCompania);
        print("Primer trabajador encontrado con la menor(-) antiguedad: ");
        print(minTrabajador);
        print("Primer trabajador encontrado con la mayor(+) antiguedad: ");
        print(maxTrabajador);