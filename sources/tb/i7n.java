package tb;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import anet.channel.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.ability.msg.QoSLevel;
import tb.e7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i7n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(u7l u7lVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("529c90f2", new Object[]{u7lVar, message})).booleanValue();
        }
        if (k(message)) {
            return false;
        }
        int a2 = QoSLevel.a(u7lVar, message);
        if (a2 == 3 || a2 == 2) {
            return true;
        }
        return false;
    }

    public static void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3d471", new Object[]{message});
        } else {
            message.getData().putBoolean("__msg_when_corrected__", true);
        }
    }

    public static boolean c(String str, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b84c72c", new Object[]{str, message})).booleanValue();
        }
        return d(str, message, "");
    }

    public static boolean e(String str, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78cf09c9", new Object[]{str, message})).booleanValue();
        }
        whh.a("QoScheduler", "handle(what=" + message.what + ", when=" + message.getWhen() + ", type=" + str + f7l.BRACKET_END_STR);
        if (message.getWhen() == 0) {
            whh.a("QoScheduler", "leave(what=" + message.what + ", when=" + message.getWhen() + ", type=" + str + f7l.BRACKET_END_STR);
            return false;
        } else if (m(message)) {
            return false;
        } else {
            if (Dispatchers.TYPE_ACTIVITY.equals(str)) {
                boi.d(message, 35000L);
                b(message);
            } else if (Dispatchers.TYPE_SERVICE.equals(str)) {
                boi.d(message, Constants.RECV_TIMEOUT);
                b(message);
            } else if (Dispatchers.TYPE_RECEIVER.equals(str)) {
                boi.d(message, 80000L);
                b(message);
            }
            whh.a("QoScheduler", "handled(what=" + message.what + ", when=" + message.getWhen() + ", type=" + str + f7l.BRACKET_END_STR);
            return true;
        }
    }

    public static void f(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6b87", new Object[]{message});
            return;
        }
        Bundle data = message.getData();
        data.putBoolean("__sensitive_msg__", true);
        data.putLong("__sensitive_reply_when__", SystemClock.uptimeMillis());
        Runnable callback = message.getCallback();
        if (callback instanceof xio) {
            callback.run();
        } else if (callback instanceof hbp) {
            boi.a(message, "SensitiveRunnable").getCallback().run();
        } else {
            data.putBoolean("__sensitive_reply__", true);
            message.getTarget().dispatchMessage(Message.obtain(message));
            n(message);
            data.remove("__sensitive_reply__");
        }
    }

    public static void g(Looper looper, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc068e4d", new Object[]{looper, str, str2});
        } else {
            h(looper, str, str2, null);
        }
    }

    public static void h(Looper looper, String str, String str2, y80<String> y80Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6960c2", new Object[]{looper, str, str2, y80Var});
            return;
        }
        try {
            x5s x5sVar = new x5s(str);
            looper.dump(x5sVar, str2);
            if (y80Var != null) {
                ((e7n.b) y80Var).a(x5sVar.a());
            }
        } catch (BadParcelableException e) {
            whh.b("QoScheduler", "dumpLooper failed due to:", e);
        } catch (Throwable th) {
            whh.b("QoScheduler", "dumpLooper failed due to other exception:", th);
        }
    }

    public static long i(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d35819a", new Object[]{message})).longValue();
        }
        Bundle peekData = message.peekData();
        if (peekData == null) {
            return -1L;
        }
        return peekData.getLong("__sensitive_replied_when__", -1L);
    }

    public static long j(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77adaa4b", new Object[]{message})).longValue();
        }
        Bundle peekData = message.peekData();
        if (peekData == null) {
            return -1L;
        }
        return peekData.getLong("__sensitive_reply_when__", -1L);
    }

    public static boolean k(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3628f5ad", new Object[]{message})).booleanValue();
        }
        Bundle peekData = message.peekData();
        if (peekData == null || !peekData.getBoolean("__sensitive_msg__")) {
            return false;
        }
        return true;
    }

    public static boolean l(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88ec139", new Object[]{message})).booleanValue();
        }
        Bundle peekData = message.peekData();
        if (peekData == null || !peekData.getBoolean("__sensitive_reply__")) {
            return false;
        }
        return true;
    }

    public static boolean m(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a707a006", new Object[]{message})).booleanValue();
        }
        Bundle peekData = message.peekData();
        if (peekData == null || !peekData.getBoolean("__msg_when_corrected__")) {
            return false;
        }
        return true;
    }

    public static void n(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d2cf17", new Object[]{message});
        } else {
            message.getData().putLong("__sensitive_replied_when__", SystemClock.uptimeMillis());
        }
    }

    public static ce7 o(u7l u7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ce7) ipChange.ipc$dispatch("692c157c", new Object[]{u7lVar});
        }
        if (!boi.sAvailable) {
            whh.a("QoScheduler", "QoScheduler is not supported on this device");
            return null;
        }
        whh.a("QoScheduler", "schedule started");
        try {
            ce7 p = p(u7lVar);
            whh.a("QoScheduler", "schedule finished with report: " + p);
            return p;
        } catch (Throwable th) {
            whh.b("QoScheduler", "schedule failed due to:", th);
            return null;
        }
    }

    public static boolean d(String str, Message message, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9e576f6", new Object[]{str, message, str2})).booleanValue();
        }
        if (!t.a(null, "ngMultiSessionCorrectWhenV2" + str2) || message == null) {
            return false;
        }
        whh.a("QoScheduler", "correct when(tag=" + str2 + ", type=" + str + ", what=" + message.what + f7l.BRACKET_END_STR);
        return e(str, message);
    }

    public static ce7 p(u7l u7lVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ce7) ipChange.ipc$dispatch("1c98d1ff", new Object[]{u7lVar});
        }
        if (!u7lVar.b) {
            return null;
        }
        MessageQueue myQueue = Looper.myQueue();
        long uptimeMillis = SystemClock.uptimeMillis();
        Message b = boi.b(myQueue);
        int i2 = 0;
        while (b != null) {
            i++;
            boolean a2 = a(u7lVar, b);
            Message c = boi.c(b);
            if (a2) {
                whh.a("QoScheduler", "qos sensitive message found: " + b);
                i2++;
                if (u7lVar.c) {
                    f(b);
                }
            }
            b = c;
        }
        return new ce7(i, i2, SystemClock.uptimeMillis() - uptimeMillis);
    }
}
