package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.android.navigationextern.a;
import tb.scc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e98 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18371a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements scc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NavigationExternSwitch.b f18372a;

        public a(NavigationExternSwitch.b bVar) {
            this.f18372a = bVar;
        }

        @Override // tb.scc.a
        public void onChanged(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af3d7442", new Object[]{this, new Boolean(z), str});
                return;
            }
            e98.a();
            ((a.b) this.f18372a).b();
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f();
    }

    public static scc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scc) ipChange.ipc$dispatch("1db80073", new Object[0]);
        }
        try {
            return (scc) n78.a(scc.class);
        } catch (Throwable th) {
            jhj.b("EdlpSwitchUtils", "registerEditionListener failed. getHomeABTestService is null. e=" + th.getMessage());
            return null;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!NavigationExternSwitch.q()) {
            jhj.b("EdlpSwitchUtils", "init failed. isEnableEdlp is false.");
        } else if (!f()) {
            f18371a = false;
            jhj.b("EdlpSwitchUtils", "init sIsEdlpOpen failed. updateEdlpSwitch is false.");
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ab27a2", new Object[0])).booleanValue();
        }
        return f18371a;
    }

    public static void e(NavigationExternSwitch.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb6a212", new Object[]{bVar});
        } else if (!NavigationExternSwitch.q()) {
            jhj.b("EdlpSwitchUtils", "registerEditionListener failed. isEnableEdlp is false.");
        } else {
            scc b = b();
            if (b == null) {
                jhj.b("EdlpSwitchUtils", "registerEditionListener failed. getHomeABTestService is null.");
            } else {
                b.a(new a(bVar), "newBarVersion_newUser");
            }
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab86ddab", new Object[0])).booleanValue();
        }
        scc b = b();
        if (b == null) {
            jhj.b("EdlpSwitchUtils", "registerEditionListener failed. getHomeABTestService is null.");
            return false;
        }
        f18371a = b.b("newBarVersion_newUser");
        jhj.b("EdlpSwitchUtils", "update Edlp Switch success. sIsEdlpOpen=" + f18371a);
        return true;
    }
}
