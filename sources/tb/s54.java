package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class s54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346563);
    }

    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3b7a541", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
        if (Integer.parseInt(str) > 0) {
            return true;
        }
        Result.m1108constructorimpl(xhv.INSTANCE);
        return false;
    }
}
