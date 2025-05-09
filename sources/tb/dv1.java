package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.family.globalbubble.DegradeWindow;
import com.taobao.family.globalbubble.RectBean;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.weex.WXSDKInstance;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class dv1 implements dac, Handler.Callback, gbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WINDOW_HIDE = 2;
    public static final int WINDOW_SHOW = 1;
    public static int n;
    public static int o;
    public static int p;
    public static boolean q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18084a;
    public View d;
    public WeakReference<View> f;
    public WeakReference<Activity> g;
    public final int h;
    public boolean i;
    public final bo9 m;
    public String e = "com.taobao.tao.homepage.MainActivity3";
    public boolean j = false;
    public boolean k = false;
    public ViewTreeObserver.OnGlobalLayoutListener l = null;
    public final epo b = new epo(Looper.getMainLooper(), this);
    public final crb c = new DegradeWindow();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
            if (r12 != 2) goto L_0x0085;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            /*
                r11 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = tb.dv1.a.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001f
                java.lang.String r4 = "d4aa3aa4"
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r11
                r5[r1] = r12
                r5[r0] = r13
                java.lang.Object r12 = r3.ipc$dispatch(r4, r5)
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                return r12
            L_0x001f:
                int r12 = r13.getAction()
                if (r12 == 0) goto L_0x002a
                if (r12 == r1) goto L_0x003b
                if (r12 == r0) goto L_0x003b
                goto L_0x0085
            L_0x002a:
                tb.dv1 r12 = tb.dv1.this
                float r0 = r13.getX()
                float r1 = r13.getY()
                boolean r0 = tb.dv1.i(r12, r0, r1)
                tb.dv1.h(r12, r0)
            L_0x003b:
                tb.dv1 r12 = tb.dv1.this
                boolean r12 = tb.dv1.g(r12)
                if (r12 == 0) goto L_0x0044
                return r2
            L_0x0044:
                long r3 = r13.getDownTime()
                long r5 = r13.getEventTime()
                int r7 = r13.getAction()
                float r8 = r13.getRawX()
                float r9 = r13.getRawY()
                int r10 = r13.getMetaState()
                android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
                tb.dv1 r13 = tb.dv1.this
                java.lang.ref.WeakReference r13 = tb.dv1.j(r13)
                if (r13 == 0) goto L_0x0085
                tb.dv1 r13 = tb.dv1.this
                java.lang.ref.WeakReference r13 = tb.dv1.j(r13)
                java.lang.Object r13 = r13.get()
                if (r13 == 0) goto L_0x0085
                tb.dv1 r13 = tb.dv1.this
                java.lang.ref.WeakReference r13 = tb.dv1.j(r13)
                java.lang.Object r13 = r13.get()
                android.app.Activity r13 = (android.app.Activity) r13
                boolean r12 = r13.dispatchTouchEvent(r12)
                return r12
            L_0x0085:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.dv1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (dv1.k(dv1.this) && dv1.l() != (f = jr7.f(Globals.getApplication()))) {
                if (f) {
                    dv1.p = dv1.n() - jr7.c();
                } else {
                    dv1.p = dv1.n();
                }
                dv1.m(f);
                try {
                    PopupWindow popupWindow = (PopupWindow) dv1.o(dv1.this);
                    if (popupWindow.isShowing()) {
                        popupWindow.update(dv1.n, dv1.p(dv1.this));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 2) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
                if (!(dv1.j(dv1.this) == null || dv1.j(dv1.this).get() == null)) {
                    return ((Activity) dv1.j(dv1.this).get()).dispatchTouchEvent(obtain);
                }
            }
            return false;
        }
    }

    public dv1(Context context, boolean z, int i) {
        this.i = false;
        this.f18084a = context;
        this.h = i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        n = displayMetrics.widthPixels;
        o = displayMetrics.heightPixels;
        q = jr7.f(Globals.getApplication());
        p = o - jr7.c();
        this.m = new bo9(context, this);
        y();
        this.i = z;
        C();
    }

    public static /* synthetic */ boolean g(dv1 dv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0a24542", new Object[]{dv1Var})).booleanValue();
        }
        return dv1Var.k;
    }

    public static /* synthetic */ boolean h(dv1 dv1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a64fbfdc", new Object[]{dv1Var, new Boolean(z)})).booleanValue();
        }
        dv1Var.k = z;
        return z;
    }

    public static /* synthetic */ boolean i(dv1 dv1Var, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae1ffce1", new Object[]{dv1Var, new Float(f), new Float(f2)})).booleanValue();
        }
        return dv1Var.A(f, f2);
    }

    public static /* synthetic */ WeakReference j(dv1 dv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("a3e845ca", new Object[]{dv1Var});
        }
        return dv1Var.g;
    }

    public static /* synthetic */ boolean k(dv1 dv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4453ddf", new Object[]{dv1Var})).booleanValue();
        }
        return dv1Var.j;
    }

    public static /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue();
        }
        return q;
    }

    public static /* synthetic */ boolean m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80d9fefb", new Object[]{new Boolean(z)})).booleanValue();
        }
        q = z;
        return z;
    }

    public static /* synthetic */ int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552faf", new Object[0])).intValue();
        }
        return o;
    }

    public static /* synthetic */ crb o(dv1 dv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crb) ipChange.ipc$dispatch("d2e154f9", new Object[]{dv1Var});
        }
        return dv1Var.c;
    }

    public static /* synthetic */ int p(dv1 dv1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c91e894a", new Object[]{dv1Var})).intValue();
        }
        return dv1Var.t();
    }

    public final boolean A(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec72b7e", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (yca.p().f != null && yca.p().f.size() > 0) {
            for (RectBean rectBean : yca.p().f) {
                if (rectBean != null) {
                    int i = rectBean.left;
                    if (f >= i && f <= i + rectBean.width) {
                        int i2 = rectBean.top;
                        if (f2 >= i2 && f2 <= i2 + rectBean.height) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb26ea8e", new Object[]{this})).booleanValue();
        }
        return TBDeviceUtils.p(this.f18084a);
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946fec05", new Object[]{this});
            return;
        }
        WeakReference<Activity> n2 = yca.p().n();
        if (n2 != null && n2.get() != null) {
            this.g = n2;
            this.e = n2.get().getClass().getName();
            this.f = new WeakReference<>(n2.get().getWindow().getDecorView());
        }
    }

    public synchronized void D(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab7929", new Object[]{this, new Boolean(z)});
            return;
        }
        v();
        WeakReference<View> weakReference = this.f;
        if (!(weakReference == null || weakReference.get() == null || this.f.get().getViewTreeObserver() == null)) {
            this.f.get().getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        this.i = false;
        if (z) {
            this.b.sendEmptyMessage(3);
        } else {
            this.b.sendEmptyMessage(2);
        }
    }

    public void E(String str, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf50053", new Object[]{this, str, hashMap});
        } else {
            TextUtils.isEmpty(str);
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3778936", new Object[]{this});
        }
    }

    public synchronized void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        if (!isShowing() && !B() && this.i) {
            WeakReference<View> weakReference = this.f;
            if (!(weakReference == null || weakReference.get() == null)) {
                if (this.d == null) {
                    View h = this.m.h();
                    this.d = h;
                    q(h);
                } else {
                    this.j = true;
                    this.c.init(this.f.get());
                    String u = u();
                    CT ct = CT.Image;
                    TBS.Adv.ctrlClickedOnPage(u, ct, u() + "_show", this.e);
                }
            }
        }
    }

    @Override // tb.dac
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d335924c", new Object[]{this, str, map});
        }
    }

    @Override // tb.dac
    public synchronized void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b916fb", new Object[]{this, activity});
            return;
        }
        if (activity != null) {
            this.g = new WeakReference<>(activity);
            this.f = new WeakReference<>(activity.getWindow().getDecorView());
            this.e = activity.getClass().getName();
            WeakReference<View> weakReference = this.f;
            if (!(weakReference == null || weakReference.get() == null || this.f.get().getViewTreeObserver() == null)) {
                this.f.get().getViewTreeObserver().addOnGlobalLayoutListener(this.l);
            }
        }
    }

    @Override // tb.dac
    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb77c4a8", new Object[]{this});
            return;
        }
        v();
        this.i = true;
        this.b.sendEmptyMessage(1);
    }

    @Override // tb.dac
    public void d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3334528", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (z) {
            str = "show";
        } else {
            str = "hidden";
        }
        hashMap.put("status", str);
        hashMap.put("url", this.e);
        hashMap.put("activity", this.e);
        hashMap.put("change", "true");
        E("gbPageChanged", hashMap);
    }

    @Override // tb.dac
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1df33a4", new Object[]{this, str});
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("status", str);
        E("gbAppStatusChanged", hashMap);
    }

    @Override // tb.dac
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b0f859", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    @Override // tb.dac
    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.h;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            G();
        } else if (i == 2) {
            x();
        } else if (i == 3) {
            x();
            s();
        }
        return false;
    }

    @Override // tb.dac
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    @Override // tb.gbe
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        String v = v();
        y7t.a(v, "onException:" + str + "----" + str2);
        String u = u();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(u, ct, u() + "_on_exception", this.e);
    }

    @Override // tb.gbe
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        y7t.a(v(), "onRefreshSuccess");
        String u = u();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(u, ct, u() + "_on_refresh_success", this.e);
    }

    @Override // tb.gbe
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        y7t.a(v(), sxl.RENDER_SUCCESS_TIME);
        String u = u();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(u, ct, u() + "_on_render_success", this.e);
        F();
    }

    @Override // tb.gbe
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        y7t.a(v(), "onViewCreated");
        this.d = view;
        String u = u();
        CT ct = CT.Image;
        TBS.Adv.ctrlClickedOnPage(u, ct, u() + "_on_view_create", this.e);
        r(this.d);
    }

    public final void q(View view) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4034fd6e", new Object[]{this, view});
            return;
        }
        String v = v();
        y7t.a(v, "addNativeView:" + this.e);
        if (view != null && (weakReference = this.f) != null && weakReference.get() != null) {
            this.c.setView(view);
            this.c.setSize(n, t());
            this.c.setGravity(0, 0, 0);
            if (!isShowing() && !B() && this.i) {
                this.j = true;
                this.c.init(this.f.get());
                String u = u();
                CT ct = CT.Image;
                String u2 = u();
                TBS.Adv.ctrlClickedOnPage(u, ct, u2, u() + "_show", this.e);
            }
        }
    }

    public final void r(View view) {
        WeakReference<View> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79755704", new Object[]{this, view});
            return;
        }
        String v = v();
        y7t.a(v, "addView:" + this.e);
        if (view != null && (weakReference = this.f) != null && weakReference.get() != null) {
            z();
            ViewProxy.setOnTouchListener(view, new c());
            this.c.setView(view);
            this.c.setSize(n, t());
            this.c.setGravity(0, 0, 0);
            if (!isShowing() && !B() && this.i) {
                this.j = true;
                this.c.init(this.f.get());
                String u = u();
                CT ct = CT.Image;
                String u2 = u();
                TBS.Adv.ctrlClickedOnPage(u, ct, u2, u() + "_show", this.e);
            }
        }
    }

    public synchronized void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            yca.p().l = null;
            View view = this.d;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.d);
                }
                this.d = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ebf685", new Object[]{this})).intValue();
        }
        WeakReference<View> weakReference = this.f;
        if (weakReference == null) {
            return p;
        }
        View view = weakReference.get();
        if (view == null) {
            return p;
        }
        int max = Math.max(view.getMeasuredHeight(), p);
        p = max;
        return max;
    }

    public abstract String u();

    public abstract String v();

    public crb w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crb) ipChange.ipc$dispatch("eb0620ee", new Object[]{this});
        }
        return this.c;
    }

    public synchronized void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (isShowing()) {
            this.j = false;
            crb crbVar = this.c;
            if (crbVar != null) {
                crbVar.dismiss();
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ec1ada", new Object[]{this});
        } else {
            this.l = new b();
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99c3883", new Object[]{this});
        } else {
            ((PopupWindow) this.c).setTouchInterceptor(new a());
        }
    }
}
