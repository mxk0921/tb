package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.decoder.APngImage;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wc implements yw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30600a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7797849", new Object[0]);
        }
        return "pexapng";
    }

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
        return false;
    }

    @Override // tb.vw6
    public q0m decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException {
        vw6 vw6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("4b1c051d", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        if (pexodeOptions.justDecodeBounds) {
            pexodeOptions.outHeight = 1;
            pexodeOptions.outWidth = 1;
            return null;
        } else if (pexodeOptions.forceStaticIfAnimation) {
            List<vw6> i = p0m.i(z37.PNG);
            if (i == null || i.size() <= 0 || (vw6Var = i.get(0)) == null) {
                return null;
            }
            return vw6Var.decode(rewindableStream, pexodeOptions, t97Var);
        } else {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                return q0m.b(APngImage.nativeCreateFromBytes(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength()));
            }
            if (inputType == 2) {
                return q0m.b(APngImage.nativeCreateFromFd(rewindableStream.getFD()));
            }
            byte[] g = ow6.f().g(2048);
            q0m b = q0m.b(APngImage.nativeCreateFromRewindableStream(rewindableStream, g));
            ow6.f().k(g);
            return b;
        }
    }

    @Override // tb.vw6
    public bui detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("51225bd0", new Object[]{this, bArr});
        }
        if (!f30600a) {
            return null;
        }
        bui buiVar = xc.APNG;
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
        if (!f30600a || !xc.APNG.g(buiVar)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "APngDecoder@" + Integer.toHexString(hashCode());
    }

    static {
        z37.ALL_EXTENSION_TYPES.add(xc.APNG);
        String a2 = a();
        try {
            System.loadLibrary(a2);
            boolean z = APngImage.nativeLoadedVersionTest() == 1;
            f30600a = z;
            xv8.f(p0m.TAG, "system load lib%s.so result=%b", a2, Boolean.valueOf(z));
        } catch (UnsatisfiedLinkError e) {
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", a2, e);
        }
    }

    @Override // tb.vw6
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (!f30600a) {
            String a2 = a();
            boolean z = f8q.b(a2, 1) && APngImage.nativeLoadedVersionTest() == 1;
            f30600a = z;
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", a2, Boolean.valueOf(z));
        }
    }
}
