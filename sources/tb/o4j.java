package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class o4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25139a;
    public Integer b;
    public String c;
    public JSONObject d;
    public String e;
    public String f;
    public MtopStatistics g;

    static {
        t2o.a(481297626);
    }

    public o4j() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7eeea23b", new Object[]{this});
        }
        return this.f;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("ab4ce7aa", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbb17367", new Object[]{this});
        }
        return this.c;
    }

    public final MtopStatistics d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopStatistics) ipChange.ipc$dispatch("ffd20eb5", new Object[]{this});
        }
        return this.g;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("874f5b17", new Object[]{this});
        }
        return this.e;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce08713a", new Object[]{this});
        }
        return this.d;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f25139a;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cf2c9b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad63260", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a26e6ef", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void k(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2e9ef", new Object[]{this, mtopStatistics});
        } else {
            this.g = mtopStatistics;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5336a7", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7db8a", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f25139a = z;
        }
    }

    public o4j(boolean z, Integer num, String str, JSONObject jSONObject, String str2, String str3, MtopStatistics mtopStatistics) {
        this.f25139a = z;
        this.b = num;
        this.c = str;
        this.d = jSONObject;
        this.e = str2;
        this.f = str3;
        this.g = mtopStatistics;
    }

    public /* synthetic */ o4j(boolean z, Integer num, String str, JSONObject jSONObject, String str2, String str3, MtopStatistics mtopStatistics, int i, a07 a07Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? -1 : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : jSONObject, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : mtopStatistics);
    }
}
