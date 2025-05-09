package com.alipay.android.msp.core.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BirdNestFrameEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f3553a;
    public final String b;
    public final String c;
    public final String d;
    public final JSONObject e;

    public BirdNestFrameEvent(JSONObject jSONObject) {
        this.f3553a = jSONObject.getString("type");
        this.b = jSONObject.getString("key");
        this.c = jSONObject.getString(MspConstants.bannerKey.MQP_TOKEN);
        this.d = jSONObject.getString("id");
        this.e = jSONObject.getJSONObject("args");
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return this.e;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.d;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.b;
    }

    public String getMqpToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("317bff56", new Object[]{this});
        }
        return this.c;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f3553a;
    }

    public boolean isOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abebf37c", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, this.f3553a);
    }

    public boolean isOnEventResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2338879", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT_RESULT, this.f3553a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BirdNestFrameEvent{type='" + this.f3553a + "', key='" + this.b + "', mqpToken='" + this.c + "', id='" + this.d + "', args=" + this.e + '}';
    }
}
