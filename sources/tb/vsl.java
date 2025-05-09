package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vsl implements u7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30224a;

    static {
        t2o.a(486539588);
        t2o.a(488636457);
    }

    public vsl(cfc cfcVar) {
        this.f30224a = cfcVar;
    }

    @Override // tb.u7d
    public void a(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3398481", new Object[]{this, v7dVar, str, str2});
        } else if (TextUtils.equals("icon_and_miniapp_nomore_2019_v1", str)) {
            b(v7dVar, str2);
        }
    }

    public final void b(v7d v7dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3aeb", new Object[]{this, v7dVar, str});
            return;
        }
        IIconService iIconService = (IIconService) this.f30224a.a(IIconService.class);
        if (iIconService != null) {
            iIconService.passPopLayerData(v7dVar, str);
        }
    }
}
