package com.alibaba.triver.triver_shop.shop2023.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.brf;
import tb.ckf;
import tb.jpu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject data;
    private final JSONObject extData;
    private final JSONObject mtopInfo;
    private final String name;
    private final int renderHeight;
    private final String renderTargetTab;
    private final boolean sendMtop;
    private final String targetUrl;
    private final String type;
    private final JSONObject userTrackInfo;
    private final String version;

    static {
        t2o.a(766510317);
    }

    public ShopComponentModel(JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, String str, String str2, String str3, String str4, int i, String str5, JSONObject jSONObject4) {
        this.userTrackInfo = jSONObject;
        this.sendMtop = z;
        this.mtopInfo = jSONObject2;
        this.data = jSONObject3;
        this.type = str;
        this.name = str2;
        this.targetUrl = str3;
        this.version = str4;
        this.renderHeight = i;
        this.renderTargetTab = str5;
        this.extData = jSONObject4;
    }

    public final boolean canRenderDXTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306f11bf", new Object[]{this})).booleanValue();
        }
        if (this.renderHeight == 0 || this.targetUrl == null || this.version == null) {
            return false;
        }
        return true;
    }

    public final JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }

    public final JSONObject getExtData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c5adce5c", new Object[]{this});
        }
        return this.extData;
    }

    public final JSONObject getMtopInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f8a7db3", new Object[]{this});
        }
        return this.mtopInfo;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final int getRenderHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed5c2bcd", new Object[]{this})).intValue();
        }
        return this.renderHeight;
    }

    public final String getRenderTargetTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447514e1", new Object[]{this});
        }
        return this.renderTargetTab;
    }

    public final boolean getSendMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70fb6c71", new Object[]{this})).booleanValue();
        }
        return this.sendMtop;
    }

    public final String getTargetUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return this.targetUrl;
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public final JSONObject getUserTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e39fb8ff", new Object[]{this});
        }
        return this.userTrackInfo;
    }

    public final String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    public final boolean isDXType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c119a023", new Object[]{this})).booleanValue();
        }
        return ckf.b("dx", this.type);
    }

    public final boolean isWebType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0e81eaf", new Object[]{this})).booleanValue();
        }
        return ckf.b("web", this.type);
    }

    public final boolean needPrefetchRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c688ad", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.extData;
        return ckf.b("true", jSONObject == null ? null : jSONObject.getString("isPrefetchRequest"));
    }

    public final JSONObject getDXJSONConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a43eddb", new Object[]{this});
        }
        return brf.a(jpu.a("name", this.name), jpu.a("version", this.version), jpu.a("url", this.targetUrl));
    }
}
