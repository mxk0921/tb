package com.ali.user.open.ucc.alipay3;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.ucc.base.BaseUccServiceProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlipayUccServiceProviderImpl extends BaseUccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AlipayUccServiceProviderImpl";

    static {
        t2o.a(76546084);
    }

    public static /* synthetic */ Object ipc$super(AlipayUccServiceProviderImpl alipayUccServiceProviderImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/alipay3/AlipayUccServiceProviderImpl");
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider, com.ali.user.open.ucc.UccServiceProvider
    public void cleanUp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426bb0dd", new Object[]{this, context});
        } else {
            ((OauthService) AliMemberSDK.getService(OauthService.class)).logout(context, "alipay");
        }
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider
    public boolean isAuthByNative(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4750fede", new Object[]{this, context, str, map})).booleanValue();
        }
        if (map == null || !TextUtils.equals(map.get(ParamsConstants.Key.PARAM_FORCE_NATIVE), "1")) {
            return false;
        }
        return true;
    }
}
