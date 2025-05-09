package com.alipay.tianyan.mobilesdk.coco;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.coco.OreoServiceUnlimited;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OreoServiceUnlimitedService extends Service implements IOreoServiceUnlimited {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(OreoServiceUnlimitedService oreoServiceUnlimitedService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/tianyan/mobilesdk/coco/OreoServiceUnlimitedService");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!OreoServiceUnlimited.shouldUseIt(this)) {
            return null;
        }
        return new OreoServiceUnlimited.WrappedBinder(null, this);
    }
}
