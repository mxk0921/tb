package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dux implements a.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ qxx f18080a;

    static {
        t2o.a(499122204);
        t2o.a(343933071);
    }

    public dux(qxx qxxVar) {
        this.f18080a = qxxVar;
    }

    @Override // com.taobao.accs.connection.state.a.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898c8053", new Object[]{this, str});
        }
    }

    @Override // com.taobao.accs.connection.state.a.g
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5675eb25", new Object[]{this, str});
        } else if (str.equals(o41.a().getPackageName())) {
            this.f18080a.c();
        }
    }
}
