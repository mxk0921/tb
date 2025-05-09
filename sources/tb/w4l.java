package tb;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w4l implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OpenSingleViewContainer f30450a;

    public w4l(OpenSingleViewContainer openSingleViewContainer) {
        this.f30450a = openSingleViewContainer;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        v2s.o().A().a("TBLive", "onLayoutChange ========= ");
        rootWindowInsets = ((Activity) OpenSingleViewContainer.c(this.f30450a)).getWindow().getDecorView().getRootWindowInsets();
        cwd A = v2s.o().A();
        A.a("TBLive", "mInsets ========= " + rootWindowInsets);
        if (!nxq.b((Activity) OpenSingleViewContainer.c(this.f30450a)) || rootWindowInsets == null) {
            iba.M0(false, OpenSingleViewContainer.d(this.f30450a));
            iba.Y(0, OpenSingleViewContainer.d(this.f30450a));
            iba.b1(0, OpenSingleViewContainer.d(this.f30450a));
        } else {
            boolean r = nxq.r(OpenSingleViewContainer.c(this.f30450a), rootWindowInsets);
            iba.M0(r, OpenSingleViewContainer.d(this.f30450a));
            if (r) {
                int g = nxq.g(OpenSingleViewContainer.c(this.f30450a), rootWindowInsets);
                cwd A2 = v2s.o().A();
                A2.a("TBLive", "mCutoutHeight = " + xca.b);
                iba.Y(g, OpenSingleViewContainer.d(this.f30450a));
                iba.b1(g, OpenSingleViewContainer.d(this.f30450a));
            } else {
                iba.Y(0, OpenSingleViewContainer.d(this.f30450a));
                iba.b1(0, OpenSingleViewContainer.d(this.f30450a));
            }
        }
        gmr.a(OpenSingleViewContainer.d(this.f30450a));
        ((Activity) OpenSingleViewContainer.c(this.f30450a)).getWindow().getDecorView().removeOnLayoutChangeListener(this);
    }
}
