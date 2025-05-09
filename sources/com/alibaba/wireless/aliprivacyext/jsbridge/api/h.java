package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.g01;
import tb.mwx;
import tb.osx;
import tb.pwx;

/* compiled from: Taobao */
@c(name = {"setAuthStatusByScenes"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class h extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends HashMap<String, Object> {
        public final /* synthetic */ PrivacyCode val$resultCode;

        public a(PrivacyCode privacyCode) {
            this.val$resultCode = privacyCode;
            put("resultCode", privacyCode.toString());
        }
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/h");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        try {
            PrivacyAuthSetParam privacyAuthSetParam = (PrivacyAuthSetParam) mwx.i(str2, PrivacyAuthSetParam.class);
            if (!(privacyAuthSetParam == null || privacyAuthSetParam.getAuthSetParams() == null || privacyAuthSetParam.getAuthSetParams().isEmpty())) {
                c(pwxVar, "调用成功", new a(AliPrivacyCore.v(context, privacyAuthSetParam, "h5")));
                return true;
            }
            a(pwxVar, "参数异常", null);
            return true;
        } catch (Throwable th) {
            g01.d("h", "", th);
            a(pwxVar, osx.d, null);
            return true;
        }
    }
}
