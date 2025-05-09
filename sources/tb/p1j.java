package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.controller.BaseListController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f25818a = -1.0f;
    public float b = -1.0f;
    public final a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(806356486);
    }

    public p1j(a aVar) {
        this.c = aVar;
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e64d1d8", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        if (this.f25818a == -1.0f) {
            this.f25818a = f;
        }
        if (this.b == -1.0f) {
            this.b = f2;
        }
        a aVar = this.c;
        if (aVar != null) {
            ((BaseListController.b) aVar).a((int) (f - this.f25818a), (int) (f2 - this.b));
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f25818a = -1.0f;
        this.b = -1.0f;
    }

    public void c(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1af1288", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.f25818a = f;
        this.b = f2;
    }

    public boolean d(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d707985", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        a aVar = this.c;
        if (aVar != null) {
            ((BaseListController.b) aVar).b();
        }
        b();
        return false;
    }
}
