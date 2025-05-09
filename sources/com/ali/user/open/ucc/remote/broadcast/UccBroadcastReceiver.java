package com.ali.user.open.ucc.remote.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.open.cookies.CookieManagerWrapper;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.FileUtils;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginBroadcastReceiver";

    static {
        t2o.a(76546173);
    }

    public static /* synthetic */ Object ipc$super(UccBroadcastReceiver uccBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/remote/broadcast/UccBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            String action = intent.getAction();
            if (TextUtils.equals(action, UccResultAction.NOTIFY_UCC_LOGIN_SUCCESS.name())) {
                final String stringExtra = intent.getStringExtra("site");
                String stringExtra2 = intent.getStringExtra("process");
                if (ConfigManager.getInstance().isMultiProcessEnable && !TextUtils.isEmpty(stringExtra) && !TextUtils.equals(stringExtra2, CommonUtils.getProcessName(context))) {
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CookieManagerWrapper.INSTANCE.refreshCookie(stringExtra);
                            }
                        }
                    });
                }
            } else if (ConfigManager.getInstance().isMultiProcessEnable && TextUtils.equals(action, UccResultAction.NOTIFY_UCC_LOGOUT.name())) {
                final String stringExtra3 = intent.getStringExtra("site");
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CookieManagerWrapper.INSTANCE.clearCookies(stringExtra3);
                        }
                    }
                });
            } else if (!TextUtils.equals(action, LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS) && TextUtils.equals(action, LoginBroadcastReceiver.NOTIFY_LOGOUT)) {
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        CookieManagerWrapper cookieManagerWrapper = CookieManagerWrapper.INSTANCE;
                        cookieManagerWrapper.clearCookies("eleme", FileUtils.readFileData(KernelContext.getApplicationContext(), cookieManagerWrapper.getCoookieBackupFileNameBySite("eleme")));
                        ((OauthService) AliMemberSDK.getService(OauthService.class)).logoutAll(KernelContext.getApplicationContext());
                    }
                });
            }
        }
    }
}
