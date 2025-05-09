package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.megaadaptivekit.gesture.ScaleBreakPoint;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dji {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MegaScaleGesture";
    public static final WeakHashMap<dji, duk> i = new WeakHashMap<>();
    public static boolean j = true;
    public static final hji k = hji.a();

    /* renamed from: a  reason: collision with root package name */
    public final ScaleGestureDetector f17862a;
    public final ScaleBreakPoint b = ScaleBreakPoint.Default;
    public duk c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final c g;
    public qwo h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17865a;

        public b(Context context) {
            this.f17865a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("maxColNum", String.valueOf(c.b(dji.g(dji.this))));
            hashMap.put("largeColNum", String.valueOf(c.e(dji.g(dji.this))));
            hashMap.put("mediumColNum", String.valueOf(c.h(dji.g(dji.this))));
            hashMap.put("expandColNum", String.valueOf(c.k(dji.g(dji.this))));
            hashMap.put("smallColNum", String.valueOf(c.a(dji.g(dji.this))));
            hashMap.put("minColNum", String.valueOf(2));
            hashMap.put("isFold", String.valueOf(dji.c(dji.this)));
            hashMap.put("isTablet", String.valueOf(dji.d(dji.this)));
            if (dji.e(dji.this) != null && dji.e(dji.this).a() != null) {
                hashMap.put("windowType", dji.e(dji.this).a().name());
            } else if (this.f17865a instanceof Activity) {
                hashMap.put("windowType", TBAutoSizeConfig.x().M((Activity) this.f17865a).name());
            }
            lxv.a("GestureConfiguration", hashMap);
        }
    }

    static {
        t2o.a(522190849);
    }

    public dji(Context context) {
        boolean z;
        c p = c.p(context);
        this.g = p;
        boolean P = TBDeviceUtils.P(context);
        this.d = P;
        boolean p2 = TBDeviceUtils.p(context);
        this.e = p2;
        if (p2 || P) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.f17862a = new ScaleGestureDetector(context, new a(context));
        if (j && p != null) {
            MegaUtils.C(new b(context));
            j = false;
        }
    }

    public static /* synthetic */ ScaleBreakPoint a(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScaleBreakPoint) ipChange.ipc$dispatch("8dc97c0b", new Object[]{djiVar});
        }
        return djiVar.b;
    }

    public static /* synthetic */ void b(dji djiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee270fc", new Object[]{djiVar, new Boolean(z)});
        } else {
            djiVar.p(z);
        }
    }

    public static /* synthetic */ boolean c(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6acd0d", new Object[]{djiVar})).booleanValue();
        }
        return djiVar.e;
    }

    public static /* synthetic */ boolean d(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c81fa6c", new Object[]{djiVar})).booleanValue();
        }
        return djiVar.d;
    }

    public static /* synthetic */ qwo e(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwo) ipChange.ipc$dispatch("ce9ec776", new Object[]{djiVar});
        }
        return djiVar.h;
    }

    public static /* synthetic */ duk f(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duk) ipChange.ipc$dispatch("a09c349", new Object[]{djiVar});
        }
        return djiVar.c;
    }

    public static /* synthetic */ c g(dji djiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f5975702", new Object[]{djiVar});
        }
        return djiVar.g;
    }

    public static /* synthetic */ void h(dji djiVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132e5e7", new Object[]{djiVar, cVar});
        } else {
            djiVar.k(cVar);
        }
    }

    public static /* synthetic */ void i(dji djiVar, Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e18648", new Object[]{djiVar, context, cVar});
        } else {
            djiVar.q(context, cVar);
        }
    }

    public static void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{str});
            return;
        }
        hji hjiVar = k;
        if (hjiVar != null) {
            hjiVar.b(str, null);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WeakHashMap<dji, duk> weakHashMap = i;
        if (weakHashMap != null) {
            weakHashMap.remove(this);
        }
    }

    public final void k(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c735eca", new Object[]{this, cVar});
            return;
        }
        for (duk dukVar : i.values()) {
            if (dukVar != this.c) {
                dukVar.a(cVar);
            }
        }
    }

    public void l(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            return;
        }
        ScaleGestureDetector scaleGestureDetector = this.f17862a;
        if (scaleGestureDetector != null && this.f) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f287c1e", new Object[]{this});
        } else if (this.e) {
            if (c.k(this.g) > 2) {
                c.m(this.g);
                qwo qwoVar = this.h;
                if (qwoVar != null && qwoVar.b()) {
                    s("已显示更少内容");
                    return;
                }
                return;
            }
            qwo qwoVar2 = this.h;
            if (qwoVar2 != null && qwoVar2.b()) {
                s("不能再放大了");
            }
        } else if (this.d) {
            if (c.b(this.g) > 3) {
                c.d(this.g);
                qwo qwoVar3 = this.h;
                if (qwoVar3 != null && qwoVar3.a() == WindowType.MAX) {
                    s("已显示更少内容");
                }
            } else {
                qwo qwoVar4 = this.h;
                if (qwoVar4 != null && qwoVar4.a() == WindowType.MAX) {
                    s("不能再放大了");
                }
            }
            if (c.e(this.g) > 3) {
                c.g(this.g);
                qwo qwoVar5 = this.h;
                if (qwoVar5 != null && qwoVar5.a() == WindowType.LARGE) {
                    s("已显示更少内容");
                }
            } else {
                qwo qwoVar6 = this.h;
                if (qwoVar6 != null && qwoVar6.a() == WindowType.LARGE) {
                    s("不能再放大了");
                }
            }
            if (c.h(this.g) > 2) {
                c.j(this.g);
                qwo qwoVar7 = this.h;
                if (qwoVar7 != null && qwoVar7.a() == WindowType.MEDIUM) {
                    s("已显示更少内容");
                    return;
                }
                return;
            }
            qwo qwoVar8 = this.h;
            if (qwoVar8 != null && qwoVar8.a() == WindowType.MEDIUM) {
                s("不能再放大了");
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31b7623", new Object[]{this});
        } else if (this.d) {
            if (c.b(this.g) < 5) {
                c.c(this.g);
                qwo qwoVar = this.h;
                if (qwoVar != null && qwoVar.a() == WindowType.MAX) {
                    s("已显示更多内容");
                }
            } else {
                qwo qwoVar2 = this.h;
                if (qwoVar2 != null && qwoVar2.a() == WindowType.MAX) {
                    s("不能再缩小了");
                }
            }
            if (c.e(this.g) < 5) {
                c.f(this.g);
                qwo qwoVar3 = this.h;
                if (qwoVar3 != null && qwoVar3.a() == WindowType.LARGE) {
                    s("已显示更多内容");
                }
            } else {
                qwo qwoVar4 = this.h;
                if (qwoVar4 != null && qwoVar4.a() == WindowType.LARGE) {
                    s("不能再缩小了");
                }
            }
            if (c.h(this.g) < 4) {
                c.i(this.g);
                qwo qwoVar5 = this.h;
                if (qwoVar5 != null && qwoVar5.a() == WindowType.MEDIUM) {
                    s("已显示更多内容");
                    return;
                }
                return;
            }
            qwo qwoVar6 = this.h;
            if (qwoVar6 != null && qwoVar6.a() == WindowType.MEDIUM) {
                s("不能再缩小了");
            }
        } else if (!this.e) {
        } else {
            if (c.k(this.g) < 4) {
                c.l(this.g);
                qwo qwoVar7 = this.h;
                if (qwoVar7 != null && qwoVar7.b()) {
                    s("已显示更多内容");
                    return;
                }
                return;
            }
            qwo qwoVar8 = this.h;
            if (qwoVar8 != null && qwoVar8.b()) {
                s("不能再缩小了");
            }
        }
    }

    public void o(duk dukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7554d70c", new Object[]{this, dukVar});
            return;
        }
        this.c = dukVar;
        i.put(this, dukVar);
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f7685c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            n();
        } else {
            m();
        }
    }

    public void r(qwo qwoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09b139b", new Object[]{this, qwoVar});
        } else {
            this.h = qwoVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f17863a = false;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* renamed from: tb.dji$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class RunnableC0905a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0905a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap();
                if (dji.g(dji.this) != null) {
                    hashMap.put("maxColNum", String.valueOf(c.b(dji.g(dji.this))));
                    hashMap.put("largeColNum", String.valueOf(c.e(dji.g(dji.this))));
                    hashMap.put("mediumColNum", String.valueOf(c.h(dji.g(dji.this))));
                    hashMap.put("expandColNum", String.valueOf(c.k(dji.g(dji.this))));
                    hashMap.put("smallColNum", String.valueOf(c.a(dji.g(dji.this))));
                    hashMap.put("minColNum", String.valueOf(2));
                    hashMap.put("isFold", String.valueOf(dji.c(dji.this)));
                    hashMap.put("isTablet", String.valueOf(dji.d(dji.this)));
                    if (dji.d(dji.this)) {
                        if (dji.e(dji.this) != null && dji.e(dji.this).a() != null) {
                            hashMap.put("windowType", dji.e(dji.this).a().name());
                        } else if (a.this.b instanceof Activity) {
                            hashMap.put("windowType", TBAutoSizeConfig.x().M((Activity) a.this.b).name());
                        }
                    }
                    lxv.a("GestureOnScale", hashMap);
                }
            }
        }

        public a(Context context) {
            this.b = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1949747311) {
                return new Boolean(super.onScaleBegin((ScaleGestureDetector) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megaadaptivekit/gesture/MegaScaleGestureDetector$1");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            this.f17863a = false;
            return super.onScaleBegin(scaleGestureDetector);
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                return;
            }
            dji djiVar = dji.this;
            dji.i(djiVar, this.b, dji.g(djiVar));
            MegaUtils.C(new RunnableC0905a());
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            if (scaleGestureDetector.getScaleFactor() > dji.a(dji.this).getScaleFactorMax() && !this.f17863a) {
                dji.b(dji.this, false);
                if (dji.f(dji.this) != null) {
                    dji.f(dji.this).a(dji.g(dji.this));
                }
                dji djiVar = dji.this;
                dji.h(djiVar, dji.g(djiVar));
                this.f17863a = true;
                TLog.loge(dji.TAG, dji.TAG, "on zoom in = " + dji.g(dji.this).toString());
            } else if (scaleGestureDetector.getScaleFactor() < dji.a(dji.this).getScaleFactorMin() && !this.f17863a) {
                dji.b(dji.this, true);
                if (dji.f(dji.this) != null) {
                    dji.f(dji.this).a(dji.g(dji.this));
                }
                dji djiVar2 = dji.this;
                dji.h(djiVar2, dji.g(djiVar2));
                this.f17863a = true;
                TLog.loge(dji.TAG, dji.TAG, "on zoom out = " + dji.g(dji.this).toString());
            } else if (!this.f17863a) {
                dji.f(dji.this).onScale(scaleGestureDetector);
            }
            return false;
        }
    }

    public final void q(Context context, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1ad919", new Object[]{this, context, cVar});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("mega_scale_gesture", 0).edit();
            edit.putString("cloConfig", cVar.u());
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static c e;

        /* renamed from: a  reason: collision with root package name */
        public int f17866a = 4;
        public int b = 3;
        public int c = 3;
        public int d = 3;

        static {
            t2o.a(522190853);
        }

        public c(Context context) {
            n(context);
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c85408c9", new Object[]{cVar})).intValue();
            }
            cVar.getClass();
            return 2;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("82e3c4d2", new Object[]{cVar})).intValue();
            }
            return cVar.f17866a;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee49adca", new Object[]{cVar})).intValue();
            }
            int i = cVar.f17866a;
            cVar.f17866a = 1 + i;
            return i;
        }

        public static /* synthetic */ int d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c30eab93", new Object[]{cVar})).intValue();
            }
            int i = cVar.f17866a;
            cVar.f17866a = i - 1;
            return i;
        }

        public static /* synthetic */ int e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4815b631", new Object[]{cVar})).intValue();
            }
            return cVar.b;
        }

        public static /* synthetic */ int f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b37b9f29", new Object[]{cVar})).intValue();
            }
            int i = cVar.b;
            cVar.b = 1 + i;
            return i;
        }

        public static /* synthetic */ int g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("88409cf2", new Object[]{cVar})).intValue();
            }
            int i = cVar.b;
            cVar.b = i - 1;
            return i;
        }

        public static /* synthetic */ int h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d47a790", new Object[]{cVar})).intValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ int i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78ad9088", new Object[]{cVar})).intValue();
            }
            int i = cVar.c;
            cVar.c = 1 + i;
            return i;
        }

        public static /* synthetic */ int j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d728e51", new Object[]{cVar})).intValue();
            }
            int i = cVar.c;
            cVar.c = i - 1;
            return i;
        }

        public static /* synthetic */ int k(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d27998ef", new Object[]{cVar})).intValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ int l(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3ddf81e7", new Object[]{cVar})).intValue();
            }
            int i = cVar.d;
            cVar.d = 1 + i;
            return i;
        }

        public static /* synthetic */ int m(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("12a47fb0", new Object[]{cVar})).intValue();
            }
            int i = cVar.d;
            cVar.d = i - 1;
            return i;
        }

        public static c p(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("e26a1a62", new Object[]{context});
            }
            if (e == null) {
                synchronized (c.class) {
                    try {
                        if (e == null) {
                            e = new c(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            TLog.loge(dji.TAG, dji.TAG, "config = " + e.toString());
            return e;
        }

        public int o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("655d8d10", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66cf3ec5", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f873342e", new Object[]{this})).intValue();
            }
            return this.f17866a;
        }

        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("163c282b", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public int t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6511639c", new Object[]{this})).intValue();
            }
            return 2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Config{maxColNum=" + this.f17866a + ", largeColNum=" + this.b + ", mediumColNum=" + this.c + ", smallColNum=2, minColNum=2, foldColNum=2, expandColNum=" + this.d + '}';
        }

        public String u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("955010c9", new Object[]{this});
            }
            return this.f17866a + ":" + this.b + ":" + this.c + ":" + this.d;
        }

        public int v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d43a4991", new Object[]{this})).intValue();
            }
            return 2;
        }

        public final void n(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dc46b38", new Object[]{this, context});
                return;
            }
            try {
                String string = context.getApplicationContext().getSharedPreferences("mega_scale_gesture", 0).getString("cloConfig", null);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split(":");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        this.f17866a = parseInt;
                        if (parseInt < 3 || parseInt > 5) {
                            this.f17866a = 4;
                        }
                        int parseInt2 = Integer.parseInt(split[1]);
                        this.b = parseInt2;
                        if (parseInt2 < 3 || parseInt2 > 5) {
                            this.b = 3;
                        }
                        int parseInt3 = Integer.parseInt(split[2]);
                        this.c = parseInt3;
                        if (parseInt3 < 2 || parseInt3 > 4) {
                            this.c = 3;
                        }
                        int parseInt4 = Integer.parseInt(split[3]);
                        this.d = parseInt4;
                        if (parseInt4 < 2 || parseInt4 > 4) {
                            this.d = 3;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
