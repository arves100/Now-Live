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
 * @author Ancso~
 * @version Spanish
 */
public class LanguageBundle_es extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Añadido "},
            {"addFail", "No se pudo añadir "},
            {"addHelp", "# ADD\n* Se usa para añadir gestores al servidor.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - Menciona con un @ para añadir al gerente"
                    + "\n\n## Ejemplo: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*El permiso de este comando se ha reemplazado por un desarollador del bot.*"},
            {"alreadyExists", "Parece que esto ya estaba en mi base de datos. ¯\\_(?)_/¯"},
            {"alreadyManager", "Parece que ese usuario ya es gerente. Encuentra más humanos! "},
            {"announceHelp", "ANNOUNCE:  Shhh...  Soy un secreto...\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tEste comando solo puede ser usado por desarrolladores."},
            {"mixerChannelNotFound", "\n# Channel(s) not found on Mixer: %s."},
            {"mixerHelp", "# MIXER\n* Add and remove things that are Mixer.com related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Mixer URL. It will not work!! Use only the channel name (www.mixer.com/channelName)\n\t"
                    + "You may add multiple channels, teams, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/teamName\n\u200B\n"
                    + "## Mixer Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Mixer Teams (Announce ALL live streams in the team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team teamName #announcementChannel\n\n"
                    + "## Mixer Game Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Mixer Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Mixer Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team outpost #outpost-streamers (adds a team with a specific announcement channel)\n\n"},
            {"botLangFail", "Something went wrong and my language is still the same."},
            {"botLangHelp", "# BOTLANG\n* Used to change the language of my responses.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tIntroduce la otrografía correcta o la nativa del idioma del idioma que quieras."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tSi necesitas ayuda con este comandos u otros fuera de lo que estes mensajes de ayuda y quieres preguntar en un leguaje asociado"
                    + "a este bot, tómate la libertad de hablarle a nuestros traductores en nuestro servidor de Discord . El servidor está en " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Has cambiado mi idioma correctamente!."},
            {"botLangUnsupported", "No soportamos ese lenguaje."},
            {"botStatistics", "%s Statistics"},
            {"broadcasterLangAllSuccess", " :ok_hand: Solo buscaré streamers en todos los idiomas!"},
            {"broadcasterLangFail", "Algo ha salido mal, seguiré buscando en todos los idiomas."},
            {"broadcasterLangSuccess", " :ok_hand: Solo buscaré streamers en ese idioma!"},
            {"canNotRemoveOwner", "Humano incrédulo, no puedes eliminar al dueño del servidor de la lista de gerentes. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Tíiiio, algo ha salido mal. Intentalo en un ratico."},
            {"cleanupHelp", "CLEANUP:  Cambia la forma en la que limpio mis notificaciones.\nUSAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <opción>"
                    + "\n<opción>"
                    + "\n\tnone - No le cambiaré nada a mis notficaciones! (por defecto)"
                    + "\n\tedit - Editaré mis notificaciones para que ponga \"OFFLINE\" cuando el streamer se desconecte."
                    + "\n\tdelete - Borraré la notificación cuando el streamer se desconecte."},
            {"cleanupSuccessDelete", "Señor, sí señor! Borraré todas las notificaciones a partir de ahora!"},
            {"cleanupSuccessEdit", "Editando las notificaciones..."},
            {"cleanupSuccessNone", " :ok_hand: No le haré nada a las notificaciones."},
            {"compactFail", "Algo ha salido mal. Mi modo compacto no ha cambiado."},
            {"compactHelp", "COMPACT:  Cambia mis notificaciones a modo compacto. \nUSAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <opción>"
                    + "\n<opción>"
                    + "\n\tnoEmbed    - Cambia los mensajes largos por los cortos."
                    + "\n\tsmallEmbed - Anuncia los mensajes SIN el banner del canal.."
                    + "\n\tfullEmbed  - Anuncia el stream CON el banner del canal."
                    + "\n\tvideoEmbed - No rich embed. Announcement will be a small code block and an embedded video " +
                    "you can watch in Discord."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed"},
            {"compactFullEmbed", " :compression: Las notificaciones serán enteros a partir de ahora."},
            {"compactSmallEmbed", " :compression: Tendrás las notificaciones un pequeño embed."},
            {"compactNoEmbed", " :compression: A partir de ahora las notificaciones serán una pequeña frase."},
            {"compactVideoEmbed", " :compression: You will no longer get rich embed announcements.  " +
                    "Videos will be able to be played from Discord."},
            {"configHelp", "# CONFIG\n* The base command to set my various settings. Check each specific settings help for more info.\n\n" +
                    "# checkPerms\n\tCheck the permissions the bot needs in a particular text channel (#discordChannel is optional)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config checkPerms #discordChannel\n" +
                    "# defaultOfflineMessage\n\tReturns the offline message to the default (used in edited announcements)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "# defaultOnlineMessage\n\tReturns the announcement message to the default (used in all announcements)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "# setDefaultAnnounceChannel\n\tSet the default announcement channel\n\t" +
                    "(Where it announces when you don't include a specific Discord channel when adding streams)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "# setOfflineMessage\n\tSet a custom offline message (used in edited announcements)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "# setOnlineMessage\n\tSet a custom announcement message (used in all announcements)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help\n" +
                    "# notify\n\tUsed to change the global notification option for this server.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config notify help"},
            {"customMessageNotNull", "# The custom message can't be empty.  Sorry...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% has just gone live! Watch their stream here: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Reset my offline message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% is no longer live!  Sorry, you missed them this time."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Reset my online message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Mensaje de los desarrolladores de:" + Const.BOT_NAME + "\n\n\t"},
            {"discordChannelNoExist", "Este canal de texto no existe en el servidor."},
            {"discordChannelNotNull", "# I can't find that Discord text channel. Stream will be announced in the default channel."},
            {"discordLink", "Quieres unnirte al servidor de Now Live? Hay mucha gente dispuesta a ayudar " +
                    "si tienes problemas! Clica este enlace:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "# Aparece el enlace para unirte al servidor de Now Live."},
            {"discordUserNoExist", "Esta persona no es usuario de discord!  Intentalo de nuevo!"},
            {"doesNotExist", "Eso nunca estuvo en mi base de datos :thinking:."},
            {"embedFull", "announcement with a full size embed"},
            {"embedSmall", "announce with a small embed"},
            {"embedVideo", "announcement with a playable video"},
            {"embedNone", "announce with a just a small statement and no embed"},
            {"emptyArgs", "Creo que te has olvidado de algún comando. Revisa la ayuda para más info."},
            {"emptyCommand", "La próxima vez que me despiertes, pon un comando."},
            {"followersEmbed", "Seguidores"},
            {"followersEmbedYtg", "Subscribers"},
            {"guildJoinSuccess", "Hola!  Soy Now Live, el bot  de streams! Escribe `" + Const.COMMAND_PREFIX
                    + Const.COMMAND + " help` para una lista de comandos.\n\nSi necesitas ayuda configurandome, ven, " +
                    "únete a mi discord " + Const.DISCORD_URL + " y revisa how-to-setup y commands-list " +
                    "para toda la info!\n\nNo olvides saludar!"},
            {"helpPm", "* Hey there, %s! He escuchado por ahí que buscas ayuda eh? Aquí tienes una lista de comandos!.\n\n" +
                    "# ADD\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# MIXER\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " mixer help\n\n" +
                    "# BOTLANG\n" +
                    "* Idiomas soportados: Inglés, Checo, Alemán, Frances, Español\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# PICARTO\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " picarto help\n\u200B\n" +
                    "# PING\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Para obtener más información, escriba: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Da el enlace para el Patreon del bot. Los comandos son:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Da el enlace a Trello que se usa para reportar bugs y para recomendar características. Los comandos son:\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request\n" +
                    "Si necesitas más ayuda, únete a mi server de Discord.  Hay mucha gente dispuesta a ayudar:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Has escrito algo mal.  Revisa la ayuda para más información."},
            {"invite", "Hola amigo! Invitame a tu server!\n\n\t"
                    + "**Click aquí:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "INVITE:  Ya puse mi link de invitaación.\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvita a NowLive a tu servidor de Discord."},
            {"listHelp", "# LIST\n* Este comando lista cosas de la base de datos.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tmixerChannel     - Lists the Mixer Channels you follow"
                    + "\n\tmixerTeam        - Lists the Mixer Teams you follow"
                    + "\n\tgfilter          - Lista los filtros que has configurados"
                    + "\n\tmanager          - Lista los gerentes de este servidor"
                    + "\n\tpicartoChannel   - Lists the Picarto Channels you follow"
                    + "\n\tsetting          - Lista las configuraciones básicas del bot"
                    + "\n\tsmashcastChannel - Lists the Smashcast Channels you follow"
                    + "\n\tsmashcastGame    - List the Smashcast Games that I'm tracking for you"
                    + "\n\tsmashcastTeam    - Lists the Smashcast teams you follow"
                    + "\n\ttfilter          - Lista los filtros de título que tienes puesto"
                    + "\n\ttwitchChannel    - Lista los canales de Twitch que sigues"
                    + "\n\ttwitchCommunity  - Lista las comunidades de Twitch que sigues"
                    + "\n\ttwitchGame       - Lista los juegos de twitch que has configurado"
                    + "\n\ttwitchTeam       - Lista los equipos de Twitch que sigues."
                    + "\n\tytgChannel       - Lists the YouTube Gaming Channels you follow"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel"},
            /* Please order listSettings like this then remove this comment.  NEW > Default announcement channel is: %s.
            REMOVE THE ENGLISH listSettings AND REMOVE THE COMMENT TAGS WHEN DONE :)
            {"listSettings", "# Bot Settings on Your Server" +
                    "\n* Bot language is set to: %s." +
                    "\n* Broadcaster language is set to: %s." +
                    "\n* Cleanup is set to: %s." +
                    "\n* Compact mode is set to: %s." +
                    "\n* Current online announcement message format is: %s." +
                    "\n* Current offline announcement message format is: %s." +
                    "\n* Default announcement channel is: %s" +
                    "\n* Notification is set to: %s."},
            {"listSettings", "# Configuraciones del bot en este server" +
                    "\n* Modo compacto: %s." +
                    "\n* Modo notificiaciones: %s." +
                    "\n* Modo limpieza de notificaciones: %s." +
                    "\n* Lenguaje del streamer: %s." +
                    "\n* Lenguaje del bot: %s." +
                    "\n* Current online announcement message format is: %s." +
                    "\n* Current offline announcement message format is: %s."},*/
            {"needOneManager", "Si lo eliminas... Quien me mandará cosas?"},
            {"noBotManager", "Eso vá en contra de las leyes de la unión de los bots de discord. Lo siento " +
                    "Encuentra a un buen humano para ese trabajo. :thumbsup:"},
            {"noneOnline", "Lo siento tío, Pero no hay nadie de los que sigo en directo."},
            {"notAManager", "Lo siento, sólo los gerentes pueden hacer eso."},
            {"notAnAdmin", "A quien le convenga:  Soy tu sirviente pero no tu no eres mi maestro."},
            {"notifyEveryone", ":tada: GUAU!!  **TODOS** los de este servidor serán notificados cuando alguien " +
                    "se ponga en directo! *(Estás seguro?  No lo recomiendo para grandes servidores...  Puede " +
                    "que alguien se moleste.)*"},
            {"notifyDeprecated", "# -nl notify is deprecated no longer being used.  Please use: -nl config notify"},
            {"notifyHelp", "NOTIFY:  Se usa para cambiar el método de notificación global en el server.\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config notify <option>"
                    + "\n\tnone - No hay @ notificaciones de ese tipo (por defecto)"
                    + "\n\there - Notificaré a todos los que estén conectados cuando lo anuncie"
                    + "\n\teveryone - Notificaré a TODOS!!  MUAJAJAJAJA!!  (No lo recomiendo en servers grandes)"
                    + "\n\t@<role>  - I will send an @ mention for the role of your choice"
                    + "\n\t@<user>  - Want to notify a single user?  This is the option for you!"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config notify everyone"},
            {"notifyHere", " :bellhop_bell: Todo el mundo que esté conectado será notificado."},
            {"notifyRoleUser", "# I will @ mention %s with every announcement"},
            {"notifyTooMany", "# You can only notify one %s at a time!"},
            {"notifyMultipleUsers", " If you want multiple users notified, create a role and have it notified."},
            {"notifyNone", " :ok_hand: No mencionaré a nadie en mis notificaciones."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Reproduciendo"},
            {"nowPlayingLower", " Está reproduciendo "},
            {"nowStreamingEmbed", " Está streameando!"},
            {"numUniqueMembers", "Number Unique Members"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " Se ha desconectado!"},
            {"on", " on "},
            {"onlineStreamPm1", "Hey!  Ahora hay "},
            {"onlineStreamPm2", " streamers en linea que te pueden interesar! Miralos y puede que te gusten! \n\n"},
            {"oops", "Oops!  Algo ha salido mal, pero no se ha cambiado nada!  intentemoslo de nuevo."},
            {"patreon", "Si quieres donar considera unirte a mi Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp", "# Da el enlace a la página de Patreon."},
            {"picartoChannelNotFound", "\n# Channel(s) not found on Picarto: %s."},
            {"picartoHelp", "# PICARTO\n* Add and remove things that are Picarto channels.\n"
                    + "* Notes:\n\t"
                    + "To add title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Picarto URL. It will not work!! Only use the channel name (the part after picarto.tv)\n\t"
                    + "You may add multiple channels and title filters by using the pipe character | between them.\n\t"
                    + "Only channels are supported for now.  Picarto categories are very limited and most are grouped in a small select few.\n\t"
                    + "The only required option is: channelName\n\u200B\n"
                    + "## Picarto Channels\n"
                    + "Note: Adding an announcement channel and title filters are optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## Picarto Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Picarto\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Picarto Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto stats\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel AgueMort #live-streams (adds a channel to announce in a certain channel)\n\t"},
            {"ping", "Cuando estaba en china, en el equipo \"All-American Ping Pong\", me encantaba jugar al ping-pong con " +
                    "mi raqueta Flexolite. Viejos tiempos."},
            {"pingHelp", "```Ruby\nPING:  Se usa para pingearme. Si funciono bien, te enviaré un pong.\nUSAGE: "
                    + Const.COMMAND_PREFIX + "ping```"},
            {"platformAnnounceUpdate", "\n# Se cambió el canal de notificación de %s a: %s."},
            {"platformAnnounceUpdateFail", "\n! No se pudo cambiar el canal de %s a: %s."},
            {"platformChannelAdd", "\n# Se añadió(eron) canal(es): %s."},
            {"platformChannelAddFail", "\n# No se pudieron añadir el(los) canal(es): %s."},
            {"platformChannelAnnounce", "\n# Serán anunciados en: #%s."},
            {"platformChannelGameFilter", "\n# Solo serán anunciados mientras juegen: %s."},
            {"platformChannelNotFound", "\n# Canal(es) no encontrados: %s."},
            {"platformChannelRemove", "\n# Canales eliminados: %s."},
            {"platformChannelRemoveFail", "\n! No se pudieron eliminar los canales: %s."},
            {"platformChannelTitleFilter", "\n# Solo se anunciarán cuando estas palabras estén en el titulo: %s."},
            {"platformGameAdd", "\n# Juego(s) añadido(s): %s."},
            {"platformGameAddFail", "\n# No se pudieron añadir los juego(s): %s."},
            {"platformGameAnnounce", "\n# El juego se anunciará en: #%s."},
            {"platformGameFilterAdd", "\n# Se añadieron los filtros: %s."},
            {"platformGameFilterAddFail", "\n# No se pudieron añadir los filtros: %s."},
            {"platformGameFilterRemove", "\n# Eliminados los filtros: %s."},
            {"platformGameFilterRemoveFail", "\n# No se pudo eliminar el filtro: %s."},
            {"platformGameNotFound", "\n #Game(s) not found: %s."},
            {"platformGameRemove", "\n# Eliminado(s) juego(s): %s."},
            {"platformGameRemoveFail", "\n# No se pudo eliminar el juego: %s."},
            {"platformTeamAdd", "\n# Equipo añadido(s): %s."},
            {"platformTeamAddFail", "\n# No se pudo añadir el equipo: %s."},
            {"platformTeamAnnounce", "\n# El equipo se anunciará en: #%s."},
            {"platformTeamNotFound", "\n# Equipo no encontrado: %s."},
            {"platformTeamRemove", "\n# Equipo eliminado: %s."},
            {"platformTeamRemoveFail", "\n# No se pudo eliminar el equipo: %s."},
            {"platformTitleFilterAdd", "\n# Se añadieron los filtros: %s."},
            {"platformTitleFilterAddFail", "\n# No se pudieron añadir los títulos de filtro: %s."},
            {"platformTitleFilterRemove", "\n# Eliminado filtro(s) de título(s): %s."},
            {"platformTitleFilterRemoveFail", "\n# No se pudo eliminar el filtro: %s."},
            {"privateMessageReply", "Lo siento, pero el bot al que estás intentando contactar no tiene el mailobx " +
                    "configurado aún.  Porfavor, intentelo más tarde."},
            {"removed", "Eliminado %s %s."},
            {"removeManagerFail", "No puedo eliminar %s porque no está en mi base de datos."},
            {"removeHelp", "# REMOVE\n* Se usa para eliminar gerentes.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - Usa la mención ( @ ) para eliminar al gerente"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort"},
            {"servers", "Servidores"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Hey now, I can't announce to a channel that doesn't exists on your " +
                    "server!"},
            {"setDefaultAnnounceChannelFail", "# I can't seem to send announcements there.  Make sure I have the proper permissions " +
                    "in that channel."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Set the default announcement channel.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - The name of the channel you wish to be your default(MUST include the #)\n"
                    + "This option only applies if you have not set a specific announce channel in the Twitch command."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Default announcement channel set to: %s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Set a custom offline message for edited offline announcements.\n\n" +
                    "## Available tokens to use in your message:\n" +
                    "\t* %CHANNEL%   - The name of the channel\n" +
                    "\t* %FOLLOWERS% - The total number of followers\n" +
                    "\t* %GAME%      - The name of the game being streamed\n" +
                    "\t* %STATUS%    - The status (title) of the stream\n" +
                    "\t* %URL%       - The URL for the stream\n" +
                    "\t* %USER%      - The name of the channel\n" +
                    "\t* %VIEWERS%   - The number of current viewers\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% is no longer live!  Sorry, you missed them this time."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Set a custom announcement message.\n\n" +
                    "## Available tokens to use in your message:\n" +
                    "\t* %CHANNEL%   - The name of the channel\n" +
                    "\t* %FOLLOWERS% - The total number of followers\n" +
                    "\t* %GAME%      - The name of the game being streamed\n" +
                    "\t* %STATUS%    - The status (title) of the stream\n" +
                    "\t* %URL%       - The URL for the stream\n" +
                    "\t* %USER%      - The name of the channel\n" +
                    "\t* %VIEWERS%   - The number of current viewers\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% has just gone live! Watch their stream here: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Número de Shard"},
            {"shardsTotal", "Numero total de Shards"},
            {"smashcastChannelNotFound", "\n# Channel(s) not found on Smashcast: %s."},
            {"smashcastHelp", "# SMASHCAST\n* Add and remove things that are Smashcast.tv related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Smashcast URL. It will not work!! Use only the channel name (www.smashcast.tv/channelName)\n\t"
                    + "You may add multiple channels, teams, games, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/teamName/gameName\n\u200B\n"
                    + "## Smashcast Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Smashcast Games (Announce ALL live streams for that game)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game gameName #announcementChannel\n\n"
                    + "## Smashcast Teams (Announce ALL live streams in the team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team teamName #announcementChannel\n\n"
                    + "## Smashcast Game Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Smashcast Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Smashcast Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (adds a game to the global announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (adds a team with a specific announcement channel)"},
            {"staffOverride", "*Permission of this command have been overridden by a member of the bot staff.*"},
            {"statusHelp", "# STATUS\n* Muestra varias estadisticas del bot.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status"},
            {"streamlangHelp", "# STREAMLANG\n* Permite filtrar los streams por el lenguaje en el que se " +
                    "emite.  Esto soporta el idioma deletreado en inglés o el idioma escrito de manera nativa. Además el idioma debe " +
                    "estar soportado como Twitch indica en el Dashboard.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Debes usar el deletreo nativo de este idioma o el deletreo en Inglés."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german"},
            {"streamTitleEmbed", "Stream Title"},
            {"streamsHelp", "STREAMS:  Te enviaré una lista de streams por privado. (NOTA: Recibirás " +
                    "bastantes privados usando este comando, dependiendo de cuantos streams tengas" +
                    "monitorizando!)\nUSAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams"},
            {"totalViewsEmbed", "Visitas totales "},
            {"trello", "# Para reportar bug o si tienes alguna caracteristica para añadir al bot usa nuestro Trello. " +
                    "https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot"},
            {"trelloHelp", "Da el link directo al Trello del bot"},
            {"twitchCommunities", "Comunidades de Twitch "},
            {"twitchCommunityAdd", "\n# Añadida comunidad(es): %s."},
            {"twitchCommunityAddFail", "\n# No se pudieron añadir la(s) comunidad(es): %s."},
            {"twitchCommunityNotFound", "\n# Comunidad(es) no encontradas: %s."},
            {"twitchCommunityRemove", "\n# Elimindada communidad(es): %s."},
            {"twitchCommunityRemoveFail", "\n# No se pudieron eliminar las commundad(es): %s."},
            {"twitchHelp", "# TWITCH\n* Añade y elimina cosas relaccionadas con Twitch.tv.\n"
                    + "* Notes:\n\t"
                    + "Para añadir filtros de juegos y de títulos,debes incluir los corchetes.\n\t"
                    + "NO usar el enlace completo, no va a funcionar!!Usa solo el nombre del canal (www.twitch.tv/**__channelName__**)\n\t"
                    + "El nombre del equipo debe ser la url completa, no el nombre del equipo. (www.twitch.tv/team/teamName)\n\t"
                    + "Para añadir múltiples canales, equipos, juegos, comunidades y filtros de título y juegos usa el caracter | entre ellos.\n\t"
                    + "Las unicas opciones son: channelName/communityName/teamName/gameName\n\u200B\n"
                    + "## Canales de Twitch\n"
                    + "Nota: añadir un canal de notificación, y filtros de título o juego es opcional.\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #canaldenotificacion {FiltroDeJuego} [FiltroDeTítulo]\n\n"
                    + "## Comunidades de Twitch (Anuncia TODOS los streams en la comunidad)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community NombreComunidad #canaldenotificacion\n\n"
                    + "## Juegos de Twitch (Anuncia TODOS los streams en ese juego)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game NombreJuego #canaldenotificacion\n\n"
                    + "## Equipos de twitch (Anuncia TODOS los streams en ese equipo)\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team NombreEquipo #canaldenotificacion\n\n"
                    + "## Filtros de Juego (Global)\n"
                    + "* NOTA: Esto afecta a todas las notificaciones de streams para twitch\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {NombreJuego|NombreJuego} #canaldenotificacion\n\n"
                    + "## Filtros de Título (Global)\n"
                    + "* NOTA: Esto afecta a todas las notificaciones\n"
                    + "* Formato: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #canaldenotificación\n\n"
                    + "## Twitch Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch stats\n\u200B\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (añade un canal para anunciar a traves de ciertos filtros)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (Añade un juego al canal de notificación)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (Añade una comunidad para anunciar en un canal específico)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (añade un equipo con un canal específico para anunciar)"},
            {"twitchTeams", "Equipo de Twitch"},
            {"typeOnce", "Solo necesitas escribirlo una vez, tontito."},
            {"uniqueChannels", "Canales únicos %s"},
            {"uniqueGames", "Juegos únicos %s"},
            {"updateAnnounceMessageFail", "# Something went wrong and the announcement message was not changed."},
            {"updateAnnounceMessageSuccess", "# You've updated the announcement message!  It now uses the format:\n\n* %s"},
            {"updateOfflineMessageFail", "# Something went wrong and the offline message was not changed."},
            {"updateOfflineMessageSuccess", "# You've updated the offline message!  It now uses the format:\n\n* %s"},
            {"usePlatform", "Uups!  Eso es como se hacía antes!  Usa el comando específico!  Escribe`" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` para más info."},
            {"watchThemHere", "Miralos aquí: "},
            {"wrongCommand", " :thinking: No conozco ese comando."},
            {"ytgChannelNotFound", "\n# Channel(s) not found on YouTube Gaming: %s."},
            {"ytgHelp", "# YTG\n* Add and remove things that are YouTube Gaming channels.\n"
                    + "* Notes:\n\t"
                    + "To add title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full YouTube Gaming URL. It will not work!! Only use the channel's display name (as shows under their live stream)\n\t"
                    + "You may add multiple channels and title filters by using the pipe character | between them.\n\t"
                    + "Only channels are supported for now.  The YouTube API does not show the proper game name to be used like in other commands.\n\t"
                    + "Game filters are NOT a thing with YouTube.  See the above note about the API.\n\t"
                    + "The only required options is: channelName\n\u200B\n"
                    + "## YouTube Gaming Channels\n"
                    + "Note: Adding an announcement channel and title filters are optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## YouTube Gaming Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for YouTube Gaming\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## YouTube Gaming Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (adds a channel to announce in a certain channel)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
