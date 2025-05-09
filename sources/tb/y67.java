package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y67 implements koq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31878a;

    public y67(boolean z) {
        this.f31878a = z;
    }

    @Override // tb.koq
    public boolean defaultValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3eb83b", new Object[]{this})).booleanValue();
        }
        return this.f31878a;
    }
}
