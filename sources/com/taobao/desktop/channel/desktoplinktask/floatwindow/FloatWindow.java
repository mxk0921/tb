package com.taobao.desktop.channel.desktoplinktask.floatwindow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import tb.pg1;
import tb.t2o;
import tb.yv8;
import tb.zd7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GESTURE_ABSORBED = 3;
    public static final int GESTURE_ABSORBING = 2;
    public static final int GESTURE_DRAG = 1;
    public static final int GESTURE_HOVER = 0;
    public static final int TRANSLATE_HIT_WALL = 4;
    public static final int TRANSLATE_MODE_SELF = 0;
    public static final int TRANSLATE_MODE_TARGET = 1;
    public View A;
    public FloatWindow B;
    public ValueAnimator C;
    public boolean D;
    public int E;
    public final b F;

    /* renamed from: a  reason: collision with root package name */
    public WindowManager.LayoutParams f10318a;
    public final WindowManager b;
    public final int c;
    public final int d;
    public final int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final Context k;
    public final boolean l;
    public final int m;
    public final int n;
    public final long o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public FloatView z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class FloatView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int interceptX = 0;
        public int interceptY = 0;

        static {
            t2o.a(435159059);
        }

        public FloatView(Context context) {
            super(context);
            if (FloatWindow.b(FloatWindow.this).getParent() != null && (FloatWindow.b(FloatWindow.this).getParent() instanceof ViewGroup)) {
                ((ViewGroup) FloatWindow.b(FloatWindow.this).getParent()).removeView(FloatWindow.b(FloatWindow.this));
            }
            addView(FloatWindow.b(FloatWindow.this));
        }

        public static /* synthetic */ Object ipc$super(FloatView floatView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/floatwindow/FloatWindow$FloatView");
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.interceptX = (int) motionEvent.getX();
                this.interceptY = (int) motionEvent.getY();
                FloatWindow.d(FloatWindow.this, motionEvent.getX());
                FloatWindow.f(FloatWindow.this, motionEvent.getY());
                yv8.a("FloatView.onInterceptTouchEvent.ACTION_DOWN.interceptX=%s.interceptY=%s.downX=%s.downY=%s", Integer.valueOf(this.interceptX), Integer.valueOf(this.interceptY), Float.valueOf(FloatWindow.c(FloatWindow.this)), Float.valueOf(FloatWindow.e(FloatWindow.this)));
                return false;
            } else if (action != 2) {
                return false;
            } else {
                if (Math.abs(motionEvent.getX() - this.interceptX) <= 5.0f || Math.abs(motionEvent.getY() - this.interceptY) <= 5.0f) {
                    z = false;
                } else {
                    z = true;
                }
                yv8.a("FloatView.onInterceptTouchEvent.ACTION_MOVE.isIntercept=%s", Boolean.valueOf(z));
                return z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(int i, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(435159062);
        }

        public d() {
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fecfbc2e", new Object[]{this});
                return;
            }
            float g = FloatWindow.g(FloatWindow.this) - FloatWindow.c(FloatWindow.this);
            float i = FloatWindow.i(FloatWindow.this) - FloatWindow.e(FloatWindow.this);
            if (!FloatWindow.m(FloatWindow.this) || (g >= FloatWindow.n(FloatWindow.this) && FloatWindow.o(FloatWindow.this).getWidth() + g <= FloatWindow.p(FloatWindow.this) - FloatWindow.q(FloatWindow.this) && i >= FloatWindow.r(FloatWindow.this) && FloatWindow.o(FloatWindow.this).getHeight() + i <= FloatWindow.s(FloatWindow.this) - FloatWindow.t(FloatWindow.this))) {
                if (FloatWindow.u(FloatWindow.this) != null) {
                    FloatWindow.u(FloatWindow.this).J();
                }
                FloatWindow.v(FloatWindow.this, g, i);
                FloatWindow.w(FloatWindow.this, 1, null);
                return;
            }
            yv8.a("FloatView.onTouch.actionMove.outsideDragArea.stopDrag.targetX=%s.targetY=%s.rowY=%s.downY=%s", Float.valueOf(g), Float.valueOf(i));
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf53778", new Object[]{this});
            } else if (FloatWindow.l(FloatWindow.this)) {
                d();
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            yv8.a("FloatView.onTouch.action=%s", Integer.valueOf(motionEvent.getAction()));
            FloatWindow.h(FloatWindow.this, motionEvent.getRawX());
            FloatWindow.j(FloatWindow.this, motionEvent.getRawY() - FloatWindow.k(FloatWindow.this));
            int action = motionEvent.getAction();
            if (action == 1) {
                c();
            } else if (action == 2) {
                b();
            }
            return false;
        }

        public final /* synthetic */ void e(boolean z, boolean z2, boolean z3, boolean z4) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("966f410f", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                if (z2) {
                    str2 = "left";
                } else {
                    str2 = "right";
                }
                jSONObject.put("position", (Object) str2);
            } else {
                if (z3) {
                    str = "top";
                } else {
                    str = "bottom";
                }
                jSONObject.put("position", (Object) str);
            }
            FloatWindow.w(FloatWindow.this, 3, jSONObject);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d() {
            /*
                Method dump skipped, instructions count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.d.d():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f10320a;
        public final View b;
        public boolean c;
        public int d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public long l;
        public b m;
        public int n = -2;
        public int o = -2;
        public int p;
        public int q;

        static {
            t2o.a(435159063);
        }

        public e(Context context, View view) {
            this.f10320a = context;
            this.b = view;
        }

        public static /* synthetic */ Context a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("38ab7bdb", new Object[]{eVar});
            }
            return eVar.f10320a;
        }

        public static /* synthetic */ View b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("81912784", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ int c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb854587", new Object[]{eVar})).intValue();
            }
            return eVar.j;
        }

        public static /* synthetic */ boolean d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a978ab77", new Object[]{eVar})).booleanValue();
            }
            return eVar.c;
        }

        public static /* synthetic */ int e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("876c1145", new Object[]{eVar})).intValue();
            }
            return eVar.d;
        }

        public static /* synthetic */ int f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("655f7724", new Object[]{eVar})).intValue();
            }
            return eVar.e;
        }

        public static /* synthetic */ boolean g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4352dd14", new Object[]{eVar})).booleanValue();
            }
            return eVar.k;
        }

        public static /* synthetic */ long h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("214642e3", new Object[]{eVar})).longValue();
            }
            return eVar.l;
        }

        public static /* synthetic */ b i(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("889583da", new Object[]{eVar});
            }
            return eVar.m;
        }

        public static /* synthetic */ int j(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a0a194", new Object[]{eVar})).intValue();
            }
            return eVar.o;
        }

        public static /* synthetic */ int k(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e6940773", new Object[]{eVar})).intValue();
            }
            return eVar.n;
        }

        public static /* synthetic */ int l(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c4876d52", new Object[]{eVar})).intValue();
            }
            return eVar.p;
        }

        public static /* synthetic */ int m(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a27ad331", new Object[]{eVar})).intValue();
            }
            return eVar.q;
        }

        public static /* synthetic */ boolean n(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("806e3921", new Object[]{eVar})).booleanValue();
            }
            return eVar.f;
        }

        public static /* synthetic */ int o(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e619eef", new Object[]{eVar})).intValue();
            }
            return eVar.g;
        }

        public static /* synthetic */ int p(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c5504ce", new Object[]{eVar})).intValue();
            }
            return eVar.h;
        }

        public static /* synthetic */ int q(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a486aad", new Object[]{eVar})).intValue();
            }
            return eVar.i;
        }

        public e A(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a42df986", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            this.p = i;
            this.q = i2;
            return this;
        }

        public e B(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("3ae6482", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }

        public FloatWindow r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatWindow) ipChange.ipc$dispatch("9e2ae37f", new Object[]{this});
            }
            return new FloatWindow(this);
        }

        public e s(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("8dd71f33", new Object[]{this, new Long(j)});
            }
            this.l = j;
            return this;
        }

        public e t(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d1160773", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            this.d = Math.max(i, 0);
            this.e = Math.max(i2, 0);
            return this;
        }

        public e u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("cd79ee59", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public e v(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("d6d46627", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public e w(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9ec1aeda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            this.g = Math.max(i, 0);
            this.h = Math.max(i2, 0);
            this.i = Math.max(i3, 0);
            this.j = Math.max(i4, 0);
            return this;
        }

        public e x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f2579fb7", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public e y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a891a6fd", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public e z(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("7aa2ebff", new Object[]{this, bVar});
            }
            this.m = bVar;
            return this;
        }
    }

    static {
        t2o.a(435159057);
    }

    public static /* synthetic */ long A(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70991e6d", new Object[]{floatWindow})).longValue();
        }
        return floatWindow.o;
    }

    public static /* synthetic */ View b(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2ca8a6bc", new Object[]{floatWindow});
        }
        return floatWindow.A;
    }

    public static /* synthetic */ float c(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec6ac3ab", new Object[]{floatWindow})).floatValue();
        }
        return floatWindow.f;
    }

    public static /* synthetic */ float d(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5d00d93", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.f = f;
        return f;
    }

    public static /* synthetic */ float e(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d627041", new Object[]{floatWindow})).floatValue();
        }
        return floatWindow.g;
    }

    public static /* synthetic */ float f(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83cdf3bd", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.g = f;
        return f;
    }

    public static /* synthetic */ float g(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91109b02", new Object[]{floatWindow})).floatValue();
        }
        return floatWindow.h;
    }

    public static /* synthetic */ float h(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5e5211c", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.h = f;
        return f;
    }

    public static /* synthetic */ float i(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4bec5c3", new Object[]{floatWindow})).floatValue();
        }
        return floatWindow.i;
    }

    public static /* synthetic */ float j(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fc4e7b", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.i = f;
        return f;
    }

    public static /* synthetic */ int k(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f86cf087", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.e;
    }

    public static /* synthetic */ boolean l(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c1b1b59", new Object[]{floatWindow})).booleanValue();
        }
        return floatWindow.l;
    }

    public static /* synthetic */ boolean m(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fc9461a", new Object[]{floatWindow})).booleanValue();
        }
        return floatWindow.u;
    }

    public static /* synthetic */ int n(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("937770ca", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.q;
    }

    public static /* synthetic */ FloatView o(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatView) ipChange.ipc$dispatch("84ee9ccd", new Object[]{floatWindow});
        }
        return floatWindow.z;
    }

    public static /* synthetic */ int p(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fad3c64c", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.c;
    }

    public static /* synthetic */ int q(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e81f10d", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.r;
    }

    public static /* synthetic */ int r(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f799da3", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.s;
    }

    public static /* synthetic */ int s(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d327c864", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.d;
    }

    public static /* synthetic */ int t(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d5f325", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.t;
    }

    public static /* synthetic */ FloatWindow u(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindow) ipChange.ipc$dispatch("8fa7b70f", new Object[]{floatWindow});
        }
        return floatWindow.B;
    }

    public static /* synthetic */ void v(FloatWindow floatWindow, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacfe3b4", new Object[]{floatWindow, new Float(f), new Float(f2)});
        } else {
            floatWindow.N(f, f2);
        }
    }

    public static /* synthetic */ void w(FloatWindow floatWindow, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43aca82", new Object[]{floatWindow, new Integer(i), jSONObject});
        } else {
            floatWindow.I(i, jSONObject);
        }
    }

    public static /* synthetic */ int x(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58e9e29", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.m;
    }

    public static /* synthetic */ int y(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93cc8ea", new Object[]{floatWindow})).intValue();
        }
        return floatWindow.n;
    }

    public static /* synthetic */ b z(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("be2d5f30", new Object[]{floatWindow});
        }
        return floatWindow.F;
    }

    public void B(Context context, View view, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a21782", new Object[]{this, context, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (i5 < 0) {
            i7 = (this.f10318a.x + i3) - i;
        } else if (i5 == 0) {
            i7 = (this.f10318a.x + i3) - (i / 2);
        } else {
            i7 = this.f10318a.x + i3;
        }
        if (i6 < 0) {
            i8 = (this.f10318a.y + i4) - i2;
        } else if (i6 == 0) {
            i8 = (this.f10318a.y + i4) - (i2 / 2);
        } else {
            i8 = this.f10318a.y + i4;
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow != null) {
            floatWindow.J();
        }
        FloatWindow r = new e(context, view).B(i).y(i2).A(i7, i8).v(false).u(false).r();
        this.B = r;
        r.K();
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45abd3f8", new Object[]{this});
            return;
        }
        FloatView floatView = new FloatView(this.k);
        this.z = floatView;
        if (this.p) {
            floatView.setOnTouchListener(new d());
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1a3f07", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f10318a = layoutParams;
        layoutParams.flags = 262184;
        if (!this.u) {
            layoutParams.flags = 262184 | 512;
        }
        layoutParams.width = this.x;
        layoutParams.height = this.y;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.format = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.x = this.v;
        layoutParams.y = this.w;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        FloatView floatView = this.z;
        if (floatView == null || floatView.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0181 A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:6:0x0070, B:9:0x007e, B:12:0x0087, B:13:0x008b, B:16:0x0091, B:19:0x0098, B:20:0x009b, B:23:0x00ad, B:26:0x00b6, B:42:0x00ed, B:48:0x011e, B:55:0x013a, B:59:0x0155, B:63:0x016d, B:66:0x0181, B:68:0x01a0, B:69:0x01a3, B:71:0x01ad, B:73:0x01b6), top: B:76:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void G(int r21, boolean r22, float r23, float r24, boolean r25, float r26, float r27, boolean r28, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.c r29, android.animation.ValueAnimator r30) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.G(int, boolean, float, float, boolean, float, float, boolean, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow$c, android.animation.ValueAnimator):void");
    }

    public final void H(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1b0325", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        b bVar = this.F;
        if (bVar != null) {
            bVar.a(i, jSONObject);
        }
    }

    public final void I(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30c76ff", new Object[]{this, new Integer(i), jSONObject});
        } else if (this.E != i) {
            this.E = i;
            b bVar = this.F;
            if (bVar != null) {
                bVar.a(i, jSONObject);
            }
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            return;
        }
        if (F()) {
            this.z.removeView(this.A);
            this.b.removeView(this.z);
            this.j = false;
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow != null) {
            floatWindow.J();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!F()) {
            this.b.addView(this.z, this.f10318a);
            this.j = true;
        }
    }

    public void L(View view) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee70acd2", new Object[]{this, view});
        } else if (view != null) {
            yv8.a("FloatWindow.switchView", new Object[0]);
            if (this.D && (valueAnimator = this.C) != null && valueAnimator.isStarted()) {
                yv8.a("FloatWindow.switchView.isStarted.cancel", new Object[0]);
                this.C.cancel();
            }
            FloatWindow floatWindow = this.B;
            if (floatWindow != null) {
                floatWindow.J();
            }
            this.z.removeView(this.A);
            this.A = view;
            this.z.addView(view);
        }
    }

    public void M(final int i, final boolean z, boolean z2, final boolean z3, final float f, final boolean z4, final float f2, long j, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89fde7c9", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3), new Float(f), new Boolean(z4), new Float(f2), new Long(j), cVar});
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            yv8.a("FloatWindow.translate.isStarted.cancel", new Object[0]);
            this.C.cancel();
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow != null) {
            floatWindow.J();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(j);
        WindowManager.LayoutParams layoutParams = this.f10318a;
        final float f3 = layoutParams.x;
        final float f4 = layoutParams.y;
        this.C.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.fo9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FloatWindow.this.G(i, z3, f3, f, z4, f4, f2, z, cVar, valueAnimator2);
            }
        });
        this.C.start();
        this.D = z2;
    }

    public final void N(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f432be5", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f10318a;
        layoutParams.x = (int) f;
        layoutParams.y = (int) f2;
        this.b.updateViewLayout(this.z, layoutParams);
    }

    public FloatWindow(e eVar) {
        this.E = 0;
        Context a2 = e.a(eVar);
        this.k = a2;
        this.A = e.b(eVar);
        this.x = e.j(eVar);
        this.y = e.k(eVar);
        this.v = e.l(eVar);
        this.w = e.m(eVar);
        this.p = e.n(eVar);
        this.q = e.o(eVar);
        this.r = e.p(eVar);
        this.s = e.q(eVar);
        this.t = e.c(eVar);
        this.l = e.d(eVar);
        this.m = e.e(eVar);
        this.n = e.f(eVar);
        this.u = e.g(eVar);
        this.o = e.h(eVar) > 0 ? e.h(eVar) : 200L;
        this.F = e.i(eVar);
        this.e = C(a2);
        this.b = (WindowManager) a2.getSystemService(pg1.ATOM_EXT_window);
        Pair<Integer, Integer> e2 = zd7.e(a2);
        this.c = ((Integer) e2.first).intValue();
        this.d = ((Integer) e2.second).intValue();
        E();
        D();
    }

    public final int C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
