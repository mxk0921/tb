package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.hb  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1166hb implements MNNCVExecutor.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2596a;
    public final /* synthetic */ AbstractC1151cb b;
    public final /* synthetic */ AbstractC1172jb c;

    public C1166hb(AbstractC1172jb jbVar, String str, AbstractC1151cb cbVar) {
        this.c = jbVar;
        this.f2596a = str;
        this.b = cbVar;
    }

    @Override // com.taobao.android.mnncv.MNNCVExecutor.g
    public void onResult(MRTRuntimeException mRTRuntimeException) {
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
            return;
        }
        if (mRTRuntimeException == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = null;
        } else {
            str = Log.getStackTraceString(mRTRuntimeException);
        }
        AbstractC1172jb jbVar = this.c;
        AbstractC1172jb.a(jbVar, this.f2596a, jbVar.d.getCcrcCode(), this.c.c, str, z, AbstractC1172jb.$ipChange);
        if (!z) {
            this.b.a(false, str);
            return;
        }
        this.c.j = true;
        this.b.a(true, null);
        if (!TextUtils.isEmpty(this.c.d())) {
            AbstractC1172jb jbVar2 = this.c;
            jbVar2.d.a(jbVar2.d(), false);
        }
    }
}
