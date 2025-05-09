package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.bdq;
import tb.ckf;
import tb.d1a;
import tb.edq;
import tb.g1a;
import tb.ucq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/taobao/message/kit/util/BundleSplitUtil$checkMsgBundleReady$listener$1", "Ltb/edq;", "Ltb/bdq;", "state", "Ltb/xhv;", "onStateUpdate", "(Ltb/bdq;)V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BundleSplitUtil$checkMsgBundleReady$listener$1 implements edq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BundleListing.a $bundleInfo;
    public final /* synthetic */ ucq $manager;
    public final /* synthetic */ g1a $onFailure;
    public final /* synthetic */ g1a $onProgress;
    public final /* synthetic */ d1a $onSuccess;
    public final /* synthetic */ String $source;
    public final /* synthetic */ long $start;
    public final /* synthetic */ boolean $withInit;

    public BundleSplitUtil$checkMsgBundleReady$listener$1(BundleListing.a aVar, g1a g1aVar, long j, String str, ucq ucqVar, boolean z, d1a d1aVar, g1a g1aVar2) {
        this.$bundleInfo = aVar;
        this.$onProgress = g1aVar;
        this.$start = j;
        this.$source = str;
        this.$manager = ucqVar;
        this.$withInit = z;
        this.$onSuccess = d1aVar;
        this.$onFailure = g1aVar2;
    }

    public void onStateUpdate(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            return;
        }
        ckf.h(bdqVar, "state");
        if (bdqVar.f().contains(this.$bundleInfo.c)) {
            int i = bdqVar.i();
            if (i == 2) {
                TLog.loge(BundleSplitUtil.TAG, "DOWNLOADING:" + bdqVar.a() + ';' + bdqVar.j());
                g1a g1aVar = this.$onProgress;
                if (g1aVar != null) {
                    xhv xhvVar = (xhv) g1aVar.invoke(Integer.valueOf(((int) (((float) bdqVar.a()) * 0.98f)) + 1));
                }
            } else if (i == 4) {
                TLog.loge(BundleSplitUtil.TAG, "INSTALLING");
            } else if (i == 5) {
                TLog.loge(BundleSplitUtil.TAG, "INSTALLED");
                RemoteMonitorUtil remoteMonitorUtil = RemoteMonitorUtil.INSTANCE;
                remoteMonitorUtil.remoteInstallStat(System.currentTimeMillis() - this.$start, this.$source);
                RemoteMonitorUtil.remoteInstallAlarm$default(remoteMonitorUtil, true, this.$source, null, null, 12, null);
                this.$manager.e(this);
                if (this.$withInit) {
                    FeatureInitHelper.directInit(new BundleSplitUtil$checkMsgBundleReady$listener$1$onStateUpdate$1(this));
                } else {
                    this.$onSuccess.invoke();
                }
            } else if (i == 6) {
                TLog.loge(BundleSplitUtil.TAG, "FAILED");
                RemoteMonitorUtil.remoteInstallAlarm$default(RemoteMonitorUtil.INSTANCE, false, this.$source, null, null, 12, null);
                this.$manager.e(this);
                this.$onFailure.invoke("msg init failed");
            }
        }
    }
}
