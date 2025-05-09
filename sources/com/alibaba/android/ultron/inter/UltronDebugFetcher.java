package com.alibaba.android.ultron.inter;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronDebugFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, UltronDebugInterface> sDebugManagerMap = new HashMap();

    static {
        t2o.a(154140677);
    }

    private static UltronDebugInterface createDebugInstance(String str) {
        try {
            try {
                Method declaredMethod = Class.forName("com.alibaba.android.ultron.impl.UltronDebugImpl").getDeclaredMethod("getInstance", String.class);
                if (declaredMethod != null) {
                    return (UltronDebugInterface) declaredMethod.invoke(null, str);
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static UltronDebugInterface getUltronDebug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronDebugInterface) ipChange.ipc$dispatch("e772c64", new Object[]{str});
        }
        if (sDebugManagerMap.containsKey(str)) {
            return sDebugManagerMap.get(str);
        }
        UltronDebugInterface createDebugInstance = createDebugInstance(str);
        if (createDebugInstance == null) {
            createDebugInstance = new UltronDebugDefault();
        }
        sDebugManagerMap.put(str, createDebugInstance);
        return createDebugInstance;
    }
}
