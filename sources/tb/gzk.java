package tb;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchHeartBeatContext;
import com.taobao.kmp.nexus.arch.openArch.service.message.processor.heartbeat.OpenArchHeartBeatStage;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u00017B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u0013j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\nJ7\u0010/\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\u0010J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0010J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010'\"\u0004\b:\u00102R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010+\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u00108\u001a\u0004\bJ\u0010'\"\u0004\bK\u00102R\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00108R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00108R\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010TR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010QR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010QR\"\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010[R\u0016\u0010^\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010]R\u0016\u0010_\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010aR\u0016\u0010c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010]R\u0016\u0010d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010*R\u0018\u0010g\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, d2 = {"Ltb/gzk;", "Ltb/kic;", "", "entityIdentifier", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "context", "<init>", "(Ljava/lang/String;Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;)V", "", "l", "()Z", "", "n", "()I", "Ltb/xhv;", "O", "()V", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/processor/heartbeat/OpenArchHeartBeatStage;", v4s.PARAM_UPLOAD_STAGE, "Lkotlin/Function2;", "Ltb/l0g;", "Lcom/taobao/kmp/kernel/serviceinterface/KSMTOPHelperCompletedCallback;", "callback", "x", "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/processor/heartbeat/OpenArchHeartBeatStage;Ltb/u1a;)V", at.k, "", "", "u", "()Ljava/util/Map;", "m", AmnetConstant.VAL_SUPPORT_ZSTD, "C", "J", "dataObj", "isSuccess", "w", "(Ltb/l0g;Z)V", o.b, "()Ljava/lang/String;", "H", "()Ljava/lang/Boolean;", TLogTracker.LEVEL_INFO, "topic", "from", "ext", l2o.COL_BTAG, "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unsubscribe", "(Ljava/lang/String;)V", "B", "y", "h", "f", "a", "Ljava/lang/String;", "t", "p", TplMsg.VALUE_T_NATIVE_RETURN, "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", "s", "()Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;", UTConstant.Args.UT_SUCCESS_F, "(Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/OpenArchHeartBeatContext;)V", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "c", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "q", "()Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "E", "(Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;)V", "bizCode", "d", "v", "G", "e", z9u.KEY_TAOKE_BIZSCENE, "sessionId", "", at.f, "Ljava/util/List;", "statusList", "Ltb/izk;", "Ltb/izk;", "heartbeatState", bmv.MSGTYPE_INTERVAL, "step1Msgs", at.j, "step2Msgs", "step100Msgs", "Ljava/util/Map;", "notReportedMsgs", "Z", "enableHeartBeat", "needStopReport", "Ltb/hvs;", "Ltb/hvs;", "timer", "isRunning", "secondsSinceLastHeartbeat", "r", "Ljava/lang/Integer;", "heartbeatInterval", "Companion", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gzk implements kic {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private String f20327a;
    private OpenArchHeartBeatContext b;
    private OpenArchPMBizCode c;
    private String d;
    private String e;
    private String f;
    private List<String> g;
    private izk h;
    private List<String> i;
    private List<String> j;
    private List<String> k;
    private Map<String, Object> l;
    private boolean m;
    private boolean n;
    private hvs o;
    private boolean p;
    private int q;
    private Integer r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536607);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536606);
        t2o.a(1004536599);
    }

    public gzk() {
        this(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv A(gzk gzkVar, l0g l0gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("29f908ba", new Object[]{gzkVar, l0gVar, new Boolean(z)});
        }
        ckf.g(l0gVar, "dataObj");
        gzkVar.w(l0gVar, z);
        return xhv.INSTANCE;
    }

    private final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9835476", new Object[]{this});
        } else if (!this.p) {
            this.p = true;
            this.h.d();
            x(OpenArchHeartBeatStage.OnResume, new u1a() { // from class: tb.bzk
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv D;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    D = gzk.D(gzk.this, (l0g) obj, booleanValue);
                    return D;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv D(gzk gzkVar, l0g l0gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9b801424", new Object[]{gzkVar, l0gVar, new Boolean(z)});
        }
        ckf.g(l0gVar, "dataObj");
        gzkVar.w(l0gVar, z);
        return xhv.INSTANCE;
    }

    private final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc236c1", new Object[]{this});
            return;
        }
        x(OpenArchHeartBeatStage.Finish, new u1a() { // from class: tb.czk
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                xhv K;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                K = gzk.K(gzk.this, (l0g) obj, booleanValue);
                return K;
            }
        });
        hvs hvsVar = this.o;
        if (hvsVar != null) {
            hvsVar.f();
        }
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv K(gzk gzkVar, l0g l0gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("82716430", new Object[]{gzkVar, l0gVar, new Boolean(z)});
        }
        ckf.g(l0gVar, "dataObj");
        gzkVar.w(l0gVar, z);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv M(gzk gzkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("447d9c8e", new Object[]{gzkVar});
        }
        gzkVar.O();
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv N(gzk gzkVar, l0g l0gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f1f918aa", new Object[]{gzkVar, l0gVar, new Boolean(z)});
        }
        ckf.g(l0gVar, "dataObj");
        gzkVar.w(l0gVar, z);
        return xhv.INSTANCE;
    }

    private final void O() {
        g1a<List<String>, xhv> recordCurrentStatusAction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b524dea", new Object[]{this});
        } else if (k()) {
            OpenArchHeartBeatContext openArchHeartBeatContext = this.b;
            if (!(openArchHeartBeatContext == null || (recordCurrentStatusAction = openArchHeartBeatContext.getRecordCurrentStatusAction()) == null)) {
                recordCurrentStatusAction.invoke(this.g);
            }
            int i = this.q + 1;
            this.q = i;
            if (i >= n()) {
                x(OpenArchHeartBeatStage.Normal, new u1a() { // from class: tb.azk
                    @Override // tb.u1a
                    public final Object invoke(Object obj, Object obj2) {
                        xhv P;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        P = gzk.P(gzk.this, (l0g) obj, booleanValue);
                        return P;
                    }
                });
                this.q = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv P(gzk gzkVar, l0g l0gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("6a850b32", new Object[]{gzkVar, l0gVar, new Boolean(z)});
        }
        ckf.g(l0gVar, "dataObj");
        gzkVar.w(l0gVar, z);
        return xhv.INSTANCE;
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85d5dc9a", new Object[]{this})).booleanValue();
        }
        if (!this.m || this.b == null || !this.p) {
            return false;
        }
        return true;
    }

    private final boolean l() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b9b6ebf", new Object[]{this})).booleanValue();
        }
        if (!this.n) {
            return false;
        }
        OpenArchHeartBeatContext openArchHeartBeatContext = this.b;
        if (openArchHeartBeatContext != null) {
            z = openArchHeartBeatContext.loadEnableStopReportSwitch$nexus_release();
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30473690", new Object[]{this});
            return;
        }
        this.i.clear();
        this.j.clear();
        this.k.clear();
    }

    private final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cf48f61", new Object[]{this})).intValue();
        }
        Integer num = this.r;
        if (num == null) {
            OpenArchHeartBeatContext openArchHeartBeatContext = this.b;
            if (openArchHeartBeatContext != null) {
                num = Integer.valueOf(openArchHeartBeatContext.getInterval());
            } else {
                num = null;
            }
            if (num == null) {
                return 5;
            }
        }
        return num.intValue();
    }

    private final Map<String, Object> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ed52e38e", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List B0 = i04.B0(this.i);
        List B02 = i04.B0(this.j);
        List B03 = i04.B0(this.k);
        if (!B0.isEmpty()) {
            linkedHashMap.put("step1", B0);
        }
        if (!B02.isEmpty()) {
            linkedHashMap.put("step2", B02);
        }
        if (!B03.isEmpty()) {
            linkedHashMap.put("step100", B03);
        }
        return linkedHashMap;
    }

    private final void x(OpenArchHeartBeatStage openArchHeartBeatStage, u1a<? super l0g, ? super Boolean, xhv> u1aVar) {
        Integer appearanceStatus;
        String apiVersion;
        String apiName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ffc355", new Object[]{this, openArchHeartBeatStage, u1aVar});
        } else if (this.n) {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(gzk.class)).getSimpleName()), t(), "heartbeat heartBeatWithStage stop report");
        } else {
            zyk zykVar = new zyk();
            zykVar.k(this.f);
            zykVar.n(this.d);
            zykVar.e(this.c.getValue());
            zykVar.f(this.e);
            zykVar.l(openArchHeartBeatStage.getValue());
            zykVar.h(this.h.f());
            zykVar.j(this.h.a());
            zykVar.m(this.g);
            OpenArchHeartBeatContext openArchHeartBeatContext = this.b;
            if (!(openArchHeartBeatContext == null || (apiName = openArchHeartBeatContext.getApiName()) == null)) {
                zykVar.b(apiName);
            }
            OpenArchHeartBeatContext openArchHeartBeatContext2 = this.b;
            if (!(openArchHeartBeatContext2 == null || (apiVersion = openArchHeartBeatContext2.getApiVersion()) == null)) {
                zykVar.c(apiVersion);
            }
            Map<String, Object> u = u();
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(gzk.class)).getSimpleName());
            String t = t();
            pusVar.f(valueOf, t, "收到的消息: " + u);
            Map<String, ? extends Object> map = null;
            if (!this.l.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : yz3.l("step1", "step2", "step100")) {
                    ArrayList arrayList = new ArrayList();
                    if (this.l.get(str) instanceof List) {
                        Object obj = this.l.get(str);
                        List list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            for (Object obj2 : list) {
                                ckf.e(obj2, "null cannot be cast to non-null type kotlin.Any");
                                arrayList.add(obj2);
                            }
                        }
                    }
                    Object obj3 = u.get(str);
                    List list2 = obj3 instanceof List ? (List) obj3 : null;
                    if (list2 != null) {
                        for (Object obj4 : list2) {
                            ckf.e(obj4, "null cannot be cast to non-null type kotlin.Any");
                            arrayList.add(obj4);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        linkedHashMap.put(str, arrayList);
                    }
                }
                zykVar.i(linkedHashMap);
                pus pusVar2 = pus.INSTANCE;
                String valueOf2 = String.valueOf(((ns3) dun.b(gzk.class)).getSimpleName());
                String t2 = t();
                pusVar2.f(valueOf2, t2, "合并成功的消息: " + linkedHashMap);
            } else {
                zykVar.i(u);
            }
            Map<String, Object> a2 = zykVar.a();
            if (a2 != null) {
                this.l = a2;
            }
            m();
            OpenArchHeartBeatContext openArchHeartBeatContext3 = this.b;
            if (!(openArchHeartBeatContext3 == null || (appearanceStatus = openArchHeartBeatContext3.getAppearanceStatus()) == null)) {
                zykVar.d(appearanceStatus.intValue());
            }
            OpenArchHeartBeatContext openArchHeartBeatContext4 = this.b;
            if (openArchHeartBeatContext4 != null) {
                map = openArchHeartBeatContext4.getLiveRoomParams();
            }
            zykVar.g(map);
            hzk.INSTANCE.a(zykVar, u1aVar);
        }
    }

    private final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51b654d", new Object[]{this});
        } else if (this.p) {
            this.p = false;
            this.h.b();
            x(OpenArchHeartBeatStage.OnPause, new u1a() { // from class: tb.dzk
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv A;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    A = gzk.A(gzk.this, (l0g) obj, booleanValue);
                    return A;
                }
            });
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (!this.n) {
            C();
        }
    }

    public final void E(OpenArchPMBizCode openArchPMBizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec014e75", new Object[]{this, openArchPMBizCode});
            return;
        }
        ckf.g(openArchPMBizCode, "<set-?>");
        this.c = openArchPMBizCode;
    }

    public final void F(OpenArchHeartBeatContext openArchHeartBeatContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693ad49b", new Object[]{this, openArchHeartBeatContext});
        } else {
            this.b = openArchHeartBeatContext;
        }
    }

    public final void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6a17e1", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public Boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4123b101", new Object[]{this});
        }
        OpenArchHeartBeatContext openArchHeartBeatContext = this.b;
        if (openArchHeartBeatContext != null) {
            this.m = openArchHeartBeatContext.loadEnableHeartBeatConfig$nexus_release();
            this.n = l();
        }
        return Boolean.TRUE;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b466fe1", new Object[]{this})).booleanValue();
        }
        hvs hvsVar = this.o;
        if (hvsVar != null) {
            hvsVar.f();
        }
        this.o = null;
        return true;
    }

    public void L(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.q = 0;
        this.h.e();
        this.p = true;
        hvs hvsVar = this.o;
        if (hvsVar != null) {
            hvsVar.j();
        } else if (this.b != null) {
            hvs hvsVar2 = new hvs();
            this.o = hvsVar2;
            hvs.l(hvsVar2, new d1a() { // from class: tb.ezk
                @Override // tb.d1a
                public final Object invoke() {
                    xhv M;
                    M = gzk.M(gzk.this);
                    return M;
                }
            }, 1000L, false, 4, null);
        }
        x(OpenArchHeartBeatStage.Start, new u1a() { // from class: tb.fzk
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                xhv N;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                N = gzk.N(gzk.this, (l0g) obj, booleanValue);
                return N;
            }
        });
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            I();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c75cfd6", new Object[]{this});
        }
        String t = t();
        if (t == null) {
            return e5v.a();
        }
        return t;
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.f20327a = str;
        }
    }

    public final OpenArchPMBizCode q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMBizCode) ipChange.ipc$dispatch("32622c1", new Object[]{this});
        }
        return this.c;
    }

    public final OpenArchHeartBeatContext s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchHeartBeatContext) ipChange.ipc$dispatch("263f4a25", new Object[]{this});
        }
        return this.b;
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.f20327a;
    }

    @Override // tb.kic
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
        } else {
            J();
        }
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2369d", new Object[]{this});
        }
        return this.d;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (!this.n) {
            z();
        }
    }

    public gzk(String str, OpenArchHeartBeatContext openArchHeartBeatContext) {
        this.f20327a = str;
        this.b = openArchHeartBeatContext;
        this.c = OpenArchPMBizCode.DefaultBizCode;
        this.f = e5v.a();
        this.g = new ArrayList();
        this.h = new izk();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        OpenArchHeartBeatContext openArchHeartBeatContext2 = this.b;
        if (openArchHeartBeatContext2 != null) {
            this.c = openArchHeartBeatContext2.getBizCode();
            this.e = openArchHeartBeatContext2.getBizScene();
            this.d = openArchHeartBeatContext2.getTopic();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(tb.l0g r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gzk.w(tb.l0g, boolean):void");
    }

    public /* synthetic */ gzk(String str, OpenArchHeartBeatContext openArchHeartBeatContext, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : openArchHeartBeatContext);
    }
}
