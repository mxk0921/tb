package com.taobao.tao.flexbox.layoutmanager.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.Map;
import tb.g2e;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TintModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TintModule";

    static {
        t2o.a(503317316);
        t2o.a(503316559);
    }

    public static void commitFail(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c82537", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        String a2 = jVar.a("module", null);
        String a3 = jVar.a("name", null);
        String a4 = jVar.a("errorCode", null);
        Map b = jVar.b("args", null);
        if (!TextUtils.isEmpty(a3)) {
            i0.g(a2, a3, a4, b);
        }
    }

    public static void commitState(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d20c32", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        String a2 = jVar.a("module", null);
        String a3 = jVar.a("name", null);
        Map<String, Object> b = jVar.b("dimensions", null);
        Map<String, Object> b2 = jVar.b("measurements", null);
        if (!TextUtils.isEmpty(a3)) {
            i0.b(a2, a3, b, b2);
        }
    }

    public static void commitSuccess(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd1b40", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        String a2 = jVar.a("module", null);
        String a3 = jVar.a("name", null);
        Map b = jVar.b("args", null);
        if (!TextUtils.isEmpty(a3)) {
            i0.commitSuccess(a2, a3, b);
        }
    }

    public static void getAllTintInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbadd38", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        d.k kVar = jVar.c;
        if (kVar != null) {
            kVar.a(jVar, i0.e());
        }
    }

    public static void setBizName(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db8c090", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        String a2 = jVar.a("bizName", null);
        if (!TextUtils.isEmpty(a2)) {
            i0.a(a2);
        } else {
            tfs.g(TAG, "setBizName is empty ");
        }
    }

    public static void setOrangeConfig(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4027203a", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        String a2 = jVar.a("configs", null);
        if (!TextUtils.isEmpty(a2)) {
            i0.f(a2.split(","));
        } else {
            tfs.g(TAG, "setOrangeConfig is empty ");
        }
    }

    public static void updateExtraTintInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870fa25c", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        JSON json = jVar.b;
        if (json instanceof Map) {
            for (Map.Entry entry : ((Map) json).entrySet()) {
                i0.c(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }
    }

    public static void updateGlobalTintInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1a91f7", new Object[]{jVar});
            return;
        }
        g2e i0 = jVar.f11976a.i0();
        JSON json = jVar.b;
        if (json instanceof Map) {
            for (Map.Entry entry : ((Map) json).entrySet()) {
                i0.d(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }
    }
}
