package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f21171a = new HashMap();

    static {
        t2o.a(806355887);
    }

    public static Boolean a(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("404ce2ef", new Object[]{str, str2, bool});
        }
        return Boolean.valueOf(zqq.d(b(str, str2, String.valueOf(bool)), bool.booleanValue()));
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
        }
        Map<String, String> map = f21171a;
        if (TextUtils.isEmpty((CharSequence) ((HashMap) map).get(str + "_" + str2))) {
            if (v2s.o().p() != null) {
                str3 = v2s.o().p().b(str, str2, str3);
            }
            ((HashMap) map).put(str + "_" + str2, str3);
            return str3;
        }
        return (String) ((HashMap) map).get(str + "_" + str2);
    }
}
