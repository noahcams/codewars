# (age, handicap)
# senior age must be >= 55 and handicap > 7

def open_or_senior(data):
    output = []
    for item in data:
        if item[0] >= 55 and item[1] > 7:
            output.append('Senior')
        else:
            output.append('Open')
    return output

print(open_or_senior([(45, 12),(55,21),(19, -2),(104, 20)])) # Expected: ['Open', 'Senior', 'Open', 'Senior']