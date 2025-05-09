package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hgf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<w7<?>> f20623a = new ArrayList();
    public final jmi b;
    public final yps c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963241);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963240);
    }

    public hgf(jmi jmiVar, yps ypsVar) {
        ckf.g(jmiVar, "messageCenter");
        ckf.g(ypsVar, "tabBaseInfoManager");
        this.b = jmiVar;
        this.c = ypsVar;
    }

    public final void a(w7<?> w7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3b1662", new Object[]{this, w7Var});
            return;
        }
        ckf.g(w7Var, "interactTabAdapter");
        ((ArrayList) this.f20623a).add(w7Var);
    }

    public final void b(String str, com.taobao.android.tab2liveroom.liveroom.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33bde38", new Object[]{this, str, aVar});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(aVar, "liveRoomComponent");
        vgh.c(this, "InteractTabAdapterManager", "直播Tab创建的时机，tabId=" + str + "，liveRoomComponent=" + aVar);
        this.c.a(str, aVar);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
            return;
        }
        vgh.c(this, "InteractTabAdapterManager", "页面创建的时机");
        Iterator it = ((ArrayList) this.f20623a).iterator();
        while (it.hasNext()) {
            this.b.c((w7) it.next());
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        vgh.c(this, "InteractTabAdapterManager", "页面销毁的时机");
        Iterator it = ((ArrayList) this.f20623a).iterator();
        while (it.hasNext()) {
            this.b.f((w7) it.next());
        }
    }

    public final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659b8dec", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabFluidInstanceId");
        vgh.c(this, "InteractTabAdapterManager", "视频Tab创建的时机，tabId=" + str + "，tabFluidInstanceId=" + str2);
        this.c.b(str, str2);
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "InteractTabAdapterManager", "Tab销毁的时机，tabId=".concat(str));
        this.c.c(str);
    }
}
