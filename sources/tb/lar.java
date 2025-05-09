package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lar implements vrb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lar INSTANCE = new lar();

    @Override // tb.vrb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{this, str});
            return;
        }
        ckf.g(str, hpl.SECTION_NAME);
        w35.a(str);
    }

    @Override // tb.vrb
    public void end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else {
            w35.c();
        }
    }
}
