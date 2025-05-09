package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hms extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 12;
    public static final String b = "TSWVCookieKVExpression";

    /* renamed from: a  reason: collision with root package name */
    public final String f20755a;

    static {
        t2o.a(329252943);
    }

    public hms(String str) {
        try {
            this.f20755a = str.substring(12, str.length() - 1);
        } catch (Throwable th) {
            zdh.b(b, "parse TSWVCookieKVExpression error", th);
        }
    }

    public static hms d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hms) ipChange.ipc$dispatch("234ff2b7", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@wvKVCookie(")) {
            return new hms(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(hms hmsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSWVCookieKVExpression");
    }

    public final Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aaac0360", new Object[]{this, str});
        }
        String a2 = zpw.a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            zdh.a(b, "all wvCookies = " + a2);
            String[] split = a2.replace("\"", "\\\\\"").split(";");
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                String[] split2 = str2.split("=");
                if (split2.length > 1) {
                    hashMap.put(split2[0].trim(), split2[1].trim());
                }
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            String k = wp8Var.k();
            if (!TextUtils.isEmpty(this.f20755a) && !TextUtils.isEmpty(k)) {
                String[] split = this.f20755a.split(",");
                Map<String, String> c = c(k);
                StringBuilder sb = new StringBuilder();
                if (c != null && split.length > 0) {
                    boolean z = true;
                    for (String str : split) {
                        String decode = Uri.decode(c.get(str));
                        if (decode != null) {
                            if (z) {
                                sb.append(str);
                                sb.append("=");
                                sb.append(decode);
                                z = false;
                            } else {
                                sb.append(";");
                                sb.append(str);
                                sb.append("=");
                                sb.append(decode);
                            }
                        }
                    }
                }
                zdh.a(b, "parse TSWVCookieKVExpression params = " + ((Object) sb));
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            zdh.b(b, "parse TSWVCookieKVExpression params error", th);
            return null;
        }
    }
}
