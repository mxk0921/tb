package com.alibaba.appmonitor.pool;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rbo;
import tb.t2o;
import tb.to1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ReuseJSONObject extends JSONObject implements rbo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1465414806753619992L;

    static {
        t2o.a(962593062);
        t2o.a(962593059);
    }

    public static /* synthetic */ Object ipc$super(ReuseJSONObject reuseJSONObject, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/pool/ReuseJSONObject");
    }

    @Override // tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        for (Object obj : values()) {
            if (obj instanceof rbo) {
                to1.a().c((rbo) obj);
            }
        }
        super.clear();
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        }
    }
}
