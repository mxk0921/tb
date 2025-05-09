package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class an6 implements fae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596427);
        t2o.a(444596434);
    }

    @Override // tb.fae
    public void a(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab65cddb", new Object[]{this, new Long(j), jSONArray});
        }
    }

    @Override // tb.fae
    public void b(fae faeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfe176", new Object[]{this, faeVar});
        }
    }

    @Override // tb.fae
    public void c(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea043b6", new Object[]{this, new Long(j), obj});
        }
    }

    @Override // tb.fae
    public void d(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
        }
    }

    @Override // tb.fae
    public void e(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723f3fd3", new Object[]{this, new Long(j), new Long(j2)});
        }
    }

    @Override // tb.fae
    public void f(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f31251", new Object[]{this, new Long(j), jSONObject});
        }
    }

    @Override // tb.fae
    public void g(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebe4270", new Object[]{this, new Long(j), str});
        }
    }

    @Override // tb.fae
    public void h(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69061b18", new Object[]{this, new Long(j), new Double(d)});
        }
    }
}
