package com.alibaba.security.ccrc.service.build;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Qa extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcBHService f2569a;

    public Qa(CcrcBHService ccrcBHService) {
        this.f2569a = ccrcBHService;
    }

    public static /* synthetic */ Object ipc$super(Qa qa, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/Qa");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Serializable serializableExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent.hasExtra("feature") && (serializableExtra = intent.getSerializableExtra("feature")) != null) {
            CcrcBHService.access$000(this.f2569a, serializableExtra);
        }
    }
}
