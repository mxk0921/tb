package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ktf extends xpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<otf> c;

    static {
        t2o.a(995098630);
    }

    public ktf(otf otfVar) {
        this.c = new WeakReference<>(otfVar);
    }

    public static /* synthetic */ Object ipc$super(ktf ktfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/jarvis/JarvisKitIdleRunnable");
    }

    @Override // tb.xpo
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        otf otfVar = this.c.get();
        if (otfVar != null) {
            otfVar.L2();
        }
    }
}
