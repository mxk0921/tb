package com.ali.user.mobile.base.helper;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.rpc.login.model.AliUserResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginDataHelperTask extends AsyncTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUserResponseData data;
    public Map<String, String> ext;
    public LoginReturnData loginData;
    public LoginBaseParam loginParam;
    private String nick;
    public boolean sendBroadcast;
    private SessionManager session;
    private String userId;
    public String loginType = "";
    public String loginAccount = "";

    static {
        t2o.a(69206073);
    }

    public LoginDataHelperTask(boolean z, LoginReturnData loginReturnData, LoginBaseParam loginBaseParam, Map<String, String> map) {
        this.sendBroadcast = z;
        this.loginData = loginReturnData;
        this.loginParam = loginBaseParam;
        this.ext = map;
        try {
            this.data = (AliUserResponseData) JSON.parseObject(loginReturnData.data, AliUserResponseData.class);
            this.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void access$000(LoginDataHelperTask loginDataHelperTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421f70f", new Object[]{loginDataHelperTask});
        } else {
            loginDataHelperTask.addCookie2SidCompare();
        }
    }

    public static /* synthetic */ SessionManager access$100(LoginDataHelperTask loginDataHelperTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionManager) ipChange.ipc$dispatch("a5614671", new Object[]{loginDataHelperTask});
        }
        return loginDataHelperTask.session;
    }

    public static /* synthetic */ AliUserResponseData access$200(LoginDataHelperTask loginDataHelperTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserResponseData) ipChange.ipc$dispatch("39b2f488", new Object[]{loginDataHelperTask});
        }
        return loginDataHelperTask.data;
    }

    private void addCookie2SidCompare() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1123690b", new Object[]{this});
            return;
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        String cookie = instance.getCookie(".taobao.com");
        try {
            LoginTLogAdapter.e("login_optimize", ".taobao.com, cookieStr=" + cookie);
            LoginTLogAdapter.e("login_optimize", "https://.taobao.com , cookieStr=" + instance.getCookie("https://.taobao.com"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!TextUtils.isEmpty(cookie)) {
            String[] split = cookie.split(";");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.trim().startsWith("cookie2=")) {
                    str = str2.split("=")[1];
                    break;
                }
                i++;
            }
            if (TextUtils.equals(this.session.getSid(), str)) {
                LoginTLogAdapter.e("addCookie2SidCompare", "checkCookieSucceed");
                UserTrackAdapter.sendUT("checkCookieSucceed");
                return;
            }
        }
        LoginTLogAdapter.e("addCookie2SidCompare", "checkCookieFailed");
        UserTrackAdapter.sendUT("checkCookieFailed");
    }

    public static /* synthetic */ Object ipc$super(LoginDataHelperTask loginDataHelperTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/base/helper/LoginDataHelperTask");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
            return;
        }
        LoginDataHelper.sendLoginResultBroadcast(this.sendBroadcast, this.userId, this.nick, this.loginParam, this.loginData, this.data, this.loginType, this.loginAccount);
        LoginTLogAdapter.e("login_optimize", "onPostExecute end：" + System.currentTimeMillis());
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a6298", new Object[]{this});
        } else {
            LoginDataHelper.beforeProcessLoginData(this.sendBroadcast, this.data);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[Catch: all -> 0x015f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0060, blocks: (B:7:0x0032, B:9:0x0049, B:11:0x0055, B:14:0x0063, B:16:0x0067, B:18:0x0073, B:19:0x007d, B:21:0x0081, B:22:0x008f, B:24:0x0093, B:25:0x009d, B:27:0x00a4, B:29:0x00ae, B:44:0x010d, B:45:0x0110, B:48:0x0164, B:47:0x015b), top: B:56:0x0032 }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void doInBackground(java.lang.Object... r24) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.base.helper.LoginDataHelperTask.doInBackground(java.lang.Object[]):java.lang.Void");
    }
}
