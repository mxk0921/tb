package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.RunState;
import com.alibaba.security.ccrc.interfaces.OnAlgoResultCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1193u;
import com.alibaba.security.ccrc.service.build.C1199x;
import com.alibaba.security.ccrc.service.build.F;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.interfaces.AbsWuKongDetectListener;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.config.WukongConfigData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.protocol.RiskSample;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alibaba.security.wukong.pipe.SyncPipeConfig;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.x  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1199x implements r, AbstractC1157eb, C1193u.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2634a = "CcrcServiceManager";
    public final Ba b;
    public final C1186q c;
    public final C1185pa d;
    public final C1195v f;
    public final A g;
    public final C1193u h;
    public final String k;
    public final String l;
    public final C1162ga m;
    public CcrcService.Config o;
    public Uploader p;
    public final yb q;
    public volatile RunState n = RunState.INITIAL;
    public final C e = new C();
    public final G i = new G();
    public final D j = new D();

    public C1199x(String str) {
        this.k = str;
        String c = c(str);
        this.l = c;
        this.q = new RiskDataPipeManager(str);
        A a2 = new A(c, str, this);
        this.g = a2;
        this.d = new C1185pa(str);
        C1195v vVar = new C1195v(str);
        this.f = vVar;
        this.m = new C1162ga(str);
        Ba ba = new Ba(str, c);
        this.b = ba;
        ba.a(this);
        ba.a(vVar);
        this.c = new C1186q(ba);
        C1193u uVar = new C1193u(str);
        this.h = uVar;
        ba.a(uVar);
        ba.a(a2);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        a(new C1146b(context));
        a(new C1149c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(CcrcService.Config config, long j, I i, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2a1793", new Object[]{this, config, new Long(j), i, new Boolean(z), str, map});
        } else {
            a(config, z, str, j, i);
        }
    }

    private void d(CcrcService.Config config, long j, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96a85ad", new Object[]{this, config, new Long(j), i});
            return;
        }
        try {
            this.f.a();
            c(config);
            l();
            this.e.a(this.k, config, this);
            this.d.a(this.k, config, this.g, this);
            b(config, j, i);
        } catch (Throwable th) {
            Logging.e(f2634a, "do activate fail", th);
            c(RunState.PREPARE_SUCCESS);
        }
    }

    private void e(final CcrcService.Config config, final long j, final I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd0f4ee", new Object[]{this, config, new Long(j), i});
        } else {
            this.j.a(new AbstractC1191t() { // from class: tb.zuz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1191t
                public final void a(boolean z, String str, Map map) {
                    C1199x.this.c(config, j, i, z, str, map);
                }
            });
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.h.a(this.b.m(), this, this.g);
        }
    }

    private Map<String, Object> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_data", this.b.a());
        hashMap.put("isHitDiskCache", Boolean.valueOf(this.b.i()));
        return hashMap;
    }

    public void a(BaseWukongContentRiskPlugin baseWukongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6fe09e", new Object[]{this, baseWukongContentRiskPlugin});
        } else {
            this.e.a(baseWukongContentRiskPlugin);
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return this.b.b();
    }

    public List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        return this.b.d();
    }

    @Override // com.alibaba.security.ccrc.service.build._a
    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this});
        }
        return this.k;
    }

    public Uploader h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uploader) ipChange.ipc$dispatch("db4981ad", new Object[]{this});
        }
        return this.p;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (b(RunState.ACTIVE_ING) || b(RunState.ACTIVE_WAITING)) {
            return true;
        }
        return false;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true ^ this.b.k();
    }

    private void c(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b243d6d", new Object[]{this, config});
            return;
        }
        Bb.a(this.k, this.q);
        WukongConfigData c = this.b.c();
        if (c != null) {
            Ab ab = new Ab();
            ab.f2541a = this.k;
            ab.b = config.getPid();
            this.q.registerPipe(ab, c.eventCodes);
            SyncPipeConfig syncPipeConfig = this.q.getSyncPipeConfig(c.eventCodes);
            if (syncPipeConfig != null) {
                this.q.writeRiskData(ab, syncPipeConfig.defaultRiskData);
            }
        }
    }

    public void a(Uploader uploader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d780a6", new Object[]{this, uploader});
        } else {
            this.p = uploader;
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (j()) {
            Logging.d(f2634a, "wukong sdk has downgrade");
        } else if (a(RunState.ACTIVE_SUCCESS)) {
            Logging.w(f2634a, "sdk not init yet, so do not release");
        } else {
            Bb.b(this.k);
            if (this.b.c() != null) {
                Ab ab = new Ab();
                ab.b = this.o.getPid();
                this.q.unregisterPipe(ab);
            }
            this.g.a(this.o, this.k);
            this.b.o();
            this.f.b();
            this.d.a();
            this.e.b();
            this.h.a();
            c(RunState.INITIAL);
        }
    }

    public synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (j()) {
            Logging.w(f2634a, "wukong sdk has downgrade");
        } else if (CcrcContextImpl.getContext() == null) {
            Logging.e(f2634a, "sdk has not init");
        } else if (a(RunState.INITIAL)) {
            Logging.w(f2634a, "not initial state");
        } else {
            c(RunState.PREPARING);
            a(this.l, false, new AbstractC1154db() { // from class: tb.bvz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
                public final void a(boolean z, String str, Map map) {
                    C1199x.this.a(z, str, map);
                }
            });
        }
    }

    private void b(final CcrcService.Config config, final long j, final I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229da72b", new Object[]{this, config, new Long(j), i});
        } else {
            this.b.a(config, new AbstractC1154db() { // from class: tb.yuz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
                public final void a(boolean z, String str, Map map) {
                    C1199x.this.b(config, j, i, z, str, map);
                }
            });
        }
    }

    public void a(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4f11f6", new Object[]{this, baseActionPerform});
        } else {
            this.d.a(baseActionPerform);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else {
            c(z ? RunState.PREPARE_SUCCESS : RunState.INITIAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(CcrcService.Config config, long j, I i, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2816b892", new Object[]{this, config, new Long(j), i, new Boolean(z), str, map});
            return;
        }
        c(z ? RunState.ACTIVE_SUCCESS : RunState.PREPARE_SUCCESS);
        this.g.a(config, WukongActivateRiskResult.create(z ? WukongResultCode.ACTIVATE_SUCCESS : WukongResultCode.ACTIVATE_FAIL, str, this.k, config.getPid()), m(), j, i);
    }

    public void a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.m.a(str, obj, z);
        }
    }

    private void a(final String str, boolean z, final AbstractC1154db dbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192c3c08", new Object[]{this, str, new Boolean(z), dbVar});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        CcrcContextImpl.getInstance().setAppVersion(C1180n.a(CcrcContextImpl.getContext()));
        CcrcContextImpl.getInstance().setAppName(C1180n.b(CcrcContextImpl.getContext()));
        this.g.a(str, this.k);
        this.b.a(str, this.e, z, new AbstractC1154db() { // from class: tb.avz
            @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
            public final void a(boolean z2, String str2, Map map) {
                C1199x.this.a(str, currentTimeMillis, dbVar, z2, str2, map);
            }
        });
    }

    private void b(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6e70ac", new Object[]{this, config});
        } else {
            this.e.a(this.k, config, this);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.C1193u.b
    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.b.b(str);
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1157eb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.a();
    }

    private synchronized boolean b(RunState runState) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15cb8b69", new Object[]{this, runState})).booleanValue();
            }
            if (this.n != runState) {
                z = false;
            }
            return z;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build._a
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        CcrcService.Config config = this.o;
        return config == null ? this.l : config.getPid();
    }

    private boolean c(CcrcService.Config config, long j, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66041670", new Object[]{this, config, new Long(j), i})).booleanValue();
        }
        if (config == null || TextUtils.isEmpty(config.getPid())) {
            this.g.a(config, WukongActivateRiskResult.create(WukongResultCode.ACTIVATE_FAIL, F.a.d, this.k, null), m(), j, i);
            return false;
        } else if (CcrcContextImpl.getContext() == null) {
            this.g.a(config, WukongActivateRiskResult.create(WukongResultCode.ACTIVATE_FAIL, F.a.c, this.k, config.getPid()), m(), j, i);
            return false;
        } else if (CcrcContextImpl.getInstance().getTtid() != null) {
            return true;
        } else {
            this.g.a(config, WukongActivateRiskResult.create(WukongResultCode.ACTIVATE_FAIL, F.a.d, this.k, config.getPid()), m(), j, i);
            return false;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j, AbstractC1154db dbVar, boolean z, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88761f", new Object[]{this, str, new Long(j), dbVar, new Boolean(z), str2, map});
            return;
        }
        if (z) {
            b(CcrcContextImpl.getContext());
        }
        this.g.a(str, this.k, z, str2, j);
        if (dbVar != null) {
            dbVar.a(z, str2, map);
        }
        this.j.a(z, str2, map);
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1157eb
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e.a(this.i.a(context), this.f);
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        return ("PREPARE_" + str + "_" + UUID.randomUUID().toString()).toUpperCase();
    }

    private synchronized void c(RunState runState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b45b1a6", new Object[]{this, runState});
        } else {
            this.n = runState;
        }
    }

    public void a(CcrcService.Config config, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe648f8", new Object[]{this, config, i});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.o = config;
        this.g.a(config);
        String str = null;
        if (j()) {
            A a2 = this.g;
            WukongResultCode wukongResultCode = WukongResultCode.ACTIVATE_FAIL;
            String str2 = this.k;
            if (config != null) {
                str = config.getPid();
            }
            a2.a(config, WukongActivateRiskResult.create(wukongResultCode, F.a.e, str2, str), m(), currentTimeMillis, i);
        } else if (c(config, currentTimeMillis, i)) {
            if (b(RunState.ACTIVE_SUCCESS)) {
                this.g.a(config, WukongActivateRiskResult.create(WukongResultCode.ACTIVATED, null, this.k, config.getPid()), m(), currentTimeMillis, i);
            } else if (i()) {
                A a3 = this.g;
                WukongResultCode wukongResultCode2 = WukongResultCode.ACTIVATE_ING;
                StringBuilder a4 = Kb.a("sdk is activating current activate pid is: ");
                a4.append(d());
                a3.a(config, WukongActivateRiskResult.create(wukongResultCode2, a4.toString(), this.k, config.getPid()), m(), currentTimeMillis, i);
            } else if (b(RunState.PREPARE_SUCCESS)) {
                c(RunState.ACTIVE_ING);
                d(config, currentTimeMillis, i);
            } else if (b(RunState.PREPARING)) {
                c(RunState.ACTIVE_WAITING);
                e(config, currentTimeMillis, i);
            } else {
                c(RunState.ACTIVE_ING);
                a(config, currentTimeMillis, i);
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.build._a
    public WukongConfigData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WukongConfigData) ipChange.ipc$dispatch("e61d474d", new Object[]{this}) : this.b.c();
    }

    public void a(final CcrcService.Config config, final long j, final I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3737ea", new Object[]{this, config, new Long(j), i});
        } else {
            a(config.getPid(), true, new AbstractC1154db() { // from class: tb.xuz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
                public final void a(boolean z, String str, Map map) {
                    C1199x.this.a(config, j, i, z, str, map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CcrcService.Config config, long j, I i, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26035991", new Object[]{this, config, new Long(j), i, new Boolean(z), str, map});
        } else {
            a(config, z, str, j, i);
        }
    }

    private void a(CcrcService.Config config, boolean z, String str, long j, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f5edd2", new Object[]{this, config, new Boolean(z), str, new Long(j), i});
        } else if (!z) {
            c(RunState.INITIAL);
            this.g.a(config, WukongActivateRiskResult.create(WukongResultCode.ACTIVATE_FAIL, str, this.k, config.getPid()), m(), j, i);
        } else {
            d(config, j, i);
        }
    }

    private void a(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8a3eb", new Object[]{this, config});
        } else {
            this.d.a(this.k, config, this.g, this);
        }
    }

    private SampleData a(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampleData) ipChange.ipc$dispatch("5ea75f28", new Object[]{this, cCRCRiskSample}) : SampleData.transform(cCRCRiskSample);
    }

    public void a(CCRCRiskSample cCRCRiskSample, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fecc9b3", new Object[]{this, cCRCRiskSample, new Boolean(z)});
        } else if (cCRCRiskSample != null) {
            this.g.a(this.o, cCRCRiskSample, z, this.n.name());
            cCRCRiskSample.getExtras().put(RiskSample.START_DETECT_TIME, Long.valueOf(System.currentTimeMillis()));
            if (j()) {
                this.g.a(this.o, cCRCRiskSample, F.a.e);
            } else if (!cCRCRiskSample.isValid()) {
                this.g.a(this.o, cCRCRiskSample, F.a.d);
            } else if (a(RunState.ACTIVE_SUCCESS)) {
                this.g.a(this.o, cCRCRiskSample, F.a.b);
            } else {
                this.c.a(this.e, cCRCRiskSample, this.o, z);
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.r, com.alibaba.security.ccrc.service.build.AbstractC1157eb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b.a(str);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.r
    public void a(CcrcService.Config config, String str, Map<String, Object> map, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3179cc9", new Object[]{this, config, str, map, cCRCRiskSample});
        } else if (map != null) {
            a(config.getPid(), str, map, SampleData.transform(cCRCRiskSample));
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.C1193u.b
    public void a(CcrcService.Config config, String str, Map<String, Object> map, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f130a3", new Object[]{this, config, str, map, sampleData});
        } else if (map != null) {
            a(config.getPid(), str, map, sampleData);
        }
    }

    private void a(String str, String str2, Map<String, Object> map, SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73d4e3c", new Object[]{this, str, str2, map, sampleData});
        } else {
            this.b.a(str, str2, map, sampleData);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1157eb
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        for (BaseWukongContentRiskPlugin baseWukongContentRiskPlugin : this.e.a()) {
            baseWukongContentRiskPlugin.switchAlgo(str, z);
        }
    }

    private synchronized boolean a(RunState runState) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0516528", new Object[]{this, runState})).booleanValue();
            }
            if (this.n == runState) {
                z = false;
            }
            return z;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1157eb
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : b(RunState.ACTIVE_SUCCESS);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.a(z);
        }
    }

    public void a(OnAlgoResultCallback onAlgoResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef738e60", new Object[]{this, onAlgoResultCallback});
        } else {
            this.f.a(onAlgoResultCallback);
        }
    }

    public void a(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80fa8f", new Object[]{this, onDetectRiskListener});
        } else {
            this.g.a(onDetectRiskListener);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b.a(map);
        }
    }

    public void a(AbsWuKongDetectListener absWuKongDetectListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6715de", new Object[]{this, absWuKongDetectListener});
        } else {
            this.g.a(absWuKongDetectListener);
        }
    }
}
