package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f15118a = new HashMap();

    private static void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f15118a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (elapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f15118a.remove((String) it.next());
        }
    }

    public static boolean a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String a2 = bm.a(bArr);
            if (!TextUtils.isEmpty(a2)) {
                Map<String, Long> map = f15118a;
                synchronized (map) {
                    if (map.get(a2 + str) != null) {
                        z = true;
                    } else {
                        map.put(a2 + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
            }
        }
        return z;
    }
}
