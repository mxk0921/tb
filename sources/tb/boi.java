package tb;

import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class boi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Field b;
    public static final Field c;
    public static final boolean sAvailable;

    /* renamed from: a  reason: collision with root package name */
    public static final Field f16511a = e(Message.class, "callback");
    public static final Field d = e(Message.class, "when");

    static {
        Field e = e(MessageQueue.class, "mMessages");
        b = e;
        Field e2 = e(Message.class, "next");
        c = e2;
        sAvailable = (e == null || e2 == null) ? false : true;
    }

    public static Message a(Message message, String str) {
        Field field = f16511a;
        if (field == null) {
            return message;
        }
        Runnable callback = message.getCallback();
        if (callback == null) {
            return message;
        }
        try {
            field.set(message, xio.a(str, callback));
        } catch (IllegalAccessException e) {
            whh.b("MessageExtension", "decorateCallback failed due to", e);
        }
        return message;
    }

    public static Message b(MessageQueue messageQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("3018d75", new Object[]{messageQueue});
        }
        return (Message) f(b, messageQueue, null);
    }

    public static Message c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("9e672f35", new Object[]{message});
        }
        return (Message) f(c, message, null);
    }

    public static void d(Message message, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46600e9", new Object[]{message, new Long(j)});
        } else {
            g(d, message, Long.valueOf(message.getWhen() + j));
        }
    }

    public static Field e(Class<?> cls, String str) {
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
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> T f(Field field, Object obj, T t) {
        if (obj == null) {
            return t;
        }
        if (field == null) {
            return t;
        }
        try {
            return (T) field.get(obj);
        } catch (Throwable unused) {
            return t;
        }
    }

    public static void g(Field field, Object obj, Object obj2) {
        if (obj != null) {
            try {
                field.set(obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }
}
