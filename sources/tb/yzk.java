package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.CDNMessagePayload;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.CDNMessageResponse;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchPMMessageCategory;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yzk implements h3d, jic {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f32431a;
    public h1l b;
    public g1a<? super epy, xhv> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536568);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final yzk a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yzk) ipChange.ipc$dispatch("ea625c9b", new Object[]{this, str});
            }
            yzk b = b();
            b.C(str);
            return b;
        }

        public final yzk b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yzk) ipChange.ipc$dispatch("5eed0f34", new Object[]{this});
            }
            return new yzk();
        }

        public final yzk c(String str, g1a<? super epy, xhv> g1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yzk) ipChange.ipc$dispatch("3a9ab904", new Object[]{this, str, g1aVar});
            }
            ckf.g(g1aVar, "messageDispatchListener");
            yzk a2 = a(str);
            a2.L(g1aVar);
            return a2;
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536567);
        t2o.a(1004536563);
        t2o.a(1002438710);
    }

    public static final String A(Ref$BooleanRef ref$BooleanRef, iky ikyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c58bb656", new Object[]{ref$BooleanRef, ikyVar});
        }
        return "messageValidCheck : " + ref$BooleanRef.element + " :: " + ikyVar;
    }

    public static final String B(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56fa99e3", new Object[]{pMMessageResponse});
        }
        return "onSubscribed " + pMMessageResponse;
    }

    public static final String H(Ref$ObjectRef ref$ObjectRef, h1l h1lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467dcb2", new Object[]{ref$ObjectRef, h1lVar});
        }
        return "messageValidCheck : " + ref$ObjectRef.element + " :: " + h1lVar;
    }

    public static final String u(epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a8922aa", new Object[]{epyVar});
        }
        return "dispatchCDNMessage : " + epyVar;
    }

    public static final xhv w(final PMMessageResponse pMMessageResponse, final yzk yzkVar) {
        h1l F;
        a0l h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("439fbceb", new Object[]{pMMessageResponse, yzkVar});
        }
        pus pusVar = pus.INSTANCE;
        pusVar.i("PM", "", new d1a() { // from class: tb.wzk
            @Override // tb.d1a
            public final Object invoke() {
                String x;
                x = yzk.x(PMMessageResponse.this);
                return x;
            }
        });
        if (!(pMMessageResponse.getMessageCategory() != OpenArchPMMessageCategory.onSubscribed || (F = yzkVar.F()) == null || (h = F.h()) == null)) {
            h.g();
        }
        if (yzkVar.z(pMMessageResponse)) {
            final epy m = new epy(null, null, null, null, null, 31, null).m(pMMessageResponse);
            pusVar.i("PM", "", new d1a() { // from class: tb.xzk
                @Override // tb.d1a
                public final Object invoke() {
                    String y;
                    y = yzk.y(yzk.this, m);
                    return y;
                }
            });
            g1a<? super epy, xhv> g1aVar = yzkVar.c;
            if (g1aVar != null) {
                g1aVar.invoke(m);
            }
        }
        return xhv.INSTANCE;
    }

    public static final String x(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("262a125", new Object[]{pMMessageResponse});
        }
        return "dispatchPMMessage : " + pMMessageResponse.getData();
    }

    public static final String y(yzk yzkVar, epy epyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa828be7", new Object[]{yzkVar, epyVar});
        }
        return "dispatchPMMessage listener : " + yzkVar.c + " :: " + epyVar;
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9fc6e2", new Object[]{this, str});
        }
    }

    public final h1l F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1l) ipChange.ipc$dispatch("aca29f8b", new Object[]{this});
        }
        return this.b;
    }

    public final void L(g1a<? super epy, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd134f80", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void M(h1l h1lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbbea2b", new Object[]{this, h1lVar});
        } else {
            this.b = h1lVar;
        }
    }

    @Override // tb.j3d
    public void b(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e6ea11", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void c(final PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2c46e6", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            pus.INSTANCE.i("PM", "", new d1a() { // from class: tb.tzk
                @Override // tb.d1a
                public final Object invoke() {
                    String B;
                    B = yzk.B(PMMessageResponse.this);
                    return B;
                }
            });
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void d(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a64ea33", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void e(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f17e67f", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void f(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b26bdbc", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void g(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510a8172", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.f32431a;
    }

    @Override // tb.j3d
    public void h(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8187fe43", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void i(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8439d89f", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void j(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39daac40", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void k(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f053ef", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.j3d
    public void l(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71544c2e", new Object[]{this, pMMessageResponse});
        } else if (pMMessageResponse != null) {
            v(pMMessageResponse);
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.f32431a = str;
        }
    }

    public final void t(CDNMessagePayload cDNMessagePayload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3b898", new Object[]{this, cDNMessagePayload});
            return;
        }
        final epy a2 = new epy(null, null, null, null, null, 31, null).a(cDNMessagePayload);
        pus.INSTANCE.i("PM", "", new d1a() { // from class: tb.szk
            @Override // tb.d1a
            public final Object invoke() {
                String u;
                u = yzk.u(epy.this);
                return u;
            }
        });
        g1a<? super epy, xhv> g1aVar = this.c;
        if (g1aVar != null) {
            g1aVar.invoke(a2);
        }
    }

    public final void v(final PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51e015d", new Object[]{this, pMMessageResponse});
        } else {
            cvs.Companion.e(new d1a() { // from class: tb.rzk
                @Override // tb.d1a
                public final Object invoke() {
                    xhv w;
                    w = yzk.w(PMMessageResponse.this, this);
                    return w;
                }
            });
        }
    }

    public final <T> boolean z(final iky<T> ikyVar) {
        T t;
        a0l h;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18353f", new Object[]{this, ikyVar})).booleanValue();
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final h1l F = F();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        h1l F2 = F();
        if (F2 != null) {
            t = (T) F2.c(ikyVar);
        } else {
            t = null;
        }
        ref$ObjectRef.element = t;
        pus pusVar = pus.INSTANCE;
        pusVar.i("PM", "", new d1a() { // from class: tb.uzk
            @Override // tb.d1a
            public final Object invoke() {
                String H;
                H = yzk.H(Ref$ObjectRef.this, F);
                return H;
            }
        });
        T t2 = ref$ObjectRef.element;
        if (t2 != null) {
            if (t2 != OpenArchMessageCheckResult.MessageCheckResultPassed) {
                z = false;
            }
            ref$BooleanRef.element = z;
            pusVar.i("PM", "", new d1a() { // from class: tb.vzk
                @Override // tb.d1a
                public final Object invoke() {
                    String A;
                    A = yzk.A(Ref$BooleanRef.this, ikyVar);
                    return A;
                }
            });
            if (ref$BooleanRef.element && (tvr.c(ikyVar) || ikyVar.isEmpty())) {
                ref$ObjectRef.element = (T) OpenArchMessageCheckResult.MessageCheckResultMsgDataEmpty;
            }
            h1l F3 = F();
            if (!(F3 == null || (h = F3.h()) == null)) {
                h.b((OpenArchMessageCheckResult) ref$ObjectRef.element, ikyVar);
            }
        }
        return ref$BooleanRef.element;
    }

    @Override // tb.mkb
    public void a(CDNMessageResponse cDNMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57df1c08", new Object[]{this, cDNMessageResponse});
            return;
        }
        ckf.g(cDNMessageResponse, "message");
        List<CDNMessagePayload> payloads = cDNMessageResponse.getPayloads();
        if (payloads != null) {
            for (CDNMessagePayload cDNMessagePayload : payloads) {
                if (cDNMessagePayload.getMsgId() != null && z(cDNMessagePayload)) {
                    t(cDNMessagePayload);
                }
            }
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
    }
}
