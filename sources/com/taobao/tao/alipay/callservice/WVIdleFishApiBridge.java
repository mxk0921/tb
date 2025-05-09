package com.taobao.tao.alipay.callservice;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.ov2;
import tb.qpk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WVIdleFishApiBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f11895a;

        public a(WVIdleFishApiBridge wVIdleFishApiBridge, WVCallBackContext wVCallBackContext) {
            this.f11895a = wVCallBackContext;
        }

        public final void a(nsw nswVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cc8624e", new Object[]{this, nswVar, str, str2});
                return;
            }
            try {
                nswVar.d(str, new JSONObject(str2));
            } catch (JSONException unused) {
                nswVar.b(str, str2);
            }
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9ed3401", new Object[]{this, str, str2});
            } else if (this.f11895a != null) {
                nsw nswVar = new nsw();
                a(nswVar, "result", str2);
                a(nswVar, TBImageFlowMonitor.RESPONSE_CODE_MEASURE, str);
                this.f11895a.error(nswVar);
            }
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1937b995", new Object[]{this, str, str2});
            } else if (this.f11895a != null) {
                nsw nswVar = new nsw();
                a(nswVar, "result", str2);
                a(nswVar, TBImageFlowMonitor.RESPONSE_CODE_MEASURE, str);
                this.f11895a.success(nswVar);
            }
        }
    }

    private void alipayCallService(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3410db", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context context = this.mContext;
        if (context != null && (context instanceof Activity)) {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("bizType");
            String string2 = parseObject.getString(ov2.ALIPAY_SIGN_PARAMS);
            String string3 = parseObject.getString(ov2.ALIPAY_ACCOUNT_SITE);
            if (string != null && string2 != null) {
                callService((Activity) this.mContext, string, string2, string3, new a(this, wVCallBackContext));
            }
        }
    }

    private void callService(Activity activity, String str, String str2, String str3, qpk qpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b2eea4", new Object[]{this, activity, str, str2, str3, qpkVar});
        } else if (str != null && str2 != null) {
            ov2.c().f(activity, str, str2, str3, qpkVar);
        }
    }

    public static /* synthetic */ Object ipc$super(WVIdleFishApiBridge wVIdleFishApiBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/callservice/WVIdleFishApiBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"alipayCallService".equals(str)) {
            return false;
        }
        alipayCallService(str2, wVCallBackContext);
        return true;
    }
}
