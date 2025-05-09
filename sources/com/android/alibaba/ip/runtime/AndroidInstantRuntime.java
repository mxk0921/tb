package com.android.alibaba.ip.runtime;

import com.android.alibaba.ip.common.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AndroidInstantRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(493879313);
    }

    private static Field getField(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("90de8d19", new Object[]{cls, str});
        }
        Field fieldByName = getFieldByName(cls, str);
        if (fieldByName != null) {
            fieldByName.setAccessible(true);
            return fieldByName;
        }
        throw new RuntimeException(new NoSuchElementException(str));
    }

    private static Field getFieldByName(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("dd32a037", new Object[]{cls, str});
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (cls == null && arrayList.size() <= 0) {
                return null;
            }
            if (cls != null) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    return ((Class) it.next()).getDeclaredField(str);
                } catch (NoSuchFieldException unused2) {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(Arrays.asList(((Class) it2.next()).getInterfaces()));
            }
            if (cls != null) {
                arrayList2.addAll(Arrays.asList(cls.getInterfaces()));
                cls = cls.getSuperclass();
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
    }

    private static Method getMethodByName(Class<?> cls, String str, Class[] clsArr) {
        Log.Logging logging;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("82e9fa4f", new Object[]{cls, str, clsArr});
        }
        if (cls == null) {
            return null;
        }
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
                if (!(cls == null || (logging = Log.logging) == null)) {
                    Level level = Level.FINE;
                    if (logging.isLoggable(level)) {
                        Log.Logging logging2 = Log.logging;
                        String name = cls.getName();
                        logging2.log(level, "getMethodByName:Looking in " + name + " now");
                    }
                }
            }
        }
        return null;
    }

    public static Object getPrivateField(Object obj, Class cls, String str) {
        String str2;
        try {
            return getField(cls, str).get(obj);
        } catch (IllegalAccessException e) {
            Log.Logging logging = Log.logging;
            if (logging != null) {
                Level level = Level.SEVERE;
                if (obj == null) {
                    str2 = " static";
                } else {
                    str2 = "";
                }
                logging.log(level, String.format("Exception during%1$s getField %2$s", str2, str), e);
            }
            throw new RuntimeException(e);
        }
    }

    public static Object getStaticPrivateField(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1568b90d", new Object[]{cls, str});
        }
        return getPrivateField(null, cls, str);
    }

    public static Object invokeProtectedStaticMethod(Object[] objArr, Class[] clsArr, String str, Class cls) throws Throwable {
        Log.Logging logging = Log.logging;
        if (logging != null) {
            Level level = Level.FINE;
            if (logging.isLoggable(level)) {
                Log.Logging logging2 = Log.logging;
                String name = cls.getName();
                logging2.log(level, "protectedStaticMethod:" + str + " on " + name);
            }
        }
        try {
            Method methodByName = getMethodByName(cls, str, clsArr);
            if (methodByName != null) {
                methodByName.setAccessible(true);
                return methodByName.invoke(null, objArr);
            }
            throw new RuntimeException(new NoSuchMethodException(str + " in class " + cls.getName()));
        } catch (IllegalAccessException e) {
            Log.Logging logging3 = Log.logging;
            if (logging3 != null) {
                Level level2 = Level.SEVERE;
                logging3.log(level2, "Exception while invoking " + str, e);
            }
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static <T> T newForClass(Object[] objArr, Class[] clsArr, Class<T> cls) throws Throwable {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            try {
                return cls.cast(declaredConstructor.newInstance(objArr));
            } catch (IllegalAccessException e) {
                Log.Logging logging = Log.logging;
                if (logging != null) {
                    Level level = Level.SEVERE;
                    logging.log(level, "Exception while instantiating " + cls, e);
                }
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                Log.Logging logging2 = Log.logging;
                if (logging2 != null) {
                    Level level2 = Level.SEVERE;
                    logging2.log(level2, "Exception while instantiating " + cls, e2);
                }
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (NoSuchMethodException e4) {
            if (Log.logging != null) {
                Log.logging.log(Level.SEVERE, "Exception while resolving constructor", e4);
            }
            throw new RuntimeException(e4);
        }
    }

    public static void setLogger(final Logger logger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1d2e28", new Object[]{logger});
        } else {
            Log.logging = new Log.Logging() { // from class: com.android.alibaba.ip.runtime.AndroidInstantRuntime.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.android.alibaba.ip.common.Log.Logging
                public boolean isLoggable(Level level) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("193a3bc3", new Object[]{this, level})).booleanValue();
                    }
                    return logger.isLoggable(level);
                }

                @Override // com.android.alibaba.ip.common.Log.Logging
                public void log(Level level, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b26a33ac", new Object[]{this, level, str});
                    } else {
                        logger.log(level, str);
                    }
                }

                @Override // com.android.alibaba.ip.common.Log.Logging
                public void log(Level level, String str, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee5503c9", new Object[]{this, level, str, th});
                    } else {
                        logger.log(level, str, th);
                    }
                }
            };
        }
    }

    public static void setPrivateField(Object obj, Object obj2, Class cls, String str) {
        try {
            getField(cls, str).set(obj, obj2);
        } catch (IllegalAccessException e) {
            Log.Logging logging = Log.logging;
            if (logging != null) {
                Level level = Level.SEVERE;
                logging.log(level, "Exception during setPrivateField " + str, e);
            }
            throw new RuntimeException(e);
        }
    }

    public static void setStaticPrivateField(Object obj, Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f535d", new Object[]{obj, cls, str});
        } else {
            setPrivateField(null, obj, cls, str);
        }
    }

    public static void trace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d6ba16", new Object[]{str});
            return;
        }
        Log.Logging logging = Log.logging;
        if (logging != null) {
            logging.log(Level.FINE, str);
        }
    }

    public static Object invokeProtectedMethod(Object obj, Object[] objArr, Class[] clsArr, String str) throws Throwable {
        Log.Logging logging = Log.logging;
        if (logging != null) {
            Level level = Level.FINE;
            if (logging.isLoggable(level)) {
                Log.logging.log(level, String.format("protectedMethod:%s on %s", str, obj));
            }
        }
        try {
            Method methodByName = getMethodByName(obj.getClass(), str, clsArr);
            if (methodByName != null) {
                methodByName.setAccessible(true);
                return methodByName.invoke(obj, objArr);
            }
            throw new RuntimeException(new NoSuchMethodException(str));
        } catch (IllegalAccessException e) {
            Log.Logging logging2 = Log.logging;
            if (logging2 != null) {
                Level level2 = Level.SEVERE;
                logging2.log(level2, "Exception while invoking " + str, e);
            }
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void trace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c5ca60", new Object[]{str, str2});
            return;
        }
        Log.Logging logging = Log.logging;
        if (logging != null) {
            Level level = Level.FINE;
            logging.log(level, str + " " + str2);
        }
    }

    public static void trace(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30511c2a", new Object[]{str, str2, str3});
            return;
        }
        Log.Logging logging = Log.logging;
        if (logging != null) {
            Level level = Level.FINE;
            logging.log(level, str + " " + str2 + " " + str3);
        }
    }

    public static void trace(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b4f74", new Object[]{str, str2, str3, str4});
            return;
        }
        Log.Logging logging = Log.logging;
        if (logging != null) {
            Level level = Level.FINE;
            logging.log(level, str + " " + str2 + " " + str3 + " " + str4);
        }
    }
}
