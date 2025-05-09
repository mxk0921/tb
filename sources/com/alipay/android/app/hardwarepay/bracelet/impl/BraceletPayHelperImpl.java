package com.alipay.android.app.hardwarepay.bracelet.impl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPayHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BraceletPayHelperImpl extends BraceletPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IAuthenticator f;

    public static /* synthetic */ IAuthenticator access$000(BraceletPayHelperImpl braceletPayHelperImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("52253a35", new Object[]{braceletPayHelperImpl});
        }
        return braceletPayHelperImpl.f;
    }

    public static /* synthetic */ Object ipc$super(BraceletPayHelperImpl braceletPayHelperImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/hardwarepay/bracelet/impl/BraceletPayHelperImpl");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPayHelper
    public int initHardwarePay(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4680a9af", new Object[]{this, context, new Integer(i), str})).intValue();
        }
        if (this.f == null) {
            this.f = AuthenticatorFactory.create(context, i);
        }
        return this.f.init(context, null, MspContextUtil.getUserId());
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPayHelper
    public void process(int i, int i2, String str, int i3, final Object obj, final Context context) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa1329", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3), obj, context});
            return;
        }
        final AuthenticatorCallback authenticatorCallback = new AuthenticatorCallback() { // from class: com.alipay.android.app.hardwarepay.bracelet.impl.BraceletPayHelperImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                String str3;
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", (Object) Integer.valueOf(authenticatorResponse.getType()));
                    jSONObject.put("result", (Object) Integer.valueOf(authenticatorResponse.getResult()));
                    jSONObject.put("message", (Object) authenticatorResponse.getResultMessage());
                    String str4 = "";
                    switch (authenticatorResponse.getType()) {
                        case 8:
                        case 9:
                        case 10:
                            jSONObject.put("data", (Object) authenticatorResponse.getData());
                            if (authenticatorResponse.getResgistedTokens() != null && authenticatorResponse.getResgistedTokens().size() > 0) {
                                str4 = authenticatorResponse.getResgistedTokens().get(0);
                                jSONObject.put("tokenId", (Object) str4);
                            }
                            if (authenticatorResponse.getType() == 9) {
                                str3 = MspGlobalDefine.BL_AUTHENTICATE_ACTION;
                            } else {
                                str3 = (authenticatorResponse.getType() == 10 || authenticatorResponse.getType() != 8) ? null : MspGlobalDefine.BL_REGISTER_ACTION;
                            }
                            if (str3 != null) {
                                Intent intent = new Intent(str3);
                                intent.putExtra("result", jSONObject.toString());
                                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                            }
                            StringBuilder sb = new StringBuilder("[BraceletPayHelperImpl]手环支付");
                            sb.append(authenticatorResponse.getType());
                            sb.append("回调： result:");
                            sb.append(authenticatorResponse.getResult());
                            sb.append(" tokenId:");
                            sb.append(str4);
                            sb.append(" message:");
                            sb.append(authenticatorResponse.getResultMessage());
                            sb.append(" data:");
                            sb.append(authenticatorResponse.getData());
                            sb.append(" callback ");
                            if (obj == null) {
                                z = true;
                            }
                            sb.append(z);
                            LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPayHelperImpl.process", sb.toString());
                            return;
                        default:
                            throw new Exception("Shouldn't execute to there.");
                    }
                } catch (Exception e) {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, e.getClass().getName(), e);
                    LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPayHelperImpl.process", "指纹支付走到了不应该走的地方: " + e.getMessage());
                }
            }
        };
        if (TextUtils.isEmpty(str) || !str.contains("[extraPara:")) {
            str2 = null;
        } else {
            str2 = str.substring(str.indexOf("[extraPara:") + 11, str.length() - 1);
            str = str.substring(0, str.indexOf("[extraPara:"));
        }
        final AuthenticatorMessage authenticatorMessage = new AuthenticatorMessage(i, i2, str);
        authenticatorMessage.setExtraParams(str2);
        LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPayHelper.process", "[BraceletPayHelperImpl]手环支付连接type:" + i + "   数据:" + str + " extraPara:" + str2);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.hardwarepay.bracelet.impl.BraceletPayHelperImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BraceletPayHelperImpl.access$000(BraceletPayHelperImpl.this).init(context, null, MspContextUtil.getUserId());
                BraceletPayHelperImpl.access$000(BraceletPayHelperImpl.this).process(authenticatorMessage, authenticatorCallback);
            }
        });
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper
    public void reflectCallBack(Object obj, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1b088", new Object[]{this, obj, new Integer(i), str});
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPayHelper
    public String[] getAuthInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ddd1cb82", new Object[]{this});
        }
        AuthInfo authInfo = this.f.getAuthInfo();
        if (authInfo == null) {
            return null;
        }
        String[] strArr = {String.valueOf(authInfo.getType()), String.valueOf(authInfo.getVendor()), authInfo.getPhoneModle(), String.valueOf(authInfo.getProtocolVersion()), String.valueOf(authInfo.getProtocolType()), authInfo.getDownloadUrl(), this.f.getDeviceId()};
        LogUtil.record(1, "phonecashiermsp#bracelet", "BraceletPayHelperImpl.getAuthInfo", "手环authinfo[AUTH_TYPE:" + strArr[0] + "][VENDOR:" + strArr[1] + "][PROTOCOL_VERSION:" + strArr[3] + "][PROTOCOL_TYPE:" + strArr[4] + "][DEVICE_ID:" + strArr[6] + "][BL_DOWNLOAD_URL:" + strArr[5] + "]");
        return strArr;
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.old.bracelet.BraceletPayHelper
    public String process(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("56a83f14", new Object[]{this, new Integer(i), str, new Integer(i2)}) : this.f.process(new AuthenticatorMessage(i2, i, str));
    }
}
