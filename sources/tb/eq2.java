package tb;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.a;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.CDNMessageResponse;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ftt;
import tb.kic;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u000bR\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0012\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\nR\u0018\u0010C\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010,R\u0016\u0010D\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>¨\u0006E"}, d2 = {"Ltb/eq2;", "Ltb/kic;", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "context", "", "entityIdentifier", "<init>", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;Ljava/lang/String;)V", "topic", "Ltb/xhv;", TLogTracker.LEVEL_INFO, "(Ljava/lang/String;)V", "n", "", "l", "()I", "H", "Ltb/h3d;", "messageListener", "", TLogTracker.LEVEL_DEBUG, "(Ltb/h3d;)Z", "m", "()Ljava/lang/String;", "C", "()Ljava/lang/Boolean;", "E", "()Z", "from", "ext", l2o.COL_BTAG, UTConstant.Args.UT_SUCCESS_F, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unsubscribe", "B", "()V", "A", "L", "f", "a", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "y", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/String;", AmnetConstant.VAL_SUPPORT_ZSTD, "p", "", "c", "Ljava/lang/Long;", "lastPullTime", "Ltb/hvs;", "d", "Ltb/hvs;", "timer", "Ltb/mkb;", "e", "Ltb/mkb;", "h", "Ljava/lang/Integer;", "cdnBeatInterval", bmv.MSGTYPE_INTERVAL, "Z", "isLongPull", at.j, "secondsSinceLastCDN", at.k, "cdnUrl", "isLongPullRequest", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eq2 implements kic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f18754a;
    private String b;
    private Long c;
    private hvs d;
    private mkb e;
    private Integer h;
    private boolean i;
    private int j;
    private String k;
    private boolean l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements g1a<Object, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f18755a;
        public final /* synthetic */ String b;
        public final /* synthetic */ u1a c;

        public c(u1a u1aVar, w1a w1aVar, String str, u1a u1aVar2) {
            this.f18755a = u1aVar;
            this.b = str;
            this.c = u1aVar2;
        }

        public final void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
                return;
            }
            mus musVar = new mus();
            ftt.a aVar = ftt.Companion;
            musVar.c(Long.valueOf(bvt.d(aVar)));
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(lus.INSTANCE.getClass())).getSimpleName());
            pusVar.f(valueOf, "", "成功: model: " + obj);
            KMPJsonObject kMPJsonObject = obj instanceof KMPJsonObject ? (KMPJsonObject) obj : null;
            if (kMPJsonObject != null) {
                u1a u1aVar = this.f18755a;
                pusVar.f(String.valueOf(((ns3) dun.b(KMPJsonObject.class)).getSimpleName()), "", "HttpResp JSONObj Is Not Null");
                Serializable decodeFromJsonObject = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, kMPJsonObject, dun.b(CDNMessageResponse.class));
                if (decodeFromJsonObject != null) {
                    String valueOf2 = String.valueOf(((ns3) dun.b(KMPJsonObject.class)).getSimpleName());
                    pusVar.f(valueOf2, "", "HttpResp ktModel: " + decodeFromJsonObject);
                    musVar.d(Long.valueOf(bvt.d(aVar)));
                    if (u1aVar != null) {
                        u1aVar.invoke(decodeFromJsonObject, musVar);
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.b;
            u1a u1aVar2 = this.c;
            String valueOf3 = String.valueOf(((ns3) dun.b(lus.class)).getSimpleName());
            pusVar.g(valueOf3, "", "HttpResp Model Cast To KMPJsonObject failed，url= " + str);
            if (u1aVar2 != null) {
                u1aVar2.invoke(500, "HttpResp Model Cast To KMPJsonObject failed");
            }
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Object obj) {
            a(obj);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements u1a<Integer, String, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f18756a;

        public d(u1a u1aVar) {
            this.f18756a = u1aVar;
        }

        public final void a(Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
                return;
            }
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(lus.INSTANCE.getClass())).getSimpleName());
            pusVar.g(valueOf, "", "失败: 错误代码: " + num + ", 消息: " + str);
            u1a u1aVar = this.f18756a;
            if (u1aVar != null) {
                u1aVar.invoke(num, str);
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
            a(num, str);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1004536596);
        t2o.a(1004536599);
    }

    public eq2() {
        this(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv G(eq2 eq2Var, Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b0f6f19c", new Object[]{eq2Var, num, str});
        }
        eq2Var.i = false;
        pus pusVar = pus.INSTANCE;
        pusVar.g("PM-CDN", "", "httpGetRequest err with errCode = " + num);
        return xhv.INSTANCE;
    }

    private final int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7992d361", new Object[]{this})).intValue();
        }
        a y = y();
        if (y != null) {
            return y.j();
        }
        return 18;
    }

    private final void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e98969", new Object[]{this, str});
            return;
        }
        if (!this.i) {
            int i = this.j + 1;
            this.j = i;
            if (i < l()) {
                return;
            }
        }
        if (this.i && this.l) {
            int i2 = this.j + 1;
            this.j = i2;
            if (i2 >= H()) {
                this.i = false;
            } else {
                return;
            }
        }
        n(str);
    }

    public static /* synthetic */ void J(eq2 eq2Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d997409", new Object[]{eq2Var, str, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            eq2Var.I(str);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCDNPolling");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv K(eq2 eq2Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("df5324a1", new Object[]{eq2Var, str});
        }
        eq2Var.I(str);
        return xhv.INSTANCE;
    }

    private final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("312a9972", new Object[]{this})).intValue();
        }
        Integer num = this.h;
        if (num == null) {
            a y = y();
            if (y != null) {
                num = Integer.valueOf(y.k());
            } else {
                num = null;
            }
            if (num == null) {
                return 5;
            }
        }
        return num.intValue();
    }

    private final void n(String str) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119ac987", new Object[]{this, str});
            return;
        }
        final a y = y();
        if (y != null) {
            if (this.i) {
                this.l = true;
                str2 = y.n();
            } else {
                this.l = false;
                str2 = y.a();
            }
            this.k = str2;
            long a2 = ju6.a();
            Long l = this.c;
            if (l != null && a2 - l.longValue() >= y.b()) {
                l = Long.valueOf(a2 - y.b());
            }
            if (y.l()) {
                long j = 1000;
                a2 /= j;
                if (l != null) {
                    l = Long.valueOf(l.longValue() / j);
                }
            }
            String f = com.taobao.uniinfra_kmp.common_utils.app.a.f();
            StringBuilder sb = new StringBuilder();
            sb.append(this.k);
            if (str == null) {
                str3 = y.d();
            } else {
                str3 = str;
            }
            sb.append(str3);
            sb.append(wh6.DIR);
            if (l == null || (str4 = l.toString()) == null) {
                str4 = "0";
            }
            sb.append(str4);
            sb.append(wh6.DIR);
            sb.append(a2);
            sb.append("?deviceId=");
            sb.append(f);
            final String sb2 = sb.toString();
            pus.INSTANCE.i("PM-CDN", y.d(), new d1a() { // from class: tb.xp2
                @Override // tb.d1a
                public final Object invoke() {
                    String q;
                    q = eq2.q(sb2);
                    return q;
                }
            });
            lus lusVar = lus.INSTANCE;
            if (lusVar.e()) {
                lus.g(lusVar, sb2, dun.b(CDNMessageResponse.class), new u1a() { // from class: tb.yp2
                    @Override // tb.u1a
                    public final Object invoke(Object obj, Object obj2) {
                        xhv v;
                        v = eq2.v(eq2.this, y, (CDNMessageResponse) obj, (mus) obj2);
                        return v;
                    }
                }, new u1a() { // from class: tb.zp2
                    @Override // tb.u1a
                    public final Object invoke(Object obj, Object obj2) {
                        xhv G;
                        G = eq2.G(eq2.this, (Integer) obj, (String) obj2);
                        return G;
                    }
                }, null, 16, null);
            } else {
                u1a aq2Var = new u1a() { // from class: tb.aq2
                    @Override // tb.u1a
                    public final Object invoke(Object obj, Object obj2) {
                        xhv r;
                        r = eq2.r(eq2.this, y, (CDNMessageResponse) obj, (mus) obj2);
                        return r;
                    }
                };
                u1a bq2Var = new u1a() { // from class: tb.bq2
                    @Override // tb.u1a
                    public final Object invoke(Object obj, Object obj2) {
                        xhv u;
                        u = eq2.u(eq2.this, (Integer) obj, (String) obj2);
                        return u;
                    }
                };
                mhr.X().D(sb2, new c(aq2Var, null, sb2, bq2Var), new d(bq2Var), kotlin.collections.a.k(jpu.a(pg1.ATOM_callee, "KMP")));
            }
        }
        this.j = 0;
    }

    public static /* synthetic */ void o(eq2 eq2Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5cbcab", new Object[]{eq2Var, str, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            eq2Var.n(str);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMessageFromCDN");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9938e7", new Object[]{str});
        }
        return "CDN URL: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv r(final eq2 eq2Var, a aVar, final CDNMessageResponse cDNMessageResponse, mus musVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("11fc3ec7", new Object[]{eq2Var, aVar, cDNMessageResponse, musVar});
        }
        if (cDNMessageResponse != null) {
            eq2Var.c = cDNMessageResponse.getEndTime();
            pus pusVar = pus.INSTANCE;
            pusVar.i("PM-CDN", aVar.d(), new d1a() { // from class: tb.xfy
                @Override // tb.d1a
                public final Object invoke() {
                    String s;
                    s = eq2.s(eq2.this, cDNMessageResponse);
                    return s;
                }
            });
            if (cDNMessageResponse.getPullInterval() != null) {
                Integer pullInterval = cDNMessageResponse.getPullInterval();
                ckf.d(pullInterval);
                if (pullInterval.intValue() > 0) {
                    eq2Var.h = cDNMessageResponse.getPullInterval();
                }
            }
            if (!ckf.b(cDNMessageResponse.getPullPolicy(), "LONG") || !aVar.m()) {
                z = false;
            }
            eq2Var.i = z;
            if (z) {
                eq2Var.l = false;
            }
            mkb mkbVar = eq2Var.e;
            if (mkbVar != null) {
                mkbVar.a(cDNMessageResponse);
            }
            pusVar.i("PM-CDN", aVar.d(), new d1a() { // from class: tb.zfy
                @Override // tb.d1a
                public final Object invoke() {
                    String t;
                    t = eq2.t(CDNMessageResponse.this);
                    return t;
                }
            });
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(eq2 eq2Var, CDNMessageResponse cDNMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40b3d539", new Object[]{eq2Var, cDNMessageResponse});
        }
        return "lastPullTime :" + eq2Var.c + ", messagePayload:" + cDNMessageResponse.getPayloads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(CDNMessageResponse cDNMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("971b322a", new Object[]{cDNMessageResponse});
        }
        return "end message.endTime:" + cDNMessageResponse.getEndTime() + " message.payloads:" + cDNMessageResponse.getPayloads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv u(eq2 eq2Var, Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e6fba980", new Object[]{eq2Var, num, str});
        }
        eq2Var.i = false;
        pus pusVar = pus.INSTANCE;
        pusVar.g("PM-CDN", "", "httpGetRequest err with errCode = " + num);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv v(final eq2 eq2Var, a aVar, final CDNMessageResponse cDNMessageResponse, mus musVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("621f07e3", new Object[]{eq2Var, aVar, cDNMessageResponse, musVar});
        }
        if (cDNMessageResponse != null) {
            eq2Var.c = cDNMessageResponse.getEndTime();
            pus pusVar = pus.INSTANCE;
            pusVar.i("PM-CDN", aVar.d(), new d1a() { // from class: tb.cq2
                @Override // tb.d1a
                public final Object invoke() {
                    String w;
                    w = eq2.w(eq2.this, cDNMessageResponse);
                    return w;
                }
            });
            if (cDNMessageResponse.getPullInterval() != null) {
                Integer pullInterval = cDNMessageResponse.getPullInterval();
                ckf.d(pullInterval);
                if (pullInterval.intValue() > 0) {
                    eq2Var.h = cDNMessageResponse.getPullInterval();
                }
            }
            if (!ckf.b(cDNMessageResponse.getPullPolicy(), "LONG") || !aVar.m()) {
                z = false;
            }
            eq2Var.i = z;
            if (z) {
                eq2Var.l = false;
            }
            mkb mkbVar = eq2Var.e;
            if (mkbVar != null) {
                mkbVar.a(cDNMessageResponse);
            }
            pusVar.i("PM-CDN", aVar.d(), new d1a() { // from class: tb.dq2
                @Override // tb.d1a
                public final Object invoke() {
                    String x;
                    x = eq2.x(CDNMessageResponse.this);
                    return x;
                }
            });
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(eq2 eq2Var, CDNMessageResponse cDNMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffa853fd", new Object[]{eq2Var, cDNMessageResponse});
        }
        return "lastPullTime :" + eq2Var.c + ", messagePayload:" + cDNMessageResponse.getPayloads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(CDNMessageResponse cDNMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ca8b9ee", new Object[]{cDNMessageResponse});
        }
        return "end message.endTime:" + cDNMessageResponse.getEndTime() + " message.payloads:" + cDNMessageResponse.getPayloads();
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        hvs hvsVar = this.d;
        if (hvsVar != null) {
            hvsVar.n();
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        hvs hvsVar = this.d;
        if (hvsVar != null) {
            hvsVar.j();
        }
    }

    public Boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4123b101", new Object[]{this});
        }
        return Boolean.valueOf(D(null));
    }

    public final boolean D(h3d h3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f061e6", new Object[]{this, h3dVar})).booleanValue();
        }
        this.e = h3dVar;
        return true;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b466fe1", new Object[]{this})).booleanValue();
        }
        this.e = null;
        return true;
    }

    public void F(final String str, String str2, String str3, String str4) {
        hvs hvsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
        } else if (str != null && y() != null) {
            this.j = l();
            hvs hvsVar2 = this.d;
            if (hvsVar2 == null) {
                this.d = new hvs();
                if (y() != null && (hvsVar = this.d) != null) {
                    hvs.l(hvsVar, new d1a() { // from class: tb.wp2
                        @Override // tb.d1a
                        public final Object invoke() {
                            xhv K;
                            K = eq2.K(eq2.this, str);
                            return K;
                        }
                    }, 1000L, false, 4, null);
                    return;
                }
                return;
            }
            hvsVar2.j();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        E();
        kic.a.a(this, null, 1, null);
        hvs hvsVar = this.d;
        if (hvsVar != null) {
            hvsVar.f();
        }
        this.d = null;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c75cfd6", new Object[]{this});
        }
        String z = z();
        if (z == null) {
            return e5v.a();
        }
        return z;
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.kic
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        hvs hvsVar = this.d;
        if (hvsVar != null) {
            hvsVar.n();
        }
    }

    public a y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("caff0e41", new Object[]{this});
        }
        return this.f18754a;
    }

    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.b;
    }

    public eq2(a aVar, String str) {
        this.f18754a = aVar;
        this.b = str;
    }

    public /* synthetic */ eq2(a aVar, String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? null : str);
    }
}
