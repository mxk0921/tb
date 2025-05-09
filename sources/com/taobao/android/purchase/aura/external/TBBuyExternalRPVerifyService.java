package com.taobao.android.purchase.aura.external;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ck;
import tb.k9r;
import tb.rbb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyExternalRPVerifyService implements k9r.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String UMBRELLA_BIZ = "ultronTrade";
    private static final String UMBRELLA_FEATURE_TYPE = "umbrella.ultron.submit";
    private static final String UMBRELLA_TAG_ID = "verifyFailure";
    private static final String UMBRELLA_TAG_VERSION = "1.0";
    private static final String VERIFY_CODE_NETWORK_ERROR = "-30";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends RPEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ k9r.d d;

        public a(TBBuyExternalRPVerifyService tBBuyExternalRPVerifyService, k9r.d dVar) {
            this.d = dVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/external/TBBuyExternalRPVerifyService$1");
        }

        @Override // com.alibaba.security.realidentity.RPEventListener
        public void onFinish(RPResult rPResult, String str, String str2) {
            String str3;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str, str2});
                return;
            }
            rbb g = ck.g();
            StringBuilder sb = new StringBuilder("code:");
            sb.append(TextUtils.isEmpty(str) ? "" : str);
            sb.append(",msg:");
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            sb.append(str2);
            g.b("TBBuyExternalRPVerifyService", "verify", sb.toString());
            boolean equals = TextUtils.equals(str, String.valueOf(RPResult.AUDIT_PASS.code));
            if (equals) {
                str3 = Localization.q(R.string.purchase_taobao_app_1029_1_19080);
            } else {
                if (TextUtils.equals(TBBuyExternalRPVerifyService.VERIFY_CODE_NETWORK_ERROR, str)) {
                    i = R.string.purchase_taobao_app_1029_1_19067;
                } else {
                    i = R.string.purchase_taobao_app_1029_1_19079;
                }
                str3 = Localization.q(i);
            }
            this.d.a(equals, str, str3);
        }
    }

    static {
        t2o.a(708837505);
        t2o.a(708837470);
    }

    @Override // tb.k9r.c
    public void verify(Context context, String str, k9r.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351fbf83", new Object[]{this, context, str, dVar});
        } else {
            RPVerify.startByNative(context, str, new a(this, dVar));
        }
    }
}
