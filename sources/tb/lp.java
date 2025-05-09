package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fdb.d f23474a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ hp e;

    public lp(hp hpVar, fdb.d dVar, String str, String str2, Class cls) {
        this.e = hpVar;
        this.b = str;
        this.c = str2;
        this.d = cls;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.e.g0(this.b, this.c, this.d);
            throw null;
        }
    }
}
