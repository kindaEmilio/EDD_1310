class Arreglo:
    size = 0
    data = []

    def __init__(self, tamanio):
        self.size = tamanio
        self.data = [0 for i in range(tamanio)]

    def getItem(self, index):
        if index >= self.size or index < 0:
            raise IndexError("Invalid index, out of bounds")
        return self.data[index]

    def setItem(self, index, value):
        if index >= self.size or index < 0:
            raise IndexError("Invalid index, out of bounds")
        self.data[index] = value

    def getLength(self):
        return self.size

    def clear(self, valor):
        for i in range(self.size):
            self.data[i] = valor

    def __str__(self):
        return str(self.data)

    def __iter__(self):
        return arreglo(self)


class arreglo:
    def __init__(self, arreglo):
        self._arreglo = arreglo
        self._index = 0

    def __next__(self):
        if self._index < self._arreglo.getLength():
            self._index += 1
            return self._arreglo.getItem(self._index - 1)
        raise StopIteration