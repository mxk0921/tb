package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946397);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b83c1e", new Object[]{str})).booleanValue();
        }
        return a(str, "1");
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32e6b7e8", new Object[]{str, str2})).booleanValue();
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter)) {
                String[] split = queryParameter.split("\\.");
                if (split.length >= 2) {
                    String str3 = split[1];
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.trim().split(",");
                        if (split2.length == 1 && "*".equals(split2[0])) {
                            return true;
                        }
                        if (Arrays.asList(split2).contains(str3)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
