package androidx.core.net;

import android.net.Uri;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MailTo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BCC = "bcc";
    private static final String BODY = "body";
    private static final String CC = "cc";
    private static final String MAILTO = "mailto";
    public static final String MAILTO_SCHEME = "mailto:";
    private static final String SUBJECT = "subject";
    private static final String TO = "to";
    private HashMap<String, String> mHeaders = new HashMap<>();

    private MailTo() {
    }

    public static boolean isMailTo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35afbdf1", new Object[]{str})).booleanValue() : str != null && str.startsWith("mailto:");
    }

    public static MailTo parse(String str) throws ParseException {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MailTo) ipChange.ipc$dispatch("966c0493", new Object[]{str});
        }
        Preconditions.checkNotNull(str);
        if (isMailTo(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                str3 = Uri.decode(str.substring(7));
                str2 = null;
            } else {
                str3 = Uri.decode(str.substring(7, indexOf2));
                str2 = str.substring(indexOf2 + 1);
            }
            MailTo mailTo = new MailTo();
            if (str2 != null) {
                for (String str4 : str2.split("&")) {
                    String[] split = str4.split("=", 2);
                    if (split.length != 0) {
                        mailTo.mHeaders.put(Uri.decode(split[0]).toLowerCase(Locale.ROOT), split.length > 1 ? Uri.decode(split[1]) : null);
                    }
                }
            }
            String to = mailTo.getTo();
            if (to != null) {
                str3 = str3 + ", " + to;
            }
            mailTo.mHeaders.put("to", str3);
            return mailTo;
        }
        throw new ParseException("Not a mailto scheme");
    }

    public String getBcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d5e16d", new Object[]{this});
        }
        return this.mHeaders.get(BCC);
    }

    public String getBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8904be1", new Object[]{this});
        }
        return this.mHeaders.get("body");
    }

    public String getCc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e310663", new Object[]{this});
        }
        return this.mHeaders.get(CC);
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.mHeaders;
    }

    public String getSubject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6aef3c3", new Object[]{this});
        }
        return this.mHeaders.get(SUBJECT);
    }

    public String getTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this});
        }
        return this.mHeaders.get("to");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.mHeaders.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }

    public static boolean isMailTo(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe1670c8", new Object[]{uri})).booleanValue() : uri != null && MAILTO.equals(uri.getScheme());
    }

    public static MailTo parse(Uri uri) throws ParseException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MailTo) ipChange.ipc$dispatch("aea972ea", new Object[]{uri}) : parse(uri.toString());
    }
}
