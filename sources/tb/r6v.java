package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class r6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public u6v f27153a;
    public w6v b;

    static {
        t2o.a(153092126);
    }

    public u6v a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6v) ipChange.ipc$dispatch("1064da8b", new Object[]{this});
        }
        return this.f27153a;
    }

    public w6v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6v) ipChange.ipc$dispatch("fa538c0b", new Object[]{this});
        }
        return this.b;
    }

    public void c(u6v u6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ad110d", new Object[]{this, u6vVar});
        } else {
            this.f27153a = u6vVar;
        }
    }

    public void d(w6v w6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4b79ad", new Object[]{this, w6vVar});
        } else {
            this.b = w6vVar;
        }
    }
}
