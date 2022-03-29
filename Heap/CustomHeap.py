class CustomHeap():  # maxHeap
    def __init__(self):
        self.arr = [0] * 50  # initialized capacity
        self.pointer = 1  # pointer of leap node

    def push(self, element):
        if self.pointer >= len(self.arr):
            nArr = [0] * len(self.arr) * 2
            for i in range(len(self.arr)):
                nArr[i] = self.arr[i]
            self.arr = nArr
        self.arr[self.pointer] = element
        self.heapifyWhenPush()
        self.pointer += 1

    def pop(self):
        if self.pointer <= 1:
            print('healp is empty')
            return
        pop = self.arr[1]
        self.pointer -= 1
        self.heapifyWhenPop()
        return pop

    def heapifyWhenPush(self):
        targetIdx, target = self.pointer, self.arr[self.pointer]
        while targetIdx > 1:
            parentIdx = targetIdx // 2 if targetIdx % 2 == 0 else (targetIdx - 1) // 2
            if self.arr[parentIdx] < self.arr[targetIdx]:
                temp = self.arr[targetIdx]
                self.arr[targetIdx] = self.arr[parentIdx]
                self.arr[parentIdx] = temp
                targetIdx = parentIdx
            else:
                break
        return

    def heapifyWhenPop(self):
        self.arr[1] = self.arr[self.pointer]
        targetIdx, target = 1, self.arr[1]
        while targetIdx < self.pointer:
            l, r = min(targetIdx * 2, self.pointer), min(targetIdx * 2 + 1, self.pointer)
            if target < self.arr[l] and self.arr[l] >= self.arr[r]:
                self.arr[targetIdx] = self.arr[l]
                self.arr[l] = target
                targetIdx = l
            elif target < self.arr[r] and self.arr[r] > self.arr[l]:
                self.arr[targetIdx] = self.arr[r]
                self.arr[r] = target
                targetIdx = r
            else:
                break
