package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect getInstance(Activity activity, Intent intent, int i) {
        return new DialogRedirectImpl(intent, activity, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                redirect();
                if (dialogInterface == null) {
                }
            } finally {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        } catch (Throwable unused) {
            HMSLog.e("DialogRedirect", "Failed to start resolution intent");
        }
    }

    public abstract void redirect();
}
