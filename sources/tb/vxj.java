package tb;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ja7> f30315a;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public RecyclerView h;
    public Handler i;
    public l5i j = new l5i();
    public StringBuilder k;

    static {
        t2o.a(352322013);
    }

    public long a(ia7 ia7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f50c93a7", new Object[]{this, ia7Var})).longValue();
        }
        if (ia7Var == null) {
            return System.currentTimeMillis();
        }
        ia7Var.c = System.currentTimeMillis();
        b(ia7Var);
        return ia7Var.c;
    }

    public void b(ja7 ja7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b215ee53", new Object[]{this, ja7Var});
            return;
        }
        try {
            d(ja7Var);
        } catch (Throwable th) {
            this.j.b(this.j.n(), "示知异常，任务入队失败。", th);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0fc7699", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void d(ja7 ja7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745e4edc", new Object[]{this, ja7Var});
        } else if (ja7Var == null) {
        } else {
            if (this.j.d()) {
                ja7Var.run();
            } else if (!this.b) {
                if (this.f30315a == null) {
                    this.f30315a = new ArrayList<>(15);
                }
                ja7Var.f21863a = this.j;
                ja7Var.b = this;
                this.f30315a.add(ja7Var);
            } else if (this.e) {
                ja7Var.run();
            } else {
                if (this.c <= 0) {
                    l5i l5iVar = this.j;
                    l5iVar.a(l5iVar.n(), "mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                    this.e = true;
                } else if (System.currentTimeMillis() - this.d > 5000) {
                    l5i l5iVar2 = this.j;
                    l5iVar2.a(l5iVar2.n(), "mHasStartProcessAllTask and mDelayTaskStartProcessTime is timed out , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                    this.e = true;
                }
                if (this.e) {
                    ja7Var.run();
                } else if (ja7Var.a() > 0) {
                    if (this.i == null) {
                        this.i = new Handler(Looper.getMainLooper());
                    }
                    this.i.postDelayed(ja7Var, ja7Var.a());
                } else {
                    ja7Var.run();
                }
            }
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e0eb170", new Object[]{this})).booleanValue();
        }
        if (!this.e && !this.j.d()) {
            return this.j.c();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
        }
        return this.j.c();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b46f4368", new Object[]{this});
        }
        StringBuilder sb = this.k;
        if (sb == null) {
            return "nullErrMsg";
        }
        return sb.toString();
    }

    public StringBuilder h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3f992ddd", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new StringBuilder();
        }
        return this.k;
    }

    public void i(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.h = recyclerView;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74379e8", new Object[]{this});
            return;
        }
        l5i l5iVar = this.j;
        l5iVar.a(l5iVar.n(), "RootLayoutHasRenderSuccess flag.");
        this.g = true;
    }
}
