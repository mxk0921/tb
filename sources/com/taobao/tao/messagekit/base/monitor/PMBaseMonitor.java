package com.taobao.tao.messagekit.base.monitor;

import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class PMBaseMonitor extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCommitted = false;

    static {
        t2o.a(628097096);
    }

    public static /* synthetic */ Object ipc$super(PMBaseMonitor pMBaseMonitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/PMBaseMonitor");
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        if (this.isCommitted) {
            return false;
        }
        this.isCommitted = true;
        return true;
    }
}
