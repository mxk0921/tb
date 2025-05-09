package com.taobao.themis.web.solution;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWaitUCReadyStep$onExecuting$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Runnable $task;
    public final /* synthetic */ AtomicBoolean $taskHasRun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWaitUCReadyStep$onExecuting$3(AtomicBoolean atomicBoolean, Runnable runnable) {
        super(0);
        this.$taskHasRun = atomicBoolean;
        this.$task = runnable;
    }

    public static /* synthetic */ Object ipc$super(TMSWaitUCReadyStep$onExecuting$3 tMSWaitUCReadyStep$onExecuting$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSWaitUCReadyStep$onExecuting$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (!this.$taskHasRun.get()) {
            CommonExtKt.l(this.$task);
            TMSLogger.b("TMSWaitUCReadyStep", "wait UC timeout, create page directly");
        }
        this.$task.run();
    }
}
