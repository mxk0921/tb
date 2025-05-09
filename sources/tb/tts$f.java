package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.qc0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tts$f implements qc0.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857498);
        t2o.a(481296413);
    }

    public tts$f() {
    }

    public void a(Activity activity, boolean z, boolean z2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a269e00", new Object[]{this, activity, new Boolean(z), new Boolean(z2)});
            return;
        }
        int i2 = R.anim.push_left_in;
        if (z) {
            i2 = 0;
        }
        if (!z2) {
            i = 17432577;
        }
        activity.overridePendingTransition(i2, i);
    }
}
