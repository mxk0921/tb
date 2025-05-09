package tb;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.DegradeNotAllowedException;
import com.taobao.pexode.exception.IncrementalDecodeException;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p0m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APPEND_DECODE_CHUNK_SIZE = 2048;
    public static final int MB = 1048576;
    public static final int MINIMUM_HEADER_BUFFER_SIZE = 64;
    public static final String TAG = "Pexode";
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25798a;
    public Context b;
    public final vw6 c;
    public final List<vw6> d;
    public b e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void b();

        void e();

        void f();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final p0m f25799a = new p0m();

        static {
            t2o.a(618659849);
        }

        public static /* synthetic */ p0m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p0m) ipChange.ipc$dispatch("4278f7b1", new Object[0]);
            }
            return f25799a;
        }
    }

    static {
        t2o.a(618659846);
    }

    public static boolean a(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b8ca1f", new Object[]{buiVar})).booleanValue();
        }
        if (buiVar != null) {
            Iterator it = ((CopyOnWriteArrayList) c.a().d).iterator();
            while (it.hasNext()) {
                if (((vw6) it.next()).isSupported(buiVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9919926e", new Object[]{buiVar})).booleanValue();
        }
        return ((y2r) c.a().c).isSupported(buiVar);
    }

    public static void c(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f43042", new Object[]{pexodeOptions});
            return;
        }
        if (pexodeOptions.enableAshmem && !m()) {
            xv8.k(TAG, "cannot use ashmem in the runtime, disabled ashmem already!", new Object[0]);
            pexodeOptions.enableAshmem = false;
        }
        if (pexodeOptions.inBitmap != null && !o()) {
            xv8.k(TAG, "cannot reuse bitmap in the runtime, disabled inBitmap already!", new Object[0]);
            pexodeOptions.inBitmap = null;
        }
    }

    public static q0m d(InputStream inputStream, PexodeOptions pexodeOptions) throws IOException, PexodeException {
        RewindableStream rewindableStream;
        RewindableStream deoVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("5281e00b", new Object[]{inputStream, pexodeOptions});
        }
        if (inputStream instanceof RewindableStream) {
            rewindableStream = (RewindableStream) inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                deoVar = new ceo((FileInputStream) inputStream, 1048576);
            } else {
                deoVar = new deo(inputStream, 1048576);
            }
            rewindableStream = deoVar;
        }
        return e(rewindableStream, pexodeOptions, ow6.f());
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c634ff2", new Object[]{new Boolean(z)});
        } else {
            PexodeOptions.sEnabledCancellability = z;
        }
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb845ea6", new Object[]{new Boolean(z)});
            return;
        }
        ow6.f().b = z;
        xv8.k(TAG, "force degrading to no ashmem, result=%b", Boolean.valueOf(z));
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0928d7", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (c.a()) {
            try {
                if (z != c.a().f25798a) {
                    xv8.k(TAG, "force degrading to system decoder, result=%b", Boolean.valueOf(z));
                    ((CopyOnWriteArrayList) c.a().d).remove(c.a().c);
                    if (z) {
                        ((CopyOnWriteArrayList) c.a().d).add(0, c.a().c);
                    } else {
                        ((CopyOnWriteArrayList) c.a().d).add(c.a().c);
                    }
                    c.a().f25798a = z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List<vw6> i(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c88000a0", new Object[]{buiVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) c.a().d).iterator();
        while (it.hasNext()) {
            vw6 vw6Var = (vw6) it.next();
            if (vw6Var.isSupported(buiVar)) {
                arrayList.add(vw6Var);
            }
        }
        return arrayList;
    }

    public static b j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3e2a793a", new Object[0]);
        }
        return c.a().e;
    }

    public static int k(bui buiVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fd7f575", new Object[]{buiVar, bArr})).intValue();
        }
        bui buiVar2 = z37.APNG;
        if (buiVar2.g(buiVar) || buiVar2.f(bArr)) {
            return 1;
        }
        bui buiVar3 = z37.GIF;
        if (buiVar3.g(buiVar) || buiVar3.f(bArr)) {
            return 0;
        }
        return -1;
    }

    public static void l(vw6 vw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa98a2a7", new Object[]{vw6Var});
            return;
        }
        synchronized (c.a()) {
            try {
                if (c.a().f25798a) {
                    ((CopyOnWriteArrayList) c.a().d).add(1, vw6Var);
                } else {
                    ((CopyOnWriteArrayList) c.a().d).add(0, vw6Var);
                }
                if (c.a().b != null) {
                    vw6Var.prepare(c.a().b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40695350", new Object[0])).booleanValue();
        }
        NdkCore.b();
        return false;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2147959", new Object[0])).booleanValue();
        }
        return c.a().f25798a;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a5ccdb", new Object[0])).booleanValue();
        }
        return true;
    }

    public static int p(RewindableStream rewindableStream, PexodeOptions pexodeOptions, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ec3ed9c", new Object[]{rewindableStream, pexodeOptions, new Boolean(z)})).intValue();
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            return inputType;
        }
        vw6 s = s(pexodeOptions);
        if (s.acceptInputType(inputType, pexodeOptions.outMimeType, z)) {
            return inputType;
        }
        if (inputType != 2 || !s.acceptInputType(3, pexodeOptions.outMimeType, z)) {
            return 1;
        }
        return 3;
    }

    public static void q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{context});
            return;
        }
        synchronized (c.a()) {
            try {
                c.a().b = context;
                f8q.a(context);
                NdkCore.c(context);
                Iterator it = ((CopyOnWriteArrayList) c.a().d).iterator();
                while (it.hasNext()) {
                    ((vw6) it.next()).prepare(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static vw6 r(RewindableStream rewindableStream, PexodeOptions pexodeOptions, int i) throws IOException {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vw6) ipChange.ipc$dispatch("43e9f828", new Object[]{rewindableStream, pexodeOptions, new Integer(i)});
        }
        byte[] g2 = ow6.f().g(i);
        pexodeOptions.tempHeaderBuffer = g2;
        try {
            i2 = rewindableStream.read(g2, 0, i);
        } catch (IOException unused) {
        }
        rewindableStream.rewind();
        int k = k(null, pexodeOptions.tempHeaderBuffer);
        if (i2 > 0) {
            Iterator it = ((CopyOnWriteArrayList) c.a().d).iterator();
            while (it.hasNext()) {
                vw6 vw6Var = (vw6) it.next();
                bui detectMimeType = vw6Var.detectMimeType(pexodeOptions.tempHeaderBuffer);
                pexodeOptions.outMimeType = detectMimeType;
                if (detectMimeType != null) {
                    if (k != -1 && !(vw6Var instanceof yw0)) {
                        pexodeOptions.forceSkipCache = true;
                    }
                    return vw6Var;
                }
            }
        }
        if (k != -1) {
            pexodeOptions.forceSkipCache = true;
        }
        return c.a().c;
    }

    public static vw6 s(PexodeOptions pexodeOptions) {
        int i;
        bui buiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vw6) ipChange.ipc$dispatch("bd80bbb3", new Object[]{pexodeOptions});
        }
        if (pexodeOptions == null || (buiVar = pexodeOptions.outMimeType) == null) {
            i = -1;
        } else {
            i = k(buiVar, null);
            Iterator it = ((CopyOnWriteArrayList) c.a().d).iterator();
            while (it.hasNext()) {
                vw6 vw6Var = (vw6) it.next();
                if (vw6Var.isSupported(pexodeOptions.outMimeType)) {
                    if (i != -1 && !(vw6Var instanceof yw0)) {
                        pexodeOptions.forceSkipCache = true;
                    }
                    return vw6Var;
                }
            }
        }
        if (i != -1) {
            pexodeOptions.forceSkipCache = true;
        }
        return c.a().c;
    }

    public static void t(lp2 lp2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959e719b", new Object[]{lp2Var});
        } else {
            ow6.f().n(lp2Var);
        }
    }

    public static void u(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93afbfc", new Object[]{bVar});
        } else {
            c.a().e = bVar;
        }
    }

    public p0m() {
        y2r y2rVar = new y2r();
        this.c = y2rVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.d = copyOnWriteArrayList;
        copyOnWriteArrayList.add(y2rVar);
    }

    public static q0m e(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws IOException, PexodeException {
        vw6 vw6Var;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("c9e12c48", new Object[]{rewindableStream, pexodeOptions, t97Var});
        }
        c(pexodeOptions);
        if (pexodeOptions.outMimeType == null) {
            vw6Var = r(rewindableStream, pexodeOptions, rewindableStream.getBufferLength());
        } else {
            vw6Var = s(pexodeOptions);
        }
        bui buiVar = pexodeOptions.outMimeType;
        pexodeOptions.outAlpha = buiVar != null && buiVar.c();
        boolean z = pexodeOptions.enableAshmem;
        Bitmap bitmap2 = pexodeOptions.inBitmap;
        if (!pexodeOptions.incrementalDecode || vw6Var.canDecodeIncrementally(buiVar)) {
            q0m decode = vw6Var.decode(rewindableStream, pexodeOptions, t97Var);
            if (!(decode == null || (bitmap = decode.f26429a) == null)) {
                bitmap.getConfig();
            }
            xv8.a(TAG, "decoder=%s, type=%d, justBounds=%b, sizeAvailable=%b, ashmem=%b, inBitmap=%b, increment=%b, result=%s", vw6Var, Integer.valueOf(rewindableStream.getInputType()), Boolean.valueOf(pexodeOptions.justDecodeBounds), Boolean.valueOf(pexodeOptions.isSizeAvailable()), Boolean.valueOf(pexodeOptions.enableAshmem), Boolean.valueOf(pexodeOptions.inBitmap != null), Boolean.valueOf(pexodeOptions.incrementalDecode), decode);
            if (ow6.l(decode, pexodeOptions) || vw6Var == c.a().c) {
                if (decode != null) {
                    decode.c = vw6Var.toString();
                }
                return decode;
            }
            vw6 vw6Var2 = c.a().c;
            if (buiVar != null) {
                y2r y2rVar = (y2r) vw6Var2;
                if (y2rVar.isSupported(buiVar) && (!pexodeOptions.incrementalDecode || y2rVar.canDecodeIncrementally(buiVar))) {
                    if (pexodeOptions.allowDegrade2System) {
                        rewindableStream.rewind();
                        pexodeOptions.enableAshmem = z;
                        pexodeOptions.inBitmap = bitmap2;
                        q0m decode2 = y2rVar.decode(rewindableStream, pexodeOptions, t97Var);
                        if (!pexodeOptions.cancelled) {
                            ((ow6) t97Var).j(ow6.m(decode2, pexodeOptions));
                        }
                        if (decode2 != null) {
                            decode2.c = y2rVar.toString();
                        }
                        return decode2;
                    }
                    throw new DegradeNotAllowedException("unfortunately, system supported type[" + buiVar + "] but not allow degrading to system");
                }
            }
            if (pexodeOptions.incrementalDecode) {
                throw new IncrementalDecodeException("incremental decoding not supported for type[" + buiVar + "] when degraded to system");
            }
            throw new NotSupportedException("type[" + buiVar + "] not supported when degraded to system");
        }
        throw new IncrementalDecodeException("incremental decoding not supported for type[" + buiVar + "] in " + vw6Var);
    }
}
