package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f22458a;
    public JSONObject b;
    public q9 c;
    public x8 d;
    public z8 e;
    public WeakReference<y7> f;

    static {
        t2o.a(336592915);
    }

    public y7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        WeakReference<y7> weakReference = this.f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("206f4697", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new JSONObject();
        }
        return this.b;
    }

    public x8 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x8) ipChange.ipc$dispatch("1d9b9741", new Object[]{this});
        }
        return this.d;
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f22458a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public <T> q9<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q9) ipChange.ipc$dispatch("dab1a15c", new Object[]{this});
        }
        return this.c;
    }

    public z8 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z8) ipChange.ipc$dispatch("ac28b73b", new Object[]{this});
        }
        return this.e;
    }

    public void g(y7 y7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fde9de", new Object[]{this, y7Var});
        } else {
            this.f = new WeakReference<>(y7Var);
        }
    }

    public void h(x8 x8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878c8fc3", new Object[]{this, x8Var});
        } else {
            this.d = x8Var;
        }
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f22458a = new WeakReference<>(context);
        }
    }

    public void j(q9 q9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628d182e", new Object[]{this, q9Var});
        } else {
            this.c = q9Var;
        }
    }

    public void k(z8 z8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d839dae3", new Object[]{this, z8Var});
        } else {
            this.e = z8Var;
        }
    }
}
