package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import com.taobao.android.alinnkit.alinn.AliNNNetNative;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f30850a;
    public static Constructor b;

    static {
        t2o.a(482344982);
    }

    public static AliNNNetInstance a(String str) {
        try {
            Long l = (Long) f30850a.invoke(null, str);
            l.longValue();
            return (AliNNNetInstance) b.newInstance(l);
        } catch (Exception unused) {
            return null;
        }
    }

    public static AliNNNetInstance b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("fd5f70e9", new Object[]{context, str, str2});
        }
        if (f30850a == null) {
            try {
                Method declaredMethod = AliNNNetNative.class.getDeclaredMethod("nativeCreateNetFromFile", String.class);
                f30850a = declaredMethod;
                declaredMethod.setAccessible(true);
                Constructor declaredConstructor = AliNNNetInstance.class.getDeclaredConstructor(Long.TYPE);
                b = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (Exception unused) {
            }
        }
        if (f30850a == null || b == null) {
            return AliNNNetInstance.d(context, str, str2);
        }
        AliNNNetInstance a2 = a(str);
        return a2 == null ? AliNNNetInstance.d(context, str, str2) : a2;
    }
}
