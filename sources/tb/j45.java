package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.model.DAIModelTriggerType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DAIModelTriggerType f21753a;
    public l45 b;
    public String c = null;

    static {
        t2o.a(1034944696);
    }

    public l45 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l45) ipChange.ipc$dispatch("ff4b9db1", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db7a6289", new Object[]{this});
        }
        return this.c;
    }

    public DAIModelTriggerType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIModelTriggerType) ipChange.ipc$dispatch("c001e7b1", new Object[]{this});
        }
        return this.f21753a;
    }

    public void d(l45 l45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2900cd07", new Object[]{this, l45Var});
        } else {
            this.b = l45Var;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40aa8475", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void f(DAIModelTriggerType dAIModelTriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9973de7", new Object[]{this, dAIModelTriggerType});
        } else {
            this.f21753a = dAIModelTriggerType;
        }
    }
}
