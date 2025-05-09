package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m2s implements obe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/TKWatermarkDetector$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                i0u.f(caa.c(), "检测到水印", 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/TKWatermarkDetector$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                i0u.f(caa.c(), "检测到视频水印", 1);
            }
        }
    }

    static {
        t2o.a(730857489);
        t2o.a(481296424);
    }

    public final Bitmap a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a150972b", new Object[]{this, bitmap});
        }
        if (!lg4.Z3()) {
            return bitmap;
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config2);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public String b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("641182a5", new Object[]{this, bitmap});
        }
        int hashCode = bitmap.hashCode();
        try {
            Bitmap a2 = a(bitmap);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a2.getByteCount());
            a2.copyPixelsToBuffer(allocateDirect);
            agh.r("AutoDetect", "TKWatermarkDetector", "before detectVideoWaterMark " + hashCode);
            String c = PailitaoCUtil.c(allocateDirect.array(), a2.getWidth(), a2.getHeight());
            agh.r("AutoDetect", "TKWatermarkDetector", "after detectVideoWaterMark result " + c + ", " + hashCode);
            if (!TextUtils.isEmpty(c) && caa.q()) {
                vpt.g("videoWaterMark", new b());
            }
            return c;
        } catch (Exception e) {
            agh.r("AutoDetect", "TKWatermarkDetector", "detectVideoWatermark exception: " + e.getMessage());
            return null;
        }
    }

    public boolean c(Bitmap bitmap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61800e2a", new Object[]{this, bitmap})).booleanValue();
        }
        try {
            PailitaoCUtil.e();
            Bitmap a2 = a(bitmap);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a2.getByteCount());
            a2.copyPixelsToBuffer(allocateDirect);
            if (PailitaoCUtil.d(allocateDirect.array(), a2.getWidth(), a2.getHeight()) != 0) {
                z = false;
            }
            if (z && caa.q()) {
                vpt.g("imageWaterMark", new a());
            }
            PailitaoCUtil.b();
            return z;
        } catch (Exception e) {
            agh.r("AutoDetect", "TKWatermarkDetector", "detectWatermark exception: " + e.getMessage());
            return false;
        }
    }
}
