package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o7o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o7o d = new o7o();
    public static Context e;

    /* renamed from: a  reason: collision with root package name */
    public final q7o f25190a;
    public final uxl b;
    public final kt6 c;

    public o7o() {
        fyl fylVar = new fyl();
        kt6 kt6Var = new kt6();
        this.c = kt6Var;
        this.f25190a = new q7o(kt6Var, fylVar);
        this.b = new uxl(kt6Var, fylVar);
    }

    public static o7o c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7o) ipChange.ipc$dispatch("50d11bd7", new Object[0]);
        }
        return d;
    }

    public boolean a(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efd91ec9", new Object[]{this, jxlVar})).booleanValue();
        }
        return this.f25190a.b(jxlVar);
    }

    public Map<String, String> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e9513237", new Object[]{this, new Integer(i)});
        }
        return this.f25190a.c(i);
    }

    public eyl d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eyl) ipChange.ipc$dispatch("36385add", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return this.b.b(i, i2, i3);
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        e = context.getApplicationContext();
        this.c.b();
    }

    public boolean f(jxl jxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("529a372c", new Object[]{this, jxlVar})).booleanValue();
        }
        return this.f25190a.f(jxlVar);
    }
}
