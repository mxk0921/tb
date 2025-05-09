package com.xiaomi.push;

import android.system.Os;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cm {
    public static long a(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e) {
            b.a(e);
            return 0L;
        }
    }
}
