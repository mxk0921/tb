package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.definition.OpenArchBizCode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gyk extends i2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OpenArchBizCode c;
    public final String e;
    public final iyk f;

    static {
        t2o.a(1004535838);
    }

    public gyk() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Object ipc$super(gyk gykVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            gykVar.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/context/OpenArchContextInput");
    }

    public final OpenArchBizCode e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchBizCode) ipChange.ipc$dispatch("d0decae4", new Object[]{this});
        }
        return this.c;
    }

    public final iyk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyk) ipChange.ipc$dispatch("4d1de073", new Object[]{this});
        }
        return this.f;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0474c9d", new Object[]{this});
        }
        return this.e;
    }

    public final void k(OpenArchBizCode openArchBizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49a5c7e", new Object[]{this, openArchBizCode});
            return;
        }
        ckf.g(openArchBizCode, "<set-?>");
        this.c = openArchBizCode;
    }

    public /* synthetic */ gyk(OpenArchBizCode openArchBizCode, String str, String str2, iyk iykVar, fic ficVar, Map map, int i, a07 a07Var) {
        this((i & 1) != 0 ? OpenArchBizCode.Undefined : openArchBizCode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : iykVar, (i & 16) != 0 ? null : ficVar, (i & 32) == 0 ? map : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyk(OpenArchBizCode openArchBizCode, String str, String str2, iyk iykVar, fic ficVar, Map<String, ? extends Object> map) {
        super(ficVar, null, 2, null);
        ckf.g(openArchBizCode, "bizCode");
        this.c = openArchBizCode;
        this.e = str2;
        this.f = iykVar;
    }
}
