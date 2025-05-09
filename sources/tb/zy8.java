package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.application.common.IScrollListener;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zy8 implements v11, IScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f33095a = {3, 5, 10, 20};
    public xy8 b;
    public xy8 c;
    public xy8 d;
    public volatile boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zy8.a(zy8.this) != null) {
                zy8.a(zy8.this).N(xy8.TOPIC_LAUNCH_ACTION);
                zy8.a(zy8.this).M("launch");
                zy8.a(zy8.this).K(SceneIdentifier.getCurrentPageNameWithFragment());
                zy8.a(zy8.this).L(SceneIdentifier.getCurrentPageUrl());
                zy8.a(zy8.this).S();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f33097a;

        public b(int i) {
            this.f33097a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (zy8.a(zy8.this) != null) {
                String str = "_" + this.f33097a + "s";
                zy8.a(zy8.this).N(xy8.TOPIC_LAUNCH_ACTION + str);
                zy8.a(zy8.this).M("launch" + str);
                zy8.a(zy8.this).K(SceneIdentifier.getCurrentPageNameWithFragment());
                zy8.a(zy8.this).L(SceneIdentifier.getCurrentPageUrl());
                zy8.a(zy8.this).S();
            }
        }
    }

    public static /* synthetic */ xy8 a(zy8 zy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xy8) ipChange.ipc$dispatch("9522acf3", new Object[]{zy8Var});
        }
        return zy8Var.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        xy8 xy8Var = new xy8();
        this.b = xy8Var;
        xy8Var.N(xy8.TOPIC_LAUNCH_ACTION);
        this.b.M("launch");
        xy8 xy8Var2 = new xy8();
        this.c = xy8Var2;
        xy8Var2.N(xy8.TOPIC_SCROLL_ACTION);
        this.c.M("scroll");
        xy8 xy8Var3 = new xy8();
        this.d = xy8Var3;
        xy8Var3.N(xy8.TOPIC_IDLE_ACTION);
        this.d.M("idle");
        g();
        c21.d(this);
        c21.f(this);
    }

    public void c(String str) {
        xy8 xy8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77986c43", new Object[]{this, str});
        } else if ((xy8.TOPIC_LOAD_ACTION.equals(str) || xy8.TOPIC_SCROLL_ACTION.equals(str)) && (xy8Var = this.d) != null) {
            xy8Var.K(SceneIdentifier.getCurrentPageNameWithFragment());
            this.d.L(SceneIdentifier.getCurrentPageUrl());
            this.d.R();
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != 0) {
        } else {
            if (i2 == 1) {
                g();
            } else if (i2 == 2) {
                crt.i(new a());
            }
        }
    }

    public void e(String str) {
        xy8 xy8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a45c34", new Object[]{this, str});
        } else if ((xy8.TOPIC_LOAD_ACTION.equals(str) || xy8.TOPIC_SCROLL_ACTION.equals(str)) && (xy8Var = this.d) != null) {
            long B = xy8Var.B();
            if (B != -1 && System.currentTimeMillis() - B >= 3000) {
                this.d.x(0);
            }
        }
    }

    public void f(String str) {
        xy8 xy8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e8cf6e", new Object[]{this, str});
        } else if (xy8.TOPIC_LAUNCH_ACTION.equals(str) && (xy8Var = this.d) != null) {
            xy8Var.K(SceneIdentifier.getCurrentPageNameWithFragment());
            this.d.L(SceneIdentifier.getCurrentPageUrl());
            this.d.R();
        }
    }

    public final void g() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0f5984", new Object[]{this});
        } else if (!this.e) {
            for (int i : this.f33095a) {
                long currentTimeMillis = (i * 1000) - (System.currentTimeMillis() - SceneIdentifier.getProcessStartTime());
                if (currentTimeMillis > 0) {
                    this.e = true;
                    crt.j(new b(i), currentTimeMillis, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public /* synthetic */ void onScrollEnd(Activity activity, String str) {
        ind.b(this, activity, str);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        xy8 xy8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
        } else if (i == 1 && (xy8Var = this.c) != null) {
            xy8Var.K(SceneIdentifier.getCurrentPageNameWithFragment());
            this.c.L(SceneIdentifier.getCurrentPageUrl());
            this.c.R();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
            return;
        }
        xy8 xy8Var = this.c;
        if (xy8Var != null) {
            xy8Var.y();
        }
    }
}
