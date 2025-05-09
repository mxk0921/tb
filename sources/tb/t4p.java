package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class t4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAMERA = "android.permission.CAMERA";
    public static final String RECORD_AUDIO = "android.permission.RECORD_AUDIO";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f28491a;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f28491a = arrayMap;
        arrayMap.put(CAMERA, "OP_CAMERA");
        arrayMap.put("android.permission.RECORD_AUDIO", "OP_RECORD_AUDIO");
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a6dca8d", new Object[]{context, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return b(context, str);
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        int i;
        Method declaredMethod;
        String str2;
        Object systemService = context.getSystemService("appops");
        try {
            Class<?> cls = systemService.getClass();
            Class<?> cls2 = Integer.TYPE;
            declaredMethod = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class);
            declaredMethod.setAccessible(true);
            str2 = f28491a.get(str);
        } catch (Exception unused) {
            Log.e("SearchPermissionUtil", "check permission error");
            i = -1;
        }
        if (str2 == null) {
            return false;
        }
        Field declaredField = systemService.getClass().getDeclaredField(str2);
        declaredField.setAccessible(true);
        Integer num = (Integer) declaredField.get(systemService);
        num.intValue();
        i = ((Integer) declaredMethod.invoke(systemService, num, Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue();
        if (i == 0) {
            return true;
        }
        return false;
    }
}
