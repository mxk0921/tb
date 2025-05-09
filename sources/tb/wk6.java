package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wk6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30738a;

    static {
        t2o.a(444597040);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e45e1769", new Object[]{this})).intValue();
        }
        return this.f30738a;
    }

    public boolean b(String str, int i, lg5 lg5Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("806bf46b", new Object[]{this, str, new Integer(i), lg5Var})).booleanValue();
        }
        if (!lg5Var.l(i)) {
            Log.e("UiCodeLoader_TMTEST", "seekBy error:" + i);
            z = false;
        }
        this.f30738a = lg5Var.c();
        return z;
    }
}
