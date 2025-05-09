package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import com.alibaba.android.bindingx.core.internal.JSMath;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eb2 extends AbstractEventHandler implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ScaleGestureDetector n;
    public boolean o;
    public final int[] p = new int[2];
    public double q = 1.0d;

    static {
        t2o.a(87031850);
    }

    public eb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this.n = new ScaleGestureDetector(context, this, new Handler(looper));
    }

    public static /* synthetic */ Object ipc$super(eb2 eb2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/BindingXPinchHandler");
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45f2dc8", new Object[]{this});
        } else if (this.o) {
            gfh.a("[PinchHandler] pinch gesture end");
            A("end", this.q, new Object[0]);
            this.o = false;
            int[] iArr = this.p;
            iArr[0] = -1;
            iArr[1] = -1;
            this.q = 1.0d;
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

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o = false;
            this.p[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.p[1] = -1;
        } else if (actionMasked == 1) {
            B();
        } else if (actionMasked != 5) {
            if (actionMasked == 6 && this.o) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.p;
                if (pointerId == iArr[0] || pointerId == iArr[1]) {
                    B();
                }
            }
        } else if (!this.o) {
            this.p[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.o = true;
            C();
        }
        return this.n.onTouchEvent(motionEvent);
    }

    public final void A(String str, double d, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5239269a", new Object[]{this, str, new Double(d), objArr});
        } else if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("scale", Double.valueOf(d));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Map) {
                    hashMap.putAll((Map) obj);
                }
            }
            this.c.callback(hashMap);
            gfh.a(">>>>>>>>>>>fire event:(" + str + "," + d + f7l.BRACKET_END_STR);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd76c4f", new Object[]{this});
            return;
        }
        gfh.a("[PinchHandler] pinch gesture begin");
        A("start", 1.0d, new Object[0]);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void v(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dac3d61", new Object[]{this, map});
        } else {
            A("exit", ((Double) map.get("s")).doubleValue(), new Object[0]);
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
        gfh.a("remove touch listener success.[" + str + "," + str2 + "]");
        if (a2 == null) {
            return false;
        }
        ViewProxy.setOnTouchListener(a2, null);
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
            gfh.b("[BindingXPinchHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        ViewProxy.setOnTouchListener(a2, this);
        gfh.a("[BindingXPinchHandler] onCreate success. {source:" + str + ",type:" + str2 + "}");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
            this.q *= scaleFactor;
            try {
                if (gfh.f19951a) {
                    gfh.a(String.format(Locale.getDefault(), "[PinchHandler] current scale factor: %f", Double.valueOf(this.q)));
                }
                JSMath.applyScaleFactorToScope(this.d, this.q);
                if (!t(this.j, this.d)) {
                    s(this.f2170a, this.d, "pinch");
                }
            } catch (Exception e) {
                gfh.c("runtime error", e);
            }
        }
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void w(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7befde3c", new Object[]{this, str, map});
        } else {
            A("interceptor", ((Double) map.get("s")).doubleValue(), Collections.singletonMap("interceptor", str));
        }
    }
}
