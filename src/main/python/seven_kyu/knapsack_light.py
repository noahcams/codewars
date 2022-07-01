def knapsack_light(value1, weight1, value2, weight2, max_w):
    combined_weight = weight1 + weight2
    if combined_weight <= max_w:
        return value1 + value2
    elif weight1 <= max_w and weight2 <= max_w:
        if value1 > value2:
            return value1
        return value2
    elif weight1 <= max_w:
        return value1
    elif weight2 <= max_w:
        return value2
    return 0
