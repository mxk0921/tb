package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final HMSExtLogger f5283a;
    private d b;

    public a(HMSExtLogger hMSExtLogger) {
        this.f5283a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context context, String str) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d dVar) {
        this.b = dVar;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String str, int i, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f5283a;
        if (hMSExtLogger != null) {
            if (i == 3) {
                hMSExtLogger.d(str2, str3);
            } else if (i == 4) {
                hMSExtLogger.i(str2, str3);
            } else if (i != 5) {
                hMSExtLogger.e(str2, str3);
            } else {
                hMSExtLogger.w(str2, str3);
            }
        }
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(str, i, str2, str3);
        }
    }
}
