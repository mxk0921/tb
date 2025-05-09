package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27547a;

    static {
        t2o.a(352322022);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee05d3e2", new Object[]{this})).booleanValue();
        }
        return this.f27547a;
    }

    public rpz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpz) ipChange.ipc$dispatch("995b14e7", new Object[]{this});
        }
        return this;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798d4bb8", new Object[]{this, new Boolean(z)});
        } else {
            this.f27547a = z;
        }
    }
}
