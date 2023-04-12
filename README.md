### Aboute Toys Game

**Program - draw toys in a children's goods store.**

```sh
***************************************************************
Добро пожаловать на розыгрыш призов!
***************************************************************
Нажмите Enter чтобы начать.

Формируем список игрушек для выдачи.
***************************************************************
***************************************************************
Вы выиграли  ID: 13ac43ae-4fec-483e-a566-790377f076da. Тип: Конструктор. Название игрушки: Мягкие кирпичики мини. Количество: 3. Частота выпадения: 0.2 игрушку.
***************************************************************
***************************************************************
Было 4 шт.
***************************************************************
Осталось Количество(шт): 3. Тип: Конструктор. Название игрушки: Мягкие кирпичики мини. Сложность: Средняя. Количество деталей: 6601.
Ожидают выдачи: 14 шт.
Всего осталось: 29 шт.
***************************************************************
```
## The project contains functionality for drawing toys.

### Implemented in collections of toys

- generate start data with toys
- adding toy
- deleting toy
- get prize toy
- view all toys
- saving to the TXT file.

### The note contains 

- uid - uuid identifier of the toy,
- type - the toy type, 
- name - text title of the toy, 
- quantity - number of toys of the same type, 
- toyDropRate - toy drop rate (weight in % of 100). 

#### Save notes done in **TXT** format.
>**Class Main - module Main.java is entry point** to the App. Delegates the presentation
of the data to the view, and the handling of the data to the model.
>
>**Class View**. Presents the data to the user.
>
>**Class Model**. Manages the collection of toys.