package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzv;
import tb.h;
import tb.j8l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class APreferencesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "APreferencesManager";
    private static Context sContext;
    private static final HashMap<String, SharedPreferences> sSharedPrefsCache = new HashMap<>();
    private static final AtomicBoolean isInit = new AtomicBoolean(false);

    static {
        t2o.a(343932964);
    }

    private APreferencesManager() {
    }

    public static SharedPreferences getMultiProcessSharedPreferences(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("2c8a136c", new Object[]{str});
        }
        return getSharedPreferences(sContext, str, 0);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("327315e9", new Object[]{context, str, new Integer(i)});
        }
        if (!Constants.SP_FILE_NAME.equals(str) || !h.b()) {
            sharedPreferences = context.getSharedPreferences(str, i);
        } else {
            sharedPreferences = j8l.e(context);
        }
        return replaceSharePreferences(context, str, sharedPreferences);
    }

    private static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (isInit.compareAndSet(false, true)) {
            sContext = context;
            PrefsIPCChannel.getInstance().register(context);
        }
    }

    public static void recoverPreferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25debd7b", new Object[0]);
            return;
        }
        synchronized (APreferencesManager.class) {
            try {
                for (SharedPreferences sharedPreferences : sSharedPrefsCache.values()) {
                    if (sharedPreferences instanceof c) {
                        ((c) sharedPreferences).j();
                    }
                }
            }
        }
    }

    public static SharedPreferences replaceSharePreferences(Context context, String str, SharedPreferences sharedPreferences) {
        SharedPreferences sharedPreferences2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1dec50da", new Object[]{context, str, sharedPreferences});
        }
        if (!TextUtils.isEmpty(str)) {
            if (context != null && !UtilityImpl.isDualApp(context)) {
                init(context);
                if (j8l.t(context) && !TextUtils.isEmpty(bzv.a()) && PrefsIPCChannel.getInstance().isCoreProcessReady()) {
                    synchronized (APreferencesManager.class) {
                        try {
                            HashMap<String, SharedPreferences> hashMap = sSharedPrefsCache;
                            sharedPreferences2 = hashMap.get(str);
                            if (sharedPreferences2 == null) {
                                if (bzv.c()) {
                                    sharedPreferences2 = new b(context, str, sharedPreferences);
                                } else {
                                    sharedPreferences2 = new c(context, str, sharedPreferences);
                                }
                                hashMap.put(str, sharedPreferences2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return sharedPreferences2;
                }
            }
            return sharedPreferences;
        }
        throw new IllegalArgumentException("SharedPreferences name can not be empty");
    }
}
