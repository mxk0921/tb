package com.taobao.kmp.nexus.flexa;

import android.app.Application;
import android.os.Bundle;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.p5c;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/nexus/flexa/TLNexusInitial;", "Ltb/p5c;", "Ljava/io/Serializable;", "<init>", "()V", "Landroid/app/Application;", "p0", "Landroid/os/Bundle;", p1.d, "Ltb/xhv;", "init", "(Landroid/app/Application;Landroid/os/Bundle;)V", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TLNexusInitial implements p5c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536686);
    }

    @Override // tb.p5c
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
        }
    }
}
