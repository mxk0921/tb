package tb;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class now {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends now {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f24873a;
        public long b;
        public volatile boolean c;
        public Choreographer.FrameCallback d;
        public final FCanvasJNIBridge e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else if (b.e(b.this)) {
                    if (!b.f(b.this)) {
                        b.i(b.this).dispatchVsync(j);
                    } else if (b.g(b.this) == 0 || j - b.g(b.this) >= 33333333) {
                        b.i(b.this).dispatchVsync(j);
                        b.h(b.this, j);
                    }
                    b.j(b.this);
                }
            }
        }

        static {
            t2o.a(945815579);
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dc485f4", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dd84b993", new Object[]{bVar})).booleanValue();
            }
            return bVar.f24873a;
        }

        public static /* synthetic */ long g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ad44ed22", new Object[]{bVar})).longValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ long h(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6afe84c", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.b = j;
            return j;
        }

        public static /* synthetic */ FCanvasJNIBridge i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FCanvasJNIBridge) ipChange.ipc$dispatch("98b82c81", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fcanvas/integration/VsyncScheduler$ContinuouslyModeVSyncWaiterImpl");
        }

        public static /* synthetic */ void j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4cc5546c", new Object[]{bVar});
            } else {
                bVar.k();
            }
        }

        @Override // tb.now
        public void a() {
            FCanvasJNIBridge fCanvasJNIBridge;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bffb80b0", new Object[]{this});
            } else if (!this.c && (fCanvasJNIBridge = this.e) != null) {
                this.d = new a();
                fCanvasJNIBridge.dispatchVsync(System.nanoTime());
                this.c = true;
                k();
            }
        }

        @Override // tb.now
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a02127e2", new Object[]{this});
            } else if (this.c && this.d != null) {
                Choreographer.getInstance().removeFrameCallback(this.d);
                this.c = false;
            }
        }

        @Override // tb.now
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b3c7432", new Object[]{this, new Boolean(z)});
            } else {
                this.f24873a = z;
            }
        }

        public final void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf83b06a", new Object[]{this});
            } else if (this.d != null) {
                Choreographer.getInstance().postFrameCallback(this.d);
            }
        }

        public b(FCanvasJNIBridge fCanvasJNIBridge, boolean z) {
            this.c = false;
            this.e = fCanvasJNIBridge;
            this.f24873a = z;
        }
    }

    static {
        t2o.a(945815577);
    }

    public static now b(FCanvasJNIBridge fCanvasJNIBridge, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (now) ipChange.ipc$dispatch("13c7b82c", new Object[]{fCanvasJNIBridge, new Boolean(z)});
        }
        return new b(fCanvasJNIBridge, z);
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(boolean z);
}
