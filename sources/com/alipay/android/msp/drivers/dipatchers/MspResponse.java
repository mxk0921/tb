package com.alipay.android.msp.drivers.dipatchers;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.Action;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Action mspRequest;
    public JSONObject responseBody;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Action mspRequest;
        public JSONObject responseBody;

        public Builder() {
        }

        public Builder body(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ac74a802", new Object[]{this, jSONObject});
            }
            this.responseBody = jSONObject;
            return this;
        }

        public MspResponse build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MspResponse) ipChange.ipc$dispatch("7e4e6887", new Object[]{this});
            }
            return new MspResponse(this);
        }

        public Builder request(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9b28fd3e", new Object[]{this, action});
            }
            this.mspRequest = action;
            return this;
        }

        public Builder(MspResponse mspResponse) {
            this.mspRequest = mspResponse.mspRequest;
            this.responseBody = mspResponse.responseBody;
        }
    }

    public MspResponse(Builder builder) {
        this.mspRequest = builder.mspRequest;
        this.responseBody = builder.responseBody;
    }

    public Action getMspRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("5a64ea4b", new Object[]{this});
        }
        return this.mspRequest;
    }

    public JSONObject getResponseBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e06ed720", new Object[]{this});
        }
        return this.responseBody;
    }

    public Builder newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("d89b54bd", new Object[]{this});
        }
        return new Builder(this);
    }
}
