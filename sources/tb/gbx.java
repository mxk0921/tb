package tb;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicAbsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class gbx implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MainPicAbsViewHolder.a f19880a;
    public final GestureDetector b;
    public final ScaleGestureDetector c;
    public final View d;
    public final Context e;
    public boolean f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322144);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/click/WidgetClickListener$ScaleGestureListener");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!gbx.a(gbx.this) && gbx.c(gbx.this) != null) {
                d dVar = new d();
                dVar.b = gbx.this.g();
                dVar.f19883a = gbx.this.h();
                if (scaleFactor > 1.0f) {
                    str = "unpinch";
                } else {
                    str = "pinch";
                }
                dVar.e = str;
                txj.e(txj.TAG_RENDER, "主图下沉onScale：" + scaleFactor);
                gbx.c(gbx.this).d(dVar);
                gbx.b(gbx.this, true);
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            gbx.b(gbx.this, false);
            txj.e(txj.TAG_RENDER, "主图下沉onScaleBegin：" + scaleFactor);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f19883a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        static {
            t2o.a(352322145);
        }
    }

    static {
        t2o.a(352322141);
    }

    public gbx(View view, Context context, MainPicAbsViewHolder.a aVar) {
        this.f19880a = aVar;
        this.e = context;
        this.b = new GestureDetector(context, new b());
        this.c = new ScaleGestureDetector(context, new c());
        this.d = view;
    }

    public static /* synthetic */ boolean a(gbx gbxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96ba8388", new Object[]{gbxVar})).booleanValue();
        }
        return gbxVar.f;
    }

    public static /* synthetic */ boolean b(gbx gbxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceae6dd6", new Object[]{gbxVar, new Boolean(z)})).booleanValue();
        }
        gbxVar.f = z;
        return z;
    }

    public static /* synthetic */ MainPicAbsViewHolder.a c(gbx gbxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainPicAbsViewHolder.a) ipChange.ipc$dispatch("9eff93b1", new Object[]{gbxVar});
        }
        return gbxVar.f19880a;
    }

    public static /* synthetic */ View d(gbx gbxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fee5e184", new Object[]{gbxVar});
        }
        return gbxVar.d;
    }

    public static /* synthetic */ boolean e(gbx gbxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69b8ee19", new Object[]{gbxVar, new Boolean(z)})).booleanValue();
        }
        gbxVar.g = z;
        return z;
    }

    public static /* synthetic */ Context f(gbx gbxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("65d2c6f8", new Object[]{gbxVar});
        }
        return gbxVar.e;
    }

    public abstract String g();

    public abstract int h();

    public void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523ebe22", new Object[]{this, view});
        }
    }

    public void j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e7813e", new Object[]{this, view});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322143);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/click/WidgetClickListener$GestureListener");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (gbx.c(gbx.this) != null) {
                d dVar = new d();
                dVar.b = gbx.this.g();
                dVar.f19883a = gbx.this.h();
                int[] iArr = new int[2];
                gbx.d(gbx.this).getLocationOnScreen(iArr);
                float f = x + iArr[0];
                float f2 = y + iArr[1];
                dVar.c = String.valueOf(ec7.d(gbx.f(gbx.this), f));
                dVar.d = String.valueOf(ec7.d(gbx.f(gbx.this), f2));
                txj.e(txj.TAG_RENDER, "widgetClickListener onDoubleTap, position: " + dVar.f19883a + ", area: " + dVar.b + ", X: " + dVar.c + ", Y: " + dVar.d);
                gbx.c(gbx.this).c(dVar);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            gbx gbxVar = gbx.this;
            gbxVar.j(gbx.d(gbxVar));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            gbx.e(gbx.this, true);
            if (gbx.c(gbx.this) != null) {
                d dVar = new d();
                dVar.b = gbx.this.g();
                dVar.f19883a = gbx.this.h();
                int[] iArr = new int[2];
                gbx.d(gbx.this).getLocationOnScreen(iArr);
                float f = y + iArr[1];
                dVar.c = String.valueOf(ec7.d(gbx.f(gbx.this), x + iArr[0]));
                dVar.d = String.valueOf(ec7.d(gbx.f(gbx.this), f));
                dVar.f = "begin";
                txj.e(txj.TAG_RENDER, "widgetClickListener onLongPress, position: " + dVar.f19883a + ", area: " + dVar.b + ", longPressStatus: " + dVar.f);
                gbx.c(gbx.this).a(dVar);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            gbx gbxVar = gbx.this;
            gbxVar.i(gbx.d(gbxVar));
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (gbx.c(gbx.this) != null) {
                d dVar = new d();
                dVar.b = gbx.this.g();
                dVar.f19883a = gbx.this.h();
                int[] iArr = new int[2];
                gbx.d(gbx.this).getLocationOnScreen(iArr);
                float f = x + iArr[0];
                float f2 = y + iArr[1];
                dVar.c = String.valueOf(ec7.d(gbx.f(gbx.this), f));
                dVar.d = String.valueOf(ec7.d(gbx.f(gbx.this), f2));
                txj.e(txj.TAG_RENDER, "widgetClickListener onSingleTapConfirmed, position: " + dVar.f19883a + ", area: " + dVar.b);
                gbx.c(gbx.this).b(dVar);
            }
            return true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        motionEvent.getAction();
        this.c.onTouchEvent(motionEvent);
        this.b.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.g) {
            this.g = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f19880a != null) {
                d dVar = new d();
                dVar.b = g();
                dVar.f19883a = h();
                int[] iArr = new int[2];
                this.d.getLocationOnScreen(iArr);
                float f = y + iArr[1];
                dVar.c = String.valueOf(ec7.d(this.e, x + iArr[0]));
                dVar.d = String.valueOf(ec7.d(this.e, f));
                dVar.f = "end";
                txj.e(txj.TAG_RENDER, "widgetClickListener onLongPress, position: " + dVar.f19883a + ", area: " + dVar.b + ", longPressStatus: " + dVar.f);
                this.f19880a.a(dVar);
            }
        }
        return true;
    }
}
