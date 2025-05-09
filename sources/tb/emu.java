package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcOutputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.impl.TrtcEngineImpl;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class emu implements ITrtcOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TrtcEngineImpl c;
    public final String d;
    public Handler e;
    public ITrtcOutputStream.a f;
    public ITrtcDataStream.a g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f18683a = new Object();
    public final Object b = new Object();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public int i = 0;
    public int j = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18684a;

        public a(String str) {
            this.f18684a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (emu.b(emu.this)) {
                try {
                    if (emu.c(emu.this) != null) {
                        emu.c(emu.this).a(this.f18684a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f18685a;
        public final /* synthetic */ int b;

        public b(byte[] bArr, int i) {
            this.f18685a = bArr;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TrtcDefines.f fVar = new TrtcDefines.f();
            fVar.f13880a = (byte[]) this.f18685a.clone();
            fVar.b = this.b;
            synchronized (emu.b(emu.this)) {
                try {
                    if (emu.d(emu.this) == null) {
                        TrtcLog.i("OutputStream", "notify data frame, but no observer");
                        return;
                    }
                    emu.d(emu.this).b(fVar);
                    emu.g(emu.this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrtcDefines.f f18686a;

        public c(TrtcDefines.f fVar) {
            this.f18686a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (emu.m(emu.this) != null) {
                emu.j(emu.this);
                emu.m(emu.this).m1(emu.n(emu.this), this.f18686a);
            }
        }
    }

    static {
        t2o.a(395313569);
        t2o.a(395313396);
    }

    public emu(TrtcEngineImpl trtcEngineImpl, String str) {
        this.c = trtcEngineImpl;
        this.d = str;
        TrtcLog.j("OutputStream", "new output stream, id:" + str);
    }

    public static /* synthetic */ void a(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1dab3c", new Object[]{emuVar});
        } else {
            emuVar.t();
        }
    }

    public static /* synthetic */ Object b(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7f74737", new Object[]{emuVar});
        }
        return emuVar.b;
    }

    public static /* synthetic */ ITrtcOutputStream.a c(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcOutputStream.a) ipChange.ipc$dispatch("30407424", new Object[]{emuVar});
        }
        return emuVar.f;
    }

    public static /* synthetic */ ITrtcDataStream.a d(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcDataStream.a) ipChange.ipc$dispatch("7e7bf98e", new Object[]{emuVar});
        }
        return emuVar.g;
    }

    public static /* synthetic */ int e(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92c443ab", new Object[]{emuVar})).intValue();
        }
        return emuVar.j;
    }

    public static /* synthetic */ int f(emu emuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4d7da40", new Object[]{emuVar, new Integer(i)})).intValue();
        }
        emuVar.j = i;
        return i;
    }

    public static /* synthetic */ int g(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("611952a3", new Object[]{emuVar})).intValue();
        }
        int i = emuVar.j;
        emuVar.j = 1 + i;
        return i;
    }

    public static /* synthetic */ int h(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("846de9ca", new Object[]{emuVar})).intValue();
        }
        return emuVar.i;
    }

    public static /* synthetic */ int i(emu emuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("862f801", new Object[]{emuVar, new Integer(i)})).intValue();
        }
        emuVar.i = i;
        return i;
    }

    public static /* synthetic */ int j(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52c2f8c2", new Object[]{emuVar})).intValue();
        }
        int i = emuVar.i;
        emuVar.i = 1 + i;
        return i;
    }

    public static /* synthetic */ Runnable k(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f32eb5de", new Object[]{emuVar});
        }
        emuVar.getClass();
        return null;
    }

    public static /* synthetic */ Handler l(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fef14e91", new Object[]{emuVar});
        }
        return emuVar.e;
    }

    public static /* synthetic */ TrtcEngineImpl m(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcEngineImpl) ipChange.ipc$dispatch("b77fe2f6", new Object[]{emuVar});
        }
        return emuVar.c;
    }

    public static /* synthetic */ String n(emu emuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8c602ad", new Object[]{emuVar});
        }
        return emuVar.d;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        TrtcLog.j("OutputStream", "dispose output stream, id:" + this.d);
        this.h.set(false);
        synchronized (this.f18683a) {
            try {
                Handler handler = this.e;
                if (handler != null) {
                    handler.getLooper().quit();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = null;
    }

    public void q(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bce76ec", new Object[]{this, bArr, new Integer(i)});
        } else {
            nf.h(new b(bArr, i));
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33016689", new Object[]{this, str});
        } else {
            nf.h(new a(str));
        }
    }

    public void s(TrtcDefines.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb52c0b", new Object[]{this, oVar});
            return;
        }
        synchronized (this.b) {
        }
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void sendDataFrame(TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef58ec86", new Object[]{this, fVar});
        } else if (this.h.get()) {
            nf.h(new c(fVar));
        }
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void setDataStreamObserver(ITrtcDataStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be69cfa", new Object[]{this, aVar});
            return;
        }
        synchronized (this.b) {
            this.g = aVar;
        }
        TrtcLog.j("OutputStream", "set data observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public void setObserver(ITrtcOutputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f10993a7", new Object[]{this, aVar});
            return;
        }
        synchronized (this.f18683a) {
            this.f = aVar;
        }
        TrtcLog.j("OutputStream", "set video observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public void setStatsObserver(ITrtcOutputStream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b64623", new Object[]{this, bVar});
            return;
        }
        synchronized (this.b) {
        }
    }

    @Override // com.taobao.trtc.api.ITrtcOutputStream
    public String streamId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd16091e", new Object[]{this});
        }
        return this.d;
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28bbd9d", new Object[]{this});
            return;
        }
        synchronized (this.f18683a) {
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dae384d", new Object[]{this});
            return;
        }
        synchronized (this.f18683a) {
            try {
                if (!this.h.get()) {
                    HandlerThread handlerThread = new HandlerThread("trtc-output-stream");
                    handlerThread.start();
                    this.e = new Handler(handlerThread.getLooper());
                    this.h.set(true);
                    TrtcLog.j("OutputStream", "init output stream, id:" + this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
