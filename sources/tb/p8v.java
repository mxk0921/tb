package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.n8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p8v implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n8v.c f25953a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ n8v d;

    public p8v(n8v n8vVar, n8v.c cVar, Context context, String str) {
        this.d = n8vVar;
        this.f25953a = cVar;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            n8v n8vVar = this.d;
            n8v.a(n8vVar, this.f25953a, Boolean.valueOf(n8vVar.i(this.b, this.c)));
        } catch (Exception e) {
            hav.g(n8v.c(this.d), this.c, "#文件不存在", e.getMessage());
            n8v.b(this.d, this.f25953a, e.getMessage());
        }
    }
}
