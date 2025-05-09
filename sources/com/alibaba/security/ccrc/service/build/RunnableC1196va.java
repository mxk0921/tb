package com.alibaba.security.ccrc.service.build;

import android.util.Pair;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.RiskShowCustomizedResult;
import com.alibaba.security.ccrc.service.build.RunnableC1196va;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.va  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RunnableC1196va implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2629a = "OffClientDetectSyncTask";
    public static final int b = -1;
    public static final int c = 1;
    public static final int d = 0;
    public final CcrcService e;
    public volatile RiskShowCustomizedResult h;
    public final Map<String, Object> i;
    public final CcrcService.Config j;
    public final long k = System.currentTimeMillis();
    public volatile int l = -1;
    public final CountDownLatch f = new CountDownLatch(1);
    public final HandlerC1156ea g = new HandlerC1156ea(null);

    public RunnableC1196va(CcrcService ccrcService, CcrcService.Config config, Map<String, Object> map) {
        this.e = ccrcService;
        this.i = map;
        this.j = config;
        d();
    }

    public static /* synthetic */ void b(RunnableC1196va vaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ed742", new Object[]{vaVar});
        } else {
            vaVar.c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f.countDown();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e.setWuKongDetectListener(new C1194ua(this));
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        StringBuilder a2 = Kb.a("SID_");
        a2.append(this.e.getPid());
        a2.append(System.currentTimeMillis());
        new BehaviorRiskSample(a2.toString(), this.i).detect(this.e, true);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            a();
        }
    }

    public static /* synthetic */ RiskShowCustomizedResult a(RunnableC1196va vaVar, RiskShowCustomizedResult riskShowCustomizedResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskShowCustomizedResult) ipChange.ipc$dispatch("93959015", new Object[]{vaVar, riskShowCustomizedResult});
        }
        vaVar.h = riskShowCustomizedResult;
        return riskShowCustomizedResult;
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g.post(new Runnable() { // from class: tb.vuz
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC1196va.a(str);
                }
            });
        }
    }

    public static /* synthetic */ void a(RunnableC1196va vaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c27f8cb", new Object[]{vaVar, str});
        } else {
            vaVar.b(str);
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l != -1;
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (C1180n.a()) {
            try {
                Nav.from(CcrcContextImpl.getContext()).skipAllProcessors().toUri(str);
            } catch (Throwable unused) {
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e.isActivate()) {
            e();
        } else {
            this.e.activate(this.j, new I() { // from class: tb.wuz
                @Override // com.alibaba.security.ccrc.service.build.I
                public final void a(WukongActivateRiskResult wukongActivateRiskResult) {
                    RunnableC1196va.this.a(wukongActivateRiskResult);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WukongActivateRiskResult wukongActivateRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e362d", new Object[]{this, wukongActivateRiskResult});
        } else if (!b()) {
            WukongResultCode wukongResultCode = wukongActivateRiskResult.resultCode;
            if (wukongResultCode == WukongResultCode.ACTIVATED || wukongResultCode == WukongResultCode.ACTIVATE_SUCCESS) {
                e();
                return;
            }
            StringBuilder a2 = Kb.a("CCRC activate fail: ");
            a2.append(wukongActivateRiskResult.errorMsg);
            this.h = E.a(a2.toString());
            c();
        }
    }

    public Pair<RiskShowCustomizedResult, Boolean> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1732eaa6", new Object[]{this, new Long(j)});
        }
        try {
            boolean await = this.f.await(j, TimeUnit.MILLISECONDS);
            this.l = !await;
            if (this.h == null) {
                this.h = E.a("CCRC detect timeout");
            }
            return new Pair<>(this.h, Boolean.valueOf(await));
        } catch (Throwable th) {
            if (this.h == null) {
                StringBuilder a2 = Kb.a("get exception: ");
                a2.append(th.getMessage());
                this.h = E.a(a2.toString());
            }
            return new Pair<>(this.h, Boolean.FALSE);
        }
    }
}
