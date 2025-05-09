package tb;

import android.graphics.Bitmap;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.hx8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ile extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer d;
    public volatile ix8 e;

    static {
        t2o.a(481297356);
    }

    public ile(Integer num) {
        this.d = num;
    }

    public static /* synthetic */ Object ipc$super(ile ileVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageFaceDetectNode");
    }

    public static final /* synthetic */ void o(ile ileVar, ix8 ix8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ec2112", new Object[]{ileVar, ix8Var});
        } else {
            ileVar.e = ix8Var;
        }
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageFaceDetect";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        Bitmap h = w7mVar.h();
        if (h == null) {
            m(-8, "需要处理的图片资源不存在");
            return yy1.e(this, -8, "需要处理的图片资源不存在", false, 4, null);
        } else if (lg4.g()) {
            return f(null);
        } else {
            Integer num = this.d;
            if (num == null) {
                return r(w7mVar, h);
            }
            return q(w7mVar, num.intValue());
        }
    }

    public final x7m p(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("799dd9e1", new Object[]{this, w7mVar});
        }
        ix8 ix8Var = this.e;
        if (ix8Var == null) {
            if (caa.q()) {
                i0u.b().e(caa.c(), "人脸检测超时", 0);
            }
            m(-3, "人脸检测超时");
            return yy1.e(this, -3, "人脸检测超时", false, 4, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ProductDataHelper.VAL_PRODUCT_FACE, String.valueOf(ix8Var.a()));
        linkedHashMap.put("faceCount", String.valueOf(ix8Var.a()));
        w7mVar.A(linkedHashMap);
        if (caa.q()) {
            i0u.b().e(caa.c(), ckf.p("人脸检测结果:", Integer.valueOf(ix8Var.a())), 0);
        }
        n();
        return f(null);
    }

    public final x7m r(w7m w7mVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("a1b72397", new Object[]{this, w7mVar, bitmap});
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long b2 = lg4.b2();
        hx8 a2 = hx8.Companion.a();
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        ckf.f(copy, "originalBitmap.copy(originalBitmap.config, true)");
        a2.f(copy, new hle(this, countDownLatch));
        try {
            countDownLatch.await(b2, TimeUnit.MILLISECONDS);
            return p(w7mVar);
        } catch (InterruptedException unused) {
            m(-3, "人脸检测失败");
            return yy1.e(this, -3, "人脸检测失败", false, 4, null);
        }
    }

    public final x7m q(w7m w7mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("4a6c4777", new Object[]{this, w7mVar, new Integer(i)});
        }
        hx8.a aVar = hx8.Companion;
        ix8 l = aVar.a().l(i);
        if (l != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ProductDataHelper.VAL_PRODUCT_FACE, String.valueOf(l.a()));
            linkedHashMap.put("faceCount", String.valueOf(l.a()));
            w7mVar.A(linkedHashMap);
            if (caa.q()) {
                i0u.b().e(caa.c(), ckf.p("人脸检测结果:", Integer.valueOf(l.a())), 0);
            }
            n();
            return f(null);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long b2 = lg4.b2();
        aVar.a().m(i, new gle(this, countDownLatch));
        try {
            countDownLatch.await(b2, TimeUnit.MILLISECONDS);
            return p(w7mVar);
        } catch (InterruptedException unused) {
            m(-3, "人脸检测失败");
            return yy1.e(this, -3, "人脸检测失败", false, 4, null);
        }
    }
}
