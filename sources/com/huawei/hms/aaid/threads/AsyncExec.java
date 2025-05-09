package com.huawei.hms.aaid.threads;

import android.util.Log;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.opendevice.o;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AsyncExec {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f5234a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c("SeqIO"), new ThreadPoolExecutor.AbortPolicy());

    public static void submitSeqIO(Runnable runnable) {
        try {
            f5234a.execute(new o(runnable));
        } catch (Exception e) {
            Log.e("HmsPushThreads", "submit seq io task failed, Exception:" + e);
        }
    }
}
