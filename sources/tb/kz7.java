package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kz7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kz7 INSTANCE = new kz7();

    static {
        t2o.a(918552587);
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (!cw6.b() || !l91.Companion.c()) {
            return false;
        }
        return true;
    }
}
