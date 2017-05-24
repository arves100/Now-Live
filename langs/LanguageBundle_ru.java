/*
 * Copyright 2016-2017 Ague Mort of Veteran Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.nowlive.bot.langs;

import com.nowlive.bot.core.Config;
import com.nowlive.bot.util.Const;

import java.util.ListResourceBundle;

/**
 * @author Veteran Software by Ague Mort
 */
public class LanguageBundle_ru extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Добавить "},
            {"addFail", "Не удалось добавить "},
            {"addHelp", "# ДОБАВЛЕНИЕ\n* Используется для добавления менеджеров для вашего сервера.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - @ Упомяните пользователя для добавлении в качестве менеджера"
                    + "\n\n## ПРИМЕР: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Разрешение этой команды было отменено разработчиком.*"},
            {"alreadyExists", "Похоже, вы уже добавили это в мою базу данных.. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Кажется, я уже установил этого пользователя в качестве менеджера."},
            {"announceHelp", "# ОБЪЯВЛЕНИЕ\n* Тсс... Я секрет...\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tЭта команда доступна только для разработчиков."},
            {"beamChannelNotFound", "\n# Канал(ы), не найденнй(ые) на Beam: %s."},
            {"beamHelp", "# BEAM\n* Добавление и удаление данных, связанных с Beam.pro.\n"
                    + "* Заметки:\n\t"
                    + "Чтобы добавить игровые фильтры и фильтры заголовков, вы ДОЛЖНЫ включить скобки.\n\t"
                    + "НЕ ИСПОЛЬЗУЙТЕ полный URL Beam. Это не будет работать!! Используйте только название канала (www.beam.pro/channelName)\n\t"
                    + "Вы можете добавить несколько каналов, групп, фильтров игр и заголовков, используя символ | между ними.\n\t"
                    + "Единственные необходимые опции: имяКанала/названиеTeam\n\n"
                    + "## Beam Каналы\n"
                    + "Примечание: Добавление канала объявлений, игр и фильтров заголовков необязательно."
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel имяКанала #каналОповещений {игровойФильтр} [фильтрОписания]\n\n"
                    + "## Beam Teams (Объявление ВСЕХ прямых трансляций Teams)\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam team teamName #каналОповещений\n\n"
                    + "## Beam Игровые Фильтры (Глобальные)\n"
                    + "* Заметка: Это влияет на все потоковые объявления для Beam\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam gfilter {названиеИгры|названиеИгры} #каналОповещений\n\n"
                    + "## Beam Фильтры Описания (Глобальные)\n"
                    + "* Заметка: Это влияет на все потоковые объявления для Beam\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam tfilter [слово|ещё слово|ещё слово] #каналОповещений\n\n"
                    + "* Примеры:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Добавляет Beam канал для объявления в определенном Discord канале c игровыми фильтрами)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam team outpost #outpost-streamers (Добавляет Beam team с определенным Discord каналом объявлений)\n\n"},
            {"botLangFail", "Что-то пошло не так. Мой язык все тот же."},
            {"botLangHelp", "# ЯЗЫКБОТА\n* Используется для изменения языка моих ответов.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " Язык бота"
                    + "\n\tИспользуйте Английское, либо родное написание языка, который вы хотите установить."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tВам нужна дополнительная помощь с этой командой? Не нашли ответа и хотите задать вопросы на языке, в настоящее время связанным "
                    + "с ботом? Пожалуйста, не стесняйтесь обратиться к переводчикам на нашем сервере для получения помощи. Discord is at " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Вы успешно изменили мой язык."},
            {"botLangUnsupported", "Этот язык в настоящее время не поддерживается."},
            {"botStatistics", "%s Статистика"},
            {"broadcasterLangAllSuccess", " :ok_hand: Я буду искать трансляции на всех языках."},
            {"broadcasterLangFail", "Что-то пошло не так, и я по-прежнему ищу трансляции на всех языках."},
            {"broadcasterLangSuccess", " :ok_hand: Я буду искать только те трансляции, которые используют этот язык!"},
            {"canNotRemoveOwner", "Глупо. Вы не можете удалить владельца сервера из списка менеджеров. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Хм... Что-то пошло не так... Лучше попробуйте это еще раз."},
            {"cleanupHelp", "```Markdown\n# ОЧИСТКА\n*  Изменение способа очистки моих уведомлений о трансляциях.\n\n## ПРИМЕНЕНИЕ:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone   - Я ничего не буду менять в своих объявлениях! (по умолчанию)"
                    + "\n\tedit   - Я отредактирую свои объявления, чтобы сказать \"OFFLINE\" , когда стрим окончен"
                    + "\n\tdelete - Я удалю объявление, когда стрим окончен"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Как скажете!  Теперь я буду удалять мои объявления, если трансляция окончена!"},
            {"cleanupSuccessEdit", "Я буду редактировать мои объявления, если трансляция началась или окончена."},
            {"cleanupSuccessNone", " :ok_hand: Я ничего не буду делать с моими объявлениями."},
            {"compactFail", "Эм... что-то пошло не так. Мой компактный режим не изменился."},
            {"compactHelp", "```Markdown\n# КОМПАКТНОСТЬ\n* Мои объявления возможно изменить на более компактную версию.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Использование короткого объявления."
                    + "\n\tsmallEmbed - Объявление с маленьким изображением."
                    + "\n\tfullEmbed  - Полное объявление, с больщим изображением."
                    + "\n\tvideoEmbed - Без вставок. Объявление будет небольшим блоком кода и встроенным видео, которое " +
                    "вы можете посмотреть в Discord."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: С этого момента вы будете получать полные объявления."},
            {"compactSmallEmbed", " :compression: С этого момента вы будете получать объявления с маленькими изображениями."},
            {"compactNoEmbed", " :compression: Теперь ваши объявления будут в виде коротких предложений."},
            {"compactVideoEmbed", " :compression: Вы больше не будете получать вставки в объявлениях.  " +
                    "Видео будут воспроизводиться прямо в Discord."},
            {"configHelp", "# КОНФИГУРАЦИЯ\n* Базовая команда для установки моих различных параметров. Проверьте каждую специальную справку по настройкам для получения дополнительной информации.\n\n" +
                    "* defaultOfflineMessage - Offline сообщение по умолчанию (используется в отредактированных объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Оnline сообщение по умолчанию (используется во всех объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setDefaultAnnounceChannel help - Установка канала объявлений по умолчанию " +
                    "(Канал для объявлений, когда вы не включаете определенный канал в команду Twitch)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "* setOfflineMessage - Настраиваемое offline сообщение (используется в отредактированных объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Настраиваемое online сообщение (используется во всех объявлениях)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"customMessageNotNull", "# Пользовательское сообщение не может быть пустым.  Извините...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% начал стрим! Подробнее здесь (кликабельно): %URL%"},
            {"defaultOfflineHelp", "# КОНФИГУРАЦИЯ OFFLINE СООБЩЕНИЯ В ОБЪЯВЛЕНИИ ПО УМОЛЧАНИЮ\n* Сбрасывает моё offline сообщение до значения по умолчанию.\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% закончил трансляцию!"},
            {"defaultOnlineHelp", "# КОНФИГУРАЦИЯ ONLINE СООБЩЕНИЯ В ОБЪЯВЛЕНИИ ПО УМОЛЧАНИЮ\n* Сбросывает мое online сообщение до значения по умолчанию.\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Сообщение от " + Const.BOT_NAME + " разработчиков:*\n\n\t"},
            {"discordChannelNoExist", "Данный текстовый канал отсутствует на вашем сервере.."},
            {"discordChannelNotNull", "# Я не могу найти текстовый канал Discord. Поток будет объявлен в канале по умолчанию."},
            {"discordLink", "Хотите присоединиться к серверу Now Live Discord? Если у вас возникли проблемы, то там есть много " +
                    "тех, кто поможет! Перейдите по ссылке:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Показывает ссылку для подключения к серверу Now Live Discord."},
            {"discordUserNoExist", "Данного пользователя Discord не существует! Попробуй еще раз!"},
            {"doesNotExist", "Это никогда не добавлялось в мою базу данных."},
            {"embedFull", "полноразмерное объявление"},
            {"embedSmall", "объявление с маленьким изображением"},
            {"embedVideo", "объявление с воспроизводимым видео"},
            {"embedNone", "краткое объявление, без изображений"},
            {"emptyArgs", "Кажется вы забыли какую-то команду.  Изучите команды помощи для получения дополнительной информации.."},
            {"emptyCommand", "В следующий раз, когда ты меня разбудишь, пожалуйста отправьте также команду."},
            {"followersEmbed", "Подписчиков"},
            {"followersEmbedYtg", "Подписчиков"},
            {"guildJoinSuccess", "Всем привет!  Я Now Live. Я объявлю, если стример(ы) начинают трансляцию(и)!  Type `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` для списка моих команд.\n\nЕсли вам нужна помощь в настройке, приходите " +
                    "присоединяйтесь к моему Discord на " + Const.DISCORD_URL + " и ознакомьтесь с инструкциями по настройке и списком команд " +
                    "каналы для всей информации!\n\nНе забудьте поздороваться!"},
            {"helpPm", "Привет %s! Итак, я слышал, что вам нужна помощь? Ниже приведен список моих команд.\n\n" +
                    "```Markdown\n" +
                    "# ДОБАВЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# ЯЗЫКБОТА\n" +
                    "* Поддерживаемые языки: Английский, Чешский, Германский, Французский, Русский" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# УДАЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# КОМПАКТНОСТЬ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# КОНФИГУРАЦИЯ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# ПРИГЛАШЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# СПИСОК\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# УВЕДОМЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# ПИНГ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# УДАЛЕНИЕ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# ЯЗЫКТРАНСЛЯЦИИ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# ТРАНСЛЯЦИИ\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Добавление и удаление связанных с Twitch.tv вещей. Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Для получения дополнительной информации введите: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/ПОЖЕРТВОВАНИЕ\n" +
                    "Команды для просмотра ссылки на Patreon бота:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/ОШИБКИ/ЗАПРОСЫ\n" +
                    "Команды для просмотра ссылки на наш Trello, который используется для сообщений об ошибках и для запроса функций:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```" +
                    "Если вам нужна дополнительная помощь, присоединяйтесь к моему серверу в Discord.  Там много пользователей, которые будут полезны вам:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Вы передали мне неверные или отсутствующие значения.  Проверьте команду help для получения дополнительной информации.."},
            {"invite", "Привет %s! Вы можете пригласить меня на свой сервер!\n\n\t"
                    + "**Кликабельно:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "```Markdown\n# ПРИГЛАШЕНИЕ\n* Используется для показа моей ссылки приглашения.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tПриглашение бота NowLive на ваш сервер Discord.```"},
            {"listHelp", "```Markdown\n# СПИСОК\n* Эта команда показывает базу данных.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list *option*"
                    + "\n\tbeamChannel      - Список Beam каналов, которые вы назначили"
                    + "\n\tbeamTeam         - Список Beam Teams, которые вы назначили"
                    + "\n\tgfilter          - Список всех, установленных вами, игровых фильтров"
                    + "\n\tmanager          - Список менеджеров на этом сервере"
                    + "\n\tsetting          - Список общих настроек бота"
                    + "\n\tsmashcastChannel - Список Smashcast каналов, которые вы назначали"
                    + "\n\tsmashcastGame    - Список Smashcast игр, которые вы назначали"
                    + "\n\tsmashcastTeam    - Lists the Twitch teams you follow"
                    + "\n\ttfilter          - Выводит список всех фильтров заголовков, которые вы создали"
                    + "\n\ttwitchChannel    - Перечисляет Twitch каналы, которые вы назначили"
                    + "\n\ttwitchCommunity  - Список Twitch сообществ, которые вы назначили"
                    + "\n\ttwitchGame       - Список Twitch игровых фильтров, установленных вами"
                    + "\n\ttwitchTeam       - Перечисляет Twitch team, которые вы назначили"
                    + "\n\tytgChannel       - Список YouTube Gaming каналов, которые вы назначили"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel```"},
            {"listSettings", "```Markdown\n" +
                    "# Параметры бота на вашем сервере" +
                    "\n* Компактный режим: %s:" +
                    "\n* Уведомление настроено для %s:" +
                    "\n* Очистка установлена на %s." +
                    "\n* Язык объявлений о стриме: %s." +
                    "\n* Язык бота: %s." +
                    "\n* Текущий формат online сообщения в объявлении: %s." +
                    "\n* Текущий формат offline сообщения в объявлении: %s.```"},
            {"needOneManager", "Если вы удалите этого менеджера, кто будет управлять мной?"},
            {"noBotManager", "Это противоречит Уставу Союза Discord Бота, чтобы боты управляли мной. Извините, попробуйте найти " +
                    "подходящего человека для работы. :thumbsup:"},
            {"noneOnline", "Извините %s, Но нет никого онлайн прямо сейчас на этом сервере."},
            {"notAManager", "Извините, но только мои руководители могут это сделать. Type `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` для списка людей, которые могут."},
            {"notAnAdmin", "К кому это может относиться: я твой слуга, но ты не мой господин."},
            {"notifyEveryone", ":tada: ВАУ!!  **ВСЕ** на сервере уведомляются, когда я " +
                    "объявляю о трансляциях!  *(Ты уверен?  Я не рекомендую это для больших серверов...  Это может " +
                    "рассердить людей.)*"},
            {"notifyHelp", "```Markdown\n# УВЕДОМЛЕНИЕ\n* Используется для изменения опции глобального уведомления для этого сервера.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - Нет @ упоминаний любого вида (по умолчанию)"
                    + "\n\there     - Я буду уведомлять только тех людей, которые находятся в сети, когда я делаю объявление"
                    + "\n\teveryone - Я сообщу ВСЕМ!!  Ахаха!!  (Я не рекомендую это на больших серверах)"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: Все, кто онлайн, получат упоминание, когда я анонсирую трансляции."},
            {"notifyNone", " :ok_hand: Я не буду упоминать никого в моих объявлениях."},
            {"nowLive", "НАЧАЛ(А) ТРАНСЛЯЦИЮ!\\\n"},
            {"nowPlayingEmbed", "Сейчас играет в"},
            {"nowPlayingLower", " сейчас играет в "},
            {"nowStreamingEmbed", " сейчас в сети!"},
            {"numUniqueMembers", "Количество Уникальных Участников"},
            {"offline", "НЕ В СЕТИ!\n"},
            {"offlineEmbed", " отключился!"},
            {"on", " on "},
            {"onlineStreamPm1", "Всем привет!  Сейчас есть "},
            {"onlineStreamPm2", " трансляция(и) онлайн, которая(ые) могут вас заинтересовать!  Переходите по ссылке(ам), чтобы проверить " +
                    "их: \n\n"},
            {"oops", "Упс!  Что-то пошло не так. Ничего не изменилось! Попробуем снова."},
            {"patreon", "Если вы желаете пожертвовать для бота, перейдите в Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp", "Дает ссылку на нашу страницу patreon."},
            {"ping", "Когда я был в Китае от Американской сборной по пинг-понгу ,  я очень любил играть моей " +
                    "Flexolite ракеткой."},
            {"pingHelp", "```Markdown\n# ПИНГ\n* Используйте для проверки моего времени отклика. Если я правильно работаю, я пришлю вам pong.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Обновлен канал объявлений %s на: %s."},
            {"platformAnnounceUpdateFail", "\n! Не удалось изменить канал объявления с %s на: %s."},
            {"platformChannelAdd", "\n# Добавлен(ы) канал(ы): %s."},
            {"platformChannelAddFail", "\n# Не удалось добавить канал(ы): %s."},
            {"platformChannelAnnounce", "\n# Он(и) будут объявлен(ы) в: #%s."},
            {"platformChannelGameFilter", "\n# Он(и) будут объявлен(ы) только тогда, когда они играют: %s."},
            {"platformChannelRemove", "\n# Удален(ы) канал(ы): %s."},
            {"platformChannelRemoveFail", "\n! Не удалось удалить канал(ы): %s."},
            {"platformChannelTitleFilter", "\n# Он(и) будут объявлен(ы) только тогда, когда в названии есть слово(а): %s."},
            {"platformGameAdd", "\n# Добавлена(ы) игра(ы): %s."},
            {"platformGameAddFail", "\n# Не удалось добавить игру(ы): %s."},
            {"platformGameAnnounce", "\n# Игра будет объявляться в: #%s."},
            {"platformGameFilterAdd", "\n# Добавлен(ы) игровой(ые) фильтр(ы): %s."},
            {"platformGameFilterAddFail", "\n# Не удалось добавить игровой(ые) фильтр(ы): %s."},
            {"platformGameFilterRemove", "\n# Удален(ы) игровой(ые) фильтр(ы): %s."},
            {"platformGameFilterRemoveFail", "\n# Не удалось удалить игровой(ые) фильтр(ы): %s."},
            {"platformGameNotFound", "\n #Игра(ы) не найдена(ы): %s."},
            {"platformGameRemove", "\n# Удалена(ы) игра(ы): %s."},
            {"platformGameRemoveFail", "\n# Не удалось удалить игру(ы): %s."},
            {"platformTeamAdd", "\n# Team(s) добавлена(ы): %s."},
            {"platformTeamAddFail", "\n# Не удалось добавить Team(s): %s."},
            {"platformTeamAnnounce", "\n# Team(s) будет(ут) объявляться в: #%s."},
            {"platformTeamNotFound", "\n# Team(s) не найдена(ы) на: %s."},
            {"platformTeamRemove", "\n# Team(s) удалена(ы): %s."},
            {"platformTeamRemoveFail", "\n# Не удалось удалить Team(s): %s."},
            {"platformTitleFilterAdd", "\n# Добавлен(ы) фильтр(ы) описания: %s."},
            {"platformTitleFilterAddFail", "\n# Не удалось добавить фильтр(ы) описания: %s."},
            {"platformTitleFilterRemove", "\n# Фильтр(ы) описания удален(ы): %s."},
            {"platformTitleFilterRemoveFail", "\n# Не удалось удалить фильтр(ы) описания: %s."},
            {"privateMessageReply", "Я извиняюсь, но бот, которого вы пытаетесь достать, имеет автоответчик, который " +
                    "еще не настроен. Повторите попытку позже.."},
            {"removed", "Удалено %s %s."},
            {"removeManagerFail", "Я не могу удалить %s , так как их нет в моей базе данных."},
            {"removeHelp", "```Markdown\n# УДАЛЕНИЕ\n* Используется для удаления менеджеров из моей базы данных.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - @ Упомяните пользователя для удалении из менеджеров"
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Сервера"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Я не могу объявить канал, которого нет на вашем " +
                    "сервере!"},
            {"setDefaultAnnounceChannelFail", "# Я не могу отправлять объявления там. Убедитесь, что у меня есть соответствующие разрешения " +
                    "на указанном канале."},
            {"setDefaultAnnounceChannelHelp", "# НАСТРОЙКА КАНАЛА ОБЪЯВЛЕНИЙ ПО УМОЛЧАНИЮ\n* Установка канала объявлений по умолчанию.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - Имя канала, который вы хотите использовать по умолчанию (перед имененм ДОЛЖЕН быть знак #)\n"
                    + "Эта опция применяется, только если вы не установили определенный канал анонса в команде Twitch."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordКанал"},
            {"setDefaultAnnounceChannelSuccess", "# Канал объявления по умолчанию установлен на: %s."},
            {"setOfflineHelp", "# НАСТРОЙКА OFFLINE СООБЩЕНИЯ В ОБЪЯВЛЕНИИ\n* Детальная настройка offline сообщения для редактируемого offline объявления.\n\n" +
                    "## Доступные значения для использования в вашем сообщении:\n" +
                    "\t* %CHANNEL%   - Название канала в Discord\n" +
                    "\t* %FOLLOWERS% - Общее количество подписчиков\n" +
                    "\t* %GAME%      - Название игры трансляции\n" +
                    "\t* %STATUS%    - Статус (описание) трансляции\n" +
                    "\t* %URL%       - Ссылка на стрим\n" +
                    "\t* %USER%      - Название Twitch канала\n" +
                    "\t* %VIEWERS%   - Количество текущих просмотров\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% НЕ В СЕТИ."},// <--- Do not translate between the %
            {"setOnlineHelp", "# НАСТРОЙКА ONLINE СООБЩЕНИЯ В ОБЪЯВЛЕНИИ\n* Детальная настройка online сообщения.\n\n" +
                    "## Доступные значения для использования в вашем сообщении:\n" +
                    "\t* %CHANNEL%   - Название канала в Discord\n" +
                    "\t* %FOLLOWERS% - Общее количество подписчиков\n" +
                    "\t* %GAME%      - Название игры трансляции\n" +
                    "\t* %STATUS%    - Статус (описание) трансляции\n" +
                    "\t* %URL%       - Ссылка на стрим\n" +
                    "\t* %USER%      - Название Twitch канала\n" +
                    "\t* %VIEWERS%   - Количество текуших просмотров\n\n" +
                    "## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% начал стрим! Подробнее здесь (кликабельно): %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Shard Номер"},
            {"shardsTotal", "Количество Shards"},
            {"smashcastChannelNotFound", "\n# Каналы(ы) не найденны(е) Smashcast: %s."},
            {"smashcastHelp", "```Markdown\n# SMASHCAST\n* Добавление и удаление объектов, связанных с Smashcast.tv related.\n"
                    + "* Заметки:\n\t"
                    + "Чтобы добавить игровые фильтры и фильтры заголовков, вы ДОЛЖНЫ включить скобки.\n\t"
                    + "НЕ ИСПОЛЬЗУЙТЕ полный URL Smashcast. Это не будет работать!! Используйте только название канала (www.smashcast.tv/channelName)\n\t"
                    + "Вы можете добавить несколько каналов, teams, игр, игровых фильтров и фильтров заголовков, используя символ | между ними.\n\t"
                    + "Единственные необходимые параметры: названиеКанала/названиеTeam/названиеИгры\n\n"
                    + "## Smashcast Каналы\n"
                    + "Заметка: Добавление канала объявлений, игровых фильтров и фильтров заголовков необязательно."
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel названиеКанала #каналОбъявления {gameFilters} [titleFilters]\n\n"
                    + "## Smashcast Игры (Объявление ВСЕХ прямых трансляций для игры)\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game названиеИгры #каналОповещения\n\n"
                    + "## Smashcast Teams (Объявление ВСЕХ прямых трансляций для team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team teamName #announcementChannel\n\n"
                    + "## Smashcast Игровые Фильтры (Глобальные)\n"
                    + "* Заметка: Это влияет на все объявления о трансляциях для Smashcast\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {названиеИгры|названиеИгры} #каналОбъявления\n\n"
                    + "## Smashcast Фильтры Описания (Глобальные)\n"
                    + "* Заметка: Это влияет на все объявления о трансляциях для Smashcast\n"
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [слово|ещё слово|ещё слово] #каналОбъявления\n\n"
                    + "* Примеры:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Добавляет Smashcast канал с игровыми фильтрами для объявления в определенном Discord канале)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (Добавляет игру для объявления в Discord канале general)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (Добавляет team с определенным каналом объявлений.)\n\n"
                    + "```"},
            {"statusHelp", "```Markdown\n# СТАТУС\n* Показывает различную статистику бота.\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# ЯЗЫКТРАНСЛЯЦИИ\n* Позволяет фильтровать потоки по тому языку, который транслируется " +
                    "in.  Это поддерживает английское правописание языка, или родное правописание. Должен быть поддержан " +
                    "язык на Twitch, указынный в профиле.\n\n## ПРИМЕНЕНИЕ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Вы можете ввести слово на Английском, либо на родном языке."
                    + "\n\n## ПРИМЕР:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Описание"},
            {"streamsHelp", "```Markdown\n# ТРАНСЛЯЦИИ\n* Я вышлю вам список активных трансляций в личные сообщения.\n* (ПРИМЕЧАНИЕ: вы скорее всего " +
                    "получите несколько личных сообщений, используя эту команду, в зависимости от того, сколько трансляций " +
                    "отслеживается!)\n\n## ПРИМЕНЕНИЕ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Всего просмотров"},
            {"trello", "Чтобы сообщить об ошибке или запросить функции, которые будут добавлены к боту, пожалуйста, используйте наш Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Выдаёт ссылку на Trello для бота"},
            {"twitchChannelNotFound", "\n# Канал(ы) не найден(ы): %s"},
            {"twitchCommunities", "Twitch Сообщества"},
            {"twitchCommunityAdd", "\n# Добавлена(ы) сообщество(а): %s."},
            {"twitchCommunityAddFail", "\n# Не удалось добавить сообщество(а): %s."},
            {"twitchCommunityAnnounce", "\n# Сообщество(а) будет(ут) объявляться в: #%s."},
            {"twitchCommunityNotFound", "\n# Сообщество(а) не найдены на Twitch: %s."},
            {"twitchCommunityRemove", "\n# Сообщество(а) удалено(ы): %s."},
            {"twitchCommunityRemoveFail", "\n# Добавлена(ы) сообщество(ва): %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Добавление и удаление объектов, связанных с Twitch.tv.\n"
                    + "* Примечания:\n\t"
                    + "Чтобы добавить игровые фильтры и фильтры заголовков, вы ДОЛЖНЫ включить скобки.\n\t"
                    + "НЕ ИСПОЛЬЗУЙТЕ полный URL Twitch. Это не будет работать! Используйте только название канала (www.twitch.tv/channelName)\n\t"
                    + "Имя команды должно быть взято из URL, а не с отображаемого имени команды. (www.twitch.tv/team/teamName)\n\t"
                    + "Вы можете добавить несколько каналов, команд, игр, сообществ, фильтров игр и заголовков, используя символ | между ними.\n\t"
                    + "Единственные необходимые параметры: имя канала / имя сообщества / название команды / название игры\n\n"
                    + "## Twitch Каналы\n"
                    + "Добавление канала объявлений, игр и фильтров заголовков необязательно."
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel имяКанала #КаналОповещений {фильтрИгры} [фильтрОписания]\n\n"
                    + "## Twitch Сообщества (Объявление ВСЕХ трансляций сообщества)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community названиеСообщества #КаналОповещений\n\n"
                    + "## Twitch Игры (Объявление ВСЕХ трансляций игры)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game названиеИгры #КаналОповещений\n\n"
                    + "## Twitch Команды (Объявление ВСЕХ трансляций команды)\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team названиеTeam #КаналОповещений\n\n"
                    + "## Twitch Игровые Фильтры (Глобальные)\n"
                    + "* Примечание: Это влияет на все потоковые объявления для Twitch\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {названиеИгры|названиеИгры} #КаналОповещений\n\n"
                    + "## Twitch Фильтры Описания (Глобальные)\n"
                    + "* Примечание: Это влияет на все потоковые объявления для Twitch\n"
                    + "* Образец: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [слово|ещё слово|ещё слово] #КаналОповещений\n\n"
                    + "* Примеры:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (добавляет twitch канал с игровыми фильтрами в заданный канал Discord)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (добавляет игру с объявлением в канале general)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (добавляет сообщество с заданный канал объявлений)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (добавляет team с заданным каналом объявлений).\n\n"
                    + "```"},
            {"twitchTeams", "Twitch Teams"},
            {"typeOnce", "Вам нужно всего лишь ввести эту часть."},
            {"uniqueChannels", "Уникальные каналы %s"},
            {"uniqueGames", "Уникальные игры %s"},
            {"updateAnnounceMessageFail", "# Что-то пошло не так. Сообщение в объявлении не было изменено."},
            {"updateAnnounceMessageSuccess", "# Вы обновили объявление! Теперь используется формат:\n\n* %s"},
            {"updateOfflineMessageFail", "# Что-то пошло не так. Offline сообщение не было изменено."},
            {"updateOfflineMessageSuccess", "# Вы обновили offline сообщение!  Теперь используется формат:\n\n* %s"},
            {"usePlatform", "Это старый способ! Используйте команду для конкретной платформы!  Введите `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` для получения дополнительной информации."},
            {"watchThemHere", "Подробнее: "},
            {"wrongCommand", " :thinking: Я не знаю эту команду."},
            {"ytgChannelNotFound", "\n# Каналы, не найденные в YouTube Gaming: %s."},
            {"ytgHelp", "# YTG\n* Добавляйте и удаляйте объекты, принадлежащие каналам YouTube Gaming.\n"
                    + "* Примечание:\n\t"
                    + "Чтобы добавить фильтры заголовков, вы ДОЛЖНЫ включить скобки.\n\t"
                    + "НЕ ИСПОЛЬЗУЙТЕ полный URL YouTube Gaming. Это не будет работать!! Используйте только отображаемое имя канала (как показано под трансляцией)\n\t"
                    + "Вы можете добавить несколько каналов и фильтров заголовков с помощью символа | между ними.\n\t"
                    + "На данный момент поддерживаются только каналы.  API YouTube не показывает правильное имя игры, которое будет использоваться в других командах."
                    + "Игровые фильтры НЕ ПОДДЕРЖИВАЮТСЯ в YouTube. Смотрите приведенную выше заметку об API."
                    + "Единственный необходимый параметр: channelName\n\n"
                    + "## YouTube Gaming каналы\n"
                    + "Примечание: Добавление канала объявлений и фильтров заголовков необязательно."
                    + "* Формат: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel названиеКанала #каналОповещений [фильтрОписания]\n\n"
                    + "## YouTube Gaming фильтр описания (Глобальный)\n"
                    + "* Примечание: Это влияет на все потоковые объявления для YouTube Gaming\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [слово|ещё слово|ещё слово] #каналОповещений\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (Добавляет ytg канал для анонса в определенном Discord канале)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
