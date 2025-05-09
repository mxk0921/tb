package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hi3 extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean b;

    static {
        t2o.a(912261311);
    }

    public hi3(boolean z) {
        this.b = z;
    }

    public static /* synthetic */ Object ipc$super(hi3 hi3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/ChangeMainPageHScrollMessage");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6bb0f82", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
