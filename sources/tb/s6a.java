package tb;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s6a extends GestureDetector.SimpleOnGestureListener implements t6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean f = q1r.c(".enableScrollDetail");

    /* renamed from: a  reason: collision with root package name */
    public final dft f27822a;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public final int e;

    public s6a(dft dftVar) {
        this.f27822a = dftVar;
        WindowManager windowManager = (WindowManager) dftVar.getContext().getSystemService(pg1.ATOM_EXT_window);
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.e = displayMetrics.widthPixels;
            return;
        }
        this.e = 0;
    }

    public static /* synthetic */ Object ipc$super(s6a s6aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -223117518:
                return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            case 307521857:
                return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            case 587072321:
                return new Boolean(super.onDown((MotionEvent) objArr[0]));
            case 1575121015:
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/biz/touch/GestureListener");
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.f27822a.a()) {
            return super.onSingleTapUp(motionEvent);
        }
        whh.a("GestureListener", "onSingleTapUp");
        this.f27822a.c("GestureListener.onSingleTapUp", null);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.f27822a.a()) {
            return super.onDown(motionEvent);
        }
        whh.a("GestureListener", "onDown");
        this.b = 0;
        this.c = 0;
        this.d = 0;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (this.f27822a.a()) {
            return super.onFling(motionEvent, motionEvent2, f2, f3);
        }
        whh.a("GestureListener", "onFling");
        this.b = 2;
        return super.onFling(motionEvent, motionEvent2, f2, f3);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (this.f27822a.a()) {
            return super.onScroll(motionEvent, motionEvent2, f2, f3);
        }
        this.b = 1;
        this.c = (int) (this.c + f2);
        this.d = (int) (this.d + f3);
        if (f) {
            whh.a("GestureListener", "onScroll, total distanceX:" + this.c + ", total distanceY:" + this.d);
        }
        return super.onScroll(motionEvent, motionEvent2, f2, f3);
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64597736", new Object[]{this, motionEvent});
        } else if (!this.f27822a.a()) {
            whh.a("GestureListener", "onUp");
            int i = this.b;
            if (i == 1) {
                if (Math.abs(this.c) >= this.e / 2) {
                    whh.a("GestureListener", "onScrollingUp");
                    this.f27822a.c("GestureListener.onScrollingUp", null);
                }
            } else if (i == 2) {
                whh.a("GestureListener", "onFlingUp");
                this.f27822a.c("GestureListener.onFlingUp", null);
            }
            this.b = 3;
            this.c = 0;
            this.d = 0;
        }
    }
}
