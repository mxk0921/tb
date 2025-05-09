package tb;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y2r implements vw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean b = true;
    public static final boolean c = true;
    public static final boolean d;
    public static final boolean e;

    /* renamed from: a  reason: collision with root package name */
    public Context f31814a;

    static {
        boolean z;
        t2o.a(618659869);
        t2o.a(618659864);
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i == 28) {
            z = true;
        } else {
            z = false;
        }
        d = z;
        if (i < 31) {
            z2 = false;
        }
        e = z2;
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e176e26e", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(52)));
        }
        return sb.toString();
    }

    public static BitmapFactory.Options c(PexodeOptions pexodeOptions) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapFactory.Options) ipChange.ipc$dispatch("74bf8a2b", new Object[]{pexodeOptions});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = pexodeOptions.justDecodeBounds;
        if (!ow6.f().f25706a) {
            options.inBitmap = pexodeOptions.inBitmap;
        }
        if (pexodeOptions.isSizeAvailable()) {
            options.outWidth = pexodeOptions.outWidth;
            options.outHeight = pexodeOptions.outHeight;
        }
        bui buiVar = pexodeOptions.outMimeType;
        if (buiVar != null) {
            options.outMimeType = buiVar.toString();
        }
        options.inSampleSize = pexodeOptions.sampleSize;
        options.inDither = true;
        options.inPreferredConfig = PexodeOptions.CONFIG;
        if (!ow6.f().b && pexodeOptions.enableAshmem) {
            z = true;
        }
        d(options, z);
        ow6.q(pexodeOptions, options);
        return options;
    }

    public static void d(BitmapFactory.Options options, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc3f34d", new Object[]{options, new Boolean(z)});
            return;
        }
        options.inMutable = true;
        if (!options.inJustDecodeBounds) {
            options.inPurgeable = z;
            options.inInputShareable = z;
        }
    }

    public static void e(PexodeOptions pexodeOptions, BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8a5552", new Object[]{pexodeOptions, options});
            return;
        }
        pexodeOptions.outWidth = options.outWidth;
        pexodeOptions.outHeight = options.outHeight;
        ow6.q(pexodeOptions, null);
    }

    @Override // tb.vw6
    public boolean acceptInputType(int i, bui buiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15171897", new Object[]{this, new Integer(i), buiVar, new Boolean(z)})).booleanValue();
        }
        if (!p0m.h || Build.VERSION.SDK_INT != 28 || (!z37.WEBP_A.g(buiVar) && !z37.WEBP.g(buiVar))) {
            if (i != 3) {
                return true;
            }
            if (z || (z37.WEBP.g(buiVar) && !c)) {
                return false;
            }
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
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
    public bui detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bui) ipChange.ipc$dispatch("51225bd0", new Object[]{this, bArr});
        }
        if (b) {
            bui buiVar = z37.WEBP;
            if (buiVar.f(bArr)) {
                return buiVar;
            }
        }
        bui buiVar2 = z37.JPEG;
        if (buiVar2.f(bArr)) {
            return buiVar2;
        }
        bui buiVar3 = z37.PNG;
        if (buiVar3.f(bArr)) {
            return buiVar3;
        }
        bui buiVar4 = z37.PNG_A;
        if (buiVar4.f(bArr)) {
            return buiVar4;
        }
        if (c) {
            bui buiVar5 = z37.WEBP_A;
            if (buiVar5.f(bArr)) {
                return buiVar5;
            }
        }
        bui buiVar6 = z37.BMP;
        if (buiVar6.f(bArr)) {
            return buiVar6;
        }
        if (p0m.f && d) {
            bui buiVar7 = z37.HEIF;
            if (buiVar7.f(bArr)) {
                return buiVar7;
            }
        }
        if (!p0m.g || !e) {
            return null;
        }
        bui buiVar8 = z37.AVIF;
        if (buiVar8.f(bArr)) {
            return buiVar8;
        }
        return null;
    }

    @Override // tb.vw6
    public boolean isSupported(bui buiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("211c2fa", new Object[]{this, buiVar})).booleanValue();
        }
        if (buiVar != null) {
            if ((b && buiVar.g(z37.WEBP)) || buiVar.g(z37.JPEG) || buiVar.g(z37.PNG) || buiVar.g(z37.PNG_A)) {
                return true;
            }
            if ((c && buiVar.g(z37.WEBP_A)) || buiVar.g(z37.BMP)) {
                return true;
            }
            if (p0m.f && d && buiVar.g(z37.HEIF)) {
                return true;
            }
            if (p0m.g && e && buiVar.g(z37.AVIF)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.vw6
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else {
            this.f31814a = context;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SystemDecoder@" + Integer.toHexString(hashCode());
    }

    public static void a(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c4e1ab", new Object[]{rewindableStream, pexodeOptions});
            return;
        }
        rewindableStream.getInputType();
        if (rewindableStream.getInputType() == 3) {
            if (pexodeOptions.enableAshmem) {
                xv8.k(p0m.TAG, "cannot use ashmem when system decoding with input stream(justBounds=%b), disabled already!", Boolean.valueOf(pexodeOptions.justDecodeBounds));
                pexodeOptions.enableAshmem = false;
            }
            if (z37.WEBP.g(pexodeOptions.outMimeType) && !c) {
                xv8.c(p0m.TAG, "maybe error black image when system decoding webp with input stream(justBounds=%b)!", Boolean.valueOf(pexodeOptions.justDecodeBounds));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(1:11)(1:10)|12|(1:14)(1:15)|16|(2:104|17)|(2:19|(4:21|(2:23|(1:25))|27|(17:31|101|32|(1:34)(1:37)|(3:39|(1:41)(1:42)|(11:44|102|45|(1:47)|48|50|(5:99|60|(1:(2:63|(3:65|(1:67)(1:70)|71)(1:73))(1:74))(1:75)|72|76)|(2:106|80)|83|(1:(1:(2:94|(1:96)))(2:88|(1:90)))|97)(1:49))(1:51)|52|50|(1:58)|99|60|(0)(0)|72|76|(2:106|80)|83|(0)|97)))|53|55|(0)|99|60|(0)(0)|72|76|(0)|83|(0)|97) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
        tb.xv8.c(tb.p0m.TAG, "SystemDecoder type=%d, error=%s", java.lang.Integer.valueOf(r13.getInputType()), r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a A[Catch: Exception -> 0x012b, TryCatch #0 {Exception -> 0x012b, blocks: (B:60:0x0116, B:63:0x011e, B:65:0x0122, B:67:0x0126, B:71:0x012e, B:73:0x0138, B:74:0x013f, B:75:0x014a, B:76:0x015b), top: B:99:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    @Override // tb.vw6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.q0m decode(com.taobao.pexode.entity.RewindableStream r13, com.taobao.pexode.PexodeOptions r14, tb.t97 r15) throws com.taobao.pexode.exception.PexodeException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.y2r.decode(com.taobao.pexode.entity.RewindableStream, com.taobao.pexode.PexodeOptions, tb.t97):tb.q0m");
    }
}
