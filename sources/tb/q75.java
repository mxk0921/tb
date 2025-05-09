package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWFrontCoverBean f26559a;
    public View b;

    static {
        t2o.a(452985103);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("206cf812", new Object[]{this});
        }
        return this.b;
    }

    public DWFrontCoverBean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWFrontCoverBean) ipChange.ipc$dispatch("35f1561f", new Object[]{this});
        }
        return this.f26559a;
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85039d76", new Object[]{this, view});
        } else {
            this.b = view;
        }
    }

    public void d(DWFrontCoverBean dWFrontCoverBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0b4674", new Object[]{this, dWFrontCoverBean});
        } else {
            this.f26559a = dWFrontCoverBean;
        }
    }
}
