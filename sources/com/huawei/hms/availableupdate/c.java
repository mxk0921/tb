package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    public static final c b = new c();

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f5282a;

    public boolean a(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity a2 = a();
        if (a2 == null || a2.isFinishing()) {
            this.f5282a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.i("UpdateAdapterMgr", "finish one");
        return false;
    }

    public void b(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity a2 = a();
        if (activity != null && activity.equals(a2)) {
            HMSLog.i("UpdateAdapterMgr", DMComponent.RESET);
            this.f5282a = null;
        }
    }

    private Activity a() {
        WeakReference<Activity> weakReference = this.f5282a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
