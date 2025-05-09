package com.taobao.tao.flexbox.layoutmanager.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import tb.akt;
import tb.ggs;
import tb.od0;
import tb.t2o;

/* compiled from: Taobao */
@AnyThread
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StorageModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements IStorage.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12333a;

        public a(d.j jVar) {
            this.f12333a = jVar;
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e35e265a", new Object[]{this, obj});
                return;
            }
            d.j jVar = this.f12333a;
            jVar.c.a(jVar, obj);
        }
    }

    static {
        t2o.a(503317314);
        t2o.a(503316559);
    }

    public static void clear(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec662df", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            ggs.g(jSONObject.getString("group"), jSONObject.getString("key"));
            long longValue = jSONObject.getLongValue("expireTime");
            if (longValue > 0 && akt.p2("enableClearExpireCache", true)) {
                od0.D().z().f(longValue);
            }
        }
    }

    public static void get(d.j jVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a005df6", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            if (jSONObject.containsKey("key")) {
                str = jSONObject.getString("key");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                jVar.c.b(jVar, null);
            } else if (jSONObject.getBooleanValue("memory")) {
                jVar.c.a(jVar, ggs.d(str));
            } else {
                ggs.b(str, new a(jVar));
            }
        }
    }

    public static void set(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf166a", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            Object obj = null;
            String string = jSONObject.containsKey("key") ? jSONObject.getString("key") : null;
            if (jSONObject.containsKey("value")) {
                obj = jSONObject.get("value");
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (jSONObject.getBooleanValue("memory")) {
                ggs.f(string, obj);
            } else {
                ggs.e(string, obj);
            }
        }
    }
}
