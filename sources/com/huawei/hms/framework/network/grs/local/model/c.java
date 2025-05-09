package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f5364a;
    private final Map<String, d> b = new ConcurrentHashMap(16);
    private List<b> c = new ArrayList(16);

    public d a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.b.get(str);
        }
        Logger.w(Dispatchers.TYPE_SERVICE, "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    public String b() {
        return this.f5364a;
    }

    public void c(String str) {
        this.f5364a = str;
    }

    public List<b> a() {
        return this.c;
    }

    public void b(String str) {
    }

    public void a(String str, d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            this.b.put(str, dVar);
        }
    }

    public void a(List<b> list) {
        this.c = list;
    }
}
