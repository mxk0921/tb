package tb;

import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f32387a;

    static {
        try {
            f32387a = Class.forName("com.android.internal.policy.DecorView");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(View view, dft dftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d8c4e6e", new Object[]{view, dftVar})).booleanValue();
        }
        if (!f32387a.isInstance(view)) {
            return false;
        }
        try {
            b(view, dftVar);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void b(View view, dft dftVar) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cls = f32387a;
        if (cls != null) {
            Field declaredField = cls.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            Window window = (Window) declaredField.get(view);
            window.setCallback(new yex(window.getCallback(), new q6a(view.getContext(), new s6a(dftVar))));
        }
    }
}
