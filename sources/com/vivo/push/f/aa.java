package com.vivo.push.f;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.m;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.ab;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.security.PublicKey;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class aa extends s {
    protected PushMessageCallback b;
    private int c = 0;

    public aa(v vVar) {
        super(vVar);
    }

    public final void a(PushMessageCallback pushMessageCallback) {
        this.b = pushMessageCallback;
    }

    public final int b() {
        NotificationChannel notificationChannel;
        int importance;
        boolean areNotificationsEnabled;
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return 0;
        }
        NotificationManager notificationManager = (NotificationManager) this.f14645a.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            areNotificationsEnabled = notificationManager.areNotificationsEnabled();
            if (!areNotificationsEnabled) {
                return 2104;
            }
        }
        if (i < 26 || notificationManager == null) {
            return 0;
        }
        try {
            notificationChannel = notificationManager.getNotificationChannel(NotifyAdapterUtil.PRIMARY_CHANNEL);
            if (notificationChannel == null) {
                return 0;
            }
            importance = notificationChannel.getImportance();
            return importance == 0 ? 2121 : 0;
        } catch (Exception unused) {
            u.b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
            return 0;
        }
    }

    public final int c() {
        return this.c;
    }

    public final boolean a(PublicKey publicKey, String str, String str2) {
        if (!m.a().d()) {
            u.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        } else if (publicKey == null) {
            u.d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            u.d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                u.d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
                if (ab.a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                    u.d("OnVerifyCallBackCommand", "vertify id is success");
                    return true;
                }
                u.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(str));
                u.c(this.f14645a, "vertify fail srcDigest is ".concat(str));
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                u.d("OnVerifyCallBackCommand", "vertify exception");
                return false;
            }
        } else {
            u.d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
    }

    public final int a(NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        if (notifyArriveCallbackByUser == null) {
            u.b("OnVerifyCallBackCommand", "pkg name : " + this.f14645a.getPackageName() + " 应用到达回调返回值为空，不做处理");
            u.b(this.f14645a, "应用到达回调返回值异常，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回正确的对象");
            return 2163;
        } else if (!notifyArriveCallbackByUser.isIntercept()) {
            return 0;
        } else {
            u.b("OnVerifyCallBackCommand", "pkg name : " + this.f14645a.getPackageName() + " 应用主动拦截通知");
            u.b(this.f14645a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            return 2120;
        }
    }

    public final void a(int i) {
        this.c = i;
    }
}
