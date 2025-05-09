package tb;

import android.content.Context;
import com.alibaba.analytics.core.model.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mok implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f24182a;
    public final /* synthetic */ File b;

    public mok(Context context, File file) {
        this.f24182a = context;
        this.b = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        c55 c55Var = new c55(this.f24182a, nok.a());
        while (true) {
            List<? extends rf8> i = c55Var.i(Log.class, null, "time", 100);
            if (i.size() == 0) {
                nhh.f(nok.TAG, "delete old db file:", this.b.getAbsoluteFile());
                this.b.delete();
                return;
            }
            c55Var.g(i);
            o2w.k().h().o(i);
        }
    }
}
