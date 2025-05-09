package tb;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import tb.tlu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EglBase f23373a;
    public GlRectDrawer b;
    public tlu c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EglBase.Context f23374a;

        public a(EglBase.Context context) {
            this.f23374a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lju.b(lju.this, EglBase.StaticMethod.create(this.f23374a, EglBase.CONFIG_RECORDABLE));
            lju.d(lju.this, new GlRectDrawer());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f23375a;
        public final /* synthetic */ int b;
        public final /* synthetic */ float[] c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public b(boolean z, int i, float[] fArr, int i2, int i3) {
            this.f23375a = z;
            this.b = i;
            this.c = fArr;
            this.d = i2;
            this.e = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lju.a(lju.this).makeCurrent();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.f23375a) {
                GlRectDrawer c = lju.c(lju.this);
                int i = this.b;
                float[] fArr = this.c;
                int i2 = this.d;
                int i3 = this.e;
                c.drawRgb(i, fArr, i2, i3, 0, 0, i2, i3);
            } else {
                GlRectDrawer c2 = lju.c(lju.this);
                int i4 = this.b;
                float[] fArr2 = this.c;
                int i5 = this.d;
                int i6 = this.e;
                c2.drawOes(i4, fArr2, i5, i6, 0, 0, i5, i6);
            }
            lju.a(lju.this).swapBuffers();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (lju.e(lju.this) != null) {
                lju.e(lju.this).j();
                lju.f(lju.this, null);
            }
            if (lju.c(lju.this) != null) {
                lju.c(lju.this).release();
                lju.d(lju.this, null);
            }
            if (lju.a(lju.this) != null) {
                lju.a(lju.this).release();
                lju.b(lju.this, null);
            }
        }
    }

    static {
        t2o.a(395313659);
    }

    public static /* synthetic */ EglBase a(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase) ipChange.ipc$dispatch("7110c366", new Object[]{ljuVar});
        }
        return ljuVar.f23373a;
    }

    public static /* synthetic */ EglBase b(lju ljuVar, EglBase eglBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase) ipChange.ipc$dispatch("9c094379", new Object[]{ljuVar, eglBase});
        }
        ljuVar.f23373a = eglBase;
        return eglBase;
    }

    public static /* synthetic */ GlRectDrawer c(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlRectDrawer) ipChange.ipc$dispatch("9541fd3c", new Object[]{ljuVar});
        }
        return ljuVar.b;
    }

    public static /* synthetic */ GlRectDrawer d(lju ljuVar, GlRectDrawer glRectDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlRectDrawer) ipChange.ipc$dispatch("9402e472", new Object[]{ljuVar, glRectDrawer});
        }
        ljuVar.b = glRectDrawer;
        return glRectDrawer;
    }

    public static /* synthetic */ tlu e(lju ljuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tlu) ipChange.ipc$dispatch("91cd0141", new Object[]{ljuVar});
        }
        return ljuVar.c;
    }

    public static /* synthetic */ tlu f(lju ljuVar, tlu tluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tlu) ipChange.ipc$dispatch("6e6f7559", new Object[]{ljuVar, tluVar});
        }
        ljuVar.c = tluVar;
        return tluVar;
    }

    public int g(int i, int i2, int i3, boolean z, float[] fArr, tlu.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("179bd95f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), fArr, dVar})).intValue();
        }
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("handler");
            handlerThread.start();
            tlu tluVar = new tlu(i, i2, null, new Handler(handlerThread.getLooper()));
            this.c = tluVar;
            this.f23373a.createSurface(tluVar.i());
        }
        this.c.k(dVar);
        h(new b(z, i3, fArr, i, i2));
        return 0;
    }

    public final void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6fae9f", new Object[]{this, runnable});
        } else {
            nf.i(runnable);
        }
    }

    public void i(EglBase.Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab392d17", new Object[]{this, context});
        } else {
            h(new a(context));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            h(new c());
        }
    }
}
