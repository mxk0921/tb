package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25921a;
    public final List<String> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final JSONObject h;

    static {
        t2o.a(352322188);
    }

    public p7l(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        boolean y = byj.y("enable_newdetail_optimize_when_nav", "true");
        this.f25921a = y;
        if (y) {
            String Z = byj.Z("enable_newdetail_optimize_when_nav_blacklist", "");
            if (!TextUtils.isEmpty(Z)) {
                Collections.addAll(arrayList, Z.split(","));
            }
            if (jSONObject != null) {
                this.h = jSONObject;
                this.c = !"false".equals(jSONObject.getString("enableAllOptimize"));
                this.d = !"false".equals(jSONObject.getString("enableNavPreloadRequest"));
                this.e = !"false".equals(jSONObject.getString("enableNavNormalRequest"));
                this.f = !"false".equals(jSONObject.getString("enableRequestZstd"));
                this.g = !"false".equals(jSONObject.getString("enableFcpViewAsync"));
            }
        }
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("567235ee", new Object[]{this, str});
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return null;
        }
        return this.h;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cb7d5e6", new Object[]{this, str})).booleanValue();
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return false;
        }
        return true;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("415b6886", new Object[]{this, str})).booleanValue();
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return false;
        }
        return this.g;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a646dc7", new Object[]{this, str})).booleanValue();
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return false;
        }
        return this.e;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("473dae11", new Object[]{this, str})).booleanValue();
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return false;
        }
        return this.d;
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54a9b960", new Object[]{this, str})).booleanValue();
        }
        if (!this.c || !this.f25921a || this.b.contains(str)) {
            return false;
        }
        return this.f;
    }

    public p7l() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.f25921a = byj.y("enable_newdetail_optimize_when_nav", "true");
        String Z = byj.Z("enable_newdetail_optimize_when_nav_blacklist", "");
        if (!TextUtils.isEmpty(Z)) {
            Collections.addAll(arrayList, Z.split(","));
        }
        this.h = new JSONObject();
    }
}
