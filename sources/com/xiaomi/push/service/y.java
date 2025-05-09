package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class y {

    /* renamed from: a  reason: collision with other field name */
    private static final Map<String, byte[]> f1664a = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f15134a = new ArrayList<>();

    public static void a(Context context, int i, String str) {
        Map<String, byte[]> map = f1664a;
        synchronized (map) {
            try {
                for (String str2 : map.keySet()) {
                    b.m410a("notify registration error. " + str2);
                    a(context, str2, f1664a.get(str2), i, str);
                }
                f1664a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (f15134a) {
            try {
                f15134a.add(new Pair<>(str, bArr));
                if (f15134a.size() > 50) {
                    f15134a.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, ai.a(str));
    }

    public static void a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f15134a) {
                arrayList = f15134a;
                f15134a = new ArrayList<>();
            }
            boolean a2 = s.a();
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair<String, byte[]> next = it.next();
                ai.a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!a2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (hb e) {
            b.d("meet error when process pending message. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void a(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f1664a;
            synchronized (map) {
                for (String str : map.keySet()) {
                    b.m410a("processing pending registration request. " + str);
                    ai.a(xMPushService, str, f1664a.get(str));
                    if (z && !s.a()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f1664a.clear();
            }
        } catch (hb e) {
            b.d("fail to deal with pending register request. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void a(String str, byte[] bArr) {
        Map<String, byte[]> map = f1664a;
        synchronized (map) {
            b.m410a("pending registration request. " + str);
            map.put(str, bArr);
        }
    }
}
