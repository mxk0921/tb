package tb;

import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ej8 implements rbo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_KEY_BASE = "arg";

    /* renamed from: a  reason: collision with root package name */
    public String f18612a;
    public String b;
    public String c;
    public int d;
    public long e = Long.MAX_VALUE;
    public long f = 0;

    static {
        t2o.a(962593032);
        t2o.a(962593059);
    }

    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cf367d", new Object[]{this, l});
            return;
        }
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        if (this.e > l.longValue()) {
            this.e = l.longValue();
        }
        if (this.f < l.longValue()) {
            this.f = l.longValue();
        }
    }

    @Override // tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.d = 0;
        this.f18612a = null;
        this.b = null;
        this.c = null;
        this.e = Long.MAX_VALUE;
        this.f = 0L;
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        this.d = ((Integer) objArr[0]).intValue();
        this.f18612a = (String) objArr[1];
        this.b = (String) objArr[2];
        if (objArr.length > 3 && (obj = objArr[3]) != null) {
            this.c = (String) obj;
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24ffd7bd", new Object[]{this});
        }
        JSONObject jSONObject = (JSONObject) to1.a().d(ReuseJSONObject.class, new Object[0]);
        jSONObject.put("page", (Object) this.f18612a);
        jSONObject.put("monitorPoint", (Object) this.b);
        jSONObject.put("begin", (Object) Long.valueOf(this.e));
        jSONObject.put("end", (Object) Long.valueOf(this.f));
        String str = this.c;
        if (str != null) {
            jSONObject.put("arg", (Object) str);
        }
        return jSONObject;
    }
}
