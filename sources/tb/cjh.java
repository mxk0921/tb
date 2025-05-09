package tb;

import android.app.Application;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.edlp.init.LoginReceiver;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.session.SessionManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17097a = false;

    static {
        t2o.a(1032847372);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5af4eb", new Object[]{application});
        } else if (!f17097a) {
            LoginReceiver loginReceiver = new LoginReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
            intentFilter.addAction(LoginAction.NOTIFY_LOGIN_CANCEL.name());
            intentFilter.addAction(LoginAction.NOTIFY_LOGOUT.name());
            intentFilter.addAction(SessionManager.NOTIFY_SESSION_VALID);
            application.registerReceiver(loginReceiver, intentFilter);
            f17097a = true;
        }
    }
}
