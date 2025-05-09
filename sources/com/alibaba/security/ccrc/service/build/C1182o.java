package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimerTask;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.o  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1182o extends TimerTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Future f2610a;

    public C1182o(Future future) {
        this.f2610a = future;
    }

    public static /* synthetic */ Object ipc$super(C1182o oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/o");
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f2610a.cancel(true);
        }
    }
}
