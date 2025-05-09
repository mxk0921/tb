package tb;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class afx implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f15718a;
    public final List<a> b = new ArrayList(2);
    public final List<b> c = new ArrayList(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(int i, float f, float f2, long j);

        void dispatchKeyEvent(KeyEvent keyEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onWindowFocusChanged(boolean z);
    }

    public afx(Window.Callback callback) {
        this.f15718a = callback;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc57aad3", new Object[]{this, aVar});
        } else if (!((ArrayList) this.b).contains(aVar)) {
            ((ArrayList) this.b).add(aVar);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4664696b", new Object[]{this, bVar});
        } else if (!((ArrayList) this.c).contains(bVar)) {
            ((ArrayList) this.c).add(bVar);
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c51bcfa", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.b).remove(aVar);
        }
    }

    public final float d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("239c87b", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX();
        } catch (IllegalArgumentException e) {
            zq6.a("WindowCallbackProxy", e);
            return -1.0f;
        }
    }

    public final float e(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("172290bc", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY();
        } catch (IllegalArgumentException e) {
            zq6.a("WindowCallbackProxy", e);
            return -1.0f;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        InvocationTargetException e;
        String name = method.getName();
        boolean equals = "dispatchTouchEvent".equals(name);
        List<a> list = this.b;
        if (equals) {
            if (objArr != null && objArr.length >= 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof MotionEvent) {
                    MotionEvent motionEvent = (MotionEvent) obj2;
                    int action = motionEvent.getAction();
                    float d = d(motionEvent);
                    float e2 = e(motionEvent);
                    long a2 = out.a();
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (d > 0.0f && e2 > 0.0f) {
                            aVar.a(action, d, e2, a2);
                        }
                    }
                }
            }
        } else if ("dispatchKeyEvent".equals(name)) {
            if (objArr != null && objArr.length >= 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof KeyEvent) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).dispatchKeyEvent((KeyEvent) obj3);
                    }
                }
            }
        } else if ("onWindowFocusChanged".equals(name) && objArr != null && objArr.length >= 1) {
            Object obj4 = objArr[0];
            if (obj4 instanceof Boolean) {
                Iterator it3 = ((ArrayList) this.c).iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).onWindowFocusChanged(((Boolean) obj4).booleanValue());
                }
            }
        }
        try {
            try {
                return method.invoke(this.f15718a, objArr);
            } catch (InvocationTargetException e3) {
                e = e3;
                if ("dispatchTouchEvent".equals(name) && (method.getReturnType().equals(Boolean.TYPE) || method.getReturnType().equals(Boolean.class))) {
                    return Boolean.FALSE;
                }
                throw e.getTargetException();
            }
        } catch (InvocationTargetException e4) {
            e = e4;
        }
    }
}
