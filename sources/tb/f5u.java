package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.biz.touch.ViewListDelegate;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f5u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b(Field field) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            field.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & (-17));
        } catch (Throwable unused) {
        }
    }

    public static boolean a(dft dftVar) {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Field declaredField = cls.getDeclaredField("mViews");
            b(declaredField);
            declaredField.set(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new ViewListDelegate(dftVar));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
