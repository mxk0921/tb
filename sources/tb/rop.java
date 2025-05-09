package tb;

import android.app.Activity;
import android.app.Application;
import com.alibaba.triver.triver_shop.newShop.manager.SingleActivityInstanceController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f27514a;
    public static final boolean b;
    public static final rop INSTANCE = new rop();
    public static final SingleActivityInstanceController<Activity> c = new SingleActivityInstanceController<>();

    static {
        t2o.a(766509063);
        Application application = Globals.getApplication();
        ckf.f(application, "getApplication()");
        f27514a = r54.v(application);
        Application application2 = Globals.getApplication();
        ckf.f(application2, "getApplication()");
        b = r54.u(application2);
        Application application3 = Globals.getApplication();
        ckf.f(application3, "getApplication()");
        r54.w(application3);
    }

    public final SingleActivityInstanceController<Activity> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleActivityInstanceController) ipChange.ipc$dispatch("14b431d9", new Object[]{this});
        }
        return c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[]{this})).booleanValue();
        }
        return b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d8ca165", new Object[]{this})).booleanValue();
        }
        return f27514a;
    }
}
