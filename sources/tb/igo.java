package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class igo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f21302a;
    public double b;
    public boolean c;
    public final int[] d = new int[2];
    public final a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(87031892);
    }

    public igo(a aVar) {
        this.e = aVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (this.c) {
            this.c = false;
            int[] iArr = this.d;
            iArr[0] = -1;
            iArr[1] = -1;
            a aVar = this.e;
            if (aVar != null) {
                ((gb2) aVar).D(this);
            }
            this.b = vu3.b.GEO_NOT_SUPPORT;
            this.f21302a = vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4713769", new Object[]{this})).doubleValue();
        }
        return this.b;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("937ef523", new Object[]{this})).doubleValue();
        }
        return Math.toDegrees(b());
    }

    public boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            this.d[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.d[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.c) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int[] iArr = this.d;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        a();
                    }
                }
            } else if (!this.c) {
                this.d[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.c = true;
                motionEvent.getEventTime();
                this.f21302a = Double.NaN;
                e(motionEvent);
                a aVar = this.e;
                if (aVar != null) {
                    ((gb2) aVar).C(this);
                }
            }
        } else if (this.c) {
            int[] iArr2 = this.d;
            if (!(iArr2[0] == -1 || iArr2[1] == -1)) {
                e(motionEvent);
                if (!(this.e == null || c() == vu3.b.GEO_NOT_SUPPORT)) {
                    ((gb2) this.e).B(this);
                }
            }
        }
        return true;
    }

    public final void e(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff2c84c", new Object[]{this, motionEvent});
            return;
        }
        motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.d[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.d[1]);
        if (findPointerIndex != -1 && findPointerIndex2 != -1) {
            double d = -Math.atan2(motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex), motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex));
            if (Double.isNaN(this.f21302a)) {
                this.b = vu3.b.GEO_NOT_SUPPORT;
            } else {
                this.b = this.f21302a - d;
            }
            this.f21302a = d;
            double d2 = this.b;
            if (d2 > 3.141592653589793d) {
                this.b = d2 - 3.141592653589793d;
            } else if (d2 < -3.141592653589793d) {
                this.b = d2 + 3.141592653589793d;
            }
            double d3 = this.b;
            if (d3 > 1.5707963267948966d) {
                this.b = d3 - 3.141592653589793d;
            } else if (d3 < -1.5707963267948966d) {
                this.b = d3 + 3.141592653589793d;
            }
        }
    }
}
