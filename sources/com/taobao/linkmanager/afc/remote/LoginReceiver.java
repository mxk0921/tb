package com.taobao.linkmanager.afc.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.ah0;
import tb.cmp;
import tb.i6j;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements i6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f10913a;

        public a(LoginReceiver loginReceiver, Context context) {
            this.f10913a = context;
        }

        @Override // tb.i6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            vp9.a("linkx", "LoginReceiver === reportLogin: onSuccess：" + jSONObject);
            LoginBroadcastHelper.unregisterLoginReceiver(this.f10913a, b.f10914a);
        }

        @Override // tb.i6j
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            vp9.b("linkx", "LoginReceiver === reportLogin: onError：" + jSONObject);
            LoginBroadcastHelper.unregisterLoginReceiver(this.f10913a, b.f10914a);
        }

        @Override // tb.i6j
        public void c(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7369b0e", new Object[]{this, mtopResponse, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final LoginReceiver f10914a = new LoginReceiver();

        static {
            t2o.a(744489026);
        }
    }

    static {
        t2o.a(744489024);
    }

    public static /* synthetic */ Object ipc$super(LoginReceiver loginReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/remote/LoginReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null && intent.getAction() != null && (valueOf = LoginAction.valueOf(intent.getAction())) == LoginAction.NOTIFY_LOGIN_SUCCESS) {
            a(context, valueOf);
        }
    }

    public void a(Context context, LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde858a8", new Object[]{this, context, loginAction});
            return;
        }
        String userId = Login.getUserId();
        String str = (String) cmp.b(context).a("afc_login_user", "");
        vp9.a("linkx", "LoginReceiver === reportLogin: action：" + loginAction + " 本地ID：" + str + " 当前id：" + userId);
        HashMap hashMap = new HashMap();
        hashMap.put("userid", userId);
        ah0.d("afc_login_report", "", "", hashMap);
        if (!TextUtils.equals(str, userId)) {
            if (!TextUtils.isEmpty(userId)) {
                cmp.b(context).d("afc_login_user", userId);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("deviceID", AfcUtils.j(context, false));
            hashMap2.put("deviceID2", TFCCommonUtils.k(context));
            hashMap2.put(LoggingSPCache.STORAGE_USERID, Login.getUserId());
            vp9.a("linkx", "LoginReceiver === reportLogin === 参数Map == " + hashMap2.toString());
            TBLinkRequest.getInstance().sendRequest(TBLinkRequest.LOGIN_REPORT, "1.0", hashMap2, false, new a(this, context));
        }
    }
}
