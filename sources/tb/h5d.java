package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import com.taobao.atools.StaticHook;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h5d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IPCUtils";
    public static final List<ProviderInfo> b = new CopyOnWriteArrayList();
    public static final ConcurrentHashMap<String, Uri> c = new ConcurrentHashMap<>();
    public static String d;
    public static ActivityManager e;
    public static Field f;
    public static Field g;
    public static Method h;

    static {
        t2o.a(393216098);
    }

    public static Method a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("19b34395", new Object[0]);
        }
        if (h == null) {
            Method g2 = StaticHook.g(ContentResolver.class, Constants.ACQUIRE_UNSTABLE_PROVIDER, Uri.class);
            h = g2;
            g2.setAccessible(true);
        }
        return h;
    }

    public static void b(ComponentName componentName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5757e7c1", new Object[]{componentName, str});
        } else if (componentName != null && !TextUtils.isEmpty(str)) {
            c.put(componentName.toShortString(), e(str));
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9726416e", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(64) + 1);
    }

    public static ServiceConnection d(Object obj) {
        try {
            if (f == null) {
                Field i = StaticHook.i(obj.getClass(), "mDispatcher");
                f = i;
                i.setAccessible(true);
            }
            Object obj2 = ((WeakReference) f.get(obj)).get();
            if (obj2 != null) {
                if (g == null) {
                    Field i2 = StaticHook.i(obj2.getClass(), "mConnection");
                    g = i2;
                    i2.setAccessible(true);
                }
                return (ServiceConnection) g.get(obj2);
            }
        } catch (Throwable th) {
            b5d.h(TAG, "getConnectionFromServiceDispatcher err", th, new Object[0]);
        }
        b5d.i(TAG, "getConnectionFromServiceDispatcher, return null", new Object[0]);
        return null;
    }

    public static Uri e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("7fc53e26", new Object[]{str});
        }
        return Uri.parse("content://" + str);
    }

    public static String f() {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c98702", new Object[0]);
        }
        if (TextUtils.isEmpty(d)) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                d = processName;
            } else {
                d = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(d)) {
                d = h(Process.myPid());
            }
        }
        return d;
    }

    public static boolean g(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88448fc0", new Object[]{context, new Integer(i)})).booleanValue();
        }
        String packageName = context.getPackageName();
        boolean[] l = l(packageName, context.getPackageName() + ":channel");
        if (l != null && l.length == 2) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return l[1] ^ l[0];
                    }
                } else if (l[0] || l[1]) {
                    return true;
                } else {
                    return false;
                }
            } else if (!l[0] || !l[1]) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static String h(int i) {
        Throwable th;
        Exception e2;
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e23fa28", new Object[]{new Integer(i)});
        }
        if (e == null) {
            e = (ActivityManager) re.r().getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e2 = e3;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                readLine = readLine.trim();
            }
            try {
                bufferedReader.close();
            } catch (IOException e4) {
                Log.e(TAG, "getProcessName close is fail. exception=", e4);
            }
            return readLine;
        } catch (Exception e5) {
            e2 = e5;
            bufferedReader2 = bufferedReader;
            Log.e(TAG, "getProcessName read is fail. exception=", e2);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e6) {
                    Log.e(TAG, "getProcessName close is fail. exception=", e6);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e7) {
                    Log.e(TAG, "getProcessName close is fail. exception=", e7);
                }
            }
            throw th;
        }
    }

    public static String i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e985ade", new Object[]{uri});
        }
        Iterator it = ((CopyOnWriteArrayList) b).iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = (ProviderInfo) it.next();
            if (e(providerInfo.authority).equals(uri)) {
                return providerInfo.processName;
            }
        }
        return null;
    }

    public static int j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e545308", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null) {
            return i;
        }
        int lastIndexOf = str.lastIndexOf(64);
        if (lastIndexOf == -1) {
            return i;
        }
        try {
            return Integer.parseInt(str.substring(0, lastIndexOf));
        } catch (NumberFormatException unused) {
            return -10000;
        }
    }

    public static boolean k(ComponentName componentName) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e38ce24", new Object[]{componentName})).booleanValue();
        }
        try {
            m();
            Iterator it = ((CopyOnWriteArrayList) b).iterator();
            str = "";
            while (it.hasNext()) {
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                if (providerInfo.name.equals(componentName.getClassName())) {
                    str = providerInfo.processName;
                }
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (e == null) {
            e = (ActivityManager) re.r().getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(str)) {
                return true;
            }
        }
        if (!g.a()) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(componentName.getPackageName(), xd0.channelService));
            return re.r().stopService(intent);
        }
        return false;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("478f2ce3", new Object[0]);
            return;
        }
        List<ProviderInfo> list = b;
        try {
            if (((CopyOnWriteArrayList) list).isEmpty()) {
                try {
                    Context r = re.r();
                    Collections.addAll(list, r.getPackageManager().getPackageInfo(r.getPackageName(), 8).providers);
                    b5d.i(TAG, "loadProviders", "size", Integer.valueOf(((CopyOnWriteArrayList) list).size()), "sProviderInfoList", list);
                    if (!((CopyOnWriteArrayList) list).isEmpty()) {
                        return;
                    }
                } catch (Exception e2) {
                    b5d.h(TAG, "loadProviders err", e2, new Object[0]);
                    if (!((CopyOnWriteArrayList) b).isEmpty()) {
                        return;
                    }
                }
                d5d.c("loadProviders");
            }
        } catch (Throwable th) {
            if (((CopyOnWriteArrayList) b).isEmpty()) {
                d5d.c("loadProviders");
            }
            throw th;
        }
    }

    public static Uri n(ComponentName componentName) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("98b4f892", new Object[]{componentName});
        }
        try {
            m();
            Iterator it = ((CopyOnWriteArrayList) b).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                if (providerInfo.name.equals(componentName.getClassName())) {
                    return e(providerInfo.authority);
                }
            }
            String shortString = componentName.toShortString();
            ConcurrentHashMap<String, Uri> concurrentHashMap = c;
            if (concurrentHashMap.containsKey(shortString)) {
                return concurrentHashMap.get(shortString);
            }
            throw new IPCException(29, "can't find authorities in the " + componentName.getClass() + ", please check the provider is correct.");
        } catch (Exception e2) {
            throw new IPCException(30, e2);
        }
    }

    public static boolean[] l(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("28346fae", new Object[]{strArr});
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    if (e == null) {
                        e = (ActivityManager) re.r().getSystemService("activity");
                    }
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = e.getRunningAppProcesses();
                    if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            hashSet.add(runningAppProcessInfo.processName);
                        }
                        int length = strArr.length;
                        boolean[] zArr = new boolean[length];
                        for (int i = 0; i < length; i++) {
                            zArr[i] = hashSet.contains(strArr[i]);
                        }
                        return zArr;
                    }
                    return null;
                }
            } catch (Throwable th) {
                b5d.h(TAG, "isProcessArrAlive err", th, new Object[0]);
            }
        }
        return null;
    }
}
