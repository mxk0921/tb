package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.bb2;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nb2 extends AbstractEventHandler implements View.OnTouchListener, GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float n;
    public float o;
    public double p;
    public double q;
    public final GestureDetector r;
    public VelocityTracker s;
    public final int t;

    static {
        t2o.a(87031854);
    }

    public nb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this.r = new GestureDetector(context, this, new Handler(looper));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
        viewConfiguration.getScaledMinimumFlingVelocity();
    }

    public static /* synthetic */ Object ipc$super(nb2 nb2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -189097425) {
            super.p((String) objArr[0], (Map) objArr[1], (fr8) objArr[2], (List) objArr[3], (bb2.g) objArr[4]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/core/internal/BindingXTouchHandler");
        }
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.f2170a != null) {
            this.f2170a.clear();
            this.f2170a = null;
        }
        this.j = null;
        this.c = null;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, tb.i3c
    public void p(String str, Map<String, Object> map, fr8 fr8Var, List<Map<String, Object>> list, bb2.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ba9a2f", new Object[]{this, str, map, fr8Var, list, gVar});
        } else {
            super.p(str, map, fr8Var, list, gVar);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
        } else {
            A("exit", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), 0.0f, 0.0f, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            A("interceptor", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue(), 0.0f, 0.0f, Collections.singletonMap("interceptor", str));
        }
    }

    public final void A(String str, double d, double d2, float f, float f2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b7a5aa", new Object[]{this, str, new Double(d), new Double(d2), new Float(f), new Float(f2), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.h.e().b(d, new Object[0]);
            double b2 = this.h.e().b(d2, new Object[0]);
            hashMap.put("deltaX", Double.valueOf(b));
            hashMap.put("deltaY", Double.valueOf(b2));
            if ("end".equals(str)) {
                hashMap.put("velocityX", Float.valueOf(f));
                hashMap.put("velocityY", Float.valueOf(f2));
            }
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + b + "," + b2 + f7l.BRACKET_END_STR);
        }
    }

    @Override // tb.i3c
    public boolean b(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        View a2 = this.h.g().a(str, str3);
        if (a2 != null) {
            ViewProxy.setOnTouchListener(a2, null);
        }
        gfh.a("remove touch listener success.[" + str + "," + str2 + "]");
        return true;
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            str3 = this.e;
        } else {
            str3 = this.f;
        }
        View a2 = this.h.g().a(str, str3);
        if (a2 == null) {
            gfh.b("[ExpressionTouchHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        ViewProxy.setOnTouchListener(a2, this);
        gfh.a("[ExpressionTouchHandler] onCreate success. {source:" + str + ",type:" + str2 + "}");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null) {
            f4 = this.n;
            f3 = this.o;
        } else {
            float rawX = motionEvent.getRawX();
            f3 = motionEvent.getRawY();
            f4 = rawX;
        }
        if (motionEvent2 == null) {
            return false;
        }
        float rawX2 = motionEvent2.getRawX() - f4;
        float rawY = motionEvent2.getRawY() - f3;
        try {
            if (gfh.f19951a) {
                gfh.a(String.format(Locale.getDefault(), "[TouchHandler] pan moved. (x:%f,y:%f)", Float.valueOf(rawX2), Float.valueOf(rawY)));
            }
            JSMath.applyXYToScope(this.d, rawX2, rawY, this.h.e());
            if (!t(this.j, this.d)) {
                s(this.f2170a, this.d, "pan");
            }
        } catch (Exception e) {
            gfh.c("runtime error", e);
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        try {
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.n = motionEvent.getRawX();
                this.o = motionEvent.getRawY();
                A("start", vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 0.0f, 0.0f, new Object[0]);
            } else if (actionMasked == 1) {
                this.n = 0.0f;
                this.o = 0.0f;
                r();
                this.s.computeCurrentVelocity(1000, this.t);
                A("end", this.p, this.q, this.s.getXVelocity(), this.s.getYVelocity(), new Object[0]);
                this.p = vu3.b.GEO_NOT_SUPPORT;
                this.q = vu3.b.GEO_NOT_SUPPORT;
                VelocityTracker velocityTracker = this.s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.s = null;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.n = 0.0f;
                    this.o = 0.0f;
                    r();
                    A("cancel", this.p, this.q, 0.0f, 0.0f, new Object[0]);
                    VelocityTracker velocityTracker2 = this.s;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.s = null;
                    }
                }
            } else if (this.n == 0.0f && this.o == 0.0f) {
                this.n = motionEvent.getRawX();
                this.o = motionEvent.getRawY();
                A("start", vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 0.0f, 0.0f, new Object[0]);
            } else {
                this.p = motionEvent.getRawX() - this.n;
                this.q = motionEvent.getRawY() - this.o;
            }
        } catch (Exception e) {
            gfh.c("runtime error ", e);
        }
        return this.r.onTouchEvent(motionEvent);
    }
}
