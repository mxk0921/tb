package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.device.IDeviceService;
import kotlin.Pair;
import tb.trc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r9w extends trc.a implements mzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k5h f27217a;
    public r8e b;

    static {
        t2o.a(468713990);
        t2o.a(468714374);
    }

    public r9w(k5h k5hVar) {
        this.f27217a = k5hVar;
        f();
    }

    public static /* synthetic */ Object ipc$super(r9w r9wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/manager/size/VideoPicSizeManager");
    }

    @Override // tb.mzb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66d3491", new Object[]{this});
        }
    }

    @Override // tb.mzb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd31c367", new Object[]{this});
        } else if (this.f27217a.l1() != null) {
            g(this.f27217a.l1().e());
        }
    }

    public r8e e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("42367b10", new Object[]{this});
        }
        return this.b;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
            return;
        }
        ((IDeviceService) this.f27217a.U().getService(IDeviceService.class)).addDeviceRotateListener(this);
        this.f27217a.E0().addMediaLifecycleListener((trc.a) this);
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8164c59d", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            Pair<r8e, FrameLayout.LayoutParams> i = bbw.i(this.f27217a.U(), z);
            if (i != null) {
                this.b = i.getFirst();
                this.f27217a.h1().c0(i.getSecond());
            }
        } catch (Exception e) {
            e.printStackTrace();
            ir9.c("VideoPicSizeManager", "resizeMedia exception", e);
        }
    }

    @Override // tb.trc.a, tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
        } else if (this.f27217a.l1() != null) {
            g(this.f27217a.l1().e());
        }
    }
}
