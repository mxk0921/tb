package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;
import tb.k3i;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "params")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Params extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String cpsParams;
    private final JSONObject trackEventParams;
    private final JSONObject trackParams;
    private final JSONObject umbParams;
    private final String utParams;
    private final JSONObject xsRedPocketParams;

    static {
        t2o.a(912261676);
    }

    public Params(JSONObject jSONObject) {
        super(jSONObject);
        this.trackEventParams = k3i.a(jSONObject.getJSONObject("trackEventParams"));
        this.trackParams = k3i.a(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS));
        this.umbParams = k3i.a(jSONObject.getJSONObject("umbParams"));
        this.utParams = jSONObject.getString("utParams");
        this.cpsParams = jSONObject.getString("cpsParams");
        this.xsRedPocketParams = k3i.a(jSONObject.getJSONObject("xsRedPocketParams"));
    }

    public static /* synthetic */ Object ipc$super(Params params, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Params");
    }

    public String getCpsParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f79f34a3", new Object[]{this});
        }
        return this.cpsParams;
    }

    public JSONObject getTrackEventParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31e26812", new Object[]{this});
        }
        return this.trackEventParams;
    }

    public JSONObject getTrackParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this});
        }
        return this.trackParams;
    }

    public JSONObject getUmbParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c971ae1", new Object[]{this});
        }
        return this.umbParams;
    }

    public String getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3001b5e", new Object[]{this});
        }
        return this.utParams;
    }

    public JSONObject getXsRedPocketParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("828dce63", new Object[]{this});
        }
        return this.xsRedPocketParams;
    }
}
