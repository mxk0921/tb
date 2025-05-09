package com.taobao.android.turbo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.app.AppLifecycleService;
import com.taobao.android.turbo.core.service.env.EnvService;
import com.taobao.android.turbo.core.service.lbs.LBSService;
import com.taobao.android.turbo.core.service.lifecycle.EngineLifecycleService;
import com.taobao.android.turbo.core.service.user.UserService;
import com.taobao.android.turbo.core.service.windvane.WindvaneService;
import com.taobao.android.turbo.service.bottombar.BottomBarService;
import com.taobao.android.turbo.service.data.DataService;
import com.taobao.android.turbo.service.page.PageService;
import com.taobao.android.turbo.service.pop.PopMsgService;
import com.taobao.android.turbo.service.redpoint.RedpointService;
import com.taobao.android.turbo.service.scheduler.SchedulerService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.azc;
import tb.b7d;
import tb.byb;
import tb.c1c;
import tb.d4k;
import tb.dbj;
import tb.did;
import tb.f2e;
import tb.fed;
import tb.g4k;
import tb.i4k;
import tb.i4n;
import tb.joj;
import tb.k1e;
import tb.kee;
import tb.ky7;
import tb.m7e;
import tb.mau;
import tb.n3u;
import tb.oem;
import tb.pab;
import tb.pc;
import tb.q2c;
import tb.qcd;
import tb.sic;
import tb.sod;
import tb.ssm;
import tb.t2c;
import tb.t2o;
import tb.tad;
import tb.tgb;
import tb.tjb;
import tb.uff;
import tb.vad;
import tb.vmd;
import tb.xod;
import tb.xwc;
import tb.yfc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/android/turbo/Tab2ServiceRegistry;", "Ltb/xod;", "", "outSide", "<init>", "(Z)V", "", "Ljava/lang/Class;", "Ltb/sod;", "getServices", "()Ljava/util/Map;", "Z", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Tab2ServiceRegistry implements xod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean outSide;

    static {
        t2o.a(916455430);
        t2o.a(919601253);
    }

    public Tab2ServiceRegistry() {
        this(false, 1, null);
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
        hashMap.put(t2c.class, new EnvService());
        hashMap.put(f2e.class, new mau());
        hashMap.put(m7e.class, new UserService());
        hashMap.put(kee.class, new WindvaneService());
        hashMap.put(vmd.class, new SchedulerService());
        hashMap.put(byb.class, new DataService());
        hashMap.put(c1c.class, new ky7());
        hashMap.put(k1e.class, new n3u());
        hashMap.put(xwc.class, new dbj());
        hashMap.put(yfc.class, new uff());
        hashMap.put(b7d.class, new PageService());
        hashMap.put(pab.class, new pc());
        hashMap.put(tad.class, new oem());
        hashMap.put(azc.class, new joj());
        hashMap.put(fed.class, new i4n());
        hashMap.put(sic.class, new LBSService());
        hashMap.put(vad.class, new PopMsgService());
        if (!this.outSide) {
            hashMap.put(qcd.class, new ssm());
            hashMap.put(tjb.class, new BottomBarService());
            hashMap.put(did.class, new RedpointService());
        } else {
            hashMap.put(qcd.class, new g4k());
            hashMap.put(tjb.class, new d4k());
            hashMap.put(did.class, new i4k());
        }
        return hashMap;
    }

    public Tab2ServiceRegistry(boolean z) {
        this.outSide = z;
    }

    public /* synthetic */ Tab2ServiceRegistry(boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z);
    }
}
