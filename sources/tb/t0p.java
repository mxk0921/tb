package tb;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793036);
    }

    public static String a(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803d4c81", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return new String(Base64.decode(str.getBytes("UTF-8"), 2));
    }

    public static String b(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return new String(Base64.encode(str.getBytes("UTF-8"), 2));
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a45bcd23", new Object[]{str});
        }
        String f = b3p.f(str);
        if (TextUtils.isEmpty(f)) {
            b4p.a("SearchBase64CacheUtil", "encrypted content is empty");
            return "";
        }
        try {
            return a(f);
        } catch (Exception unused) {
            b4p.k("SearchBase64CacheUtil", "decrypt error");
            return "";
        }
    }

    public static boolean d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a021fa54", new Object[]{str, obj})).booleanValue();
        }
        if (obj != null) {
            return e(str, JSON.toJSONString(obj));
        }
        b4p.n("SearchBase64CacheUtil", "content is null");
        return false;
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eda33442", new Object[]{str, str2})).booleanValue();
        }
        b4p.g("SearchBase64CacheUtil", "save file with encrypt " + str);
        if (str2 == null) {
            return false;
        }
        try {
            str2 = b(str2);
        } catch (Exception unused) {
            b4p.k("SearchBase64CacheUtil", "encode error");
        }
        if (str2 != null) {
            return b3p.g(str, str2);
        }
        b4p.g("SearchBase64CacheUtil", "encode content is null");
        return false;
    }
}
