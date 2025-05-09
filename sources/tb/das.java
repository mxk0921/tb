package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Map;
import tb.i2c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class das implements i2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f17692a;
    public m b;

    static {
        t2o.a(846200835);
        t2o.a(846200833);
    }

    public das(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f17692a = bbsVar;
    }

    @Override // tb.i2c
    public void M(Map<String, Long> map, TMSRumTarget tMSRumTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4676595", new Object[]{this, map, tMSRumTarget});
            return;
        }
        ckf.g(map, "measures");
        ckf.g(tMSRumTarget, "target");
        ITMSPage topPage = this.f17692a.W().getTopPage();
        pgd pgdVar = topPage == null ? null : (pgd) topPage.getExtension(pgd.class);
        if (pgdVar != null) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    String key = entry.getKey();
                    ckf.d(key);
                    Long value = entry.getValue();
                    ckf.d(value);
                    pgdVar.R0(key, value.longValue(), tMSRumTarget);
                }
            }
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            i2c.a.a(this, bbsVar);
        }
    }

    @Override // tb.i2c
    public void S(Map<String, ? extends Object> map, TMSRumTarget tMSRumTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5f6ed7", new Object[]{this, map, tMSRumTarget});
            return;
        }
        ckf.g(map, "dimensions");
        ckf.g(tMSRumTarget, "target");
        ITMSPage topPage = this.f17692a.W().getTopPage();
        pgd pgdVar = topPage == null ? null : (pgd) topPage.getExtension(pgd.class);
        if (pgdVar != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    String key = entry.getKey();
                    ckf.d(key);
                    Object value = entry.getValue();
                    ckf.d(value);
                    pgdVar.F(key, value, tMSRumTarget);
                }
            }
        }
    }

    @Override // tb.i2c
    public void T(m mVar) {
        pgd pgdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714c3cd0", new Object[]{this, mVar});
            return;
        }
        ckf.g(mVar, pg1.ATOM_EXT_span);
        this.b = mVar;
        ITMSPage topPage = this.f17692a.W().getTopPage();
        if (topPage != null && (pgdVar = (pgd) topPage.getExtension(pgd.class)) != null) {
            pgdVar.G0();
        }
    }

    @Override // tb.i2c
    public m V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("6f315cbc", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            i2c.a.b(this);
        }
    }
}
