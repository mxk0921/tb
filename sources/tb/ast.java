package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ast {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ast INSTANCE = new ast();

    static {
        t2o.a(481297657);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return ckf.b(Looper.myLooper(), Looper.getMainLooper());
    }
}
