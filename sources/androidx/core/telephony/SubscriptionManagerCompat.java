package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.iq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SubscriptionManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Method sGetSlotIndexMethod;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static int getSlotIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72acb751", new Object[]{new Integer(i)})).intValue();
            }
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    private SubscriptionManagerCompat() {
    }

    public static int getSlotIndex(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return Api29Impl.getSlotIndex(i);
        }
        try {
            if (sGetSlotIndexMethod == null) {
                if (i2 >= 26) {
                    sGetSlotIndexMethod = iq4.a().getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    sGetSlotIndexMethod = iq4.a().getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                sGetSlotIndexMethod.setAccessible(true);
            }
            Integer num = (Integer) sGetSlotIndexMethod.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
