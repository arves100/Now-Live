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
public class LanguageBundle_el extends ListResourceBundle {

    private Object[][] contents = {
            {"added", "Προστέθηκε "},
            {"addFail", "Αποτυχία προσθήκης "},
            {"addHelp", "# ADD\n* Χρησιμοποιείται για την προσθήκη διαχειριστών στο server σου.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " add <ΕΠΙΛΟΓΗ> <ΠΕΡΙΕΧΟΜΕΝΟ>"
                    + "\n\t<ΕΠΙΛΟΓΗ> <ΠΕΡΙΕΧΟΜΕΝΟ>"
                    + "\n\tmanager - Το @ του χρήστη που θα προστεθεί ως διαχειριστής"
                    + "\n\n## Π.Χ.: " + Const.COMMAND_PREFIX + Const.COMMAND + " add manager @Ague"},
            {"adminOverride", "*Η άδεια χρήσης αυτής της εντολής έχει ανακληθεί από κάποιον προγραμματιστή.*"},
            {"alreadyExists", "Φαίνεται πως το έχεις ήδη προσθέσει στη βάση δεδομένων μου. ¯\\_(ツ)_/¯"},
            {"alreadyManager", "Έχω ήδη προσλάβει αυτόν το χρήστη ως διαχειριστή.  Find moar humanz!"},
            {"announceHelp", "# ANNOUNCE\n* Σσσς...  Είμαι ένα μυστικό...\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " announce <content>\n\tΑυτή η εντολή είναι διαθέσιμη μόνο στους προγραμματιστές."},
            {"beamChannelNotFound", "\n# Το κανάλι(α) δε βρέθηκε στο Beam: %s."},
            {"beamHelp", "# BEAM\n* Προσθαφαίρεση πραγμάτων που σχετίζονται με το Beam.pro.\n"
                    + "* Σημειώσεις:\n\t"
                    + "Για να προσθέσεις φίλτρα παιχνιδιών και τίτλων, ΠΡΕΠΕΙ να συμπεριλάβεις τις παρενθέσεις.\n\t"
                    + "ΜΗ χρησιμοποιείς ολόκληρο το URL του Beam. Δε θα δουλέψει!! Χρησιμοποίησε μόνο το όνομα του καναλιού (www.beam.pro/ΟΝΟΜΑ)\n\t"
                    + "Μπορείς να προσθέσεις πολλαπλά κανάλια, ομάδες, φίλτρα παιχνιδιών και φίλτρα τίτλων χρησιμοποιώντας το χαρακτήρα | μεταξύ τους.\n\t"
                    + "Οι μόνες επιλογές που απαιτούνται είναι: όνομαΚαναλιόυ/όνομαΟμάδας\n\n"
                    + "## Κανάλια Beam\n"
                    + "Σημείωση: Η προσθήκη καναλιού ανακοίνωσης, καθώς και τα φίλτρα παιχνιδιών και τίτλων είναι προαιρετικά."
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel όνομαΚαναλιού #κανάλιΑνακοίνωσης {φίλτραΠαιχνιδιών} [φίλτραΤίτλων]\n\n"
                    + "## Ομάδες Beam (Ανακοίνωση ΟΛΩΝ των live streams της ομάδας)\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam team όνομαΟμάδας #κανάλιΑνακοίνωσης\n\n"
                    + "## Φίλτρα Παιχνιδιών Beam (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Αυτό επηρεάζει όλες τις ανακοινώσεις streams του Beam\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam gfilter {όνομαΠαιχνιδιού|όνομαΠαιχνιδιού} #κανάλιΑνακοίνωσης\n\n"
                    + "## Φίλτρα τίτλων Beam (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Αυτό επηρεάζει όλες τις ανακοινώσεις streams του Beam\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " beam tfilter [λέξη|άλλες λέξεις|περισσότερες λέξεις] #κανάλιΑνακοίνωσης\n\n"
                    + "* Παραδείγματα:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (προσθέτει ένα κανάλι προς ανακοίνωση σε συγκεκριμένο κανάλι και φίλτρα παιχνιδιών)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " beam team outpost #outpost-streamers (προσθέτει μία ομάδα με συγκεκριμένο κανάλι ανακοίνωσης)\n\n"},
            {"botLangFail", "Κάτι πήγε στραβά και η γλώσσα που μιλάω είναι ακόμη η ίδια."},
            {"botLangHelp", "# BOTLANG\n* Χρησιμεύει για να αλλάξεις τη γλώσσα στην οποία απαντάω.\n\n## ΧΡΗΣΗ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " botlang γλώσσα"
                    + "\n\tΜπορείς να εισάγεις τη γλώσσα είτε στην Αγγλική ορθογραφία της, είτε στη φυσική της ορθογραφία."
                    + "\n\n## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " botlang spanish"
                    + "\n\tΑν χρειάζεσαι περισσότερη βοήθεια είτε με αυτήν την εντολή είτε με κάποια άλλη, δεν σου κάνουν οι επεξηγήσεις των εντολών help και θέλεις να κάνεις ερωτήσεις στη γλώσσα σου "
                    + "ως αναφορά το bot παρακαλώ μη διστάσεις να ρωτήσεις τους μεταφραστές στο Discord μας για βοήθεια. Το Discord είναι στο " + Const.COMMAND_PREFIX + Const.COMMAND + " discord"},
            {"botLangSuccess", "Άλλαξες με επιτυχία τη γλώσσα μου."},
            {"botLangUnsupported", "Αυτή η γλώσσα δεν υποστηρίζεται στην παρούσα φάση."},
            {"botStatistics", "%s Statistics"},
            {"broadcasterLangAllSuccess", " :ok_hand: Θα ψάξω για streams σε όλες τις γλώσσες."},
            {"broadcasterLangFail", "Κάτι πήγε στραβά και θα ψάχνω ακόμη σε όλες τις γλώσσες."},
            {"broadcasterLangSuccess", " :ok_hand: Θα ψάχνω μόνο για streams που είναι σε αυτήν τη γλώσσα!"},
            {"canNotRemoveOwner", "Ανόητε θνητέ, δε μπορείς να αφαιρέσεις τον ιδιοκτήτη του server από τη λίστα των διαχειριστών. :laughing: " +
                    ":laughing:"},
            {"cleanupFail", "Κάτι πήγε στραβά... Καλύτερα να ξαναδοκιμάσεις."},
            {"cleanupHelp", "```Markdown\n# CLEANUP\n*  Αλλαγή του τρόπου που καθαρίζω τις ανακοινώσεις των streams.\n\n## ΧΡΗΣΗ:"
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " cleanup <ΕΠΙΛΟΓΗ>"
                    + "\n\tnone   - Δε θα πειράξω τίποτα! (προεπιλογή)"
                    + "\n\tedit   - Θα κάνω edit τις ανακοινώσεις μου ώστε να λένε \"OFFLINE\" όταν ο streamer είναι offline"
                    + "\n\tdelete - Απλά θα διαγράφω την ανακοίνωση όταν ο streamer δεν είναι πλέον live"
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " cleanup edit" + "```"},
            {"cleanupSuccessDelete", "Μάλιστα!  Θα διαγράφω όλες τις ανακοινώσεις μου από εδώ και στο εξής!"},
            {"cleanupSuccessEdit", "Θα κάνω απλά edit τις ανακοινώσεις μου, λοιπόν."},
            {"cleanupSuccessNone", " :ok_hand: Δεν θα πειράζω τίποτα στις ανακοινώσεις μου."},
            {"compactFail", "Εμ, κάτι πήγε στραβά.  Η λειτουργία compact δεν άλλαξε."},
            {"compactHelp", "```Markdown\n# COMPACT\n* Αλλαγή των ανακοινώσεών μου σε συντομότερες.\n\n## ΧΡΗΣΗ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " compact <ΕΠΙΛΟΓΗ>"
                    + "\n\tnoEmbed    - Αφαιρεί την παράθεση και χρησιμοποιεί μία σύντομη πρόταση."
                    + "\n\tsmallEmbed - Ανακοινώνει με παράθεση χωρίς το μεγάλο banner."
                    + "\n\tfullEmbed  - Η πλήρης ανακοίνωση με το μεγάλο banner."
                    + "\n\tvideoEmbed - Μη πλούσιο κείμενο στην παράθεση. Η ανακοίνωση θα είναι ένα μικρό code block με ενσωματωμένο βίντεο " +
                    "το οποίο μπορείς να δεις στο Discord."
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " compact smallEmbed" + "```"},
            {"compactFullEmbed", " :compression: Θα έχεις την πλήρη ανακοίνωση από εδώ και στο εξής."},
            {"compactSmallEmbed", " :compression: Θα έχεις την ανακοίνωση με τη μικρή παράθεση από εδώ και στο εξής."},
            {"compactNoEmbed", " :compression: Οι ανακοινώσεις μου θα είναι μία σύντομη πρόταση από εδώ και στο εξής."},
            {"compactVideoEmbed", " :compression: Δεν θα έχεις ανακοινώσεις με πλούσιο κείμενο από εδώ και στο εξής.  " +
                    "Θα είναι δυνατό να παιχτούν τα videos από το Discord."},
            {"configHelp", "# CONFIG\n* Η βασική εντολή για τις διάφορες ρυθμίσεις. Τσέκαρε το help κάθε ρύθμισης για περισσότερες πληροφορίες.\n\n" +
                    "* defaultOfflineMessage - Επαναφέρει το προεπιλεγμένο μήνυμα offline στην προεπιλογή (χρησιμοποιείται στις επεξεργασμένες ανακοινώσεις)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage help\n" +
                    "* defaultOnlineMessage - Επαναφέρει το προεπιλεγμένο μήνυμα ανακοινώσεων (χρησιμοποιείται σε όλες τις ανακοινώσεις)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage help\n" +
                    "* setDefaultAnnounceChannel help - Ρυθμίζει το προεπιλεγμένο κανάλι ανακοινώσεων\n" +
                    "\t(Που θα γίνεται η ανακοίνωση αν δεν συμπεριλαμβάνεις συγκεκριμένο κανάλι στην εντολή Twitch)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel help\n" +
                    "* setOfflineMessage - Ρυθμίζει ένα προσαρμοσμένο μήνυμα offline (χρησιμοποιείται στις επεξεργασμένες ανακοινώσεις)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage help\n" +
                    "* setOnlineMessage - Ρυθμίζει ένα προσαρμοσμένο μήνυμα ανακοίνωσης (χρησιμοποιείται σε όλες τις ανακοινώσεις)\n" +
                    "\t" + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage help"},
            {"customMessageNotNull", "# Το προσαρμοσμένο μήνυμα δε μπορεί να είναι κενό.  Λυπάμαι...  ¯\\_(ツ)_/¯"},
            {"defaultAnnounceMessage", "Το κανάλι %CHANNEL% μόλις ξεκίνησε το streaming! Δείτε το stream εδώ: %URL%"},
            {"defaultOfflineHelp", "# CONFIG DEFAULT OFFLINE MESSAGE\n* Επαναφέρει το προεπιλεγμένο μήνυμα offline.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOfflineMessage"},
            {"defaultOfflineMessage", "Το κανάλι %CHANNEL% σταμάτησε το streaming!  Λυπάμαι, το έχασες."},
            {"defaultOnlineHelp", "# CONFIG DEFAULT ONLINE MESSAGE\n* Επαναφέρει το προεπιλεγμένο μήνυμα online.\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config defaultOnlineMessage"},
            {"devMessage", "*Μήνυμα από τους προγραμματιστές του " + Const.BOT_NAME + ":*\n\n\t"},
            {"discordChannelNoExist", "Το συγκεκριμένο κανάλι δεν υπάρχει στον server σου."},
            {"discordChannelNotNull", "# Δε μπορώ να βρω το συγκεκριμένο κανάλι στο Discord σας. Το stream θα ανακοινώνεται στο προεπιλεγμένο κανάλι."},
            {"discordLink", "Ενδιαφέρεσαι να μπεις στο Discord server του Now Live Discord; Υπάρχουν πολλοί άνθρωποι που θα σε βοηθήσουν εκεί αν" +
                    "συναντάς προβλήματα! Κάνε click σε αυτό το link:\n" + Const.DISCORD_URL},
            {"discordLinkHelp", "Εμφανίζει το link για να συνδεθείς με το Discord server του Now Live."},
            {"discordUserNoExist", "Αυτό το άτομο δεν είναι χρήστης του Discord!  Προσπάθησε ξανά!"},
            {"doesNotExist", "Αυτό δεν καταχωρήθηκε ποτέ στη βάση δεδομένων μου."},
            {"embedFull", "ανακοίνωση με παράθεση πλήρους μεγέθους"},
            {"embedSmall", "ανακοίνωση με μικρή παράθεση"},
            {"embedFull", "ανακοίνωση με video που είναι playable"},
            {"embedNone", "ανακοίνωση με μία μικρή πρόταση και χωρίς παράθεση"},
            {"emptyArgs", "Νομίζω ξέχασες κάποιο τμήμα της εντολής.  Δες την εντολή help για περισσότερες πληροφορίες."},
            {"emptyCommand", "Την επόμενη φορά που θα με ξυπνήσεις, δώσε μου και μία εντολή σε παρακαλώ."},
            {"followersEmbed", "Ακόλουθοι"},
            {"followersEmbedYtg", "Συνδρομητές"},
            {"guildJoinSuccess", "Γεια σου!  Είμαι το Now Live, το bot που ανακοινώνει streams!  Πληκτρολόγησε `" +
                    Const.COMMAND_PREFIX + Const.COMMAND +
                    " help` για τη λίστα εντολών.\n\nΑν χρειάζεσαι βοήθεια στη ρύθμισή μου, έλα " +
                    "στο Discord μου " + Const.DISCORD_URL + " και τσέκαρε τα κανάλια how-to-setup και command-list " +
                    "για όλες τις πληροφορίες!\n\nΜην ξεχάσεις να πεις γεια!"},
            {"helpPm", "Γεια σου, %s! Έμαθα ότι ψάχνεις βοήθεια. Ορίστε μία λίστα με τις εντολές.\n\n" +
                    "```Markdown\n" +
                    "# ADD\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " add help\n\n" +
                    "# BEAM\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " beam help\n\n" +
                    "# BOTLANG\n" +
                    "* Υποστηριζόμενες γλώσσες: English, Czech, German, French, Spanish, Greek\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " botlang help\n\n" +
                    "# CLEANUP\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " cleanup help\n\n" +
                    "# COMPACT\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " compact help\n\n" +
                    "# CONFIG\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " config help\n\n" +
                    "# INVITE\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " invite help\n\n" +
                    "# LIST\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " list help\n\n" +
                    "# NOTIFY\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " notify help\n\n" +
                    "# PING\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ping help\n\n" +
                    "# REMOVE\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " remove help\n\n" +
                    "# SMASHCAST\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " smashcast help\n\n" +
                    "# STREAMLANG\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streamlang help\n\n" +
                    "# STREAMS\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " streams help\n\n" +
                    "# TWITCH\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " twitch help\n\n" +
                    "# YOUTUBE GAMING\n" +
                    "* Για περισσότερες πληροφορίες, πληκτρολόγησε: " +
                    Const.COMMAND_PREFIX + Const.COMMAND + " ytg help\n\n" +
                    "# PATREON/DONATE\n" +
                    "Link για το patreon του bot. Οι εντολές είναι :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " patreon\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " donate\n\n" +
                    "# TRELLO/BUG/REQUEST\n" +
                    "Link για το Trello μας που χρησιμοποιείται για τις αναφορές bugs και τα feature requests. Οι εντολές είναι :\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " trello\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " bug\n" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " request```" +
                    "Αν χρειάζεσαι περαιτέρω βοήθεια, έλα στο Discord μου.  Πάρα πολλοί άνθρωποι που μπορούν να βοηθήσουν είναι ήδη εκεί:  " + Const.DISCORD_URL},
            {"incorrectArgs", "Μου έδωσες λάθος ή λειψές εντολές.  Τσέκαρε την εντολή help για περισσότερες πληροφορίες."},
            {"invite", "Γεια σου %s! Δώσε μου invite για το server σου!\n\n\t"
                    + "**Κάνε click εδώ:** <https://discordapp.com/oauth2/authorize?&client_id="
                    + Config.DISCORD_CLIENT_ID.token()[0] + "&scope=bot&permissions=8>"},
            {"inviteHelp", "```Markdown\n# INVITE\n* Χρησιμοποιείται για την προβολή του invite link μου.\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " invite\n\tΠροσκάλεσε το NowLive bot στο Discord Server σου.```"},
            {"listHelp", "```Markdown\n# LIST\n* Αυτή η εντολή επιστρέφει λίστες από τη βάση δεδομένων μου.\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " list <option>"
                    + "\n\tbeamChannel      - Λίστα καναλιών που ακολουθείς στο Beam"
                    + "\n\tbeamTeam         - Λίστα ομάδων που ακολουθείς στο Beam"
                    + "\n\tgfilter          - Λίστα φίλτρων παιχνιδιών που έχεις ρυθμίσει"
                    + "\n\tmanager          - Λίστα διαχειριστών σε αυτόν το server"
                    + "\n\tsetting          - Λίστα κοινών ρυθμίσεων του bot"
                    + "\n\tsmashcastChannel - Λίστα καναλιών που ακολουθείς στο Smashcast"
                    + "\n\tsmashcastGame    - Λίστα παιχνιδιών που ακολουθείς στο Smashcast"
                    + "\n\tsmashcastTeam    - Λίστα ομάδων που ακολουθείς στο Smashcast"
                    + "\n\ttfilter          - Λίστα φίλτρων τίτλων που έχεις ρυθμίσει"
                    + "\n\ttwitchChannel    - Λίστα καναλιών που ακολουθείς στο Twitch"
                    + "\n\ttwitchCommunity  - Λίστα κοινοτήτων που ακολουθείς στο Twitch"
                    + "\n\ttwitchGame       - Λίστα παιχνιδιών που ακολουθείς στο Twitch"
                    + "\n\ttwitchTeam       - Λίστα ομάδων που ακολουθείς στο Twitch"
                    + "\n\tytgChannel       - Λίστα gaming καναλιών που ακολουθείς στο YouTube"
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " list twitchChannel" + "```"},
            {"listSettings", "```Markdown\n" +
                    "# Ρυθμίσεις Bot στο Server σου" +
                    "\n* Η λειτουργία Compact είναι ρυθμισμένη στο: %s." +
                    "\n* Οι ειδοποιήσεις είναι ρυθμισμένες στο: %s." +
                    "\n* Το Cleanup είναι ρυθμισμένο στο: %s." +
                    "\n* Η γλώσσα του Broadcaster είναι ρυθμισμένη στο: %s." +
                    "\n* Η γλώσσα του Bot είναι ρυθμισμένη στα: %s." +
                    "\n* Η μορφή της ανακοίνωσης όταν κάποιο stream είναι online είναι: %s." +
                    "\n* Η μορφή της ανακοίνωσης όταν κάποιο stream γίνεται offline είναι: %s.```"},
            {"needOneManager", "Αν αφαιρέσεις αυτόν το διαχειριστή, ποιος θα με διαχειρίζεται;"},
            {"noBotManager", "Είναι ενάντια στο Σωματίο των Bot του Discord να με διαχειριστείς. Λυπάμαι, προσπάθησε να βρεις εναν " +
                    "κατάλληλο άνθρωπο για αυτή τη δουλειά. :thumbsup:"},
            {"noneOnline", "Λυπάμαι %s, αλλά δεν είναι κανένας online τώρα τον οποίο ακολουθεί αυτός ο server."},
            {"notAManager", "Λυπάμαι, αλλά μόνο οι διαχειριστές μου μπορούν να το κάνουν αυτό. Πληκτρολόγησε `" + Const.COMMAND_PREFIX + Const.COMMAND +
                    " list manager` για μία λίστα ανθρώπων που μπορούν."},
            {"notAnAdmin", "Για όποιον ενδιαφέρεται: Είμαι υπηρέτης σου, αλλά δεν είσαι το αφεντικό μου."},
            {"notifyEveryone", ":tada: ΩΠΑ!!  **ΟΛΟΙ** στο server θα ειδοποιηθούν όταν θα " +
                    "ανακοινώνω streams!  *(Είσαι σίγουρος;  Δεν το προτείνω αυτό για μεγάλους servers...  Μπορεί να " +
                    "ενοχλήσει τον κόσμο.)*"},
            {"notifyHelp", "```Markdown\n# NOTIFY\n* Χρησιμοποιείται για να αλλάξει τη global ρύθμιση ειδοποιήσεων σε αυτόν το server.\n\n## USAGE:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " notify <option>"
                    + "\n\tnone     - Καμία ειδοποιήση @ (προεπιλογή)"
                    + "\n\there     - Θα ειδοποιώ μόνο αυτούς που είναι online όταν κάνω την ανακοίνωση"
                    + "\n\teveryone - Θα ειδοποιώ τους ΠΑΝΤΕΣ!!  Μουαχαχαχά!!  (Δεν το προτείνω για μεγάλους servers)"
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " notify everyone" + "```"},
            {"notifyHere", " :bellhop_bell: Όσοι είναι online θα λαμβάνουν ειδοποίηση όταν ανακοινώνω streams."},
            {"notifyNone", " :ok_hand: Δεν θα ειδοποιώ κανέναν όταν κάνω ανακοινώσεις."},
            {"nowLive", "ΖΩΝΤΑΝΑ!\n"},
            {"nowPlayingEmbed", "Παίζει"},
            {"nowPlayingLower", " παίζει "},
            {"nowStreamingEmbed", " κάνει streaming τώρα!"},
            {"numUniqueMembers", "Αριθμός Μοναδικών Μελών"},
            {"offline", "OFFLINE!\n"},
            {"offlineEmbed", " είναι πλέον offline!"},
            {"on", " στο "},
            {"onlineStreamPm1", "Γεια σου!  Αυτή τη στιγμή είναι "},
            {"onlineStreamPm2", " streamers online για τους οποίους ίσως ενδιαφέρεσαι!  Ακολούθησε τα links για να τους " +
                    "τσεκάρεις: \n\n"},
            {"oops", "Ουπς!  Κάτι πήγε στραβά και δεν έγινε καμία αλλαγή!  Ας δοκιμάσουμε πάλι."},
            {"patreon", "Αν επιθυμείς να κάνεις δωρεά στο bot χρησιμοποίησε το Patreon μας. https://www.patreon.com/nowlive"},
            {"patreonHelp", "Δίνει το link για τη σελίδα μας στο patreon."},
            {"ping", "Όταν ήμουν στην Κίνα με την Αμερικάνικη ομάδα του Ping Pong , μου άρεσε να παίζω ping-pong με τη " +
                    "ρακέτα Flexolite του ping pong."},
            {"pingHelp", "```Markdown\n# PING\n* Χρησιμεύει για να μου κάνεις ping. Αν λειτουργώ κανονικά, θα σου στείλω pong.\n\n## ΧΡΗΣΗ: "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ping```"},
            {"platformAnnounceUpdate", "\n# Το κάναλι ανακοινώσεων του %s άλλαξε σε: %s."},
            {"platformAnnounceUpdateFail", "\n! Αποτυχία αλλαγής του καναλιού ανακοινώσεων του %s σε: %s."},
            {"platformChannelAdd", "\n# Προστέθηκεαν τα κανάλια: %s."},
            {"platformChannelAddFail", "\n# Αποτυχία προσθήκης των καναλιών: %s."},
            {"platformChannelAnnounce", "\n# Θα ανακοινώνονται στο: #%s."},
            {"platformChannelGameFilter", "\n# Θα ανακοινώνονται μόνο όταν παίζουν: %s."},
            {"platformChannelRemove", "\n# Αφαίρεση των καναλιών: %s."},
            {"platformChannelRemoveFail", "\n! Αποτυχία διαγραφής των καναλιών: %s."},
            {"platformChannelTitleFilter", "\n# Θα ανακοινώνονται μόνο όταν υπάρχουν στον τίτλο οι παρακάτω λέξεις: %s."},
            {"platformGameAdd", "\n# Προστέθηκαν τα παιχνίδια: %s."},
            {"platformGameAddFail", "\n# Αποτυχία προσθήκης των παιχνιδιών: %s."},
            {"platformGameAnnounce", "\n# Το παιχνίδι θα ανακοινώνεται στο: #%s."},
            {"platformGameFilterAdd", "\n# Προστέθηκαν τα φίλτρα παιχνιδιών: %s."},
            {"platformGameFilterAddFail", "\n# Αποτυχία προσθήκης των φίλτρων παιχνιδιών: %s."},
            {"platformGameFilterRemove", "\n# Αφαιρέθηκαν τα φίλτρα παιχνιδιών: %s."},
            {"platformGameFilterRemoveFail", "\n# Αποτυχία αφαίρεσης των φίλτρων παιχνιδιών: %s."},
            {"platformGameNotFound", "Δε βρέθηκαν τα παιχνίδια: %s."},
            {"platformGameRemove", "\n# Αφαιρέθηκαν τα παιχνίδια: %s."},
            {"platformGameRemoveFail", "\n# Αποτυχία αφαίρεσης των παιχνιδών: %s."},
            {"platformTeamAdd", "\n# Προστέθηκαν οι ομάδες: %s."},
            {"platformTeamAddFail", "\n# Αποτυχία προσθήκης των ομάδων: %s."},
            {"platformTeamAnnounce", "\n# Οι ομάδες θα ανακοινώνονται στο: #%s."},
            {"platformTeamNotFound", "\n# Δε βρέθηκαν οι ομάδες: %s."},
            {"platformTeamRemove", "\n# Αφαιρέθηκαν οι ομάδες: %s."},
            {"platformTeamRemoveFail", "\n# Αποτυχία αφαίρεσης των ομάδων: %s."},
            {"platformTitleFilterAdd", "\n# Προστέθηκαν τα φίλτρα τίτλων: %s."},
            {"platformTitleFilterAddFail", "\n# Αποτυχία προσθήκης των φίλτρων τίτλων: %s."},
            {"platformTitleFilterRemove", "\n# Αφαιρέθηκαν τα φίλτρα τίτλων: %s."},
            {"platformTitleFilterRemoveFail", "\n# Αποτυχία αφαίρεσης των φίλτρων τίτλων: %s."},
            {"privateMessageReply", "Λυπάμαι, αλλά το bot με το οποίο προσπαθείς να επικοινωνήσεις έχει voice mail το οποίο " +
                    "δεν έχει ρυθμιστεί ακόμη.  Παρακαλώ προσπάθήσε να στείλεις ξανά PM αργότερα."},
            {"removed", "Αφαιρέθηκε %s %s."},
            {"removeManagerFail", "Δε μπορώ να αφαιρέσω τον %s επειδή δεν είναι καταχωρημένος στη βάση δεδομένων μου."},
            {"removeHelp", "```Markdown\n# REMOVE\n* Χρησιμοποιείται για την αφαίρεση διαχειριστών από τη βάση δεδομένων μου.\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @όνομαΧρήστη"
                    + "\n\tmanager - Το χαρακτηριστικό @ του χρήστη που θέλεις να αφαιρέσεις από τους διαχειριστές"
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " remove manager @AgueMort```"},
            {"servers", "Servers"},
            {"setDefaultAnnounceChannelDoNotOwnChannel", "# Επ, δε μπορώ να ανακοινώσω σε κανάλι που δεν υπάρχει στο " +
                    "server σου!"},
            {"setDefaultAnnounceChannelFail", "# Δε μπορώ να στείλω ανακοινώσεις εκεί.  Σιγουρέψου πως έχω τα κατάλληλα δικαιώματα " +
                    "σε αυτό το κανάλι."},
            {"setDefaultAnnounceChannelHelp", "# SET DEFAULT ANNOUNCE CHANNEL\n* Ρυθμίζει το προεπιλεγμένο κανάλι ανακοινώσεων.\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " config setDefaultAnnounceChannel <ΚΑΝΑΛΙ>\n\t"
                    + "<ΚΑΝΑΛΙ> - Το όνομα του καναλιού που επιθυμείς να είναι το προεπιλεγμένο (ΠΡΕΠΕΙ να συμπεριλάβεις το #)\n"
                    + "Αυτή η επιλογή ισχύει μόνο αν δεν έχεις ορίσει συγκεκριμένο κανάλι στην αντίστοιχη εντολή Twitch."
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setDefaultAnnounceChannel #discordchannel"},
            {"setDefaultAnnounceChannelSuccess", "# Το προεπιλεγμένο κανάλι ανακοινώσεων ορίστηκε στο: #%s."},
            {"setOfflineHelp", "# CONFIG SET OFFLINE MESSAGE\n* Ρυθμίζει ένα προσαρμοσμένο μήνυμα offline για τις επεξεργασμένες offline ανακοινώσεις.\n\n" +
                    "## Διαθέσιμες μεταβλητές που μπορείς να χρησιμοποιήσεις:\n" +
                    "\t* %CHANNEL%   - Όνομα του καναλιού\n" +
                    "\t* %FOLLOWERS% - Σύνολο followers\n" +
                    "\t* %GAME%      - Όνομα του παιχνιδιού που γίνεται stream\n" +
                    "\t* %STATUS%    - Κατάσταση (τίτλος) του stream\n" +
                    "\t* %URL%       - URL του stream\n" +
                    "\t* %USER%      - Όνομα του χρήστη του καναλιού\n" +
                    "\t* %VIEWERS%   - Αριθμός των viewers αυτή τη στιγμή\n\n" +
                    "## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOfflineMessage " +
                    "Το κανάλι %CHANNEL% σταμάτησε να κάνει stream!  Λυπάμαι, αλλά δεν πρόλαβες αυτήν τη φορά."},// <--- Do not translate between the %
            {"setOnlineHelp", "# CONFIG SET ONLINE MESSAGE\n* Ρυθμίζει ένα προσαρμοσμένο μήνυμα ανακοίνωσης.\n\n" +
                    "## Διαθέσιμες μεταβλητές που μπορείς να χρησιμοποιήσεις:\n" +
                    "\t* %CHANNEL%   - Όνομα του καναλιού\n" +
                    "\t* %FOLLOWERS% - Σύνολο followers\n" +
                    "\t* %GAME%      - Όνομα του παιχνιδιού που γίνεται stream\n" +
                    "\t* %STATUS%    - Κατάσταση (τίτλος) του stream\n" +
                    "\t* %URL%       - URL του stream\n" +
                    "\t* %USER%      - Όνομα του χρήστη του καναλιού\n" +
                    "\t* %VIEWERS%   - Αριθμός των viewers αυτή τη στιγμή\n\n" +
                    "## EXAMPLE:  " + Const.COMMAND_PREFIX + Const.COMMAND + " config setOnlineMessage " +
                    "Το κανάλι %CHANNEL% μόλις ξεκίνησε το stream! Παρακολούθησε εδώ: %URL%"},// <--- Do not translate between the %
            {"shardsThis", "Αριθμός Shard"},
            {"shardsTotal", "Πλήθος Shards"},
            {"smashcastChannelNotFound", "\n# Δε βρέθηκαν τα κανάλια στο Smashcast: %s."},
            {"smashcastHelp", "```Markdown\n# SMASHCAST\n* Προσθαφαίρεση πραγμάτων σχετικά με το Smashcast.tv.\n"
                    + "* Σημειώσεις:\n\t"
                    + "Για να προσθέσεις φίλτρα παιχνιδιών και τίτλων, ΠΡΕΠΕΙ να συμπεριλάβεις τις παρενθέσεις.\n\t"
                    + "ΜΗ χρησιμοποιήσεις ολόκληρο το URL του Smashcast. Δε θα λειτουργήσει!! Χρησιμοποίησε μόνο το όνομα του καναλιού (www.smashcast.tv/όνομαΚαναλιού)\n\t"
                    + "Μπορείς να προσθέσεις πολλαπλά κανάλια, ομάδες, παιχνίδια και φίλτρα παιχνιδιών και τίτλων χρησιμοποιώντας το χαρακτήρα | ανάμεσά τους.\n\t"
                    + "Οι μόνες αναγκαίες επιλογές είναι: όνομαΚαναλιού/όνομαΟμάδας/όνομαΠαιχνιδιού\n\n"
                    + "## Κανάλια Smashcast\n"
                    + "Σημείωση: Η προσθήκη καναλιού ανακοινώσεως και τα φίλτρα παιχνιδιών και τίτλων είναι προαιρετικά."
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel όνομαΚαναλιού #κανάλιΑνακοινώσεως {φίλτραΠαιχνιδιών} [φίλτραΤίτλων]\n\n"
                    + "## Παιχνίδια Smashcast (Ανακοινώνει ΟΛΑ τα ζωντανά streams για αυτό το παιχνίδι)\n"
                    + "* Format: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game όνομαΠαιχνιδιού #κανάλιΑνακοινώσεως\n\n"
                    + "## Ομάδες Smashcast (Ανακοινώνει ΟΛΑ τα ζωντανά streams της ομάδας)\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team όνομαΟμάδας #κανάλιΑνακοινώσεως\n\n"
                    + "## Φίλτρα Παιχνιδιών Smashcast (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Επηρεάζει όλες τις ανακοινώσεις streams για το Smashcast\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast gfilter {όνομαΠαιχνιδιού1|όνομαΠαιχνιδιού2} #κανάλιΑνακοινώσεως\n\n"
                    + "## Φίλτρα Τίτλων Smashcast (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Επηρεάζει όλες τις ανακοινώσεις streams για το Smashcast\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast tfilter[λέξη|άλλες λέξεις|περισσότερες λέξεις] #κανάλιΑνακοινώσεως\n\n"
                    + "* Παραδείγματα:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (προσθέτει ένα κανάλι προς ανακοίνωση σε συγκεκριμένο κανάλι και φίλτρα παιχνιδιών)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast game Overwatch (προσθέτει ένα παιχνίδι στο κανάλι ανακοινώσεων)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " smashcast team instinct family #instinct-streamers (προσθέτει μία ομάδα με συγκεκριμένο κανάλι ανακοινώσεως)\n\n"
                    + "```"},
            {"statusHelp", "```Markdown\n# STATUS\n* Εμφανίζει διάφορα στατιστικά του.\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX + Const.COMMAND + " status```"},
            {"streamlangHelp", "```Markdown\n# STREAMLANG\n* Επιτρέπει το φιλτράρισμα των streams βάσει γλώσσας.  " +
                    "Υποστηρίζεται η Αγγλική μορφή της γλώσσας, ή η φυσική.  Πρέπει να είναι μία από " +
                    "τις γλώσσες που υποστηρίζονται στο Twitch και εμφανίζεται στο Dashboard.\n\n## ΧΡΗΣΗ: "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND +
                    " streamlang <ΓΛΩΣΣΑ>\n" +
                    "* Μπορείς να χρησιμοποιήσεις είτε τη φυσική είτε την ορθογραφία της γλώσσας στα Αγγλικά."
                    + "\n\n## Π.Χ.:  " + Const.COMMAND_PREFIX + Const.COMMAND + " streamlang german```"},
            {"streamTitleEmbed", "Τίτλος Stream"},
            {"streamsHelp", "```Markdown\n# STREAMS\n* Θα σου στείλω μία λίστα των εν ενεργεία streams μέσω PM.\n* (ΣΗΜΕΙΩΣΗ: Είναι πιθανό " +
                    "να λάβεις αρκετά PMs, ανάλογα με τα πόσα stream παρακολουθεί το " +
                    "Discord σου!)\n\n## ΧΡΗΣΗ:  "
                    + Const.COMMAND_PREFIX
                    + Const.COMMAND
                    + " streams```"},
            {"totalViewsEmbed", "Σύνολο Προβολών"},
            {"trello", "Για να αναφέρετε bugs ή για να ζητήσετε νέα features χρησιμοποιείστε το Trello μας. https://trello.com/b/kcWshbIU"},
            {"trelloHelp", "Εμφανίζει το link για το Trello του bot"},
            {"twitchChannelNotFound", "\n# Το(α) Κανάλι(α) δε βρέθηκε(α) στο Twitch: %s."},
            {"twitchCommunities", "Κοινότητες Twitch"},
            {"twitchCommunityAdd", "\n# Προστέθηκαν οι κοινότητες: %s."},
            {"twitchCommunityAddFail", "\n# Αποτυχία προσθήκης των κοινοτήτων: %s."},
            {"twitchCommunityAnnounce", "\n# Οι κοινότητες θα ανακοινώνονται στο: #%s."},
            {"twitchCommunityNotFound", "\n# Η(Οι) Κοινότητα(ες) δε βρέθηκε(αν) στο Twitch: %s."},
            {"twitchCommunityRemove", "\n# Αφαιρέθηκαν οι κοινότητες: %s."},
            {"twitchCommunityRemoveFail", "\n# Αποτυχία αφαίρεσης των κοινοτήτων: %s."},
            {"twitchHelp", "```Markdown\n# TWITCH\n* Προσθαφαίρεση πραγμάτων σχετικά με το Twitch.tv.\n"
                    + "* Σημειώσεις:\n\t"
                    + "Για να προσθέσεις φίλτρα παιχνιδιών και τίτλων, ΠΡΕΠΕΙ να συμπεριλάβεις τις παρενθέσεις.\n\t"
                    + "ΜΗ χρησιμοποιείς ολόκληρο το URL του Twitch. Δε θα λειτουργήσει!! Χρησιμοποίησε μόνο το όνομα του καναλιού (www.twitch.tv/όνομαΚαναλιού)\n\t"
                    + "Το όνομα της Ομάδας πρέπει να είναι από το URL, όχι το όνομα που εμφανίζεται. (www.twitch.tv/team/όνομαΟμάδας)\n\t"
                    + "Μπορείς να προσθέσεις πολλαπλά κανάλια, ομάδες, παιχνίδια, κοινότητες και φίλτρα παιχνιδιών και τίτλων χρησιμοποιώντας το χαρακτήρα | ανάμεσά τους.\n\t"
                    + "Οι μόνες αναγκαίες επιλογές είναι: όνομαΚαναλιού/όνομαΚοινότητας/όνομαΟμάδας/όνομαΠαιχνιδιού\n\n"
                    + "## Κανάλια Twitch\n"
                    + "Σημείωση: Η προσθήκη καναλιού ανακοινώσεως και τα φίλτρα παιχνιδιών και τίτλων είναι προαιρετικά."
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel όνομαΚαναλιού #κανάλιΑνακοινώσεως {φίλτραΠαιχνιδιών} [φίλτραΤίτλων]\n\n"
                    + "## Κοινότητες Twitch (Ανακοινώνει ΟΛΑ τα ζωντανά streams στην κοινότητα)\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community όνομαΚοινότητας #κανάλιΑνακοινώσεως\n\n"
                    + "## Παιχνίδια Twitch (Ανακοινώνει ΟΛΑ τα ζωντανά streams για αυτό το παιχνίδι)\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game όνομαΠαιχνιδιού #κανάλιΑνακοινώσεως\n\n"
                    + "## Ομάδες Twitch (Ανακοινώνει ΟΛΑ τα ζωντανά streams της ομάδας)\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team όνομαΟμάδας #κανάλιΑνακοινώσεως\n\n"
                    + "## Φίλτρα Παιχνιδιών Twitch (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Επηρεάζει όλες τις ανακοινώσεις streams για το Twitch\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch gfilter {όνομαΠαιχνιδιού1|όνομαΠαιχνιδιού2} #κανάλιΑνακοινώσεως\n\n"
                    + "## Φίλτρα Τίτλων Twitch (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Επηρεάζει όλες τις ανακοινώσεις streams για το Twitch\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " twitch tfilter [λέξη|άλλες λέξεις|περισσότερες λέξεις] #κανάλιΑνακοινώσεως\n\n"
                    + "* Παραδείγματα:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch channel AgueMort #live-streams {Overwatch|World of "
                    + "Warcraft} (προσθέτει ένα κανάλι προς ανακοίνωση σε συγκεκριμένο κανάλι και φίλτρα παιχνιδιών)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch game Overwatch (προσθέτει ένα παιχνίδι στο κανάλι ανακοινώσεων)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch community MMORPG #live-streams (προσθέτει την κοινότητα με συγκεκριμένο κανάλι ανακοινώσεως)\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " twitch team thekingdom #the-kingdom-streamers (προσθέτει μία ομάδα με συγκεκριμένο κανάλι ανακοινώσεως)\n\n"
                    + "```"},
            {"twitchTeams", "Ομάδες Twitch"},
            {"typeOnce", "Χαζούλη, αυτό χρειάζεται να το πληκτρολογήσεις μόνο μία φορά."},
            {"uniqueChannels", "Διαφορετικά Κανάλια %s"},
            {"uniqueGames", "Διαφορετικά Παιχνίδια %s"},
            {"updateAnnounceMessageFail", "# Κάτι πήγε στραβά και το μήνυμα ανακοινώσεων δεν άλλαξε."},
            {"updateAnnounceMessageSuccess", "# Άλλαξες το μήνυμα ανακοινώσεων!  Τώρα χρησιμοποιεί τη σύνταξη:\n\n* %s"},
            {"updateOfflineMessageFail", "# Κάτι πήγε στραβά και το μήνυμα offline δεν άλλαξε."},
            {"updateOfflineMessageSuccess", "# Άλλαξες το μήνυμα offline!  Τώρα χρησιμοποιεί τη σύνταξη:\n\n* %s"},
            {"usePlatform", "Ουπς!  Αυτός είναι ο παλιός τρόπος που γινόταν αυτό!  Χρησιμοποίησε την εντολή για τη συγκεκριμένη πλατφόρμα!  Πληκτρολόγησε `" +
                    Const.COMMAND_PREFIX + Const.COMMAND + " help` για περισσότερες πληροφορίες."},
            {"watchThemHere", "Δες τους εδώ: "},
            {"wrongCommand", " :thinking: Δεν αναγνωρίζω αυτήν την εντολή."},
            {"ytgChannelNotFound", "\n# Τα Κανάλια δε βρέθηκαν στο YouTube Gaming: %s."},
            {"ytgHelp", "# YTG\n* Προσθαφαίρεση καναλιών YouTube Gaming.\n"
                    + "* Σημειώσεις:\n\t"
                    + "Για να προσθέσεις φίλτρα τίτλων, ΠΡΕΠΕΙ να συμπεριλάβεις τις παρενθέσεις.\n\t"
                    + "ΜΗ χρησιμοποιήσεις ολόκλητο το YouTube Gaming URL. Δε θα λειτουργήσει!! Χρησιμοποίησε μόνο το όνομα με το οποίο εμφανίζεται το κανάλι (όπως φαίνεται κάτω από το live stream)\n\t"
                    + "Μπορείς να προσθέσεις πολλαπλά κανάλια και φίλτρα τίτλων με τη χρήση του χαρακτήρα | μεταξύ τους.\n\t"
                    + "Για την ώρα υποστηρίζονται μόνο κανάλια.  Το YouTube API δεν εμφανίζει το όνομα του παιχνιδιού έτσι ώστε να λειτουργεί όπως οι υπόλοιπες εντολές."
                    + "Φίλτρα παιχνιδιών ΔΕΝ υφίστανται στο YouTube.  Δες την παραπάνω σημείωση για το API."
                    + "Η μοναδική επιλογή που απαιτείται είναι η: όνομαΚαναλιού\n\n"
                    + "## Κανάλια YouTube Gaming\n"
                    + "Σημείωση: Η προσθήκη καναλιού ανακοινώσεως και τα φίλτρα τίτλων είναι προαιρετικά."
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel όνομαΚαναλιού #κανάλιΑνακοινώσεως [φίλτραΤίτλων]\n\n"
                    + "## Φίλτρα Τίτλων YouTube Gaming (Global)\n"
                    + "* ΣΗΜΕΙΩΣΗ: Αυτό επηρεάζει όλες τις ανακοινώσεις streams για το YouTube Gaming\n"
                    + "* Σύνταξη: " + Const.COMMAND_PREFIX + Const.COMMAND + " ytg tfilter [λέξη|άλλες λέξεις|περισσότερες λέξεις] #κανάλιΑνακοινώσεως\n\n"
                    + "* Π.Χ.:\n\t"
                    + Const.COMMAND_PREFIX + Const.COMMAND + " ytg channel AgueMort #live-streams (προσθέτει ένα κανάλι και συγκεκριμένο κανάλι ανακοινώσεως)\n\t"}
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
