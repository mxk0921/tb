package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571200);
    }

    public static Activity a(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("368d06cb", new Object[]{nwiVar});
        }
        if (nwiVar == null || nwiVar.b() == null) {
            jgh.a("getActivityContext", "adContext or ViewWrapper is null.");
            return null;
        }
        Context context = nwiVar.b().b().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        jgh.a("getActivityContext", "context is null or not Activity.");
        return null;
    }
}
