package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgBizParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountValueParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMessageHeader;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMsgFetchMode;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendTextParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSubscribeParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicRequestParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicUser;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgUnSubscribeParams;
import com.taobao.nanocompose.megability.ability.PowerMsgMsgFetchMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jur implements kvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> f22228a;

    static {
        t2o.a(1002438776);
        t2o.a(1002438751);
    }

    public static final xhv F(KSPowerMsgBizParams kSPowerMsgBizParams, final jur jurVar, final o0g o0gVar, ukm ukmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("288b4eaa", new Object[]{kSPowerMsgBizParams, jurVar, o0gVar, ukmVar});
        }
        ckf.g(ukmVar, "$this$constructClient");
        ukmVar.i(kSPowerMsgBizParams.getBizCode());
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.ptr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv J;
                    J = jur.J(o0g.this, (n0g) obj);
                    return J;
                }
            });
        } else {
            g1aVar = null;
        }
        ukmVar.k(g1aVar);
        ukmVar.n(new g1a() { // from class: tb.rtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv K;
                K = jur.K(o0g.this, (tlm) obj);
                return K;
            }
        });
        ukmVar.p(new g1a() { // from class: tb.str
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv L;
                L = jur.L(o0g.this, (bmm) obj);
                return L;
            }
        });
        ukmVar.m(new g1a() { // from class: tb.ttr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv M;
                M = jur.M(o0g.this, jurVar, (dlm) obj);
                return M;
            }
        });
        ukmVar.j(new g1a() { // from class: tb.utr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv G;
                G = jur.G(o0g.this, jurVar, (vkm) obj);
                return G;
            }
        });
        ukmVar.l(new g1a() { // from class: tb.vtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv H;
                H = jur.H(o0g.this, jurVar, (blm) obj);
                return H;
            }
        });
        ukmVar.o(new g1a() { // from class: tb.wtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv I;
                I = jur.I(o0g.this, jurVar, (ulm) obj);
                return I;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv G(o0g o0gVar, jur jurVar, vkm vkmVar) {
        g1a<KSPowerMsgCountMessage, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7078e93e", new Object[]{o0gVar, jurVar, vkmVar});
        }
        ckf.g(vkmVar, "result");
        if (!(o0gVar == null || (c = o0gVar.c()) == null)) {
            KSPowerMsgCountMessage kSPowerMsgCountMessage = new KSPowerMsgCountMessage();
            kSPowerMsgCountMessage.setValues(vkmVar.b());
            kSPowerMsgCountMessage.setHeader(jurVar.O(vkmVar.a()));
            c.invoke(kSPowerMsgCountMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv H(o0g o0gVar, jur jurVar, blm blmVar) {
        g1a<KSPowerMsgJoinMessage, xhv> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5ebc599", new Object[]{o0gVar, jurVar, blmVar});
        }
        ckf.g(blmVar, "result");
        if (!(o0gVar == null || (d = o0gVar.d()) == null)) {
            KSPowerMsgJoinMessage kSPowerMsgJoinMessage = new KSPowerMsgJoinMessage();
            kSPowerMsgJoinMessage.setTotalCount(blmVar.e());
            kSPowerMsgJoinMessage.setOnlineCount(blmVar.c());
            kSPowerMsgJoinMessage.setPageViewCount(blmVar.d());
            kSPowerMsgJoinMessage.setAddUsers(blmVar.a());
            kSPowerMsgJoinMessage.setHeader(jurVar.O(blmVar.b()));
            d.invoke(kSPowerMsgJoinMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv I(o0g o0gVar, jur jurVar, ulm ulmVar) {
        g1a<KSPowerMsgTextMessage, xhv> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f427ed9a", new Object[]{o0gVar, jurVar, ulmVar});
        }
        ckf.g(ulmVar, "result");
        if (!(o0gVar == null || (g = o0gVar.g()) == null)) {
            KSPowerMsgTextMessage kSPowerMsgTextMessage = new KSPowerMsgTextMessage();
            kSPowerMsgTextMessage.setValues(ulmVar.c());
            kSPowerMsgTextMessage.setHeader(jurVar.O(ulmVar.a()));
            g.invoke(kSPowerMsgTextMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv J(o0g o0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a96f1f34", new Object[]{o0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (o0gVar != null) {
            o0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv K(o0g o0gVar, tlm tlmVar) {
        g1a<y0g, xhv> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a6734182", new Object[]{o0gVar, tlmVar});
        }
        ckf.g(tlmVar, "result");
        if (!(o0gVar == null || (f = o0gVar.f()) == null)) {
            y0g y0gVar = new y0g();
            y0gVar.d(tlmVar.a());
            y0gVar.e(tlmVar.b());
            y0gVar.f(tlmVar.c());
            f.invoke(y0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv L(o0g o0gVar, bmm bmmVar) {
        g1a<b1g, xhv> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1d53e1fd", new Object[]{o0gVar, bmmVar});
        }
        ckf.g(bmmVar, "result");
        if (!(o0gVar == null || (h = o0gVar.h()) == null)) {
            b1g b1gVar = new b1g();
            b1gVar.d(bmmVar.a());
            b1gVar.e(bmmVar.b());
            b1gVar.f(bmmVar.c());
            h.invoke(b1gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv M(o0g o0gVar, jur jurVar, dlm dlmVar) {
        g1a<KSPowerMsgPowerMessage, xhv> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d6d7135d", new Object[]{o0gVar, jurVar, dlmVar});
        }
        ckf.g(dlmVar, "result");
        if (!(o0gVar == null || (e = o0gVar.e()) == null)) {
            KSPowerMsgPowerMessage kSPowerMsgPowerMessage = new KSPowerMsgPowerMessage();
            kSPowerMsgPowerMessage.setData(dlmVar.a());
            kSPowerMsgPowerMessage.setHeader(jurVar.O(dlmVar.b()));
            e.invoke(kSPowerMsgPowerMessage);
        }
        return xhv.INSTANCE;
    }

    public static final xhv Q(KSPowerMsgCountValueParams kSPowerMsgCountValueParams, jur jurVar, final p0g p0gVar, wkm wkmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("46c63d2c", new Object[]{kSPowerMsgCountValueParams, jurVar, p0gVar, wkmVar});
        }
        ckf.g(wkmVar, "$this$countValue");
        wkmVar.g(kSPowerMsgCountValueParams.getBizCode());
        wkmVar.l(kSPowerMsgCountValueParams.getTopic());
        wkmVar.k(kSPowerMsgCountValueParams.getParams());
        wkmVar.h(kSPowerMsgCountValueParams.getNeedACK());
        wkmVar.i(new g1a() { // from class: tb.iur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv R;
                R = jur.R(p0g.this, (jlm) obj);
                return R;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.gtr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv S;
                    S = jur.S(p0g.this, (n0g) obj);
                    return S;
                }
            });
        } else {
            g1aVar = null;
        }
        wkmVar.j(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv R(p0g p0gVar, jlm jlmVar) {
        g1a<w0g, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d45ef5b6", new Object[]{p0gVar, jlmVar});
        }
        ckf.g(jlmVar, "result");
        if (!(p0gVar == null || (c = p0gVar.c()) == null)) {
            w0g w0gVar = new w0g();
            w0gVar.c(jlmVar.a());
            w0gVar.d(jlmVar.b());
            c.invoke(w0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv S(p0g p0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8fb01d69", new Object[]{p0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (p0gVar != null) {
            p0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv U(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, final jur jurVar, final s0g s0gVar, elm elmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6691cfc5", new Object[]{kSPowerMsgTopicRequestParams, jurVar, s0gVar, elmVar});
        }
        ckf.g(elmVar, "$this$requestHistoryMessages");
        elmVar.g(kSPowerMsgTopicRequestParams.getBizCode());
        elmVar.l(kSPowerMsgTopicRequestParams.getTopic());
        elmVar.h(kSPowerMsgTopicRequestParams.getIndex());
        elmVar.k(kSPowerMsgTopicRequestParams.getPageSize());
        elmVar.j(new g1a() { // from class: tb.itr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv V;
                V = jur.V(s0g.this, jurVar, (alm) obj);
                return V;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.jtr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv W;
                    W = jur.W(s0g.this, (n0g) obj);
                    return W;
                }
            });
        } else {
            g1aVar = null;
        }
        elmVar.i(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv V(s0g s0gVar, jur jurVar, alm almVar) {
        g1a<r0g, xhv> c;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4d40ab1e", new Object[]{s0gVar, jurVar, almVar});
        }
        ckf.g(almVar, "result");
        if (!(s0gVar == null || (c = s0gVar.c()) == null)) {
            r0g r0gVar = new r0g();
            List<ulm> d = almVar.d();
            ArrayList arrayList4 = null;
            if (d != null) {
                arrayList = new ArrayList();
                for (ulm ulmVar : d) {
                    KSPowerMsgTextMessage kSPowerMsgTextMessage = new KSPowerMsgTextMessage();
                    kSPowerMsgTextMessage.setText(ulmVar.b());
                    kSPowerMsgTextMessage.setValues(ulmVar.c());
                    kSPowerMsgTextMessage.setHeader(jurVar.O(ulmVar.a()));
                    arrayList.add(kSPowerMsgTextMessage);
                }
            } else {
                arrayList = null;
            }
            r0gVar.h(arrayList);
            List<vkm> b = almVar.b();
            if (b != null) {
                arrayList2 = new ArrayList();
                for (vkm vkmVar : b) {
                    KSPowerMsgCountMessage kSPowerMsgCountMessage = new KSPowerMsgCountMessage();
                    kSPowerMsgCountMessage.setValues(vkmVar.b());
                    kSPowerMsgCountMessage.setHeader(jurVar.O(vkmVar.a()));
                    arrayList2.add(kSPowerMsgCountMessage);
                }
            } else {
                arrayList2 = null;
            }
            r0gVar.f(arrayList2);
            List<blm> c2 = almVar.c();
            if (c2 != null) {
                arrayList3 = new ArrayList();
                for (blm blmVar : c2) {
                    KSPowerMsgJoinMessage kSPowerMsgJoinMessage = new KSPowerMsgJoinMessage();
                    kSPowerMsgJoinMessage.setTotalCount(blmVar.e());
                    kSPowerMsgJoinMessage.setOnlineCount(blmVar.c());
                    kSPowerMsgJoinMessage.setPageViewCount(blmVar.d());
                    kSPowerMsgJoinMessage.setAddUsers(blmVar.a());
                    kSPowerMsgJoinMessage.setHeader(jurVar.O(blmVar.b()));
                    arrayList3.add(kSPowerMsgJoinMessage);
                }
            } else {
                arrayList3 = null;
            }
            r0gVar.g(arrayList3);
            List<dlm> a2 = almVar.a();
            if (a2 != null) {
                arrayList4 = new ArrayList();
                for (dlm dlmVar : a2) {
                    KSPowerMsgPowerMessage kSPowerMsgPowerMessage = new KSPowerMsgPowerMessage();
                    kSPowerMsgPowerMessage.setData(dlmVar.a());
                    kSPowerMsgPowerMessage.setHeader(jurVar.O(dlmVar.b()));
                    arrayList4.add(kSPowerMsgPowerMessage);
                }
            }
            r0gVar.e(arrayList4);
            c.invoke(r0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv W(s0g s0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c65f24fb", new Object[]{s0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (s0gVar != null) {
            s0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv Y(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, jur jurVar, final t0g t0gVar, flm flmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("dedca6a5", new Object[]{kSPowerMsgTopicRequestParams, jurVar, t0gVar, flmVar});
        }
        ckf.g(flmVar, "$this$requestTopicStatus");
        flmVar.g(kSPowerMsgTopicRequestParams.getBizCode());
        flmVar.l(kSPowerMsgTopicRequestParams.getTopic());
        flmVar.h(kSPowerMsgTopicRequestParams.getIndex());
        flmVar.k(kSPowerMsgTopicRequestParams.getPageSize());
        flmVar.j(new g1a() { // from class: tb.ntr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv Z;
                Z = jur.Z(t0g.this, (wlm) obj);
                return Z;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.otr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv a0;
                    a0 = jur.a0(t0g.this, (n0g) obj);
                    return a0;
                }
            });
        } else {
            g1aVar = null;
        }
        flmVar.i(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv Z(t0g t0gVar, wlm wlmVar) {
        g1a<z0g, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9c8626e3", new Object[]{t0gVar, wlmVar});
        }
        ckf.g(wlmVar, "result");
        if (!(t0gVar == null || (c = t0gVar.c()) == null)) {
            z0g z0gVar = new z0g();
            z0gVar.g(wlmVar.b());
            z0gVar.f(wlmVar.a());
            z0gVar.i(wlmVar.d());
            z0gVar.j(wlmVar.e());
            z0gVar.h(wlmVar.c());
            c.invoke(z0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv a0(t0g t0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7d6f347b", new Object[]{t0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (t0gVar != null) {
            t0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv c0(KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, jur jurVar, final u0g u0gVar, glm glmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1912aec6", new Object[]{kSPowerMsgTopicRequestParams, jurVar, u0gVar, glmVar});
        }
        ckf.g(glmVar, "$this$requestTopicUsers");
        glmVar.g(kSPowerMsgTopicRequestParams.getBizCode());
        glmVar.l(kSPowerMsgTopicRequestParams.getTopic());
        glmVar.h(kSPowerMsgTopicRequestParams.getIndex());
        glmVar.k(kSPowerMsgTopicRequestParams.getPageSize());
        glmVar.j(new g1a() { // from class: tb.xtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv d0;
                d0 = jur.d0(u0g.this, (ylm) obj);
                return d0;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.ytr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv e0;
                    e0 = jur.e0(u0g.this, (n0g) obj);
                    return e0;
                }
            });
        } else {
            g1aVar = null;
        }
        glmVar.i(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv d0(u0g u0gVar, ylm ylmVar) {
        g1a<a1g, xhv> c;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f7dbd0ef", new Object[]{u0gVar, ylmVar});
        }
        ckf.g(ylmVar, "result");
        if (!(u0gVar == null || (c = u0gVar.c()) == null)) {
            a1g a1gVar = new a1g();
            List<xlm> a2 = ylmVar.a();
            if (a2 != null) {
                arrayList = new ArrayList();
                for (xlm xlmVar : a2) {
                    KSPowerMsgTopicUser kSPowerMsgTopicUser = new KSPowerMsgTopicUser();
                    kSPowerMsgTopicUser.setUserID(xlmVar.c());
                    kSPowerMsgTopicUser.setNick(xlmVar.b());
                    kSPowerMsgTopicUser.setAddTime(xlmVar.a());
                    arrayList.add(kSPowerMsgTopicUser);
                }
            } else {
                arrayList = null;
            }
            a1gVar.b(arrayList);
            c.invoke(a1gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv e0(u0g u0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("cb1674f1", new Object[]{u0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (u0gVar != null) {
            u0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv g0(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, jur jurVar, final v0g v0gVar, hlm hlmVar) {
        dlm dlmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("22f67917", new Object[]{kSPowerMsgSendMessageParams, jurVar, v0gVar, hlmVar});
        }
        ckf.g(hlmVar, "$this$sendMessage");
        hlmVar.e(kSPowerMsgSendMessageParams.getBizCode());
        KSPowerMsgPowerMessage message = kSPowerMsgSendMessageParams.getMessage();
        g1a<? super bi8, xhv> g1aVar = null;
        if (message != null) {
            dlmVar = new dlm(a.h());
            dlmVar.c(message.getData());
            dlmVar.d(jurVar.N(message.getHeader()));
        } else {
            dlmVar = null;
        }
        hlmVar.f(dlmVar);
        hlmVar.h(new g1a() { // from class: tb.ktr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv h0;
                h0 = jur.h0(v0g.this, (jlm) obj);
                return h0;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.ltr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv i0;
                    i0 = jur.i0(v0g.this, (n0g) obj);
                    return i0;
                }
            });
        }
        hlmVar.g(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv h0(v0g v0gVar, jlm jlmVar) {
        g1a<w0g, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b353fa3e", new Object[]{v0gVar, jlmVar});
        }
        ckf.g(jlmVar, "result");
        if (!(v0gVar == null || (c = v0gVar.c()) == null)) {
            w0g w0gVar = new w0g();
            w0gVar.c(jlmVar.a());
            w0gVar.d(jlmVar.b());
            c.invoke(w0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv i0(v0g v0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3a3c388f", new Object[]{v0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (v0gVar != null) {
            v0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv k0(KSPowerMsgSendTextParams kSPowerMsgSendTextParams, jur jurVar, final x0g x0gVar, klm klmVar) {
        ulm ulmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("88bc1faa", new Object[]{kSPowerMsgSendTextParams, jurVar, x0gVar, klmVar});
        }
        ckf.g(klmVar, "$this$sendText");
        klmVar.e(kSPowerMsgSendTextParams.getBizCode());
        KSPowerMsgTextMessage message = kSPowerMsgSendTextParams.getMessage();
        g1a<? super bi8, xhv> g1aVar = null;
        if (message != null) {
            ulmVar = new ulm(a.h());
            ulmVar.e(message.getText());
            ulmVar.f(message.getValues());
            ulmVar.d(jurVar.N(message.getHeader()));
        } else {
            ulmVar = null;
        }
        klmVar.f(ulmVar);
        klmVar.h(new g1a() { // from class: tb.ztr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv l0;
                l0 = jur.l0(x0g.this, (jlm) obj);
                return l0;
            }
        });
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.aur
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv m0;
                    m0 = jur.m0(x0g.this, (n0g) obj);
                    return m0;
                }
            });
        }
        klmVar.g(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv l0(x0g x0gVar, jlm jlmVar) {
        g1a<w0g, xhv> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("4b403754", new Object[]{x0gVar, jlmVar});
        }
        ckf.g(jlmVar, "result");
        if (!(x0gVar == null || (c = x0gVar.c()) == null)) {
            w0g w0gVar = new w0g();
            w0gVar.c(jlmVar.a());
            w0gVar.d(jlmVar.b());
            c.invoke(w0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv m0(x0g x0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("398caac7", new Object[]{x0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (x0gVar != null) {
            x0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv p0(KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams, jur jurVar, final q0g q0gVar, rlm rlmVar) {
        g1a<? super bi8, xhv> g1aVar;
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c1107a27", new Object[]{kSPowerMsgSubscribeParams, jurVar, q0gVar, rlmVar});
        }
        ckf.g(rlmVar, "$this$subscribe");
        rlmVar.h(kSPowerMsgSubscribeParams.getBizCode());
        rlmVar.n(kSPowerMsgSubscribeParams.getTopic());
        rlmVar.k(kSPowerMsgSubscribeParams.getFrom());
        rlmVar.j(kSPowerMsgSubscribeParams.getExt());
        Iterator<E> it = PowerMsgMsgFetchMode.getEntries().iterator();
        while (true) {
            g1aVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String rawValue = ((PowerMsgMsgFetchMode) obj).getRawValue();
            KSPowerMsgMsgFetchMode mode = kSPowerMsgSubscribeParams.getMode();
            if (mode != null) {
                str = mode.getValue();
            } else {
                str = null;
            }
            if (ckf.b(rawValue, str)) {
                break;
            }
        }
        PowerMsgMsgFetchMode powerMsgMsgFetchMode = (PowerMsgMsgFetchMode) obj;
        if (powerMsgMsgFetchMode == null) {
            powerMsgMsgFetchMode = PowerMsgMsgFetchMode.PUSH_AND_PULL;
        }
        rlmVar.l(powerMsgMsgFetchMode);
        rlmVar.i(kSPowerMsgSubscribeParams.getBizTag());
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.htr
                @Override // tb.g1a
                public final Object invoke(Object obj2) {
                    xhv q0;
                    q0 = jur.q0(q0g.this, (n0g) obj2);
                    return q0;
                }
            });
        }
        rlmVar.m(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv q0(q0g q0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ce57aeac", new Object[]{q0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (q0gVar != null) {
            q0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public static final xhv s0(KSPowerMsgUnSubscribeParams kSPowerMsgUnSubscribeParams, jur jurVar, final q0g q0gVar, zlm zlmVar) {
        g1a<? super bi8, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e0d736ec", new Object[]{kSPowerMsgUnSubscribeParams, jurVar, q0gVar, zlmVar});
        }
        ckf.g(zlmVar, "$this$unSubscribe");
        zlmVar.f(kSPowerMsgUnSubscribeParams.getBizCode());
        zlmVar.j(kSPowerMsgUnSubscribeParams.getTopic());
        zlmVar.h(kSPowerMsgUnSubscribeParams.getFrom());
        zlmVar.g(kSPowerMsgUnSubscribeParams.getBizTag());
        g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar2 = jurVar.f22228a;
        if (g1aVar2 != null) {
            g1aVar = (g1a) g1aVar2.invoke(new g1a() { // from class: tb.mtr
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv t0;
                    t0 = jur.t0(q0g.this, (n0g) obj);
                    return t0;
                }
            });
        } else {
            g1aVar = null;
        }
        zlmVar.i(g1aVar);
        return xhv.INSTANCE;
    }

    public static final xhv t0(q0g q0gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f2b0482c", new Object[]{q0gVar, n0gVar});
        }
        ckf.g(n0gVar, AdvanceSetting.NETWORK_TYPE);
        if (q0gVar != null) {
            q0gVar.a();
        }
        return xhv.INSTANCE;
    }

    public void E(final KSPowerMsgBizParams kSPowerMsgBizParams, final o0g o0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaf2e9b", new Object[]{this, kSPowerMsgBizParams, o0gVar});
            return;
        }
        ckf.g(kSPowerMsgBizParams, "params");
        skm.INSTANCE.z(new g1a() { // from class: tb.qtr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv F;
                F = jur.F(KSPowerMsgBizParams.this, this, o0gVar, (ukm) obj);
                return F;
            }
        });
    }

    public final clm N(KSPowerMsgMessageHeader kSPowerMsgMessageHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clm) ipChange.ipc$dispatch("e1081725", new Object[]{this, kSPowerMsgMessageHeader});
        }
        if (kSPowerMsgMessageHeader == null) {
            return null;
        }
        clm clmVar = new clm(a.h());
        clmVar.w(kSPowerMsgMessageHeader.getType());
        clmVar.p(kSPowerMsgMessageHeader.getPriority());
        clmVar.q(kSPowerMsgMessageHeader.getQosLevel());
        clmVar.o(kSPowerMsgMessageHeader.getNeedACK());
        clmVar.r(kSPowerMsgMessageHeader.getSendFullTags());
        clmVar.t(kSPowerMsgMessageHeader.getTimestamp());
        clmVar.n(kSPowerMsgMessageHeader.getMessageID());
        clmVar.x(kSPowerMsgMessageHeader.getUserID());
        clmVar.v(kSPowerMsgMessageHeader.getTopic());
        clmVar.m(kSPowerMsgMessageHeader.getFrom());
        clmVar.u(kSPowerMsgMessageHeader.getTo());
        clmVar.s(kSPowerMsgMessageHeader.getTags());
        return clmVar;
    }

    public final KSPowerMsgMessageHeader O(clm clmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPowerMsgMessageHeader) ipChange.ipc$dispatch("a9a65d67", new Object[]{this, clmVar});
        }
        if (clmVar == null) {
            return null;
        }
        KSPowerMsgMessageHeader kSPowerMsgMessageHeader = new KSPowerMsgMessageHeader();
        kSPowerMsgMessageHeader.setType(clmVar.k());
        kSPowerMsgMessageHeader.setPriority(clmVar.d());
        kSPowerMsgMessageHeader.setQosLevel(clmVar.e());
        kSPowerMsgMessageHeader.setNeedACK(clmVar.c());
        kSPowerMsgMessageHeader.setSendFullTags(clmVar.f());
        kSPowerMsgMessageHeader.setTimestamp(clmVar.h());
        kSPowerMsgMessageHeader.setMessageID(clmVar.b());
        kSPowerMsgMessageHeader.setUserID(clmVar.l());
        kSPowerMsgMessageHeader.setTopic(clmVar.j());
        kSPowerMsgMessageHeader.setFrom(clmVar.a());
        kSPowerMsgMessageHeader.setTo(clmVar.i());
        kSPowerMsgMessageHeader.setTags(clmVar.g());
        return kSPowerMsgMessageHeader;
    }

    public void P(final KSPowerMsgCountValueParams kSPowerMsgCountValueParams, final p0g p0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f84b1a", new Object[]{this, kSPowerMsgCountValueParams, p0gVar});
            return;
        }
        ckf.g(kSPowerMsgCountValueParams, "params");
        skm.INSTANCE.D(new g1a() { // from class: tb.fur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv Q;
                Q = jur.Q(KSPowerMsgCountValueParams.this, this, p0gVar, (wkm) obj);
                return Q;
            }
        });
    }

    public void T(final KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, final s0g s0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb7ed7c", new Object[]{this, kSPowerMsgTopicRequestParams, s0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        skm.INSTANCE.H(new g1a() { // from class: tb.gur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv U;
                U = jur.U(KSPowerMsgTopicRequestParams.this, this, s0gVar, (elm) obj);
                return U;
            }
        });
    }

    public void X(final KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, final t0g t0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c103d7dc", new Object[]{this, kSPowerMsgTopicRequestParams, t0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        skm.INSTANCE.L(new g1a() { // from class: tb.cur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv Y;
                Y = jur.Y(KSPowerMsgTopicRequestParams.this, this, t0gVar, (flm) obj);
                return Y;
            }
        });
    }

    public void b0(final KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams, final u0g u0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f3bc96", new Object[]{this, kSPowerMsgTopicRequestParams, u0gVar});
            return;
        }
        ckf.g(kSPowerMsgTopicRequestParams, "params");
        skm.INSTANCE.P(new g1a() { // from class: tb.dur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv c0;
                c0 = jur.c0(KSPowerMsgTopicRequestParams.this, this, u0gVar, (glm) obj);
                return c0;
            }
        });
    }

    public void f0(final KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, final v0g v0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9e4cc7", new Object[]{this, kSPowerMsgSendMessageParams, v0gVar});
            return;
        }
        ckf.g(kSPowerMsgSendMessageParams, "params");
        skm.INSTANCE.T(new g1a() { // from class: tb.hur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv g0;
                g0 = jur.g0(KSPowerMsgSendMessageParams.this, this, v0gVar, (hlm) obj);
                return g0;
            }
        });
    }

    public void j0(final KSPowerMsgSendTextParams kSPowerMsgSendTextParams, final x0g x0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc7dd27", new Object[]{this, kSPowerMsgSendTextParams, x0gVar});
            return;
        }
        ckf.g(kSPowerMsgSendTextParams, "params");
        skm.INSTANCE.X(new g1a() { // from class: tb.eur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv k0;
                k0 = jur.k0(KSPowerMsgSendTextParams.this, this, x0gVar, (klm) obj);
                return k0;
            }
        });
    }

    public final void n0(g1a<? super g1a<? super n0g, xhv>, ? extends g1a<? super bi8, xhv>> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d868f49", new Object[]{this, g1aVar});
        } else {
            this.f22228a = g1aVar;
        }
    }

    public void o0(final KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams, final q0g q0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fb22fa", new Object[]{this, kSPowerMsgSubscribeParams, q0gVar});
            return;
        }
        ckf.g(kSPowerMsgSubscribeParams, "params");
        skm.INSTANCE.b0(new g1a() { // from class: tb.bur
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv p0;
                p0 = jur.p0(KSPowerMsgSubscribeParams.this, this, q0gVar, (rlm) obj);
                return p0;
            }
        });
    }

    public void r0(final KSPowerMsgUnSubscribeParams kSPowerMsgUnSubscribeParams, final q0g q0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff1819a", new Object[]{this, kSPowerMsgUnSubscribeParams, q0gVar});
            return;
        }
        ckf.g(kSPowerMsgUnSubscribeParams, "params");
        skm.INSTANCE.e0(new g1a() { // from class: tb.ftr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv s0;
                s0 = jur.s0(KSPowerMsgUnSubscribeParams.this, this, q0gVar, (zlm) obj);
                return s0;
            }
        });
    }
}
