package com.alipay.security.mobile.module.http.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceDataReponseModel extends BaseResponseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ILLEGAL_REQUEST = 3;
    public static final int NETFAIL = 2;
    public static final String SERVER_STATUS_ILLEGAL = "APPKEY_ERROR";
    public static final String SERVER_STATUS_OK = "SUCCESS";
    public static final int SUCCESS = 1;
    public String agentSwitch;
    public String apdid;
    public String bugTrackSwitch;
    public String dynamicKey;
    public String lastTimeApdidGenerated;
    public String timeInterval;
    public String token;
    public String webrtcUrl;
    public String apseDegrade = "";
    public String collectConfig = "";

    public static /* synthetic */ Object ipc$super(DeviceDataReponseModel deviceDataReponseModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/module/http/model/DeviceDataReponseModel");
    }

    public String getAgentSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e326576", new Object[]{this});
        }
        String str = this.agentSwitch;
        if (str == null) {
            return "0";
        }
        return str;
    }

    public boolean getLogSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbd786d", new Object[]{this})).booleanValue();
        }
        return "1".equals(this.bugTrackSwitch);
    }

    public int getRequestResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c66a550", new Object[]{this})).intValue();
        }
        if (this.success) {
            if (vux.c(this.apdid)) {
                return 2;
            }
            return 1;
        } else if (SERVER_STATUS_ILLEGAL.equals(this.resultCode)) {
            return 3;
        } else {
            return 2;
        }
    }
}
