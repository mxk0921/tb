package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lvp extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final z3a b;

    static {
        t2o.a(912262426);
    }

    public lvp(z3a z3aVar) {
        this.b = z3aVar;
    }

    public static /* synthetic */ Object ipc$super(lvp lvpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/message/ShowGalleryPopupMessage");
    }

    public z3a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z3a) ipChange.ipc$dispatch("f4b96ad", new Object[]{this});
        }
        return this.b;
    }
}
