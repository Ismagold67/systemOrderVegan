numPedidos = int(input('Insira o número de pedidos: '))

for i in range(1, numPedidos + 1):
    prato = input("Insira o nome do prato desejado: ")
    calorias = int(input("Quantas calorias possui o prato: "))
    ehVegano = False

    question = input('É vegano? (s/n): ')

    if question == 's':
        ehVegano = str('Vegano')
    elif question == 'n':
        ehVegano = str('Não-vegano')
    
    print(f'Pedido {i}: {prato} ({ehVegano}) - {calorias} calorias')