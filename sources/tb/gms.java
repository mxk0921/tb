package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gms extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 10;
    public static final String b = "TSWVCookieExpression";

    /* renamed from: a  reason: collision with root package name */
    public final String f20095a;

    static {
        t2o.a(329252942);
    }

    public gms(String str) {
        try {
            this.f20095a = str.substring(10, str.length() - 1);
        } catch (Throwable th) {
            zdh.b(b, "parse TSWVCookieExpression error", th);
        }
    }

    public static gms d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gms) ipChange.ipc$dispatch("bea890c2", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@wvCookie(")) {
            return new gms(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(gms gmsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSWVCookieExpression");
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
            if (!TextUtils.isEmpty(this.f20095a) && !TextUtils.isEmpty(k)) {
                String[] split = this.f20095a.split(",");
                Map<String, String> c = c(k);
                StringBuilder sb = new StringBuilder();
                if (c != null && split.length > 0) {
                    boolean z = true;
                    for (String str : split) {
                        String decode = Uri.decode(c.get(str));
                        if (decode != null) {
                            if (z) {
                                sb.append(decode);
                                z = false;
                            } else {
                                sb.append(";");
                                sb.append(decode);
                            }
                        }
                    }
                }
                zdh.a(b, "parse TSWVCookieExpression params = " + ((Object) sb));
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            zdh.b(b, "parse TSWVCookieExpression params error", th);
            return null;
        }
    }
}
