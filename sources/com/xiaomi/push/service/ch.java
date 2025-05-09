package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.s;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ch implements XMPushService.n {

    /* renamed from: a  reason: collision with root package name */
    private static Context f15097a;

    /* renamed from: a  reason: collision with other field name */
    private static final boolean f1623a = Log.isLoggable("UNDatas", 3);

    /* renamed from: a  reason: collision with other field name */
    private static final Map<Integer, Map<String, List<String>>> f1622a = new HashMap();

    public ch(Context context) {
        f15097a = context;
    }

    private static void b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f1622a);
        if (hashMap.size() > 0) {
            for (Integer num : hashMap.keySet()) {
                Map map = (Map) hashMap.get(num);
                if (map != null && map.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : map.keySet()) {
                        sb.append(str);
                        sb.append(":");
                        List list = (List) map.get(str);
                        if (!s.a(list)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (i != 0) {
                                    sb.append(",");
                                }
                                sb.append((String) list.get(i));
                            }
                        }
                        sb.append(";");
                    }
                    jb a2 = a(null, bc.a(), im.NotificationRemoved.f1168a, null);
                    a2.a("removed_reason", String.valueOf(num));
                    a2.a("all_delete_msgId_appId", sb.toString());
                    b.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb.toString());
                    a(f15097a, a2);
                }
                f1622a.remove(num);
            }
        }
    }

    private static jb a(String str, String str2, String str3, String str4) {
        jb jbVar = new jb();
        if (str3 != null) {
            jbVar.c(str3);
        }
        if (str != null) {
            jbVar.b(str);
        }
        if (str2 != null) {
            jbVar.a(str2);
        }
        if (str4 != null) {
            jbVar.d(str4);
        }
        jbVar.a(false);
        return jbVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* renamed from: a */
    public void mo775a() {
        Map<Integer, Map<String, List<String>>> map = f1622a;
        if (map.size() > 0) {
            synchronized (map) {
                b();
            }
        }
    }

    private static void a(Context context, jb jbVar) {
        if (f1623a) {
            b.b("UNDatas upload message notification:" + jbVar);
        }
        ah.a(context).a(new ci(jbVar));
    }
}
