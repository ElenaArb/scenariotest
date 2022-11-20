Feature: Find course
 #Позитивный сценарий: кликаем на кнопку "Посмотреть курсы", затем ищем курсы
 #по "Kotlin"
  Scenario: Course selection
    Given url of SkillFactory 'https://lms.skillfactory.ru'
    When website is open click on 'Посмотреть курсы'
    Then start search 'Kotlin'

     #Негатинвый сценарий: выбираем несушествующий курс и получаем соответствуещее уведомление
   Scenario: Сhose absent сourse
     Given url of SkillFactory 'https://lms.skillfactory.ru'
     When website is open click on 'Посмотреть курсы'
     Then start search 'Qqq'
     And assert that user got message 'Нет результатов для «Qqq».'