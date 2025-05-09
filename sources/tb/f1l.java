package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchHeartBeatContext;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchMessageContext;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.b;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchPMMessageCategory;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageModel;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageRawResponse;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMSubscribeStatus;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMSubscribeType;
import com.taobao.uniinfra_kmp.common_utils.app.OSType;
import com.taobao.uniinfra_kmp.common_utils.app.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f1l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f1l INSTANCE = new f1l();

    /* renamed from: a  reason: collision with root package name */
    public static final List<tsy> f18944a = new ArrayList();
    public static final Map<String, tsy> b = new LinkedHashMap();
    public static boolean c;

    static {
        t2o.a(1004536545);
    }

    public static final String A0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edef05e3", new Object[]{tsyVar});
        }
        return " startSubscribe: " + tsyVar.o() + " :: " + tsyVar.k() + ' ' + tsyVar.g() + ' ' + tsyVar.h() + ' ' + tsyVar.e();
    }

    public static final xhv B0(tsy tsyVar, epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("868dc565", new Object[]{tsyVar, epyVar});
        }
        ckf.g(epyVar, "message");
        INSTANCE.f0(tsyVar, epyVar);
        return xhv.INSTANCE;
    }

    public static final String D0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("360fab30", new Object[]{tsyVar});
        }
        return "startUnSubscribe:" + tsyVar.o() + ' ' + tsyVar.k() + ' ' + tsyVar.n();
    }

    public static final String H(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("330e210c", new Object[]{tsyVar});
        }
        return " bindTaskFinished: " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final xhv J(Ref$BooleanRef ref$BooleanRef, cvs cvsVar, tsy tsyVar, g1a g1aVar, Ref$BooleanRef ref$BooleanRef2, Ref$IntRef ref$IntRef, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("dec2387a", new Object[]{ref$BooleanRef, cvsVar, tsyVar, g1aVar, ref$BooleanRef2, ref$IntRef, new Integer(i), new Boolean(z)});
        }
        if (z) {
            ref$BooleanRef.element = true;
            cvsVar.d();
            tsyVar.B(PMSubscribeStatus.PMSubscribeStateBinded);
            INSTANCE.a0(tsyVar, g1aVar);
        } else if (!ref$BooleanRef2.element) {
            int i2 = ref$IntRef.element;
            if (i2 <= i) {
                ref$IntRef.element = i2 + 1;
                INSTANCE.z0(tsyVar);
            } else {
                ref$BooleanRef.element = true;
                cvsVar.d();
                tsyVar.B(PMSubscribeStatus.PMSubscribeStateBindError);
                INSTANCE.a0(tsyVar, g1aVar);
            }
        }
        return xhv.INSTANCE;
    }

    public static final xhv K(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, tsy tsyVar, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d96e799c", new Object[]{ref$BooleanRef, ref$BooleanRef2, tsyVar, g1aVar});
        }
        if (!ref$BooleanRef.element) {
            ref$BooleanRef2.element = true;
            tsyVar.B(PMSubscribeStatus.PMSubscribeStateBindTimeout);
            INSTANCE.d0(tsyVar, g1aVar);
        }
        return xhv.INSTANCE;
    }

    public static final String M(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("646ac4cb", new Object[]{tsyVar});
        }
        return " executePowerMsgUnBind:" + tsyVar.o() + ' ' + tsyVar.k() + ' ' + tsyVar.n();
    }

    public static final xhv N(Ref$BooleanRef ref$BooleanRef, cvs cvsVar, tsy tsyVar, g1a g1aVar, Ref$BooleanRef ref$BooleanRef2, Ref$IntRef ref$IntRef, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("689ea427", new Object[]{ref$BooleanRef, cvsVar, tsyVar, g1aVar, ref$BooleanRef2, ref$IntRef, new Integer(i), new Boolean(z)});
        }
        if (z) {
            ref$BooleanRef.element = true;
            cvsVar.d();
            tsyVar.B(PMSubscribeStatus.PMSubscribeStateUnBinded);
            INSTANCE.l0(tsyVar, g1aVar);
        } else if (!ref$BooleanRef2.element) {
            int i2 = ref$IntRef.element;
            if (i2 <= i) {
                ref$IntRef.element = i2 + 1;
                INSTANCE.C0(tsyVar);
            } else {
                ref$BooleanRef.element = true;
                cvsVar.d();
                tsyVar.B(PMSubscribeStatus.PMSubscribeStateUnBindError);
                INSTANCE.l0(tsyVar, g1aVar);
            }
        }
        return xhv.INSTANCE;
    }

    public static final xhv O(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, final tsy tsyVar, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("187bbe87", new Object[]{ref$BooleanRef, ref$BooleanRef2, tsyVar, g1aVar});
        }
        if (!ref$BooleanRef.element) {
            f1l f1lVar = INSTANCE;
            f1lVar.F(new d1a() { // from class: tb.o0l
                @Override // tb.d1a
                public final Object invoke() {
                    String P;
                    P = f1l.P(tsy.this);
                    return P;
                }
            });
            ref$BooleanRef2.element = true;
            tsyVar.B(PMSubscribeStatus.PMSubscribeStateUnBindTimeout);
            f1lVar.n0(tsyVar, g1aVar);
        }
        return xhv.INSTANCE;
    }

    public static final String P(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bafa99c", new Object[]{tsyVar});
        }
        return " unbind timeout:" + tsyVar.o() + ' ' + tsyVar.k() + ' ' + tsyVar.n();
    }

    public static final xhv R(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8b4abf18", new Object[]{new Boolean(z)});
        }
        f1l f1lVar = INSTANCE;
        f1lVar.F(new d1a() { // from class: tb.e0l
            @Override // tb.d1a
            public final Object invoke() {
                String S;
                S = f1l.S();
                return S;
            }
        });
        c = false;
        f1lVar.r0();
        return xhv.INSTANCE;
    }

    public static final String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb973b0c", new Object[0]);
        }
        return "executePowerMsgBind finished";
    }

    public static final xhv T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4fdca137", new Object[]{new Boolean(z)});
        }
        c = false;
        INSTANCE.r0();
        return xhv.INSTANCE;
    }

    public static final String V(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faba9181", new Object[]{tsyVar});
        }
        return " executeUnBindTaskFinished:" + tsyVar.o() + ' ' + tsyVar.k() + ' ' + tsyVar.n();
    }

    public static final String b0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6765cc0d", new Object[]{tsyVar});
        }
        return " processBindResult start: " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final String c0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("971d000e", new Object[]{tsyVar});
        }
        return " processBindResult end: " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final String e0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("662651f2", new Object[]{tsyVar});
        }
        return " BindTaskTimeout: " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final String g0(tsy tsyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bd0518", new Object[]{tsyVar, map});
        }
        return " processPowerMsgReuslt bind :" + tsyVar.o() + "::" + tsyVar.k() + "::" + map;
    }

    public static final String h0(tsy tsyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60c92ef7", new Object[]{tsyVar, map});
        }
        return " processPowerMsgReuslt bind error:" + tsyVar.o() + "::" + tsyVar.k() + "::" + map;
    }

    public static final String i0(tsy tsyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ed558d6", new Object[]{tsyVar, map});
        }
        return " processPowerMsgReuslt unbind :" + tsyVar.o() + "::" + tsyVar.k() + ":: " + map;
    }

    public static final String j0(tsy tsyVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ce182b5", new Object[]{tsyVar, map});
        }
        return " processPowerMsgReuslt unbind error :" + tsyVar.o() + "::" + tsyVar.k() + "::" + map;
    }

    public static final String k0(epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3c1e44c", new Object[]{epyVar});
        }
        return " processPowerMsgReuslt error: topic is not match " + epyVar.r();
    }

    public static final String m0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb4f1cc0", new Object[]{tsyVar});
        }
        return " processUnBindResult:" + tsyVar.o() + ' ' + tsyVar.k() + ' ' + tsyVar.n();
    }

    public static final String o0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea0cc557", new Object[]{tsyVar});
        }
        return " BindTaskTimeout: " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final String q0(Ref$ObjectRef ref$ObjectRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93c2b010", new Object[]{ref$ObjectRef});
        }
        return "rebuildPmParams:" + ref$ObjectRef.element;
    }

    public static final String s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ea087df", new Object[0]);
        }
        return " try runNextTask: " + f18944a.size();
    }

    public static final String t0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfbccc45", new Object[]{tsyVar});
        }
        return " runNextTask:" + tsyVar.o() + " :: " + tsyVar.k() + ":: " + tsyVar.n();
    }

    public static final xhv u0(tsy tsyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("628462f9", new Object[]{tsyVar, new Boolean(z)});
        }
        INSTANCE.Q(tsyVar);
        return xhv.INSTANCE;
    }

    public static final String w0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5123d39", new Object[]{tsyVar});
        }
        return " try unbindmodel " + tsyVar.o() + ' ' + tsyVar.k();
    }

    public static final xhv y0(u1a u1aVar, w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("819cd180", new Object[]{u1aVar, w0gVar});
        }
        ckf.g(w0gVar, AdvanceSetting.NETWORK_TYPE);
        if (u1aVar != null) {
            u1aVar.invoke(w0gVar.a(), w0gVar.b());
        }
        return xhv.INSTANCE;
    }

    public final void C0(final tsy tsyVar) {
        Map<String, Object> map;
        nky j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4c230d", new Object[]{this, tsyVar});
            return;
        }
        F(new d1a() { // from class: tb.p0l
            @Override // tb.d1a
            public final Object invoke() {
                String D0;
                D0 = f1l.D0(tsy.this);
                return D0;
            }
        });
        String o = tsyVar.o();
        tsy W = W(o);
        if (!(W == null || (j = W.j()) == null)) {
            j.unsubscribe(o);
        }
        if (W != null) {
            map = W.i();
        } else {
            map = null;
        }
        Z(tsyVar, map);
    }

    public final void E(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56eb4556", new Object[]{this, tsyVar});
            return;
        }
        ((ArrayList) f18944a).add(tsyVar);
        r0();
    }

    public final void E0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8597952", new Object[]{this, tsyVar});
            return;
        }
        ckf.g(tsyVar, "model");
        tsyVar.C(PMSubscribeType.PMSubscribeTypeBind);
        E(tsyVar);
    }

    public final void F(d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9ad281", new Object[]{this, d1aVar});
        } else {
            pus.INSTANCE.i("LiveEngine-MessageManager", "", d1aVar);
        }
    }

    public final void F0(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac444eb", new Object[]{this, tsyVar});
            return;
        }
        ckf.g(tsyVar, "model");
        tsyVar.C(PMSubscribeType.PMSubscribeTypeUnBind);
        E(tsyVar);
    }

    public final void G(final tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e7ed33", new Object[]{this, tsyVar});
            return;
        }
        F(new d1a() { // from class: tb.d0l
            @Override // tb.d1a
            public final Object invoke() {
                String H;
                H = f1l.H(tsy.this);
                return H;
            }
        });
        ((ArrayList) f18944a).remove(tsyVar);
        tsyVar.A(null);
        c = false;
        r0();
    }

    public final void I(final tsy tsyVar, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341eed34", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        tsyVar.B(PMSubscribeStatus.PMSubscribeStateBinding);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        final cvs b2 = cvs.Companion.b();
        tsyVar.A(new g1a(b2, tsyVar, g1aVar, ref$BooleanRef, ref$IntRef, 3) { // from class: tb.f0l
            public final /* synthetic */ cvs b;
            public final /* synthetic */ tsy c;
            public final /* synthetic */ g1a d;
            public final /* synthetic */ Ref$BooleanRef e;
            public final /* synthetic */ Ref$IntRef f;

            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv J;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                J = f1l.J(Ref$BooleanRef.this, this.b, this.c, this.d, this.e, this.f, 3, booleanValue);
                return J;
            }
        });
        z0(tsyVar);
        b2.e(3000.0d, new d1a() { // from class: tb.g0l
            @Override // tb.d1a
            public final Object invoke() {
                xhv K;
                K = f1l.K(Ref$BooleanRef.this, ref$BooleanRef, tsyVar, g1aVar);
                return K;
            }
        });
    }

    public final void L(final tsy tsyVar, final g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce50521b", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        F(new d1a() { // from class: tb.c1l
            @Override // tb.d1a
            public final Object invoke() {
                String M;
                M = f1l.M(tsy.this);
                return M;
            }
        });
        tsyVar.B(PMSubscribeStatus.PMSubscribeStateUnBinding);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        final cvs b2 = cvs.Companion.b();
        tsyVar.A(new g1a(b2, tsyVar, g1aVar, ref$BooleanRef, ref$IntRef, 3) { // from class: tb.d1l
            public final /* synthetic */ cvs b;
            public final /* synthetic */ tsy c;
            public final /* synthetic */ g1a d;
            public final /* synthetic */ Ref$BooleanRef e;
            public final /* synthetic */ Ref$IntRef f;

            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv N;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                N = f1l.N(Ref$BooleanRef.this, this.b, this.c, this.d, this.e, this.f, 3, booleanValue);
                return N;
            }
        });
        tsy W = W(tsyVar.o());
        if (W != null && ckf.b(W.k(), tsyVar.k())) {
            W.C(PMSubscribeType.PMSubscribeTypeUnBind);
            W.A(tsyVar.l());
        }
        C0(tsyVar);
        b2.e(3000.0d, new d1a() { // from class: tb.e1l
            @Override // tb.d1a
            public final Object invoke() {
                xhv O;
                O = f1l.O(Ref$BooleanRef.this, ref$BooleanRef, tsyVar, g1aVar);
                return O;
            }
        });
    }

    public final void Q(tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68212e02", new Object[]{this, tsyVar});
        } else if (tsyVar.n() == PMSubscribeType.PMSubscribeTypeBind) {
            tsy W = W(tsyVar.o());
            if (W == null || !ckf.b(W.k(), tsyVar.k())) {
                I(tsyVar, new g1a() { // from class: tb.z0l
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv R;
                        R = f1l.R(((Boolean) obj).booleanValue());
                        return R;
                    }
                });
            } else {
                G(tsyVar);
            }
        } else if (tsyVar.n() == PMSubscribeType.PMSubscribeTypeUnBind) {
            tsy W2 = W(tsyVar.o());
            if (W2 == null || !ckf.b(W2.k(), tsyVar.k())) {
                U(tsyVar);
            } else {
                L(tsyVar, new g1a() { // from class: tb.a1l
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv T;
                        T = f1l.T(((Boolean) obj).booleanValue());
                        return T;
                    }
                });
            }
        }
    }

    public final void U(final tsy tsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1467449a", new Object[]{this, tsyVar});
            return;
        }
        F(new d1a() { // from class: tb.c0l
            @Override // tb.d1a
            public final Object invoke() {
                String V;
                V = f1l.V(tsy.this);
                return V;
            }
        });
        c = false;
        ((ArrayList) f18944a).remove(tsyVar);
        g1a<Boolean, xhv> d = tsyVar.d();
        if (d != null) {
            d.invoke(Boolean.TRUE);
        }
        tsyVar.A(null);
        tsyVar.q(null);
        tsyVar.E(null);
        r0();
    }

    public final tsy W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tsy) ipChange.ipc$dispatch("1bd7e999", new Object[]{this, str});
        }
        ckf.g(str, "topic");
        return (tsy) ((LinkedHashMap) b).get(str);
    }

    public final Map<String, String> X(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f8f3781b", new Object[]{this, map});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                linkedHashMap.putAll(X((Map) value));
            } else if (value instanceof String) {
                linkedHashMap.put(key, ((String) value).toString());
            }
        }
        return linkedHashMap;
    }

    public final tsy Y(String str) {
        LiveDetailResponseData liveDetailResponseData;
        hyk h;
        wt4 m;
        x4j D;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tsy) ipChange.ipc$dispatch("250725f3", new Object[]{this, str});
        }
        oyk g = a2l.INSTANCE.g(str);
        tsy tsyVar = null;
        if (g == null || (h = g.h()) == null || (m = h.m()) == null || (D = m.D()) == null) {
            liveDetailResponseData = null;
        } else {
            liveDetailResponseData = D.a();
        }
        if (!(liveDetailResponseData == null || liveDetailResponseData.getTopic() == null)) {
            tsyVar = new tsy();
            String topic = liveDetailResponseData.getTopic();
            ckf.d(topic);
            tsyVar.D(topic);
            tsyVar.s(String.valueOf(liveDetailResponseData.getLiveId()));
            tsyVar.w(true);
            tsyVar.v(true);
            if (str == null) {
                str = "";
            }
            tsyVar.r(str);
            if (a.d() == OSType.ANDROID) {
                z = false;
            }
            tsyVar.u(z);
        }
        return tsyVar;
    }

    public final void Z(tsy tsyVar, Map<String, ? extends Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de9057f", new Object[]{this, tsyVar, map});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("topic", tsyVar.o());
        linkedHashMap.put("pmSession", tsyVar.k());
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map<String, String> X = X(linkedHashMap);
        if (tsyVar.n() == PMSubscribeType.PMSubscribeTypeUnBind) {
            str = "Page_TaobaoLiveWatch_Button-unsubscribeMonitor";
        } else {
            str = "Page_TaobaoLiveWatch_Button-subscribeMonitor";
        }
        ivs.INSTANCE.K("Page_TaobaoLiveWatch", str, "", "", X, 2101);
    }

    public final void a0(final tsy tsyVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8617f9", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        F(new d1a() { // from class: tb.h0l
            @Override // tb.d1a
            public final Object invoke() {
                String b0;
                b0 = f1l.b0(tsy.this);
                return b0;
            }
        });
        if (tsyVar.m() == PMSubscribeStatus.PMSubscribeStateBindError) {
            ((ArrayList) f18944a).remove(tsyVar);
            b.remove(tsyVar.o());
        } else {
            b.put(tsyVar.o(), tsyVar);
            ((ArrayList) f18944a).remove(tsyVar);
        }
        if (g1aVar != null) {
            g1aVar.invoke(Boolean.TRUE);
        }
        g1a<Boolean, xhv> c2 = tsyVar.c();
        if (c2 != null) {
            c2.invoke(Boolean.TRUE);
        }
        tsyVar.A(null);
        F(new d1a() { // from class: tb.i0l
            @Override // tb.d1a
            public final Object invoke() {
                String c0;
                c0 = f1l.c0(tsy.this);
                return c0;
            }
        });
    }

    public final void d0(final tsy tsyVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d2c272", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        F(new d1a() { // from class: tb.j0l
            @Override // tb.d1a
            public final Object invoke() {
                String e0;
                e0 = f1l.e0(tsy.this);
                return e0;
            }
        });
        tsyVar.B(PMSubscribeStatus.PMSubscribeStateBindTimeout);
        a0(tsyVar, g1aVar);
    }

    public final void f0(final tsy tsyVar, final epy epyVar) {
        OpenArchPMMessageCategory openArchPMMessageCategory;
        u1a<tsy, epy, xhv> b2;
        PMMessageRawResponse rawResponse;
        PMMessageRawResponse rawResponse2;
        PMMessageRawResponse rawResponse3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beefdc02", new Object[]{this, tsyVar, epyVar});
        } else if (!ckf.b(tsyVar.o(), epyVar.r())) {
            F(new d1a() { // from class: tb.v0l
                @Override // tb.d1a
                public final Object invoke() {
                    String k0;
                    k0 = f1l.k0(epy.this);
                    return k0;
                }
            });
        } else if (epyVar.n() != null) {
            u1a<tsy, epy, xhv> b3 = tsyVar.b();
            if (b3 != null) {
                b3.invoke(tsyVar, epyVar);
            }
        } else {
            PMMessageResponse q = epyVar.q();
            final Map<String, Object> map = null;
            if (q != null) {
                openArchPMMessageCategory = q.getMessageCategory();
            } else {
                openArchPMMessageCategory = null;
            }
            PMMessageResponse q2 = epyVar.q();
            if (!(q2 == null || (rawResponse3 = q2.getRawResponse()) == null)) {
                map = rawResponse3.getResult();
            }
            PMMessageResponse q3 = epyVar.q();
            if (!(q3 == null || (rawResponse2 = q3.getRawResponse()) == null)) {
                rawResponse2.getValues();
            }
            PMMessageResponse q4 = epyVar.q();
            if (!(q4 == null || (rawResponse = q4.getRawResponse()) == null)) {
                rawResponse.getText();
            }
            if (openArchPMMessageCategory == OpenArchPMMessageCategory.onSubscribed) {
                if (tsyVar.n() == PMSubscribeType.PMSubscribeTypeBind) {
                    F(new d1a() { // from class: tb.r0l
                        @Override // tb.d1a
                        public final Object invoke() {
                            String g0;
                            g0 = f1l.g0(tsy.this, map);
                            return g0;
                        }
                    });
                    g1a<Boolean, xhv> l = tsyVar.l();
                    if (l != null) {
                        l.invoke(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                F(new d1a() { // from class: tb.s0l
                    @Override // tb.d1a
                    public final Object invoke() {
                        String h0;
                        h0 = f1l.h0(tsy.this, map);
                        return h0;
                    }
                });
            } else if (openArchPMMessageCategory == OpenArchPMMessageCategory.onUnSubscribed) {
                if (tsyVar.n() == PMSubscribeType.PMSubscribeTypeUnBind) {
                    F(new d1a() { // from class: tb.t0l
                        @Override // tb.d1a
                        public final Object invoke() {
                            String i0;
                            i0 = f1l.i0(tsy.this, map);
                            return i0;
                        }
                    });
                    g1a<Boolean, xhv> l2 = tsyVar.l();
                    if (l2 != null) {
                        l2.invoke(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                F(new d1a() { // from class: tb.u0l
                    @Override // tb.d1a
                    public final Object invoke() {
                        String j0;
                        j0 = f1l.j0(tsy.this, map);
                        return j0;
                    }
                });
            } else if (openArchPMMessageCategory == OpenArchPMMessageCategory.onErrorArrived) {
                g1a<Boolean, xhv> l3 = tsyVar.l();
                if (l3 != null) {
                    l3.invoke(Boolean.FALSE);
                }
            } else if (openArchPMMessageCategory == OpenArchPMMessageCategory.onTextMessageArrived || openArchPMMessageCategory == OpenArchPMMessageCategory.onJoinMessageArrived || openArchPMMessageCategory == OpenArchPMMessageCategory.onCountMessageArrived || openArchPMMessageCategory == OpenArchPMMessageCategory.onMessageArrived) {
                u1a<tsy, epy, xhv> b4 = tsyVar.b();
                if (b4 != null) {
                    b4.invoke(tsyVar, epyVar);
                }
            } else if (openArchPMMessageCategory == OpenArchPMMessageCategory.onReceiveHistoryMsg && (b2 = tsyVar.b()) != null) {
                b2.invoke(tsyVar, epyVar);
            }
        }
    }

    public final void l0(final tsy tsyVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40df320", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        F(new d1a() { // from class: tb.n0l
            @Override // tb.d1a
            public final Object invoke() {
                String m0;
                m0 = f1l.m0(tsy.this);
                return m0;
            }
        });
        ((ArrayList) f18944a).remove(tsyVar);
        b.remove(tsyVar.o());
        if (g1aVar != null) {
            g1aVar.invoke(Boolean.TRUE);
        }
        g1a<Boolean, xhv> d = tsyVar.d();
        if (d != null) {
            d.invoke(Boolean.TRUE);
        }
        tsyVar.A(null);
        tsyVar.q(null);
        tsyVar.E(null);
    }

    public final void n0(final tsy tsyVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8288c7ab", new Object[]{this, tsyVar, g1aVar});
            return;
        }
        F(new d1a() { // from class: tb.w0l
            @Override // tb.d1a
            public final Object invoke() {
                String o0;
                o0 = f1l.o0(tsy.this);
                return o0;
            }
        });
        tsyVar.B(PMSubscribeStatus.PMSubscribeStateBindTimeout);
        l0(tsyVar, g1aVar);
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.Map] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> p0(tb.tsy r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.f1l.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "5bc716b3"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.util.Map r5 = (java.util.Map) r5
            return r5
        L_0x0018:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.util.Map r1 = r5.i()
            if (r1 == 0) goto L_0x0028
            java.util.Map r1 = kotlin.collections.a.t(r1)
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            r0.element = r1
            if (r1 == 0) goto L_0x0079
            java.lang.String r2 = "needEventWhenIgnorePv"
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = tb.tvr.c(r1)
            if (r1 == 0) goto L_0x0044
            T r1 = r0.element
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "true"
            r1.put(r2, r3)
        L_0x0044:
            T r1 = r0.element
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "liveClientParams"
            java.lang.Object r1 = r1.get(r2)
            boolean r3 = r1 instanceof java.util.Map
            if (r3 == 0) goto L_0x0079
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r1 = kotlin.collections.a.t(r1)
            java.lang.String r3 = "pmSession"
            java.lang.String r5 = r5.k()
            r1.put(r3, r5)
            java.lang.String r5 = "pmClientType"
            boolean r3 = r1.containsKey(r5)
            if (r3 != 0) goto L_0x0072
            java.lang.String r3 = "kmp"
            r1.put(r5, r3)
        L_0x0072:
            T r5 = r0.element
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r2, r1)
        L_0x0079:
            tb.q0l r5 = new tb.q0l
            r5.<init>()
            r4.F(r5)
            T r5 = r0.element
            java.util.Map r5 = (java.util.Map) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f1l.p0(tb.tsy):java.util.Map");
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7f51ca", new Object[]{this});
            return;
        }
        F(new d1a() { // from class: tb.b0l
            @Override // tb.d1a
            public final Object invoke() {
                String s0;
                s0 = f1l.s0();
                return s0;
            }
        });
        if (!c) {
            ArrayList arrayList = (ArrayList) f18944a;
            if (!arrayList.isEmpty()) {
                final tsy tsyVar = (tsy) i04.a0(arrayList);
                f1l f1lVar = INSTANCE;
                f1lVar.F(new d1a() { // from class: tb.m0l
                    @Override // tb.d1a
                    public final Object invoke() {
                        String t0;
                        t0 = f1l.t0(tsy.this);
                        return t0;
                    }
                });
                c = true;
                if (f1lVar.v0(tsyVar, new g1a() { // from class: tb.x0l
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv u0;
                        u0 = f1l.u0(tsy.this, ((Boolean) obj).booleanValue());
                        return u0;
                    }
                })) {
                    f1lVar.Q(tsyVar);
                }
            }
        }
    }

    public final boolean v0(tsy tsyVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dfea749", new Object[]{this, tsyVar, g1aVar})).booleanValue();
        }
        final tsy W = W(tsyVar.o());
        if (W == null || tsyVar.n() != PMSubscribeType.PMSubscribeTypeBind || ((W.m() != PMSubscribeStatus.PMSubscribeStateBinding && W.m() != PMSubscribeStatus.PMSubscribeStateBindTimeout && W.m() != PMSubscribeStatus.PMSubscribeStateBinded) || ckf.b(W.k(), tsyVar.k()))) {
            return true;
        }
        F(new d1a() { // from class: tb.b1l
            @Override // tb.d1a
            public final Object invoke() {
                String w0;
                w0 = f1l.w0(tsy.this);
                return w0;
            }
        });
        L(W, g1aVar);
        return false;
    }

    public final void x0(PMMessageModel pMMessageModel, final u1a<? super Integer, ? super Map<String, ? extends Object>, xhv> u1aVar) {
        nky j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62199f7f", new Object[]{this, pMMessageModel, u1aVar});
            return;
        }
        ckf.g(pMMessageModel, "model");
        tsy W = W(String.valueOf(pMMessageModel.getTopic()));
        KSPowerMsgPowerMessage kSPowerMsgPowerMessage = new KSPowerMsgPowerMessage();
        kSPowerMsgPowerMessage.setData(pMMessageModel.getMsg());
        kSPowerMsgPowerMessage.setHeader(pMMessageModel);
        KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams = new KSPowerMsgSendMessageParams();
        kSPowerMsgSendMessageParams.setBizCode(W != null ? Integer.valueOf(W.a()) : null);
        kSPowerMsgSendMessageParams.setMessage(kSPowerMsgPowerMessage);
        if (W != null && (j = W.j()) != null) {
            j.c(kSPowerMsgSendMessageParams, new g1a() { // from class: tb.y0l
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv y0;
                    y0 = f1l.y0(u1a.this, (w0g) obj);
                    return y0;
                }
            });
        }
    }

    public final void z0(final tsy tsyVar) {
        List<b> list;
        com.taobao.kmp.nexus.arch.openArch.service.message.context.a aVar;
        OpenArchHeartBeatContext openArchHeartBeatContext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4ecbd4", new Object[]{this, tsyVar});
            return;
        }
        F(new d1a() { // from class: tb.k0l
            @Override // tb.d1a
            public final Object invoke() {
                String A0;
                A0 = f1l.A0(tsy.this);
                return A0;
            }
        });
        String o = tsyVar.o();
        o1l a2 = o1l.Companion.a(o);
        if (!tsyVar.f()) {
            a2.i(tsyVar.f());
        }
        if (tsyVar.g()) {
            com.taobao.kmp.nexus.arch.openArch.service.message.context.a a3 = com.taobao.kmp.nexus.arch.openArch.service.message.context.a.Companion.a(o);
            list = b.Companion.b(o);
            aVar = a3;
        } else {
            aVar = null;
            list = null;
        }
        if (tsyVar.h()) {
            OpenArchHeartBeatContext a4 = OpenArchHeartBeatContext.Companion.a(o);
            a4.setRecordCurrentStatusAction(tsyVar.p());
            openArchHeartBeatContext = a4;
        } else {
            openArchHeartBeatContext = null;
        }
        yzk c2 = yzk.Companion.c(tsyVar.k(), new g1a() { // from class: tb.l0l
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv B0;
                B0 = f1l.B0(tsy.this, (epy) obj);
                return B0;
            }
        });
        OpenArchMessageContext openArchMessageContext = new OpenArchMessageContext(o, a2, aVar, list, openArchHeartBeatContext, c2, null, null, tck.DETECT_WIDTH, null);
        openArchMessageContext.updateContextTopic(o);
        h1l h1lVar = new h1l(openArchMessageContext);
        h1lVar.l();
        oyk g = a2l.INSTANCE.g(tsyVar.e());
        if (g != null) {
            str = h1lVar.g(g);
        } else {
            Map<String, Object> p0 = p0(tsyVar);
            if (p0 == null || (str = xrf.c(p0)) == null) {
                str = "";
            }
        }
        c2.M(h1lVar);
        h1lVar.n(o, str);
        tsyVar.y(h1lVar);
        Z(tsyVar, xrf.b(str));
    }
}
