def LinearSearch2D(list, elem):
    for i in range(len(list)):
        for j in range(len(list)):
            if list[i][j] == elem:
                return i,j
    
    return -1, -1
