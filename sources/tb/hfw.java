package tb;

import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class hfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cae f20613a;

    static {
        t2o.a(352321912);
    }

    public hfw(cae caeVar) {
        this.f20613a = caeVar;
    }

    public boolean a(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c4c33e", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        cae caeVar = this.f20613a;
        if (caeVar != null) {
            return caeVar.callSuperCanScroll(view, z, i, i2, i3);
        }
        return false;
    }

    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("217cd1b2", new Object[]{this, motionEvent})).booleanValue();
        }
        cae caeVar = this.f20613a;
        if (caeVar != null) {
            return caeVar.callSuperDispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43f19901", new Object[]{this, motionEvent})).booleanValue();
        }
        cae caeVar = this.f20613a;
        if (caeVar != null) {
            return caeVar.callSuperOnInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public abstract boolean d(View view, boolean z, int i, int i2, int i3);

    public ViewPager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        cae caeVar = this.f20613a;
        if (caeVar != null) {
            return caeVar.getViewPager();
        }
        return null;
    }

    public abstract boolean f(MotionEvent motionEvent);

    public void g(cae caeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa33e89b", new Object[]{this, caeVar});
        } else {
            this.f20613a = caeVar;
        }
    }
}
