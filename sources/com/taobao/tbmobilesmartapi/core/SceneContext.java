package com.taobao.tbmobilesmartapi.core;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.ywi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SceneContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13393a;
    public Context b;
    public a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface SceneContextCallBackKey {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        public static final String COMMON_TRACK_PARAMS = "CommonTrackParams";
    }

    static {
        t2o.a(809500684);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dbcc7507", new Object[]{this, str, jSONObject});
        }
        a aVar = this.c;
        if (aVar == null) {
            return new JSONObject();
        }
        return ((ywi) aVar).x(str, jSONObject);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564186cc", new Object[]{this});
            return;
        }
        this.b = null;
        this.f13393a = null;
        this.c = null;
    }
}
