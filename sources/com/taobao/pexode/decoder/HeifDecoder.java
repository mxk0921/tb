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
import tb.f8q;
import tb.iva;
import tb.ow6;
import tb.p0m;
import tb.q0m;
import tb.rh9;
import tb.t97;
import tb.xv8;
import tb.y2r;
import tb.z37;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HeifDecoder extends rh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b;
    public static boolean c;

    /* renamed from: a  reason: collision with root package name */
    public final y2r f11455a = new y2r();

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1caa7e", new Object[]{new Boolean(z)});
        } else if (b) {
            nativeFixAlpha(z);
        }
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d604123", new Object[]{new Boolean(z)});
        } else if (b) {
            nativeFixMemoryOutOfBounds(z);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594137a3", new Object[0])).booleanValue();
        }
        return c;
    }

    public static void e(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d660166", new Object[]{new Boolean(z), new Integer(i)});
        } else if (b) {
            nativeOptMultiThread(z, i);
        }
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c143b954", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5517debd", new Object[]{new Boolean(z)});
        } else if (b) {
            nativeIccSupportEnable(z);
        }
    }

    public static String getLibraryName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7797849", new Object[0]);
        }
        return "pexheif";
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b4e70b", new Object[]{new Boolean(z)});
        } else if (b) {
            nativeUseBugFix(z);
        }
    }

    public static /* synthetic */ Object ipc$super(HeifDecoder heifDecoder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/decoder/HeifDecoder");
    }

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

    public static native void nativeFixAlpha(boolean z);

    public static native void nativeFixMemoryOutOfBounds(boolean z);

    public static native void nativeIccSupportEnable(boolean z);

    private static native int nativeLoadedVersionTest();

    public static native void nativeOptMultiThread(boolean z, int i);

    public static native void nativeUseBugFix(boolean z);

    public final boolean a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23636d51", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).booleanValue();
        }
        if (rh9.invalidBitmap(bitmap, pexodeOptions, "HeifDecoder decodeIntoBitmap")) {
            return false;
        }
        byte[] bArr = null;
        if (z) {
            j = rh9.getPixelAddressFromBitmap(bitmap);
        } else if (Build.VERSION.SDK_INT >= 26) {
            j = rh9.getPixelAddressFromBitmap(bitmap);
        } else {
            bArr = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType != 1) {
            if (inputType == 2) {
                if (bArr != null) {
                    return nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, bArr);
                }
                if (j != 0) {
                    return nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, j);
                }
            }
        } else if (bArr != null) {
            return nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, bArr);
        } else {
            if (j != 0) {
                boolean nativeDecodeBytesWithOutAddress = nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j);
                if (!z) {
                    NdkCore.nativeUnpinBitmap(bitmap);
                }
                return nativeDecodeBytesWithOutAddress;
            }
        }
        return false;
    }

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
        if (c && pexodeOptions.fromLocal && (y2rVar = this.f11455a) != null) {
            return y2rVar.decode(rewindableStream, pexodeOptions, t97Var);
        }
        if (!pexodeOptions.isSizeAvailable()) {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, null);
            } else if (inputType == 2) {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            } else if (inputType == 3) {
                throw new NotSupportedException("Not support stream type when HeifImage decoding!");
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
            xv8.c(p0m.TAG, "HeifDecoder size unavailable before bitmap decoding", new Object[0]);
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
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ca66bf0e", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        Bitmap newBitmap = rh9.newBitmap(pexodeOptions, true);
        if (a(rewindableStream, pexodeOptions, newBitmap, true)) {
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
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("26e3d7d9", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        if (a(rewindableStream, pexodeOptions, pexodeOptions.inBitmap, false)) {
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
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a8d841ea", new Object[]{this, rewindableStream, pexodeOptions});
        }
        Bitmap newBitmap = rh9.newBitmap(pexodeOptions, false);
        if (a(rewindableStream, pexodeOptions, newBitmap, false)) {
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
        if (!b) {
            return null;
        }
        bui buiVar = iva.HEIF;
        if (buiVar.f(bArr)) {
            return buiVar;
        }
        return null;
    }

    @Override // tb.vw6
    public boolean isSupported(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211c2fa", new Object[]{this, buiVar})).booleanValue();
        }
        if (!b || !iva.HEIF.g(buiVar)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HeifDecoder@" + Integer.toHexString(hashCode());
    }

    static {
        z37.ALL_EXTENSION_TYPES.add(iva.HEIF);
        String libraryName = getLibraryName();
        try {
            System.loadLibrary(libraryName);
            boolean z = nativeLoadedVersionTest() == 2;
            b = z;
            xv8.f(p0m.TAG, "system load lib%s.so result=%b", libraryName, Boolean.valueOf(z));
        } catch (UnsatisfiedLinkError e) {
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", libraryName, e);
        }
    }

    @Override // tb.vw6
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (!b) {
            String libraryName = getLibraryName();
            b = f8q.b(libraryName, 2) && GifImage.nativeLoadedVersionTest() == 2;
            this.f11455a.prepare(context);
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", libraryName, Boolean.valueOf(b));
        }
    }
}
