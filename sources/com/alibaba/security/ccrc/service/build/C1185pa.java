package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1185pa;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.ccrc.service.model.AbsWukongRiskResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.pa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1185pa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2613a = "EngineProcessRegistry";
    public static final Map<String, C1185pa> b = new HashMap();
    public AbstractC1189s d;
    public CcrcService.Config e;
    public AbstractC1157eb f;
    public final Map<String, BaseActionPerform> c = new HashMap();
    public final ConcurrentHashMap<String, AtomicInteger> g = new ConcurrentHashMap<>();

    public C1185pa(String str) {
        b(str);
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            b.put(str, this);
        }
    }

    private void c(InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9a2b5c", new Object[]{this, inferContext});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(this.e, inferContext, "", WukongResultCode.DETECT_HIT_ACTION);
        }
    }

    public void a(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4f11f6", new Object[]{this, baseActionPerform});
        } else if (!this.c.containsKey(baseActionPerform.actionPerformCode())) {
            this.c.put(baseActionPerform.actionPerformCode(), baseActionPerform);
        }
    }

    private Collection<BaseActionPerform> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this}) : this.c.values();
    }

    public static synchronized C1185pa a(String str) {
        synchronized (C1185pa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C1185pa) ipChange.ipc$dispatch("69eb9bb7", new Object[]{str});
            }
            return b.get(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InferContext inferContext, AbsWukongActionRiskResult absWukongActionRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f3725", new Object[]{this, inferContext, absWukongActionRiskResult});
            return;
        }
        int decrementAndGet = this.g.get(inferContext.getMetaId()).decrementAndGet();
        if (absWukongActionRiskResult != null) {
            a(inferContext, absWukongActionRiskResult);
        }
        if (decrementAndGet <= 0) {
            c(inferContext);
            this.g.remove(inferContext.getMetaId());
        }
    }

    public void a(String str, CcrcService.Config config, AbstractC1189s sVar, AbstractC1157eb ebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e2dab", new Object[]{this, str, config, sVar, ebVar});
            return;
        }
        this.d = sVar;
        this.e = config;
        this.f = ebVar;
        for (BaseActionPerform baseActionPerform : this.c.values()) {
            baseActionPerform.activate(str, config, sVar, ebVar);
        }
    }

    public void b(InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e039277d", new Object[]{this, inferContext});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(this.e, inferContext, "", WukongResultCode.DETECT_NO_HIT);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (BaseActionPerform baseActionPerform : this.c.values()) {
            baseActionPerform.release();
        }
    }

    public void a(String str, final InferContext inferContext, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca72f5b", new Object[]{this, str, inferContext, str2, str3, new Integer(i)});
            return;
        }
        if (this.g.get(inferContext.getMetaId()) == null) {
            this.g.put(inferContext.getMetaId(), new AtomicInteger(i));
        }
        for (BaseActionPerform baseActionPerform : b()) {
            if (TextUtils.equals(str, baseActionPerform.actionPerformCode())) {
                try {
                    baseActionPerform.accept(inferContext, str2, str3, new BaseActionPerform.a() { // from class: tb.tuz
                        @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform.a
                        public final void a(AbsWukongActionRiskResult absWukongActionRiskResult) {
                            C1185pa.this.b(inferContext, absWukongActionRiskResult);
                        }
                    });
                } catch (Exception unused) {
                    c(inferContext);
                    this.g.remove(inferContext.getMetaId());
                    return;
                }
            }
        }
    }

    public void a(InferContext inferContext, AbsWukongActionRiskResult absWukongActionRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b9c4364", new Object[]{this, inferContext, absWukongActionRiskResult});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(inferContext, absWukongActionRiskResult);
        }
    }

    public void a(InferContext inferContext, AbsWukongRiskResult absWukongRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0e807a", new Object[]{this, inferContext, absWukongRiskResult});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(inferContext, absWukongRiskResult);
        }
    }

    public void a(InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d8239e", new Object[]{this, inferContext});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(this.e, inferContext, "", WukongResultCode.DETECT_HIT_NO_ACTION);
        }
    }

    public void a(InferContext inferContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5922e1e8", new Object[]{this, inferContext, str});
            return;
        }
        AbstractC1189s sVar = this.d;
        if (sVar != null) {
            sVar.a(this.e, inferContext, str, WukongResultCode.DETECT_ENGINE_EVALUATE_FAIL);
        }
    }
}
