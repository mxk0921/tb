package com.honor.push.sdk.mapi.notification;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NotificationStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f5227a;
    public int b;
    public String c;
    public PendingIntent d;

    public NotificationStatus(int i, int i2, String str) {
        this.f5227a = i;
        this.b = i2;
        this.c = str;
    }

    public int getErrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("374a7336", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String getErrMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbb17367", new Object[]{this});
        }
        return this.c;
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue();
        }
        return this.f5227a;
    }

    public void startResolutionForResult(Activity activity, int i) {
        PendingIntent pendingIntent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6728f352", new Object[]{this, activity, new Integer(i)});
        } else if (this.f5227a == 10001 && activity != null && (pendingIntent = this.d) != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public NotificationStatus(Bundle bundle) {
        this.f5227a = 10002;
        this.b = 8003002;
        this.c = "";
        if (bundle != null) {
            this.f5227a = bundle.getInt("stateCode", 10002);
            this.b = bundle.getInt("errorCode", this.b);
            this.c = bundle.getString("errorMessage");
            this.d = (PendingIntent) bundle.getParcelable("data");
        }
    }
}
