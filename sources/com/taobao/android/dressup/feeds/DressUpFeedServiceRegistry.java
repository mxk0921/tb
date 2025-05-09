package com.taobao.android.dressup.feeds;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.service.dresslist.DressListService;
import com.taobao.android.dressup.common.service.interact.InteractService;
import com.taobao.android.turbo.core.service.app.AppLifecycleService;
import com.taobao.android.turbo.core.service.lifecycle.EngineLifecycleService;
import com.taobao.android.turbo.core.service.windvane.WindvaneService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.amb;
import tb.ao2;
import tb.b7d;
import tb.bc6;
import tb.bgc;
import tb.byb;
import tb.d2e;
import tb.fkp;
import tb.fol;
import tb.g1c;
import tb.h59;
import tb.ikb;
import tb.j59;
import tb.jau;
import tb.kee;
import tb.kll;
import tb.q2c;
import tb.rcd;
import tb.rwb;
import tb.sod;
import tb.t2o;
import tb.t5d;
import tb.tgb;
import tb.tpd;
import tb.tsm;
import tb.ttg;
import tb.vjc;
import tb.xod;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/android/dressup/feeds/DressUpFeedServiceRegistry;", "Ltb/xod;", "Ltb/g1c;", "dressUpHostService", "<init>", "(Ltb/g1c;)V", "", "Ljava/lang/Class;", "Ltb/sod;", "getServices", "()Ljava/util/Map;", "Ltb/g1c;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpFeedServiceRegistry implements xod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final g1c dressUpHostService;

    static {
        t2o.a(918552824);
        t2o.a(919601253);
    }

    public DressUpFeedServiceRegistry(g1c g1cVar) {
        this.dressUpHostService = g1cVar;
    }

    @Override // tb.xod
    public Map<Class<? extends sod>, sod> getServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b549f50", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(tgb.class, new AppLifecycleService());
        hashMap.put(q2c.class, new EngineLifecycleService());
        hashMap.put(d2e.class, new jau());
        hashMap.put(b7d.class, new fol());
        hashMap.put(amb.class, new h59());
        hashMap.put(t5d.class, new kll());
        hashMap.put(byb.class, new j59());
        hashMap.put(vjc.class, new ttg());
        hashMap.put(rwb.class, new bc6());
        g1c g1cVar = this.dressUpHostService;
        if (g1cVar != null) {
            hashMap.put(g1c.class, g1cVar);
        } else {
            hashMap.put(g1c.class, new DressListService());
        }
        hashMap.put(bgc.class, new InteractService());
        hashMap.put(tpd.class, new fkp());
        hashMap.put(rcd.class, new tsm());
        hashMap.put(kee.class, new WindvaneService());
        hashMap.put(ikb.class, new ao2());
        return hashMap;
    }
}
