package tb;

import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IModuleSwitchAdapter f21926a;
    public ISceneFreqAdapter b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jd0 f21927a = new jd0();

        static {
            t2o.a(625999878);
        }

        public static /* synthetic */ jd0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jd0) ipChange.ipc$dispatch("fd11f63c", new Object[0]);
            }
            return f21927a;
        }
    }

    static {
        t2o.a(625999877);
    }

    public static jd0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jd0) ipChange.ipc$dispatch("7cbf4221", new Object[0]);
        }
        return a.a();
    }

    public IModuleSwitchAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IModuleSwitchAdapter) ipChange.ipc$dispatch("31140e9a", new Object[]{this});
        }
        return this.f21926a;
    }

    public ISceneFreqAdapter b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISceneFreqAdapter) ipChange.ipc$dispatch("2a5f2daa", new Object[]{this});
        }
        return this.b;
    }

    public void d(IModuleSwitchAdapter iModuleSwitchAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb58078", new Object[]{this, iModuleSwitchAdapter});
        } else {
            this.f21926a = iModuleSwitchAdapter;
        }
    }

    public void e(ISceneFreqAdapter iSceneFreqAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35423de", new Object[]{this, iSceneFreqAdapter});
        } else {
            this.b = iSceneFreqAdapter;
        }
    }
}
