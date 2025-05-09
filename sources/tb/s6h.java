package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s6h extends h10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View c;
    public RotateAnimation d;

    static {
        t2o.a(713032004);
    }

    public s6h(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(s6h s6hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/holder/impl/LoadingHolder");
    }

    @Override // tb.h10
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b1e6b000", new Object[]{this});
        }
        this.c = LayoutInflater.from(this.b).inflate(R.layout.layout_order_loading, this.f20355a, true);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.d = rotateAnimation;
        rotateAnimation.setDuration(1000L);
        this.d.setInterpolator(new LinearInterpolator());
        this.d.setRepeatCount(-1);
        return this.c;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("929499c4", new Object[]{this});
        }
        return this.c;
    }

    public void e() {
        RotateAnimation rotateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b9d829", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null && (rotateAnimation = this.d) != null) {
            view.startAnimation(rotateAnimation);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1643c9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null && this.d != null) {
            view.clearAnimation();
        }
    }
}
