def LinearSearch(list, elem):
    for i in range(len(list)):
        if list[i] == elem:
            return i
    
    return -1
