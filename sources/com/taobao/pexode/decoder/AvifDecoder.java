package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileDescriptor;
import java.io.IOException;
import tb.bui;
import tb.bzn;
import tb.czn;
import tb.l6h;
import tb.ow6;
import tb.p0m;
import tb.q0m;
import tb.rh9;
import tb.sl1;
import tb.t97;
import tb.u5h;
import tb.xv8;
import tb.y2r;
import tb.z37;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AvifDecoder extends rh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static b b;
    public static boolean c;
    public static int d;
    public static boolean e;
    public static boolean f;

    /* renamed from: a  reason: collision with root package name */
    public final y2r f11453a = new y2r();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(boolean z, int i);
    }

    static {
        z37.ALL_EXTENSION_TYPES.add(sl1.AVIF);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f22cfeb3", new Object[0])).intValue();
        }
        int i = d;
        d = i + 1;
        return i;
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return d;
    }

    public static /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a6d6bd84", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc1585", new Object[]{str});
        } else {
            loadRemoteSo(str);
        }
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c143b954", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    public static void g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f9466c", new Object[]{bVar});
            return;
        }
        b = bVar;
        if (e) {
            bVar.a(c, d);
        }
    }

    public static String getLibraryName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7797849", new Object[0]);
        }
        return "pexavif";
    }

    public static /* synthetic */ Object ipc$super(AvifDecoder avifDecoder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/decoder/AvifDecoder");
    }

    public static void loadRemoteSo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8840d9", new Object[]{str});
        } else {
            bzn.d().a(str, new a(str));
        }
    }

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

    @Override // tb.vw6
    public boolean acceptInputType(int i, bui buiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15171897", new Object[]{this, new Integer(i), buiVar, new Boolean(z)})).booleanValue();
        }
        if (i != 3) {
            return true;
        }
        return false;
    }

    @Override // tb.vw6
    public boolean canDecodeIncrementally(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a40595", new Object[]{this, buiVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.vw6
    public q0m decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        Bitmap bitmap;
        y2r y2rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("4b1c051d", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        if (f && pexodeOptions.fromLocal && (y2rVar = this.f11453a) != null) {
            return y2rVar.decode(rewindableStream, pexodeOptions, t97Var);
        }
        if (!pexodeOptions.isSizeAvailable()) {
            if (rewindableStream.getInputType() == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, rewindableStream.getBuffer());
            } else if (rewindableStream.getInputType() == 2) {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            } else if (rewindableStream.getInputType() == 3) {
                throw new NotSupportedException("Not support stream type when AvifImage decoding!");
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
            xv8.c(p0m.TAG, "AvifDecoder size unavailable before bitmap decoding", new Object[0]);
            return null;
        }
        if (pexodeOptions.enableAshmem && !ow6.f().b) {
            bitmap = decodeAshmem(rewindableStream, pexodeOptions, t97Var);
        } else if (pexodeOptions.inBitmap == null || ow6.f().f25706a) {
            bitmap = decodeNormal(rewindableStream, pexodeOptions);
        } else {
            bitmap = decodeInBitmap(rewindableStream, pexodeOptions, t97Var);
        }
        xv8.c(p0m.TAG, "AvifDecoder returnBitmap=%s", bitmap);
        return q0m.a(bitmap);
    }

    @Override // tb.rh9
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ca66bf0e", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        Bitmap newBitmap = rh9.newBitmap(pexodeOptions, true);
        if (e(rewindableStream, pexodeOptions, newBitmap, true)) {
            return newBitmap;
        }
        if (ow6.b(pexodeOptions) || !pexodeOptions.allowDegrade2NoAshmem) {
            return null;
        }
        rewindableStream.rewind();
        Bitmap decodeNormal = decodeNormal(rewindableStream, pexodeOptions);
        if (ow6.b(pexodeOptions)) {
            return decodeNormal;
        }
        if (decodeNormal == null) {
            z = false;
        }
        ((ow6) t97Var).h(z);
        return decodeNormal;
    }

    @Override // tb.rh9
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("26e3d7d9", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        if (e(rewindableStream, pexodeOptions, pexodeOptions.inBitmap, false)) {
            return pexodeOptions.inBitmap;
        }
        if (ow6.b(pexodeOptions) || !pexodeOptions.allowDegrade2NoInBitmap) {
            return null;
        }
        rewindableStream.rewind();
        Bitmap decodeNormal = decodeNormal(rewindableStream, pexodeOptions);
        if (ow6.b(pexodeOptions)) {
            return decodeNormal;
        }
        if (decodeNormal == null) {
            z = false;
        }
        ((ow6) t97Var).i(z);
        return decodeNormal;
    }

    @Override // tb.rh9
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a8d841ea", new Object[]{this, rewindableStream, pexodeOptions});
        }
        Bitmap newBitmap = rh9.newBitmap(pexodeOptions, false);
        if (e(rewindableStream, pexodeOptions, newBitmap, false)) {
            return newBitmap;
        }
        return null;
    }

    @Override // tb.vw6
    public bui detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("51225bd0", new Object[]{this, bArr});
        }
        if (!c) {
            return null;
        }
        bui buiVar = sl1.AVIF;
        if (buiVar.f(bArr)) {
            return buiVar;
        }
        return null;
    }

    public final boolean e(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23636d51", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).booleanValue();
        }
        if (rh9.invalidBitmap(bitmap, pexodeOptions, "AvifDecoder decodeIntoBitmap")) {
            return false;
        }
        byte[] bArr = null;
        if (z) {
            j = rh9.getPixelAddressFromBitmap(bitmap);
        } else if (Build.VERSION.SDK_INT >= 26) {
            j = rh9.getPixelAddressFromBitmap(bitmap);
            NdkCore.nativeUnpinBitmap(bitmap);
        } else {
            bArr = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        if (rewindableStream.getInputType() == 1) {
            if (bArr != null) {
                return nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, bArr);
            }
            if (j != 0) {
                return nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j);
            }
        } else if (rewindableStream.getInputType() == 2) {
            if (bArr != null) {
                return nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, bArr);
            }
            if (j != 0) {
                return nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, j);
            }
        }
        return false;
    }

    @Override // tb.vw6
    public boolean isSupported(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211c2fa", new Object[]{this, buiVar})).booleanValue();
        }
        if (!c || !sl1.AVIF.g(buiVar)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AvifDecoder@" + Integer.toHexString(hashCode());
    }

    public AvifDecoder() {
        String libraryName = getLibraryName();
        try {
            loadRemoteSo(libraryName);
        } catch (Throwable th) {
            c = false;
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", libraryName, th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11454a;

        public a(String str) {
            this.f11454a = str;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            AvifDecoder.access$002(l6hVar != null && l6hVar.i());
            xv8.c(p0m.TAG, "load remote lib%s.so status=%b index=%d", this.f11454a, Boolean.valueOf(AvifDecoder.access$000()), Integer.valueOf(AvifDecoder.access$100()));
            if (AvifDecoder.b() != null) {
                AvifDecoder.c(false);
                AvifDecoder.b().a(AvifDecoder.access$000(), AvifDecoder.access$100());
            } else {
                AvifDecoder.c(true);
            }
            czn.a().c(AvifDecoder.access$000());
            if (!AvifDecoder.access$000() && AvifDecoder.access$100() < 2) {
                AvifDecoder.a();
                AvifDecoder.d(this.f11454a);
            }
        }
    }

    @Override // tb.vw6
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (!c) {
            String libraryName = getLibraryName();
            this.f11453a.prepare(context);
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", libraryName, Boolean.valueOf(c));
        }
    }
}
