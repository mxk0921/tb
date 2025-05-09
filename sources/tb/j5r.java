package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class j5r implements s9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855753);
        t2o.a(989855835);
    }

    @Override // tb.s9b
    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45fe5adc", new Object[]{this, context, str})).booleanValue();
        }
        return t.a(context, str);
    }
}
