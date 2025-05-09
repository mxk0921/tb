package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArrayMap;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import java.lang.reflect.Field;
import java.util.HashMap;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v74 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29820a;

        public a(Context context) {
            this.f29820a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = this.f29820a;
            if (context != null) {
                v74.g(context, "denyTimestamps");
            }
        }
    }

    static {
        t2o.a(779092098);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09b4e2", new Object[]{str});
        }
        return s3s.a(str);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        return w2s.h(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a643a2", new Object[]{context})).booleanValue();
        }
        return i3s.p(context);
    }

    public static boolean f(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec63827", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        if (TimestampSynchronizer.getServerTime() - j > i * 60000) {
            return true;
        }
        return false;
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a0b883", new Object[]{context, str});
            return;
        }
        if (context != null) {
            vpr.b().a(new a(context));
        }
        HashMap hashMap = new HashMap();
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        obu.a(str, "Deny_Permission", hashMap);
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf99604b", new Object[]{context})).longValue();
        }
        if (context == null) {
            return 0L;
        }
        return context.getSharedPreferences("tbminilive", 0).getLong("denyTimestamps", 0L);
    }

    public static Activity d() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((ArrayMap) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    Activity activity = (Activity) declaredField3.get(obj);
                    if (f3s.m(activity.getComponentName().getClassName())) {
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dba296d", new Object[]{context, str});
        } else if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("tbminilive", 0).edit();
            edit.putLong(str, TimestampSynchronizer.getServerTime());
            edit.apply();
        }
    }
}
