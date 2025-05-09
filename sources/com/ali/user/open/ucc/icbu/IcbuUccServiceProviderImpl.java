package com.ali.user.open.ucc.icbu;

import android.content.Context;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.oauth.OauthService;
import com.ali.user.open.ucc.base.BaseUccServiceProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class IcbuUccServiceProviderImpl extends BaseUccServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(76546147);
    }

    public static /* synthetic */ Object ipc$super(IcbuUccServiceProviderImpl icbuUccServiceProviderImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/icbu/IcbuUccServiceProviderImpl");
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider
    public boolean isAuthByNative(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4750fede", new Object[]{this, context, str, map})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.open.ucc.base.BaseUccServiceProvider, com.ali.user.open.ucc.UccServiceProvider
    public void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            ((OauthService) AliMemberSDK.getService(OauthService.class)).refreshWhenLogin(Site.ICBU, str2, z);
        }
    }
}
