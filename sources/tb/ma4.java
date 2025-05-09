package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ma4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rip f23883a;
    public String b;
    public ComponentType c;

    static {
        t2o.a(665845776);
    }

    public rip a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rip) ipChange.ipc$dispatch("20009aa2", new Object[]{this});
        }
        return this.f23883a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.b;
    }

    public ComponentType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentType) ipChange.ipc$dispatch("783f2943", new Object[]{this});
        }
        return this.c;
    }

    public void d(rip ripVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782cb56c", new Object[]{this, ripVar});
        } else {
            this.f23883a = ripVar;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void f(ComponentType componentType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384a9b07", new Object[]{this, componentType});
        } else {
            this.c = componentType;
        }
    }
}
