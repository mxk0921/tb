package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ufp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ufp INSTANCE = new ufp();

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebee55", new Object[]{this})).booleanValue();
        }
        if (qp0.b() == 2) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("844bd049", new Object[]{this})).booleanValue();
        }
        if (qp0.b() == 1) {
            return true;
        }
        return false;
    }
}
