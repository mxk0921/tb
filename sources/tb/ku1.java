package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ku1<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jj8 f22924a;
    public nwi b;

    static {
        t2o.a(573571079);
    }

    public final void b(nwi nwiVar, zk8<T> zk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54d9370", new Object[]{this, nwiVar, zk8Var});
        } else if (zk8Var == null) {
            jgh.a("BaseEvent", "execute: param is null, name=" + d());
        } else {
            this.f22924a = zk8Var.a();
            this.b = nwiVar;
            jgh.a("BaseEvent", "start onExecute: " + d() + ", data=" + zk8Var.b());
            e(zk8Var.b());
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74992339", new Object[]{this, str, str2});
            return;
        }
        jj8 jj8Var = this.f22924a;
        if (jj8Var != null) {
            jj8Var.onFail(str, str2);
        }
    }

    public abstract String d();

    public abstract void e(T t);

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
            return;
        }
        jj8 jj8Var = this.f22924a;
        if (jj8Var != null) {
            jj8Var.onSuccess(jSONObject);
        }
    }
}
