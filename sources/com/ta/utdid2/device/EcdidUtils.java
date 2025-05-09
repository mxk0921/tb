package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.utils.FileUtils;
import com.ta.audid.utils.UtdidLogger;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class EcdidUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787128);
    }

    private static Object invokeStaticMethod(Class cls, String str, Object[] objArr, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object invokeStaticMethodByClassName(String str, String str2, Object[] objArr, Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("72834cb9", new Object[]{str, str2, objArr, clsArr});
        }
        try {
            return invokeStaticMethod(Class.forName(str), str2, objArr, clsArr);
        } catch (ClassNotFoundException e) {
            UtdidLogger.se("", e, new Object[0]);
            return null;
        }
    }

    public static String readUtdidFromEcdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f25765ec", new Object[0]);
        }
        String readEcdidUtdidFile = readEcdidUtdidFile();
        if (UTUtdid.isValidUtdid(readEcdidUtdidFile)) {
            return readEcdidUtdidFile;
        }
        sendMessage1();
        return readEcdidUtdidFile();
    }

    public static void sendMessage1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0d0839", new Object[0]);
            return;
        }
        sendMessage(0);
        sendMessage(1);
    }

    public static void sendMessage2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1b1fba", new Object[0]);
            return;
        }
        sendMessage(0);
        sendMessage(2);
    }

    private static String readEcdidUtdidFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25284f68", new Object[0]);
        }
        String ecdidUtdidPath = UtdidKeyFile.getEcdidUtdidPath();
        UtdidLogger.sd("", "readEcdidUtdidFile path", ecdidUtdidPath);
        String readFile = FileUtils.readFile(ecdidUtdidPath);
        UtdidLogger.d("", "readEcdidUtdidFile", readFile);
        return readFile;
    }

    private static String sendMessage(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba0ef6e3", new Object[]{new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Throwable th) {
            UtdidLogger.se("", th, new Object[0]);
        }
        if (i == 0) {
            str = (String) play(0, 2, 72634, Variables.getInstance().getContext());
        } else if (i == 1) {
            str = (String) play(0, 2, 61501799, 130502);
        } else {
            if (i == 2) {
                str = (String) play(0, 2, 4636617, null);
            }
            str = "";
            UtdidLogger.d("", "sendMessage", Integer.valueOf(i), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str;
        }
        UtdidLogger.d("", "sendMessage", Integer.valueOf(i), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return str;
    }

    public static void writeEcdidUtdidFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e375cb", new Object[]{str});
            return;
        }
        String ecdidUtdidPath = UtdidKeyFile.getEcdidUtdidPath();
        UtdidLogger.d("", "writeEcdidUtdidFile", str);
        UtdidLogger.sd("", "writeEcdidUtdidFile path", ecdidUtdidPath);
        FileUtils.saveFile(ecdidUtdidPath, str);
        sendMessage2();
    }

    private static Object play(int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("106192ce", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), obj});
        }
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        Class cls = Integer.TYPE;
        return invokeStaticMethodByClassName("com.alibaba.one.android.sdk.OneMain", "play", objArr, cls, cls, cls, Object.class);
    }
}
