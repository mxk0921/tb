package com.alibaba.android.split.core.plugin.fake;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FakeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380208);
    }

    public static /* synthetic */ Object ipc$super(FakeService fakeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/plugin/fake/FakeService");
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
