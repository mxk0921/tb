package com.taobao.themis.taobao.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import kotlin.Metadata;
import tb.a9s;
import tb.bbs;
import tb.ckf;
import tb.jcs;
import tb.t2o;
import tb.wzi;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/taobao/impl/TMSTBBizLaunchAdapter;", "Lcom/taobao/themis/kernel/adapter/IBizLaunchAdapter;", "<init>", "()V", "Ltb/bbs;", "instance", "Ltb/a9s;", wzi.LAUNCHER, "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "createBizLaunchStep", "(Ltb/bbs;Ltb/a9s;)Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBBizLaunchAdapter implements IBizLaunchAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249494);
        t2o.a(839909460);
    }

    @Override // com.taobao.themis.kernel.adapter.IBizLaunchAdapter
    public TMSBaseLaunchStep createBizLaunchStep(bbs bbsVar, a9s a9sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseLaunchStep) ipChange.ipc$dispatch("f1ac343b", new Object[]{this, bbsVar, a9sVar});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
        return new jcs(bbsVar, a9sVar);
    }
}
