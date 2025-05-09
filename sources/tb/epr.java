package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class epr implements f0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cpr f18744a;

    public epr(cpr cprVar) {
        this.f18744a = cprVar;
    }

    @Override // tb.f0c
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        } else {
            cpr.k(this.f18744a, qvs.o0());
        }
    }

    @Override // tb.f0c
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        try {
            cpr.j(this.f18744a, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cpr.k(this.f18744a, qvs.o0());
    }
}
