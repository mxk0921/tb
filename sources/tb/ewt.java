package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ewt implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DXWidgetNode f18856a;
    public final /* synthetic */ DXWidgetRefreshOption b;
    public final /* synthetic */ dwt c;

    public ewt(dwt dwtVar, DXWidgetNode dXWidgetNode, DXWidgetRefreshOption dXWidgetRefreshOption) {
        this.c = dwtVar;
        this.f18856a = dXWidgetNode;
        this.b = dXWidgetRefreshOption;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            axa.f().f16057a.I0(this.f18856a, 0, this.b);
        }
    }
}
