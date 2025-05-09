package tb;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c0n extends Component<ProgressBar, c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16755a;
    public int b;
    public int c;
    public final Handler d = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ProgressComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int progress;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (c0n.h(c0n.this) != null && c0n.j(c0n.this) > (progress = ((ProgressBar) c0n.i(c0n.this)).getProgress())) {
                int i = progress + 1;
                ((ProgressBar) c0n.k(c0n.this)).setProgress(Math.min(c0n.j(c0n.this), i));
                if (c0n.j(c0n.this) > i) {
                    sendEmptyMessageDelayed(0, c0n.l(c0n.this));
                }
                c0n c0nVar = c0n.this;
                c0n.n(c0nVar, ((ProgressBar) c0n.o(c0nVar)).getProgress());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c0n c0nVar = c0n.this;
            c0nVar.r(Math.max(c0n.m(c0nVar), 2));
        }
    }

    static {
        t2o.a(503316790);
    }

    public static /* synthetic */ View h(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d8966ed3", new Object[]{c0nVar});
        }
        return c0nVar.view;
    }

    public static /* synthetic */ View i(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9ec0f794", new Object[]{c0nVar});
        }
        return c0nVar.view;
    }

    public static /* synthetic */ Object ipc$super(c0n c0nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ProgressComponent");
    }

    public static /* synthetic */ int j(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df07d6c6", new Object[]{c0nVar})).intValue();
        }
        return c0nVar.f16755a;
    }

    public static /* synthetic */ View k(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2b160916", new Object[]{c0nVar});
        }
        return c0nVar.view;
    }

    public static /* synthetic */ int l(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d1fa4c8", new Object[]{c0nVar})).intValue();
        }
        return c0nVar.b;
    }

    public static /* synthetic */ int m(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("342b8bc9", new Object[]{c0nVar})).intValue();
        }
        return c0nVar.c;
    }

    public static /* synthetic */ int n(c0n c0nVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55dbcb9e", new Object[]{c0nVar, new Integer(i)})).intValue();
        }
        c0nVar.c = i;
        return i;
    }

    public static /* synthetic */ View o(c0n c0nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7d95a359", new Object[]{c0nVar});
        }
        return c0nVar.view;
    }

    /* renamed from: p */
    public c generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a6946f1", new Object[]{this});
        }
        return new c();
    }

    /* renamed from: q */
    public ProgressBar onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProgressBar) ipChange.ipc$dispatch("b80e5a49", new Object[]{this, context});
        }
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        ColorDrawable colorDrawable = new ColorDrawable(((c) this.viewParams).x0);
        P p = this.viewParams;
        progressBar.setProgressDrawable(new LayerDrawable(new Drawable[]{colorDrawable, new ScaleDrawable(mx7.b(((c) p).w0, ((c) p).B0), 3, 1.0f, -1.0f)}));
        int i = this.c;
        if (i <= 0) {
            i = ((c) this.viewParams).z0;
        }
        progressBar.setProgress(i);
        this.c = progressBar.getProgress();
        progressBar.setMax(((c) this.viewParams).A0);
        if (((c) this.viewParams).y0) {
            this.d.post(new b());
        }
        return progressBar;
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
        } else if (this.view != 0) {
            int max = Math.max(this.f16755a, i);
            this.f16755a = max;
            int progress = ((ProgressBar) this.view).getProgress();
            this.d.removeMessages(0);
            P p = this.viewParams;
            if (!((c) p).y0) {
                ((ProgressBar) this.view).setProgress(max);
            } else if (max == ((c) p).A0) {
                this.b = 0;
                ((ProgressBar) this.view).setProgress(max);
            } else if (this.f16755a - progress > 2) {
                ((ProgressBar) this.view).setProgress(progress + 1);
                int i2 = 1000 / ((this.f16755a - progress) - 1);
                this.b = i2;
                this.d.sendEmptyMessageDelayed(0, i2);
            } else {
                this.b = 0;
                ((ProgressBar) this.view).setProgress(max);
            }
            this.c = ((ProgressBar) this.view).getProgress();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int w0;
        public int x0;
        public int z0;
        public boolean y0 = true;
        public int A0 = 100;
        public int B0 = 0;

        static {
            t2o.a(503316793);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ProgressComponent$ProgressViewParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
            if (r9.equals("type") == false) goto L_0x0026;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r7 = this;
                r0 = 3
                r1 = 2
                r2 = 4
                r3 = 1
                r4 = 0
                com.android.alibaba.ip.runtime.IpChange r5 = tb.c0n.c.$ipChange
                boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r6 == 0) goto L_0x001b
                java.lang.String r6 = "e7bb1f3f"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r7
                r2[r3] = r8
                r2[r1] = r9
                r2[r0] = r10
                r5.ipc$dispatch(r6, r2)
                return
            L_0x001b:
                r9.hashCode()
                r5 = -1
                int r6 = r9.hashCode()
                switch(r6) {
                    case -1182559670: goto L_0x006e;
                    case -898533970: goto L_0x0062;
                    case 107876: goto L_0x0056;
                    case 3575610: goto L_0x004c;
                    case 1294266307: goto L_0x0040;
                    case 1883813938: goto L_0x0034;
                    case 1907833501: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                r0 = -1
                goto L_0x0079
            L_0x0028:
                java.lang.String r0 = "progress-back-color"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0032
                goto L_0x0026
            L_0x0032:
                r0 = 6
                goto L_0x0079
            L_0x0034:
                java.lang.String r0 = "progress-radius"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x003e
                goto L_0x0026
            L_0x003e:
                r0 = 5
                goto L_0x0079
            L_0x0040:
                java.lang.String r0 = "progress-color"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x004a
                goto L_0x0026
            L_0x004a:
                r0 = 4
                goto L_0x0079
            L_0x004c:
                java.lang.String r1 = "type"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0079
                goto L_0x0026
            L_0x0056:
                java.lang.String r0 = "max"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0060
                goto L_0x0026
            L_0x0060:
                r0 = 2
                goto L_0x0079
            L_0x0062:
                java.lang.String r0 = "smooth"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x006c
                goto L_0x0026
            L_0x006c:
                r0 = 1
                goto L_0x0079
            L_0x006e:
                java.lang.String r0 = "init-progress"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0078
                goto L_0x0026
            L_0x0078:
                r0 = 0
            L_0x0079:
                switch(r0) {
                    case 0: goto L_0x00ad;
                    case 1: goto L_0x00a6;
                    case 2: goto L_0x009d;
                    case 3: goto L_0x0096;
                    case 4: goto L_0x008f;
                    case 5: goto L_0x0084;
                    case 6: goto L_0x007d;
                    default: goto L_0x007c;
                }
            L_0x007c:
                goto L_0x00b3
            L_0x007d:
                int r8 = tb.ir2.j(r10)
                r7.x0 = r8
                goto L_0x00b3
            L_0x0084:
                com.taobao.tao.flexbox.layoutmanager.core.n r9 = r7.g()
                int r8 = tb.jfw.G(r9, r8, r10)
                r7.B0 = r8
                goto L_0x00b3
            L_0x008f:
                int r8 = tb.ir2.j(r10)
                r7.w0 = r8
                goto L_0x00b3
            L_0x0096:
                java.lang.String r8 = "line"
                tb.nwv.I(r10, r8)
                goto L_0x00b3
            L_0x009d:
                r8 = 100
                int r8 = tb.nwv.t(r10, r8)
                r7.A0 = r8
                goto L_0x00b3
            L_0x00a6:
                boolean r8 = tb.nwv.o(r10, r3)
                r7.y0 = r8
                goto L_0x00b3
            L_0x00ad:
                int r8 = tb.nwv.t(r10, r4)
                r7.z0 = r8
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.c0n.c.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }
}
