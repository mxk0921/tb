package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dd8 implements qyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537613);
        t2o.a(745537614);
    }

    @Override // tb.qyd
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8ff64a", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.qyd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d044c341", new Object[]{this, str});
        }
    }

    @Override // tb.qyd
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c7db8e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.qyd
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49c09c8a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.qyd
    public void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13519748", new Object[]{this, str, jSONObject});
        }
    }

    @Override // tb.qyd
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd365e00", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.qyd
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3e2cff", new Object[]{this, new Integer(i)});
        }
    }
}
