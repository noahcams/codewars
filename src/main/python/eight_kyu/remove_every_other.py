def remove_every_other(my_list):
    return [my_list[i] for i in range(len(my_list)) if i % 2 == 0]


print(remove_every_other([1, 2, "3", 2, 1]))  # Expected: [1, "3", 1]
