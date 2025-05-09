package com.huawei.hms.framework.common;

import tb.ce8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SecurityRandomHelper {
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        ce8.e(true);
                        instance = new SecurityRandomHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return ce8.c(i);
    }

    public String generateSecureRandomStr(int i) {
        return ce8.d(i);
    }
}
