package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jxg extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<xea> f22268a;

    static {
        t2o.a(295698970);
    }

    public jxg(xea xeaVar) {
        this.f22268a = new WeakReference<>(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(jxg jxgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/LiveDXContext");
    }

    public xea f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("eab791ba", new Object[]{this});
        }
        return this.f22268a.get();
    }
}
