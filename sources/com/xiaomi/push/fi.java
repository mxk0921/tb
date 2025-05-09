package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fi {

    /* renamed from: a  reason: collision with root package name */
    private static Vector<Pair<String, Long>> f14876a = new Vector<>();

    /* renamed from: a  reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f984a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f14876a) {
            for (int i = 0; i < f14876a.size(); i++) {
                try {
                    Pair<String, Long> elementAt = f14876a.elementAt(i);
                    sb.append((String) elementAt.first);
                    sb.append(":");
                    sb.append(elementAt.second);
                    if (i < f14876a.size() - 1) {
                        sb.append(";");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f14876a.clear();
        }
        return sb.toString();
    }
}
