package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.zk9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/taobao/message/kit/util/BundleSplitUtil$checkClazzReady$1", "Ltb/zk9$i;", "Ljava/lang/Class;", "aClass", "Ltb/xhv;", "onClassLoaded", "(Ljava/lang/Class;)V", "onClassNotFound", "()V", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BundleSplitUtil$checkClazzReady$1 implements zk9.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $clazzName;
    public final /* synthetic */ g1a $onFailure;
    public final /* synthetic */ g1a $onSuccess;
    public final /* synthetic */ long $start;
    public final /* synthetic */ boolean $withInit;

    public BundleSplitUtil$checkClazzReady$1(long j, String str, boolean z, g1a g1aVar, g1a g1aVar2) {
        this.$start = j;
        this.$clazzName = str;
        this.$withInit = z;
        this.$onSuccess = g1aVar;
        this.$onFailure = g1aVar2;
    }

    @Override // tb.zk9.i
    public void onClassLoaded(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            return;
        }
        ckf.h(cls, "aClass");
        RemoteMonitorUtil remoteMonitorUtil = RemoteMonitorUtil.INSTANCE;
        String cls2 = cls.toString();
        ckf.c(cls2, "aClass.toString()");
        remoteMonitorUtil.remoteClazzStat(System.currentTimeMillis() - this.$start, cls2);
        RemoteMonitorUtil.remoteClazzAlarm$default(remoteMonitorUtil, true, this.$clazzName, null, null, 12, null);
        TLog.loge(BundleSplitUtil.TAG, "onClassLoaded" + cls);
        if (this.$withInit) {
            FeatureInitHelper.directInit(new BundleSplitUtil$checkClazzReady$1$onClassLoaded$1(this, cls));
        } else {
            this.$onSuccess.invoke(cls);
        }
    }

    @Override // tb.zk9.i
    public void onClassNotFound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            return;
        }
        RemoteMonitorUtil.remoteClazzAlarm$default(RemoteMonitorUtil.INSTANCE, false, this.$clazzName, null, null, 12, null);
        TLog.loge(BundleSplitUtil.TAG, "onClassNotFound");
        g1a g1aVar = this.$onFailure;
        g1aVar.invoke("onClassNotFound" + this.$clazzName);
    }
}
