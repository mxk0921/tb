package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class v80 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29846a;
    public final int b;

    static {
        t2o.a(349175900);
    }

    public v80(String str, int i) {
        this.f29846a = str;
        this.b = i;
    }

    public abstract void a();

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        e90.e(this.f29846a);
        s55.i("Action", "finish action", "chainId", this.f29846a, "index", Integer.valueOf(this.b));
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
        } else {
            e90.c(this.f29846a, this.b + 1);
        }
    }

    public abstract void d(String str);
}
