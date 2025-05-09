package anet.channel.util;

import anet.channel.strategy.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.MalformedURLException;
import java.net.URL;
import tb.f7l;
import tb.itw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HttpUrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String host;
    public volatile boolean isNoStrategy;
    private volatile boolean isSchemeLocked;
    private String path;
    private int port;
    private String scheme;
    private String simpleUrl;
    private String url;

    static {
        t2o.a(607125946);
    }

    private HttpUrl() {
        this.isNoStrategy = false;
        this.isSchemeLocked = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static anet.channel.util.HttpUrl parse(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        return this.port;
    }

    public String host() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f877d251", new Object[]{this});
        }
        return this.host;
    }

    public boolean isSchemeLocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68abe764", new Object[]{this})).booleanValue();
        }
        return this.isSchemeLocked;
    }

    public void lockScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e5c737", new Object[]{this});
        } else {
            this.isSchemeLocked = true;
        }
    }

    public String path() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd143f4", new Object[]{this});
        }
        return this.path;
    }

    public void replaceIpAndPort(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90653275", new Object[]{this, str, new Integer(i)});
        } else if (str != null) {
            int indexOf = this.url.indexOf(itw.URL_SEPARATOR) + 2;
            while (indexOf < this.url.length() && this.url.charAt(indexOf) != '/') {
                indexOf++;
            }
            boolean isIPV6Address = Utils.isIPV6Address(str);
            StringBuilder sb = new StringBuilder(this.url.length() + str.length());
            sb.append(this.scheme);
            sb.append(HttpConstant.SCHEME_SPLIT);
            if (isIPV6Address) {
                sb.append('[');
            }
            sb.append(str);
            if (isIPV6Address) {
                sb.append(']');
            }
            if (i != 0) {
                sb.append(f7l.CONDITION_IF_MIDDLE);
                sb.append(i);
            } else if (this.port != 0) {
                sb.append(f7l.CONDITION_IF_MIDDLE);
                sb.append(this.port);
            }
            sb.append(this.url.substring(indexOf));
            this.url = sb.toString();
        }
    }

    public String scheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7de6274", new Object[]{this});
        }
        return this.scheme;
    }

    public void setScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef72bff8", new Object[]{this, str});
        } else if (!this.isSchemeLocked && !str.equalsIgnoreCase(this.scheme)) {
            this.scheme = str;
            String str2 = this.url;
            String concatString = StringUtils.concatString(str, ":", str2.substring(str2.indexOf(itw.URL_SEPARATOR)));
            this.url = concatString;
            this.simpleUrl = StringUtils.concatString(str, ":", this.simpleUrl.substring(concatString.indexOf(itw.URL_SEPARATOR)));
        }
    }

    public String simpleUrlString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d0a2eb", new Object[]{this});
        }
        return this.simpleUrl;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.url;
    }

    public URL toURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("1f7c0f7a", new Object[]{this});
        }
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String urlString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aafe6899", new Object[]{this});
        }
        return this.url;
    }

    public void downgradeSchemeAndLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312a244f", new Object[]{this});
            return;
        }
        this.isSchemeLocked = true;
        if (!"http".equals(this.scheme)) {
            this.scheme = "http";
            String str = this.url;
            this.url = StringUtils.concatString("http", ":", str.substring(str.indexOf(itw.URL_SEPARATOR)));
        }
    }

    public boolean containsNonDefaultPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f685fdf", new Object[]{this})).booleanValue();
        }
        if (this.port != 0) {
            return ("http".equals(this.scheme) && this.port != 80) || ("https".equals(this.scheme) && this.port != 443);
        }
        return false;
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.isNoStrategy = false;
        this.isSchemeLocked = false;
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }
}
