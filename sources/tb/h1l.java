package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.InputData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.OfficialLiveInfo;
import com.taobao.kmp.nexus.arch.openArch.service.message.OpenArchMessageServiceState;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchHeartBeatContext;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchMessageContext;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.a;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.b;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizTag;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h1l implements jic, nky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OpenArchMessageContext f20360a;
    public OpenArchMessageServiceState b;
    public final f3g c;
    public final eq2 d;
    public final gzk e;
    public final rmi f;
    public final List<String> g;
    public final a0l h;

    static {
        t2o.a(1004536546);
        t2o.a(1002438710);
        t2o.a(1003487269);
    }

    public h1l() {
        this(null, 1, null);
    }

    public static final String b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cacf173", new Object[]{map});
        }
        return "buildExt " + map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult c(tb.iky<T> r5) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.h1l.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "a186ba66"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult r5 = (com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult) r5
            return r5
        L_0x0018:
            java.lang.String r1 = "message"
            tb.ckf.g(r5, r1)
            com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult r1 = com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult.MessageCheckResultPassed
            java.lang.String r2 = r5.getTopic()
            if (r2 == 0) goto L_0x0039
            com.taobao.kmp.nexus.arch.openArch.service.message.context.OpenArchMessageContext r3 = r4.f20360a
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = r3.getTopic()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            boolean r2 = tb.ckf.b(r2, r3)
            if (r2 != 0) goto L_0x0039
            com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult r2 = com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult.MessageCheckResultTopicNotMatch
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            if (r2 != r1) goto L_0x0056
            java.lang.String r5 = r5.fetchMsgId()
            if (r5 == 0) goto L_0x0056
            java.util.List<java.lang.String> r1 = r4.g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x0054
            java.util.List<java.lang.String> r1 = r4.g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            goto L_0x0056
        L_0x0054:
            com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult r2 = com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult.MessageCheckResultMsgIDDuplicated
        L_0x0056:
            java.util.List<java.lang.String> r5 = r4.g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r1) goto L_0x006f
            java.util.List<java.lang.String> r5 = r4.g
            r1 = 500(0x1f4, float:7.0E-43)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.List r5 = r5.subList(r0, r1)
            r5.clear()
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h1l.c(tb.iky):com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult");
    }

    public final String e(wt4 wt4Var) {
        String spm;
        String str;
        String str2;
        LiveDetailResponseData a2;
        OfficialLiveInfo officialLiveInfo;
        LiveDetailResponseData a3;
        OfficialLiveInfo officialLiveInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b409c15f", new Object[]{this, wt4Var});
        }
        ckf.g(wt4Var, "coreData");
        pus pusVar = pus.INSTANCE;
        pusVar.f("LiveEngine-MessageManager", "", "buildExt start");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("livesource", wt4Var.p());
        linkedHashMap.put("entryLiveSource", wt4Var.g());
        linkedHashMap.put("liveToken", wt4Var.q());
        linkedHashMap.put("spm-cnt", wt4Var.u());
        linkedHashMap.put("isAD", wt4Var.j());
        String d = wt4Var.d();
        String str3 = null;
        if (d != null) {
            if (!tvr.a(d)) {
                d = null;
            }
            if (d != null) {
                linkedHashMap.put("clickid", d);
            }
        }
        String l = wt4Var.l();
        if (l != null) {
            if (!tvr.a(l)) {
                l = null;
            }
            if (l != null) {
                linkedHashMap.put(yj4.PARAM_LIVE_AD_PARAMS, l);
            }
        }
        String A = wt4Var.A();
        if (A != null) {
            if (!tvr.a(A)) {
                A = null;
            }
            if (A != null) {
                linkedHashMap.put("watchId", A);
            }
        }
        String t = wt4Var.t();
        if (!tvr.a(t)) {
            t = null;
        }
        if (t != null) {
            linkedHashMap.put(yj4.PARAM_PVID, t);
        }
        String k = wt4Var.k();
        if (k != null) {
            if (!tvr.a(k)) {
                k = null;
            }
            if (k != null) {
                linkedHashMap.put("kandianid", k);
            }
        }
        String o = wt4Var.o();
        if (o != null) {
            if (!tvr.a(o)) {
                o = null;
            }
            if (o != null) {
                linkedHashMap.put("liveItemId", o);
            }
        }
        String f = wt4Var.f();
        if (f != null) {
            if (!tvr.a(f)) {
                f = null;
            }
            if (f != null) {
                linkedHashMap.put("entryLiveItemId", f);
            }
        }
        String v = wt4Var.v();
        if (v != null) {
            if (!tvr.a(v)) {
                v = null;
            }
            if (v != null) {
                linkedHashMap.put("spm-url", v);
            }
        }
        linkedHashMap.putAll(wt4Var.e());
        pusVar.f("LiveEngine-MessageManager", "", "buildExt end");
        String str4 = "1";
        if (ckf.b(wt4Var.r(), str4)) {
            x4j D = wt4Var.D();
            if (D == null || (a3 = D.a()) == null || (officialLiveInfo2 = a3.getOfficialLiveInfo()) == null || (str = officialLiveInfo2.getOfficialLiveId()) == null) {
                str = "";
            }
            linkedHashMap.put("officialLiveId", str);
            x4j D2 = wt4Var.D();
            if (D2 == null || (a2 = D2.a()) == null || (officialLiveInfo = a2.getOfficialLiveInfo()) == null || (str2 = officialLiveInfo.getAccountId()) == null) {
                str2 = "";
            }
            linkedHashMap.put("officialAccountId", str2);
        }
        linkedHashMap.put("pmClientType", "kmpLiveRoom");
        String pmSessionID = wt4Var.C().getPmSessionID();
        if (pmSessionID == null) {
            pmSessionID = "";
        }
        linkedHashMap.put("pmSession", pmSessionID);
        InputData B = wt4Var.B();
        if (!(B == null || (spm = B.getSpm()) == null)) {
            linkedHashMap.put("spm-url", spm);
        }
        Map<String, Object> trackInfo = wt4Var.D().a().getTrackInfo();
        Map<String, String> m = wt4Var.m();
        if (!(trackInfo instanceof Object)) {
            trackInfo = null;
        }
        Map<String, Object> map = new KMPJsonObject(trackInfo).toMap();
        Map<String, Object> map2 = new KMPJsonObject(linkedHashMap).toMap();
        InputData B2 = wt4Var.B();
        if (B2 != null) {
            str3 = B2.getIgnorePv();
        }
        if (!Boolean.parseBoolean(str3)) {
            str4 = "0";
        }
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(yj4.PARAM_IGNORE_PV, str4);
        linkedHashMap2.put("needEventWhenIgnorePv", "true");
        linkedHashMap2.put("liveServerParams", map);
        linkedHashMap2.put("liveClientParams", map2);
        if (m != null) {
            linkedHashMap2.put("liveAlgoParams", m);
        }
        pusVar.i("LiveEngine-MessageManager", "", new d1a() { // from class: tb.g1l
            @Override // tb.d1a
            public final Object invoke() {
                String b;
                b = h1l.b(linkedHashMap2);
                return b;
            }
        });
        String jsonString = new KMPJsonObject(linkedHashMap2).toJsonString();
        return jsonString == null ? "" : jsonString;
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            m();
        }
    }

    public final String g(oyk oykVar) {
        wt4 wt4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3a3129", new Object[]{this, oykVar});
        }
        ckf.g(oykVar, "entity");
        hyk h = oykVar.h();
        if (h != null) {
            wt4Var = h.m();
        } else {
            wt4Var = null;
        }
        if (wt4Var != null) {
            return e(wt4Var);
        }
        return "";
    }

    public final a0l h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a0l) ipChange.ipc$dispatch("f7b9d92d", new Object[]{this});
        }
        return this.h;
    }

    public final boolean l() {
        String str;
        xyk j;
        yzk j2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cce3888", new Object[]{this})).booleanValue();
        }
        OpenArchMessageServiceState openArchMessageServiceState = OpenArchMessageServiceState.Setup;
        if (openArchMessageServiceState != this.b) {
            a2l a2lVar = a2l.INSTANCE;
            OpenArchMessageContext openArchMessageContext = this.f20360a;
            h3d h3dVar = null;
            if (openArchMessageContext != null) {
                str = openArchMessageContext.getEntityIdentifier();
            } else {
                str = null;
            }
            oyk g = a2lVar.g(str);
            OpenArchMessageContext openArchMessageContext2 = this.f20360a;
            if (openArchMessageContext2 != null) {
                z = ckf.b(openArchMessageContext2.getDisableMessageDispatch$nexus_release(), Boolean.TRUE);
            }
            if (!z) {
                if (g == null || (j = g.j()) == null || (j2 = j.j()) == null) {
                    OpenArchMessageContext openArchMessageContext3 = this.f20360a;
                    if (openArchMessageContext3 != null) {
                        h3dVar = openArchMessageContext3.getMessageListener();
                    }
                } else {
                    h3dVar = j2;
                }
            }
            w1l.INSTANCE.r(h3dVar, this.c);
            f3g f3gVar = this.c;
            if (f3gVar != null) {
                f3gVar.z0();
            }
            eq2 eq2Var = this.d;
            if (eq2Var != null) {
                eq2Var.D(h3dVar);
            }
            rmi rmiVar = this.f;
            if (rmiVar != null) {
                rmiVar.k(h3dVar);
            }
            gzk gzkVar = this.e;
            if (gzkVar != null) {
                gzkVar.H();
            }
            this.b = openArchMessageServiceState;
        }
        return true;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b466fe1", new Object[]{this})).booleanValue();
        }
        if (OpenArchMessageServiceState.Setup == this.b) {
            eq2 eq2Var = this.d;
            if (eq2Var != null) {
                eq2Var.E();
            }
            f3g f3gVar = this.c;
            if (f3gVar != null) {
                f3gVar.A0();
            }
            gzk gzkVar = this.e;
            if (gzkVar != null) {
                gzkVar.I();
            }
            rmi rmiVar = this.f;
            if (rmiVar != null) {
                rmiVar.l();
            }
            this.b = OpenArchMessageServiceState.Shutdown;
        }
        return true;
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa28d65", new Object[]{this, str, str2});
        } else {
            o(str, srv.a(), str2, OpenArchPMBizTag.TaoBao.getValue());
        }
    }

    public final void o(String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        a2l a2lVar = a2l.INSTANCE;
        OpenArchMessageContext openArchMessageContext = this.f20360a;
        if (openArchMessageContext != null) {
            str5 = openArchMessageContext.getEntityIdentifier();
        } else {
            str5 = null;
        }
        a2lVar.g(str5);
        OpenArchMessageContext openArchMessageContext2 = this.f20360a;
        if (openArchMessageContext2 != null) {
            ckf.d(openArchMessageContext2);
            openArchMessageContext2.setTopic(str);
        }
        f3g f3gVar = this.c;
        if (f3gVar != null) {
            f3gVar.B0(str, str2, str3, str4);
        }
        eq2 eq2Var = this.d;
        if (eq2Var != null) {
            eq2Var.F(str, str2, str3, str4);
        }
        rmi rmiVar = this.f;
        if (rmiVar != null) {
            rmiVar.m(str, str2, str3, str4);
        }
        gzk gzkVar = this.e;
        if (gzkVar != null) {
            gzkVar.L(str, str2, str3, str4);
        }
    }

    @Override // tb.nky
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        this.h.c();
        eq2 eq2Var = this.d;
        if (eq2Var != null) {
            eq2Var.unsubscribe(str);
        }
        rmi rmiVar = this.f;
        if (rmiVar != null) {
            rmiVar.unsubscribe(str);
        }
        f3g f3gVar = this.c;
        if (f3gVar != null) {
            f3gVar.unsubscribe(str);
        }
        gzk gzkVar = this.e;
        if (gzkVar != null) {
            gzkVar.unsubscribe(str);
        }
    }

    public h1l(OpenArchMessageContext openArchMessageContext) {
        this.f20360a = openArchMessageContext;
        this.b = OpenArchMessageServiceState.Undefined;
        this.g = new ArrayList();
        gzk gzkVar = null;
        this.h = new a0l(openArchMessageContext != null ? openArchMessageContext.getEntityIdentifier() : null);
        if (openArchMessageContext != null) {
            this.c = openArchMessageContext.getPmContext() != null ? w1l.INSTANCE.s(openArchMessageContext.getPmContext()) : null;
            a cdnContext = openArchMessageContext.getCdnContext();
            this.d = cdnContext != null ? new eq2(cdnContext, openArchMessageContext.getEntityIdentifier()) : null;
            List<b> compensationContexts$nexus_release = openArchMessageContext.getCompensationContexts$nexus_release();
            this.f = compensationContexts$nexus_release != null ? new rmi(compensationContexts$nexus_release, openArchMessageContext.getEntityIdentifier()) : null;
            OpenArchHeartBeatContext heartBeatContext = openArchMessageContext.getHeartBeatContext();
            this.e = heartBeatContext != null ? new gzk(openArchMessageContext.getEntityIdentifier(), heartBeatContext) : gzkVar;
        }
    }

    @Override // tb.nky
    public void c(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, g1a<? super w0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587df627", new Object[]{this, kSPowerMsgSendMessageParams, g1aVar});
            return;
        }
        ckf.g(kSPowerMsgSendMessageParams, "params");
        f3g f3gVar = this.c;
        if (f3gVar != null) {
            f3gVar.c(kSPowerMsgSendMessageParams, g1aVar);
        }
    }

    public /* synthetic */ h1l(OpenArchMessageContext openArchMessageContext, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : openArchMessageContext);
    }
}
