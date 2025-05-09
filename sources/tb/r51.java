package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27108a;
    public String b;
    public String c;
    public JSONObject d;
    public AppModel e;
    public AppInfoStrategy f;

    static {
        t2o.a(839909792);
    }

    public r51(boolean z) {
        this.f27108a = z;
    }

    public AppModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppModel) ipChange.ipc$dispatch("95db735e", new Object[]{this});
        }
        return this.e;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a839bc7", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.c;
    }

    public AppInfoStrategy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoStrategy) ipChange.ipc$dispatch("40fee6a3", new Object[]{this});
        }
        return this.f;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f27108a;
    }

    public r51 g(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("3724485b", new Object[]{this, appModel});
        }
        this.e = appModel;
        return this;
    }

    public r51 h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("6470b10b", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public r51 i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("a104a39c", new Object[]{this, jSONObject});
        }
        this.d = jSONObject;
        return this;
    }

    public r51 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("5d363413", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public r51 k(AppInfoStrategy appInfoStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r51) ipChange.ipc$dispatch("93cec5a0", new Object[]{this, appInfoStrategy});
        }
        this.f = appInfoStrategy;
        return this;
    }
}
