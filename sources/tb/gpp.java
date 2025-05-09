package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gpp implements fsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gpp INSTANCE = new gpp();

    @Override // tb.fsc
    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38cbe1d", new Object[]{this});
        }
    }
}
