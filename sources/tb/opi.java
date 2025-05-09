package tb;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class opi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Message EXCEPTION_MSG = new Message();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f25552a;

        static {
            try {
                Field declaredField = MessageQueue.class.getDeclaredField("mMessages");
                f25552a = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception unused) {
            }
        }
    }

    public Message a() {
        MessageQueue queue;
        Field field = a.f25552a;
        if (field == null) {
            return EXCEPTION_MSG;
        }
        Message message = EXCEPTION_MSG;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return message;
            }
            queue = Looper.getMainLooper().getQueue();
            return (Message) field.get(queue);
        } catch (Exception unused) {
            return message;
        }
    }
}
