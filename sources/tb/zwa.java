package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zwa extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ux9> f33064a;

    static {
        t2o.a(779092623);
    }

    public zwa(ux9 ux9Var) {
        this.f33064a = new WeakReference<>(ux9Var);
    }

    public static /* synthetic */ Object ipc$super(zwa zwaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/HighlightDXUserContext");
    }

    public ux9 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("57c4d1be", new Object[]{this});
        }
        return this.f33064a.get();
    }
}
