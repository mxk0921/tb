package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.io.Serializable;
import java.util.Map;
import tb.hmi;
import tb.ir9;
import tb.lfs;
import tb.t2o;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoTNodeModuleProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoTNodeModuleProxy";

    static {
        t2o.a(468714351);
    }

    public static void sendMessage(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef8e20d", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            Object f0 = jVar.f11976a.f0();
            if (f0 instanceof hmi) {
                hmi hmiVar = (hmi) f0;
                vrp vrpVar = new vrp((Map) json, (!jVar.e || jVar.c == null) ? null : new lfs(jVar));
                hmiVar.f(vrpVar);
                ir9.b(TAG, "新架构 TNode 页面发送消息：" + vrpVar);
            }
        }
    }
}
