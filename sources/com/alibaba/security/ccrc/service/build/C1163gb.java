package com.alibaba.security.ccrc.service.build;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import tb.dph;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.gb  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1163gb implements dph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1148bb f2593a;
    public final /* synthetic */ AbstractC1172jb b;

    public C1163gb(AbstractC1172jb jbVar, AbstractC1148bb bbVar) {
        this.b = jbVar;
        this.f2593a = bbVar;
    }

    @Override // tb.dph
    public void onCompletion(String str, MRTRuntimeException mRTRuntimeException) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de5f2e6", new Object[]{this, str, mRTRuntimeException});
            return;
        }
        AbstractC1148bb bbVar = this.f2593a;
        if (bbVar != null) {
            if (mRTRuntimeException != null) {
                z = false;
            }
            bbVar.a(z, Log.getStackTraceString(mRTRuntimeException));
        }
    }
}
