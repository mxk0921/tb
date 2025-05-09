package tb;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ScheduleComposer a(sgg sggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleComposer) ipChange.ipc$dispatch("5d45e132", new Object[]{sggVar});
        }
        whh.a("ScheduleComposerFactory", "using NGNextScheduleComposer");
        return new ghj(sggVar);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return a.c();
    }

    public static int c() {
        MessageQueue queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f37e5d9a", new Object[0])).intValue();
        }
        w35.a("LAUNCH_POST_SYNC_BARRIER");
        queue = Looper.getMainLooper().getQueue();
        int intValue = ((Integer) e(queue, 0)).intValue();
        whh.a("ScheduleComposerFactory", "obtained token: " + intValue);
        w35.c();
        return intValue;
    }

    public static void d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa684095", new Object[]{str, str2, new Integer(i)});
            return;
        }
        AppMonitor.Counter.commit(erj.MODULE, "ScheduleComposerFactory", "pageName=" + str + ",stage=" + str2 + ",state=" + i, 1.0d);
        StringBuilder sb = new StringBuilder("event ");
        sb.append(str2);
        sb.append(" received, something went wrong, current composer state is: ");
        sb.append(i);
        whh.a("ScheduleComposerFactory", sb.toString());
    }

    public static <T> T e(MessageQueue messageQueue, T t) {
        if (a.a() != null) {
            try {
                return (T) a.a().invoke(messageQueue, new Object[0]);
            } catch (Throwable th) {
                whh.b("ScheduleComposerFactory", "postSyncBarrier error occurred:", th);
                return t;
            }
        } else {
            throw new IllegalStateException("PostSyncBarrier is null");
        }
    }

    public static void f(int i) {
        MessageQueue queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba12f518", new Object[]{new Integer(i)});
        } else if (i >= 0) {
            w35.a("LAUNCH_REMOVE_SYNC_BARRIER");
            queue = Looper.getMainLooper().getQueue();
            g(queue, i);
            whh.a("ScheduleComposerFactory", "released token: " + i);
            w35.c();
        } else {
            throw new IllegalStateException("this token is illegal, please check");
        }
    }

    public static void g(MessageQueue messageQueue, int i) {
        if (a.b() != null) {
            try {
                a.b().invoke(messageQueue, Integer.valueOf(i));
            } catch (Throwable th) {
                whh.b("ScheduleComposerFactory", "removeSyncBarrier error occurred:", th);
            }
        } else {
            throw new IllegalStateException("RemoveSyncBarrier is null");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Method f28265a;
        public static final Method b;

        public static /* synthetic */ Method a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Method) ipChange.ipc$dispatch("25154ae7", new Object[0]);
            }
            return f28265a;
        }

        public static /* synthetic */ Method b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Method) ipChange.ipc$dispatch("ad458ac6", new Object[0]);
            }
            return b;
        }

        public static boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
            }
            if (f28265a == null || b == null) {
                return false;
            }
            return true;
        }

        static {
            try {
                Method declaredMethod = MessageQueue.class.getDeclaredMethod("postSyncBarrier", new Class[0]);
                declaredMethod.setAccessible(true);
                f28265a = declaredMethod;
                Method declaredMethod2 = MessageQueue.class.getDeclaredMethod("removeSyncBarrier", Integer.TYPE);
                declaredMethod2.setAccessible(true);
                b = declaredMethod2;
            } catch (Throwable th) {
                whh.b("ScheduleComposerFactory", "LazyHolder init error occurred:", th);
            }
        }
    }
}
