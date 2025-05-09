package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class k9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j9u f22505a;
    public final j9u b;
    public boolean c;
    public String d;
    public Map<String, Object> e;

    static {
        t2o.a(815792176);
    }

    public k9u(j9u j9uVar, j9u j9uVar2) {
        ckf.g(j9uVar, "startNode");
        ckf.g(j9uVar2, "endNode");
        this.f22505a = j9uVar;
        this.b = j9uVar2;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e01a961", new Object[]{this, str});
        } else {
            zno.Companion.a(str, this.f22505a, this.b, this.e, this.c, this.d);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e295c15", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e110cd4", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
