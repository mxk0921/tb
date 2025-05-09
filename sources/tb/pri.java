package tb;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.util.ReflectUtils;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pri {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIND_APPLICATION = 110;
    public static final int BIND_SERVICE = 121;
    public static final int CREATE_SERVICE = 114;
    public static final int EXECUTE_TRANSACTION = 159;
    public static final int RECEIVER = 113;
    public static final int SERVICE_ARGS = 115;

    /* renamed from: a  reason: collision with root package name */
    public static Field f26256a = null;
    public static Field b = null;
    public static Field c = null;
    public static volatile boolean d = false;
    public static volatile boolean e = false;

    static {
        t2o.a(824180773);
    }

    public static String a(Object obj) {
        Intent intent;
        try {
            if (!d) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            Object obj2 = b.get(obj);
            Object obj3 = f26256a.get(obj);
            if (obj3 != null) {
                for (Object obj4 : (List) obj3) {
                    String simpleName = obj4.getClass().getSimpleName();
                    sb.append(simpleName);
                    if (ProcessInfo.LAUNCH_ACTIVITY_ITEM.equals(simpleName) && (intent = (Intent) c.get(obj4)) != null) {
                        sb.append(f7l.BRACKET_START_STR);
                        sb.append(intent);
                        sb.append(") -> ");
                    }
                }
            }
            if (obj2 != null) {
                sb.append(obj2.getClass().getSimpleName());
            }
            return sb.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "null";
        }
    }

    public static MessageQueue b() {
        MessageQueue queue;
        if (Build.VERSION.SDK_INT >= 23) {
            queue = Looper.getMainLooper().getQueue();
            return queue;
        }
        Field c2 = ReflectUtils.c(Looper.class, "mQueue");
        if (c2 != null) {
            try {
                return (MessageQueue) c2.get(Looper.getMainLooper());
            } catch (IllegalAccessException e2) {
                urr.c("MessageTool", e2, "exception", new Object[0]);
            }
        }
        return null;
    }

    public static String d(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efbf87a3", new Object[]{obj, new Integer(i)});
        }
        if (e && Build.VERSION.SDK_INT >= 28 && obj != null) {
            try {
                if (i != 121) {
                    if (i == 159) {
                        return a(obj);
                    }
                    switch (i) {
                    }
                }
                return obj.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!e) {
            try {
                try {
                    Class<?> cls = Class.forName("android.app.servertransaction.ClientTransaction");
                    f26256a = ReflectUtils.c(cls, "mActivityCallbacks");
                    b = ReflectUtils.c(cls, "mLifecycleStateRequest");
                    Field c2 = ReflectUtils.c(Class.forName("android.app.servertransaction.LaunchActivityItem"), "mIntent");
                    c = c2;
                    if (!(f26256a == null || b == null || c2 == null)) {
                        d = true;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } finally {
                e = true;
            }
        }
    }

    public static boolean f(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fa91c2c", new Object[]{message})).booleanValue();
        }
        if (message == null || message.getTarget() == null) {
            return false;
        }
        return "android.app.ActivityThread$H".equals(message.getTarget().getClass().getName());
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e68d45e3", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("android.app.ActivityThread$H");
    }

    public static String c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("951c9487", new Object[]{new Integer(i), obj});
        }
        if (obj == null) {
            return null;
        }
        if (i == 3) {
            return (String) obj;
        }
        if (i != 1) {
            return null;
        }
        Message message = (Message) obj;
        StringBuilder sb = new StringBuilder();
        Handler target = message.getTarget();
        Runnable callback = message.getCallback();
        if (target != null) {
            sb.append("target: ");
            sb.append(target.getClass().getName());
            sb.append(" ");
        }
        if (callback != null) {
            sb.append("callback: ");
            sb.append(callback.getClass().getName());
        }
        return sb.toString();
    }
}
