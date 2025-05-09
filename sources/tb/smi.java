package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class smi extends eq2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final b f;
    public String g;

    static {
        t2o.a(1004536604);
    }

    public smi() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Object ipc$super(smi smiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/processor/MessageCompensationProcessor");
    }

    /* renamed from: I */
    public b y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9945c1d4", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.eq2
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // tb.eq2
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.g;
    }

    public /* synthetic */ smi(b bVar, String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : str);
    }

    public smi(b bVar, String str) {
        super(bVar, str);
        this.f = bVar;
        this.g = str;
    }
}
