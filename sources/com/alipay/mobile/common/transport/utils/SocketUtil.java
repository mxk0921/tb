package com.alipay.mobile.common.transport.utils;

import android.os.Build;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class f4156a;
    public static Class b;
    public static Class c;
    public static Object d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static Integer j;
    public static Integer k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SndTimeoutInitModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Integer sol_socket = null;
        public Integer so_sndtimeo = null;
        public FileDescriptor fileDescriptor = null;
        public boolean result = false;

        public static SndTimeoutInitModel getInstance(Socket socket) {
            SndTimeoutInitModel sndTimeoutInitModel = new SndTimeoutInitModel();
            if (socket == null) {
                LogCatUtil.warn("SocketUtil", "socket is null");
                return sndTimeoutInitModel;
            } else if (socket.isClosed()) {
                LogCatUtil.warn("SocketUtil", "socket is closed");
                return sndTimeoutInitModel;
            } else {
                Integer access$000 = SocketUtil.access$000();
                sndTimeoutInitModel.sol_socket = access$000;
                if (access$000 == null) {
                    LogCatUtil.warn("SocketUtil", "sol_socket is closed");
                    return sndTimeoutInitModel;
                }
                Integer access$100 = SocketUtil.access$100();
                sndTimeoutInitModel.so_sndtimeo = access$100;
                if (access$100 == null) {
                    LogCatUtil.warn("SocketUtil", "so_sndtimeo is closed");
                    return sndTimeoutInitModel;
                }
                Method access$200 = SocketUtil.access$200(socket.getClass());
                if (access$200 == null) {
                    LogCatUtil.warn("SocketUtil", "getGetFileDescriptorMethod return null");
                    return sndTimeoutInitModel;
                }
                try {
                    FileDescriptor fileDescriptor = (FileDescriptor) access$200.invoke(socket, new Object[0]);
                    sndTimeoutInitModel.fileDescriptor = fileDescriptor;
                    if (fileDescriptor == null) {
                        LogCatUtil.warn("SocketUtil", "fileDescriptor is null");
                        return sndTimeoutInitModel;
                    }
                    sndTimeoutInitModel.result = true;
                    return sndTimeoutInitModel;
                } catch (Throwable th) {
                    LogCatUtil.warn("SocketUtil", "Invoke getFileDescriptor method fail", th);
                    return sndTimeoutInitModel;
                }
            }
        }
    }

    public static final Class a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d842d15", new Object[0]);
        }
        Class cls = f4156a;
        if (cls != null) {
            return cls;
        }
        try {
            f4156a = Class.forName("libcore.io.Libcore");
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getLibcoreClass exception.", th);
            return null;
        }
    }

    public static /* synthetic */ Integer access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4b3756de", new Object[0]);
        }
        return m();
    }

    public static /* synthetic */ Integer access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cf67a3df", new Object[0]);
        }
        return n();
    }

    public static /* synthetic */ Method access$200(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("64261c9a", new Object[]{cls});
        }
        return e(cls);
    }

    public static final Integer c(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cf2562e", new Object[]{socket});
        }
        SndTimeoutInitModel instance = SndTimeoutInitModel.getInstance(socket);
        if (!instance.result) {
            return null;
        }
        return b(instance.fileDescriptor, instance.sol_socket.intValue(), instance.so_sndtimeo.intValue());
    }

    public static Object d(long j2) {
        Method k2 = k();
        if (k2 == null) {
            return null;
        }
        try {
            return k2.invoke(j(), Long.valueOf(j2));
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "invoke fromMillis fail.", th);
            return null;
        }
    }

    public static boolean doSetSndTimeOut(Socket socket, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b588cf", new Object[]{socket, new Long(j2)})).booleanValue();
        }
        SndTimeoutInitModel instance = SndTimeoutInitModel.getInstance(socket);
        if (!instance.result) {
            return false;
        }
        return f(instance.fileDescriptor, instance.sol_socket.intValue(), instance.so_sndtimeo.intValue(), j2);
    }

    public static final Method e(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("f4059049", new Object[]{cls});
        }
        Method method = i;
        if (method != null) {
            return method;
        }
        if (cls == null) {
            LogCatUtil.warn("SocketUtil", "Illegal argument class is null ");
            return null;
        } else if (!Socket.class.isAssignableFrom(cls)) {
            LogCatUtil.warn("SocketUtil", "Illegal argument class: ".concat(cls.getName()));
            return null;
        } else {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getFileDescriptor$", new Class[0]);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable th) {
                LogCatUtil.warn("SocketUtil", "Get getFileDescriptor$ method fail", th);
            }
            return i;
        }
    }

    public static final boolean f(FileDescriptor fileDescriptor, int i2, int i3, long j2) {
        Object d2;
        Method h2 = h();
        if (h2 == null || (d2 = d(j2)) == null) {
            return false;
        }
        try {
            h2.invoke(g(), fileDescriptor, Integer.valueOf(i2), Integer.valueOf(i3), d2);
            return true;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "SetsockoptTimeval fail", th);
            return false;
        }
    }

    public static final Object g() {
        Object obj = d;
        if (obj != null) {
            return obj;
        }
        Class a2 = a();
        if (a2 == null) {
            return null;
        }
        try {
            Field declaredField = a2.getDeclaredField("os");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(a2);
            d = obj2;
            if (obj2 == null) {
                LogCatUtil.warn("SocketUtil", "os get finish , but be null");
            }
            return d;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getOsField fail.", th);
            return null;
        }
    }

    public static final Integer getSndTimeOut(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f58b9e61", new Object[]{socket});
        }
        try {
            if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SET_SND_TIMEOUT_SWITCH, "T")) {
                return c(socket);
            }
            LogCatUtil.info("SocketUtil", "getSndTimeOut. SET_SND_TIMEOUT_SWITCH off");
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getSndTimeOut fail", th);
            return null;
        }
    }

    public static final Class j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8fe80319", new Object[0]);
        }
        Class cls = b;
        if (cls != null) {
            return cls;
        }
        try {
            b = Class.forName("android.system.StructTimeval");
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Classload android.system.StructTimeval fail. SDK_INT:" + Build.VERSION.SDK_INT, th);
        }
        return b;
    }

    public static final Method k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("36ae0131", new Object[0]);
        }
        Method method = g;
        if (method != null) {
            return method;
        }
        Class j2 = j();
        if (j2 == null) {
            return null;
        }
        try {
            Method declaredMethod = j2.getDeclaredMethod("fromMillis", Long.TYPE);
            g = declaredMethod;
            declaredMethod.setAccessible(true);
            return g;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getDeclaredMethod fromMillis fail", th);
            return null;
        }
    }

    public static final Class l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a919ee1b", new Object[0]);
        }
        Class cls = c;
        if (cls != null) {
            return cls;
        }
        try {
            c = Class.forName("android.system.OsConstants");
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Class load OsConstants fail. sdk: " + Build.VERSION.SDK_INT, th);
        }
        return c;
    }

    public static final Integer m() {
        Integer num = j;
        if (num != null) {
            return num;
        }
        Class l = l();
        if (l == null) {
            return -1;
        }
        try {
            Field declaredField = l.getDeclaredField("SOL_SOCKET");
            declaredField.setAccessible(true);
            j = (Integer) declaredField.get(l);
            LogCatUtil.info("SocketUtil", "Get SOL_SOCKET is " + j.intValue());
            return j;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get SOL_SOCKET fail.", th);
            return null;
        }
    }

    public static final Integer n() {
        Integer num = k;
        if (num != null) {
            return num;
        }
        Class l = l();
        if (l == null) {
            return -1;
        }
        try {
            Field declaredField = l.getDeclaredField("SO_SNDTIMEO");
            declaredField.setAccessible(true);
            Integer num2 = (Integer) declaredField.get(l);
            num2.intValue();
            k = num2;
            LogCatUtil.info("SocketUtil", "Get SO_SNDTIMEO is " + k.intValue());
            return k;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get SO_SNDTIMEO fail.", th);
            return null;
        }
    }

    public static final Method o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3960afad", new Object[0]);
        }
        Method method = h;
        if (method != null) {
            return method;
        }
        Class j2 = j();
        if (j2 == null) {
            return null;
        }
        try {
            Method method2 = j2.getMethod("toMillis", new Class[0]);
            h = method2;
            method2.setAccessible(true);
            return h;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "Get toMillis method fail.", th);
            return null;
        }
    }

    public static final Integer b(FileDescriptor fileDescriptor, int i2, int i3) {
        Method o;
        Method i4 = i();
        if (i4 == null || (o = o()) == null) {
            return null;
        }
        try {
            Long l = (Long) o.invoke(i4.invoke(g(), fileDescriptor, Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            LogCatUtil.info("SocketUtil", "getSockoptTimeval is " + l);
            return Integer.valueOf(l.intValue());
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "getSockoptTimeval fail", th);
            return null;
        }
    }

    public static final boolean setSndTimeOut(Socket socket, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edd5715a", new Object[]{socket, new Long(j2)})).booleanValue();
        }
        try {
            if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SET_SND_TIMEOUT_SWITCH, "T")) {
                return doSetSndTimeOut(socket, j2);
            }
            LogCatUtil.info("SocketUtil", "setSndTimeOut. SET_SND_TIMEOUT_SWITCH off");
            return false;
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "setSndTimeOut fail", th);
            return false;
        }
    }

    public static final Method h() {
        Class<?> j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("34a7fe54", new Object[0]);
        }
        Method method = e;
        if (method != null) {
            return method;
        }
        Object g2 = g();
        if (g2 == null || (j2 = j()) == null) {
            return null;
        }
        try {
            Class<?> cls = g2.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method2 = cls.getMethod("setsockoptTimeval", FileDescriptor.class, cls2, cls2, j2);
            e = method2;
            method2.setAccessible(true);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "get setsockoptTimeval method fail.", th);
        }
        return e;
    }

    public static final Method i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3554a9f3", new Object[0]);
        }
        Method method = f;
        if (method != null) {
            return method;
        }
        Object g2 = g();
        if (g2 == null) {
            return null;
        }
        try {
            Class<?> cls = g2.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method2 = cls.getMethod("getsockoptTimeval", FileDescriptor.class, cls2, cls2);
            f = method2;
            method2.setAccessible(true);
        } catch (Throwable th) {
            LogCatUtil.warn("SocketUtil", "get getSockoptTimeval method fail.", th);
        }
        return f;
    }
}
