package com.taobao.kmp.nexus.arch.openArch;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.flexa.openArch.IOpenArchProxy;
import kotlin.Metadata;
import tb.a2l;
import tb.ckf;
import tb.d2g;
import tb.fic;
import tb.fyk;
import tb.g3g;
import tb.gic;
import tb.h2g;
import tb.i3g;
import tb.jky;
import tb.k2g;
import tb.lky;
import tb.m2g;
import tb.mky;
import tb.oyk;
import tb.p2g;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JË\u0001\u0010\u0017\u001a4\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0018\u00010\u0016\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JÇ\u0001\u0010\u001b\u001a\u00020\u001a\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u001226\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJÏ\u0001\u0010\u001e\u001a4\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0018\u00010\u0016\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00060\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJÉ\u0001\u0010!\u001a\u0004\u0018\u00010 \"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u001226\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0016H\u0016¢\u0006\u0004\b!\u0010\"JÉ\u0001\u0010$\u001a\u0004\u0018\u00010#\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u001226\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0016H\u0016¢\u0006\u0004\b$\u0010%JÉ\u0001\u0010'\u001a\u0004\u0018\u00010&\"\b\b\u0000\u0010\u0005*\u00020\u0004\"\u000e\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00060\u0006\"\u0014\b\u0002\u0010\t*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00060\b\"\u0014\b\u0003\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\n\"\u000e\b\u0004\u0010\r*\b\u0012\u0004\u0012\u00028\u00060\f\"\u000e\b\u0005\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00060\u000e\"\u000e\b\u0006\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00060\u0010\"\b\b\u0007\u0010\u0013*\u00020\u001226\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0016H\u0016¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/OpenArchProxy;", "Lcom/taobao/kmp/live/flexa/openArch/IOpenArchProxy;", "<init>", "()V", "Ltb/fic;", "BT", "Ltb/p2g;", "ECT", "Ltb/d2g;", "BCT", "Ltb/i3g;", "TCT", "Ltb/k2g;", "DCT", "Ltb/g3g;", "PCT", "Ltb/h2g;", "CT", "Ltb/gic;", RPCDataItems.DT, "", "multiInstanceIdentifier", "Ltb/m2g;", "fetchEntity", "(Ljava/lang/String;)Ltb/m2g;", "entity", "Ltb/xhv;", "releaseEntity", "(Ltb/m2g;)V", "context", "createEntity", "(Ltb/h2g;)Ltb/m2g;", "Ltb/lky;", "getChannelComponent", "(Ltb/m2g;)Ltb/lky;", "Ltb/mky;", "getOpenArchDataComponent", "(Ltb/m2g;)Ltb/mky;", "Ltb/jky;", "getAnalysisComponent", "(Ltb/m2g;)Ltb/jky;", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchProxy implements IOpenArchProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004535810);
        t2o.a(1003487264);
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> createEntity(h2g<CT> h2gVar) {
        fyk fykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2g) ipChange.ipc$dispatch("6634039c", new Object[]{this, h2gVar});
        }
        ckf.g(h2gVar, "context");
        if (h2gVar instanceof fyk) {
            fykVar = (fyk) h2gVar;
        } else {
            fykVar = null;
        }
        if (fykVar == null) {
            return null;
        }
        oyk d = a2l.INSTANCE.d(fykVar);
        if (d instanceof m2g) {
            return d;
        }
        return null;
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> fetchEntity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2g) ipChange.ipc$dispatch("df8cd98a", new Object[]{this, str});
        }
        oyk g = a2l.INSTANCE.g(str);
        if (g instanceof m2g) {
            return g;
        }
        return null;
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> jky getAnalysisComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar) {
        oyk oykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jky) ipChange.ipc$dispatch("1dc4f3da", new Object[]{this, m2gVar});
        }
        ckf.g(m2gVar, "entity");
        if (m2gVar instanceof oyk) {
            oykVar = (oyk) m2gVar;
        } else {
            oykVar = null;
        }
        if (oykVar != null) {
            return oykVar.L();
        }
        return null;
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> lky getChannelComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar) {
        oyk oykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lky) ipChange.ipc$dispatch("c574626", new Object[]{this, m2gVar});
        }
        ckf.g(m2gVar, "entity");
        if (m2gVar instanceof oyk) {
            oykVar = (oyk) m2gVar;
        } else {
            oykVar = null;
        }
        if (oykVar != null) {
            return oykVar.M();
        }
        return null;
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> mky getOpenArchDataComponent(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar) {
        oyk oykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mky) ipChange.ipc$dispatch("e8741656", new Object[]{this, m2gVar});
        }
        ckf.g(m2gVar, "entity");
        if (m2gVar instanceof oyk) {
            oykVar = (oyk) m2gVar;
        } else {
            oykVar = null;
        }
        if (oykVar != null) {
            return (mky) oykVar.h();
        }
        return null;
    }

    @Override // com.taobao.kmp.live.flexa.openArch.IOpenArchProxy
    public <BT extends fic, ECT extends p2g<CT>, BCT extends d2g<BT, CT>, TCT extends i3g<CT, DT>, DCT extends k2g<CT>, PCT extends g3g<CT>, CT extends h2g<CT>, DT extends gic> void releaseEntity(m2g<BT, ECT, BCT, TCT, DCT, PCT, CT, DT> m2gVar) {
        oyk oykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afd51b", new Object[]{this, m2gVar});
            return;
        }
        ckf.g(m2gVar, "entity");
        if (m2gVar instanceof oyk) {
            oykVar = (oyk) m2gVar;
        } else {
            oykVar = null;
        }
        if (oykVar != null) {
            a2l.INSTANCE.q(oykVar);
        }
    }
}
