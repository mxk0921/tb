package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DialogActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile DialogActivityHelper b;

    /* renamed from: a  reason: collision with root package name */
    public Activity f4472a;

    public static DialogActivityHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogActivityHelper) ipChange.ipc$dispatch("d363e7b6", new Object[0]);
        }
        if (b == null) {
            synchronized (DialogActivityHelper.class) {
                try {
                    if (b == null) {
                        b = new DialogActivityHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public WeakReference<Activity> getDialogActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c361d642", new Object[]{this});
        }
        return new WeakReference<>(this.f4472a);
    }

    public void updateDialogActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9490239", new Object[]{this, activity});
        } else {
            this.f4472a = activity;
        }
    }
}
