package tb;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.decoder.GifFrame;
import com.taobao.pexode.decoder.GifImage;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g8a implements yw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19784a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7797849", new Object[0]);
        }
        return "pexgif";
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
        GifImage gifImage;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0m) ipChange.ipc$dispatch("4b1c051d", new Object[]{this, rewindableStream, pexodeOptions, t97Var});
        }
        Bitmap bitmap = null;
        if (pexodeOptions.justDecodeBounds) {
            pexodeOptions.outHeight = 1;
            pexodeOptions.outWidth = 1;
            return null;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            gifImage = GifImage.create(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength());
        } else if (inputType == 2) {
            gifImage = GifImage.create(rewindableStream.getFD());
        } else {
            throw new NotSupportedException("Not support input type(" + rewindableStream.getInputType() + ") when GifImage creating!");
        }
        if (!pexodeOptions.forceStaticIfAnimation || gifImage == null) {
            return q0m.b(gifImage);
        }
        GifFrame frame = gifImage.getFrame(0);
        if (frame == null) {
            gifImage.dispose();
            return null;
        }
        int width = frame.getWidth();
        int height = frame.getHeight();
        if (!pexodeOptions.enableAshmem || ow6.f().b) {
            z = false;
        }
        if (z) {
            bitmap = qc1.a().c(width, height, Bitmap.Config.ARGB_8888);
        }
        if (!z || (bitmap == null && pexodeOptions.allowDegrade2NoAshmem)) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        if (bitmap != null) {
            frame.renderFrame(width, height, bitmap);
        }
        frame.dispose();
        gifImage.dispose();
        return q0m.a(bitmap);
    }

    @Override // tb.vw6
    public bui detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("51225bd0", new Object[]{this, bArr});
        }
        if (!f19784a) {
            return null;
        }
        bui buiVar = z37.GIF;
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
        if (!f19784a || buiVar == null || !buiVar.g(z37.GIF)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GifDecoder@" + Integer.toHexString(hashCode());
    }

    static {
        t2o.a(618659866);
        t2o.a(618659841);
        String a2 = a();
        try {
            System.loadLibrary(a2);
            boolean z = GifImage.nativeLoadedVersionTest() == 2;
            f19784a = z;
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
        } else if (!f19784a) {
            String a2 = a();
            boolean z = f8q.b(a2, 2) && GifImage.nativeLoadedVersionTest() == 2;
            f19784a = z;
            xv8.f(p0m.TAG, "retry load lib%s.so result=%b", a2, Boolean.valueOf(z));
        }
    }
}
