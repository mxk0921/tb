package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.Za;
import com.alibaba.security.wukong.config.WukongConfigData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Za implements Xa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2578a = "RuleConfigCacheManager";
    public static final String b = "config";
    public static final String c = "config_v2";
    public static final String d = "config_v3";
    public static final String e = "config_v4";
    public static final String f = "config_v6";
    public static final String g = "valid_timestamp";
    public WukongConfigData h;
    public boolean i;
    public final rb k;
    public final String m;
    public VersionInfo j = new VersionInfo();
    public final wb l = new wb(CcrcContextImpl.getContext());

    public Za(String str) {
        this.k = new rb(str);
        this.m = rb.b + str;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (i()) {
            C1184p.b(new Runnable() { // from class: tb.juz
                @Override // java.lang.Runnable
                public final void run() {
                    Za.this.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            j();
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (b("config") || b(c) || b(d) || b(e)) {
            return true;
        }
        return false;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (b("config")) {
            d("config");
        }
        if (b(c)) {
            d(c);
        }
        if (b(d)) {
            d(d);
        }
        if (b(e)) {
            d(e);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void a(xb xbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e0a2", new Object[]{this, xbVar});
        } else {
            this.k.a(xbVar);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void b(VersionInfo versionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf704eb", new Object[]{this, versionInfo});
        } else {
            this.j = versionInfo;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (g()) {
            if (b(f)) {
                d(f);
            }
            if (b(g)) {
                d(g);
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.i;
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.k.a();
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.h = null;
        this.i = false;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        wb wbVar = this.l;
        if (wbVar != null) {
            wbVar.b(this.m, str);
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            b(f, str);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void a(WukongConfigData wukongConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5117fd0b", new Object[]{this, wukongConfigData});
        } else if (wukongConfigData != null) {
            this.h = wukongConfigData;
            e(JsonUtils.toJSONString(wukongConfigData));
            a();
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public WukongConfigData b() {
        WukongConfigData wukongConfigData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongConfigData) ipChange.ipc$dispatch("c0893e4c", new Object[]{this});
        }
        WukongConfigData wukongConfigData2 = this.h;
        if (wukongConfigData2 != null) {
            return wukongConfigData2;
        }
        if (!vb.c().f()) {
            return null;
        }
        String str = (String) this.l.a(this.m, f, "");
        if (TextUtils.isEmpty(str) || (wukongConfigData = (WukongConfigData) JsonUtils.parseObject(str, (Class<Object>) WukongConfigData.class)) == null) {
            return null;
        }
        this.h = wukongConfigData;
        this.i = true;
        return wukongConfigData;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return b(g) && Math.abs(System.currentTimeMillis() - ((Long) this.l.a(this.m, g, 0L)).longValue()) > vb.c().e();
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b(g)) {
            b(g, Long.valueOf(System.currentTimeMillis()));
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (b(str)) {
            d(str);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.j.configMd5;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !str.equals(str2);
    }

    private void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            return;
        }
        wb wbVar = this.l;
        if (wbVar != null) {
            wbVar.b(this.m, str, obj);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        wb wbVar = this.l;
        if (wbVar == null) {
            return false;
        }
        return wbVar.a(this.m, str);
    }

    @Override // com.alibaba.security.ccrc.service.build.Xa
    public boolean a(VersionInfo versionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b89550", new Object[]{this, versionInfo})).booleanValue();
        }
        if (versionInfo == null || TextUtils.isEmpty(versionInfo.configMd5)) {
            return false;
        }
        String a2 = this.k.a();
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        return versionInfo.configMd5.equals(a2);
    }

    private Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj}) : this.l.a(this.m, str, obj);
    }
}
