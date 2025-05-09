package com.taobao.taobao.internal;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PayResultInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHARE_TYPE = "share_pp";
    private static final String SIGN_AGREEMENT_NO = "sign_agreement_no";
    private static final String SIGN_AGREEMENT_SWITCH = "sign_agreement_switch";
    public String alipayResult;
    public String alipaySignResp;
    public ExtendInfo extendInfo;
    public String extendInfoStr;
    public String from;
    public String memo;
    public String openTime;
    public PayRequest payRequest;
    public String renderTime;
    public Result result;
    public String resultStatus;
    public String resultString;
    public SharePayData sharePayData;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ExtendInfo implements Serializable {
        public String authCode;
        public String payerUserId;
        public String sharepayData;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Result implements Serializable {
        public String biz_type;
        public boolean isJumpUrl;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class SharePayData implements Serializable {
        public String action;
        public String amount;
        public String desc;
        public String payurl;
    }

    public PayResultInfo(String str, String str2, PayRequest payRequest) {
        this.resultStatus = str;
        this.resultString = str2;
        this.payRequest = payRequest;
    }

    public boolean isShareType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541aa2ba", new Object[]{this})).booleanValue();
        }
        if (isShareMsmType() || isSharePayType()) {
            return true;
        }
        return false;
    }

    public boolean isShareMsmType() {
        ExtendInfo extendInfo;
        SharePayData sharePayData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66e3f57", new Object[]{this})).booleanValue();
        }
        if (this.result == null || (extendInfo = this.extendInfo) == null || extendInfo.payerUserId == null || (sharePayData = this.sharePayData) == null || TextUtils.isEmpty(sharePayData.payurl)) {
            return false;
        }
        return SHARE_TYPE.equals(this.result.biz_type);
    }

    public boolean isSharePayType() {
        SharePayData sharePayData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b279778", new Object[]{this})).booleanValue();
        }
        if (this.result == null || this.extendInfo == null || (sharePayData = this.sharePayData) == null || TextUtils.isEmpty(sharePayData.payurl)) {
            return false;
        }
        return SHARE_TYPE.equals(this.result.biz_type);
    }

    public PayResultInfo(String str, String str2, String str3, PayRequest payRequest) {
        this.resultStatus = str;
        this.memo = str2;
        this.resultString = str3;
        this.payRequest = payRequest;
        this.alipayResult = "{\"result\":\"" + str3 + "\",\"memo\":\"" + str2 + "\",\"ResultStatus\":\"" + str + "\"}";
    }

    public PayResultInfo(Intent intent) {
        ExtendInfo extendInfo;
        String[] split;
        try {
            this.resultStatus = intent.getStringExtra("resultStatus");
            this.memo = intent.getStringExtra("memo");
            this.resultString = intent.getStringExtra("result");
            this.openTime = intent.getStringExtra(MspGlobalDefine.OPEN_TIME);
            this.extendInfoStr = intent.getStringExtra(MspGlobalDefine.EXTENDINFO);
            this.renderTime = intent.getStringExtra("renderTime");
            this.alipayResult = "{\"result\":\"" + this.resultString + "\",\"memo\":\"" + this.memo + "\",\"openTime\":\"" + this.openTime + "\",\"renderTime\":\"" + this.renderTime + "\",\"extendInfoStr\":\"" + this.extendInfoStr + "\",\"ResultStatus\":\"" + this.resultStatus + "\"}";
            if (!TextUtils.isEmpty(this.resultString)) {
                try {
                    this.result = (Result) JSON.parseObject(this.resultString, Result.class);
                } catch (Exception e) {
                    new StringBuilder("Result parse error!=").append(e.getMessage());
                }
            }
            if (this.result == null && !TextUtils.isEmpty(this.resultString) && this.resultString.contains(SIGN_AGREEMENT_SWITCH)) {
                this.alipaySignResp = "";
                for (String str : this.resultString.split("&")) {
                    if (!TextUtils.isEmpty(str) && (str.contains(SIGN_AGREEMENT_SWITCH) || str.contains(SIGN_AGREEMENT_NO))) {
                        if (TextUtils.isEmpty(this.alipaySignResp)) {
                            this.alipaySignResp = str;
                        } else {
                            this.alipaySignResp += "&" + str;
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(this.extendInfoStr)) {
                this.extendInfo = (ExtendInfo) JSON.parseObject(this.extendInfoStr, ExtendInfo.class);
            }
            Result result = this.result;
            if (!(result == null || !SHARE_TYPE.equals(result.biz_type) || (extendInfo = this.extendInfo) == null || TextUtils.isEmpty(extendInfo.sharepayData))) {
                this.sharePayData = (SharePayData) JSON.parseObject(this.extendInfo.sharepayData, SharePayData.class);
            }
        } catch (Exception e2) {
            new StringBuilder("Result parse error!=").append(e2.getMessage());
        }
    }
}
