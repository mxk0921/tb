package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mx6 implements jdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vq f24364a;

    static {
        t2o.a(144703617);
        t2o.a(144703618);
    }

    public mx6(vq vqVar) {
        ckf.g(vqVar, "callback");
        this.f24364a = vqVar;
    }

    @Override // tb.jdb
    public void O(ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            return;
        }
        ckf.g(errorResult, "result");
        jdb.a.a(this, errorResult);
        this.f24364a.b(errorResult);
    }

    public final vq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq) ipChange.ipc$dispatch("54910bd8", new Object[]{this});
        }
        return this.f24364a;
    }
}
