package com.taobao.tao.flexbox.layoutmanager.module;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.a;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
@AnyThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NetModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.k f12332a;
        public final /* synthetic */ d.j b;

        public a(d.k kVar, d.j jVar) {
            this.f12332a = kVar;
            this.b = jVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
                return;
            }
            d.k kVar = this.f12332a;
            if (kVar != null) {
                kVar.b(this.b, null);
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            d.k kVar = this.f12332a;
            if (kVar != null) {
                kVar.a(this.b, str);
            }
        }
    }

    static {
        t2o.a(503317309);
        t2o.a(503316559);
    }

    public static void fetch(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36865f12", new Object[]{jVar});
            return;
        }
        d.k kVar = jVar.c;
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            com.taobao.tao.flexbox.layoutmanager.ac.a.d().b(((JSONObject) json).getString("url"), new a(kVar, jVar));
        }
    }

    public static void getNetworkInfo(d.j jVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb17886", new Object[]{jVar});
            return;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar.c().getSystemService("connectivity")).getActiveNetworkInfo();
        HashMap hashMap = new HashMap();
        if (activeNetworkInfo != null) {
            hashMap.put("connect", Boolean.valueOf(activeNetworkInfo.isConnected()));
            if (activeNetworkInfo.getTypeName() != null) {
                str = activeNetworkInfo.getTypeName().toLowerCase();
            } else {
                str = "";
            }
            hashMap.put("type", str);
        } else {
            hashMap.put("connect", Boolean.FALSE);
        }
        d.k kVar = jVar.c;
        if (kVar != null) {
            kVar.a(jVar, hashMap);
        }
    }
}
