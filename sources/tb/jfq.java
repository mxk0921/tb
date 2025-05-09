package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d9ebf2b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String c = yfq.d().c("mode", "1");
            String c2 = yfq.d().c("list", "");
            if (!TextUtils.isEmpty(c2) && c2.split(",").length != 0) {
                if (str.startsWith(itw.URL_SEPARATOR)) {
                    i = 2;
                } else {
                    int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
                    i = indexOf < 0 ? 0 : indexOf + 3;
                }
                if (i >= str.length()) {
                    return false;
                }
                String substring = str.substring(i);
                String[] split = c2.split(",");
                if (TextUtils.equals(c, "2")) {
                    for (String str2 : split) {
                        if (!TextUtils.isEmpty(str2) && substring.startsWith(str2)) {
                            return false;
                        }
                    }
                } else if (TextUtils.equals(c, "1")) {
                    for (String str3 : split) {
                        if (TextUtils.isEmpty(str3) || !substring.startsWith(str3)) {
                        }
                    }
                    return false;
                }
                return str.contains("x-ssr=true");
            }
            if (TextUtils.equals(c, "2")) {
                return str.contains("x-ssr=true");
            }
            if (TextUtils.equals(c, "1")) {
                return false;
            }
            return str.contains("x-ssr=true");
        } catch (Throwable unused) {
            return false;
        }
    }
}
