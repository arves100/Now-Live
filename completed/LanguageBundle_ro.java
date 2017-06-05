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

package drafts;

import com.nowlive.bot.core.Config;
import com.nowlive.bot.util.Const;

import java.util.ListResourceBundle;

/**
 * @author DoNotErase_666
 * @version Romanian
 */
public class LanguageBundle_ro extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Adaugat "},
            {"addFail", "Nu a mers adaugarea "},
            {"addHelp", "# ADD\n* Folosit pentru a adauga manageri pentru server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - Mentiunea @ a userului pentru a il face manager"
                    + "\n\n## EXAMPLE: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Permisiunea acestei comenzi a fost suprascrisa de un developer.*"},
            {"alreadyExists", "Se pare ca deja ai adaugat aia. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Se pare ca acea persoana este deja manager.  Kauta may multzi oameny!!"},
            {"announceHelp", "# ANNOUNCE\n* Shhh...  Sunt un secret...\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tAceasta comanda este valabila doar pentru developeri."},
            {"mixerChannelNotFound", "\n# Canalele acestea nu au fost gasite pe Mixer: %s."},
            {"mixerHelp", "# MIXER\n* Adauga si sterge lucruri care sunt legate de Mixer.com.\n"
                    + "* Notes:\n\t"
                    + "Pentru a adauga jocuri si titluri specifice, TREBUIE sa adaugi parantezele.\n\t"
                    + "NU scrie tot linkul de la Mixer. Nu va merge!! Scrie decat numele canalului (www.mixer.com/Nume)\n\t"
                    + "Poti adauga mai multe canale, echipe, jocuri si titluri specifice da ca pui semnul "|" intre ele.\n\t"
                    + "Lucrurile care trebuie sunt: NumeCanal/NumeEchipa\n\u200B\n"
                    + "## Canale Mixer\n"
                    + "P.S: Adaugarea unui canal de anuntari, jocuri si titluri specifice este optionala.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Echipe Mixer (Anunta TOATE livestreamurile din acea echipa)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team teamName #announcementChannel\n\n"
                    + "## Jocuri specifice Mixer (Global)\n"
                    + "* P.S: Acest lucru va afecta toate anunturile pentru Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Titluri specifice Mixer (Global)\n"
                    + "* P.S: Acest lucru va afecta toate anunturile pentru Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Stasticile Streamului Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer stats\n\n"
                    + "* Exemple:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adauga un canal care doar anunta acea persoana doar cand joaca acele jocuri)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team outpost #outpost-streamers (adauga o echipa cu un canal de anunturi specific)\n\n"},
            {"botLangFail", "Ceva nu a mers si limba mea este aceeasi."},
            {"botLangHelp", "# BOTLANG\n* Comanda aceasta este pentru a schimba limba in care vorbesc.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tScrie limba care vrei sa o setezi. (Trebuie sa scrii limba in engleza)."
                    + "\n\n## EXEMPLU:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tDa ca ai nevoie de ajutor cu aceasta comanda sau celelalte, intra pe serverul de Discord al botului la "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Mi-ai schimbat limba cu succes."},
            {"botLangUnsupported", "Acea limba nu este suportata."},
            {"botStatistics", "%s Statistici"},
            {"broadcasterLangAllSuccess", " :ok_hand: O sa ma uit pentru livestreamuri in toate limbile."},
            {"broadcasterLangFail", "Ceva nu a mers si inca caut pentru toate limbile."},
            {"broadcasterLangSuccess", " :ok_hand: O sa ma uit pentru livestreamuri doar in acea limba!"},
            {"canNotRemoveOwner", "Prostutule, nu poti sterge ownerul de la manageri. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ah, Ceva nu a mers... Mai bine incearca dinnou."},
            {"cleanupHelp", "# CLEANUP\n*  Schimba cum spun anunturile.\n\n## USAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone   - Nu voi face nimic! (default)"
                    + "\n\tedit   - Voi spune \"OFFLINE\" cand livestreamul s-a terminat!"
                    + "\n\tdelete - Voi sterge anuntul dupa ce livestreamul s-a terminat!"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit"},
            {"cleanupSuccessDelete", "Voi sterge toate anunturile de acum incolo!"},
            {"cleanupSuccessEdit", "Voi edita anunturile de acum incolo!"},
            {"cleanupSuccessNone", " :ok_hand: Nu voi face nimic!"},
            {"compactFail", "Um, Ceva nu a mers bine.  Modul meu compact nu s-a schimbat."},
            {"compactHelp", "# COMPACT\n* Schimba cum sa arate anunturile mele.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Sterg totul si doar spun ca au inceput sa faca un livestream."
                    + "\n\tsmallEmbed - Anunta cu incorporare fara banner."
                    + "\n\tfullEmbed  - Anuntul full cu banner."
                    + "\n\tvideoEmbed - O incorporare mica. Anuntul va fi un block cu coduri si un video " +
                    "care il poti vedea direct prin Discord."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed"},
            {"compactFullEmbed", " :compression: Vei vedea anuntul full de acum incolo."},
            {"compactSmallEmbed", " :compression: Vei vedea anuntul cu o incorporare mica de acum incolo."},
            {"compactNoEmbed", " :compression: Nu vei vedea nici o incorporare doar o propozitie."},
            {"compactVideoEmbed", " :compression: De acum incolo vei vedea acel video care il poti viziona prin  " +
                    "Discord."},
            {"configHelp", "# CONFIG\n* Comanda pentru a schimba setarile mele. Uita-te cum sa folosesti fiecare pentru mai multe informatii.\n\n" +
                    "# checkPerms\n\tUita-te da ca botul are permisiunile potrivite. (#discordChannel este optional)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config checkPerms #discordChannel\n" +
                    "# defaultOfflineMessage\n\tSchimba mesajul Offline la cel default.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "# defaultOnlineMessage\n\tSchimba mesajul Online la cel default.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "# setDefaultAnnounceChannel\n\tSeteaza canalul unde botul anunta livestreamurile la cel default.\n\t" +
                    "Anunta unde ai scris comanda de anuntat prima oara.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "# setOfflineMessage\n\tSeteaza un mesaj propriu pentru cand cineva a oprit livestreamul..\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "# setOnlineMessage\n\tSeteaza un mesaj propriu pentru cand cineva a inceput sa faca un livestream.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help\n" +
                    "# notify\n\tAceasta comanda este pentru cum sa notifice oamenii de pe server. (prin everyone sau here).\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config notify help"},
            {"customMessageNotNull", "# Mesajul propriu nu poate fi gol. ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% a inceput sa faca un livestream! Uita-te aici: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Reseteaza mesajul Offline la cel default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% a oprit livestreamul!  Imi pare rau, nu l-ai prins."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Reseteaza mesajul Online la cel default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Mesaj de la " + Const.BOT_NAME + " developeri:*\n\n\t"},
            {"discordChannelNoExist", "Acel canal text nu exista pe server."},
            {"discordChannelNotNull", "# Nu pot gasi acel canal text. Streamul va fi anuntat in cel default."},
            {"discordLink", "Interesat in intrarea serverului de Discord a lui Now Live? " +
                    "Apasa aici:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "# Arata linkul pentru a intra in serverul de Discord a lui Now Live."},
            {"discordUserNoExist", "Acea persoana nu este un user Discord! Incearca dinnou!"},
            {"doesNotExist", "Aia nu a fost niciodata bagata."},
            {"embedFull", "anunt cu incorporare full"},
            {"embedSmall", "anunt cu incorporare mica"},
            {"embedVideo", "anunt cu video"},
            {"embedNone", "anunt fara incorporare"},
            {"emptyArgs", "Cred ca ai uitat cum se scrie comanda. Uita-te la help pentru informatii."},
            {"emptyCommand", "Data viitoare cand te trezesti, da-mi si mie o comanda."},
            {"followersEmbed", "Followeri"},
            {"followersEmbedYtg", "Subscriberi"},
            {"guildJoinSuccess", "Salut! Eu sunt Now Live, botul care anunta cand cineva face un livestream!  Scrie `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` pentru comenzi.\n\n" +
                    "Da ca vrei sa vorbesc in alta limba, scrie `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " botlang help` pentru mai multe informatii.\n\n" +
                    "Da ca ai nevoie de ajutor la cum sa ma configurezi, intra pe acest server de Discord: " +
                    Const.DISCORD_URL +
                    " Si uita-te la how-to-setup si command-list ppentru informatii!\n\n" +
                    "Nu uita sa saluti!"},
            {"helpPm", "* Hei, %s! Comenzile mele sunt:\n\n" +
                    "# ADD\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# MIXER\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " mixer help\n\n" +
                    "# BOTLANG\n" +
                    "* Limbi suportate: Engleza, Czech, Germana, Franceza, Spaniola\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# PICARTO\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " picarto help\n\u200B\n" +
                    "# PING\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Pentru mai multe informatii, scrie: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Pentru mai multe informatii, scrie:" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Linkul Patreonului lui Now Live. Comenzi:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Linkul Trellolui care este pentru raportarea bugurilor si sugestii. Comenzi:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request\n" +
                    "Da ca mai ai nevoie de ajutor, intra pe Discordul meu:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Argumente incorecte. Uita-te la help pentru informatii."},
            {"invite", "Hei %s! Invita-ma la serverul tau!\n\n\t"
                    + "**Apasa aici:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "# INVITE\n* Aceasta comanda este pentru a arata linkul cu care ma poti invita la serverul tau.\n\n## Pentru a folosi:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvita-l pe Now Live Bot pe serverul tau de Discord."},
            {"listHelp", "# LIST\n* Aceasta comanda spune lucrurile de la database.\n\n## Pentru a folosi:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tmixerChannel     - Arata ce canale de Mixer urmaresti"
                    + "\n\tmixerTeam        - Arata ce echipe de Mixer urmaresti"
                    + "\n\tgfilter          - Arata toate filterele de jocuri"
                    + "\n\tmanager          - Arata toti managerii"
                    + "\n\tpicartoChannel   - Arata ce canale de Picarto urmaresti"
                    + "\n\tsetting          - Arata setari ale botului"
                    + "\n\tsmashcastChannel - Arata ce canale de Smashcast urmaresti"
                    + "\n\tsmashcastGame    - Arata ce jocuri de Smashcast urmaresti"
                    + "\n\tsmashcastTeam    - Arata ce echipe de Smashcast urmaresti"
                    + "\n\ttfilter          - Arata toate filterele de titluri"
                    + "\n\ttwitchChannel    - Arata ce canale de Twitch urmaresti"
                    + "\n\ttwitchCommunity  - Arata ce comunitati de Twitch urmaresti"
                    + "\n\ttwitchGame       - Arata ce jocuri de Twitch urmaresti"
                    + "\n\ttwitchTeam       - Arata ce echipe de Twitch urmaresti"
                    + "\n\tytgChannel       - Arata ce canale de YouTube urmaresti"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel"},
            {"listSettings", "# Setarile botului pe acest server" +
                    "\n* Limba botului a fost setata la: %s." +
                    "\n* Limba broadcastului a fost setata la: %s." +
                    "\n* Cleanupul este setat la: %s." +
                    "\n* Compact modeul este setat la: %s." +
                    "\n* Cum arata mesajul de Online: %s." +
                    "\n* Cum arata mesajul de Offline: %s." +
                    "\n* Canalul de anunturi este: %s" +
                    "\n* Notificarile sunt setate la: %s."},
            {"needOneManager", "Da ca stergi acel manager, cine ma va administra?"},
            {"noBotManager", "Nu merge sa ma pui pe mine manager. Cauta o persoana adevarata " +
                    "care stie cum se administreaza. :thumbsup:"},
            {"noneOnline", "Scuze %s, dar nu este nimeni Online care urmaresc acest server."},
            {"notAManager", "Scuze, dar doar manageri pot face aia. Scrie `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` pentru o lista cu oameni care pot."},
            {"notAnAdmin", "Sunt servitorul tau, dar tu nu esti maestrul meu."},
            {"notifyEveryone", ":tada: WHOA!!  **TOATA LUMEA** care este pe server va fi notificat cand " +
                    "anunt streamuri!  *(Esti sigur? Nu recomand asta pentru " +
                    "servere mari...)*"},
            {"notifyDeprecated", "# -nl notify este deapreciat. Scrie: -nl config notify"},
            {"notifyHelp", "# NOTIFY\n* Aceasta comanda este pentru a schimba notificarea (everyone sau here)\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " config notify <option>"
                    + "\n\tnone     - Nici everyone nici here (default)"
                    + "\n\there     - Voi notifica doar cei Online"
                    + "\n\teveryone - Voi notifica **PE TOTI** Hahahaha!!  (Nu recomand asta pe servere mari)"
                    + "\n\t@<role>  - Voi notifica doar pe cei cu un rol specific"
                    + "\n\t@<user>  - Voi notifica doar o singura persoana"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config notify everyone"},
            {"notifyHere", " :bellhop_bell: **TOTI** vor fi notificati cand anunt livestreamuri."},
            {"notifyRoleUser", "# Voi notifica doar %s cand anunt livestreamuri"},
            {"notifyTooMany", "# Poti doar sa notifici un %s pe rand!"},
            {"notifyMultipleUsers", " Da ca vrei mai multi oameni sa fie notificati, creaza un rol si pune-l notificat."},
            {"notifyNone", " :ok_hand: Nu voi notifica pe nimeni."},
            {"nowLive", "LIVE ACUM!\n"},
            {"nowPlayingEmbed", "Jucand"},
            {"nowPlayingLower", " se joaca "},
            {"nowStreamingEmbed", " face un livestream chiar acum!"},
            {"numUniqueMembers", "Numar Membri Unici"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " a oprit livestreamul!"},
            {"on", " pornit "},
            {"onlineStreamPm1", "Hei!  Sunt "},
            {"onlineStreamPm2", " streameri online care probabil o sa iti placa! Urmareste-i pentru a-i vedea " +
                    "out: \n\n"},
            {"oops", "Ups!  Ceva nu a mers si nu s-a schimbat nimic! Sa incercam dinnou."},
            {"patreon", "Da ca vrei sa donezi la Patreon, link: https://www.patreon.com/nowlive"},
            {"patreonHelp", "# Arata linkul la pagina de Patreon."},
            {"picartoChannelNotFound", "\n# Nu am gasit canalele: %s."},
            {"picartoHelp", "# PICARTO\n* Adauga si scoate lucruri care sunt canale Picarto.\n"
                    + "* Notes:\n\t"
                    + "Pentru a adauga filtere de titluri, TREBUIE sa pui paranteze.\n\t"
                    + "NU folosi linkul full, nu va merge!! Foloseste doar numele (picarto.tv/*nume*)\n\t"
                    + "Pentru a adauga mai multe canale si filtre, pune "|" intre fiecare.\n\t"
                    + "Doar canalele sunt suportate deocamdata.\n\t"
                    + "Optiunea care TREBUIE este: channelName\n\u200B\n"
                    + "## Picarto Channels\n"
                    + "Adaugand un canal de anuntari si filtre este optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## Filtre titlu Picarto (Global)\n"
                    + "* Acesta va afecta toate canalele Picarto!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Statistici stream Picarto\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto stats\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel AgueMort #live-streams (adauga un canal Picarto care va fi anuntat in canalul #live-streams)\n\t"},
            {"ping", "Cand am fost in China pe echipa All-American Ping Pong, mi-a placut sa ma joc ping pong cu " +
                    "paleta mea de Ping Pong."},
            {"pingHelp", "```Markdown\n# PING\n* Aceasta comanda este sa imi dai ping. Da ca functionez cum trebuie, iti voi da un Pong.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Updatat canalul de anuntari pentru %s la: %s."},
            {"platformAnnounceUpdateFail", "\n! Nu a mers updatarea canalului pentru %s la: %s."},
            {"platformChannelAdd", "\n# Adaugat canalele: %s."},
            {"platformChannelAddFail", "\n# Nu a mers adaugarea canalelor: %s."},
            {"platformChannelAnnounce", "\n# Vor fi anuntati in: #%s."},
            {"platformChannelGameFilter", "\n# Vor fi anuntati doar cand se joaca: %s."},
            {"platformChannelRemove", "\n# Sters canalele: %s."},
            {"platformChannelRemoveFail", "\n! Nu a mers stergerea canalelor: %s."},
            {"platformChannelTitleFilter", "\n# Vor fi anuntati doar cand au aceste cuvinte in titlu: %s."},
            {"platformGameAdd", "\n# Jocuri adaugate: %s."},
            {"platformGameAddFail", "\n# Nu a mers adaugarea jocurilor: %s."},
            {"platformGameAnnounce", "\n# Jocul va fi anuntat in: #%s."},
            {"platformGameFilterAdd", "\n# Adaugat filtre de joc: %s."},
            {"platformGameFilterAddFail", "\n# Nu a mers adaugarea filtrelor de joc: %s."},
            {"platformGameFilterRemove", "\n# Sters filtrele de joc: %s."},
            {"platformGameFilterRemoveFail", "\n# Nu a mers stergerea filtrelor de joc: %s."},
            {"platformGameNotFound", "\n #Jocurile nu au fost gasite: %s."},
            {"platformGameRemove", "\n# Sters jocurile: %s."},
            {"platformGameRemoveFail", "\n# Nu a mers stergerea jocurilor: %s."},
            {"platformTeamAdd", "\n# Adaugat echipele: %s."},
            {"platformTeamAddFail", "\n# Nu a mers adaugarea echipelor: %s."},
            {"platformTeamAnnounce", "\n# Echipele vor fi anuntate in: #%s."},
            {"platformTeamNotFound", "\n# Echipele nu au fost gasite: %s."},
            {"platformTeamRemove", "\n# Sters echipele: %s."},
            {"platformTeamRemoveFail", "\n# Nu a mers stergerea echipelor: %s."},
            {"platformTitleFilterAdd", "\n# Adaugat filtrele de titlu: %s."},
            {"platformTitleFilterAddFail", "\n# Nu a mers adaugarea filtrelor de titlu: %s."},
            {"platformTitleFilterRemove", "\n# Sters filtrele de titlu: %s."},
            {"platformTitleFilterRemoveFail", "\n# Nu a mers stergerea filtrelor de titlu: %s."},
            {"privateMessageReply", "Botul pe care incerci sa-l accesezi are o cutie voicemail care nu " +
                    "este configurata.  Incearca dinnou mai tarrziu.."},
            {"removed", "Sters %s %s."},
            {"removeManagerFail", "Nu pot sterge %s pentru ca nu exista."},
            {"removeHelp", "# REMOVE\n* Aceasta comanda este folosita pentru a sterge manageri.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\n## EXEMPLU:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort"},
            {"servers", "Servers"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Nu pot anunta pe un canal care " +
                    "nu exista!"},
            {"setDefaultAnnounceChannelFail", "# Se pare ca nu pot trimite anunturi acolo. Uita-te sa vezi daca am permisiunile corecte " +
                    "pe acel canal."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCEMENT CHANNEL\n* Seteaza canalul de anuntari sa fie cel default.\n\n## CUM SA FOLOSESTI:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - Numele canalului (TREBUIE inclus #)\n"
                    + "Aceasta optiune va merge doar da ca nu ai bagat nici un canal de anunturi pe comanda de Twitch."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Canalul de anunturi default este setat la: #%s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Seteaza un mesaj propriu Offline.\n\n" +
                    "## Variabile avalabile pentru a pune in mesaj:\n" +
                    "\t* %CHANNEL%   - Arata numele canalului\n" +
                    "\t* %FOLLOWERS% - Arata cati followeri are acel canal\n" +
                    "\t* %GAME%      - Arata ce joc joaca acea persoana\n" +
                    "\t* %STATUS%    - Arata statisticile streamului\n" +
                    "\t* %URL%       - Arata linkul canalului\n" +
                    "\t* %USER%      - Arata numele canalului\n" +
                    "\t* %VIEWERS%   - Arata cati oameni se uita la acel livestream\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% a oprit livestreamul! Scuze, nu l-ai prins de data aceasta."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Seteaza un mesaj propriu Online.\n\n" +
                    "## Variabile avalabile:\n" +
                    "\t* %CHANNEL%   - Arata numele canalului\n" +
                    "\t* %FOLLOWERS% - Arata cati followeri are acel canal\n" +
                    "\t* %GAME%      - Arata ce joc joaca acea persoana\n" +
                    "\t* %STATUS%    - Arata statisticile streamului\n" +
                    "\t* %URL%       - Arata linkul canalului\n" +
                    "\t* %USER%      - Arata numele canalului\n" +
                    "\t* %VIEWERS%   - Arata cati oameni se uita la acel livestream\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% a inceput un livestream! Uita-te aici: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Shard Number"},
            {"shardsTotal", "Number Shards"},
            {"smashcastChannelNotFound", "\n# Canalele Smashcast care nu au fost gasite: %s."},/////////////////
            {"smashcastHelp", "# SMASHCAST\n* Adauga si scoate lucruri care sunt legate de Smashcast.tv.\n"
                    + "* Notes:\n\t"
                    + "Pentru a adauga filtre, TREBUIE sa pui paranteze.\n\t"
                    + "NU folosi tot linkul. Nu va merge!! Foloseste doar numele canalului (www.smashcast.tv/*nume*)\n\t"
                    + "Pentru a adauga mai multe canale, echipe, jocuri, filtre toate odata pune "|" intre ele.\n\t"
                    + "Optiunile care TREBUIE: channelName/teamName/gameName\n\u200B\n"
                    + "## Canale Smashcast\n"
                    + "Note: Adaugand un canal de anuntari sau filtre este optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Jocuri Smashcast (Anunta TOATE livestreamurile cu acel joc)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game gameName #announcementChannel\n\n"
                    + "## Echipe Smashcast (Anunta TOATE livestreamurile in acea echipa)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team teamName #announcementChannel\n\n"
                    + "## Filtre Jocuri Smashcast (Global)\n"
                    + "* Acesta afecteaza TOATE livestreamurile!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Filtre Titluri Smashcast (Global)\n"
                    + "* Acesta afecteaza TOATE livestreamurile!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Statistici stream Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adauga un canal care va fi anuntat in #live-streams doar cand joaca Overwatch sau World of Warcraft)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (adauga un joc la anunturile globale)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (adauga o echipa cu un canal de anunturi specific)"},
            {"staffOverride", "*Permisiunea acestei comenzi a fost suprascrisa de o persoana care a creat botul.*"},
            {"statusHelp", "# STATUS\n* Arata statisticile botului.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status"},
            {"streamlangHelp", "# STREAMLANG\n* Aceasta comanda va filtra si va anunta livestreamurile DOAR care se vorbesc in acea limba " +
                    "in.  This supports the English spelling of the language, or the native spelling.  Must be a supported " +
                    "Trebuie sa fie una valida care este pe Twitch Dashboard.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Trebuie sa scrii limba in engleza. (ex. daca vrei in spaniola scrii spanish)."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german"},
            {"streamTitleEmbed", "Titlu"},
            {"streamsHelp", "# STREAMS\n* Iti voi trimite steamuri Online pe mesaj privat "
                    "(Numarul mesajelor depinde de cate streamuri monitorizeaza " +
                    "Discordul tau)\n\n## CUM SA FOLOSESTI:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams"},
            {"totalViewsEmbed", "Vizionari"},
            {"trello", "Intra pe Trelloul lui Now Live da ca ai suggesti sau vrei sa raportezi un bug. " +
                    "https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot"},
            {"trelloHelp", "# Aceasta comanda va arata linkul de la Trelloul lui Now Live."},
            {"twitchChannelNotFound", "\n# Canalele Twitch care nu au fost gasite: %s."},
            {"twitchCommunities", "Comunitati Twitch"},
            {"twitchCommunityAdd", "\n# Adaugat comunitati Twitch: %s."},
            {"twitchCommunityAddFail", "\n# Nu a mers adaugarea comunitatilor Twitch: %s."},
            {"twitchCommunityAnnounce", "\n# Comunitatile vor fi anuntate in: #%s."},
            {"twitchCommunityNotFound", "\n# Comunitati Twitch care nu au fost gasite: %s."},
            {"twitchCommunityRemove", "\n# Sters comunitati Twitch: %s."},
            {"twitchCommunityRemoveFail", "\n# Nu a mers stergerea comunitatilor Twitch: %s."},
            {"twitchHelp", "# TWITCH\n* Adauga si sterge lucruri care sunt legate de Twitch.tv.\n"
                    + "* Notes:\n\t"
                    + "Pentru a adauga filtre, TREBUIE sa pui paranteze.\n\t"
                    + "NU folosi tot linkul. Nu va merge!! Foloseste doar numele (www.twitch.tv/*nume*)\n\t"
                    + "Numele echipei trebuie sa fie de la link. (www.twitch.tv/team/*nume*)\n\t"
                    + "Poti adauga mai multe canale, echipe, jocuri, comunitati, filtre toate odata punand "|" intre ele.\n\t"
                    + "Optiunile care TREBUIE: channelName/communityName/teamName/gameName\n\u200B\n"
                    + "## Canale Twitch\n"
                    + "Adaugand un canal de anunturi si filtre este optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Comunitati Twitch (Anunta TOATE livestreamurile din cominutate)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #announcementChannel\n\n"
                    + "## Jocuri Twitch (Anunta TOATE livestreamurile cu acel joc)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game gameName #announcementChannel\n\n"
                    + "## Echipe Twitch (Anunta TOATE livestreamurile din acea echipa)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #announcementChannel\n\n"
                    + "## Filtre Jocuri Twitch (Global)\n"
                    + "* Acesta afecteaza TOATE canalele Twitch!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Filtre Titluri Twitch (Global)\n"
                    + "* Acesta afecteaza TOATE canalele Twitch!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Statistici stream Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adauga canalul AgueMort care va fi anuntat in #live-streams DOAR cand joaca Overwatch sau World of Warcraft)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (adauga un joc la anunturile globale)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (adauga comunitatea cu un canal de anunturi specific)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (adauga o echipa cu un canal de anunturi specific)"},
            {"twitchTeams", "Echipe Twitch"},
            {"typeOnce", "Trebuie sa scrii doar odata."},
            {"uniqueChannels", "Canale Unici %s"},
            {"uniqueGames", "Jocuri Unice %s"},
            {"updateAnnounceMessageFail", "# Ceva nu a mers bine si mesajul Online nu s-a schimbat."},
            {"updateAnnounceMessageSuccess", "# Ai updatat mesajul Online! Arata asa:\n\n* %s"},
            {"updateOfflineMessageFail", "# Ceva nu a mers bine si mesajul Offline nu s-a schimbat."},
            {"updateOfflineMessageSuccess", "# Ai updatat mesajul Offline! Arata asa:\n\n* %s"},
            {"usePlatform", "Ups!  Aceea este veche!  Foloseste comanda pentru platforme specifice!  Type `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` pentru mai multe informatii."},
            {"watchThemHere", "Uita-te la ei aici: "},
            {"wrongCommand", " :thinking: Nu stiu acea comanda."},
            {"ytgChannelNotFound", "\n# Canalele YouTube care nu au fost gasite: %s."},
            {"ytgHelp", "# YTG\n* Adauga si sterge lucruri care sunt legate de canale de YouTube.\n"
                    + "* Notes:\n\t"
                    + "Pentru a adauga filtre de titlu, TREBUIE sa pui paranteze.\n\t"
                    + "NU folosi tot linkul, nu va merge!! Foloseste decat numele canalului (arata sub livestream)\n\t"
                    + "Pentru a adauga mai multe canale si filtre de titlu toate odata trebuie sa pui "|" intre ele.\n\t"
                    + "Doar canale sunt suportate deocamdata.\n\t"
                    + "Filtrele de joc NU merg cu YouTube.\n\u200B\n"
                    + "Optiunea care TREBUIE: channelName\n\n"
                    + "## Canale YouTube\n"
                    + "Note: Adaugand un canal de anuntari sau filtre de titlu este optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## Filtre titlu YouTube (Global)\n"
                    + "* Acesta va afecta toate livestreamurile YouTube!\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Statistici stream YouTube\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg stats\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (adauga canalul AgueMort care va fi anuntat in #live-streams)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
