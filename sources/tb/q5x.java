package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q5x<T extends WeexModule> implements c7x<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f26530a;
    public volatile JSONArray b;
    public volatile boolean c;

    static {
        t2o.a(982515927);
        t2o.a(982515931);
    }

    public q5x(Class<T> cls, String[] strArr) {
        this.f26530a = cls;
        this.b = new JSONArray();
        for (String str : strArr) {
            this.b.add(str);
        }
        this.c = true;
    }

    @Override // tb.c7x
    public T a(String str, WeexInstance weexInstance) throws Exception {
        return this.f26530a.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : (String[]) this.f26530a.getDeclaredField("METHODS").get(null)) {
                jSONArray.add(str);
            }
            return jSONArray;
        } catch (Throwable th) {
            dwh.i(th);
            return jSONArray;
        }
    }

    @Override // tb.v6x
    public u6x<T> getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6x) ipChange.ipc$dispatch("94c1b213", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.v6x
    public JSONArray getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bf232bdb", new Object[]{this});
        }
        if (!this.c) {
            this.b = b();
            this.c = true;
        }
        return this.b;
    }

    public q5x(Class<T> cls) {
        this.f26530a = cls;
        this.c = false;
    }
}
