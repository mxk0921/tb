package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xyk extends p2g<fyk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final yzk b = new yzk();

    static {
        t2o.a(1004536520);
    }

    public xyk(fyk fykVar) {
        super(fykVar);
    }

    public static /* synthetic */ Object ipc$super(xyk xykVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/event/OpenArchEventComponent");
    }

    /* renamed from: c */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        }
    }

    @Override // tb.p2g, tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        yzk yzkVar = this.b;
        if (yzkVar != null) {
            yzkVar.f();
        }
        super.f();
    }

    public final yzk j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yzk) ipChange.ipc$dispatch("1e49b8c4", new Object[]{this});
        }
        return this.b;
    }
}
