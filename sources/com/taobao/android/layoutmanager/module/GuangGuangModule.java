package com.taobao.android.layoutmanager.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.HashMap;
import tb.e95;
import tb.t2o;
import tb.tfs;
import tb.wbd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GuangGuangModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GuangGuangModule";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8204a;

        public a(String str) {
            this.f8204a = str;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            tfs.e(GuangGuangModule.TAG, "prefetch video finish:" + this.f8204a + ":" + i);
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            tfs.e(GuangGuangModule.TAG, "prefetch video progress:" + this.f8204a + ":" + i);
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            tfs.e(GuangGuangModule.TAG, "prefetch video start:" + this.f8204a);
        }
    }

    static {
        t2o.a(502268100);
        t2o.a(503316559);
    }

    public static void prefetchVideo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40b7048", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("videoId");
            String string2 = jSONObject.getString("scenes");
            String string3 = jSONObject.getString("bizCode");
            int intValue = jSONObject.getIntValue("downloadSize");
            String string4 = jSONObject.getString("userId");
            String string5 = jSONObject.getString("videoChannel");
            if (!TextUtils.isEmpty(string)) {
                HashMap hashMap = new HashMap();
                hashMap.put("playScenes", string2);
                hashMap.put("from", string3);
                if (!TextUtils.isEmpty(string4)) {
                    hashMap.put("userId", string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    hashMap.put("videoChannel", string5);
                }
                e95.a(jVar.c(), string, hashMap, intValue, new a(string));
            }
        }
    }
}
