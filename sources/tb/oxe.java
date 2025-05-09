package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oxe extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public oxe(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(oxe oxeVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitArrayMap");
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (!super.d(en8Var) || Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return true;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        try {
            Class<?> cls = Class.forName("android.util.ArrayMap");
            Field declaredField = cls.getDeclaredField("CACHE_SIZE");
            Field declaredField2 = cls.getDeclaredField("mBaseCache");
            Field declaredField3 = cls.getDeclaredField("mBaseCacheSize");
            synchronized (cls) {
                declaredField.setAccessible(true);
                int i = declaredField.getInt(null);
                declaredField2.setAccessible(true);
                declaredField2.set(null, null);
                declaredField3.setAccessible(true);
                declaredField3.set(null, Integer.valueOf(i + 1));
            }
        } catch (Throwable unused) {
        }
    }
}
