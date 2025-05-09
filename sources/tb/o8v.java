package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o8v implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25221a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n8v.c c;
    public final /* synthetic */ n8v d;

    public o8v(n8v n8vVar, Context context, String str, n8v.c cVar) {
        this.d = n8vVar;
        this.f25221a = context;
        this.b = str;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        byte[] k = this.d.k(this.f25221a, this.b);
        if (k != null) {
            n8v.a(this.d, this.c, k);
        } else {
            n8v.b(this.d, this.c, "获取文件失败");
        }
    }
}
