package com.taobao.themis.kernel.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class CommonExtKt$handler$2 extends Lambda implements d1a<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CommonExtKt$handler$2 INSTANCE = new CommonExtKt$handler$2();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Process.setThreadPriority(-8);
            } catch (Throwable th) {
                TMSLogger.c("asyncThread", "setThreadPriority error", th);
            }
        }
    }

    public CommonExtKt$handler$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(CommonExtKt$handler$2 commonExtKt$handler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/utils/CommonExtKt$handler$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Handler invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this});
        }
        HandlerThread handlerThread = new HandlerThread("tms_async_thread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        handler.post(a.INSTANCE);
        return handler;
    }
}
