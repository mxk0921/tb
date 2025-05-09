package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f8h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e8h implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18353a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f8h.a c;

    public e8h(String str, Context context, f8h.a aVar) {
        this.f18353a = str;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            f8h.b(this.f18353a, this.b);
        } catch (Exception unused) {
        }
    }
}
