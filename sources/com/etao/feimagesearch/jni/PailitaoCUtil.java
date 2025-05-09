package com.etao.feimagesearch.jni;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.agh;
import tb.bzn;
import tb.l6h;
import tb.mzu;
import tb.p73;
import tb.t2o;
import tb.u5h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PailitaoCUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f4757a = false;
    public static long b = 0;

    static {
        t2o.a(482344962);
        g();
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        f4757a = z;
        return z;
    }

    public static void b() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f415531", new Object[0]);
        } else if (f4757a) {
            try {
                destroyWatermark();
            } catch (Throwable th) {
                throw new Exception("call initWaterMark err.", th);
            }
        } else {
            g();
            throw new Exception("PailitaoCUtil init err");
        }
    }

    public static String c(byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f7637a6", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (f4757a) {
            try {
                byte[] detectVideoWatermark = detectVideoWatermark(bArr, i, i2);
                if (detectVideoWatermark == null) {
                    return "";
                }
                return new String(detectVideoWatermark, "utf-8");
            } catch (Throwable th) {
                throw new Exception("call detectWaterMark err.", th);
            }
        } else {
            g();
            throw new Exception("PailitaoCUtil init err");
        }
    }

    public static int d(byte[] bArr, int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7709482", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (f4757a) {
            try {
                return detectWatermark(bArr, i, i2);
            } catch (Throwable th) {
                throw new Exception("call detectWaterMark err.", th);
            }
        } else {
            g();
            throw new Exception("PailitaoCUtil init err");
        }
    }

    private static native void destroyWatermark();

    private static native byte[] detectVideoWatermark(byte[] bArr, int i, int i2);

    private static native int detectWatermark(byte[] bArr, int i, int i2);

    public static void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203b03db", new Object[0]);
        } else if (f4757a) {
            try {
                initWatermark();
            } catch (Throwable th) {
                throw new Exception("call initWaterMark err.", th);
            }
        } else {
            g();
            throw new Exception("PailitaoCUtil init err");
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[0])).booleanValue();
        }
        return f4757a;
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a90ccf", new Object[0]);
        } else if (!f4757a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - b >= 300000) {
                b = currentTimeMillis;
                try {
                    mzu.n(p73.f25916a, "beginLoadRemoteSo", 19999, new String[0]);
                    bzn.d().a("PailitaoCUtil", new a());
                } catch (Throwable th) {
                    agh.r("PltCameraPai", "loadRemoteSo", agh.f("", th));
                }
            }
        }
    }

    public static int h(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr2, int i8, int i9) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37c9a6e8", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), bArr2, new Integer(i8), new Integer(i9)})).intValue();
        }
        if (f4757a) {
            try {
                g();
                return scaleYuv(bArr, i, i2, i3, i4, i5, i6, i7, bArr2, i8, i9);
            } catch (Throwable th) {
                throw new Exception("call scaleYuvNative err.", th);
            }
        } else {
            throw new Exception("PailitaoCUtil init err");
        }
    }

    public static void i(byte[] bArr, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58aa5fe", new Object[]{bArr, byteBuffer, new Integer(i), byteBuffer2, new Integer(i2), byteBuffer3, new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        } else if (f4757a) {
            try {
                yuv420pToBitmap(bArr, byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, i5, i6, i7);
            } catch (Throwable th) {
                throw new Exception("call yuv420pToBitmap err.", th);
            }
        } else {
            g();
            throw new Exception("PailitaoCUtil init err");
        }
    }

    private static native void initWatermark();

    private static native int scaleYuv(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr2, int i8, int i9);

    private static native void yuv420pToBitmap(byte[] bArr, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
            } else if (l6hVar.i()) {
                mzu.n(p73.f25916a, "loadRemoteSoSuccess", 19999, new String[0]);
                PailitaoCUtil.a(true);
            }
        }
    }
}
