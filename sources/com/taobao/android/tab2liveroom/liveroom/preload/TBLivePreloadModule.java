package com.taobao.android.tab2liveroom.liveroom.preload;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.od0;
import tb.q2h;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBLivePreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLivePreloadModule";
    private static boolean setPreloadConfigCalled = false;

    static {
        t2o.a(779092159);
        t2o.a(503316559);
    }

    public static void process(d.j jVar) {
        ViewGroup Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c114fd", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            try {
                JSONObject jSONObject = (JSONObject) json;
                tfs.e(TAG, "TBLivePreloadModule.process被调用：" + jSONObject.toJSONString());
                Context c = jVar.c();
                if ((c instanceof Application) && (Q = od0.D().f().Q()) != null) {
                    c = Q.getContext();
                }
                if (!setPreloadConfigCalled) {
                    setPreloadConfigInternal(jVar.c(), jSONObject);
                }
                q2h d = q2h.d();
                if (d.e().e()) {
                    tfs.e(TAG, "进入预加载逻辑");
                    d.c(c, jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "enabled", (String) Boolean.TRUE);
                    jVar.c.a(jVar, jSONObject2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.e(TAG, th.getMessage());
            }
        }
    }

    private static void setPreloadConfigInternal(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df4f6b5", new Object[]{context, jSONObject});
            return;
        }
        q2h.d().h(jSONObject);
        tfs.e(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
    }

    public static void setPreloadConfig(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff85b43", new Object[]{jVar});
            return;
        }
        tfs.e(TAG, "setPreloadConfig start");
        if (jVar.b instanceof JSONObject) {
            setPreloadConfigInternal(jVar.c(), (JSONObject) jVar.b);
            setPreloadConfigCalled = true;
        }
    }
}
