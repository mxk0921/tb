package com.alipay.mars;

import android.content.Context;
import android.os.Handler;
import com.alipay.mars.comm.PlatformComm;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Mars {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<String[]> f3864a = new ArrayList<>();
    public static volatile boolean b = false;

    public static boolean a(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4420b40c", new Object[]{strArr, strArr2})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        for (String str2 : strArr2) {
            if (arrayList.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void init(Context context, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36d8ec1", new Object[]{context, handler});
            return;
        }
        PlatformComm.init(context, handler);
        b = true;
    }

    public static void loadDefaultMarsLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171de5b2", new Object[0]);
            return;
        }
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("Bifrost");
        } catch (Throwable th) {
            LogCatUtil.error("bifrost.Mars", "", th);
        }
    }

    public static void onCreate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4de452", new Object[]{new Boolean(z)});
        } else if (z && b) {
            BaseEvent.onCreate();
        } else if (!z) {
            BaseEvent.onCreate();
        } else {
            throw new IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
    }

    public static void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[0]);
        } else {
            BaseEvent.onDestroy();
        }
    }

    public static synchronized void checkLoadedModules(ArrayList<String> arrayList, String str) {
        int i = 0;
        synchronized (Mars.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("350d4ab3", new Object[]{arrayList, str});
            } else if (arrayList != null) {
                String[] strArr = new String[0];
                LogCatUtil.info(str, "loaded modules: " + Arrays.toString(arrayList.toArray(strArr)));
                Arrays.sort(strArr);
                f3864a.add(strArr);
                int i2 = 0;
                boolean z = true;
                while (true) {
                    ArrayList<String[]> arrayList2 = f3864a;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if (!Arrays.equals(arrayList2.get(i2), arrayList2.get(0))) {
                        z = false;
                    }
                    i2++;
                }
                if (!z) {
                    while (i < f3864a.size()) {
                        int i3 = i + 1;
                        int i4 = i3;
                        while (true) {
                            ArrayList<String[]> arrayList3 = f3864a;
                            if (i4 >= arrayList3.size()) {
                                break;
                            }
                            boolean a2 = a(arrayList3.get(i), arrayList3.get(i4));
                            boolean z2 = !a2;
                            if (a2) {
                                z = z2;
                                break;
                            } else {
                                i4++;
                                z = z2;
                            }
                        }
                        if (!z) {
                            break;
                        }
                        i = i3;
                    }
                }
                if (!z) {
                    throw new IllegalStateException("mars lib module custom made error, pls check your *.so.");
                }
            }
        }
    }
}
