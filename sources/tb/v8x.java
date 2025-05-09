package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29860a = false;
    public boolean b = true;

    static {
        t2o.a(982515864);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47f8f0db", new Object[]{this})).booleanValue();
        }
        return this.f29860a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a92b00", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59121c15", new Object[]{this, new Boolean(z)});
        } else {
            this.f29860a = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25563890", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
