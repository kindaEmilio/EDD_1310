class Trabajador:
    extra = 276.5;
    prestacion = 0.03;
    identificador = 0;
    nombre = "";
    paterno = "";
    materno = "";
    horasExtra = 0.0;
    sueldoBase = 0;
    anioIngreso = 0;

    def __init__(self, nTrabajador = 0, nombre ="", paterno ="", materno ="", horasExtra= 0.0, sueldoBase= 0, anioIngreso = 0):
        self.identificador = nTrabajador
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.horasExtra = horasExtra
        self.sueldoBase = sueldoBase
        self.anioIngreso = anioIngreso

    def getNumeroTrabajador(self):
        return self.identificador

    def setNumeroTrabajador(self, numeroTrabajador):
        self.identificador = numeroTrabajador

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getPaterno(self):
        return self.paterno

    def setPaterno(self, paterno):
        self.paterno = paterno

    def getMaterno(self):
        return self.materno

    def setMaterno(self, materno):
        self.materno = materno

    def getHorasExtra(self):
        return self.horasExtra

    def setHorasExtra(self, horasExtra):
        self.horasExtra = horasExtra

    def getSueldoBase(self):
        return self.sueldoBase

    def setSueldoBase(self, sueldoBase):
        self.sueldoBase = sueldoBase

    def getAnioIngreso(self):
        return self.anioIngreso

    def setAnioIngreso(self, anioIngreso):
        self.anioIngreso = anioIngreso

    def calcularSueldo(self):
        total = 0.0;
        total = self.sueldoBase;
        total += self.sueldoBase * ((2022 - self.anioIngreso) * self.prestacion);
        total += self.extra * self.horasExtra;
        return total;

    def __str__(self):
        string = "#: " + str(self.identificador) + ", Nombre: " + str(self.nombre) + " " + str(self.paterno) + " " + str(self.materno) + ", Horas extra: " + str(self.horasExtra) + ", Sueldo base: " + str(self.sueldoBase) + ", Anio de ingreso: " + str(self.anioIngreso)
        return string