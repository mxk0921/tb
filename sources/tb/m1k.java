package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class m1k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Field f23718a;

    static {
        t2o.a(481297442);
    }

    public static final void a() {
        if (f23718a == null) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                f23718a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception unused) {
            }
        }
        try {
            Field field = f23718a;
            if (field != null) {
                field.set(null, Float.valueOf(1.0f));
            }
        } catch (Exception unused2) {
        }
    }
}
