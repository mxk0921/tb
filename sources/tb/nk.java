package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24784a = false;
    public final HashMap<String, String> b = new HashMap<>();

    static {
        t2o.a(80740480);
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1d90c64a", new Object[]{this});
        }
        return this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45c0493b", new Object[]{this})).booleanValue();
        }
        return this.f24784a;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cd8045", new Object[]{this, new Boolean(z)});
        } else {
            this.f24784a = z;
        }
    }
}
