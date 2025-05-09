package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class agj implements qyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093261);
        t2o.a(806356116);
    }

    @Override // tb.qyc
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95e3928", new Object[]{this, context, str});
        } else {
            voj.a(context, str);
        }
    }
}
