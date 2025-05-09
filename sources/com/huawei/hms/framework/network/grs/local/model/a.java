package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f5362a;
    private final Map<String, c> b = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.b.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public void b(String str) {
        this.f5362a = str;
    }

    public String a() {
        return this.f5362a;
    }

    public void a(long j) {
    }

    public void a(String str, c cVar) {
        if (!TextUtils.isEmpty(str) && cVar != null) {
            this.b.put(str, cVar);
        }
    }
}
