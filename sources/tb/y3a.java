package tb;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.GalleryCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y3a implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f31827a;
    public VelocityTracker b;
    public final /* synthetic */ GalleryCore c;

    public y3a(GalleryCore galleryCore) {
        this.c = galleryCore;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31827a = motionEvent.getX();
        } else if (action == 1 || action == 3) {
            float abs = Math.abs(motionEvent.getX() - this.f31827a);
            this.f31827a = abs;
            if (abs > view.getWidth() / 4.0f) {
                GalleryCore.r(this.c, false);
            }
            VelocityTracker velocityTracker = this.b;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000);
                GalleryCore.i(this.c, (int) this.b.getXVelocity());
                this.b.clear();
            }
        }
        return false;
    }
}
