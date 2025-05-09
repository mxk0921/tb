package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ypz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322030);
    }

    public static boolean a(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd849e9c", new Object[]{aqzVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(aqzVar.b()) && aqzVar.f != null) {
            return true;
        }
        return false;
    }

    public static xpz b(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("ca988f49", new Object[]{aqzVar});
        }
        return new n0z(aqzVar.c());
    }

    public static xpz c(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("add6f8c5", new Object[]{aqzVar});
        }
        if (a(aqzVar)) {
            return szy.a(aqzVar);
        }
        return b(aqzVar);
    }

    public static xpz d(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("b1eef86a", new Object[]{aqzVar});
        }
        if (a(aqzVar)) {
            return szy.b(aqzVar);
        }
        return b(aqzVar);
    }

    public static xpz e(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("5be5fc09", new Object[]{aqzVar});
        }
        if (a(aqzVar)) {
            return uzy.a(aqzVar);
        }
        return b(aqzVar);
    }
}
