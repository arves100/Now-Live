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
public class LanguageBundle_cs extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Přidáno "},
            {"addFail", "Nepodařilo se přidat "},
            {"addHelp", "# ADD\n* Používá se k přidání něčeho.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <volba> <obsah>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - Zmínka o uživateli znakem @ kterého chcete přidat jako manažera"
                    + "\n\n## EXAMPLE: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Oprávnění tohoto příkazu byla přepsána vývojářem.*"},
            {"alreadyExists", "Vypadá to že toto jsi již do mé databáze přidal. ¯\_(ツ)_/¯"},
            {"alreadyManager", "Vypadá to, že jsem tohoto uživatele již přidala jako správce!"},
            {"announceHelp", "# ANNOUNCE\n* Shhh...  Jsem tajemství...\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <obsah>\n\tTento příkaz je pouze dostupný pro vývojáře."},
            {"mixerChannelNotFound", "\n# Kanály nenalezeny na Mixeru: %s."},
            {"mixerHelp", "# MIXER\n* Přidává a odebírá věci pro Mixer.com.\n"
                    + "* Poznámky:\n\t"
                    + "Pokud chceš přidat filtry pro hry a názvy, MUSÍ obsahovat závorky.\n\t"
                    + "Nepoužívej celý Mixer odkaz. Nebude to fungovat!! Používej pouze název kanálu (www.mixer.com/channelName)\n\t"
                    + "Můžeš přidávat více kanálů, teamů, her, a názvů pokud mezi ně dáš tento znak |.\n\t"
                    + "Jediné požadované možnosti jsou: názevKanálu/názevTýmu\n\u200B\n"
                    + "## Mixer kanály\n"
                    + "Poznámka: Přidání oznamovacího kanálu, filtrů her a názvů je volitelné.\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel názevKanálu #oznamovacíKanál {filtryHer} [filtryNázvu]\n\n"
                    + "## Mixer týmy (Oznamuje všechna živá vysílání z teamu)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team názevTýmu #oznamovacíKanál\n\n"
                    + "## Mixer filtry her (Globální)\n"
                    + "* Poznámka: Toto ovlivňuje všechna oznámení pro Mixer\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer gfilter {názevHry|názevHry} #oznamovacíKanál\n\n"
                    + "## Mixer filtry názvů (Globální)\n"
                    + "* Poznámka: Toto ovlivňuje všechna oznámení pro Mixer\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer tfilter [slovo|jiná slova|více slov] #oznamovacíKanál\n\n"
                    + "## Mixer Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer stats\n\n"
                    + "* Příklady:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (přidává kanál aby byl oznámen v #live-streams a také přidává filter her)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team outpost #outpost-streamers (přidává tým se specifickým oznamovacím kanálem)\n\n"},
            {"botLangFail", "Něco se nepovedlo a můj jazyk je stále stejný."},
            {"botLangHelp", "# BOTLANG\n* Používá se se ke změně jazyku.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang jazyk"
                    + "\n\tVlož buďto anglický pravopis, nebo tvůj vrozený pravopis který chcete přidat."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"},
            {"botLangSuccess", "Úspěšně jsi změnil můj jazyk."},
            {"botLangUnsupported", "Tento jazyk není momentálně podporován."},
            {"botStatistics", "%s statistiky"},
            {"broadcasterLangAllSuccess", " :ok_hand: Budu sledovat streamy se všemi jazyky."},
            {"broadcasterLangFail", "Něco se nepovedlo a já stále sleduji streamy se všemi jazyky."},
            {"broadcasterLangSuccess", " :ok_hand: Budu sledovat pouze streamy v tomto jazyce!"},
            {"canNotRemoveOwner", "Hloupý člověče, němůžeš odebrat majitele serveru z listu manažerů. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ah, člověče...  Něco se nepovedlo... Radši to zkus znovu."},
            {"cleanupHelp", "# CLEANUP\n*  Změňte způsob kterým uklízím svoje oznámení.\n\n## USAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <volba>"
                    + "\n\tnone   - Nic nebudu měnit na mých oznámeních! (základní)"
                    + "\n\tedit   - Upravím svoje oznámení aby říkalo \"OFFLINE\" když je stream offline"
                    + "\n\tdelete - Odstraním oznámení když je stream offline"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit"},
            {"cleanupSuccessDelete", "Pane, ano Pane!  Od teď odstraním každé moje známení!"},
            {"cleanupSuccessEdit", "Upravuji moje oznámení, tak jest."},
            {"cleanupSuccessNone", " :ok_hand: Nebudu dělat nic mým oznámením."},
            {"compactFail", "Um, něco se nepovedlo.  Můj kompaktní mód se nezměnil."},
            {"compactHelp", "# COMPACT\n* Zkrátí moje oznámení.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <volba>"
                    + "\n\tnoEmbed    - Odstraní velké vložení a použije pouze krátkou větu."
                    + "\n\tsmallEmbed - Oznamuje se vložením bez velkého bannerového obrázku."
                    + "\n\tfullEmbed  - Celé oznámení s velkým bannerovým obrázkem."
                    + "\n\tvideoEmbed - Žádné velké oznámení. Oznámení bude malý kódový blok s vloženým videem " +
                    "které můžete přehrát na Discordu."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed"},
            {"compactFullEmbed", " :compression: Od teď budeš dostávat celé upozornení."},
            {"compactSmallEmbed", " :compression: Od teď budeš dostávát upozornění s malým vložením."},
            {"compactNoEmbed", " :compression: Od teď bude tvoje oznámení jen krátká věta."},
            {"compactVideoEmbed", " :compression: Už nebudete dostávat oznámení s velkým vložením.  " +
                    "Videa budete moci přehrávat z Discordu."},
            {"configHelp", "# CONFIG\n* Základní příkaz pro upravení mých nastavení. Zkontroluj si nápovědu pro každé nastavení pro více informací.\n\n" +
                    "# checkPerms\n\tKontronuje oprávnění která bot potřebuje v konkrétních kanálech (#discordChannel je nepovinný)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config checkPerms #discordChannel\n" +
                    "# defaultOfflineMessage\n\tNavrátí původní offline zprávu (použito v upravovaných oznámeních)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "# defaultOnlineMessage\n\tNavrátí původní oznamovací zprávu (použito ve všech oznámeních)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "# setDefaultAnnounceChannel\n\tNastaví globální oznamovací kanál\n\t" +
                    "(Kanál, do kterého budou posílány oznámení pokud neuvedeš jiný v příkazu)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "# setOfflineMessage\n\tNastaví vlastní offline zprávu (použito v upravovaných oznámeních)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "# setOnlineMessage\n\tNastaví vlastní oznamovací zprávu (použito ve všech oznámeních)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help\n" +
                    "# notify\n\tPoužívá se ke globálnímu nastavení oznámení na tomto serveru\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config notify help"},
            {"customMessageNotNull", "# Vlastní oznamovací zpráva nemůže být prázdná.  Promiň...  ¯\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% je nyní živě! Sledujte jeho stream zde: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Resetuje mojí offline zprávu na původní.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% už nestreamuje!  Promiň, tentokrát jsi to nestihl."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Resetuje mojí online zprávu na původní.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Zpráva od " + Const.BOT_NAME + " vývojářů:*\n\n\t"},
            {"discordChannelNoExist", "Tento textový kanál na tvém serveru neexistuje."},
            {"discordChannelNotNull", "# Nemůžu najít tento Discord kanál. Streamy budou oznamovány v základním kanálu."},
            {"discordLink", "Máš zájem se připojit na Now Live discord server? Je tam spoustu lidí kteří ti rádi pomohou " +
                    "pokud máš problémy! Klikni na tento odkaz:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "# Zobrazí odkaz na Now Live discord server."},
            {"discordUserNoExist", "Tato osoba není uživatlem Discordu!  Zkus to znovu!"},
            {"doesNotExist", "To nebylo nikdy přidáno do mé databáze."},
            {"embedFull", "oznámení s celým vložením"},
            {"embedSmall", "oznámení s malým vložením"},
            {"embedVideo", "oznámení s přehrávatelným videem"},
            {"embedNone", "oznámení jenom malým prohlášením a bez vložení"},
            {"emptyArgs", "Myslím si že jsi zapoměl nějaký příkaz.  Ověř si to pomocí help příkazu a zkus to znovu."},
            {"emptyCommand", "Příště až mě probudíš, tak také použij nějaký příkaz."},
            {"followersEmbed", "Sledující"},
            {"followersEmbedYtg", "Odběratelé"},
            {"guildJoinSuccess", "Ahoj!  Jsem Now Live, bot který oznamuje streamy!  Napiš `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` pro list mých příkazů.\n\nPokud potřebuješ pomoc s nastavením " +
                    "připoj se na můj Discord " + Const.DISCORD_URL + " a podívej se do how-to-setup a command-list " +
                    "kanálů pro všechny informace!\n\nNezapomeň říct ahoj!"},
            {"helpPm", "* Ahoj %s! Slyšel jsem že potřebuješ pomoc? Dole je list mých příkazů.\n\n" +
                    "# ADD\n" +
                    "* Používá se k přidání něčeho. Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# MIXER\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " mixer help\n\n" +
                    "# BOTLANG\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# PICARTO\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " picarto help\n\u200B\n" +
                    "# PING\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Pro více informací, napiš: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Pošle ti odkaz na náš Patreon. Příkazy jsou :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Pošle ti odkaz na náše Trello, kde můžeš nahlašovat chyby/bugy. Příkazy jsou :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request\n" +
                    "Pokud potřebuješ další pomoc, připoj se na můj Discord server.  Je tam mnoho lidí co ti rádi pomůžou:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Předal jsi mi nesprávné argumenty.  Zkoukni help pro více informací." +
                    '.'},
            {"invite", "Hej kamaráde! Pozvy mě na svůj server!\n\n\t"
                    + "**Klikni zde:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "# INVITE\n* Používá se k zobrazení mého invite linku.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tPozvy NowLive bota na svůj server."},
            {"listHelp", "# LIST\n* Používá se k zobrazení věcí z mé databáze.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tmixerChannel     - Zobrazí Vám Mixer kanály které sledujete"
                    + "\n\tmixerTeam        - Zobrazí Vám Mixer týmy které sledujete"
                    + "\n\tgfilter          - Zobrazí Vám všechny filtry her které jste nastavil"
                    + "\n\tmanager          - Zobrazí Vám všechny moje manažery"
                    + "\n\tpicartoChannel   - Zobrazí Vám Picarto kanály které sledujete"
                    + "\n\tsetting          - Zobrazí Vám všechna ostatní nastavení"
                    + "\n\tsmashcastChannel - Zobrazí Vám Smashcast kanály které sledujete"
                    + "\n\tsmashcastGame    - Zobrazí Vám Smashcast hry které pro Vás selduji"
                    + "\n\tsmashcastTeam    - Zobrazí Vám Smashcast teamy které sledujete"
                    + "\n\ttfilter          - Zobrazí Vám všechny filtry názvů které jste nastavil"
                    + "\n\ttwitchChannel    - Zobrazí Vám všechny streamy které chcete abych sledoval"
                    + "\n\ttwitchCommunity  - Zobrazí Vám Twitch komunity které sledujete"
                    + "\n\ttwitchGame       - Zobrazí Vám všechny hry které chete abych sledoval"
                    + "\n\ttwitchTeam       - Zobrazí Vám všechny teamy které chcete abych sledoval"
                    + "\n\tytgChannel       - Zobrazí Vám YouTube Gaming kanály které sledujete"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel"},
            {"listSettings", "# Vaše nastavení na tomto serveru" +
			        "\n* Jazyk bota je nastaven na %s." +
					"\n* Jazyk vysílání je nastaven na %s." +
					"\n* Cleanup je nastaven na %s." +
                    "\n* Kompaktní mód je %s." +
					"\n* Momentální online oznamovací zpráva je: %s." +
					"\n* Momentální offline oznamovací zpráva je: %s." +
					"\n* Základní kanál pro oznamování je: %s." +
                    "\n* Notifikace jsou nastaveny na %s."},
            {"needOneManager", "Pokud ho odstraníš, kdo mě bude ovládat?"},
            {"noBotManager", "Je proti mým Discord bot zákonům aby mě ovládal bot. Promiň, zkus najít " +
                    "vhodného člověka pro tuto práci. :thumbsup:"},
            {"noneOnline", "Promiň kámo, ale zrovna není nikdo koho sleduji online."},
            {"notAManager", "Promiň, mohlo by tě to znepokojit: Jsem tvůj služebník, ale ty nejsi můj mistr."},
            {"notAnAdmin", "Promiň, mohlo by tě to znepokojit: Jsem tvůj služebník, ale ty nejsi můj mistr."},
            {"notifyEveryone", ":tada: WHOA!!  **EVERYONE** to patří před oznámení které bude na tomto serveru " +
                    "oznamovat streamy!  *(Jsi si jistý?  Nedoporučuji toto na velkých serverech...  Může to lidi " +
                    "rozčílit.)*"},
            {"notifyDeprecated", "# -nl notify bylo odstraněno a již se nepoužívá.  Prosím použij: -nl config notify"},
            {"notifyHelp", "# NOTIFY\n* Používá se ke globálnímu nastavení oznámení na tomto serveru.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " config notify <volba>"
                    + "\n\tnone     - Žádné @ notifikace! (základní)"
                    + "\n\there     - Upozorním pouze uživatele co jsou zrovna online na tomto serveru"
                    + "\n\teveryone - Upozorním VŠECHNY!!  Mwahahaha!!  (Nedoporučuji toto na velkých serverech)"
                    + "\n\t@<role>  - Pošlu @ zmínku pro roly kterou jsi nastavil"
                    + "\n\t@<user>  - Chceš upozornit pouze jednu osobu?  Toto je volba pro tebe!"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config notify everyone"},
            {"notifyHere", " :bellhop_bell: Všichni kdo jsou zrovna online na serveu dostanou upozornění."},
            {"notifyRoleUser", "# Pošlu @ zmínku %s s každým upozorněním"},
            {"notifyTooMany", "# Můžeš upozornit pouze jednu %s najednou!"},
            {"notifyMultipleUsers", " Pokud chceš upozornit více uživatelů, vytvoř si roli a upozorni ji."},
            {"notifyNone", " :ok_hand: Nebudu nikoho upozorňovat."},
            {"nowLive", "NYNÍ ŽIVĚ!\n"},
            {"nowPlayingEmbed", "Nyní hraje"},
            {"nowPlayingLower", " nyní hraje "},
            {"nowStreamingEmbed", " nyní streamuje!"},
            {"numUniqueMembers", "Počet unikátních členů"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " přešel do režimu offline!"},
            {"on", " na "},
            {"onlineStreamPm1", "Hej tam!  K dispozici jsou v současné době "},
            {"onlineStreamPm2", " streameři online kteří by Vás mohly zajímat!  Sleduj jejich odkazy aby jsi je mohl " +
                    "zkouknout: \n\n"},
            {"oops", "Oops!  Něco se nepovedlo a nic se nezměnilo!  Pojďme to zkusit znovu."},
            {"patreon", "Pokud chceš přispět na vývoj bota, zkus navštívit náš Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp", "# Pošle ti link na naši Patreon stránku."},
            {"picartoChannelNotFound", "\n# Kanály nenalezeny na Picarto: %s."},
            {"picartoHelp", "# PICARTO\n* Přidává a odebírá věci které jsou spojené s Picarto.\n"
                    + "* Poznámky:\n\t"
                    + "Pokud chceš přidat filtry pro názvy, MUSÍ obsahovat závorky.\n\t"
                    + "Nepoužívej celý Picarto odkaz. Nebude to fungovat!! Používej pouze název kanálu (ta část za picarto.tv)\n\t"
                    + "Můžeš přidávat více kanálů a filtrů názvů pokud mezi ně dáš tento znak |.\n\t"
                    + "Pro teď jsou podporovány jen kanály. Kategorie Picarta jsou velmi omezené a většina z nich je seskupena do několika málo vybraných.\n\t"
                    + "Jediná požadovaná možnost je: názevKanálu\n\u200B\n"
                    + "## Picarto kanály\n"
                    + "Poznámka: Přidání oznamovacího kanálu a filtru názvů je libovolné.\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel názevKanálu #oznamovacíKanál [filtryNázvů]\n\n"
                    + "## Picarto filtry názvů (Globální)\n"
                    + "* Poznámka: Toto ovlivňuje všechna oznámení z Picarta\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto tfilter [slova|jiná slova|více slov] #oznamovacíKanál\n\n"
                    + "## Picarto Stream staty\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto stats\n\n"
                    + "* Příklady:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel AgueMort #live-streams (přidává oznamovací kanál)\n\t"},
            {"ping", "Když jsem byl v Číně v All-American Ping Pong teamu, miloval jsem hrát ping-pong s mojí " +
                    "Flexolite ping pong pálkou."},
            {"pingHelp", "```Markdown\n# PING\n* Používá se aby jsi mě mohl pingnout. Pokud správně funguji, pošlu ti zpětnou zprávu.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Změnil jsem kanál pro upozornění pro %s na: %s."},
            {"platformAnnounceUpdateFail", "\n! Selhala změna kanálu pro %s na: %s."},
            {"platformChannelAdd", "\n# Přidán(y) kanál(y): %s."},
            {"platformChannelAddFail", "\n# Nepodařilo se přidat kanál(y): %s."},
            {"platformChannelAnnounce", "\n# Budou oznamovány v: #%s."},
            {"platformChannelGameFilter", "\n# Budou oznamovány pouze pokud budou hrát: %s."},
            {"platformChannelRemove", "\n# Odebrané kanály: %s."},
            {"platformChannelRemoveFail", "\n! Nepodařilo se odbrat kanál(y): %s."},
            {"platformChannelTitleFilter", "\n# Budou oznámeny pouze pokud v názvu budou tato slova: %s."},
            {"platformGameAdd", "\n# Přidány hry: %s."},
            {"platformGameAddFail", "\n# Nepodařilo se přidat hru(y): %s."},
            {"platformGameAnnounce", "\n# Hra bude oznamována v: #%s."},
            {"platformGameFilterAdd", "\n# Přidány filtry her: %s."},
            {"platformGameFilterAddFail", "\n# Nepodařilo se přidat filtry pro hry: %s."},
            {"platformGameFilterRemove", "\n# Odebrané filtry pro hry: %s."},
            {"platformGameFilterRemoveFail", "\n# Nepodařilo se odebrat filtry pro hry: %s."},
            {"platformGameNotFound", "\n #Hry nenalezeny: %s."},
            {"platformGameRemove", "\n# Odebrané hry: %s."},
            {"platformGameRemoveFail", "\n# Nepodařilo se odebrat hry: %s."},
            {"platformTeamAdd", "\n# Přidány týmy: %s."},
            {"platformTeamAddFail", "\n# Nepodařilo se přidat týmy: %s."},
            {"platformTeamAnnounce", "\n# Týmy budou oznámeny v: #%s."},
            {"platformTeamNotFound", "\n# Týmy nenalezeny na Twitch: %s."},
            {"platformTeamRemove", "\n# Odebrané týmy: %s."},
            {"platformTeamRemoveFail", "\n# Nepodařilo se odebrat týmy: %s."},
            {"platformTitleFilterAdd", "\n# Přidány filtry názvu: %s."},
            {"platformTitleFilterAddFail", "\n# Nepodařilo se přidat filtry názvu: %s."},
            {"platformTitleFilterRemove", "\n# Odebrané filtry názvu: %s."},
            {"platformTitleFilterRemoveFail", "\n# Nepodařilo se odebrat filtry názvu: %s."},
            {"privateMessageReply", "Omlouvám se, ale bot ke kterému se snažíte dostat nemá ještě nastavenou " +
                    "hlasovou schránku.  Prosím zkus odeslat svojí PM později."},
            {"removed", "Odebráno "},
            {"removeManagerFail", "Nemůžu odstranit %s protože nejsou v mojí databázi."},
            {"removeHelp", "# REMOVE\n* Používá se k odebrání něčeho z mojí databáze.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " remove <volba> <obsah>"
                    + "\n\t<volba>\t<obsah>"
                    + "\n\tmanager - Zmínka o uživateli znakem @ kterého chcete přidat jako manažera"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort"},
            {"servers", "Servers"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Hej, ale nemůžu oznamovat v kanálu který na tvém serveru " +
                    "neexistuje!"},
            {"setDefaultAnnounceChannelFail", "# Nedaří se mi tam odeslat oznámení.  Ujisti se že tam mám správná práva."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Nastaví základní oznamovací kanál.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - Jméno kanálu který chcete aby byl nastaven jako základní(MUSÍ obsahovat #)\n"
                    + "Toto platí pouze pokud jsi nenastavil oznamovací kanál při zadávání příkazu"
                    + "\n\n## PŘÍKLAD:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Základní oznamovací kanál nastaven na: %s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Nastav vlastní offline zprávu pro offline oznamování.\n\n" +
                    "## Dostupné žetony k použití ve vaší zprávě:\n" +
                    "\t* %CHANNEL%   - Název kanálu\n" +
                    "\t* %FOLLOWERS% - Počet followerů\n" +
                    "\t* %GAME%      - Název vysílané hry\n" +
                    "\t* %STATUS%    - Status (název) streamu\n" +
                    "\t* %URL%       - Adresa na vysílání\n" +
                    "\t* %USER%      - Název kanálu\n" +
                    "\t* %VIEWERS%   - Počet momentálně sledujících\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% už nevysílá!  Promiň, tentokrát jsi to nestihl."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Nastav vlastní oznamovací zprávu.\n\n" +
                    "## Dostupné žetony k použití ve vaší zprávě:\n" +
                    "\t* %CHANNEL%   - Název kanálu\n" +
                    "\t* %FOLLOWERS% - Počet followerů\n" +
                    "\t* %GAME%      - Název vysílané hry\n" +
                    "\t* %STATUS%    - Status (název) streamu\n" +
                    "\t* %URL%       - Adresa na vysílání\n" +
                    "\t* %USER%      - Název kanálu\n" +
                    "\t* %VIEWERS%   - Počet momentálně sledujících\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% je nyní živě! Sledujte jeho stream zde: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Číslo střepu"},
            {"shardsTotal", "Počet střepů"},
            {"smashcastChannelNotFound", "\n# Kanály nenalezeny na Smashcast: %s."},
            {"smashcastHelp", "# SMASHCAST\n* Přidává a odebírá věci které jsou spojené s Smashcast.tv.\n"
                    + "* Ponámky:\n\t"
                    + "Pokud chceš přidat filtry pro hry a názvy, MUSÍ obsahovat závorky.\n\t"
                    + "Nepoužívej celý Smashcast odkaz. Nebude to fungovat!! Používej pouze název kanálu (www.smashcast.tv/názevKanálu)\n\t"
                    + "Můžeš přidávat více kanálů, teamů, her, filtrů her a názvů pokud mezi ně dáš tento znak |.\n\t"
                    + "Jediné požadované možnosti jsou: názevKanálu/názevTýmu/názevHry\n\u200B\n"
                    + "## Smashcast Kanály\n"
                    + "Poznámka: Přidání oznamovacího kanálu, filtrů her a názvů je volitelné.\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Smashcast hry (Oznamuje všechna živá vysílání z hry)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game gameName #announcementChannel\n\n"
                    + "## Smashcast Týmy (Oznamuje všechna živá vysílání z týmu)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team teamName #announcementChannel\n\n"
                    + "## Smashcast filtry her (Globální)\n"
                    + "* POZNÁMKA: Toto ovlivňuje všechna oznámení z Smashcastu\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Smashcast filtry kanálů (Globální)\n"
                    + "* POZNÁMKA: Toto ovlivňuje všechna oznámení z Smashcastu\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Smashcast Stream staty\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast stats\n\n"
                    + "* Příklady:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (přidává kanál aby byl oznámen v #live-streams a také přidává filter her)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (přidává filtr hry do globálního oznamovacího kanálu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (přidává tým se specifickým oznamovacím kanálem)"},
            {"staffOverride", "*Povolení tohoto příkazu bylo přepsáno členem personálu.*"},
            {"statusHelp", "# STATUS\n* Zobrazí různé statistiky bota.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status"},
            {"streamlangHelp", "# STREAMLANG\n* Povolí vám filtrovat streamy podle jazyka " +
                    "in.  Toto podporuje anglický pravopis, nebo tvůj vrozený pravopis.  Musí to být podporovaný " +
                    "jazyk na Twitch který je zobrazený v dashboardu.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <jazyk>\n" +
                    "* Můžeš použít buďto tvůj vrozený nebo anglický pravopis."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german"},
            {"streamTitleEmbed", "Název streamu"},
            {"streamsHelp", "# STREAMS\n* Pošlu ti list momentálně online streamů do PM.\n* (POZNÁMKA: Pravděpodobně dostanete " +
                    "více zpráv po použití tohoto příkazu, záleží to na tom kolik sledujete streamů!)\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams"},
            {"totalViewsEmbed", "Počet zhlédnutí"},
            {"trello", "Pro nahlášení chyb nebo pro návrh na vylepšení bota použij prosím naše Trello. " +
                    "https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot"},
            {"trelloHelp", "# Vrací odkaz na naši Trello stránku"},
            {"twitchChannelNotFound", "\n# Kanál(y) které se nepodařilo najít na twitch: %s."},
            {"twitchCommunities", "Twitch komunity"},
            {"twitchCommunityAdd", "\n# Přidána(y) komunita(y): %s."},
            {"twitchCommunityAddFail", "\n# Nepodařilo se přidat komunitu(y): %s."},
            {"twitchCommunityAnnounce", "\n# Komunita bude oznamována v: #%s."},
            {"twitchCommunityNotFound", "\n# Komunita(y) která nebyla nalezena na twitch: %s."},
            {"twitchCommunityRemove", "\n# Odebráné komunity: %s."},
            {"twitchCommunityRemoveFail", "\n# Nepodařilo se odebrat komunitu(y): %s."},
            {"twitchHelp", "# TWITCH\n* Přidává a odebírá věci které jsou spojené s Twitch.tv.\n"
                    + "* Poznámky:\n\t"
                    + "Pokud chceš přidat filtry pro hry a názvy, MUSÍ obsahovat závorky.\n\t"
                    + "Nepoužívej celý Twtich odkaz. Nebude to fungovat!! Používej pouze název kanálu (www.twitch.tv/názevKanálu)\n\t"
                    + "Název týmu musí vycházet z odkazu, ne ze zobrazeného názvu. (www.twitch.tv/team/názevTýmu)\n\t"
                    + "Můžeš přidávat více kanálů, teamů, her, komunit, filtrů her a názvů pokud mezi ně dáš tento znak |.\n\t"
                    + "Jediné požadované možnosti jsou: názevKanálu/názevKomunity/názevTýmu/názevHry\n\u200B\n"
                    + "## Twtich kanály\n"
                    + "Poznámka: Přidání oznamovacího kanálu, filtrů her a názvů je volitelné.\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel názevKanálu #oznamovacíKanál {filtryHer} [filtrNázvu]\n\n"
                    + "## Twitch komunity (Oznamuje VŠECHNA živá vysílání z komunity)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community názevKomunity #oznamovacíKanál\n\n"
                    + "## Twitch hry (Oznamuje všechna živá vysílání z hry)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game názevHry #oznamovacíKanál\n\n"
                    + "## Twitch týmy (Oznamuje všechna živá vysílání z teamu)\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team názevTeamu #oznamovacíKanál\n\n"
                    + "## Twitch filtry her (Globální)\n"
                    + "* Poznámka: Toto ovlivňuje všechna oznámení z Twtiche\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {názevHry|názevHry} #oznamovacíKanál\n\n"
                    + "## Twitch filtry názvů (Globální)\n"
                    + "* Poznámka: Toto ovlivňuje všechna oznámení z Twtiche\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #oznamovacíKanál\n\n"
                    + "## Twitch Stream Stats\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch stats\n\u200B\n"
                    + "* Příklady:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (přidává kanál aby byl oznámen v #live-streams a také přidává filter her)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (přidává filtr hry do globálního oznamovacího kanálu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (přidává komunitu se specifickým oznamovacím kanálem)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (přidává tým se specifickým oznamovacím kanálem)"},
            {"twitchTeams", "Twitch týmy"},
            {"typeOnce", "Stačí když tuto část napíšeš pouze jednou, hlupáku."},
            {"uniqueChannels", "Unikátní kanály %s"},
            {"uniqueGames", "Unikátní hry %s"},
            {"updateAnnounceMessageFail", "# Něco se nepovedlo a oznamovací zpráva nebyla změněna."},
            {"updateAnnounceMessageSuccess", "# Změnil jsi oznamovací zprávu!  Momentální oznamovací zpráva:\n\n* %s"},
            {"updateOfflineMessageFail", "# Něco se nepovedlo a offline zpráva nebyla změněna."},
            {"updateOfflineMessageSuccess", "# Změnil jsi offline zprávu!  Momentální offline zpráva:\n\n* %s"},
            {"usePlatform", "Oops!  To je starý způsob, jak dělat věci!  Použij specifický příkaz pro danou platformu!  Napiš `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` pro více informací."},
            {"watchThemHere", "Sledujte jej zde: "},
            {"wrongCommand", " :thinking: Neznám tento příkaz."},
            {"ytgChannelNotFound", "\n# Kanály nenalezeny na YouTube Gaming: %s."},
            {"ytgHelp", "# YTG\n*Přidává a odebírá věci které jsou spojené s Youtube Gaming.\n"
                    + "* Poznámky:\n\t"
                    + "Pokud chceš přidat filtry pro názvy, MUSÍ obsahovat závorky.\n\t"
                    + "Nepoužívej celý Twtich odkaz. Nebude to fungovat!! Používej pouze název kanálu (jak se ukazuje pod jejich vysíláním)\n\t"
                    + "Můžeš přidávat více kanálů a filtrů názvů pokud mezi ně dáš tento znak |.\n\t"
                    + "Nyní jsou podporovány pouze kanály.  Rozhraní YouTube API nezobrazuje správné jméno hry, které se má používat, jako u jiných příkazů.\n\t"
                    + "Filtry her nejsou podporovány na YouTube.  Podívej se na poznámku o API nahoře.\n\t"
                    + "Jediná požadovaná možnostt je: názevKanálu\n\u200B\n"
                    + "## YouTube Gaming Kanály\n"
                    + "Poznámka: Přidání oznamovacího kanálu a filtrů názvů je volitelné."
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## YouTube Gaming filtry názvů (Globální)\n"
                    + "* POZNÁMKA: Toto ovlivňuje všechna oznámení z Youtube Gamingu\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## YouTube Gaming Stream Staty\n"
                    + "* Formát: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg stats\n\n"
                    + "* Příklady:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (přidává kanál pro upozornění)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
