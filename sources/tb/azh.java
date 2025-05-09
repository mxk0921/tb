package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class azh implements uad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IHostService f16089a;

    static {
        t2o.a(491782592);
        t2o.a(477102091);
    }

    @Override // tb.uad
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de96", new Object[]{this})).intValue();
        }
        czc i = this.f16089a.getInvokeCallback().i();
        if (i == null) {
            return 0;
        }
        return (int) i.c();
    }

    @Override // tb.uad
    public boolean e() {
        nxd c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234178c9", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f16089a;
        if (iHostService == null || (c = iHostService.getInvokeCallback().c()) == null) {
            return false;
        }
        return TextUtils.equals(c.l(), c.q());
    }

    @Override // tb.uad
    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.f16089a;
        if (iHostService == null) {
            return false;
        }
        return iHostService.getInvokeCallback().k().isRefreshing();
    }

    @Override // tb.uad
    public View j(String str) {
        gqb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("931a456b", new Object[]{this, str});
        }
        if (this.f16089a == null || TextUtils.isEmpty(str) || (b = this.f16089a.getInvokeCallback().b()) == null) {
            return null;
        }
        return b.h(str);
    }

    @Override // tb.pad
    public boolean l(View view) {
        gqb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed0191b3", new Object[]{this, view})).booleanValue();
        }
        IHostService iHostService = this.f16089a;
        if (iHostService == null || (b = iHostService.getInvokeCallback().b()) == null) {
            return false;
        }
        return b.j(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public void m(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39748e8", new Object[]{this, cfcVar});
        } else if (cfcVar != null) {
            this.f16089a = (IHostService) cfcVar.a(IHostService.class);
        }
    }
}
