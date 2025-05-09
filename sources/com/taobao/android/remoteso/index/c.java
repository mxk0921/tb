package com.taobao.android.remoteso.index;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.bg4;
import tb.cgd;
import tb.cgg;
import tb.igd;
import tb.jg9;
import tb.kgd;
import tb.obn;
import tb.qbn;
import tb.rbn;
import tb.trq;
import tb.uec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c implements igd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SoIndexData g = new SoIndexData();
    public static final long h = TimeUnit.SECONDS.toMillis(40);

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9258a;
    public final cgd b;
    public final obn c;
    public final d d;
    public final uec e;
    public final List<SoIndexData> f = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                List a2 = c.a(c.this);
                if (!a2.isEmpty()) {
                    c.b(c.this, a2);
                }
            } catch (IOException e) {
                rbn.g("writeLastIndex-failed", e);
                jg9.f(c.c(c.this));
            }
        }
    }

    public c(Application application, kgd kgdVar, cgd cgdVar, obn obnVar, d dVar, uec uecVar) {
        this.f9258a = kgdVar;
        this.b = cgdVar;
        this.c = obnVar;
        this.d = dVar;
        this.e = uecVar;
    }

    public static /* synthetic */ List a(c cVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bfdb41f2", new Object[]{cVar});
        }
        return cVar.e();
    }

    public static /* synthetic */ void b(c cVar, List list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b50f05", new Object[]{cVar, list});
        } else {
            cVar.k(list);
        }
    }

    public static /* synthetic */ File c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1d56137a", new Object[]{cVar});
        }
        return cVar.d();
    }

    public final File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("8ec1e17c", new Object[]{this});
        }
        return new File(this.c.c(), "last_index");
    }

    public final SoIndexData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData) ipChange.ipc$dispatch("9188c67e", new Object[]{this});
        }
        try {
            return this.d.i();
        } catch (Throwable th) {
            rbn.g("lastCache.getCurrentIndex", th);
            return g;
        }
    }

    public final List<SoIndexData> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a1aa957c", new Object[]{this});
        }
        return this.f;
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed120933", new Object[]{this, str})).booleanValue();
        }
        return this.b.b("key_last_index_disabled_list", "").contains(str);
    }

    public final List<SoIndexData> e() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("507754ba", new Object[]{this});
        }
        RSoLog.d("performLastIndex, enter ");
        SoIndexData f = f();
        if (!this.f9258a.c(f.getAppVersion())) {
            RSoLog.d("performLastIndex, skip, only allow major app version. curr ver = " + f.getAppVersion());
            return Collections.emptyList();
        }
        SoIndexData soIndexData = new SoIndexData();
        soIndexData.setAppVersion(f.getAppVersion());
        for (Map.Entry<String, SoIndexData.SoIndexEntry> entry : f.getEntries().entrySet()) {
            String key = entry.getKey();
            SoInfo2 e = this.d.e(key);
            if (e != null && e.ext.allowLastIndex) {
                soIndexData.getEntries().put(key, entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(g());
        arrayList.add(0, soIndexData);
        return arrayList;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4e8f33", new Object[]{this});
        } else if (this.b.a("switch_last_cache_disabled", false)) {
            RSoLog.d("LastCache, initLastIndex(), disabled ");
        } else {
            try {
                String l = l();
                if (trq.e(l)) {
                    ((ArrayList) this.f).addAll(JSON.parseArray(l, SoIndexData.class));
                }
                RSoLog.d("initLastIndex, lastIndexList = " + this.f);
            } catch (Throwable th) {
                rbn.g("LastCache-> initLastIndex", th);
            }
        }
    }

    public List<SoIndexData> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("723a2142", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (SoIndexData soIndexData : g()) {
            if (trq.f(soIndexData.getAppVersion(), f().getAppVersion())) {
                arrayList.add(soIndexData);
            }
        }
        if (this.b.a("key_allow_hardcode_last_index", true)) {
            arrayList.add(cgg.a());
        }
        this.e.b(arrayList);
        return arrayList;
    }

    public final void k(List<SoIndexData> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365ad76", new Object[]{this, list});
            return;
        }
        int c = (int) this.b.c("key_last_index_info_count_max", 2L);
        RSoLog.d("performLastIndex, add finish, lastIndexList = " + list);
        if (list.size() > c) {
            list = list.subList(0, c);
        }
        String jSONString = JSON.toJSONString(list);
        jg9.q(d(), jSONString);
        RSoLog.d("performLastIndex, write finish, jsonString = " + jSONString);
    }

    public final String l() throws IOException {
        byte[] p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("748517d3", new Object[]{this});
        }
        String b = bg4.b(this.b, "last_index");
        if (trq.e(b)) {
            RSoLog.d("readLast, readFromCustomIndex, from custom index, customIndex=" + b);
            return b;
        }
        File d = d();
        if (!d.isFile() || (p = jg9.p(d)) == null || p.length <= 1) {
            RSoLog.d("readLast, empty");
            return null;
        }
        RSoLog.d("readLast, from lastIndexFile");
        return new String(p);
    }

    @Override // tb.igd
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else if (this.b.a("switch_last_cache_disabled", false)) {
            RSoLog.d("LastCache, trigger(), disabled ");
        } else {
            RSoLog.d("LastCache, trigger(), enter ");
            qbn.e(new a(), h);
        }
    }
}
