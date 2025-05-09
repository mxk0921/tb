package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ef1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncViewManager";
    public static final ArrayList<Integer> e;
    public static volatile ef1 f;

    /* renamed from: a  reason: collision with root package name */
    public gf1 f18523a;
    public int b;
    public int c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i);
    }

    static {
        t2o.a(301989903);
        ArrayList<Integer> arrayList = new ArrayList<>();
        e = arrayList;
        arrayList.add(Integer.valueOf(R.layout.alibuy_progressbar_layout));
    }

    public static ef1 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ef1) ipChange.ipc$dispatch("e06aa2cd", new Object[0]);
        }
        if (f == null) {
            synchronized (ef1.class) {
                try {
                    if (f == null) {
                        f = new ef1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static View i(Context context, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8fa5f3e4", new Object[]{context, new Integer(i)});
        }
        View k = h().k(context, i);
        rbb g = ck.g();
        StringBuilder sb = new StringBuilder();
        if (k == null) {
            str = "[未命中]";
        } else {
            str = "[命中]";
        }
        sb.append(str);
        sb.append(context.getResources().getResourceEntryName(i));
        sb.append("缓存");
        g.e(sb.toString(), ck.b.b().i("AURA/performance").a());
        if (k == null) {
            k = View.inflate(context, i, null);
        } else {
            h().e();
        }
        h().d();
        return k;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d01a6f", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<Integer> arrayList = e;
        if (!arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48c1856", new Object[]{this});
        } else {
            c(e);
        }
    }

    public void c(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32250ea0", new Object[]{this, arrayList});
            return;
        }
        gf1 gf1Var = this.f18523a;
        if (gf1Var != null) {
            gf1Var.a(new ArrayList<>(arrayList));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1159d082", new Object[]{this});
        } else {
            this.b++;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776e66b0", new Object[]{this});
        } else {
            this.c++;
        }
    }

    public final gf1 g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf1) ipChange.ipc$dispatch("996f2c63", new Object[]{this, context});
        }
        if (this.f18523a == null) {
            this.f18523a = new gf1(context);
        }
        this.f18523a.g(context);
        return this.f18523a;
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.d) {
            g(context);
            this.d = true;
        }
    }

    public View k(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97b913f3", new Object[]{this, context, new Integer(i)});
        }
        return g(context).c(context, i, null);
    }

    public void f() {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.b == 1) {
            vm0.a a2 = vm0.a.a("asyncView");
            if (this.c == 1) {
                str = "命中缓存";
            } else {
                str = "未命中缓存";
            }
            h15 tag = a2.tag(str);
            if (this.c != 1) {
                z = false;
            }
            vm0.d(tag.success(z).sampling(0.001f));
        }
        gf1 gf1Var = this.f18523a;
        if (gf1Var != null) {
            gf1Var.b();
        }
        this.d = false;
        this.c = 0;
        this.b = 0;
    }
}
