package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.mtop.a;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lim implements ebd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ebd
    public void a(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ee8b5e", new Object[]{this, view, iPopData});
        }
    }

    @Override // tb.ebd
    public void b(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff2023e", new Object[]{this, view, iPopData});
        } else {
            c(iPopData);
        }
    }

    public final void c(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985a119e", new Object[]{this, iPopData});
        } else if (!"appear".equals(d(iPopData))) {
            vfm.f("PopViewUpdateListener", "当前fatigueStyle不是appear");
        } else {
            new a().d(iPopData);
        }
    }

    public final String d(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfbedc33", new Object[]{this, iPopData});
        }
        if (iPopData == null) {
            vfm.f("PopViewUpdateListener", "popData == null");
            return null;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null) {
            return popConfig.getFatigueReportStyle();
        }
        vfm.f("PopViewUpdateListener", "popConfig == null");
        return null;
    }
}
