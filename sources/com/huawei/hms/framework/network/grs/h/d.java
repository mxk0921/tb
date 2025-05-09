package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f5358a = new ConcurrentHashMap(16);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f5359a;
        private final long b;

        public a(long j, long j2) {
            this.f5359a = j;
            this.b = j2;
        }

        public boolean a() {
            if (SystemClock.elapsedRealtime() - this.b <= this.f5359a) {
                return true;
            }
            return false;
        }
    }

    public static a a(String str) {
        StringBuilder sb = new StringBuilder("map size of get is before: ");
        Map<String, a> map = f5358a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        a aVar = map.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder sb = new StringBuilder("map size of put is before: ");
        Map<String, a> map = f5358a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
