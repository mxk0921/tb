package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j1d implements u11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.u11, com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 2) {
            o1d.a().b(null, k1d.a());
            k1d.c(false);
        } else if (i == 1) {
            o1d.a().c(null);
            k1d.c(true);
        }
    }
}
