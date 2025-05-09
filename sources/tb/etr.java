package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgBizParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountValueParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendTextParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSubscribeParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicRequestParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgUnSubscribeParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class etr extends u1<xhc> implements xhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kvd f18811a;

    static {
        t2o.a(1002438775);
        t2o.a(1002438823);
    }

    public etr() {
        this(null, 1, null);
    }

    public static final g1a W(etr etrVar, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("3e459061", new Object[]{etrVar, g1aVar});
        }
        return etrVar.N(g1aVar);
    }

    public static /* synthetic */ Object ipc$super(etr etrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBPowerMsgService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.p();
    }

    @Override // tb.whc
    public void C(KSPowerMsgSendTextParams kSPowerMsgSendTextParams, x0g x0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc7dd27", new Object[]{this, kSPowerMsgSendTextParams, x0gVar});
            return;
        }
        ckf.g(kSPowerMsgSendTextParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).j0(kSPowerMsgSendTextParams, x0gVar);
        }
    }

    @Override // tb.whc
    public void E(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, v0g v0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9e4cc7", new Object[]{this, kSPowerMsgSendMessageParams, v0gVar});
            return;
        }
        ckf.g(kSPowerMsgSendMessageParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).f0(kSPowerMsgSendMessageParams, v0gVar);
        }
    }

    @Override // tb.whc
    public void H(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, t0g t0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c103d7dc", new Object[]{this, kSPowerMsgTopicRequestParams, t0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).X(kSPowerMsgTopicRequestParams, t0gVar);
        }
    }

    @Override // tb.whc
    public void j(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, u0g u0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f3bc96", new Object[]{this, kSPowerMsgTopicRequestParams, u0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).b0(kSPowerMsgTopicRequestParams, u0gVar);
        }
    }

    @Override // tb.whc
    public void l(KSPowerMsgUnSubscribeParams kSPowerMsgUnSubscribeParams, q0g q0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff1819a", new Object[]{this, kSPowerMsgUnSubscribeParams, q0gVar});
            return;
        }
        ckf.g(kSPowerMsgUnSubscribeParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).r0(kSPowerMsgUnSubscribeParams, q0gVar);
        }
    }

    @Override // tb.whc
    public void p(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, s0g s0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb7ed7c", new Object[]{this, kSPowerMsgTopicRequestParams, s0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).T(kSPowerMsgTopicRequestParams, s0gVar);
        }
    }

    @Override // tb.whc
    public void r(KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams, q0g q0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fb22fa", new Object[]{this, kSPowerMsgSubscribeParams, q0gVar});
            return;
        }
        ckf.g(kSPowerMsgSubscribeParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).o0(kSPowerMsgSubscribeParams, q0gVar);
        }
    }

    @Override // tb.whc
    public void t(KSPowerMsgBizParams kSPowerMsgBizParams, o0g o0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaf2e9b", new Object[]{this, kSPowerMsgBizParams, o0gVar});
            return;
        }
        ckf.g(kSPowerMsgBizParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).E(kSPowerMsgBizParams, o0gVar);
        }
    }

    @Override // tb.whc
    public void x(KSPowerMsgCountValueParams kSPowerMsgCountValueParams, p0g p0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f84b1a", new Object[]{this, kSPowerMsgCountValueParams, p0gVar});
            return;
        }
        ckf.g(kSPowerMsgCountValueParams, "params");
        kvd kvdVar = this.f18811a;
        if (kvdVar != null) {
            ((jur) kvdVar).P(kSPowerMsgCountValueParams, p0gVar);
        }
    }

    public etr(asb asbVar) {
        super(asbVar);
    }

    @Override // tb.whc
    public xhc a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhc) ipChange.ipc$dispatch("80b2b494", new Object[]{this});
        }
        final etr etrVar = new etr(null, 1, null);
        pus.INSTANCE.f("TBPowerMsgService", "", "use mega pm");
        new jur().n0(new g1a() { // from class: tb.dtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                g1a W;
                W = etr.W(etr.this, (g1a) obj);
                return W;
            }
        });
        etrVar.f18811a = new jur();
        return etrVar;
    }

    public /* synthetic */ etr(asb asbVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : asbVar);
    }
}
