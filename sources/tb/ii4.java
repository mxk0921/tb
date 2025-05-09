package tb;

import android.taobao.windvane.connect.HttpConnector;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ii4 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v7b f21323a;
    public final /* synthetic */ h7b b;
    public final /* synthetic */ hi4 c;

    public ii4(hi4 hi4Var, v7b v7bVar, h7b h7bVar) {
        this.c = hi4Var;
        this.f21323a = v7bVar;
        this.b = h7bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            new HttpConnector().e(this.f21323a, this.b);
        }
    }
}
