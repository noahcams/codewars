# strategy: Only keep items that are different from the previous item
# Avoiding out of bounds for first item: Use an if check

def naive_unique_in_order(iterable):
    """Creates new list with all repeating adjacent characters stably removed"""
    # Naive solution
    # if len(iterable) == 1:
    #     return iterable
    # clean_iter = []
    # for i in range(len(iterable)):
    #     if i == 0 and iterable[i] == iterable[i + 1]:
    #         clean_iter.append(iterable[i])
    #     elif iterable[i] != iterable[i - 1]:
    #         clean_iter.append(iterable[i])
    # return clean_iter
    # Better solution
    result = []
    prev = None
    for char in iterable:
        if char != prev:
            result.append(char)
            prev = char
    return result


print(naive_unique_in_order(['A', 'A', 'B', 'C', 'C']))
