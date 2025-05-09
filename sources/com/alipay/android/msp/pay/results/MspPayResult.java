package com.alipay.android.msp.pay.results;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogAgent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspPayResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspTradeContext f3719a;
    public final DynDataWrapper<String> b;
    public final DynDataWrapper<String> c;
    public final DynDataWrapper<String> d;
    public String f;
    public String g;
    public String h;
    public String i;
    public String k;
    public JSONObject e = new JSONObject();
    public boolean j = false;
    public final Object l = new Object();
    public String m = "";
    public boolean n = false;

    public MspPayResult(MspTradeContext mspTradeContext) {
        int i = 0;
        this.f3719a = mspTradeContext;
        i = mspTradeContext != null ? mspTradeContext.getBizId() : i;
        DynDataWrapper<String> dynDataWrapper = new DynDataWrapper<>(i, "resultStatus", "6001");
        this.b = dynDataWrapper;
        DynDataWrapper<String> dynDataWrapper2 = new DynDataWrapper<>(i, DynConstants.DynDataNames.D_RESULT_RESULT, "");
        this.c = dynDataWrapper2;
        DynDataWrapper<String> dynDataWrapper3 = new DynDataWrapper<>(i, DynConstants.DynDataNames.D_RESULT_MEMO, "");
        this.d = dynDataWrapper3;
        dynDataWrapper.write(String.valueOf(ResultStatus.CANCELED.getStatus()));
        dynDataWrapper3.write("");
        dynDataWrapper2.write("");
    }

    public void addExtendInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c1e680", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.e = JsonUtil.merge(this.e, jSONObject);
            LogUtil.record(4, "phonecashiermsp#MspPayResult", "MspPayResult.addExtendInfo", "extendInfo:".concat(String.valueOf(jSONObject)));
        }
    }

    public void addExtendInfoByKeyAndValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34a15b4", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            jSONObject.put(str, (Object) str2);
            LogUtil.record(4, "phonecashiermsp#MspPayResult", "MspPayResult.addExtendInfoByKeyAndValue", str + " " + str2);
        }
    }

    public String getEndCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4acb4107", new Object[]{this});
        }
        return this.b.read();
    }

    public JSONObject getExtendInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3e5ef85", new Object[]{this});
        }
        return this.e;
    }

    public String getHkRawResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd09cf0d", new Object[]{this});
        }
        return this.k;
    }

    public String getMemo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29191f49", new Object[]{this});
        }
        return this.d.read();
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this});
        }
        return this.c.read();
    }

    public String getTrade_no() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d9fe647", new Object[]{this});
        }
        return this.i;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.b.read(), String.valueOf(ResultStatus.SUCCEEDED.getStatus()));
    }

    public boolean isWontCallbackUrlJump() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff8042bb", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public void setEndCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a068b7", new Object[]{this, str});
            return;
        }
        synchronized (this.l) {
            try {
                LogUtil.record(2, "MspPayResult:setEndCode", "endcode=".concat(String.valueOf(str)));
                if (!TextUtils.isEmpty(str)) {
                    this.b.write(str);
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setExtendInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be34c9f", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public void setHKRawResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5df4591", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void setMemo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8a0a4d", new Object[]{this, str});
        } else {
            this.d.write(str);
        }
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.c.write(str);
        }
    }

    public void setSourceResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0594ab", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void setTrade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113a3d0f", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void setWontCallbackUrlJump(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbe4e35", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public String toString() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("<MspPayResult bizId=");
        MspTradeContext mspTradeContext = this.f3719a;
        if (mspTradeContext == null) {
            i = -1;
        } else {
            i = mspTradeContext.getBizId();
        }
        sb.append(i);
        sb.append(" endCode=");
        sb.append(this.b.read());
        sb.append(" memo=");
        sb.append(this.d.read());
        sb.append(" result=");
        sb.append(this.c.read());
        sb.append(">");
        return sb.toString();
    }

    public String formatResult(int i) {
        TradeLogicData tradeLogicData;
        TradeLogicData tradeLogicData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2cbc0b8", new Object[]{this, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this.l) {
            try {
                MspTradeContext mspTradeContext = this.f3719a;
                String str = null;
                Context context = mspTradeContext != null ? mspTradeContext.getContext() : null;
                if (context != null) {
                    str = context.getPackageName();
                }
                if (TextUtils.equals(str, "hk.alipay.wallet") && !TextUtils.isEmpty(this.k)) {
                    return this.k;
                }
                if (!TextUtils.isEmpty(this.m)) {
                    LogUtil.record(4, "MspPayResult.formatResult", "sourceResult=" + this.m);
                    return this.m;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ResultStatus.START_ACTIVITY_FAILED.getStatus());
                if (TextUtils.equals(this.b.read(), sb2.toString())) {
                    return "failed";
                }
                if (!this.j) {
                    LogUtil.record(4, "MspPayResult:formatResult", "not set endcode, this=".concat(String.valueOf(this)));
                    try {
                        MspTradeContext mspTradeContext2 = this.f3719a;
                        if (mspTradeContext2 != null) {
                            this.b.write(mspTradeContext2.getMspNetHandler().getErrorCode());
                        }
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                        DynDataWrapper<String> dynDataWrapper = this.b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(ResultStatus.PAY_NETWORK_ERROR.getStatus());
                        dynDataWrapper.write(sb3.toString());
                    }
                    if (TextUtils.isEmpty(this.b.read())) {
                        DynDataWrapper<String> dynDataWrapper2 = this.b;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(ResultStatus.CANCELED.getStatus());
                        dynDataWrapper2.write(sb4.toString());
                    }
                    if (TextUtils.isEmpty(this.d.read())) {
                        this.d.write(MspConfig.getInstance().getMemoUserCancel());
                    }
                    this.j = true;
                    MspTradeContext mspTradeContext3 = this.f3719a;
                    if (mspTradeContext3 != null && (tradeLogicData2 = mspTradeContext3.getTradeLogicData()) != null && !TextUtils.isEmpty(tradeLogicData2.getTradeNo()) && OrderInfoUtil.isCreateOrderRequest(this.f3719a)) {
                        this.i = tradeLogicData2.getTradeNo();
                        LogUtil.record(4, "MspPayResult:formatResultModel", "trade_no=" + this.i);
                    }
                } else {
                    int indexOf = this.c.read().indexOf(MspGlobalDefine.CALL_BACK_URL);
                    if (indexOf != -1) {
                        int indexOf2 = this.c.read().indexOf("\"", indexOf) + 1;
                        int indexOf3 = this.c.read().indexOf("\"", indexOf2);
                        if (indexOf2 > 0 && indexOf3 > indexOf2) {
                            this.h = this.c.read().substring(indexOf2, indexOf3);
                        }
                    }
                    if (!TextUtils.isEmpty(this.c.read())) {
                        DynDataWrapper<String> dynDataWrapper3 = this.c;
                        dynDataWrapper3.write(dynDataWrapper3.read().replaceAll("(\".*);(.*\")", "$1-$2"));
                    }
                    MspTradeContext mspTradeContext4 = this.f3719a;
                    if (!(mspTradeContext4 == null || mspTradeContext4.getContext() == null || !OrderInfoUtil.isCreateOrderRequest(this.f3719a) || (tradeLogicData = this.f3719a.getTradeLogicData()) == null || TextUtils.isEmpty(tradeLogicData.getTradeNo()))) {
                        this.i = tradeLogicData.getTradeNo();
                    }
                    long openTime = LogAgent.getOpenTime();
                    if (openTime > 0) {
                        this.f = String.valueOf(openTime);
                    }
                    long renderTime = LogAgent.getRenderTime();
                    if (renderTime > 0) {
                        this.g = String.valueOf(renderTime);
                    }
                }
                try {
                    sb.append("resultStatus={");
                    sb.append(this.b.read());
                    sb.append("}");
                    sb.append(";");
                    sb.append("memo={");
                    sb.append(this.d.read());
                    sb.append("}");
                    sb.append(";");
                    sb.append("result={");
                    sb.append(this.c.read());
                    sb.append("}");
                    if (!TextUtils.isEmpty(this.h)) {
                        try {
                        } catch (Exception e2) {
                            LogUtil.printExceptionStackTrace(e2);
                        }
                        if (!this.h.startsWith("http%3A%2F%2F")) {
                            if (this.h.startsWith("https%3A%2F%2F")) {
                            }
                            sb.append(";callBackUrl={");
                            sb.append(this.h);
                            sb.append("}");
                        }
                        this.h = URLDecoder.decode(this.h, "utf-8");
                        sb.append(";callBackUrl={");
                        sb.append(this.h);
                        sb.append("}");
                    }
                    if (!TextUtils.isEmpty(this.i)) {
                        sb.append(";trade_no={");
                        sb.append(this.i);
                        sb.append("}");
                    }
                    if (!TextUtils.isEmpty(this.f)) {
                        sb.append(";openTime={");
                        sb.append(this.f);
                        sb.append("}");
                    }
                    if (!TextUtils.isEmpty(this.g)) {
                        sb.append(";renderTime={");
                        sb.append(this.g);
                        sb.append("}");
                    }
                    if (this.e.keySet().iterator().hasNext()) {
                        sb.append(";extendInfo={");
                        sb.append(this.e.toJSONString());
                        sb.append("}");
                        LogUtil.record(4, "MspPayResult:formatResult", "extendInfo:" + this.e);
                    }
                } catch (Exception e3) {
                    sb = new StringBuilder(this.c.read());
                    LogUtil.printExceptionStackTrace(e3);
                }
                LogUtil.record(4, "MspPayResult.retVal", "where=" + i + " retVal:" + ((Object) sb));
                return sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
