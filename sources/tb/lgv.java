package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f23330a = null;
    public boolean b = false;

    static {
        t2o.a(468713544);
    }

    public Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dce7425", new Object[]{this});
        }
        return this.f23330a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("385aeb2a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd9ede", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("UnderageModeServiceConfig", "markCurrentMode isUnderageMode:" + z);
        this.f23330a = Boolean.valueOf(z);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb9fba6", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
