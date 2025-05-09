package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ll9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(Class<?> cls);

        void onError();
    }

    public static void a(Context context, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89204bce", new Object[]{context, str, str2, aVar});
            return;
        }
        hdq a2 = bcq.a();
        try {
            if (a2 == null) {
                xhh.a("SplitLoaderCompat is null", new Object[0]);
            } else if (a2.e().E(str).exists() && (vcq.a(context).f().contains(str) || a2.g(context, false, str))) {
                aVar.a(Class.forName(str2));
                return;
            }
        } catch (Exception e) {
            xhh.a(e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
        aVar.onError();
    }
}
