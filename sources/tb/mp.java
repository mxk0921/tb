package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fdb;
import tb.hp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ fdb.h f24199a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ hp f;

    public mp(hp hpVar, fdb.h hVar, String str, String str2, Object obj, int i) {
        this.f = hpVar;
        this.f24199a = hVar;
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        fdb.h hVar = this.f24199a;
        String str = this.b;
        String str2 = this.c;
        ((hp.c) hVar).a(str, str2, this.f.G0(str, str2, this.d, this.e));
    }
}
