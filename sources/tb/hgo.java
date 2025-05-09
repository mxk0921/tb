package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.v2.PhotoView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wtk f20630a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public hgo(wtk wtkVar) {
        this.f20630a = wtkVar;
    }

    public final float a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14279c61", new Object[]{this, motionEvent})).floatValue();
        }
        this.d = motionEvent.getX(0);
        this.e = motionEvent.getY(0);
        this.f = motionEvent.getX(1);
        float y = motionEvent.getY(1);
        this.g = y;
        return (y - this.e) / (this.f - this.d);
    }

    public void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 2) {
            if ((actionMasked == 5 || actionMasked == 6) && motionEvent.getPointerCount() == 2) {
                this.b = a(motionEvent);
            }
        } else if (motionEvent.getPointerCount() > 1) {
            float a2 = a(motionEvent);
            this.c = a2;
            double degrees = Math.toDegrees(Math.atan(a2)) - Math.toDegrees(Math.atan(this.b));
            if (Math.abs(degrees) <= 120.0d) {
                ((PhotoView.a) this.f20630a).a((float) degrees, (this.f + this.d) / 2.0f, (this.g + this.e) / 2.0f);
            }
            this.b = this.c;
        }
    }
}
