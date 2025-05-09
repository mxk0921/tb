package tb;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ArrayMap<String, String> sPermissionMapping;

    static {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        sPermissionMapping = arrayMap;
        arrayMap.put("android.permission.READ_CONTACTS", "OP_READ_CONTACTS");
        arrayMap.put(t4p.CAMERA, "OP_CAMERA");
        arrayMap.put("android.permission.WRITE_SETTINGS", "OP_WRITE_SETTINGS");
        arrayMap.put("android.permission.ACCESS_COARSE_LOCATION", "OP_COARSE_LOCATION");
        arrayMap.put(p78.ACCESS_FINE_LOCATION, "OP_FINE_LOCATION");
        arrayMap.put("android.permission.VIBRATE", "OP_VIBRATE");
        arrayMap.put("android.permission.SYSTEM_ALERT_WINDOW", "OP_SYSTEM_ALERT_WINDOW");
        arrayMap.put("android.permission.RECORD_AUDIO", "OP_RECORD_AUDIO");
        arrayMap.put("android.permission.WAKE_LOCK", "OP_WAKE_LOCK");
    }

    public static boolean a(Context context, String[] strArr) {
        Object systemService = context.getSystemService("appops");
        try {
            Class<?> cls = systemService.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("checkOpNoThrow", cls2, cls2, String.class);
            declaredMethod.setAccessible(true);
            for (String str : strArr) {
                String str2 = sPermissionMapping.get(str);
                if (str2 != null) {
                    Field declaredField = systemService.getClass().getDeclaredField(str2);
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(systemService);
                    num.intValue();
                    if (((Integer) declaredMethod.invoke(systemService, num, Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() != 0) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
