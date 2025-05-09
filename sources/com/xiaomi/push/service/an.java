package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.bm;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class an {

    /* renamed from: a  reason: collision with root package name */
    private static Object f15047a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, Queue<String>> f1557a = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        synchronized (f15047a) {
            try {
                SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
                Queue<String> queue = f1557a.get(str);
                if (queue == null) {
                    String[] split = sharedPreferences.getString(str, "").split(",");
                    LinkedList linkedList = new LinkedList();
                    for (String str3 : split) {
                        linkedList.add(str3);
                    }
                    f1557a.put(str, linkedList);
                    queue = linkedList;
                }
                if (queue.contains(str2)) {
                    return true;
                }
                queue.add(str2);
                if (queue.size() > 25) {
                    queue.poll();
                }
                String a2 = bm.a(queue, ",");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str, a2);
                edit.commit();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
