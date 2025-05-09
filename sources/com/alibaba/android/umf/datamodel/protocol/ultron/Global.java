package com.alibaba.android.umf.datamodel.protocol.ultron;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.ah;
import tb.ck;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Global extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Global";
    @Deprecated
    public JSONObject context;
    @Deprecated
    public JSONObject detect;
    @Deprecated
    public Map<String, Event> events;
    @Deprecated
    public Object feature;
    private JSONObject mOriginData;
    @Deprecated
    public Object pageControl;
    @Deprecated
    public Object params;
    @Deprecated
    public Object theme;

    static {
        t2o.a(80740663);
    }

    public Global() {
    }

    public static /* synthetic */ Object ipc$super(Global global, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/protocol/ultron/Global");
    }

    public JSONObject getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e13b3ca0", new Object[]{this});
        }
        if (this.context == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.context = jSONObject.getJSONObject("context");
        }
        return this.context;
    }

    public JSONObject getDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c1a684c0", new Object[]{this});
        }
        if (this.detect == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.detect = jSONObject.getJSONObject("detect");
        }
        return this.detect;
    }

    public Map<String, Event> getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57675ccb", new Object[]{this});
        }
        Map<String, Event> map = this.events;
        if (map == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return map;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return this.events;
            }
            this.events = new HashMap();
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str) && (jSONObject2.get(str) instanceof JSONObject)) {
                    this.events.put(str, new Event(jSONObject2.getJSONObject(str)));
                }
            }
        }
        return this.events;
    }

    public Object getFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("837252cb", new Object[]{this});
        }
        if (this.feature == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.feature = jSONObject.get("feature");
        }
        return this.feature;
    }

    public Object getPageControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d0aadf3", new Object[]{this});
        }
        if (this.pageControl == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.pageControl = jSONObject.get("pageControl");
        }
        return this.pageControl;
    }

    public Object getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("71361a8f", new Object[]{this});
        }
        if (this.params == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.params = jSONObject.get("params");
        }
        return this.params;
    }

    public Object getTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c44d8f58", new Object[]{this});
        }
        if (this.theme == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.theme = jSONObject.get("theme");
        }
        return this.theme;
    }

    public Global(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    public Global clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Global) ipChange.ipc$dispatch("c5241f88", new Object[]{this});
        }
        Global global = (Global) super.clone();
        try {
            global.theme = ah.a((Serializable) getTheme());
        } catch (IOException e) {
            ck.g().b(TAG, "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e2.getMessage());
        }
        try {
            global.events = ah.b(getEvents());
        } catch (IOException e3) {
            ck.g().b(TAG, "clone.IOException", e3.getMessage());
        } catch (ClassNotFoundException e4) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e4.getMessage());
        }
        try {
            global.pageControl = ah.a((Serializable) getPageControl());
        } catch (IOException e5) {
            ck.g().b(TAG, "clone.IOException", e5.getMessage());
        } catch (ClassNotFoundException e6) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e6.getMessage());
        }
        try {
            global.feature = ah.a((Serializable) getFeature());
        } catch (IOException e7) {
            ck.g().b(TAG, "clone.IOException", e7.getMessage());
        } catch (ClassNotFoundException e8) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e8.getMessage());
        }
        try {
            global.params = ah.a((Serializable) getParams());
        } catch (IOException e9) {
            ck.g().b(TAG, "clone.IOException", e9.getMessage());
        } catch (ClassNotFoundException e10) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e10.getMessage());
        }
        try {
            global.detect = JSON.parseObject(JSON.toJSONString(this.detect));
        } catch (Throwable th) {
            ck.g().b(TAG, "clone.IOException", th.getMessage());
        }
        try {
            global.context = JSON.parseObject(JSON.toJSONString(this.context));
        } catch (Throwable th2) {
            ck.g().b(TAG, "clone.IOException", th2.getMessage());
        }
        return global;
    }
}
