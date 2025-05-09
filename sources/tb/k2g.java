package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k2g<C extends h2g<C>> extends f2g<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438668);
    }

    public k2g(C c) {
        super(c);
    }

    public static /* synthetic */ Object ipc$super(k2g k2gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/arch/kernel/component/data/KernelDataComponent");
    }

    @Override // tb.f2g
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, c});
        }
    }
}
