package tb;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class biq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WHAT_BIND_SERVICE = 121;
    public static final int WHAT_CREATE_SERVICE = 114;
    public static final int WHAT_LAUNCH_ACTIVITY = 100;
    public static final int WHAT_LAUNCH_ACTIVITY_HIGHER = 159;
    public static final int WHAT_RECEIVER = 113;
    public static final int WHAT_SERVICE_ARGS = 115;

    /* renamed from: a  reason: collision with root package name */
    public static final Field f16413a = d(MessageQueue.class, "mMessages");
    public static final Field b = d(Message.class, "next");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static final biq param = biq.a();
    }

    public static biq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (biq) ipChange.ipc$dispatch("c3ac96d4", new Object[0]);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return new diq();
        }
        return new ciq();
    }

    public static xhq c() {
        try {
            for (Message message = (Message) f16413a.get(Looper.myQueue()); message != null; message = (Message) b.get(message)) {
                xhq b2 = a.param.b(message);
                if (b2 != null && b2.f31405a) {
                    return b2;
                }
                if (b2 != null) {
                    return b2;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field d(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("1dab24cc", new Object[]{cls, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T e(Field field, Object obj, T t) {
        if (field == null) {
            return t;
        }
        try {
            return (T) field.get(obj);
        } catch (IllegalAccessException unused) {
            return t;
        }
    }

    public xhq b(Message message) throws IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("3112a080", new Object[]{this, message});
        }
        int i = message.what;
        if (i != 121 && i != 114 && i != 115 && i != 113) {
            return null;
        }
        try {
            return new xhq(message.obj.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field f(Class<?> cls, String str) {
        Field field = null;
        if (cls != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                } else {
                    field = cls.getDeclaredField(str);
                }
                if (field != null) {
                    field.setAccessible(true);
                }
            }
        }
        return field;
    }
}
