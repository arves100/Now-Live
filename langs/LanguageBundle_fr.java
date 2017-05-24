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
public class LanguageBundle_fr extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Ajouté "},
            {"addFail", "Échec de l'ajout "},
            {"addHelp", "# ADD\n* Utilisé pour ajouter des managers à votre serveur.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <contenu>"
                    + "\n\t<option>\t<contenu>"
                    + "\n\tmanager - Le @ de l'utilisateur à promouvoir en manager```"
                    + "\n\n## EXEMPLE : " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*La permission de cette commande a été forcée par un développeur.*"},
            {"alreadyExists", "Il semblerait que vous ayez déjà ajouté ça à ma base de données. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Il semblerait que vous ayez déjà engagé cet utilisateur en manager. Trouve plus de n'humains !"},
            {"announceHelp", "# ANNOUNCE:\n*  Chut...  Je suis un secret...\n\n## UTILISATION:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <contenu>\n\tCette commande est uniquement disponible aux développeurs."},
            {"beamChannelNotFound", "\n# Chaîne Beam introuvable : %s."},
            {"beamHelp", "# BEAM\n* Modifier des paramètres spécifiques à Beam.pro.\n"
                    + "* Notes:\n\t"
                    + "Pour ajouter des filtres de jeu et des filtres de titre, vous DEVEZ inclure respectivement les accolades et les crochets.\n\t"
                    + "N'utilisez PAS l'adresse Twitch entière, ça ne marchera pas !! Utilisez uniquement le nom de la chaîne (beam.pro/nomChaine)\n\t"
                    + "Vous pouvez ajouter plusieurs chaînes, équipes, jeux, communautés, filtres de jeu/titre en utilisant la barre verticale | entre eux.\n\t"
                    + "Les seules options requises sont nomChaine/nomEquipe\n\n"
                    + "## Chaînes Beam\n"
                    + "Note : En ajoutant un salon pour les annonces (salonAnnonce), les filtres de jeu/titre sont optionnels."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel nomChaine #salonAnnonce {filtreJeu} [filtreTitre]\n\n"
                    + "## Equipes Beam (Annoncer TOUS les lives de l'équipe)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam team nomEquipe #salonAnnonce\n\n"
                    + "## Filtres de jeu Beam (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Beam\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam gfilter {nomJeu|nomJeu} #salonAnnonce\n\n"
                    + "## Filtres de titre Beam (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Beam\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam tfilter [mot|plusieurs mots|plus de mots] #salonAnnonce\n\n"
                    + "* Exemples :\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (ajoute une chaîne à annoncer dans un certain salon et des filtres de jeu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam team outpost #outpost-streamers (ajoute une équipe dans le salon d'annonce #outpost-streamers)\n\n"},
            {"botLangFail", "Quelque chose s'est mal passé donc je garde la même langue."},
            {"botLangHelp", "# BOTLANG\n* Utilisé pour changer ma langue.\n\n## UTILISATION : "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang <langue>"
                    + "\n\tEntrez soit l'écriture anglaise soit l'écriture native de la langue que vous souhaitez utiliser."
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tSi vous avez besoin d'aide avec cette commande ou d'autres commandes et souhaitez poser des questions sur une langue déjà ajoutée au bot (comme le français), "
                    + "n'hésitez pas à contacter nos traducteurs dans notre serveur. Le Discord est ici : " + Const.COMMAND_PREFIX + Const.COMMAND + "discord"},
            {"botLangSuccess", "Je parlerai désormais français."},
            {"botLangUnsupported", "Cette langue n'est pas encore supportée."},
            {"botStatistics", "%s Statistiques"},
            {"broadcasterLangAllSuccess", " :ok_hand: Je ne chercherai que des streams disponibles dans toutes les langues !"},
            {"broadcasterLangFail", "Quelque chose s'est mal passé, donc je continue à chercher des streams disponibles dans toutes les langues."},
            {"broadcasterLangSuccess", " :ok_hand: Je ne chercherai que des streams dans cette langue !"},
            {"canNotRemoveOwner", "Stupide humain, tu ne peux pas enlever le propriétaire du serveur de la liste des managers. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ah, mec... Quelque chose s'est mal passé... Tu ferais mieux de réessayer."},
            {"cleanupHelp", "```Markdown\n# CLEANUP\n*  Change la façon dont je nettoie mes annonces de stream.\n\n## UTILISATION :"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone - Je ne changerai rien après qu'un stream aura été annoncé ! (par défaut)"
                    + "\n\tedit - Je modifierai mes annonces pour dire \"OFFLINE\" quand le streamer sera hors-ligne"
                    + "\n\tdelete - Je supprimerai simplement l'annonce quand le streamer sera hors-ligne"
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Chef, oui chef ! Je supprimerai désormais les annonces !"},
            {"cleanupSuccessEdit", "Les annonces, je modifierai."},
            {"cleanupSuccessNone", " :ok_hand: Je ne ferai rien aux annonces."},
            {"compactFail", "Hum, quelque chose s'est mal passé. Mon mode compact reste inchangé."},
            {"compactHelp", "```Markdown\n# COMPACT\n* Passer mes annonces dans un mode plus compact.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Annonce composée d'une petite phrase."
                    + "\n\tsmallEmbed - Annonce dans un format compact."
                    + "\n\tfullEmbed  - Annonce en grand format."
                    + "\n\tvideoEmbed - No rich embed. Announcement will be a small code block and an embedded video " +
                    "you can watch in Discord."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: Les annonces seront faites en grand format."},
            {"compactSmallEmbed", " :compression: Les annonces seront faites dans un format compact."},
            {"compactNoEmbed", " :compression: Les annonces ne seront plus qu'une petite phrase."},
            {"compactVideoEmbed", " :compression: You will no longer get rich embed announcements.  " +
                    "Videos will be able to be played from Discord."},
            {"configHelp", "# CONFIG\n* La commande à utiliser pour me paramétrer. Regarde l'aide de chaque paramètre pour comprendre son fonctionnement.\n\n" +
                    "* defaultOfflineMessage - Réinitialise le message hors-ligne (utilisé dans les annonces modifiées)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Réinitialise le message d'annonce (utilisé dans toutes les annonces)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setDefaultAnnounceChannel help - Choisir un salon d'annonce par défaut " +
                    "(où le bot annonce quand tu n'inclus pas un salon dans la commande Twitch)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "* setOfflineMessage - Utiliser un message \"hors-ligne\" personnalisé (utilisé dans les annonce modifiées)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Utiliser un message d'annonce personnalisé (utilisé dans toutes les annonces)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"customMessageNotNull", "# The custom message can't be empty.  Sorry...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% est en live ! Regarde le stream ici : %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Réinitialiser le message hors-ligne.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% est hors-ligne ! Désolé, tu l'as raté cette fois-ci."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Réinitialiser mon message d'annonce.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Message des développeurs " + Const.BOT_NAME + " :*\n\n\t"},
            {"discordChannelNoExist", "Ce salon n'existe pas sur ton serveur."},
            {"discordChannelNotNull", "# I can't find that Discord text channel. Stream will be announced in the default channel."},
            {"discordLink", "Tu souhaites rejoindre le serveur Discord Now Live ? Il est rempli de gens utiles si tu as " +
                    "besoin d'aide ! Clique ici :\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Afficher le lien d'invitation pour rejoindre le serveur Discord Now Live."},
            {"discordUserNoExist", "Cette personne n'existe pas ! Essaie encore !"},
            {"doesNotExist", "Cela n'a jamais été ajouté à ma base de données."},
            {"embedFull", "annonce en grand format"},
            {"embedSmall", "annonce en format compact"},
            {"embedVideo", "annonce avec une vidéo lisable depuis Discord"},
            {"embedNone", "annonce composée d'une petite phrase"},
            {"emptyArgs", "Je crois que tu as oublié une partie de la commande. Regarde la commande \"help\" pour plus d'infos."},
            {"emptyCommand", "La prochaine fois que tu me réveilles, envoie-moi aussi une commande."},
            {"followersEmbed", "Abonnés"},
            {"followersEmbedYtg", "Subscribers"},
            {"guildJoinSuccess", "Hey, salut ! Je suis Now Live, le bot qui annonce les streams ! Tape `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` pour avoir une liste de mes commandes.\n\nSi tu as besoin d'aide pour m'installer, rejoins " +
                    "mon Discord ici : " + Const.DISCORD_URL + " et regarde les salons how-to-setup et command-list " +
                    "pour avoir toutes les infos !\n\nN'oublie pas de dire bonjour !"},
            {"helpPm", "Hey salut, %s ! Alors comme ça on a besoin d'aide ? Voici une liste de mes commandes.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Langues supportées actuellement : English, Czech, German, French, Spanish" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# NOTIFY\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Pour plus d'informations, tape : " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Pour plus d'informations, tape : " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Retourne le lien menant au Patreon du bot. Les commandes sont :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Retourne le lien vers notre Trello qui est utilisé pour les rapports de bug et les suggestions de fonctionnalités. Les commandes sont :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```\n" +
                    "Si tu as encore besoin d'aide, rejoins mon serveur Discord.  Il y a plein de gens utiles là-bas :  " + Const.DISCORD_URL},
            {"incorrectArgs", "Tu m'as transmis des arguments incorrects ou il en manque.  Regarde la commande d'aide pour plus d'infos."},
            {"invite", "Hey %s ! Invite-moi dans ton serveur !\n\n\t"
                    + "**Clique ici :** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "```Markdown\n# INVITE\n* Utilisé pour afficher mon lien d'invitation.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInviter le bot NowLive dans votre serveur Discord.```"},
            {"listHelp", "```Markdown\n# LIST\n* Cette commande liste des choses de ma base de données.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tbeamChannel      - Liste les chaînes Beam suivies"
                    + "\n\tbeamTeam         - Liste les équipes Beam suivies"
                    + "\n\tgfilter          - Liste tous les filtres de jeux mis en place"
                    + "\n\tmanager          - Liste les managers du serveur"
                    + "\n\tsetting          - Liste les paramètres communs du bot"
                    + "\n\tsmashcastChannel - Liste les chaînes Smashcast suivies"
                    + "\n\tsmashcastGame    - Liste les jeux Smashcast que je surveille"
                    + "\n\tsmashcastTeam    - Liste les équipes Smashcast suivies"
                    + "\n\ttfilter          - Liste tous les filtres de titre mis en place"
                    + "\n\ttwitchChannel    - Liste les chaînes Twitch suivies"
                    + "\n\ttwitchCommunity  - Liste les communautés Twitch suivies"
                    + "\n\ttwitchGame       - Liste les jeux Twitch que je surveille"
                    + "\n\ttwitchTeam       - Liste les équipes Twitch suivies"
                    + "\n\tytgChannel       - Liste les chaînes YouTube Gaming suivies"
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel```"},
            {"listSettings", "```Markdown\n" +
                    "# Paramètres du bot sur le serveur" +
                    "\n* Le mode compact est %s." +
                    "\n* Les notifications sont sur %s." +
                    "\n* Le nettoyage est en mode %s." +
                    "\n* La langue de diffusion est sur %s." +
                    "\n* La langue du bot est %s." +
                    "\n* Le format des annonces est actuellement : %s." +
                    "\n* Le format du message hors-ligne est actuellement : %s.```"},
            {"needOneManager", "Si tu supprimes celui-là, qui va me gérer ?"},
            {"noBotManager", "C'est contre les lois de l'union des bots de Discord de laisser des bots me gérer. Désolé, essaie de trouver un " +
                    "humain approprié pour ce travail. :thumbsup:"},
            {"noneOnline", "Désolé mon pote, personne n'est en ligne en ce moment parmi les chaînes que je surveille."},
            {"notAManager", "Désole, mais seuls mes managers peuvent faire ça. Tape `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` pour recevoir une liste des gens qui le peuvent."},
            {"notAnAdmin", "Aux concernés : je suis votre servant, mais vous n'êtes pas mon maître."},
            {"notifyEveryone", ":tada: WOW !!  **TOUT LE MONDE** sur le serveur sera notifié quand j'annoncerai " +
                    "des streams !  *(Es-tu sûr ? Je ne le recommande pas aux grands serveurs... Cela peut " +
                    "énerver les gens.)*"},
            {"notifyHelp", "```Markdown\n# NOTIFY:\n*  Utilisé pour changer les options de notifications globales du serveur.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone - Aucune mention @ de quelque sorte que ce soit. (par défaut)"
                    + "\n\there - Je préviendrai uniquement les personnes qui sont en ligne au moment de l'annonce"
                    + "\n\teveryone - Je préviendrai TOUT LE MONDE !! Mouahahaha !! (Je ne le recommande pas aux grands serveurs)"
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: Tous ceux qui sont en ligne recevront une notification quand j'annoncerai un stream."},
            {"notifyNone", " :ok_hand: Je ne mentionnerai plus personne dans mes annonces."},
            {"nowLive", "EN LIVE !\n"},
            {"nowPlayingEmbed", "Joue à"},
            {"nowPlayingLower", " est en train de jouer "},
            {"nowStreamingEmbed", " est en live !"},
            {"numUniqueMembers", "Nombre de membres uniques"},
            {"offline", "HORS-LIGNE !\n"},
            {"offlineEmbed", " est maintenant hors-ligne !"},
            {"on", " dans l'équipe "},
            {"onlineStreamPm1", "Hello ! Il y a en ce moment "},
            {"onlineStreamPm2", " streamers en ligne qui pourraient t'intéresser ! Suis leur lien pour aller voir " +
                    "leur chaîne : \n\n"},
            {"oops", "Oups ! Quelque chose s'est mal passé et rien n'a été modifié ! Essayons encore."},
            {"patreon", "Si vous souhaitez faire un don aux développeurs, utilisez notre Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp", "Retourne le lien vers notre Patreon."},
            {"ping", "Quand j'étais en Chine dans l'équipe d'Amérique de ping-pong, j'adorais jouer avec ma " +
                    "raquette de ping-pong Flexolite."},
            {"platformAnnounceUpdate", "\n# Le canal des annonces passe de %s à : %s."},
            {"platformAnnounceUpdateFail", "\n! Echec du changement du canal des annonces de %s à : %s."},
            {"platformChannelAdd", "\n# Chaîne(s) ajoutée(s) : %s."},
            {"platformChannelAddFail", "\n# Echec de l'ajout des chaînes suivantes : %s."},
            {"platformChannelAnnounce", "\n# Elles seront annoncées dans : #%s."},
            {"platformChannelGameFilter", "\n# Elles ne seront annoncées uniquement lorsqu'elles joueront à : %s."},
            {"platformChannelRemove", "\n# Chaîne(s) supprimée(s) : %s."},
            {"platformChannelRemoveFail", "\n! Echec de la suppression des chaînes suivantes : %s."},
            {"platformChannelTitleFilter", "\n# Elles ne seront annoncées uniquement lorsque les mots suivants seront présents dans le titre : %s."},
            {"platformGameAdd", "\n# Jeu(x) ajoutés : %s."},
            {"platformGameAddFail", "\n# Echec de l'ajout des jeux suivants : %s."},
            {"platformGameAnnounce", "\n# Le jeu sera annoncé dans : #%s."},
            {"platformGameFilterAdd", "\n# Filtre(s) de jeu ajouté(s) : %s."},
            {"platformGameFilterAddFail", "\n# Echec de l'ajout des filtres de jeu suivant : %s."},
            {"platformGameFilterRemove", "\n# Filtre(s) de jeu supprimés : %s."},
            {"platformGameFilterRemoveFail", "\n# Echec de la suppression des filtres de jeu suivants : %s."},
            {"platformGameNotFound", "\n #Game(s) not found: %s."},
            {"platformGameRemove", "\n# Jeu(x) supprimés : %s."},
            {"platformGameRemoveFail", "\n# Echec de la suppression des jeux suivants : %s."},
            {"platformTeamAdd", "\n# Equipes ajoutée(s) : %s."},
            {"platformTeamAddFail", "\n# Echec de l'ajout des équipes suivantes : %s."},
            {"platformTeamAnnounce", "\n# Les équipes annonceront dans : #%s."},
            {"platformTeamNotFound", "\n# Equipe(s) non trouvées sur : %s."},
            {"platformTeamRemove", "\n# Equipe(s) supprimée(s) : %s."},
            {"platformTeamRemoveFail", "\n# Echec de la suppression des équipes : %s."},
            {"platformTitleFilterAdd", "\n# Filtre(s) de titre ajouté(s) : %s."},
            {"platformTitleFilterAddFail", "\n# Echec de l'ajout des filtres de titre suivants : %s."},
            {"platformTitleFilterRemove", "\n# Filtres de titre supprimés : %s."},
            {"platformTitleFilterRemoveFail", "\n# Echec de la suppression des filtres de titre : %s."},
            {"pingHelp", "```Markdown\n# PING\n* Utilisé pour m'envoyer un ping. Si je fonctionne bien, je vous renverrai un pong.\n\n## UTILISATION : "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"privateMessageReply", "Je suis désolé, mais le bot que tu essaies d'atteindre a une messagerie vocale qui n'a pas encore " +
                    "été mise en place.  Réessaie d'envoyer ton message plus tard."},
            {"removed", "Enlevé %s %s."},
            {"removeManagerFail", "Je ne peux pas enlever %s car il n'est pas dans ma base de données."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Utilisé pour enlever des managers de ma base de données.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove <option> <content>"
                    + "\n\tmanager - Le @ de l'utilisateur à enlever de la liste des managers"
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Serveurs"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Hé, je ne peux pas annoncer dans un salon qui n'existe pas sur ton " +
                    "serveur !"},
            {"setDefaultAnnounceChannelFail", "# Il semblerait que je ne peux pas annoncer là-bas. Assure-toi que j'ai les bonnes permisssions " +
                    "dans ce salon."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Choisir un salon d'annonce par défaut.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - Le nom du salon à utiliser par défaut (doit ABSOLUMENT inclure le #)\n"
                    + "Cette option s'applique uniquement si vous n'avez pas mentionné de salon d'annonce dans la commande Twitch."
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #salondiscord"},
            {"setDefaultAnnounceChannelSuccess", "# Salon d'annonce par défaut défini sur : %s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Utiliser un message hors-ligne personnalisé, pour les annonces modifiées.\n\n" +
                    "## Paramètres utilisables dans votre message :\n" +
                    "\t* %CHANNEL%   - Le nom de la chaîne\n" +
                    "\t* %FOLLOWERS% - Le nombre de followers\n" +
                    "\t* %GAME%      - Le nom du jeu étant diffusé\n" +
                    "\t* %STATUS%    - Le titre du stream\n" +
                    "\t* %URL%       - L'URL du stream\n" +
                    "\t* %USER%      - Le nom de la chaîne\n" +
                    "\t* %VIEWERS%   - Le nombre de viewers actuels\n\n" +
                    "## EXEMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% est hors-ligne ! Désolé, tu l'as raté cette fois-ci."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Utiliser un message d'annonce personnalisé.\n\n" +
                    "## Paramètres utilisables dans votre message :\n" +
                    "\t* %CHANNEL%   - Le nom de la chaîne\n" +
                    "\t* %FOLLOWERS% - Le nombre de followers\n" +
                    "\t* %GAME%      - Le nom du jeu étant diffusé\n" +
                    "\t* %STATUS%    - Le titre du stream\n" +
                    "\t* %URL%       - L'URL du stream\n" +
                    "\t* %USER%      - Le nom de la chaîne\n" +
                    "\t* %VIEWERS%   - Le nombre de viewers actuels\n\n" +
                    "## EXEMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% est en live ! Regarde le stream ici : %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Numéro de fragment"},
            {"shardsTotal", "Nombre de fragments"},
            {"smashcastChannelNotFound", "\n# Channel(s) not found on Smashcast: %s."},
            {"smashcastHelp", "```Markdown\n# SMASHCAST\n* Modifier des paramètres spécifiques à Smashcast.tv.\n"
                    + "* Notes:\n\t"
                    + "Pour ajouter des filtres de jeu et des filtres de titre, vous DEVEZ inclure les crochets.\n\t"
                    + "N'utilisez PAS l'adresse Smashcast entière, ça ne marchera pas !! Utilisez uniquement le nom de la chaîne (www.smashcast.tv/nomChaine)\n\t"
                    + "Vous pouvez ajouter plusieurs chaînes, équipes, jeux, filtres de jeu/titre en utilisant la barre verticale | entre eux.\n\t"
                    + "Les seules options requises sont nomChaine/nomEquipe/nomJeu\n\n"
                    + "## Chaînes Smashcast\n"
                    + "Note : En ajoutant un salon pour les annonces (salonAnnonce), les filtres de jeu/titre sont optionnels."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel nomChaine #salonAnnonce {filtreJeu} [filtreTitre]\n\n"
                    + "## Jeux Smashcast (Annoncer TOUS les lives de ce jeu)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game nomJeu #salonAnnonce\n\n"
                    + "## Equipes Smashcast (Annoncer TOUS les lives de l'équipe')\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team nomEquipe #salonAnnonce\n\n"
                    + "## Filtres de jeu Smashcast (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {nomJeu|nomJeu} #salonAnnonce\n\n"
                    + "## Filtres de titre Smashcast (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Smashcast\n"
                    + "* Format : " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [mot|plusieurs mots|plus de mots] #salonAnnonce\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (ajoute une chaîne à annoncer dans un certain salon et des filtres de jeu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (ajoute un jeu au salon d'annonce global)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (ajoute une équipe dans le salon d'annonce #instinct-streamers)\n\n"
                    + "```"},
            {"statusHelp", "```Markdown\n# STATUS\n* Affiche diverses statistiques du bot.\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Permet de filtrer les streams par la langue dans laquelle ils sont " +
                    "diffusés.  Cette commande supporte l'écriture anglaise de la langue ou l'écriture native.  Ce doit être une " +
                    "langue supportée par Twitch qui est listée dans le Tableau de Bord.\n\n## UTILISATION : "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <langue>\n" +
                    "* Vous pouvez utiliser soit l'écriture native de la langue ou bien son écriture anglaise."
                    + "\n\n## EXEMPLE :  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Titre du Stream"},
            {"streamsHelp", "```Markdown\n# STREAMS\n* Je t'enverrai par message privé une liste des streamers actifs.\n* (NOTE : Tu recevras sûrement " +
                    "plusieurs messages en utilisant cette commande, suivant le nombre de streams que votre serveur " +
                    "surveille !)\n\n## UTILISATION :  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Vues Totales"},
            {"trello", "Pour rapporter des bugs ou suggérer des fonctionnalités, veuillez utiliser notre Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Retourne le lien vers le Trello du bot."},
            {"twitchCommunities", "Communautés Twitch"},
            {"twitchAnnounceUpdate", "\n# Le salon des annonces Twitch passe de %s à : %s."},
            {"twitchAnnounceUpdateFail", "\n! Echec du changement du salon des annonces Twitch de %s à : %s."},
            {"twitchChannelAdd", "\n# Chaîne(s) ajoutée(s) : %s."},
            {"twitchChannelAddFail", "\n# Echec de l'ajout des chaînes suivantes : %s."},
            {"twitchChannelAnnounce", "\n# Elles seront annoncées dans : #%s."},
            {"twitchChannelGameFilter", "\n# Elles ne seront annoncées uniquement lorsqu'elles joueront à : %s."},
            {"twitchChannelNotFound", "\n# Chaîne Twitch introuvable : %s."},
            {"twitchCommunities", "Communautés Twitch"},
            {"twitchCommunityAdd", "\n# Communauté(s) ajoutée(s) : %s."},
            {"twitchCommunityAddFail", "\n# Echec de l'ajout des communautés suivantes : %s."},
            {"twitchCommunityAnnounce", "\n# Ces communautés annonceront dans : #%s."},
            {"twitchCommunityNotFound", "\n# Communautés non trouvées sur Twitch : %s."},
            {"twitchCommunityRemove", "\n# Communauté(s) supprimées : %s."},
            {"twitchCommunityRemoveFail", "\n# Echec de la suppression des communautés : %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Modifier des paramètres spécifiques à Twitch.tv.\n"
                    + "* Notes :\n\t"
                    + "Pour ajouter des filtres de jeu et des filtres de titre, vous DEVEZ inclure les crochets.\n\t"
                    + "N'utilisez PAS l'adresse Twitch entière, ça ne marchera pas !! Utilisez uniquement le nom de la chaîne (www.twitch.tv/nomChaine)\n\t"
                    + "Le nom d'équipe doit être celui de l'adresse, et non pas le nom d'affichage. (www.twitch.tv/team/nomEquipe)\n\t"
                    + "Vous pouvez ajouter plusieurs chaînes, équipes, jeux, communautés, filtres de jeu/titre en utilisant la barre verticale | entre eux.\n\t"
                    + "Les seules options requises sont nomChaine/nomCommunauté/nomEquipe/nomJeu \n\n"
                    + "## Chaînes Twitch\n"
                    + "Note : En ajoutant un salon pour les annonces (salonAnnonce), les filtres de jeu/titre sont optionnels."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel nomChaine #salonAnnonce {filtreJeu} [filtreTitre]\n\n"
                    + "## Communautés Twitch (Annoncer TOUS les lives dans la communauté)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community nomCommunauté #salonAnnonce\n\n"
                    + "## Jeux Twitch (Annoncer TOUS les lives de ce jeu)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game nomJeu #salonAnnonce\n\n"
                    + "## Equipes Twitch (Annoncer TOUS les lives de l'équipe)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team nomEquipe #salonAnnonce\n\n"
                    + "## Filtres de jeu Twitch (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {nomJeu|nomJeu} #salonAnnonce\n\n"
                    + "## Filtres de titre Twitch (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces de streams pour Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #salonAnnonce\n\n"
                    + "* Exemples :\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #streams {Overwatch|World of "
                    + "Warcraft} (ajoute une chaîne à annoncer dans un certain salon et des filtres de jeu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (ajoute un jeu au salon d'annonce global)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (ajoute la communauté avec un salon d'annonce spécifique)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (ajoute une équipe dans le salon d'annonce #the-kingdom-streamers)\n\n"
                    + "```"},
            {"twitchTeams", "Equipes Twitch"},
            {"typeOnce", "Gné, tu n'as besoin de taper cette partie qu'une seule fois."},
            {"uniqueChannels", "Chaînes uniques %s"},
            {"uniqueGames", "Jeux uniques %s"},
            {"updateAnnounceMessageFail", "# Quelque chose s'est mal passé et le message d'annonce n'a pas été modifié."},
            {"updateAnnounceMessageSuccess", "# Le message d'annonce a été modifié !  Il utilise maintenant le format :\n\n* %s"},
            {"updateOfflineMessageFail", "# Quelque chose s'est mal passé et le message hors-ligne n'a pas été modifié."},
            {"updateOfflineMessageSuccess", "# Le message hors-ligne a été modifié !  It utilise maintenant le format :\n\n* %s"},
            {"usePlatform", "Raté ! C'est la vieille méthode ! Utilise les commandes spécifiques aux plateformes ! Tape `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` pour plus d'infos."},
            {"watchThemHere", "Regarde le live ici : "},
            {"wrongCommand", " :thinking: Je ne connais pas cette commande."},
            {"ytgChannelNotFound", "\n# Chaîne YouTube Gaming introuvable : %s."},
            {"ytgHelp", "# YTG\n* Modifier des paramètres spécifiques à YouTube Gaming.\n"
                    + "* Notes :\n\t"
                    + "Pour ajouter des filtres de titre, vous devez IMPÉRATIVEMENT inclure les crochets.\n\t"
                    + "N'utilisez PAS l'adresse Twitch entière, ça ne marchera pas !! Utilisez simplement le nom d'affichage de la chaîne (affiché sous le live)\n\t"
                    + "Vous pouvez ajouter plusieurs chaînes et plusieurs filtres de titre en utilisant la barre verticale | entre eux.\n\t"
                    + "Seules les chaînes sont supportées, pour le moment. L'API YouTube n'affiche pas le nom de jeu qu'il faut, contrairement à dans d'autres commandes."
                    + "Il n'y a pas de filtres de jeu sur YouTube.  Voir la note sur l'API au-dessus."
                    + "La seule option requise est : nomChaine\n\n"
                    + "## Chaînes YouTube Gaming Channels\n"
                    + "Note : Ajouter un salon d'annonce et un filtre de titre est optionnel."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel nomChaine #salonAnnonce [filtreTitre]\n\n"
                    + "## Filtres de titre YouTube Gaming (Global)\n"
                    + "* NOTE : Cela affecte toutes les annonces YouTube Gaming.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg filtreTitre [mot|plusieurs mots|plus de mots] #salonAnnonce\n\n"
                    + "* Exemple :\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (ajoute une chaîne à annoncer dans un salon spécifique)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
