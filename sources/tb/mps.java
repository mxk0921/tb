package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.tao.navigation.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mps implements grs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduleComposer f24218a;
    public final String b;
    public final boolean c;

    public mps(String str, ScheduleComposer scheduleComposer, boolean z) {
        this.b = str;
        this.f24218a = scheduleComposer;
        this.c = z;
    }

    @Override // tb.grs
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160f36fa", new Object[]{this});
        } else if (this.f24218a.a()) {
            qfu.a("composed=true,type=tabbar_" + this.b + ",dur=0,url=" + this.b);
            a.L(this);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.c) {
                ScheduleComposer scheduleComposer = this.f24218a;
                scheduleComposer.c(this.b + ".onClick", null);
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            qfu.a("composed=false,type=tabbar_" + this.b + ",dur=" + uptimeMillis2 + ",url=" + this.b);
            a.L(this);
        }
    }

    @Override // tb.grs
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return this.b;
    }

    public static void b(Context context, ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66dd014", new Object[]{context, scheduleComposer});
        } else if (t.a(context, "ngTabClickOff")) {
            a.i(new mps(a68.TAG, scheduleComposer, true));
            a.i(new mps("cart", scheduleComposer));
        } else {
            a.i(new mps(a68.TAG, scheduleComposer, true));
            a.i(new mps("cart", scheduleComposer, true));
            a.i(new mps("message", scheduleComposer, true));
            a.i(new mps("mytaobao", scheduleComposer, true));
        }
    }

    public mps(String str, ScheduleComposer scheduleComposer) {
        this(str, scheduleComposer, false);
    }
}
