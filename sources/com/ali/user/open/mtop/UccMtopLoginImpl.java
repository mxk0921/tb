package com.ali.user.open.mtop;

import android.text.TextUtils;
import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.util.MtopRemoteLogin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iby;
import tb.rid;
import tb.sih;
import tb.wih;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UccMtopLoginImpl implements rid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "ucc.taobaoMtopImpl";
    private String site;

    public UccMtopLoginImpl(String str) {
        this.site = str;
    }

    public static /* synthetic */ void access$000(UccMtopLoginImpl uccMtopLoginImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a6d61", new Object[]{uccMtopLoginImpl, str});
        } else {
            uccMtopLoginImpl.sendUT(str);
        }
    }

    private void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{this, str});
            return;
        }
        try {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_UccTaobaoMtopImpl", str, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.rid
    public sih getLoginContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sih) ipChange.ipc$dispatch("a65acccd", new Object[]{this});
        }
        sih sihVar = new sih();
        try {
            Session session = ((SessionService) AliMemberSDK.getService(SessionService.class)).getSession(getSite());
            if (session != null) {
                sihVar.c = session.nick;
                sihVar.b = session.hid;
                sihVar.f28073a = session.sid;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sihVar;
    }

    public String getSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8630f5c", new Object[]{this});
        }
        return this.site;
    }

    @Override // tb.rid
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue() : isSessionValid(getSite());
    }

    @Override // tb.rid
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isSessionValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        SDKLogger.e(TAG, "func isSessionValid");
        Session session = null;
        try {
            IpChange ipChange = MtopRemoteLogin.$ipChange;
            session = (Session) MtopRemoteLogin.class.getMethod("getSession", String.class).invoke(null, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (session == null || TextUtils.isEmpty(session.sid)) {
            SDKLogger.e(TAG, "isSessionValid()  session is null");
            return false;
        } else if (session.loginTime == 0 || session.expireIn == 0) {
            SDKLogger.e(TAG, "isSessionValid()  loginTime is 0 or expireIn is 0");
            return false;
        } else {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("isSessionValid()  ");
            sb.append(System.currentTimeMillis() / 1000 < session.expireIn);
            SDKLogger.e(str2, sb.toString());
            return System.currentTimeMillis() / 1000 < session.expireIn;
        }
    }

    @Override // tb.rid
    public void login(final iby ibyVar, boolean z) {
        sendUT("LOGIN_ENTER");
        if (z) {
            LoginCallback loginCallback = new LoginCallback() { // from class: com.ali.user.open.mtop.UccMtopLoginImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    String str2 = UccMtopLoginImpl.TAG;
                    SDKLogger.e(str2, "UCC_LOGIN_FAIL code=" + i);
                    if (ibyVar == null) {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_FAIL_NULL_LISTENER");
                    } else if (i == 10003) {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_CANCEL");
                        ((wih) ibyVar).c();
                    } else {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_FAIL");
                        ((wih) ibyVar).d();
                    }
                }

                @Override // com.ali.user.open.callback.LoginCallback
                public void onSuccess(Session session) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c5c8819", new Object[]{this, session});
                    } else if (ibyVar != null) {
                        UccMtopLoginImpl.access$000(UccMtopLoginImpl.this, "LOGIN_SUCCESS");
                        SDKLogger.e(UccMtopLoginImpl.TAG, "UCC_LOGIN_SUCCESS");
                        ((wih) ibyVar).e();
                    }
                }
            };
            try {
                IpChange ipChange = MtopRemoteLogin.$ipChange;
                MtopRemoteLogin.class.getMethod("login", String.class, LoginCallback.class).invoke(null, this.site, loginCallback);
            } catch (Throwable th) {
                th.printStackTrace();
                sendUT("LOGIN_FAIL_EXCEPTION");
                if (ibyVar != null) {
                    ((wih) ibyVar).d();
                }
            }
        } else if (ibyVar != null) {
            sendUT("LOGIN_FAIL_NOT_SHOWUI");
            ((wih) ibyVar).d();
        } else {
            sendUT("LOGIN_FAIL_NULL_LISTENER");
        }
    }
}
