numPedidos = int(input())

for i in range(1, numPedidos + 1):
    prato = input()
    calorias = int(input())
    ehVegano = False

    question = input('É vegano?')

    if question == 's':
        ehVegano = str('Vegano')
    elif question == 'n':
        ehVegano = str('Não-vegano')
    
    print(f'Pedido {i}: {prato} ({ehVegano}) - {calorias} calorias')