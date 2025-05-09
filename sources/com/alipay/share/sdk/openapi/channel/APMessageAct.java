package com.alipay.share.sdk.openapi.channel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APMessageAct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean sendToZFB(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70803120", new Object[]{context, str, bundle})).booleanValue();
        }
        return send(context, "alipays://platformapi/startapp?appId=20000167&actionType=outShare", str, bundle);
    }

    public static boolean send(Context context, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602cfc8b", new Object[]{context, str, str2, bundle})).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("APSDK.APMessageAct", "send fail, invalid arguments");
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, Constant.SDK_VERSION);
        intent.putExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME, packageName);
        intent.putExtra(Constant.EXTRA_MESSAGE_CONTENT, str2);
        intent.putExtra("actionType", ShareConstant.OUT_SHARE_ACTION_TYPE);
        intent.putExtra(Constant.EXTRA_MESSAGE_CHECK_SUM, MMessageUtil.checkSum(str2, packageName));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            new StringBuilder("send alipay message, intent=").append(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Log.e("APSDK.APMessageAct", "send fail, target ActivityNotFound");
            return false;
        } catch (Exception e) {
            Log.e("APSDK.APMessageAct", "send fail " + e.getMessage());
            return false;
        }
    }
}
