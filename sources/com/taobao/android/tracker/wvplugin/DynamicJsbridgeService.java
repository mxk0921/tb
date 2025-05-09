package com.taobao.android.tracker.wvplugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ihc;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicJsbridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(455082046);
        t2o.a(989856204);
    }

    public static /* synthetic */ Object ipc$super(DynamicJsbridgeService dynamicJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/wvplugin/DynamicJsbridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && str.equals("DynamicTracker")) {
            return DynamicTrackerPlugin.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
