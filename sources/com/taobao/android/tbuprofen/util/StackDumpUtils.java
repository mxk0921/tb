package com.taobao.android.tbuprofen.util;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;
import tb.urr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StackDumpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Method f9630a;
    public static final Field b;
    public static final Field c;
    public static final Field d;
    public static final Method e;
    public static final Method f;
    public static final ConcurrentHashMap<Long, a> g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onError(int i);
    }

    public static Object[] a(Thread thread) {
        Method method = f9630a;
        if (method == null) {
            return null;
        }
        try {
            return (Object[]) method.invoke(null, thread);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static StackTraceElement[] b(int i) {
        Method method = e;
        if (method != null && i >= 0) {
            try {
                return (StackTraceElement[]) method.invoke(null, Integer.valueOf(i));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static int c(long j) {
        Method method = f;
        if (method == null) {
            return -1;
        }
        try {
            return d((byte[]) method.invoke(null, new Object[0]), j);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static int d(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52a911ef", new Object[]{bArr, new Long(j)})).intValue();
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        while (wrap.remaining() >= 14) {
            int i = wrap.getInt();
            wrap.get();
            int i2 = wrap.getInt();
            wrap.getInt();
            wrap.getInt();
            wrap.get();
            if (i2 == j) {
                return i;
            }
        }
        return -1;
    }

    public static native String[] dumpAllNativeStacks();

    public static native String[] dumpNativeStacks(int[] iArr);

    public static native String[] dumpNativeStacksWithSignal(int[] iArr);

    public static native Object[] dumpRawStackTraceSafely(Thread thread, boolean z);

    public static String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91f63cf7", new Object[]{obj});
        }
        return String.format("- waiting to lock <0x%08x> (a %s)", Integer.valueOf(System.identityHashCode(obj)), obj.getClass().getName());
    }

    public static String f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31cca70c", new Object[]{obj});
        }
        return String.format("- locked <0x%08x> (a %s)", Integer.valueOf(System.identityHashCode(obj)), obj.getClass().getName());
    }

    public static native int[] findTidByName(String[] strArr);

    public static native boolean fixThreadStackDumpTimeout(long j);

    public static Queue<String> g(String str, Object[] objArr) {
        Object[] objArr2;
        Object obj;
        if (objArr == null) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (str != null) {
                linkedList.add(str.concat(" annotated stack trace:"));
            }
            for (Object obj2 : objArr) {
                StackTraceElement stackTraceElement = (StackTraceElement) b.get(obj2);
                Field field = c;
                if (field != null) {
                    objArr2 = (Object[]) field.get(obj2);
                } else {
                    objArr2 = null;
                }
                Field field2 = d;
                if (field2 != null) {
                    obj = field2.get(obj2);
                } else {
                    obj = null;
                }
                linkedList.offer("    at " + stackTraceElement);
                if (obj != null) {
                    linkedList.offer("    " + e(obj));
                }
                if (objArr2 != null) {
                    for (Object obj3 : objArr2) {
                        linkedList.offer("    " + f(obj3));
                    }
                }
            }
            return linkedList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Queue<String> h(String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("3c5daabe", new Object[]{str, objArr});
        }
        if (objArr == null) {
            return null;
        }
        if (StackTraceElement.class.equals(objArr.getClass().getComponentType())) {
            return i(str, (StackTraceElement[]) objArr);
        }
        return g(str, objArr);
    }

    public static Queue<String> i(String str, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("df99aa54", new Object[]{str, stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (str != null) {
                linkedList.add(str.concat(" stack trace:"));
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                linkedList.offer("    at " + stackTraceElement);
            }
            return linkedList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String j(Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c24f72e4", new Object[]{queue});
        }
        if (queue == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (String str : queue) {
            printWriter.println(str);
        }
        return stringWriter.toString();
    }

    public static StackTraceElement[] k(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        try {
            if (StackTraceElement.class.equals(objArr.getClass().getComponentType())) {
                return (StackTraceElement[]) objArr;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArr) {
                arrayList.add((StackTraceElement) b.get(obj));
            }
            return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public static boolean l(long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85cdfe", new Object[]{new Long(j), aVar})).booleanValue();
        }
        boolean fixThreadStackDumpTimeout = fixThreadStackDumpTimeout(j);
        if (fixThreadStackDumpTimeout) {
            g.put(Long.valueOf(j), aVar);
        }
        return fixThreadStackDumpTimeout;
    }

    public static void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18a8acc", new Object[]{new Long(j)});
            return;
        }
        g.remove(Long.valueOf(j));
        removeThreadStackDumpTimeout(j);
    }

    private static void onDumpError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab868f27", new Object[]{new Integer(i)});
            return;
        }
        a aVar = g.get(Long.valueOf(Process.myTid()));
        if (aVar != null) {
            aVar.onError(i);
        }
    }

    public static native void removeThreadStackDumpTimeout(long j);

    public static Object[] dumpRawStackTrace(Thread thread, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("3229020c", new Object[]{thread, new Boolean(z)});
        }
        if (z) {
            int myPid = Process.myPid();
            int c2 = c(myPid);
            if (c2 != -1) {
                return b(c2);
            }
            urr.b("StackDumpUtils", "mainTid = " + myPid + ", mainThreadId = -1", new Object[0]);
            return null;
        }
        Object[] a2 = a(thread);
        return a2 == null ? thread.getStackTrace() : a2;
    }

    static {
        t2o.a(822083610);
        f9630a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        if (Build.VERSION.SDK_INT >= 28) {
            f9630a = ReflectUtils.e("dalvik.system.VMStack", "getAnnotatedThreadStackTrace", Thread.class);
            b = ReflectUtils.d("dalvik.system.AnnotatedStackTraceElement", "stackTraceElement");
            c = ReflectUtils.d("dalvik.system.AnnotatedStackTraceElement", "heldLocks");
            d = ReflectUtils.d("dalvik.system.AnnotatedStackTraceElement", "blockedOn");
        }
        e = ReflectUtils.e("org.apache.harmony.dalvik.ddmc.DdmVmInternal", "getStackTraceById", Integer.TYPE);
        f = ReflectUtils.e("org.apache.harmony.dalvik.ddmc.DdmVmInternal", "getThreadStats", new Class[0]);
        g = new ConcurrentHashMap<>();
    }
}
