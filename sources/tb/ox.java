package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ox<VIEW, WIDGET> implements ddd<VIEW, WIDGET> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private yko mCore;
    private VIEW mView;
    private WIDGET mWidget;

    static {
        t2o.a(993001999);
        t2o.a(993002002);
    }

    @Override // tb.ddd
    public void bind(VIEW view, WIDGET widget, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d99907", new Object[]{this, view, widget, ykoVar});
            return;
        }
        this.mView = view;
        this.mWidget = widget;
        this.mCore = ykoVar;
    }

    public final yko c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.mCore;
    }

    @Override // tb.ddd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final VIEW getIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIEW) ipChange.ipc$dispatch("78722393", new Object[]{this});
        }
        return this.mView;
    }

    public final WIDGET getWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WIDGET) ipChange.ipc$dispatch("f3963c91", new Object[]{this});
        }
        return this.mWidget;
    }
}
