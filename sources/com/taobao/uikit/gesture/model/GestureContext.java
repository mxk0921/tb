package com.taobao.uikit.gesture.model;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<Activity> mActivity;
    private String url;

    static {
        t2o.a(933232669);
    }

    public GestureContext(Activity activity) {
        this.mActivity = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.url = intent.getDataString();
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.mActivity.get();
    }

    public String getActivityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3792a849", new Object[]{this});
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            return activity.getClass().getName();
        }
        return "";
    }
}
