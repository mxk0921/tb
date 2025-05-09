package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hx8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int IRP_FACE_DETECT_RESULT_FLAG = 16;
    public static final int RESULT_HAS_FACE = 1;
    public static final int RESULT_NONE = -1;
    public static final int RESULT_NO_FACE = 0;
    public static final String SCENE = "FaceDetector";
    public static volatile hx8 c;

    /* renamed from: a  reason: collision with root package name */
    public final LimitLinkedHashMap<Integer, ix8> f20940a;
    public final LimitLinkedHashMap<Integer, g5c> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296927);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final hx8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hx8) ipChange.ipc$dispatch("c9875b39", new Object[]{this});
            }
            hx8 a2 = hx8.a();
            if (a2 == null) {
                synchronized (this) {
                    a2 = hx8.a();
                    if (a2 == null) {
                        a2 = new hx8(null);
                        hx8.d(a2);
                    }
                }
            }
            return a2;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ Bitmap e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements g5c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ hx8 f20941a;

            public a(hx8 hx8Var) {
                this.f20941a = hx8Var;
            }

            @Override // tb.g5c
            public void a(ix8 ix8Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("27956d0f", new Object[]{this, ix8Var});
                    return;
                }
                ckf.g(ix8Var, "result");
                hx8.c(this.f20941a).put(Integer.valueOf(ix8Var.b()), ix8Var);
                g5c g5cVar = (g5c) hx8.b(this.f20941a).get(Integer.valueOf(ix8Var.b()));
                if (g5cVar != null) {
                    g5cVar.a(ix8Var);
                }
            }
        }

        public b(int i, Bitmap bitmap) {
            this.d = i;
            this.e = bitmap;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/face/FaceDetectManager$detectFaceAsync$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            qu1 i = hx8.this.i();
            if (i != null) {
                i.b(this.d, this.e, new a(hx8.this));
            }
        }
    }

    static {
        t2o.a(481296926);
    }

    public /* synthetic */ hx8(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ hx8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hx8) ipChange.ipc$dispatch("23a84554", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ LimitLinkedHashMap b(hx8 hx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitLinkedHashMap) ipChange.ipc$dispatch("985b749a", new Object[]{hx8Var});
        }
        return hx8Var.b;
    }

    public static final /* synthetic */ LimitLinkedHashMap c(hx8 hx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitLinkedHashMap) ipChange.ipc$dispatch("18f2c2ee", new Object[]{hx8Var});
        }
        return hx8Var.f20940a;
    }

    public static final /* synthetic */ void d(hx8 hx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82afdc76", new Object[]{hx8Var});
        } else {
            c = hx8Var;
        }
    }

    public static /* synthetic */ boolean g(hx8 hx8Var, Bitmap bitmap, g5c g5cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ad55885", new Object[]{hx8Var, bitmap, g5cVar, new Integer(i), obj})).booleanValue();
        }
        if ((i & 2) != 0) {
            g5cVar = null;
        }
        return hx8Var.f(bitmap, g5cVar);
    }

    @JvmStatic
    public static final hx8 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hx8) ipChange.ipc$dispatch("c9875b39", new Object[0]);
        }
        return Companion.a();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f20940a.clear();
        this.b.clear();
    }

    public final boolean f(Bitmap bitmap, g5c g5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9f9d0e", new Object[]{this, bitmap, g5cVar})).booleanValue();
        }
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        if (i() == null) {
            return false;
        }
        int hashCode = bitmap.hashCode();
        if (g5cVar != null) {
            this.b.put(Integer.valueOf(hashCode), g5cVar);
        }
        VExecutors.defaultSharedThreadPool().submit(new b(hashCode, bitmap));
        return true;
    }

    public final boolean h(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee956da6", new Object[]{this, num})).booleanValue();
        }
        if (num == null || num.intValue() <= 0) {
            if (lg4.u4() || !lg4.a0()) {
                return false;
            }
            return true;
        } else if ((num.intValue() & 16) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final qu1 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu1) ipChange.ipc$dispatch("f9755c3a", new Object[]{this});
        }
        if (lg4.u4()) {
            return null;
        }
        return hp0.INSTANCE;
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4fa23a", new Object[]{this, new Integer(i)});
            return;
        }
        qu1 i2 = i();
        if (i2 != null) {
            i2.d(i);
        }
    }

    public final ix8 l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ix8) ipChange.ipc$dispatch("fdbf7255", new Object[]{this, new Integer(i)});
        }
        return this.f20940a.get(Integer.valueOf(i));
    }

    public final void m(int i, g5c g5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec3a4ac", new Object[]{this, new Integer(i), g5cVar});
        } else if (g5cVar != null) {
            ix8 ix8Var = this.f20940a.get(Integer.valueOf(i));
            if (ix8Var != null) {
                g5cVar.a(ix8Var);
            } else {
                this.b.put(Integer.valueOf(i), g5cVar);
            }
        }
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7364fd3a", new Object[]{this, new Integer(i)});
            return;
        }
        qu1 i2 = i();
        if (i2 != null) {
            i2.f(i);
        }
    }

    public hx8() {
        this.f20940a = new LimitLinkedHashMap<>(8);
        this.b = new LimitLinkedHashMap<>(8);
    }
}
