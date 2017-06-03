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
            {"added", "Thêm "},
            {"addFail", "Không thể thêm "},
            {"addHelp", "# ADD\n* Được sử dụng để thêm người quản lý cho máy chủ của bạn.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <option> <content>"
                    + "\n\t<option> <content>"
                    + "\n\tmanager - Đề cập đến của người sử dụng để thêm như là một người quản lý"
                    + "\n\n## EXAMPLE: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Sự cho phép của lệnh này đã bị ghi đè bởi một nhà phát triển.*"},
            {"alreadyExists", "Dường như bạn đã thêm vào cơ sở dữ liệu của tôi. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Có vẻ như tôi đã thuê người dùng đó làm người quản lý. Tìm moar humanz!"},
            {"announceHelp", "# ANNOUNCE\n* Shhh...  Tôi là một bí mật...\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tLệnh này chỉ có sẵn cho các nhà phát triển."},
            {"mixerChannelNotFound", "\n# (Các) kênh không tìm thấy trên Máy trộn: %s."},
            {"mixerHelp", "# MIXER\n* Thêm và xóa những thứ có liên quan đến Mixer.com.\n"
                    + "* Ghi chú:\n\t"
                    + "Để thêm bộ lọc trò chơi và bộ lọc tiêu đề, bạn PHẢI bao gồm dấu ngoặc đơn.\n\t"
                    + "KHÔNG sử dụng URL của Trình trộn đầy đủ. Nó sẽ không làm việc!! Chỉ sử dụng tên kênh (www.mixer.com/channelName)\n\t"
                    + "Bạn có thể thêm nhiều kênh, đội, trò chơi và tiêu đề bộ lọc bằng cách sử dụng các ký tự đường ống | giữa họ.\n\t"
                    + "Các tùy chọn được yêu cầu duy nhất là: channelName/teamName\n\u200B\n"
                    + "## Mixer Kênh\n"
                    + "chú thích: Thêm kênh thông báo, bộ lọc trò chơi và tiêu đề là tùy chọn.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel kênhName #Kênh thông báo {gameFilters} [titleFilters]\n\n"
                    + "## Nhóm Mixer (Thông báo TẤT CẢ các dòng trực tiếp trong nhóm)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team Tên nhóm #Kênh thông báo\n\n"
                    + "## Bộ lọc trò chơi trộn (toàn cầu)\n"
                    + "* LƯU Ý: Điều này ảnh hưởng đến tất cả các thông báo luồng cho Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer gfilter {tên của trò chơi|tên của trò chơi} #Kênh thông báo\n\n"
                    + "## Bộ lọc tiêu đề của Mixer (Toàn cầu)\n"
                    + "* LƯU Ý: Điều này ảnh hưởng đến tất cả các thông báo luồng cho Mixer\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer tfilter [Từ|Những từ khác|nhiều từ ngữ hơn] #Kênh thông báo\n\n"
                    + "## Mixer Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " mixer stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Thêm kênh để thông báo trong kênh và bộ lọc trò chơi nhất định)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " mixer team outpost #outpost-streamers (Thêm một nhóm với một kênh thông báo cụ thể)\n\n"},
            {"botLangFail", "Đã xảy ra lỗi và ngôn ngữ của tôi vẫn như cũ."},
            {"botLangHelp", "# BOTLANG\n* Được sử dụng để thay đổi ngôn ngữ của câu trả lời của tôi.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " Ngôn ngữ botlang"
                    + "\n\tNếu có chính tả tiếng Anh hoặc cách đánh vần bản xứ của ngôn ngữ mà bạn muốn thiết lập."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tIf Bạn cần trợ giúp thêm với lệnh này hoặc những người khác bên ngoài những gì mà lệnh giúp đỡ của chúng tôi làm và bạn muốn đặt các câu hỏi bằng một ngôn ngữ hiện đang được liên kết "
                    + "Với bot xin vui lòng liên hệ với các dịch giả của chúng tôi trong Discord của chúng tôi để được hỗ trợ. Bất đồng ở " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Bạn đã thay đổi thành công ngôn ngữ của mình."},
            {"botLangUnsupported", "Ngôn ngữ đó hiện không được hỗ trợ."},
            {"botStatistics", "%s Statistics"},
            {"broadcasterLangAllSuccess", " :ok_hand: Tôi sẽ tìm kiếm các luồng từ tất cả các ngôn ngữ."},
            {"broadcasterLangFail", "Đã xảy ra lỗi và tôi vẫn đang tìm kiếm tất cả ngôn ngữ."},
            {"broadcasterLangSuccess", " :ok_hand: Tôi sẽ chỉ tìm kiếm các luồng trong ngôn ngữ đó!"},
            {"canNotRemoveOwner", "Nhân loại ngớ ngẩn, bạn không thể xóa chủ sở hữu máy chủ khỏi danh sách người quản lý. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Ah, người đàn ông ... Có chuyện gì đó đã xảy ra ... Tốt hơn nữa hãy thử lại lần nữa."},
            {"cleanupHelp", "# CLEANUP\n*  Thay đổi cách tôi làm sạch thông báo luồng của tôi.\n\n## USAGE:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <option>"
                    + "\n\tnone   - Tôi sẽ không thay đổi một điều để thông báo của tôi! (mặc định)"
                    + "\n\tedit   - Tôi sẽ chỉnh sửa thông báo của mình để nói \"OFFLINE\" khi trình lên sóng ngoại tuyến"
                    + "\n\tdelete - Tôi sẽ chỉ xóa thông báo khi streamer không còn sống nữa"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit"},
            {"cleanupSuccessDelete", "Vâng thưa ngài! Tôi sẽ xóa mọi thông báo của tôi từ bây giờ!"},
            {"cleanupSuccessEdit", "Chỉnh sửa thông báo của tôi, đó là."},
            {"cleanupSuccessNone", " :ok_hand: Tôi sẽ không làm bất cứ điều gì để thông báo của tôi."},
            {"compactFail", "Um, có gì đó sai trái. Chế độ nhỏ gọn của tôi không thay đổi."},
            {"compactHelp", "# COMPACT\n* Chuyển các thông báo của tôi sang một phiên bản ngắn hơn.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <option>"
                    + "\n\tnoEmbed    - Loại bỏ nhúng lớn và chỉ sử dụng một câu ngắn."
                    + "\n\tsmallEmbed - Thông báo với nhúng không có hình ảnh biểu ngữ lớn."
                    + "\n\tfullEmbed  - Thông báo đầy đủ với hình ảnh biểu ngữ lớn."
                    + "\n\tvideoEmbed - No rich embed. Announcement will be a small code block and an embedded video " +
                    "you can watch in Discord."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed"},
            {"compactFullEmbed", " :compression: Bạn sẽ nhận được thông báo đầy đủ từ bây giờ."},
            {"compactSmallEmbed", " :compression: Bạn sẽ nhận được một thông báo với một nhúng nhỏ từ bây giờ."},
            {"compactNoEmbed", " :compression: Thông báo của bạn sẽ chỉ là một câu ngắn từ bây giờ."},
            {"compactVideoEmbed", " :compression: You will no longer get rich embed announcements.  " +
                    "Videos will be able to be played from Discord."},
            {"configHelp", "# CONFIG\n* The base command to set my various settings. Check each specific settings help for more info.\n\n" +
                    "# checkPerms\n\tCheck the permissions the bot needs in a particular text channel (#discordChannel is optional)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config checkPerms #discordChannel\n" +
                    "# defaultOfflineMessage\n\Trả lại thư ngoại tuyến thành mặc định (được sử dụng trong thông báo được chỉnh sửa)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "# defaultOnlineMessage\n\Trả lại thông báo thông báo về mặc định (được sử dụng trong tất cả các thông báo)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "# setDefaultAnnounceChannel\n\Đặt kênh thông báo mặc định\n\t" +
                    "(Trường hợp nó thông báo khi bạn không bao gồm một kênh Discord cụ thể khi thêm các luồng)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "# setOfflineMessage\n\Đặt một tin nhắn ngoại tuyến tùy chỉnh (được sử dụng trong thông báo được chỉnh sửa)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "# setOnlineMessage\n\Đặt một thông báo thông báo tùy chỉnh (sử dụng trong tất cả các thông báo)\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help\n" +
                    "# notify\n\Được sử dụng để thay đổi tùy chọn thông báo toàn cầu cho máy chủ này.\n*\t" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config notify help"},
            {"customMessageNotNull", "# The custom message can't be empty.  Sorry...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "%CHANNEL% Đã ra đi! Xem luồng của họ ở đây: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Đặt lại tin nhắn ngoại tuyến của tôi về mặc định.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "%CHANNEL% Không còn sống nữa! Xin lỗi, bạn đã nhớ họ lần này."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Đặt lại tin nhắn trực tuyến của tôi về mặc định.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Message from the " + Const.BOT_NAME + " developers:*\n\n\t"},
            {"discordChannelNoExist", "Đặt lại các tin nhắn trực tuyến về cài đặt mặc định."},
            {"discordChannelNotNull", "# Tôi không thể tìm thấy kênh văn bản Discord. Luồng sẽ được công bố trong kênh mặc định."},
            {"discordLink", "Interested in joining the Now Live Discord server? Lots of helpful people there if you're " +
                    "Có vấn đề! Nhấp vào liên kết này:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "# Hiển thị liên kết để tham gia máy chủ Không xác thực trực tuyến."},
            {"discordUserNoExist", "Người đó không phải là người sử dụng Bất hòa! Thử lại!"},
            {"doesNotExist", "Điều đó không bao giờ được thêm vào cơ sở dữ liệu của tôi."},
            {"embedFull", "Thông báo với nhúng kích thước đầy đủ"},
            {"embedSmall", "Thông báo với một nhúng nhỏ"},
            {"embedVideo", "Thông báo với một video có thể phát"},
            {"embedNone", "Công bố chỉ với một tuyên bố nhỏ và không nhúng"},
            {"emptyArgs", "Tôi nghĩ rằng bạn quên một số lệnh. Kiểm tra lệnh trợ giúp để biết thêm thông tin."},
            {"emptyCommand", "Lần tiếp theo bạn đánh thức tôi, hãy gửi một lệnh."},
            {"followersEmbed", "Người theo dõi"},
            {"followersEmbedYtg", "Người đăng ký"},
            {"guildJoinSuccess", "Hi there! Tôi đang sống, dòng suối thông báo về bot! Kiểu`" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` để biết danh sách các lệnh của tôi.\n\n" +
                    "Nếu bạn thích tôi nói bằng một ngôn ngữ khác, bạn nên gõ `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " botlang help` để biết thêm thông tin về các ngôn ngữ hiện có của tôi.\n\n" +
                    "Nếu bạn cần giúp đỡ tôi, hãy tham gia sự bất hòa của tôi tại " +
                    Const.DISCORD_URL +
                    " Và kiểm tra các cách để thiết lập và danh sách các lệnh kênh cho tất cả các thông tin!\n\n" +
                    "Đừng quên nói hey!"},
            {"helpPm", "* Hey there, %s! Vì vậy, tôi nghe bạn đang tìm kiếm một số trợ giúp? Dưới đây là danh sách các lệnh của tôi.\n\n" +
                    "# ADD\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# MIXER\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " mixer help\n\n" +
                    "# BOTLANG\n" +
                    "* Các ngôn ngữ được hỗ trợ hiện nay: tiếng Anh, tiếng Séc, tiếng Đức, tiếng Pháp, tiếng Tây Ban Nha\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# PICARTO\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " picarto help\n\u200B\n" +
                    "# PING\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Để biết thêm thông tin, gõ: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Cung cấp liên kết tới patreon của bot. Lệnh là :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Cung cấp liên kết đến Trello của chúng tôi được sử dụng cho báo cáo lỗi và yêu cầu tính năng. Lệnh là :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request\n" +
                    "Nếu bạn cần trợ giúp thêm, tham gia sự bất hòa của tôi. Rất nhiều người có ích ở đó:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Bạn đã vượt qua các đối số không chính xác hoặc thiếu đối với tôi. Kiểm tra lệnh trợ giúp để biết thêm thông tin."},
            {"invite", "Hey %s! Mời tôi vào máy chủ của bạn!\n\n\t"
                    + "**Bấm vào đây:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "# INVITE\n* Được sử dụng để hiển thị liên kết lời mời của tôi.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tInvite NowLive bot vào máy chủ Discord của bạn."},
            {"listHelp", "# LIST\n* Lệnh này liệt kê những thứ từ cơ sở dữ liệu.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tmixerChannel     - Liệt kê các kênh Mixer bạn theo dõi"
                    + "\n\tmixerTeam        - Liệt kê các nhóm Mixer bạn theo dõi"
                    + "\n\tgfilter          - Liệt kê tất cả bộ lọc trò chơi mà bạn đã thiết lập"
                    + "\n\tmanager          - Liệt kê các nhà quản lý trên máy chủ này"
                    + "\n\tpicartoChannel   - Liệt kê các Kênh Picarto bạn theo dõi"
                    + "\n\tsetting          - Liệt kê các cài đặt bot phổ biến"
                    + "\n\tsmashcastChannel - Liệt kê các Kênh Smashcast mà bạn theo dõi"
                    + "\n\tsmashcastGame    - Liệt kê các trò chơi Smashcast mà tôi đang theo dõi cho bạn"
                    + "\n\tsmashcastTeam    - Liệt kê các nhóm Smashcast bạn theo dõi"
                    + "\n\ttfilter          - Liệt kê tất cả các bộ lọc tiêu đề mà bạn đã thiết lập"
                    + "\n\ttwitchChannel    - Liệt kê các kênh Twitch mà bạn theo dõi"
                    + "\n\ttwitchCommunity  - Liệt kê Cộng đồng Twitch mà bạn theo dõi"
                    + "\n\ttwitchGame       - Liệt kê các trò chơi Twitch mà tôi đang theo dõi cho bạn"
                    + "\n\ttwitchTeam       - Liệt kê các đội Twitch bạn theo dõi"
                    + "\n\tytgChannel       - Liệt kê Kênh Trò chơi YouTube bạn theo dõi"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel"},
            {"listSettings", "# Bot Settings on Your Server" +
                    "\n* Ngôn ngữ của Bot được đặt thành: %s." +
                    "\n* Ngôn ngữ phát thanh được đặt thành: %s." +
                    "\n* Cleanup được đặt thành: %s." +
                    "\n* Chế độ nhỏ gọn được đặt thành: %s." +
                    "\n* Định dạng thông báo tin tức trực tuyến hiện tại là: %s." +
                    "\n* Định dạng tin nhắn thông báo hiện tại không trực tuyến là: %s." +
                    "\n* Kênh thông báo mặc định là: %s" +
                    "\n* Thông báo được đặt thành: %s."},
            {"needOneManager", "Nếu bạn gỡ bỏ người quản lý đó, ai sẽ quản lý tôi?"},
            {"noBotManager", "Đó là chống lại các Điều khoản bổ sung của Tổ chức Bot Chiếm dụng để quản lý tôi. Xin lỗi, hãy thử và tìm một " +
                    "Con người thích hợp cho công việc. :thumbsup:"},
            {"noneOnline", "Lấy làm tiếc %s, Nhưng hiện tại không có ai trực tuyến mà máy chủ này đang theo dõi."},
            {"notAManager", "Xin lỗi, nhưng chỉ có các nhà quản lý mới có thể làm được. Kiểu `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " List manager` để biết danh sách những người có thể."},
            {"notAnAdmin", "Đối với ai mà nó quan tâm: Tôi là đầy tớ của bạn, nhưng bạn không phải là chủ của tôi."},
            {"notifyEveryone", ":tada: WHOA!!  **EVERYONE** Đó thuộc về máy chủ sẽ được thông báo khi tôi " +
                    "Công bố luồng! *(Bạn có chắc không? Tôi không khuyên bạn nên điều này cho các máy chủ lớn ... Nó có thể làm cho " +
                    "Mọi người khó chịu.)*"},
            {"notifyDeprecated", "# -nl notify Không được sử dụng nữa. Vui lòng sử dụng: -nl config notify"},
            {"notifyHelp", "# NOTIFY\n* Được sử dụng để thay đổi tùy chọn thông báo toàn cầu cho máy chủ này.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " config notify <option>"
                    + "\n\tnone     - Thông báo No @ bất kỳ loại nào (mặc định)"
                    + "\n\there     - Tôi sẽ chỉ thông báo cho những người trực tuyến khi tôi thông báo"
                    + "\n\teveryone - Tôi sẽ thông báo cho mọi người! Mwahahaha !! (Tôi không đề nghị này trên các máy chủ lớn)"
                    + "\n\t@<role>  - Tôi sẽ gửi một @ đề cập đến cho vai trò của sự lựa chọn của bạn"
                    + "\n\t@<user>  - Bạn muốn thông báo cho một người dùng? Đây là sự lựa chọn cho bạn!"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config notify everyone"},
            {"notifyHere", " :bellhop_bell: Tất cả những người trực tuyến sẽ nhận được đề cập đến khi tôi thông báo các luồng."},
            {"notifyRoleUser", "# Tôi sẽ @ đề cập đến %s Với mọi thông báo"},
            {"notifyTooMany", "# Bạn chỉ có thể thông báo cho một %s tại một thời điểm!"},
            {"notifyMultipleUsers", " Nếu bạn muốn thông báo cho nhiều người dùng, hãy tạo một vai trò và thông báo nó."},
            {"notifyNone", " :ok_hand: Tôi sẽ không đề cập đến bất cứ ai trong các thông báo của tôi."},
            {"nowLive", "NOW LIVE!\n"},
            {"nowPlayingEmbed", "Đang chơi"},
            {"nowPlayingLower", " Đang chơi "},
            {"nowStreamingEmbed", " Hiện đang phát trực tuyến!"},
            {"numUniqueMembers", "Số thành viên duy nhất"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " Đã đi offline!"},
            {"on", " on "},
            {"onlineStreamPm1", "Hey there!  Hiện tại có "},
            {"onlineStreamPm2", " Streamers trực tuyến mà bạn có thể quan tâm! Theo dõi liên kết của họ để kiểm tra " +
                    "ngoài: \n\n"},
            {"oops", "Oops!  Đã xảy ra lỗi và không có gì thay đổi! Hãy thử lại lần nữa."},
            {"patreon", "Nếu bạn muốn tặng cho bot xem xét sử dụng Patreon của chúng tôi. https://www.patreon.com/nowlive"},
            {"patreonHelp", "# Cung cấp liên kết tới trang patreon của chúng tôi."},
            {"picartoChannelNotFound", "\n# (Các) kênh không tìm thấy trên Picarto: %s."},
            {"picartoHelp", "# PICARTO\n* Thêm và xóa những thứ là các kênh Picarto.\n"
                    + "* Notes:\n\t"
                    + "To add title filters, you MUST include the brackets.\n\t"
                    + "KHÔNG sử dụng URL Picarto đầy đủ. Nó sẽ không làm việc!! Chỉ sử dụng tên kênh (phần sau picarto.tv)\n\t"
                    + "Bạn có thể thêm nhiều kênh và các tiêu đề bộ lọc bằng cách sử dụng các ký tự đường ống | giữa họ.\n\t"
                    + "Chỉ bây giờ các kênh được hỗ trợ. Danh mục Picarto rất hạn chế và hầu hết đều được nhóm lại trong một số ít được chọn.\n\t"
                    + "Tùy chọn chỉ được yêu cầu là: channelName\n\u200B\n"
                    + "## Picarto Channels\n"
                    + "Note: Thêm kênh thông báo và bộ lọc tiêu đề là tùy chọn.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## Picarto Title Filters (Global)\n"
                    + "* LƯU Ý: Điều này ảnh hưởng đến tất cả các thông báo luồng cho Picarto\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Picarto Stream Stats\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " picarto stats\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " picarto channel AgueMort #live-streams (Thêm một kênh để thông báo trong một kênh nhất định)\n\t"},
            {"ping", "Khi tôi ở Trung Quốc trên đội Ping Pong toàn Mỹ, tôi chỉ thích chơi ping-pong với tôi " +
                    "Bóng chày Flexolite."},
            {"pingHelp", "```Markdown\n# PING\n* Được sử dụng để ping tôi. Nếu tôi làm việc đúng, tôi sẽ gửi cho bạn một bàn.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Đã cập nhật kênh thông báo cho %s đến: %s."},
            {"platformAnnounceUpdateFail", "\n! Không thể thay đổi kênh thông báo cho %s đến: %s."},
            {"platformChannelAdd", "\n# (Các) kênh bổ sung: %s."},
            {"platformChannelAddFail", "\n# Không thể thêm (các) kênh: %s."},
            {"platformChannelAnnounce", "\n# Họ sẽ được công bố trong: #%s."},
            {"platformChannelGameFilter", "\n# Họ sẽ chỉ được thông báo khi họ chơi: %s."},
            {"platformChannelRemove", "\n# (Các) kênh bị loại bỏ: %s."},
            {"platformChannelRemoveFail", "\n! Không thể xóa (các) kênh: %s."},
            {"platformChannelTitleFilter", "\n# Họ sẽ chỉ được thông báo khi những từ này có trong tiêu đề: %s."},
            {"platformGameAdd", "\n# Trò chơi đã được thêm: %s."},
            {"platformGameAddFail", "\n# Không thể thêm (các) trò chơi: %s."},
            {"platformGameAnnounce", "\n# Trò chơi sẽ thông báo trong: #%s."},
            {"platformGameFilterAdd", "\n# Đã thêm (các) bộ lọc trò chơi: %s."},
            {"platformGameFilterAddFail", "\n# Không thể thêm (các) bộ lọc trò chơi: %s."},
            {"platformGameFilterRemove", "\n# Đã xóa (các) bộ lọc trò chơi: %s."},
            {"platformGameFilterRemoveFail", "\n# Không thể xóa (các) bộ lọc trò chơi: %s."},
            {"platformGameNotFound", "\n #Game không được tìm thấy: %s."},
            {"platformGameRemove", "\n# Trò chơi đã bị loại bỏ: %s."},
            {"platformGameRemoveFail", "\n# Không thể xóa (các) trò chơi: %s."},
            {"platformTeamAdd", "\n# Thêm (các) nhóm: %s."},
            {"platformTeamAddFail", "\n# Không thể thêm (các) nhóm: %s."},
            {"platformTeamAnnounce", "\n# Nhóm sẽ thông báo trong: #%s."},
            {"platformTeamNotFound", "\n# Nhóm không tìm thấy: %s."},
            {"platformTeamRemove", "\n# (Các) nhóm đã bị loại bỏ: %s."},
            {"platformTeamRemoveFail", "\n# Không thể xóa (các) nhóm: %s."},
            {"platformTitleFilterAdd", "\n# Đã thêm (các) bộ lọc Tiêu đề: %s."},
            {"platformTitleFilterAddFail", "\n# Không thể thêm (các) bộ lọc Tiêu đề: %s."},
            {"platformTitleFilterRemove", "\n# Đã xóa (các) bộ lọc tiêu đề: %s."},
            {"platformTitleFilterRemoveFail", "\n# Không thể xóa (các) bộ lọc tiêu đề: %s."},
            {"privateMessageReply", "Tôi xin lỗi, nhưng bot mà bạn đang cố gắng truy cập có một hộp thư thoại không có " +
                    "Được thiết lập được nêu ra. Vui lòng thử lại PM của bạn sau."},
            {"removed", "Removed %s %s."},
            {"removeManagerFail", "Tôi không thể xóa %s Bởi vì chúng không có trong cơ sở dữ liệu của tôi."},
            {"removeHelp", "# REMOVE\n* Được sử dụng để xóa người quản lý khỏi cơ sở dữ liệu của tôi.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @userName"
                    + "\n\tmanager - Các @ đề cập đến của người sử dụng để loại bỏ như là một người quản lý"
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort"},
            {"servers", "Servers"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Bây giờ, tôi không thể thông báo cho một kênh không tồn tại trên " +
                    "Máy chủ!"},
            {"setDefaultAnnounceChannelFail", "# Tôi dường như không thể gửi thông báo ở đó. Hãy chắc chắn rằng tôi có quyền thích hợp " +
                    "Trong kênh đó."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Đặt kênh thông báo mặc định.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <channel>\n\t"
                    + "<channel> - Tên của kênh mà bạn muốn là mặc định (PHẢI bao gồm #)\n"
                    + "Tùy chọn này chỉ áp dụng nếu bạn chưa thiết lập kênh thông báo cụ thể trong lệnh Twitch."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Kênh thông báo mặc định được đặt thành: #%s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Đặt một tin nhắn ngoại tuyến tùy chỉnh cho các thông báo đã được chỉnh sửa ngoại tuyến.\n\n" +
                    "## Có thẻ để sử dụng trong thư của bạn:\n" +
                    "\t* %CHANNEL%   - Tên của kênh\n" +
                    "\t* %FOLLOWERS% - Tổng số người theo dõi\n" +
                    "\t* %GAME%      - Tên của trò chơi đang được phát trực tuyến\n" +
                    "\t* %STATUS%    - Trạng thái (tiêu đề) của luồng\n" +
                    "\t* %URL%       - URL cho luồng\n" +
                    "\t* %USER%      - Tên của kênh\n" +
                    "\t* %VIEWERS%   - Số người xem hiện tại\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "%CHANNEL% Không còn sống nữa! Xin lỗi, bạn đã nhớ họ lần này."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Đặt một thông báo thông báo tùy chỉnh.\n\n" +
                    "## Có thẻ để sử dụng trong thư của bạn:\n" +
                    "\t* %CHANNEL%   - Tên của kênh\n" +
                    "\t* %FOLLOWERS% - Tổng số người theo dõi\n" +
                    "\t* %GAME%      - Tên của trò chơi đang được phát trực tuyến\n" +
                    "\t* %STATUS%    - Trạng thái (tiêu đề) của luồng\n" +
                    "\t* %URL%       - URL cho luồng\n" +
                    "\t* %USER%      - Tên của kênh\n" +
                    "\t* %VIEWERS%   - Số người xem hiện tại\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "%CHANNEL% Đã ra đi! Xem luồng của họ ở đây: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Số Shard"},
            {"shardsTotal", "Số Shards"},
            {"smashcastChannelNotFound", "\n# Không tìm thấy kênh trên Smashcast: %s."},/////////////////
            {"smashcastHelp", "# SMASHCAST\n* Thêm và xóa những thứ liên quan đến Smashcast.tv.\n"
                    + "* Notes:\n\t"
                    + "Để thêm bộ lọc trò chơi và bộ lọc tiêu đề, bạn PHẢI bao gồm dấu ngoặc.\n\t"
                    + "KHÔNG sử dụng URL Smashcast đầy đủ. Nó sẽ không làm việc!! Chỉ sử dụng tên kênh (www.smashcast.tv/channelName)\n\t"
                    + "Bạn có thể thêm nhiều kênh, đội, trò chơi, trò chơi và các tiêu đề bộ lọc bằng cách sử dụng các ký tự đường ống | giữa họ.\n\t"
                    + "Các lựa chọn chỉ được yêu cầu là: channelName/teamName/gameName\n\u200B\n"
                    + "## Smashcast Channels\n"
                    + "Lưu ý: Thêm kênh thông báo, bộ lọc trò chơi và tiêu đề là tùy chọn.\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Trò chơi Smashcast (Thông báo TẤT CẢ các luồng trực tiếp cho trò chơi đó)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game gameName #announcementChannel\n\n"
                    + "## Nhóm Smashcast (Thông báo TẤT CẢ các dòng trực tiếp trong nhóm)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team teamName #announcementChannel\n\n"
                    + "## Bộ lọc Trò chơi Smashcast (Toàn cầu)\n"
                    + "* Chú ý: Điều này ảnh hưởng đến tất cả các thông báo dòng cho Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Bộ lọc tiêu đề Smashcast (Toàn cầu)\n"
                    + "* Chú ý: Điều này ảnh hưởng đến tất cả các thông báo dòng cho Smashcast\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Thống kê Strashcast Stream\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Thêm kênh để thông báo trong kênh và bộ lọc trò chơi nhất định)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (Thêm một trò chơi vào kênh thông báo toàn cầu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (Thêm một nhóm với một kênh thông báo cụ thể)"},
            {"staffOverride", "*Sự cho phép của lệnh này đã bị ghi đè bởi một thành viên của nhân viên bot.*"},
            {"statusHelp", "# STATUS\n* Shows various statistics of the bot.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status"},
            {"streamlangHelp", "# STREAMLANG\n* Cho phép bạn lọc các luồng theo ngôn ngữ mà nó đang được phát sóng " +
                    "In Điều này hỗ trợ việc đánh vần tiếng Anh của ngôn ngữ, hoặc cách đánh vần bản xứ. Phải là một " +
                    "Ngôn ngữ trên Twitch được liệt kê trong Bảng điều khiển.\n\n## USAGE: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <language>\n" +
                    "* Bạn có thể sử dụng một trong hai cách đánh vần tự nhiên của ngôn ngữ hoặc chính tả bằng tiếng Anh."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german"},
            {"streamTitleEmbed", "Tiêu đề dòng"},
            {"streamsHelp", "# STREAMS\n* Tôi sẽ gửi cho bạn một danh sách các luồng hoạt động như là một PM.\n* (NOTE: You will likely " +
                    "Nhận được một số tin nhắn riêng bằng cách sử dụng lệnh này, tùy thuộc vào bao nhiêu dòng Discord của bạn " +
                    "Màn hình!)\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " dòng"},
            {"totalViewsEmbed", "Tổng số lần xem"},
            {"trello", "Để báo cáo lỗi hoặc yêu cầu các tính năng sẽ được thêm vào bot, vui lòng sử dụng Trello của chúng tôi. " +
                    "https://trello.com/invite/b/kcWshbIU/a94c145e598be9f8dd734197ba07288e/now-live-bot"},
            {"trelloHelp", "# Trả về liên kết tới Trello cho bot"},
            {"twitchChannelNotFound", "\n# (Các) kênh không tìm thấy trên Twitch: %s."},
            {"twitchCommunities", "Cộng đồng Twitch"},
            {"twitchCommunityAdd", "\n# Cộng cộng đồng(s): %s."},
            {"twitchCommunityAddFail", "\n# Không thể thêm (các) cộng đồng: %s."},
            {"twitchCommunityAnnounce", "\n# (Các) cộng đồng sẽ thông báo trong: #%s."},
            {"twitchCommunityNotFound", "\n# Cộng đồng không tìm thấy trên Twitch: %s."},
            {"twitchCommunityRemove", "\n# (Các) cộng đồng bị loại bỏ: %s."},
            {"twitchCommunityRemoveFail", "\n# Không thể xóa (các) cộng đồng: %s."},
            {"twitchHelp", "# TWITCH\n* Thêm và xóa những thứ có liên quan đến Twitch.tv.\n"
                    + "* Notes:\n\t"
                    + "Để thêm bộ lọc trò chơi và bộ lọc tiêu đề, bạn PHẢI bao gồm dấu ngoặc.\n\t"
                    + "KHÔNG sử dụng URL Twitch đầy đủ. Nó sẽ không làm việc!! Chỉ sử dụng tên kênh (www.twitch.tv/channelName)\n\t"
                    + "Tên Nhóm phải từ URL, chứ không phải tên hiển thị của nhóm. (www.twitch.tv/team/teamName)\n\t"
                    + "Bạn có thể thêm nhiều kênh, nhóm, trò chơi, cộng đồng, bộ lọc trò chơi và tiêu đề bằng cách sử dụng ký tự đường ống | giữa họ.\n\t"
                    + "Các lựa chọn chỉ được yêu cầu là: channelName/communityName/teamName/gameName\n\u200B\n"
                    + "## Kênh twitch\n"
                    + "Lưu ý: Thêm kênh thông báo, bộ lọc trò chơi và tiêu đề là tùy chọn."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel channelName #announcementChannel {gameFilters} [titleFilters]\n\n"
                    + "## Cộng đồng Twitch (Thông báo TẤT CẢ các tuyến sống trong cộng đồng)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community communityName #announcementChannel\n\n"
                    + "## Trò chơi Twitch (Thông báo TẤT CẢ các tuyến sống cho trò chơi đó)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game gameName #announcementChannel\n\n"
                    + "## Các đội Twitch (Thông báo TẤT CẢ các dòng trực tuyến trong nhóm)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team teamName #announcementChannel\n\n"
                    + "## Bộ lọc trò chơi Twitch (Toàn cầu)\n"
                    + "* Chú ý: Điều này ảnh hưởng đến tất cả các thông báo dòng cho Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {gameName|gameName} #announcementChannel\n\n"
                    + "## Bộ lọc tiêu đề Twitch (Toàn cầu)\n"
                    + "* Chú ý: Điều này ảnh hưởng đến tất cả các thông báo dòng cho Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Thống kê Stream Twitch\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch stats\n\n"
                    + "* Examples:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (Thêm kênh để thông báo trong kênh và bộ lọc trò chơi nhất định)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (Thêm một trò chơi vào kênh thông báo toàn cầu)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (Thêm cộng đồng với một kênh thông báo đã chỉ định)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (Thêm một nhóm với một kênh thông báo cụ thể)"},
            {"twitchTeams", "Các đội Twitch"},
            {"typeOnce", "Bạn chỉ cần gõ đoạn đó một lần, ngớ ngẩn."},
            {"uniqueChannels", "Kênh duy nhất %s"},
            {"uniqueGames", "Trò chơi độc đáo %s"},
            {"updateAnnounceMessageFail", "# Đã xảy ra sự cố và thông báo tuyên bố không thay đổi."},
            {"updateAnnounceMessageSuccess", "# Bạn đã cập nhật thông báo! Nó bây giờ sử dụng định dạng:\n\n* %s"},
            {"updateOfflineMessageFail", "# Đã xảy ra sự cố và thông báo ngoại tuyến không thay đổi."},
            {"updateOfflineMessageSuccess", "# Bạn đã cập nhật tin nhắn offline! Nó bây giờ sử dụng định dạng:\n\n* %s"},
            {"usePlatform", "Oops!  Đó là cách làm việc cũ! Sử dụng lệnh nền tảng cụ thể! Kiểu `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " Giúp đỡ` để biết thêm thông tin."},
            {"watchThemHere", "Xem chúng ở đây: "},
            {"wrongCommand", " :thinking: Tôi không biết lệnh đó."},
            {"ytgChannelNotFound", "\n# (Các) kênh không tìm thấy trên Trò chơi trên YouTube: %s."},
            {"ytgHelp", "# YTG\n* Thêm và xóa những thứ là các kênh Trò chơi trên YouTube.\n"
                    + "* Notes:\n\t"
                    + "Để thêm bộ lọc tiêu đề, bạn PHẢI bao gồm dấu ngoặc.\n\t"
                    + "KHÔNG sử dụng URL của YouTube Gaming đầy đủ. Nó sẽ không làm việc!! Chỉ sử dụng tên hiển thị của kênh (như hiển thị dưới luồng trực tuyến của họ)\n\t"
                    + "Bạn có thể thêm nhiều kênh và các tiêu đề bộ lọc bằng cách sử dụng các ký tự đường ống | giữa họ.\n\t"
                    + "Chỉ bây giờ các kênh được hỗ trợ. API YouTube không hiển thị đúng tên trò chơi sẽ được sử dụng như trong các lệnh khác.\n\t"
                    + "Bộ lọc trò chơi KHÔNG phải là một điều với YouTube. Xem lưu ý ở trên về API.\n\u200B\n"
                    + "Tùy chọn chỉ được yêu cầu là: channelName\n\n"
                    + "## Kênh trò chơi trên YouTube\n"
                    + "Lưu ý: Thêm kênh thông báo và bộ lọc tiêu đề là tùy chọn."
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel channelName #announcementChannel [titleFilters]\n\n"
                    + "## Bộ lọc tiêu đề trên YouTube (Toàn cầu)\n"
                    + "* LƯU Ý: Điều này ảnh hưởng đến tất cả các thông báo về luồng cho YouTube Gaming\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [word|different words|more words] #announcementChannel\n\n"
                    + "## Số liệu thống kê trên YouTube về luồng chơi\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg stats\n\n"
                    + "* Example:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (Thêm một kênh để thông báo trong một kênh nhất định)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
