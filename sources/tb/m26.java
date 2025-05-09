package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m26 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597021);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{str});
        } else if (zg5.C3()) {
            Log.e("DXLanguageLogUtil", str);
        }
    }
}
