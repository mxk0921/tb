package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class efx implements fbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f18536a;
    public u5d b;

    static {
        t2o.a(491782595);
        t2o.a(477102094);
    }

    public void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f18536a = context;
        }
    }

    public void n(cfc cfcVar) {
        jgc invokeCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39748e8", new Object[]{this, cfcVar});
            return;
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService != null && (invokeCallback = iHostService.getInvokeCallback()) != null) {
            this.b = invokeCallback.j();
        }
    }

    @Override // tb.pad
    public boolean l(View view) {
        Context context;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0191b3", new Object[]{this, view})).booleanValue();
        }
        u5d u5dVar = this.b;
        if (u5dVar == null) {
            context = this.f18536a;
        } else {
            context = u5dVar.f();
        }
        if (context == null) {
            context = this.f18536a;
        }
        if (!(context instanceof Activity) || ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)) == null || (viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView().findViewById(16908290)) == null) {
            return false;
        }
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return true;
    }
}
