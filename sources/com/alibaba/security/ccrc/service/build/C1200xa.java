package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.AbstractC1145ab;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.C1200xa;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.config.WukongConfigData;
import com.alibaba.security.wukong.config.WukongConfigRequest;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.xa  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1200xa implements xb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2635a = "WuKongBizConfigManager";
    public final Ba b;
    public final String c;
    public final Xa d;
    public final String e;
    public String f;
    public AbstractC1167i g;
    public C h;
    public Long i;

    public C1200xa(Ba ba) {
        this.b = ba;
        this.e = ba.m;
        this.c = ba.e();
        Za za = new Za(ba.m);
        this.d = za;
        za.a(this);
    }

    private Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this});
        }
        return CcrcContextImpl.getContext();
    }

    public Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("b158060c", new Object[]{this});
        }
        return this.i;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return this.d.d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.release();
        }
    }

    public static /* synthetic */ void a(C1200xa xaVar, Object obj, String str, String str2, long j, boolean z, AbstractC1145ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9c1e6", new Object[]{xaVar, obj, str, str2, new Long(j), new Boolean(z), abVar});
        } else {
            xaVar.a(obj, str, str2, j, z, abVar);
        }
    }

    public static /* synthetic */ void a(C1200xa xaVar, String str, String str2, boolean z, Object obj, String str3, long j, WukongConfigData wukongConfigData, boolean z2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd44f61", new Object[]{xaVar, str, str2, new Boolean(z), obj, str3, new Long(j), wukongConfigData, new Boolean(z2), l});
        } else {
            xaVar.a(str, str2, z, obj, str3, j, wukongConfigData, z2, l);
        }
    }

    public synchronized AbstractC1167i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC1167i) ipChange.ipc$dispatch("30a080bb", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new C1164h(CcrcContextImpl.getContext());
        }
        return this.g;
    }

    public WukongConfigRequest a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongConfigRequest) ipChange.ipc$dispatch("27d2eac8", new Object[]{this, str});
        }
        WukongConfigRequest wukongConfigRequest = new WukongConfigRequest(this.e);
        wukongConfigRequest.pId = str;
        wukongConfigRequest.ts = System.currentTimeMillis();
        wukongConfigRequest.isTest = !C1164h.a();
        wukongConfigRequest.configMd5 = this.d.e();
        return wukongConfigRequest;
    }

    public void a(String str, C c, boolean z, AbstractC1145ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126b1c0", new Object[]{this, str, c, new Boolean(z), abVar});
        } else {
            a(str, c, false, z, abVar);
        }
    }

    public synchronized void a(String str, C c, boolean z, boolean z2, AbstractC1145ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cc7dfa", new Object[]{this, str, c, new Boolean(z), new Boolean(z2), abVar});
            return;
        }
        this.f = str;
        this.h = c;
        this.d.c();
        WukongConfigData b = this.d.b();
        if (!z && b != null && this.d.a(b.versionInfo)) {
            this.i = Long.valueOf(System.currentTimeMillis());
            abVar.a(true, null, b);
            this.d.b(b.versionInfo);
            this.d.a();
        } else if (!z2) {
            abVar.a(false, "disk cache not exist", null);
        } else {
            a().a(a(str), new C1198wa(this, System.currentTimeMillis(), str, z, abVar));
        }
    }

    public void a(final AbstractC1145ab abVar) {
        C c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edc40b", new Object[]{this, abVar});
        } else if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.e) && (c = this.h) != null) {
            a(this.f, c, true, true, new AbstractC1145ab() { // from class: tb.dvz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1145ab
                public final void a(boolean z, String str, WukongConfigData wukongConfigData) {
                    C1200xa.a(AbstractC1145ab.this, z, str, wukongConfigData);
                }
            });
        } else if (abVar != null) {
            abVar.a(false, "force update fail ,prepare has not called yet", null);
        }
    }

    public static /* synthetic */ void a(AbstractC1145ab abVar, boolean z, String str, WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24af60a0", new Object[]{abVar, new Boolean(z), str, wukongConfigData});
        } else if (abVar != null) {
            abVar.a(z, str, wukongConfigData);
        }
    }

    private Long a(boolean z, WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("ad9109ae", new Object[]{this, new Boolean(z), wukongConfigData});
        }
        if (!z) {
            return null;
        }
        try {
            if (b() == null) {
                return null;
            }
            return Long.valueOf(System.currentTimeMillis() - Math.max(b().longValue(), wukongConfigData.lastModifyTime));
        } catch (Throwable th) {
            Logging.e(f2635a, "getRuleRT fail", th);
            return null;
        }
    }

    private void a(String str, String str2, boolean z, Object obj, String str3, long j, WukongConfigData wukongConfigData, boolean z2, Long l) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d51586", new Object[]{this, str, str2, new Boolean(z), obj, str3, new Long(j), wukongConfigData, new Boolean(z2), l});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(C1174ka.a.c);
        if (!z) {
            i = -1;
        }
        TrackLog.Builder tag = operation.setStatus(i).setTag("MTOP");
        if (z) {
            obj = null;
        } else if (!C1164h.a()) {
            obj = wukongConfigData;
        }
        TrackManager.track(tag.addParam("response", obj).addParam("errorMsg", str3).addParam("costTime", Long.valueOf(j)).addParam("forceUpdate", Boolean.valueOf(z2)).addParam("ruleRT", l).addParam("prepareID", this.c).build());
    }

    public WukongConfigData a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongConfigData) ipChange.ipc$dispatch("285e527", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            return (WukongConfigData) obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    private synchronized void a(Object obj, String str, String str2, long j, boolean z, AbstractC1145ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e06ab8b", new Object[]{this, obj, str, str2, new Long(j), new Boolean(z), abVar});
            return;
        }
        WukongConfigData a2 = a(obj);
        if (a2 == null) {
            abVar.a(false, "biz config data is null", null);
            return;
        }
        Pair<Boolean, String> a3 = a(a2, str2);
        Long a4 = a(z, a2);
        if (!((Boolean) a3.first).booleanValue()) {
            abVar.a(false, (String) a3.second, null);
            a(str, str2, false, obj, (String) a3.second, j, a2, z, a4);
            return;
        }
        this.d.b(a2.versionInfo);
        abVar.a(true, (String) a3.second, a2);
        this.d.a(a2);
        this.i = Long.valueOf(System.currentTimeMillis());
        a(str, str2, true, obj, (String) a3.second, j, a2, z, a4);
    }

    private Pair<Boolean, String> a(WukongConfigData wukongConfigData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bfdf911f", new Object[]{this, wukongConfigData, str});
        }
        if (wukongConfigData == null || wukongConfigData.event == null) {
            return new Pair<>(Boolean.FALSE, "biz config data is null");
        }
        if (!wukongConfigData.isValid(str)) {
            return new Pair<>(Boolean.FALSE, "event config data is invalid");
        }
        if (TextUtils.isEmpty(wukongConfigData.event)) {
            return new Pair<>(Boolean.FALSE, "rule is null");
        }
        return new Pair<>(Boolean.TRUE, "");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.b.a(str, str2, this.f, true);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.xb
    public void a(VersionInfo versionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b8954c", new Object[]{this, versionInfo});
            return;
        }
        Ba ba = this.b;
        if (ba != null && this.d != null && ba.g() && this.d.a(versionInfo.configMd5)) {
            a(new AbstractC1145ab() { // from class: tb.cvz
                @Override // com.alibaba.security.ccrc.service.build.AbstractC1145ab
                public final void a(boolean z, String str, WukongConfigData wukongConfigData) {
                    C1200xa.this.a(z, str, wukongConfigData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f918f3fd", new Object[]{this, new Boolean(z), str, wukongConfigData});
        } else if (z && a(wukongConfigData)) {
            a(wukongConfigData.featureSet, wukongConfigData.event);
        }
    }

    private boolean a(WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5117fd0f", new Object[]{this, wukongConfigData})).booleanValue();
        }
        WukongConfigData b = this.d.b();
        if (b == null || !a(b.eventCodes, wukongConfigData.eventCodes) || a(b, wukongConfigData)) {
            return false;
        }
        if (!b.featureSet.equals(wukongConfigData.featureSet)) {
            return true;
        }
        return !b.event.equals(wukongConfigData.event);
    }

    private boolean a(WukongConfigData wukongConfigData, WukongConfigData wukongConfigData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91080c4c", new Object[]{this, wukongConfigData, wukongConfigData2})).booleanValue();
        }
        List<Algo> pythonList = wukongConfigData.getPythonList();
        List<Algo> pythonList2 = wukongConfigData2.getPythonList();
        if (pythonList.isEmpty() && pythonList2.isEmpty()) {
            return false;
        }
        if (pythonList.size() != pythonList2.size()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        for (Algo algo : pythonList) {
            hashMap.put(algo.code, algo.version);
        }
        HashMap hashMap2 = new HashMap();
        for (Algo algo2 : pythonList2) {
            hashMap2.put(algo2.code, algo2.version);
        }
        return !hashMap.equals(hashMap2);
    }

    private boolean a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }
}
