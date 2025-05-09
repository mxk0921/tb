package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.IncrementalDecodeException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileDescriptor;
import java.io.IOException;
import tb.ate;
import tb.bui;
import tb.bzn;
import tb.f8q;
import tb.l6h;
import tb.ow6;
import tb.p0m;
import tb.q0m;
import tb.rh9;
import tb.t2o;
import tb.t97;
import tb.u5h;
import tb.xv8;
import tb.z37;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WebPDecoder extends rh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIBRARY_JNI_VERSION = 2;
    private static final int MAX_RETRY_TIME = 2;
    private static final int NATIVE_RET_DECODE_OK = 0;
    private static final int NATIVE_RET_NULL_STRAIGHT = 2;
    private static final int NATIVE_RET_TRY_DEGRADING = 1;
    private static final int VP8_STATUS_OK = 0;
    private static final int VP8_STATUS_REQUEST_CANCELLED = -6;
    private static final int VP8_STATUS_SUSPENDED = 5;
    private static boolean remoteSoValid;
    private static boolean sIsSoInstalled;
    private static int sRetryTime;
    private final ate.a CONFIG_OUT_DESTRUCTOR = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ate.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(WebPDecoder webPDecoder) {
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8641dd47", new Object[]{this, new Long(j)});
            } else {
                WebPDecoder.access$400(j);
            }
        }
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return sIsSoInstalled;
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        sIsSoInstalled = z;
        return z;
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return nativeLoadedVersionTest();
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return sRetryTime;
    }

    public static /* synthetic */ int access$208() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("271339f4", new Object[0])).intValue();
        }
        int i = sRetryTime;
        sRetryTime = i + 1;
        return i;
    }

    public static /* synthetic */ void access$300(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            loadRemoteSo(str);
        }
    }

    public static /* synthetic */ void access$400(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7011a9", new Object[]{new Long(j)});
        } else {
            nativeDestructConfigOut(j);
        }
    }

    private int decodeReturnInBuffer(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, ate ateVar, boolean z, boolean z2) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60e17be2", new Object[]{this, rewindableStream, pexodeOptions, bitmap, ateVar, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (!z) {
            return decodeInBitmapBuffer(rewindableStream, pexodeOptions, bitmap);
        }
        if (z2) {
            return decodeFirstIncrementally(rewindableStream, pexodeOptions, bitmap, false);
        }
        return decodeLaterIncrementally(rewindableStream, pexodeOptions, ateVar);
    }

    private static String getLibraryName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7797849", new Object[0]);
        }
        return "pexwebp";
    }

    public static /* synthetic */ Object ipc$super(WebPDecoder webPDecoder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/decoder/WebPDecoder");
    }

    private static native int nativeDecodeBytesIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeBytesWithOutAddressIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native int nativeDecodeBytesWithOutBufferIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2, long[] jArr);

    private static native int nativeDecodeFdIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeFdWithOutAddressIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

    private static native int nativeDecodeFdWithOutBufferIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr, long[] jArr);

    private static native int nativeDecodeStreamIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeStreamWithOutAddress(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeStreamWithOutAddressIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeStreamWithOutBuffer(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native int nativeDecodeStreamWithOutBufferIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, byte[] bArr2, long[] jArr);

    private static native void nativeDestructConfigOut(long j);

    private static native int nativeLoadedVersionTest();

    @Override // tb.vw6
    public boolean acceptInputType(int i, bui buiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15171897", new Object[]{this, new Integer(i), buiVar, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    @Override // tb.vw6
    public boolean canDecodeIncrementally(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a40595", new Object[]{this, buiVar})).booleanValue();
        }
        return isSupported(buiVar);
    }

    @Override // tb.vw6
    public q0m decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("4b1c051d", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        if (!pexodeOptions.isSizeAvailable()) {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, null);
            } else if (inputType != 2) {
                byte[] g = ow6.f().g(64);
                nativeDecodeStreamWithOutBuffer(rewindableStream, g, pexodeOptions, null);
                ow6.f().k(g);
            } else {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            }
        } else if (pexodeOptions.sampleSize != ow6.e(pexodeOptions)) {
            int i = pexodeOptions.outWidth;
            int i2 = i / pexodeOptions.sampleSize;
            pexodeOptions.outWidth = i2;
            pexodeOptions.outHeight = (pexodeOptions.outHeight * i2) / i;
        }
        ow6.p(pexodeOptions, pexodeOptions.sampleSize);
        if (pexodeOptions.justDecodeBounds || ow6.b(pexodeOptions)) {
            return null;
        }
        if (!pexodeOptions.isSizeAvailable()) {
            xv8.c(p0m.TAG, "WebPDecoder size unavailable before bitmap decoding", new Object[0]);
            return null;
        }
        if (pexodeOptions.enableAshmem && !ow6.f().b) {
            bitmap = decodeAshmem(rewindableStream, pexodeOptions, t97Var);
        } else if (pexodeOptions.inBitmap == null || ow6.f().f25706a) {
            bitmap = decodeNormal(rewindableStream, pexodeOptions);
        } else {
            bitmap = decodeInBitmap(rewindableStream, pexodeOptions, t97Var);
        }
        return q0m.a(bitmap);
    }

    @Override // tb.rh9
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        boolean z;
        Bitmap bitmap;
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ca66bf0e", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        boolean z3 = pexodeOptions.incrementalDecode;
        ate d = ow6.d(pexodeOptions);
        if (d == null) {
            z = true;
        } else {
            z = false;
        }
        Bitmap bitmap2 = null;
        if (!z3 || z) {
            bitmap = rh9.newBitmap(pexodeOptions, true);
        } else {
            bitmap = null;
        }
        if (!z3) {
            i = decodeInBitmapAddress(rewindableStream, pexodeOptions, bitmap);
        } else if (z) {
            i = decodeFirstIncrementally(rewindableStream, pexodeOptions, bitmap, true);
        } else {
            i = decodeLaterIncrementally(rewindableStream, pexodeOptions, d);
        }
        if (i == 0) {
            if (z3) {
                return ow6.d(pexodeOptions).a();
            }
            return bitmap;
        } else if (2 == i) {
            return null;
        } else {
            if (!ow6.b(pexodeOptions) && pexodeOptions.allowDegrade2NoAshmem) {
                rewindableStream.rewind();
                bitmap2 = decodeNormal(rewindableStream, pexodeOptions);
                if (!ow6.b(pexodeOptions)) {
                    if (bitmap2 == null && !z3) {
                        z2 = false;
                    }
                    ((ow6) t97Var).h(z2);
                }
            }
            return bitmap2;
        }
    }

    @Override // tb.rh9
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("26e3d7d9", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        boolean z3 = pexodeOptions.incrementalDecode;
        ate d = ow6.d(pexodeOptions);
        if (d == null) {
            z = true;
        } else {
            z = false;
        }
        int decodeReturnInBuffer = decodeReturnInBuffer(rewindableStream, pexodeOptions, pexodeOptions.inBitmap, d, z3, z);
        if (decodeReturnInBuffer != 0) {
            Bitmap bitmap = null;
            if (2 == decodeReturnInBuffer) {
                return null;
            }
            if (!ow6.b(pexodeOptions) && pexodeOptions.allowDegrade2NoInBitmap) {
                rewindableStream.rewind();
                bitmap = decodeNormal(rewindableStream, pexodeOptions);
                if (!ow6.b(pexodeOptions)) {
                    if (bitmap == null && !z3) {
                        z2 = false;
                    }
                    ((ow6) t97Var).i(z2);
                }
            }
            return bitmap;
        } else if (z3) {
            return ow6.d(pexodeOptions).a();
        } else {
            return pexodeOptions.inBitmap;
        }
    }

    @Override // tb.vw6
    public bui detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("51225bd0", new Object[]{this, bArr});
        }
        if (!sIsSoInstalled) {
            return null;
        }
        bui buiVar = z37.WEBP;
        if (buiVar.f(bArr)) {
            return buiVar;
        }
        bui buiVar2 = z37.WEBP_A;
        if (buiVar2.f(bArr)) {
            return buiVar2;
        }
        return null;
    }

    @Override // tb.vw6
    public boolean isSupported(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211c2fa", new Object[]{this, buiVar})).booleanValue();
        }
        if (!sIsSoInstalled || buiVar == null || !z37.WEBP.a().equals(buiVar.a())) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "WebPDecoder@" + Integer.toHexString(hashCode());
    }

    public WebPDecoder() {
        String libraryName = getLibraryName();
        try {
            loadRemoteSo(libraryName);
        } catch (Throwable th) {
            sIsSoInstalled = false;
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", libraryName, th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11457a;

        public a(String str) {
            this.f11457a = str;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            WebPDecoder.access$002(l6hVar != null && l6hVar.i() && WebPDecoder.access$100() == 2);
            xv8.c(p0m.TAG, "load remote lib%s.so finish status=%b index=%d", this.f11457a, Boolean.valueOf(WebPDecoder.access$000()), Integer.valueOf(WebPDecoder.access$200()));
            if (!WebPDecoder.access$000() && WebPDecoder.access$200() < 2) {
                WebPDecoder.access$208();
                WebPDecoder.access$300(this.f11457a);
            }
        }
    }

    private static int decodeInBitmapAddress(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bce7fad8", new Object[]{rewindableStream, pexodeOptions, bitmap})).intValue();
        }
        if (rh9.invalidBitmap(bitmap, pexodeOptions, "decodeInBitmapAddress")) {
            return 1;
        }
        long pixelAddressFromBitmap = rh9.getPixelAddressFromBitmap(bitmap);
        if (pixelAddressFromBitmap == 0) {
            return 1;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            z = nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, pixelAddressFromBitmap);
        } else if (inputType != 2) {
            byte[] g = ow6.f().g(2048);
            z = nativeDecodeStreamWithOutAddress(rewindableStream, g, pexodeOptions, pixelAddressFromBitmap);
            ow6.f().k(g);
        } else {
            z = nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, pixelAddressFromBitmap);
        }
        return !z ? 1 : 0;
    }

    private int decodeInBitmapBuffer(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap) {
        byte[] pixelBufferFromBitmap;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("713cae08", new Object[]{this, rewindableStream, pexodeOptions, bitmap})).intValue();
        }
        if (rh9.invalidBitmap(bitmap, pexodeOptions, "decodeInBitmapBuffer") || (pixelBufferFromBitmap = getPixelBufferFromBitmap(bitmap)) == null) {
            return 1;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            z = nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, pixelBufferFromBitmap);
        } else if (inputType != 2) {
            byte[] g = ow6.f().g(2048);
            z = nativeDecodeStreamWithOutBuffer(rewindableStream, g, pexodeOptions, pixelBufferFromBitmap);
            ow6.f().k(g);
        } else {
            z = nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, pixelBufferFromBitmap);
        }
        return !z ? 1 : 0;
    }

    private static void loadRemoteSo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8840d9", new Object[]{str});
            return;
        }
        xv8.c(p0m.TAG, "start load remote lib%s.so status=%b index=%d", str, Boolean.valueOf(sIsSoInstalled), Integer.valueOf(sRetryTime));
        if (remoteSoValid) {
            bzn.d().a(str, new a(str));
        }
    }

    @Override // tb.rh9
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a8d841ea", new Object[]{this, rewindableStream, pexodeOptions});
        }
        boolean z = pexodeOptions.incrementalDecode;
        ate d = ow6.d(pexodeOptions);
        boolean z2 = d == null;
        Bitmap newBitmap = (!z || z2) ? rh9.newBitmap(pexodeOptions, false) : null;
        int decodeReturnInBuffer = decodeReturnInBuffer(rewindableStream, pexodeOptions, newBitmap, d, z, z2);
        if (decodeReturnInBuffer == 0) {
            return z ? ow6.d(pexodeOptions).a() : newBitmap;
        }
        if (1 != decodeReturnInBuffer || !z) {
            return null;
        }
        throw new IncrementalDecodeException("incremental decoding error at the first and cannot degrade now");
    }

    private int decodeLaterIncrementally(RewindableStream rewindableStream, PexodeOptions pexodeOptions, ate ateVar) throws PexodeException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a92e3f6", new Object[]{this, rewindableStream, pexodeOptions, ateVar})).intValue();
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            i = nativeDecodeBytesIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, ateVar.b());
        } else if (inputType != 2) {
            byte[] g = ow6.f().g(2048);
            i = nativeDecodeStreamIncrementally(rewindableStream, g, pexodeOptions, ateVar.b());
            ow6.f().k(g);
        } else {
            i = nativeDecodeFdIncrementally(rewindableStream.getFD(), pexodeOptions, ateVar.b());
        }
        if (i != 5 || ow6.b(pexodeOptions)) {
            ateVar.c();
        }
        if (i == 5 || i == -6) {
            return 2;
        }
        if (i == 0) {
            return 0;
        }
        throw new IncrementalDecodeException("native decode bytes with buffer incrementally error, status=" + i);
    }

    @Override // tb.vw6
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (!sIsSoInstalled) {
            String libraryName = getLibraryName();
            boolean z = f8q.b(libraryName, 2) && nativeLoadedVersionTest() == 2;
            sIsSoInstalled = z;
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", libraryName, Boolean.valueOf(z));
        }
    }

    static {
        t2o.a(618659872);
        remoteSoValid = false;
        try {
            IpChange ipChange = bzn.$ipChange;
            remoteSoValid = true;
        } catch (Throwable th) {
            xv8.c(p0m.TAG, "remote so module not import", th);
        }
    }

    private int decodeFirstIncrementally(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) throws PexodeException {
        long j;
        byte[] bArr;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad6a1295", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).intValue();
        }
        if (rh9.invalidBitmap(bitmap, pexodeOptions, "decodeFirstIncrementally")) {
            return 1;
        }
        if (z) {
            bArr = null;
            j = rh9.getPixelAddressFromBitmap(bitmap);
        } else {
            bArr = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        if (bArr == null && j == 0) {
            return 1;
        }
        long[] jArr = new long[1];
        int inputType = rewindableStream.getInputType();
        if (inputType != 1) {
            if (inputType != 2) {
                byte[] g = ow6.f().g(2048);
                if (z) {
                    i = nativeDecodeStreamWithOutAddressIncrementally(rewindableStream, g, pexodeOptions, j, jArr);
                } else {
                    i = nativeDecodeStreamWithOutBufferIncrementally(rewindableStream, g, pexodeOptions, bArr, jArr);
                }
                ow6.f().k(g);
            } else if (z) {
                i = nativeDecodeFdWithOutAddressIncrementally(rewindableStream.getFD(), pexodeOptions, j, jArr);
            } else {
                i = nativeDecodeFdWithOutBufferIncrementally(rewindableStream.getFD(), pexodeOptions, bArr, jArr);
            }
        } else if (z) {
            i = nativeDecodeBytesWithOutAddressIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j, jArr);
        } else {
            i = nativeDecodeBytesWithOutBufferIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, bArr, jArr);
        }
        ate ateVar = new ate(bitmap, jArr[0], this.CONFIG_OUT_DESTRUCTOR);
        if (i != 5 || ow6.b(pexodeOptions)) {
            ateVar.c();
        }
        if (i == -6) {
            return 2;
        }
        if (i != 0 && i != 5) {
            return 1;
        }
        ow6.o(pexodeOptions, ateVar);
        return i == 5 ? 2 : 0;
    }
}
