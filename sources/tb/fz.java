package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class fz implements d4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public txu f19640a;
    public f4e b;
    public String c;
    public Context d;

    static {
        t2o.a(80740752);
        t2o.a(80740749);
    }

    @Override // tb.d4e
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d0d7d6", new Object[]{this, view});
        }
    }

    @Override // tb.d4e
    @Deprecated
    public void d(txu txuVar, f4e f4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7579b8a9", new Object[]{this, txuVar, f4eVar});
            return;
        }
        this.f19640a = txuVar;
        this.b = f4eVar;
        this.c = txuVar.a();
        this.d = txuVar.b();
    }
}
