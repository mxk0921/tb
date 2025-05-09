package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliXSkuCore f26249a;

    static {
        t2o.a(442499192);
    }

    public pr0(AliXSkuCore aliXSkuCore) {
        this.f26249a = aliXSkuCore;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130ba0c5", new Object[]{this});
        } else {
            this.f26249a.p();
        }
    }

    public Map<String, Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e234e2", new Object[]{this});
        }
        return this.f26249a.F();
    }

    public AliXSkuCore c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("af5ec41b", new Object[]{this});
        }
        return this.f26249a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("157c86cc", new Object[]{this});
        }
        return this.f26249a.G();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f3c8106", new Object[]{this});
        }
        return this.f26249a.L();
    }

    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.f26249a.K();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3001b5e", new Object[]{this});
        }
        return this.f26249a.M();
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d99e492", new Object[]{this, jSONObject});
            return;
        }
        vkb w = this.f26249a.w();
        if (w != null) {
            w.a(jSONObject);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702be37e", new Object[]{this});
        } else {
            this.f26249a.d0();
        }
    }
}
