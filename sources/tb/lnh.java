package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.widget.BaseM3CellWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792484);
    }

    public static final void a(BaseM3CellWidget baseM3CellWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75ccbe6", new Object[]{baseM3CellWidget});
            return;
        }
        ckf.g(baseM3CellWidget, "widget");
        baseM3CellWidget.l0().c().J0(true);
    }
}
