package tb;

import android.app.Activity;
import com.alibaba.ut.comm.JsBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import tb.nb0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class em4 implements nb0.d, nb0.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        nb0.d().c(this);
        nb0.d().b(this);
    }

    @Override // tb.nb0.c
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else if (!(activity instanceof b8e)) {
            thh.d(null, "activity", activity);
            xbe a2 = egw.a(activity);
            if (a2 != null) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
                JsBridge.nativeToJs(a2, "Aplus4UT.onPageHide", null);
            }
        }
    }

    @Override // tb.nb0.d
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (!(activity instanceof b8e)) {
            thh.d(null, "activity", activity);
            xbe a2 = egw.a(activity);
            if (a2 != null) {
                JsBridge.nativeToJs(a2, "Aplus4UT.onPageShow", null);
            }
        }
    }
}
