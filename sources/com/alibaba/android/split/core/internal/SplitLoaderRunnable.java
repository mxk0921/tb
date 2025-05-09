package com.alibaba.android.split.core.internal;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.List;
import tb.d62;
import tb.t2o;
import tb.um8;
import tb.wnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SplitLoaderRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final um8 excuteResultSenderProxy;
    private final List<Intent> intents;
    private wnc mLogger = (wnc) d62.b(wnc.class, "SplitLoaderRunnable");
    private final SplitLoaderInternal splitLoaderInternal;

    static {
        t2o.a(677380169);
    }

    public SplitLoaderRunnable(SplitLoaderInternal splitLoaderInternal, List<Intent> list, um8 um8Var) {
        this.splitLoaderInternal = splitLoaderInternal;
        this.intents = list;
        this.excuteResultSenderProxy = um8Var;
    }

    public List<Intent> getIntents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("92f4f81f", new Object[]{this});
        }
        return this.intents;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.mLogger.c("begain verified files.", new Object[0]);
            boolean verifySplitApksFromIntent = this.splitLoaderInternal.getSplitApkChecker().verifySplitApksFromIntent(this.intents);
            this.mLogger.c("after verified files--->:%s", Boolean.valueOf(verifySplitApksFromIntent));
            if (verifySplitApksFromIntent) {
                HashSet hashSet = new HashSet();
                for (Intent intent : this.intents) {
                    hashSet.add(intent.getStringExtra("split_id"));
                }
                this.splitLoaderInternal.emulate(this.excuteResultSenderProxy);
                return;
            }
            this.excuteResultSenderProxy.c();
            this.splitLoaderInternal.copyAndVerify(this.intents, this.excuteResultSenderProxy);
        } catch (Exception e) {
            this.mLogger.d(e, "Error checking verified files.", new Object[0]);
            this.excuteResultSenderProxy.e(10, -11, "Error checking verified files");
        }
    }
}
