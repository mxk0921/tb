package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ihj implements hhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final iqk f21312a;
    public final int b;

    public ihj(Context context, sgg sggVar, int i) {
        this.f21312a = sggVar.d();
        this.b = i;
    }

    public static hhj g(Context context, sgg sggVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhj) ipChange.ipc$dispatch("987cb44d", new Object[]{context, sggVar});
        }
        return h(context, sggVar, 0);
    }

    public static hhj h(Context context, sgg sggVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhj) ipChange.ipc$dispatch("90dc3230", new Object[]{context, sggVar, new Integer(i)});
        }
        if (BootstrapMode.e(i, 4)) {
            return new lpt(context, sggVar, i);
        }
        return new k0i(context, sggVar, i);
    }

    @Override // tb.hhj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910a4c02", new Object[]{this});
        }
    }

    @Override // tb.hhj
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0786e06", new Object[]{this});
        }
    }
}
