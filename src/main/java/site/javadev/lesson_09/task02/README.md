
Класс Product:

Хранит информацию о товаре, включая его имя, цену и рейтинг.
Имеет конструктор для инициализации этих полей.
Класс Category:

Представляет категорию товаров, содержит имя категории и массив продуктов, относящихся к этой категории.
Имеет конструктор для инициализации имени категории и массива товаров.
Класс Basket:

Хранит массив купленных товаров.
Инициализируется пустым массивом в конструкторе, чтобы корзина начиналась с нуля.
Класс User:

Содержит информацию о пользователе, включая логин, пароль и объект класса Basket, который представляет корзину пользователя.
Имеет конструктор для инициализации этих полей.
Класс Main:

В методе main создаются массивы продуктов для разных категорий (iPhone и телевизоры).
Создаются объекты классов Category для каждой категории с соответствующими товарами.
Создается пустая корзина.
Создается объект класса User, инициализируемый логином, паролем и корзиной.
Общая структура

Не реализована логика добавления товаров в корзину