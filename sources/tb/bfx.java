package tb;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bfx implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f16361a;
    public final GestureDetector b;
    public final ScaleGestureDetector c;

    static {
        t2o.a(404750633);
    }

    public bfx(Window.Callback callback, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        this.f16361a = callback;
        this.b = gestureDetector;
        this.c = scaleGestureDetector;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        ScaleGestureDetector scaleGestureDetector;
        GestureDetector gestureDetector;
        if ("dispatchTouchEvent".equals(method.getName())) {
            boolean g = v6a.i().g();
            if (g && (gestureDetector = this.b) != null && objArr != null && objArr.length >= 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof MotionEvent) {
                    gestureDetector.onTouchEvent((MotionEvent) obj2);
                }
            }
            if (g && (scaleGestureDetector = this.c) != null && objArr != null && objArr.length >= 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof MotionEvent) {
                    scaleGestureDetector.onTouchEvent((MotionEvent) obj3);
                }
            }
        }
        return method.invoke(this.f16361a, objArr);
    }
}
