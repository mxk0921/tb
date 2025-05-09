package com.uc.crashsdk;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.g;
import com.uc.crashsdk.export.ICrashClient;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static ICrashClient f14239a = null;
    private static int b = 3;
    private static volatile List<ValueCallback<Bundle>> c;
    private static volatile List<ValueCallback<Bundle>> d;
    private static volatile List<ValueCallback<Bundle>> e;
    private static volatile List<ValueCallback<Bundle>> f;
    private static final Object g = new Object();

    public static void a(ICrashClient iCrashClient) {
        f14239a = iCrashClient;
    }

    public static boolean b(ValueCallback<Bundle> valueCallback) {
        if (d == null) {
            synchronized (g) {
                try {
                    if (d == null) {
                        d = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (d) {
            try {
                if (d.size() >= b) {
                    return false;
                }
                d.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    public static boolean c(ValueCallback<Bundle> valueCallback) {
        if (e == null) {
            synchronized (g) {
                try {
                    if (e == null) {
                        e = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (e) {
            try {
                if (e.size() >= b) {
                    return false;
                }
                e.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    public static boolean d(ValueCallback<Bundle> valueCallback) {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        f = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (f) {
            try {
                if (f.size() >= b) {
                    return false;
                }
                f.add(valueCallback);
                return true;
            } finally {
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        if (g.a(str)) {
            a.a("crashsdk", "onLogGenerated file name is null!", null);
            return;
        }
        boolean equals = e.h().equals(str2);
        if (f14239a != null) {
            File file = new File(str);
            try {
                if (equals) {
                    f14239a.onLogGenerated(file, str3);
                } else {
                    f14239a.onClientProcessLogGenerated(str2, file, str3);
                }
            } catch (Throwable th) {
                g.a(th);
            }
        }
        List<ValueCallback<Bundle>> list = c;
        if (!equals) {
            list = d;
        }
        if (list != null) {
            synchronized (list) {
                try {
                    for (ValueCallback<Bundle> valueCallback : list) {
                        Bundle bundle = new Bundle();
                        bundle.putString("filePathName", str);
                        if (!equals) {
                            bundle.putString("processName", str2);
                        }
                        bundle.putString("logType", str3);
                        valueCallback.onReceiveValue(bundle);
                    }
                } finally {
                }
            }
        }
    }

    public static File a(File file) {
        ICrashClient iCrashClient = f14239a;
        if (iCrashClient != null) {
            try {
                return iCrashClient.onBeforeUploadLog(file);
            } catch (Throwable th) {
                g.a(th);
            }
        }
        return file;
    }

    public static void a(boolean z) {
        ICrashClient iCrashClient = f14239a;
        if (iCrashClient != null) {
            try {
                iCrashClient.onCrashRestarting(z);
            } catch (Throwable th) {
                g.a(th);
            }
        }
        if (e != null) {
            synchronized (e) {
                try {
                    for (ValueCallback<Bundle> valueCallback : e) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isJava", z);
                        valueCallback.onReceiveValue(bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void a(String str, int i, int i2) {
        ICrashClient iCrashClient = f14239a;
        if (iCrashClient != null) {
            iCrashClient.onAddCrashStats(str, i, i2);
        }
        if (f != null) {
            synchronized (f) {
                try {
                    for (ValueCallback<Bundle> valueCallback : f) {
                        Bundle bundle = new Bundle();
                        bundle.putString("processName", str);
                        bundle.putInt("key", i);
                        bundle.putInt("count", i2);
                        valueCallback.onReceiveValue(bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(String str, boolean z) {
        ICrashClient iCrashClient = f14239a;
        if (iCrashClient != null) {
            return iCrashClient.onGetCallbackInfo(str, z);
        }
        return "";
    }

    public static boolean a(ValueCallback<Bundle> valueCallback) {
        if (c == null) {
            synchronized (g) {
                try {
                    if (c == null) {
                        c = new ArrayList();
                    }
                } finally {
                }
            }
        }
        synchronized (c) {
            try {
                if (c.size() >= b) {
                    return false;
                }
                c.add(valueCallback);
                return true;
            } finally {
            }
        }
    }
}
