package com.alibaba.ut.abtest.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import tb.bpm;
import tb.bsq;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ClassUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final char PACKAGE_SEPARATOR_CHAR = '.';

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ClassNotFoundError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        static {
            t2o.a(961544370);
        }

        public ClassNotFoundError(Throwable th) {
            super(th);
        }

        public ClassNotFoundError(String str, Throwable th) {
            super(str, th);
        }
    }

    static {
        t2o.a(961544369);
    }

    public static Class<?> a(String str, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d56ad887", new Object[]{str, classLoader});
        }
        if (classLoader == null) {
            classLoader = ClassUtils.class.getClassLoader();
        }
        try {
            return c(classLoader, str, false);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundError(e);
        }
    }

    public static Class<?> b(String str, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2877d22e", new Object[]{str, classLoader});
        }
        try {
            return a(str, classLoader);
        } catch (ClassNotFoundError e) {
            ogh.h("ClassUtils", "find class fail!", e);
            return null;
        }
    }

    public static Class<?> c(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("63f6de56", new Object[]{classLoader, str, new Boolean(z)});
        }
        try {
            return Class.forName(d(str), z, classLoader);
        } catch (ClassNotFoundException e) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return c(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d19acb", new Object[]{str});
        }
        String c = bsq.c(str);
        bpm.e(c, "className must not be null.");
        if (!c.endsWith(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        while (c.endsWith(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) {
            c = c.substring(0, c.length() - 2);
            sb.append("[");
        }
        sb.append("L");
        sb.append(c);
        sb.append(";");
        return sb.toString();
    }
}
