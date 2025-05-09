package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class mzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f24413a;
    public final ude b;
    public final Object c;
    public final ViewGroup d;
    public final vfw e;

    static {
        t2o.a(815793468);
    }

    public mzn(Activity activity, ude udeVar, Object obj, ViewGroup viewGroup, vfw vfwVar) {
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        this.f24413a = activity;
        this.b = udeVar;
        this.c = obj;
        this.d = viewGroup;
        this.e = vfwVar;
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f24413a;
    }

    public final ViewGroup b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this});
        }
        return this.d;
    }

    public final Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.c;
    }

    public final ude d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ude) ipChange.ipc$dispatch("65261d7c", new Object[]{this});
        }
        return this.b;
    }

    public final vfw e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vfw) ipChange.ipc$dispatch("ea73f6a3", new Object[]{this});
        }
        return this.e;
    }
}
