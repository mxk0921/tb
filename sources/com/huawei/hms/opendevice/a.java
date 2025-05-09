package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements Callable<AAIDResult> {

    /* renamed from: a  reason: collision with root package name */
    private Context f5416a;

    public a(Context context) {
        this.f5416a = context;
    }

    /* renamed from: a */
    public AAIDResult call() throws Exception {
        Context context = this.f5416a;
        if (context != null) {
            String b = b.b(context);
            AAIDResult aAIDResult = new AAIDResult();
            aAIDResult.setId(b);
            return aAIDResult;
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }
}
