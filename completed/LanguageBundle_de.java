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
 * @author <put your name here>
 * @version German
 */
public class LanguageBundle_de extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Hinzugefügt: "},
            {"addFail", "Fehler beim Hinzufügen von "},
            {"addHelp", "# ADD\n* Befehl um Manager hinzuzufügen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <inhalt>"
                    + "\n\t<option> <inhalt>"
                    + "\n\tmanager - Der @ Name des Benutzers, den du als Manager hinzufügen möchtest"
                    + "\n\n## BEISPIEL: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague```"},
            {"adminOverride", "*Berechtigung dieses Befehls wurden von einem Bot Developer überschrieben.*"},
            {"alreadyExists", "Es scheint als wäre das bereits in meiner Datenbank. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Dieser Benutzer ist bereits ein Manager.  Find moar humanz!"},
            {"announceHelp", "# ANNOUNCE\n* Shhh...  Ich bin ein Geheimnis...\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <inhalt>\n\tDieser Befehl steht nur den Entwicklern zur Verfügung."},
            {"mixerChannelNotFound", "\n# Kanäle nicht auf Mixer gefunden: %s."},
            {"mixerHelp", "# MIXER\n* Hinzufügen und Entfernen von Mixer.com-Inhalten.\n"
                    + "* Hinweise:\n\t"
                    + "Um Spielefilter und Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette Mixer-URL. Das funktioniert nicht!! Benutze nur den Kanalnamen (www.mixer.com/KanalName)\n\t"
                    + "Du kannst mehrere Kanäle, Teams, Spiele, Communities, Spiel- und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Die einzigen zwingend nötigen Optionen sind: KanalName/TeamName\n\u200B\n"
                    + "## Mixer-Kanäle\n"
                    + "Hinweis: Benachrichtigungskanal, Spiel- und Titelfilter sind optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel KanalName #BenachrichtigungsKanal {SpielFilter} [TitelFilter]\n\n"
                    + "## Mixerteams (Postet ALLE Streams in diesem Team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team TeamName #BenachrichtigungsKanal\n\n"
                    + "## Mixer-Spielefilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Mixer-Benachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer gfilter {SpielName|SpielName} #BenachrichtigungsKanal\n\n"
                    + "## Mixer-Titelfilter (Global\n"
                    + "* HINWEIS: Gilt für alle Mixer-Benachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer tfilter [Wort|Anderes Wort|Noch Ein Wort] #BenachrichtigungsKanal\n\n"
                    + "## Mixer Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer stats\n\n"
                    + "* Beispiele:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Fügt einen Twitchkanal für einen bestimmten Kanal und Spielfilter hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team outpost #outpost-streamers (Fügt ein Mixerteam für einen bestimmten Benachrichtigungskanal hinzu)\n\n"},
            {"botLangFail", "Irgendwas ging schief und meine Sprache ist immernoch die selbe."},
            {"botLangHelp", "# BOTLANG\n* Befehl zum ändern der Sprache.\n\n## VERWENDUNG: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tGebe den englischen oder nativen Namen der Sprache ein, die du einstellen möchtest."

                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish" + "```"
                    + "\n\tWenn du Hilfe bei diesem Befehl brauchst oder andere Sachen zu den Help-Befehlen hast und fragen in deiner Sprache hast "
                    + "welche mit dem Bot zutun haben, komm gern zu unseren Übersetzern in unserem Discord. Der Server " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Du hast erfolgreich meine Sprache geändert."},
            {"botLangUnsupported", "Diese Sprache wird aktuell noch nicht unterstützt."},
            {"botStatistics", "%s Statistiken"},
            {"broadcasterLangAllSuccess", " :ok_hand: Ich werde nach Streams in allen Sprachen suchen!"},
            {"broadcasterLangFail", "Etwas ging schief und ich suche immernoch nach allen Sprachen."},
            {"broadcasterLangSuccess", " :ok_hand: Ich werde nach Streams in dieser Sprache suchen!"},
            {"canNotRemoveOwner", "Haha, du kannst nicht den Serverbesitzer von der Managerliste löschen. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ach, Mensch...  Da hat was nicht funktioniert... am besten nochmal versuchen."},
            {"cleanupHelp", "# CLEANUP\n*  Ändert wie ich Stream Benachrichtigungen aufräume.\n\n## VERWENDUNG:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone - Ich ändere nichts! (Standardeinstellung)"
                    + "\n\tedit - Ich editiere die Benachrichtung und markiere Streams als \"OFFLINE\""
                    + "\n\tdelete - Ich lösche Benachrichtungen, wenn die entsprechenden Streamer offline gehen```"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit"},
            {"cleanupSuccessDelete", "Sir, ja Sir!  Ich lösche meine Benachrichtigungen ab jetzt!"},
            {"cleanupSuccessEdit", "Benachrichtigungen editieren, alles klar."},
            {"cleanupSuccessNone", " :ok_hand: Ich lasse alle Benachrichtungen unverändert."},
            {"compactFail", "Uhm, irgendwas ging schief.  Mein Compact Mode ist nicht geändert worden."},
            {"compactHelp", "# COMPACT\n* Im Compact Mode sind meine Benachrichtigungen kompakter.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Entfernt die Einbettung und benutzt nur einen kurzen Satz."
                    + "\n\tsmallEmbed - Benutzt eine Einbettung ohne große Banner-Bilder."
                    + "\n\tfullEmbed  - Benutzt die komplette Einbettung."
                    + "\n\tvideoEmbed - Keine besondere Einbettung. Benachrichtigungen werden ein kleiner Codeblock und ein eingebettetes Video, " +
                    "das man in Discord ansehen kann."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed"},
            {"compactFullEmbed", " :compression: Du bekommst nun die komplette Benachrichtigung."},
            {"compactSmallEmbed", " :compression: Du bekommst nun die kleinere Einbettung."},
            {"compactNoEmbed", " :compression: Deine Benachrichtigungen sind ab nun nurnoch ein kurzer Satz."},
            {"compactVideoEmbed", " :compression: You will no longer get rich embed announcements.  " +
                    "Videos will be able to be played from Discord."},
            {"configHelp", "# CONFIG\n* Der Grundbefehl um einiges meiner Einstellungen zu ändern. Für mehr Infos, prüfe jede spezifische Einstellungs-Help.\n\n" +
                    "# checkPerms\n\tÜberprüfe die Berechtigungen des Bots in einem bestimmten Textchannel (#discordChannel ist optional)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config checkPerms #discordChannel\n" +
                    "# defaultOfflineMessage\n\tSetzt die Einstellungen der Offline-Nachrichten zurück. (Für bearbeitete Benachrichtigungen zuständig.)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "# defaultOnlineMessage\n\tSetzt die Einstellungen der Offline-Nachrichten zurück. (Für alle Benachrichtigungen zuständig.)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "# setDefaultAnnounceChannel\n\tLegt den Standardchannel für die Benachrichtigungen fest.\n\t" +
                    "(wo es dann benachrichtigt, wenn du keinen spezifischen Channel im Befehl angibst)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "# setOfflineMessage\n\tLege eine eigene Offline-Nachricht fest. (Für bearbeitete Benachrichtigungen zuständig.)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "# setOnlineMessage\n\tLege eine eigene Offline-Nachricht fest. (Für bearbeitete Benachrichtigungen zuständig.)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help\n" +
                    "# notify\n\tÄndert die globablen Benachrichtigunseinstellungen.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config notify help"},
            {"customMessageNotNull", "# Die eigene Nachricht kann nicht leer sein.  Entschuldigung...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% ist gerade live! Siehe den Stream hier: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Setzt die Offline-Nachricht zurück.\n\n" +
                    "## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% ist nicht länger live!  Sorry, du hast ihn diesmal wohl verpasst."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Setzt die Online-Nachricht zurück.\n\n" +
                    "## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Nachricht der " + Const.BOT_NAME + " Entwickler:*\n\n\t"},
            {"discordChannelNoExist", "Dieser Textchannel existiert auf diesem Server nicht."},
            {"discordChannelNotNull", "# Ich konnte diesen Discord-Text-channel nicht finden. Die Streams werden also im Standardchannel gepostet."},
            {"discordLink", "Interessiert unserem Server beizutreten? Dort gibt es eine menge hilfbereiter Menschen " +
                    "wenn du Probleme hast! Klicke auf diesen Link:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "# Zeigt den Link um den Now Live Discord Server beizutreten."},
            {"discordUserNoExist", "Diese Person ist kein Discord Benutzer!  Versuche es nochmal!"},
            {"doesNotExist", "Das wurde nie meiner Datenbank hinzugefügt."},
            {"embedFull", "Benachrichtigung mit einer ganzen Einbettung."},
            {"embedSmall", "Benachrichtigung mit einer kleinen Einbettung."},
            {"embedVideo", "Benachrichtung mit abspielbarem Video."},
            {"embedNone", "Benachrichtigung mit einem kleinen Satz und keiner Einbettung."},
            {"emptyArgs", "Ich glaube du hast da einen Teil des Befehls vergessen.  Mit der Option *help* erkläre ich dir den Befehl gerne."},
            {"emptyCommand", "Wenn du mich nächstes mal weckst, gib mir bitte auch etwas zu tun."},
            {"followersEmbed", "Follower"},
            {"followersEmbedYtg", "Subscribers"},
            {"guildJoinSuccess", "Hi!  Ich bin Now Live, der Streambenachrichtigungsbot!  Schreibe `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` für eine Liste meiner Befehle.\n\nSolltest zu Hilfe beim Einrichten brauchen," +
                    "tritt meinem Server (" + Const.DISCORD_URL + ") bei und sieh dir die How-To-Setup und Command-List " +
                    "Channel für weitere Informationen an!\n\nNicht vergessen hallo zu sagen!"},
            {"helpPm", "* Hey %s!\n\n" +
                    "Ich hab gehört du suchst Hilfe?  Hier ist eine Liste meiner Befehle.\n\n" +
                    "# ADD\n" +
                    "* Befehl um Manager hinzuzufügen. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# MIXER\n" +
                    "* Hinzufügen und Entfernen von Mixer.com Inhalten. Für mehr Informantionen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " mixer help\n\n" +
                    "# BOTLANG\n" +
                    "* Befehl zum ändern der Sprache.\n" +
                    "* Aktuell unterstützte Sprachen: Englisch(English), Tschechisch(Czech), Deutsch(German), Französisch(French), Spanisch(Spanish)" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# PICARTO\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " picarto help\n\u200B\n" +
                    "# PING\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Für mehr Informationen, schreibe: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Gibt den Link zur Bots Patreon Seite. Befehle sind :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Gibt den Link zu unserem Trello welches benutzt wird für Bug Reports und Feature Requests. Befehle sind :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request\n" +
                    "Wenn du weitere Hilfe brauchst, trete meinem Discord bei.  Es gibt dort viele hilfreiche Personen:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Argument(e) fehlen oder sind fehlerhaft.  Benutze die *help* Option für mehr Details."},
            {"invite", "Hey %s! Lade mich zu deinem Server ein!\n\n\t"
                    + "**Klicke hier:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "# INVITE\n* Postet meinen Einladelink.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tLade den NowLive-Bot zu deinem Discord Server ein."},
            {"listHelp", "# LIST\n* Erstellt eine Liste von Dingen in meiner Datenbank.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tmixerChannel     - Listet die Mixer-Channel, denen du folgst"
                    + "\n\tmixerTeam        - Listet die Mixerteams, denen du folgst"
                    + "\n\tgfilter          - Listet alle Spielerfilter"
                    + "\n\tmanager          - Listet die Manager dieses Servers"
                    + "\n\tpicartoChannel   - Lists the Picarto Channels you follow"
                    + "\n\tsetting          - Listet diverse Bot-Einstellungen"
                    + "\n\tsmashcastChannel - Listet die Smashcast-Channel, denen du folgst"
                    + "\n\tsmashcastGame    - Listet die Smashcastspiele, die ich für dich verfolge"
                    + "\n\tsmashcastTeam    - Listet die Smashcastteams, denen du folgst"
                    + "\n\ttfilter          - Listet alle Titelfilter, die du erstellt hast"
                    + "\n\ttwitchChannel    - Listet die Twitch-Channel, denen du folgst"
                    + "\n\ttwitchCommunity  - Listet die Twitch-Communities, denen du folgst"
                    + "\n\ttwitchGame       - Listet die Twitchspiele, die ich für dich verfolge"
                    + "\n\ttwitchTeam       - Listet die Twitchteams, denen du folgst"
                    + "\n\tytgChannel       - Listet die YouTube Gaming-Channel, denen du folgst"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel"},
            {"listSettings", "# Bot-Einstellungen dieses Servers" +
                    "\n* Botsprache ist %s." +
                    "\n* Streamsprache ist %s." +
                    "\n* Cleanup-Modus ist %s." +
                    "\n* Compact mode ist %s." +
                    "\n* Format der jetzigen Online-Benachrichtigung ist: %s." +
                    "\n* Format der jetzigen Offline-Benachrichtigung ist: %s." +
                    "\n* Standardbenachrichtigungskanal ist: %s" +
                    "\n* Benachrichtigungsmodus ist %s."},
            {"needOneManager", "Wenn du das tust, wer managet mich dann?"},
            {"noBotManager", "Bots als Manager hinzufügen verstößt gegen die Discord Bot Union By-Laws. Sorry, versuche einen " +
                    "geeigneten Menschen für diesen Job zu finden. :thumbsup:"},
            {"noneOnline", "Sorry %s, aktuell ist niemand, dem dieser Server folgt, online."},
            {"notAManager", "Entschuldige, aber nur meine Manager dürfen das. Schreibe `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` für eine Liste von Leuten, die das dürfen."},
            {"notAnAdmin", "Ich mag zwar dein Diener sein, aber du bist nicht mein Meister."},
            {"notifyEveryone", ":tada: WOW!!  **JEDER** in diesem Server wird benachrichtigt, wenn ich " +
                    "einen Stream poste!  *(Bist du sicher? In größeren Server könnte es  " +
                    "Leute nerven...)*"},
            {"notifyDeprecated", "# -nl notify is deprecated no longer being used.  Please use: -nl config notify"},
            {"notifyHelp", "# NOTIFY\n* Ändert die globablen Benachrichtigunseinstellungen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " config notify <option>"
                    + "\n\tnone     - Keine @ Mitteilungen (Standardeinstellung)"
                    + "\n\there     - Ich benachrichtige alle, die online sind (via ``@here``)"
                    + "\n\teveryone - Ich benachrichtige ALLE!!  Muhahaha!!  (Nicht für größere Server empfohlen!)"
                    + "\n\t@<role>  - Ich benachrichtige eine Serverrolle deiner Wahl via @-Benachrichtigung"
                    + "\n\t@<user>  - Du möchtest einen einzigen User benachrichtigen?  Dies ist die Option für dich!"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config notify everyone"},
            {"notifyHere", " :bellhop_bell: Alle, die online sind, werden benachrichtigt."},
            {"notifyRoleUser", "# Ich werde %s mit jeder Benachrichtung @-benachrichtigen."},
            {"notifyTooMany", "# Du kannst immer nur ein(e) %s benachrichtigen lassen!"},
            {"notifyMultipleUsers", " Möchtest du mehrere Benutzer benachrichtigt haben, erstelle eine Rolle und lasse diese benachrichtigen."},
            {"notifyNone", " :ok_hand: Ich werde keine @ Mitteilungen mehr benutzen."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Spielt gerade"},
            {"nowPlayingLower", " spielt gerade "},
            {"nowStreamingEmbed", " streamt jetzt!"},
            {"numUniqueMembers", "Nummer einzigartiger Mitglieder"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " ist schon offline!"},
            {"on", " on "},
            {"onlineStreamPm1", "Hey!  Es gibt aktuell "},
            {"onlineStreamPm2", " aktive Streamer, die dich interessieren könnten! Folge ihren Links um sie " +
                    "auszuchecken: \n\n"},
            {"oops", "Ups! Irgendwas ist schiefgelaufen! Lass uns das nochmal versuchen."},
            {"patreon", "Wenn du dem Bot etwas spenden möchtest, beachte unser Patreon zu benutzen. https://www.patreon.com/nowlive"},
            {"patreonHelp", "# Postet den Link zu unserer Patreon Seite."},
            {"picartoChannelNotFound", "\n# Channel(s) not found on Picarto: %s."},
            {"picartoHelp", "# PICARTO\n* Hinzufügen und Entfernen von Picarto-Kanälen und -Titelfiltern.\n"
                    + "* Hinweise:\n\t"
                    + "Um Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette Picarto-URL.  Das funktioniert nicht!! Benutze nur den Kanalnamen (www.picarto.tv/KanalName)\n\t"
                    + "Du kannst mehrere Kanäle und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Vorest sind nur Kanäle unterstützt.  Picarto-Kategorien sind sehr limitiert und es werden zum Großteil nur ein paar wenige benutzt.\n\t"
                    + "Die einzig zwingend nötige Option ist: KanalName\n\u200B\n"
                    + "## Picarto-Kanäle\n"
                    + "Hinweis: Benachrichtigungskanal und Titelfilter sind optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel KanalName BenachrichtigungsKanal [TitelFilter]\n\n"
                    + "## Picarto-Titelfilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Picartobenachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto tfilter [Wort|Anderes Wort|Noch Ein Wort] #BenachrichtigungsKanal\n\n"
                    + "## Picarto Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto stats\n\n"
                    + "* Beispiel:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel AgueMort #live-streams (fügt einen Kanal für einen bestimmten Benachrichtigungskanal hinzu)\n\t"},
            {"ping", "Als ich in China war, war ich in einem amerikanischen Ping-Pongteam. Ich liebte es mit meinem " +
                    "Flexolite Ping-Pongsschläger zu spielen."},
            {"pingHelp", "```Markdown\n# PING\n* Pingbefehl - wenn ich online bin, werde ich antworten.\n\n## VERWENDUNG: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Standardankündigungskanal von %s zu %s geändert."},
            {"platformAnnounceUpdateFail", "\n! Fehler beim Ändern des Standardankündigungskanal von %s zu %s."},
            {"platformChannelAdd", "\n# Hinzugefügte Kanäle: %s."},
            {"platformChannelAddFail", "\n# Fehler beim Hinzufügen der Kanäle: %s."},
            {"platformChannelAnnounce", "\n# Sie werden in #%s angekündigt."},
            {"platformChannelGameFilter", "\n# Sie werden nur angekündigt, wenn sie %s spielen."},
            {"platformChannelRemove", "\n# Entfernte Kanäle: %s."},
            {"platformChannelRemoveFail", "\n! Fehler beim Entfernen der Kanäle: %s."},
            {"platformChannelTitleFilter", "\n# Sie werden nur angekündigt wenn die Worte %s im Titel sind."},
            {"platformGameAdd", "\n# Hinzugefügte Spiele: %s."},
            {"platformGameAddFail", "\n# Fehler beim Hinzufügen der Spiele: %s."},
            {"platformGameAnnounce", "\n# Die Spiele werden in #%s angekündigt."},
            {"platformGameFilterAdd", "\n# Spielfilter hinzugefügt: %s."},
            {"platformGameFilterAddFail", "\n# Fehler beim Hinzufügen der Spielefilter: %s."},
            {"platformGameFilterRemove", "\n# Spielefilter entfernt: %s."},
            {"platformGameFilterRemoveFail", "\n# Fehler beim Entfernen der Spielefilter: %s."},
            {"platformGameNotFound", "\n #Spiel(e) nicht gefunden: %s."},
            {"platformGameRemove", "\n# Spiele entfernt: %s."},
            {"platformGameRemoveFail", "\n# Fehler beim Entfernen der Spiele: %s."},
            {"platformTeamAdd", "\n# Teams hinzugefügt: %s."},
            {"platformTeamAddFail", "\n# Fehler beim Hinzufügen der Teams: %s."},
            {"platformTeamAnnounce", "\n# Die Teams werden in #%s angekündigt."},
            {"platformTeamNotFound", "\n# Team(s) nicht auf Twitch gefunden: %s."},
            {"platformTeamRemove", "\n# Entfernte Teams: %s."},
            {"platformTeamRemoveFail", "\n# Fehler beim entfernen der Teams: %s."},
            {"platformTitleFilterAdd", "\n# Titelfilter hinzugefügt: %s."},
            {"platformTitleFilterAddFail", "\n# Fehler beim Hinzufügen der Titelfilter: %s."},
            {"platformTitleFilterRemove", "\n# Titelfilter entfernt: %s."},
            {"platformTitleFilterRemoveFail", "\n# Fehler beim Entfernen der Titelfilter: %s."},
            {"privateMessageReply", "Es tut uns leid, aber der Bot, den sie gerufen haben, antwortet nicht " +
                    "auf private Nachrichten.  Versuchen Sie es später nocheinmal."},
            {"removed", "Entfernt: %s %s."},
            {"removeManagerFail", "Ich kann %s nicht entfernen, da kein solcher Eintrag in meiner Datenbank existiert."},
            {"removeHelp", "# REMOVE\n* Befehl um Manager zu entfernen.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - Der @ Name des Benutzers, den du als Manager hinzufügen möchtest"
                    + "\n\n## BEISPIEL:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort"},
            {"servers", "Server"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Hey, nun ich kann nicht in einem Channel benachrichtigen, der nicht " +
                    "deinem Server existiert!"},
            {"setDefaultAnnounceChannelFail", "# Ich scheine dort nicht benachrichtigen zu können.  Sei dir sicher, dass ich die richtigen " +
                    "Rechte habe für den Channel."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Legt den Standardchannel für die Benachrichtigungen fest.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <Channel>\n\t"
                    + "<channel> - Der Name des Standardchannels. (MUSS das # enthalten)\n"
                    + "Diese Option wird nur übernommen, wenn du keinen spezifischen Channel in den Befehlen angibst."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Der Standard Benachrichtigungschannel ist nun: %s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Lege eine eigene Offline-Nachricht für bearbeitete Benachrichtigungen fest.\n\n" +
                    "## Verfügbare Tokens zum Benutzen in der Nachricht:\n" +
                    "\t* %CHANNEL%   - Der Name des Channels\n" +
                    "\t* %FOLLOWERS% - Die Gesamtzahl der Follower\n" +
                    "\t* %GAME%      - Der Name des Spiels welches gestreamt wird\n" +
                    "\t* %STATUS%    - Der Status (Titel) des Streams\n" +
                    "\t* %URL%       - Die URL des Streams\n" +
                    "\t* %USER%      - Der Name des Channels\n" +
                    "\t* %VIEWERS%   - Die Nummer der jetzigen Zuschauer\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% ist nicht länger online.  Sorry, du hast ihn diesmal wohl verpasst."},
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Lege eine eigene Benachrichtigung fest.\n\n" +
                    "## Verfügbare Tokens zum Benutzen in der Nachricht:\n" +
                    "\t* %CHANNEL%   - Der Name des Channels\n" +
                    "\t* %FOLLOWERS% - Die Gesamtzahl der Follower\n" +
                    "\t* %GAME%      - Der Name des Spiels welches gestreamt wird\n" +
                    "\t* %STATUS%    - Der Status (Titel) des Streams\n" +
                    "\t* %URL%       - Die URL des Streams\n" +
                    "\t* %USER%      - Der Name des Channels\n" +
                    "\t* %VIEWERS%   - Die Nummer der jetzigen Zuschauer\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% ist gerade live! Siehe den Stream hier: %URL%"},
            {"shardsThis", "Shardnummer"},
            {"shardsTotal", "Nummer der Shards"},
            {"smashcastChannelNotFound", "\n# Kanäle nicht auf Smashcast gefunden: %s."},
            {"smashcastHelp", "# SMASHCAST\n* Hinzufügen und Entfernen von Smashcast.tv-Inhalten.\n"
                    + "* Hinweise:\n\t"
                    + "Um Spielefilter und Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette Smashcast-URL. Das funktioniert nicht!! Benutze nur den Kanalnamen (www.smashcast.tv/KanalName)\n\t"
                    + "Du kannst mehrere Kanäle, Teams, Spiele, Spiel- und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Die einzigen zwingend nötigen Optionen sind: KanalName/TeamName/SpielName\n\u200B\n"
                    + "## Smashcast-Kanäle\n"
                    + "Hinweis: Benachrichtigungskanal, Spiel- und Titelfilter sind optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel KanalName #BenachrichtigungsKanal {Spielfilter} [Titelfilter]\n\n"
                    + "## Smashcastspiele (Postet ALLE Streams dieses Spiels)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game SpielName #BenachrichtigungsKanal\n\n"
                    + "## Smashcastteams (Postet ALLE Streams in diesem Team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team TeamName #BenachrichtigungsKanal\n\n"
                    + "## Smashcast-Spielefilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Smashcastbenachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {SpielName|SpielName} #BenachrichtigungsKanal\n\n"
                    + "## Smashcast-Titelfilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Smashcastbenachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [Wort|Anderes Wort|Noch Ein Wort] #BenachrichtigungsKanal\n\n"
                    + "## Smashcast Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast stats\n\n"
                    + "* Beispiele:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (fügt einen Kanal in einen bestimmten Channel mit Spielefilter hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (fügt einen Kanal zum allgemeinen Benachrichtigungskanal hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (fügt ein Team einen bestimmten Channel hinzu)"},
            {"staffOverride", "*Die Berechtigung dieses Befehls wurden einem Mitglied des Botpersonals überschrieben.*"},
            {"statusHelp", "# STATUS\n* Zeigt einige Statistiken über den Bot.\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status"},
            {"streamlangHelp", "# STREAMLANG\n* Erlaubt das Filtern von Streams nach Sprache " +
                    "Unterstützt entweder den englischen oder nativen Namen der Sprache. Die Sprache " +
                    "muss im Twitch Dashboard unterstützt werden.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <Sprache>\n" +
                    "* Du kannst entweder den nativen oder den englischen Namen der Sprache verwenden."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german"},
            {"streamTitleEmbed", "Streamtitel"},
            {"streamsHelp", "# STREAMS\n* Ich schicke dir alle aktuell aktiven Streams als private Nachricht. (HINWEIS: Du wirst wahrscheinlich " +
                    "mehrere private Nachrichten durch diesen Befehl erhalten, je nachdem wie viele Streams dein Discord Server " +
                    "beobachtet!)\n\n## VERWENDUNG:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams"},
            {"totalViewsEmbed", "Alle Aufrufe"},
            {"trello", "Um Bugs zu reporten oder etwas zu requesten nutze bitte unseren Trello. " +
                    "https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot"},
            {"trelloHelp", "# Gibt den Link zum Trello des Bots"},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchAnnounceUpdate", "\n# Standardbenachrichtigungskanal von %s zu %s geändert."},
            {"twitchAnnounceUpdateFail", "\n! Fehler beim Ändern des Standardbenachrichtigungskanal von %s zu %s."},
            {"twitchChannelAdd", "\n# Hinzugefügte Kanäle: %s."},
            {"twitchChannelAddFail", "\n# Fehler beim Hinzufügen der Kanäle: %s."},
            {"twitchChannelAnnounce", "\n# Sie werden in #%s angekündigt."},
            {"twitchChannelGameFilter", "\n# Sie werden nur angekündigt, wenn sie %s spielen."},
            {"twitchChannelNotFound", "\n# Kanäle nicht auf Twitch gefunden: %s."},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchCommunityAdd", "\n# Hinzugefügte Community(s): %s."},
            {"twitchCommunityAddFail", "\n# Fehler beim hinzufügen der Community(s): %s."},
            {"twitchCommunityAnnounce", "\n# Die Community(s) werden in %s angekündigt."},
            {"twitchCommunityNotFound", "\n# Community(s) nicht auf Twitch gefunden: %s."},
            {"twitchCommunityRemove", "\n# Entfernte Community(s): %s."},
            {"twitchCommunityRemoveFail", "\n# Fehler beim Entfernen der Community(s): %s."},
            {"twitchHelp", "# TWITCH\n* Hinzufügen und Entfernen von Twitch.tv-Inhalten.\n"
                    + "* Hinweise:\n\t"
                    + "Um Spielefilter und Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette Twitch-URL. Das funktioniert nicht!! Benutze nur den Kanalnamen (www.twitch.tv/KanalName)\n\t"
                    + "Der Teamname muss der aus der URL sein, nicht der auf der Seite sichtbare. (www.twitch.tv/team/TeamName)\n\t"
                    + "Du kannst mehrere Kanäle, Teams, Spiele, Communities, Spiel- und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Die einzigen zwingend nötigen Optionen sind: KanalName/CommunityName/TeamName/SpielName\n\u200B\n"
                    + "## Twitch-Kanäle\n"
                    + "Hinweis: Benachrichtigungskanal, Spiel- und Titelfilter sind optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel KanalName #BenachrichtigungsKanal {Spielfilter} [Titelfilter]\n\n"
                    + "## Twitch-Communities (Postet ALLE Streams dieser Community)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community CommunityName #BenachrichtigungsKanal\n\n"
                    + "## Twitchspiele (Postet ALLE Streams dieses Spiels)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game SpielName #BenachrichtigungsKanal\n\n"
                    + "## Twitchteams (Postet ALLE Streams in diesem Team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team TeamName #BenachrichtigungsKanal\n\n"
                    + "## Twitch-Spielefilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Twitchbenachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {SpielName|SpielName} #BenachrichtigungsKanal\n\n"
                    + "## Twitch-Titelfilter (Global)\n"
                    + "* HINWEIS: Gilt für alle Twitchbenachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [Wort|Anderes Wort|Noch Ein Wort] #BenachrichtigungsKanal\n\n"
                    + "## Twitch Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch stats\n\u200B\n"
                    + "* Beispiel:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Fügt einen Twitchkanal für einen bestimmten Kanal und Spielfilter hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (Fügt ein Spiel für den Standardbenachrichtigungskanal hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (Fügt eine Twitch-Community für einen bestimmten Benachrichtigungskanal hinzu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (Fügt ein Twitchteam für einen bestimmten Benachrichtigungskanal hinzu)"},
            {"twitchTeams", "Twitchteams"},
            {"typeOnce", "Das musst du nicht doppelt schreiben, Dussel."},
            {"uniqueChannels", "Verschiedene Kanäle %s"},
            {"uniqueGames", "Verschiedene Spiele %s"},
            {"updateAnnounceMessageFail", "# Irgendetwas ist schief gelaufen, die Benachrichtigung wurde nicht geändert."},
            {"updateAnnounceMessageSuccess", "# Du hast die Benachrichtigung geändert.  Es benutzt nun das Format:\n\n* %s"},
            {"updateOfflineMessageFail", "# Irgendetwas ist schief gelaufen, die Offline-Nachricht wurde nicht geändert."},
            {"updateOfflineMessageSuccess", "# Du hast die Offline-Nachricht geändert.  Es benutzt nun das Format:\n\n* %s"},
            {"usePlatform", "Ups!  Das ist der alte Befehl!  Benutze bitte die neuen plattformspezifischen Befehle!  Schreibe `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` für weitere Informationen"},
            {"watchThemHere", "Jetzt zuschauen: "},
            {"wrongCommand", " :thinking: Den Befehl kenne ich nicht."},
            {"ytgChannelNotFound", "\n# Kanäle nicht auf YouTube Gaming gefunden: %s."},
            {"ytgHelp", "# YTG\n* Hinzufügen und Entfernen von YouTube Gaming-Channels.\n"
                    + "* Hinweise:\n\t"
                    + "Um Titelfilter hinzuzufügen, musst du die Klammern schreiben.\n\t"
                    + "Benutze NICHT die komplette YouTube Gaming-URL. Das funktioniert nicht!! Benutze nur den angezeigten Namen des Kanals (wie unter den Livestreams zu sehen)\n\t"
                    + "Du kannst mehrere Kanäle und Titelfilter hinzufügen indem du das Pipe-Zeichen | als Trennzeichen benutzt.\n\t"
                    + "Bisher sind nur Kanalnamen unterstützt.  Die YouTube-API übergibt keinen Spielnamen, um ihn wie in den anderen Befehlen zu benutzen.\n\t"
                    + "Spielefilter gibt es auf YouTube NICHT.  Siehe den obigen Hinweis über die API.\n\t"
                    + "Die einzigen zwingend nötigen Optionen sind: KanalName\n\u200B\n"
                    + "## YouTube Gaming Channel\n"
                    + "Hinweis: Benachrichtigungskanal und Titelfilter sind optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel KanalName #BenachrichtigungsKanal [TitelFilter]\n\n"
                    + "## YouTube Gaming-Titelfilter (Global)\n"
                    + "* HINWEIS: Gilt für alle YouTube Gaming-Benachrichtigungen auf diesem Server\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [Word|Anderes Wort|Noch Ein Wort] #BenachrichtigungsKanal\n\n"
                    + "## YouTube Gaming Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg stats\n\n"
                    + "* Beispiel:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (Fügt einen Channel für einen bestimmten Kanal hinzu)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
