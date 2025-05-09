package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ut7<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public uy<T> f29599a;

    static {
        t2o.a(713031830);
    }

    @SafeVarargs
    public final void a(uy<T>... uyVarArr) {
        int length;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42b6a64", new Object[]{this, uyVarArr});
        } else if (uyVarArr != null && (length = uyVarArr.length) != 0) {
            this.f29599a = uyVarArr[0];
            if (length != 1) {
                int length2 = uyVarArr.length;
                uy<T> uyVar = null;
                while (i < length2) {
                    uy<T> uyVar2 = uyVarArr[i];
                    if (uyVar != null) {
                        uyVar.d(uyVar2);
                    }
                    i++;
                    uyVar = uyVar2;
                }
            }
        }
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb66f89", new Object[]{this, t})).booleanValue();
        }
        uy<T> uyVar = this.f29599a;
        if (uyVar == null) {
            return false;
        }
        return uyVar.b(t);
    }
}
