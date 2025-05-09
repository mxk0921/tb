package tb;

import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ezp implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LiveItem f18907a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gzp c;

    public ezp(gzp gzpVar, LiveItem liveItem, String str) {
        this.c = gzpVar;
        this.f18907a = liveItem;
        this.b = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        gzp gzpVar = this.c;
        gzpVar.c.a(gzpVar.f19548a);
        gzp.i(this.c, this.f18907a, this.b, gzp.h(this.c, this.f18907a, this.b));
        iha.J();
        gzp gzpVar2 = this.c;
        awp.e(gzpVar2.f19548a, gzp.j(gzpVar2), null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
        } else {
            sjr.g().d("com.taobao.taolive.room.dismiss_sab_atmosphere");
        }
    }
}
