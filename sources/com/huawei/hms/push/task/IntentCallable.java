package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IntentCallable implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    private Context f5456a;
    private Intent b;
    private String c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f5456a = context;
        this.b = intent;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f5456a.sendBroadcast(this.b);
        PushBiUtil.reportExit(this.f5456a, PushNaming.SET_NOTIFY_FLAG, this.c, ErrorEnum.SUCCESS);
        return null;
    }
}
