package com.xiaomi.push.service;

import com.xiaomi.push.ip;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bs {
    public static ip a(ip ipVar) {
        Map<String, String> map;
        if (!(ipVar == null || (map = ipVar.f1207b) == null)) {
            map.remove("score_info");
        }
        return ipVar;
    }
}
