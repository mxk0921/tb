package com.xiaomi.push;

import android.content.Context;
import com.taobao.accs.utl.BaseMonitor;
import com.xiaomi.push.service.v;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dd {

    /* renamed from: a  reason: collision with root package name */
    private final String f14820a = "disconnection_event";
    private final String b = "count";
    private final String c = "host";
    private final String d = "network_state";
    private final String e = "reason";
    private final String f = BaseMonitor.COUNT_PING_INTERVAL;
    private final String g = "network_type";
    private final String h = "wifi_digest";
    private final String i = "duration";
    private final String j = "disconnect_time";
    private final String k = "connect_time";
    private final String l = "xmsf_vc";
    private final String m = "android_vc";
    private final String n = "uuid";

    public void a(Context context, List<dc> list) {
        if (!(list == null || list.size() == 0)) {
            db.a("upload size = " + list.size());
            String a2 = v.m1098a(context);
            for (dc dcVar : list) {
                HashMap hashMap = new HashMap();
                hashMap.put("count", Integer.valueOf(dcVar.a()));
                hashMap.put("host", dcVar.m580a());
                hashMap.put("network_state", Integer.valueOf(dcVar.b()));
                hashMap.put("reason", Integer.valueOf(dcVar.c()));
                hashMap.put(BaseMonitor.COUNT_PING_INTERVAL, Long.valueOf(dcVar.m579a()));
                hashMap.put("network_type", Integer.valueOf(dcVar.d()));
                hashMap.put("wifi_digest", dcVar.m582b());
                hashMap.put("connected_network_type", Integer.valueOf(dcVar.e()));
                hashMap.put("duration", Long.valueOf(dcVar.m581b()));
                hashMap.put("disconnect_time", Long.valueOf(dcVar.m583c()));
                hashMap.put("connect_time", Long.valueOf(dcVar.m584d()));
                hashMap.put("xmsf_vc", Integer.valueOf(dcVar.f()));
                hashMap.put("android_vc", Integer.valueOf(dcVar.g()));
                hashMap.put("uuid", a2);
                fr.a().a("disconnection_event", hashMap);
            }
        }
    }
}
