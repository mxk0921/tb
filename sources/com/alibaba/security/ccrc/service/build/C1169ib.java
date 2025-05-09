package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ib  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1169ib implements MNNCVExecutor.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ nb f2598a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ AbstractC1172jb c;

    public C1169ib(AbstractC1172jb jbVar, nb nbVar, CountDownLatch countDownLatch) {
        this.c = jbVar;
        this.f2598a = nbVar;
        this.b = countDownLatch;
    }

    @Override // com.taobao.android.mnncv.MNNCVExecutor.h
    public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            return;
        }
        if (mRTRuntimeException != null) {
            StringBuilder a2 = Kb.a("[onCompletion] e:");
            a2.append(mRTRuntimeException.errorCode);
            Logging.e(AbstractC1172jb.f2600a, a2.toString(), mRTRuntimeException);
        }
        nb nbVar = this.f2598a;
        nbVar.f2609a = mRTRuntimeException;
        nbVar.b = map;
        this.b.countDown();
    }
}
