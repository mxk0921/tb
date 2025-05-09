package tb;

import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tfg implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ufg f28686a;

    public tfg(ufg ufgVar) {
        this.f28686a = ufgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        hha.b("SingleGoodPlayerH", "showBigCard | h=" + this.f28686a.f19548a.getHeight());
        ufg ufgVar = this.f28686a;
        pfa.U(ufgVar.f, ufgVar.f19548a.getHeight() + nw0.d(this.f28686a.f19548a.getContext(), 8.0f), nw0.d(this.f28686a.f19548a.getContext(), 47.0f), true);
        this.f28686a.f19548a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
