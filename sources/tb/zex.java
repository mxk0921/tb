package tb;

import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zex implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f32715a;

    public zex(Window.Callback callback) {
        this.f32715a = callback;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return method.invoke(this.f32715a, objArr);
        } catch (InvocationTargetException e) {
            if ("dispatchTouchEvent".equals(method.getName()) && (method.getReturnType().equals(Boolean.TYPE) || method.getReturnType().equals(Boolean.class))) {
                return Boolean.FALSE;
            }
            throw e.getTargetException();
        }
    }
}
