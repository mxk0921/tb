package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f30132a;

    static {
        t2o.a(912262561);
    }

    public vnv(String str) {
        this.f30132a = new StringBuilder(str);
    }

    public vnv a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vnv) ipChange.ipc$dispatch("7963cfe4", new Object[]{this, str, str2});
        }
        this.f30132a.append(c());
        try {
            this.f30132a.append(URLEncoder.encode(str, "UTF-8"));
            this.f30132a.append("=");
            this.f30132a.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (Exception unused) {
        }
        return this;
    }

    public final char b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("c89bf42f", new Object[]{this, sb})).charValue();
        }
        return sb.charAt(sb.length() - 1);
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c712645f", new Object[]{this});
        }
        char b = b(this.f30132a);
        if ('?' == b || '&' == b) {
            return "";
        }
        if (this.f30132a.indexOf("?") >= 0) {
            return "&";
        }
        return "?";
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f30132a.toString();
    }
}
