package com.huawei.hms.push.plugin.notification;

import android.app.Activity;
import android.content.IntentSender;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.client.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NotificationStatus extends Result {
    @Packed

    /* renamed from: a  reason: collision with root package name */
    private int f5451a = -1;

    public int getRetCode() {
        return this.f5451a;
    }

    public boolean hasResolution() {
        if (getStatus() == null || !getStatus().hasResolution()) {
            return false;
        }
        return true;
    }

    public void setRetCode(int i) {
        this.f5451a = i;
    }

    public void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (getStatus() != null && getStatus().hasResolution() && activity != null) {
            getStatus().startResolutionForResult(activity, i);
        }
    }
}
