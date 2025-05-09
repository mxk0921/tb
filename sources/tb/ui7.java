package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.mzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ui7 implements mzb, OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f29394a;
    public final olk<OnScreenChangedListener> b = new olk<>();
    public final olk<mzb> c = new olk<>();

    static {
        t2o.a(468714372);
        t2o.a(468714373);
        t2o.a(468714374);
    }

    public ui7(FluidContext fluidContext) {
        this.f29394a = fluidContext;
    }

    public void a(mzb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086931e", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.c.a(aVar);
        }
    }

    public void b(mzb mzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986e7e89", new Object[]{this, mzbVar});
        } else if (mzbVar != null) {
            this.c.a(mzbVar);
        }
    }

    @Override // tb.mzb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66d3491", new Object[]{this});
            return;
        }
        ir9.b("DeviceListenerManager", "onPhoneRotate 被执行，监听器数量：" + this.c.c());
        for (mzb mzbVar : this.c.b()) {
            try {
                mzbVar.c();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29394a, mzbVar, "onPhoneRotate", e);
            }
        }
    }

    @Override // tb.mzb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd31c367", new Object[]{this});
            return;
        }
        ir9.b("DeviceListenerManager", "onTabletRotate 被执行， 监听器数量：" + this.c.c());
        for (mzb mzbVar : this.c.b()) {
            try {
                mzbVar.d();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29394a, mzbVar, "onTabletRotate", e);
            }
        }
    }

    public void e(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effcfd4d", new Object[]{this, onScreenChangedListener});
        } else if (onScreenChangedListener != null) {
            this.b.a(onScreenChangedListener);
        }
    }

    public void f(mzb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43555f81", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.c.e(aVar);
        }
    }

    public void g(mzb mzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae155dec", new Object[]{this, mzbVar});
        } else if (mzbVar != null) {
            this.c.e(mzbVar);
        }
    }

    public void h(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b87bf30", new Object[]{this, onScreenChangedListener});
        } else if (onScreenChangedListener != null) {
            this.b.e(onScreenChangedListener);
        }
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        ir9.b("DeviceListenerManager", "onScreenChanged: " + i);
        for (OnScreenChangedListener onScreenChangedListener : this.b.b()) {
            try {
                onScreenChangedListener.onScreenChanged(i, configuration);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29394a, onScreenChangedListener, "onScreenChanged", e);
            }
        }
    }
}
