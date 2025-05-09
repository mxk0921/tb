package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.alipay.share.sdk.openapi.ui.Ui;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APFundObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String extraDesc1;
    public String extraDesc2;
    public String extraValue1;
    public String extraValue2;
    public String fundCode;
    public String fundName;
    public String fundPrice;
    public String fundTag;
    public long time;
    public Ui ui;
    public String webpageUrl;

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
            return;
        }
        bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
        bundle.putString(Constant.EXTRA_FUND_TAG, this.fundTag);
        bundle.putString(Constant.EXTRA_FUND_TITLE, this.fundName);
        bundle.putString(Constant.EXTRA_FUND_CODE, this.fundCode);
        bundle.putString(Constant.EXTRA_FUND_PRICE, this.fundPrice);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_DESC1, this.extraDesc1);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_DESC2, this.extraDesc2);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_VALUE1, this.extraValue1);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_VALUE2, this.extraValue2);
        bundle.putLong(Constant.EXTRA_FUND_TIME, this.time);
        if (this.ui != null) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.object();
                jSONStringer.key("skin").value(this.ui.skin);
                if (this.ui.style != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tagBgColor", this.ui.style.tagBgColor);
                    jSONObject.put("priceColor", this.ui.style.priceColor);
                    jSONObject.put("tip1Color", this.ui.style.tip1Color);
                    jSONObject.put("tip2Color", this.ui.style.tip2Color);
                    jSONObject.put("dayIncreaseColor", this.ui.style.dayIncreaseColor);
                    jSONObject.put("weekIncreaseColor", this.ui.style.weekIncreaseColor);
                    jSONObject.put("timeColor", this.ui.style.timeColor);
                    jSONStringer.key("style").value(jSONObject);
                }
                jSONStringer.endObject();
                bundle.putString(Constant.EXTRA_UI, jSONStringer.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 122;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        }
    }
}
