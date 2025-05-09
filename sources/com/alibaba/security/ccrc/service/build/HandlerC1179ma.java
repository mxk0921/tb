package com.alibaba.security.ccrc.service.build;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ma  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HandlerC1179ma extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1181na f2606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1179ma(C1181na naVar, Looper looper) {
        super(looper);
        this.f2606a = naVar;
    }

    public static /* synthetic */ Object ipc$super(HandlerC1179ma maVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/ma");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 4096) {
            this.f2606a.c();
            C1181na.a(this.f2606a);
        }
    }
}
