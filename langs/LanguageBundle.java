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
public class LanguageBundle extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Added "},
            {"addFail", "Failed to add "},
            {"addHelp", "# ADD\n* Used to add managers for your server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - The @ mention of the user to add as a manager"
                    + "\n\n## EXAMPLE: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Permission of this command have been overridden by a developer.*"},
            {"alreadyExists", "It looks like you already added that to my database. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "It seems I've already hired that user as a manager.  Find moar humanz!"},
            {"announceHelp", "# ANNOUNCE\n* Shhh...  I'm a secret...\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tThis command is only available to the developers."},
            {"beamChannelNotFound", "\n# Channel(s) not found on Beam: %s."},
            {"beamHelp", "# BEAM\n* Add and remove things that are Beam.pro related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Beam URL. It will not work!! Use only the channel name (www.beam.pro/channelName)\n\t"
                    + "You may add multiple channels, teams, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/teamName\n\n"
                    + "## Beam Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Beam Teams (Announce ALL live streams in the team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam team teamName #announcementChannel\n\n"
                    + "## Beam Game Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Beam\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Beam Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Beam\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam team outpost #outpost-streamers (adds a team with a specific announcement channel)\n\n"},
            {"botLangFail", "Something went wrong and my language is still the same."},
            {"botLangHelp", "# BOTLANG\n* Used to change the language of my responses.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang language"
                    + "\n\tEnter either the English spelling or the native spelling of the language you wish to set."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tIf you need further help with this command or others outside of what our help commands do and you wish to ask questions in a language currently associated "
                    + "with the bot please feel free to reach out to our translators in our Discord for assistance. Discord is at " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "You've successfully changed my language."},
            {"botLangUnsupported", "That language is currently not supported."},
            {"botStatistics", "%s Statistics"},
            {"broadcasterLangAllSuccess", " :ok_hand: I'll look for streams from all languages."},
            {"broadcasterLangFail", "Something went wrong and I'm still looking for all languages."},
            {"broadcasterLangSuccess", " :ok_hand: I'll only look for streams that are in that language!"},
            {"canNotRemoveOwner", "Silly human, you can't remove the server owner from the manager list. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ah, man...  Something went wrong... Better try that again."},
            {"cleanupHelp", "```Markdown\n# CLEANUP\n*  Change the way I clean up my stream announcements.\n\n## USAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone   - I won't change a thing to my announcements! (default)"
                    + "\n\tedit   - I'll edit my announcements to say \"OFFLINE\" when the streamer goes offline"
                    + "\n\tdelete - I'll just delete the announcement when the streamer is no longer live"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Sir, yes Sir!  I will delete all my announcements from now on!"},
            {"cleanupSuccessEdit", "Editing my announcements, it is."},
            {"cleanupSuccessNone", " :ok_hand: I won't do anything to my announcements."},
            {"compactFail", "Um, something went wrong.  My compact mode is unchanged."},
            {"compactHelp", "```Markdown\n# COMPACT\n* Switch my announcements to a shorter version.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Removes the large embed and only uses a short sentence."
                    + "\n\tsmallEmbed - Announces with an embed with no large banner image."
                    + "\n\tfullEmbed  - The full announcement with large banner image."
                    + "\n\tvideoEmbed - No rich embed. Announcement will be a small code block and an embedded video " +
                    "you can watch in Discord."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: You will get the full announcement from now on."},
            {"compactSmallEmbed", " :compression: You will get an announcement with a small embed from now on."},
            {"compactNoEmbed", " :compression: Your announcements will only be a short sentence from now on."},
            {"compactVideoEmbed", " :compression: You will no longer get rich embed announcements.  " +
                    "Videos will be able to be played from Discord."},
            {"configHelp", "# CONFIG\n* The base command to set my various settings. Check each specific settings help for more info.\n\n" +
                    "* defaultOfflineMessage - Returns the offline message to the default (used in edited announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Returns the announcement message to the default (used in all announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setDefaultAnnounceChannel help - Set the default announcement channel\n" +
                    "\t(Where it announces when you don't include a specific channel in the Twitch command)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "* setOfflineMessage - Set a custom offline message (used in edited announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Set a custom announcement message (used in all announcements)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"customMessageNotNull", "# The custom message can't be empty.  Sorry...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% has just gone live! Watch their stream here: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Reset my offline message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% is no longer live!  Sorry, you missed them this time."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Reset my online message to the default.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Message from the " + Const.BOT_NAME + " developers:*\n\n\t"},
            {"discordChannelNoExist", "That text channel doesn't exist on your server."},
            {"discordChannelNotNull", "# I can't find that Discord text channel. Stream will be announced in the default channel."},
            {"discordLink", "Interested in joining the Now Live Discord server? Lots of helpful people there if you're " +
                    "having problems! Click this link:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Displays the link to join the Now Live Discord server."},
            {"discordUserNoExist", "That person isn't a Discord user!  Try again!"},
            {"doesNotExist", "That was never added to my database."},
            {"embedFull", "announcement with a full size embed"},
            {"embedSmall", "announce with a small embed"},
            {"embedVideo", "announcement with a playable video"},///////////////////////////////
            {"embedNone", "announce with a just a small statement and no embed"},
            {"emptyArgs", "I think you forgot some of the command.  Check the help command for more info."},
            {"emptyCommand", "Next time you wake me up, please send a command as well."},
            {"followersEmbed", "Followers"},
            {"followersEmbedYtg", "Subscribers"},
            {"guildJoinSuccess", "Hi there!  I'm Now Live, the stream announcing bot!  Type `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` for a list of my commands.\n\nIf you need some help setting me up, come " +
                    "join my Discord at " + Const.DISCORD_URL + " and check out the how-to-setup and command-list " +
                    "channels for all the info!\n\nDon't forget to say hey!"},
            {"helpPm", "Hey there, %s! So I hear you're looking for some help? Here is a list of my commands.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Currently supported languages: English, Czech, German, French, Spanish\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# NOTIFY\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +///////////////////////
                    "# STREAMLANG\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* For more information, type: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Gives the link to the bot's patreon. Commands are :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Gives the link to our Trello which is used for bug reports and feature requests. Commands are :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```" +
                    "If you need additional help, join my Discord.  Lots of helpful people there:  " + Const.DISCORD_URL},
            {"incorrectArgs", "You passed incorrect or missing arguments to me.  Check the help command for more info."},
            {"invite", "Hey %s! Invite me to your server!\n\n\t"
                    + "**Click here:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "```Markdown\n# INVITE\n* Used to display my invite link.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvite NowLive bot to your Discord Server.```"},
            {"listHelp", "```Markdown\n# LIST\n* This command lists things from the database.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tbeamChannel      - Lists the Beam Channels you follow"
                    + "\n\tbeamTeam         - Lists the Beam Teams you follow"
                    + "\n\tgfilter          - Lists all game filters you have set up"
                    + "\n\tmanager          - Lists the managers on this server"
                    + "\n\tsetting          - Lists common bot settings"
                    + "\n\tsmashcastChannel - Lists the Twitch Channels you follow"
                    + "\n\tsmashcastGame    - List the Twitch Games that I'm tracking for you"
                    + "\n\tsmashcastTeam    - Lists the Twitch teams you follow"////////////////////////////
                    + "\n\ttfilter          - Lists all title filters you have set up"
                    + "\n\ttwitchChannel    - Lists the Twitch Channels you follow"
                    + "\n\ttwitchCommunity  - List the Twitch Communities you follow"
                    + "\n\ttwitchGame       - List the Twitch Games that I'm tracking for you"
                    + "\n\ttwitchTeam       - Lists the Twitch teams you follow"
                    + "\n\tytgChannel       - Lists the YouTube Gaming Channels you follow"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Bot Settings on Your Server" +
                    "\n* Compact mode is set to: %s." +
                    "\n* Notification is set to: %s." +
                    "\n* Cleanup is set to: %s." +
                    "\n* Broadcaster language is set to: %s." +
                    "\n* Bot language is set to: %s." +
                    "\n* Current online announcement message format is: %s." +
                    "\n* Current offline announcement message format is: %s.```"},
            {"needOneManager", "If you remove that manager, who will manage me?"},
            {"noBotManager", "It's against the Discord Bot Union By-Laws for bots to manage me. Sorry, try and find a " +
                    "suitable human for the job. :thumbsup:"},
            {"noneOnline", "Sorry %s, but there's nobody online right now that this server is following."},
            {"notAManager", "Sorry, but only my managers can do that. Type `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` for a list of people that can."},
            {"notAnAdmin", "To whom it may concern:  I am your servant, but you are not my master."},
            {"notifyEveryone", ":tada: WHOA!!  **EVERYONE** that belongs to the server will get notified when I " +
                    "announce streams!  *(Are you sure?  I don't recommend this for large servers...  It can make " +
                    "people grumpy.)*"},
            {"notifyHelp", "```Markdown\n# NOTIFY\n* Used to change the global notification option for this server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - No @ notifications of any kind (default)"
                    + "\n\there     - I will notify only those people that are online when I make the announcement"
                    + "\n\teveryone - I'll notify EVERYONE!!  Mwahahaha!!  (I don't recommend this on large servers)"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: All who are online will get a mention when I announce streams."},
            {"notifyNone", " :ok_hand: I won't mention anyone in my announcements."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Now Playing"},
            {"nowPlayingLower", " is now playing "},
            {"nowStreamingEmbed", " is now streaming!"},
            {"numUniqueMembers", "Number Unique Members"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " has gone offline!"},
            {"on", " on "},
            {"onlineStreamPm1", "Hey there!  There's currently "},
            {"onlineStreamPm2", " streamers online that you may be interested in!  Follow their links to check them " +
                    "out: \n\n"},
            {"oops", "Oops!  Something went wrong and nothing was changed!  Let's try that again."},
            {"patreon", "If you wish to donate to the bot consider using our Patreon. https://www.patreon.com/nowlive"},
            {"patreonHelp", "Gives the link to our patreon page."},
            {"ping", "When I was in China on the All-American Ping Pong team, I just loved playing ping-pong with my " +
                    "Flexolite ping pong paddle."},
            {"pingHelp", "```Markdown\n# PING\n* Used to ping me. If I am working correctly, I'll send you a pong.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Updated the announcement channel for %s to: %s."},
            {"platformAnnounceUpdateFail", "\n! Failed to change the announce channel for %s to: %s."},
            {"platformChannelAdd", "\n# Added channel(s): %s."},
            {"platformChannelAddFail", "\n# Failed to add channel(s): %s."},
            {"platformChannelAnnounce", "\n# They will be announced in: #%s."},
            {"platformChannelGameFilter", "\n# They will only be announced when they are playing: %s."},
            {"platformChannelRemove", "\n# Removed channel(s): %s."},
            {"platformChannelRemoveFail", "\n! Failed to delete channel(s): %s."},
            {"platformChannelTitleFilter", "\n# They will only be announced when these words are in the title: %s."},
            {"platformGameAdd", "\n# Added game(s): %s."},
            {"platformGameAddFail", "\n# Failed to add game(s): %s."},
            {"platformGameAnnounce", "\n# The game will announce in: #%s."},
            {"platformGameFilterAdd", "\n# Added game filter(s): %s."},
            {"platformGameFilterAddFail", "\n# Failed to add game filter(s): %s."},
            {"platformGameFilterRemove", "\n# Removed game filter(s): %s."},
            {"platformGameFilterRemoveFail", "\n# Failed to remove game filter(s): %s."},
            {"platformGameNotFound", "\n #Game(s) not found: %s."},////////////////////
            {"platformGameRemove", "\n# Removed game(s): %s."},
            {"platformGameRemoveFail", "\n# Failed to remove game(s): %s."},
            {"platformTeamAdd", "\n# Added team(s): %s."},
            {"platformTeamAddFail", "\n# Failed to add team(s): %s."},
            {"platformTeamAnnounce", "\n# The team(s) will announce in: #%s."},
            {"platformTeamNotFound", "\n# Team(s) not found: %s."},
            {"platformTeamRemove", "\n# Removed team(s): %s."},
            {"platformTeamRemoveFail", "\n# Failed to remove team(s): %s."},
            {"platformTitleFilterAdd", "\n# Added title filter(s): %s."},
            {"platformTitleFilterAddFail", "\n# Failed to add title filter(s): %s."},
            {"platformTitleFilterRemove", "\n# Removed title filter(s): %s."},
            {"platformTitleFilterRemoveFail", "\n# Failed to remove title filter(s): %s."},
            {"privateMessageReply", "I'm sorry, but the bot you are trying to reach has a voice mail box that has not " +
                    "been setup yet.  Please try your PM again later."},
            {"removed", "Removed %s %s."},
            {"removeManagerFail", "I can't remove %s because they are not in my database."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Used to remove managers from my database.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - The @ mention of the user to remove as a manager"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Servers"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Hey now, I can't announce to a channel that doesn't exists on your " +
                    "server!"},
            {"setDefaultAnnounceChannelFail", "# I can't seem to send announcements there.  Make sure I have the proper permissions " +
                    "in that channel."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Set the default announcement channel.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - The name of the channel you wish to be your default (MUST include the #)\n"
                    + "This option only applies if you have not set a specific announce channel in the Twitch command."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Default announcement channel set to: #%s."},
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
            {"shardsThis", "Shard Number"},
            {"shardsTotal", "Number Shards"},
            {"smashcastChannelNotFound", "\n# Channel(s) not found on Smashcast: %s."},/////////////////
            {"smashcastHelp", "```Markdown\n# SMASHCAST\n* Add and remove things that are Smashcast.tv related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Smashcast URL. It will not work!! Use only the channel name (www.smashcast.tv/channelName)\n\t"
                    + "You may add multiple channels, teams, games, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/teamName/gameName\n\n"
                    + "## Smashcast Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional."
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
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (adds a game to the global announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (adds a team with a specific announcement channel)\n\n"
                    + "```"},///////////////////////////////////
            {"statusHelp", "```Markdown\n# STATUS\n* Shows various statistics of the bot.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Allows you to filter streams by the language it is being broadcast " +
                    "in.  This supports the English spelling of the language, or the native spelling.  Must be a supported " +
                    "language on Twitch that is listed in the Dashboard.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* You may use either the native spelling of the language or the English spelling of the language."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Stream Title"},
            {"streamsHelp", "```Markdown\n# STREAMS\n* I'll send you a list of active streams as a PM.\n* (NOTE: You will likely " +
                    "receive several private messages using this command, depending on how many streams your Discord " +
                    "monitors!)\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Total Views"},
            {"trello", "To report bugs or to request features to be added to the bot please use our Trello. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Returns the link to the Trello for the bot"},
            {"twitchChannelNotFound", "\n# Channel(s) not found on Twitch: %s."},
            {"twitchCommunities", "Twitch Communities"},
            {"twitchCommunityAdd", "\n# Added community(s): %s."},
            {"twitchCommunityAddFail", "\n# Failed to add community(s): %s."},
            {"twitchCommunityAnnounce", "\n# The community(s) will announce in: #%s."},
            {"twitchCommunityNotFound", "\n# Community(s) not found on Twitch: %s."},
            {"twitchCommunityRemove", "\n# Removed community(s): %s."},
            {"twitchCommunityRemoveFail", "\n# Failed to remove community(s): %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Add and remove things that are Twitch.tv related.\n"
                    + "* Notes:\n\t"
                    + "To add game filters and title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full Twitch URL. It will not work!! Use only the channel name (www.twitch.tv/channelName)\n\t"
                    + "The Team name must be from the URL, not the display name of the team. (www.twitch.tv/team/teamName)\n\t"
                    + "You may add multiple channels, teams, games, communities, game and title filters by using the pipe character | between them.\n\t"
                    + "The only required options are: channelName/communityName/teamName/gameName\n\n"
                    + "## Twitch Channels\n"
                    + "Note: Adding an announcement channel, game and title filters are optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Twitch Communities (Announce ALL live streams in the community)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #announcementChannel\n\n"
                    + "## Twitch Games (Announce ALL live streams for that game)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game gameName #announcementChannel\n\n"
                    + "## Twitch Teams (Announce ALL live streams in the team)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #announcementChannel\n\n"
                    + "## Twitch Game Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Twitch Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (adds a channel to announce in a certain channel and game filters)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (adds a game to the global announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (adds the community with a specified announcement channel)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (adds a team with a specific announcement channel)\n\n"
                    + "```"},
            {"twitchTeams", "Twitch Teams"},
            {"typeOnce", "You only need to type that part once, silly."},
            {"uniqueChannels", "Unique Channels %s"},
            {"uniqueGames", "Unique Games %s"},
            {"updateAnnounceMessageFail", "# Something went wrong and the announcement message was not changed."},
            {"updateAnnounceMessageSuccess", "# You've updated the announcement message!  It now uses the format:\n\n* %s"},
            {"updateOfflineMessageFail", "# Something went wrong and the offline message was not changed."},
            {"updateOfflineMessageSuccess", "# You've updated the offline message!  It now uses the format:\n\n* %s"},
            {"usePlatform", "Oops!  That's the old way of doing things!  Use the platform specific command!  Type `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` for more info."},
            {"watchThemHere", "Watch them here: "},
            {"wrongCommand", " :thinking: I don't know that command."},
            {"ytgChannelNotFound", "\n# Channel(s) not found on YouTube Gaming: %s."},
            {"ytgHelp", "# YTG\n* Add and remove things that are YouTube Gaming channels.\n"
                    + "* Notes:\n\t"
                    + "To add title filters, you MUST include the brackets.\n\t"
                    + "Do NOT use the full YouTube Gaming URL. It will not work!! Only use the channel's display name (as shows under their live stream)\n\t"
                    + "You may add multiple channels and title filters by using the pipe character | between them.\n\t"
                    + "Only channels are supported for now.  The YouTube API does not show the proper game name to be used like in other commands."
                    + "Game filters are NOT a thing with YouTube.  See the above note about the API."
                    + "The only required option is: channelName\n\n"
                    + "## YouTube Gaming Channels\n"
                    + "Note: Adding an announcement channel and title filters are optional."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## YouTube Gaming Title Filters (Global)\n"
                    + "* NOTE: This affects all stream announcements for YouTube Gaming\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (adds a channel to announce in a certain channel)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
