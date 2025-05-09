package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fke extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RectF d;

    static {
        t2o.a(481297351);
    }

    public fke(RectF rectF) {
        this.d = rectF;
    }

    public static /* synthetic */ Object ipc$super(fke fkeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageCropNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageCrop";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        String rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        Bitmap h = w7mVar.h();
        if (h == null) {
            m(-8, "需要处理的图片资源不存在");
            return yy1.e(this, -8, "需要处理的图片资源不存在", false, 4, null);
        }
        RectF rectF2 = this.d;
        String str = "null";
        if (!(rectF2 == null || (rectF = rectF2.toString()) == null)) {
            str = rectF;
        }
        a("cropRectF", str);
        RectF rectF3 = this.d;
        Bitmap d = rectF3 == null ? h : gd2.d(h, rectF3);
        if (d == null) {
            a("crop", "Crop Failure");
        } else {
            a("crop", "Crop Success");
            h = d;
        }
        w7mVar.I(h);
        n();
        pmf.k0(Long.valueOf(SystemClock.elapsedRealtime() - h()));
        return f(h);
    }
}
