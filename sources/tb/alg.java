package tb;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class alg implements zkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f15821a;
    public final boolean b;
    public zkg c;
    public ykg d;

    static {
        t2o.a(815792393);
        t2o.a(815792392);
    }

    public alg(View view, boolean z) {
        ckf.g(view, "view");
        this.f15821a = view;
        this.b = z;
    }

    @Override // tb.zkg
    public void a(ykg ykgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd43c", new Object[]{this, ykgVar, new Boolean(z)});
        } else if (this.d != ykgVar) {
            zkg zkgVar = this.c;
            if (zkgVar != null) {
                ((i02) zkgVar).detach();
            }
            zkg zkgVar2 = null;
            this.c = null;
            this.d = ykgVar;
            if (ykgVar != null) {
                int g = ykgVar.g();
                if (g == 1) {
                    zkgVar2 = new c0h(this.f15821a, this.b, z);
                } else if (g == 2) {
                    zkgVar2 = new qst(this.f15821a, this.b);
                } else if (g == 3) {
                    zkgVar2 = new l6g(this.f15821a, this.b, z);
                }
                if (zkgVar2 != null) {
                    this.c = zkgVar2;
                    zkgVar2.a(ykgVar, z);
                    this.f15821a.requestLayout();
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        zkg zkgVar = this.c;
        if (zkgVar != null) {
            ((i02) zkgVar).b();
        }
    }

    public void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "cns");
        zkg zkgVar = this.c;
        if (zkgVar != null) {
            ((i02) zkgVar).d(canvas);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d54ae5", new Object[]{this});
            return;
        }
        zkg zkgVar = this.c;
        if (zkgVar != null) {
            ((i02) zkgVar).s();
        }
    }

    @Override // tb.zkg
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        zkg zkgVar = this.c;
        if (zkgVar != null) {
            zkgVar.detach();
        }
    }
}
