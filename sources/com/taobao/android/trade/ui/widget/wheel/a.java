package com.taobao.android.trade.ui.widget.wheel;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_DELTA_FOR_SCROLLING = 1;

    /* renamed from: a  reason: collision with root package name */
    public final c f9701a;
    public final Context b;
    public final GestureDetector c;
    public Scroller d;
    public int e;
    public float f;
    public boolean g;
    public final Handler h = new b();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.trade.ui.widget.wheel.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0501a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0501a() {
        }

        public static /* synthetic */ Object ipc$super(C0501a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/wheel/WheelScroller$1");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            a.b(a.this, 0);
            a.c(a.this).fling(0, a.a(a.this), 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            a.d(a.this, 0);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/wheel/WheelScroller$2");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            a.c(a.this).computeScrollOffset();
            int currY = a.c(a.this).getCurrY();
            int a2 = a.a(a.this) - currY;
            a.b(a.this, currY);
            if (a2 != 0) {
                a.e(a.this).b(a2);
            }
            if (Math.abs(currY - a.c(a.this).getFinalY()) < 1) {
                a.c(a.this).getFinalY();
                a.c(a.this).forceFinished(true);
            }
            if (!a.c(a.this).isFinished()) {
                a.f(a.this).sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                a.g(a.this);
            } else {
                a.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a();

        void b(int i);

        void c();

        void onStarted();
    }

    static {
        t2o.a(724566057);
    }

    public a(Context context, c cVar) {
        C0501a aVar = new C0501a();
        GestureDetector gestureDetector = new GestureDetector(context, aVar);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.d = new Scroller(context);
        this.f9701a = cVar;
        this.b = context;
    }

    public static /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6cff966", new Object[]{aVar})).intValue();
        }
        return aVar.e;
    }

    public static /* synthetic */ int b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bac8721", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.e = i;
        return i;
    }

    public static /* synthetic */ Scroller c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scroller) ipChange.ipc$dispatch("953a4460", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ void d(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff1afae", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.n(i);
        }
    }

    public static /* synthetic */ c e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e2aa3d77", new Object[]{aVar});
        }
        return aVar.f9701a;
    }

    public static /* synthetic */ Handler f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d7a00aef", new Object[]{aVar});
        }
        return aVar.h;
    }

    public static /* synthetic */ void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89d8eb8", new Object[]{aVar});
        } else {
            aVar.j();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5849fec0", new Object[]{this});
            return;
        }
        this.h.removeMessages(0);
        this.h.removeMessages(1);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad48e29", new Object[]{this});
        } else if (this.g) {
            this.f9701a.a();
            this.g = false;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60442717", new Object[]{this});
            return;
        }
        this.f9701a.c();
        n(1);
    }

    public boolean k(MotionEvent motionEvent) {
        int y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f = motionEvent.getY();
            this.d.forceFinished(true);
            h();
        } else if (action == 2 && (y = (int) (motionEvent.getY() - this.f)) != 0) {
            o();
            this.f9701a.b(y);
            this.f = motionEvent.getY();
        }
        if (!this.c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            j();
        }
        return true;
    }

    public void l(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9093b834", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.forceFinished(true);
        this.e = 0;
        Scroller scroller = this.d;
        if (i2 != 0) {
            i3 = i2;
        } else {
            i3 = 400;
        }
        scroller.startScroll(0, 0, 0, i, i3);
        n(0);
        o();
    }

    public void m(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
            return;
        }
        this.d.forceFinished(true);
        this.d = new Scroller(this.b, interpolator);
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b672ca", new Object[]{this, new Integer(i)});
            return;
        }
        h();
        this.h.sendEmptyMessage(i);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9abeba", new Object[]{this});
        } else if (!this.g) {
            this.g = true;
            this.f9701a.onStarted();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95325f1a", new Object[]{this});
        } else {
            this.d.forceFinished(true);
        }
    }
}
