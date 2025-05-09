package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.component.bouncy.viewpager.ViewPagerOverScrollDecorAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ngl implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_DECELERATE_FACTOR = -2.0f;
    public static final float DEFAULT_TOUCH_DRAG_MOVE_RATIO_BCK = 1.0f;
    public static final float DEFAULT_TOUCH_DRAG_MOVE_RATIO_FWD = 3.0f;
    public static final int MAX_BOUNCE_BACK_DURATION_MS = 800;
    public static final int MIN_BOUNCE_BACK_DURATION_MS = 200;
    public static final String TAG = "OverScrollDecor";

    /* renamed from: a  reason: collision with root package name */
    public final f f24715a = new f();
    public final u4d b;
    public final d c;
    public final g d;
    public final b e;
    public c f;
    public float g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Property<View, Float> f24716a;
        public float b;
        public float c;

        static {
            t2o.a(503316901);
        }

        public abstract void a(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements c, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Interpolator f24717a = new DecelerateInterpolator();
        public final float b;
        public final float c;
        public final a d;

        static {
            t2o.a(503316902);
            t2o.a(503316903);
        }

        public b(float f) {
            this.b = f;
            this.c = f * 2.0f;
            this.d = ngl.this.b();
        }

        @Override // tb.ngl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fd64257", new Object[]{this, cVar});
                return;
            }
            Animator b = b();
            b.addListener(this);
            b.start();
        }

        public Animator b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator) ipChange.ipc$dispatch("fe7802a9", new Object[]{this});
            }
            View a2 = ((ViewPagerOverScrollDecorAdapter) ngl.this.b).a();
            this.d.a(a2);
            ngl nglVar = ngl.this;
            float f = nglVar.g;
            float f2 = 0.0f;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0 || ((f < 0.0f && nglVar.f24715a.c) || (i > 0 && !nglVar.f24715a.c))) {
                return c(this.d.b);
            }
            float f3 = -f;
            float f4 = f3 / this.b;
            if (f4 >= 0.0f) {
                f2 = f4;
            }
            float f5 = this.d.b + ((f3 * f) / this.c);
            ObjectAnimator d = d(a2, (int) f2, f5);
            ObjectAnimator c = c(f5);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(d, c);
            return animatorSet;
        }

        public ObjectAnimator c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObjectAnimator) ipChange.ipc$dispatch("f59cef6d", new Object[]{this, new Float(f)});
            }
            View a2 = ((ViewPagerOverScrollDecorAdapter) ngl.this.b).a();
            float abs = Math.abs(f);
            a aVar = this.d;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a2, aVar.f24716a, ngl.this.f24715a.b);
            ofFloat.setDuration(Math.max((int) ((abs / aVar.c) * 800.0f), 200));
            ofFloat.setInterpolator(this.f24717a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }

        public ObjectAnimator d(View view, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObjectAnimator) ipChange.ipc$dispatch("80098db2", new Object[]{this, view, new Integer(i), new Float(f)});
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, this.d.f24716a, f);
            ofFloat.setDuration(i);
            ofFloat.setInterpolator(this.f24717a);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ece12d0", new Object[]{this})).intValue();
            }
            return 3;
        }

        @Override // tb.ngl.c
        public boolean handleMoveTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed02c674", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

        @Override // tb.ngl.c
        public boolean handleUpOrCancelTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("880fdb9b", new Object[]{this, motionEvent})).booleanValue();
            }
            return true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ngl nglVar = ngl.this;
            nglVar.e(nglVar.c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(c cVar);

        boolean handleMoveTouchEvent(MotionEvent motionEvent);

        boolean handleUpOrCancelTouchEvent(MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f24718a;

        static {
            t2o.a(503316904);
            t2o.a(503316903);
        }

        public d() {
            this.f24718a = ngl.this.c();
        }

        @Override // tb.ngl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fd64257", new Object[]{this, cVar});
            }
        }

        @Override // tb.ngl.c
        public boolean handleMoveTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed02c674", new Object[]{this, motionEvent})).booleanValue();
            }
            if (!this.f24718a.a(((ViewPagerOverScrollDecorAdapter) ngl.this.b).a(), motionEvent)) {
                return false;
            }
            if ((!((ViewPagerOverScrollDecorAdapter) ngl.this.b).c() || !this.f24718a.c) && (!((ViewPagerOverScrollDecorAdapter) ngl.this.b).b() || this.f24718a.c)) {
                return false;
            }
            ngl.this.f24715a.f24720a = motionEvent.getPointerId(0);
            ngl nglVar = ngl.this;
            f fVar = nglVar.f24715a;
            e eVar = this.f24718a;
            fVar.b = eVar.f24719a;
            fVar.c = eVar.c;
            nglVar.e(nglVar.d);
            return ngl.this.d.handleMoveTouchEvent(motionEvent);
        }

        @Override // tb.ngl.c
        public boolean handleUpOrCancelTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("880fdb9b", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f24719a;
        public float b;
        public boolean c;

        static {
            t2o.a(503316905);
        }

        public abstract boolean a(View view, MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f24720a;
        public float b;
        public boolean c;

        static {
            t2o.a(503316906);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f24721a;
        public final float b;
        public final e c;

        static {
            t2o.a(503316907);
            t2o.a(503316903);
        }

        public g(float f, float f2) {
            this.c = ngl.this.c();
            this.f24721a = f;
            this.b = f2;
        }

        @Override // tb.ngl.c
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fd64257", new Object[]{this, cVar});
            } else {
                boolean z = ngl.this.f24715a.c;
            }
        }

        @Override // tb.ngl.c
        public boolean handleMoveTouchEvent(MotionEvent motionEvent) {
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed02c674", new Object[]{this, motionEvent})).booleanValue();
            }
            if (ngl.this.f24715a.f24720a != motionEvent.getPointerId(0)) {
                ngl nglVar = ngl.this;
                nglVar.e(nglVar.e);
                return true;
            }
            View a2 = ((ViewPagerOverScrollDecorAdapter) ngl.this.b).a();
            if (!this.c.a(a2, motionEvent)) {
                return true;
            }
            e eVar = this.c;
            float f2 = eVar.b;
            boolean z = eVar.c;
            ngl nglVar2 = ngl.this;
            f fVar = nglVar2.f24715a;
            boolean z2 = fVar.c;
            if (z == z2) {
                f = this.f24721a;
            } else {
                f = this.b;
            }
            float f3 = f2 / f;
            float f4 = eVar.f24719a + f3;
            if ((!z2 || z || f4 > fVar.b) && (z2 || !z || f4 < fVar.b)) {
                if (a2.getParent() != null) {
                    a2.getParent().requestDisallowInterceptTouchEvent(true);
                }
                long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
                if (eventTime > 0) {
                    ngl.this.g = f3 / ((float) eventTime);
                }
                ngl.this.f(a2, f4);
                return true;
            }
            nglVar2.g(a2, fVar.b, motionEvent);
            ngl nglVar3 = ngl.this;
            nglVar3.e(nglVar3.c);
            return true;
        }

        @Override // tb.ngl.c
        public boolean handleUpOrCancelTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("880fdb9b", new Object[]{this, motionEvent})).booleanValue();
            }
            ngl nglVar = ngl.this;
            nglVar.e(nglVar.e);
            return false;
        }
    }

    static {
        t2o.a(503316900);
    }

    public ngl(u4d u4dVar, float f2, float f3, float f4) {
        this.b = u4dVar;
        this.e = new b(f2);
        this.d = new g(f3, f4);
        d dVar = new d();
        this.c = dVar;
        this.f = dVar;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        ViewProxy.setOnTouchListener(d(), this);
        d().setOverScrollMode(2);
    }

    public abstract a b();

    public abstract e c();

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return ((ViewPagerOverScrollDecorAdapter) this.b).a();
    }

    public void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ff789", new Object[]{this, cVar});
            return;
        }
        c cVar2 = this.f;
        this.f = cVar;
        cVar.a(cVar2);
    }

    public abstract void f(View view, float f2);

    public abstract void g(View view, float f2, MotionEvent motionEvent);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                return this.f.handleMoveTouchEvent(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return this.f.handleUpOrCancelTouchEvent(motionEvent);
    }
}
