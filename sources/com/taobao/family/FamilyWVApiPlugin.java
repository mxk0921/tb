package com.taobao.family;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyWVApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_SOCIAL_FAMILY_DATA = "getSocialFamilyData";
    public static final String JS_BRIDGE_CLASSNAME = "TBSocialJsBridgeHandle";
    private static final String LOG_TAG = "FamilyWVApiPlugin";

    public static /* synthetic */ Object ipc$super(FamilyWVApiPlugin familyWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/FamilyWVApiPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.equals(ACTION_GET_SOCIAL_FAMILY_DATA)) {
            return false;
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            wVCallBackContext.error();
        } else if (FamilyManager.dataStoreComponent == null) {
            wVCallBackContext.error();
            return true;
        } else {
            String a2 = FamilyManager.dataStoreComponent.a(userId);
            nsw nswVar = new nsw();
            if (!TextUtils.isEmpty(a2)) {
                try {
                    nswVar.d("data", new JSONObject(a2));
                } catch (JSONException unused) {
                    nswVar.b("data", "{}");
                }
            } else {
                nswVar.b("data", "{}");
            }
            wVCallBackContext.success(nswVar);
        }
        return true;
    }
}
