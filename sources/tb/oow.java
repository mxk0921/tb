package tb;

import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Choreographer;
import io.unicorn.embedding.engine.FlutterJNI;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class oow {
    public static b d;
    public static oow e;

    /* renamed from: a  reason: collision with root package name */
    public long f25532a = -1;
    public c b = new c(0);
    public final FlutterJNI.b c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements FlutterJNI.b {
        public a() {
        }

        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(b(j));
        }

        public final Choreographer.FrameCallback b(long j) {
            oow oowVar = oow.this;
            if (oowVar.b == null) {
                return new c(j);
            }
            oowVar.b.f25535a = j;
            c cVar = oowVar.b;
            oowVar.b = null;
            return cVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        public long f25535a;

        static {
            t2o.a(945815874);
        }

        public c(long j) {
            this.f25535a = j;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            long j2;
            long nanoTime = System.nanoTime() - j;
            if (nanoTime < 0) {
                j2 = 0;
            } else {
                j2 = nanoTime;
            }
            oow oowVar = oow.this;
            FlutterJNI.nativeOnVsync(j2, oowVar.f25532a, this.f25535a);
            oowVar.b = this;
        }
    }

    static {
        t2o.a(945815871);
    }

    public static oow e(float f) {
        if (e == null) {
            e = new oow();
        }
        FlutterJNI.setRefreshRateFPS(f);
        oow oowVar = e;
        oowVar.f25532a = (long) (1.0E9d / f);
        return oowVar;
    }

    public static oow f(DisplayManager displayManager) {
        if (e == null) {
            e = new oow();
        }
        if (d == null) {
            oow oowVar = e;
            oowVar.getClass();
            b bVar = new b(displayManager);
            d = bVar;
            bVar.a();
        }
        if (e.f25532a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.f25532a = (long) (1.0E9d / refreshRate);
            FlutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }

    public void g() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.c);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f25534a;

        static {
            t2o.a(945815873);
        }

        public b(DisplayManager displayManager) {
            this.f25534a = displayManager;
        }

        public void a() {
            try {
                this.f25534a.registerDisplayListener(this, null);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                DisplayManager displayManager = this.f25534a;
                float refreshRate = displayManager.getDisplay(0).getRefreshRate();
                oow.this.f25532a = (long) (1.0E9d / refreshRate);
                try {
                    FlutterJNI.setRefreshRateFPS(refreshRate);
                } catch (UnsatisfiedLinkError e) {
                    Log.e("Weex", "call jni exception: ", e);
                    displayManager.unregisterDisplayListener(this);
                }
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}
