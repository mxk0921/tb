package com.ali.user.open.mtop.rpc;

import android.text.TextUtils;
import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.ReflectionUtils;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.util.MtopRemoteLogin;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iby;
import tb.rid;
import tb.sih;
import tb.wih;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccTaobaoMtopImpl implements rid {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "ucc.taobaoMtopImpl";

    public static /* synthetic */ void access$000(UccTaobaoMtopImpl uccTaobaoMtopImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e096af76", new Object[]{uccTaobaoMtopImpl, str});
        } else {
            uccTaobaoMtopImpl.sendUT(str);
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
        return "taobao";
    }

    @Override // tb.rid
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.rid
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue() : isSessionValid(getSite());
    }

    @Override // tb.rid
    public void login(final iby ibyVar, boolean z) {
        sendUT("LOGIN_ENTER");
        if (z) {
            LoginCallback loginCallback = new LoginCallback() { // from class: com.ali.user.open.mtop.rpc.UccTaobaoMtopImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                    } else if (ibyVar == null) {
                        UccTaobaoMtopImpl.access$000(UccTaobaoMtopImpl.this, "LOGIN_FAIL_NULL_LISTENER");
                    } else if (i == 10003) {
                        UccTaobaoMtopImpl.access$000(UccTaobaoMtopImpl.this, "LOGIN_CANCEL");
                        ((wih) ibyVar).c();
                    } else {
                        UccTaobaoMtopImpl.access$000(UccTaobaoMtopImpl.this, "LOGIN_FAIL");
                        ((wih) ibyVar).d();
                    }
                }

                @Override // com.ali.user.open.callback.LoginCallback
                public void onSuccess(Session session) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c5c8819", new Object[]{this, session});
                    } else if (ibyVar != null) {
                        UccTaobaoMtopImpl.access$000(UccTaobaoMtopImpl.this, "LOGIN_SUCCESS");
                        ((wih) ibyVar).e();
                    }
                }
            };
            try {
                IpChange ipChange = MtopRemoteLogin.$ipChange;
                MtopRemoteLogin.class.getMethod("login", LoginCallback.class).invoke(null, "taobao", loginCallback);
            } catch (Throwable th) {
                th.printStackTrace();
                sendUT("LOGIN_FAIL_EXCEPTION");
                try {
                    ReflectionUtils.invoke("com.ali.user.open.tbauth.TbAuthServiceImpl", "auth", new String[]{"com.ali.user.open.callback.LoginCallback"}, Class.forName("com.ali.user.open.tbauth.TbAuthServiceImpl").newInstance(), new Object[]{loginCallback});
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    sendUT("LOGIN_FAIL_THROWABLE");
                }
            }
        } else if (ibyVar != null) {
            sendUT("LOGIN_FAIL_NOT_SHOWUI");
            ((wih) ibyVar).d();
        } else {
            sendUT("LOGIN_FAIL_NULL_LISTENER");
        }
    }

    public boolean isSessionValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0f9be5", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        SDKLogger.d(TAG, "func isSessionValid");
        SessionService sessionService = (SessionService) AliMemberSDK.getService(SessionService.class);
        if (sessionService == null) {
            SDKLogger.d(TAG, "isSessionValid()  service is null");
            return false;
        }
        Session session = sessionService.getSession(getSite());
        if (session == null || TextUtils.isEmpty(session.sid)) {
            SDKLogger.d(TAG, "isSessionValid()  session is null");
            return false;
        } else if (session.loginTime == 0 || session.expireIn == 0) {
            SDKLogger.d(TAG, "isSessionValid()  loginTime is 0 or expireIn is 0");
            return false;
        } else {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("isSessionValid()  ");
            sb.append(System.currentTimeMillis() / 1000 < session.expireIn);
            SDKLogger.d(str2, sb.toString());
            return System.currentTimeMillis() / 1000 < session.expireIn;
        }
    }
}
