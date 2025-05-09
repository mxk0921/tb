package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.service.redpoint.RedpointService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import tb.f2e;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class t12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RedpointModel f28398a;
    public final qpu b;

    static {
        t2o.a(916455622);
    }

    public t12(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.b = qpuVar;
    }

    public final qpu c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("cda2dfaa", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66c4d118", new Object[]{this});
        }
        return a.h();
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6147350a", new Object[]{this});
        }
        RedpointModel redpointModel = this.f28398a;
        if (redpointModel != null) {
            ckf.d(redpointModel);
            if (redpointModel.getIconStreams() != null) {
                RedpointModel redpointModel2 = this.f28398a;
                ckf.d(redpointModel2);
                String iconStreams = redpointModel2.getIconStreams();
                ckf.d(iconStreams);
                return iconStreams;
            }
        }
        return "";
    }

    public final RedpointModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedpointModel) ipChange.ipc$dispatch("20f27d09", new Object[]{this});
        }
        return this.f28398a;
    }

    public final void g(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac0de2", new Object[]{this, redpointModel});
        } else {
            ((did) this.b.getService(did.class)).O0(redpointModel);
        }
    }

    public final void h(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2d9d37", new Object[]{this, redpointModel});
        } else {
            this.f28398a = redpointModel;
        }
    }

    public final void j(RedpointModel redpointModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c03697", new Object[]{this, redpointModel});
            return;
        }
        ckf.g(redpointModel, "redpoint");
        f2e f2eVar = (f2e) this.b.getService(f2e.class);
        HashMap hashMap = new HashMap();
        hashMap.put("x_tab2type", 0);
        hashMap.put("show_redpoint", Boolean.FALSE);
        Map<String, String> utParams = redpointModel.getUtParams();
        if (utParams != null) {
            hashMap.putAll(utParams);
        }
        f2e.a.c(f2eVar, "Page_GuangGuang", "TabGif", a.j(jpu.a("ucpEnabled", 0), jpu.a("ucpABConfig", "{}"), jpu.a("utLogMap", hashMap), jpu.a("guangguangCreated", Boolean.valueOf(((b7d) this.b.getService(b7d.class)).getPageState() != -1)), jpu.a("ltv", Boolean.valueOf(((did) this.b.getService(did.class)).s1())), jpu.a("continuation", v3i.f(jpu.a("iconId", ((did) this.b.getService(did.class)).F0())))), "a2141.1", "tabbar.guanggif", false, 32, null);
    }

    public final void i() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6c27d1", new Object[]{this});
            return;
        }
        RedpointModel redpointModel = this.f28398a;
        did didVar = (did) this.b.getService(did.class);
        f2e f2eVar = (f2e) this.b.getService(f2e.class);
        if (((b7d) this.b.getService(b7d.class)).getPageState() == -1) {
            z = false;
        }
        if (redpointModel == null || !redpointModel.isIconMode()) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, RedpointService.TAG, "trackConsumeIcon emptyParams, redpoint: " + redpointModel, null, 4, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sceneSource", "Default");
            linkedHashMap.put("x_tab2type", 0);
            linkedHashMap.put("x_name", didVar.x1());
            linkedHashMap.putAll(d());
            HashMap hashMap = new HashMap();
            hashMap.put("ucpEnabled", 0);
            hashMap.put("ucpABConfig", "{}");
            hashMap.put("guangguangCreated", Boolean.valueOf(z));
            hashMap.put("utLogMap", linkedHashMap);
            hashMap.put("x_name", didVar.x1());
            hashMap.put("ltv", Boolean.valueOf(didVar.s1()));
            hashMap.put("continuation", v3i.f(jpu.a("iconId", didVar.F0())));
            f2e.a.c(f2eVar, "Page_GuangGuang", "Button-TabDefault", hashMap, "a2141.1", "tabbar.GuangTabDefault", false, 32, null);
            if (didVar.u1()) {
                hashMap.put("spm-cnt", "a21afv.b53023999");
                f2e.a.a(f2eVar, "Page_GuangGuang", "TabEmpty", hashMap, "a21afv.b53023999", null, false, 32, null);
                return;
            }
            return;
        }
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, RedpointService.TAG, "trackConsumeIcon, redpoint: " + redpointModel, null, 4, null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("x_tab2type", 0);
        if (redpointModel.getUtParams() != null) {
            Map<String, String> utParams = redpointModel.getUtParams();
            ckf.d(utParams);
            linkedHashMap2.putAll(utParams);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ucpEnabled", 0);
        hashMap2.put("ucpABConfig", "{}");
        hashMap2.put("guangguangCreated", Boolean.valueOf(z));
        hashMap2.put("utLogMap", linkedHashMap2);
        hashMap2.put("x_name", didVar.x1());
        hashMap2.put("ltv", Boolean.valueOf(didVar.s1()));
        hashMap2.put("continuation", v3i.f(jpu.a("iconId", didVar.F0())));
        f2e.a.c(f2eVar, "Page_GuangGuangHome", "Gif", hashMap2, "a21afv.19776901", "tab.2", false, 32, null);
        if (didVar.u1()) {
            hashMap2.put("spm-cnt", "a21afv.b53023999");
            f2e.a.a(f2eVar, "Page_GuangGuang", "TabIcon", hashMap2, "a21afv.b53023999", null, false, 32, null);
        }
    }
}
