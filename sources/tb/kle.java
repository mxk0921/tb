package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kle extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer d;
    public final Map<String, String> e;

    static {
        t2o.a(481297359);
    }

    public /* synthetic */ kle(Integer num, Map map, int i, a07 a07Var) {
        this(num, (i & 2) != 0 ? null : map);
    }

    public static /* synthetic */ Object ipc$super(kle kleVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageFeatureExtractNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageFeatureExtract";
    }

    public kle(Integer num, Map<String, String> map) {
        this.d = num;
        this.e = map;
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        Map<String, String> map = this.e;
        if (map != null) {
            w7mVar.C(map);
            a("pageRebuild", "true");
            n();
            return f(this.e);
        }
        Bitmap h = w7mVar.h();
        if (h == null) {
            m(-8, "需要处理的图片资源不存在");
            return yy1.e(this, -8, "需要处理的图片资源不存在", false, 4, null);
        }
        Integer num = this.d;
        hre hreVar = hre.INSTANCE;
        z39 h2 = hreVar.h(num);
        if (h2 == null || h2.c() == -5) {
            if (num == null) {
                Bitmap copy = h.copy(h.getConfig(), true);
                ckf.f(copy, "originalBitmap.copy(originalBitmap.config, true)");
                y39 y39Var = new y39(copy, null, 2, null);
                hreVar.f(y39Var);
                num = Integer.valueOf(y39Var.b());
            }
            return f(num);
        }
        if (h2.g()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("imgExtractInfo", h2.e());
            linkedHashMap.put("imgRongzaiExtraInfo", h2.d());
            w7mVar.C(linkedHashMap);
        }
        pmf.m0(h2.a());
        a("imgFeatureExtractResult", h2.toString());
        a("imgFeatureExtractTime", String.valueOf(h2.b()));
        a("imgFeatureExtractTime", String.valueOf(h2.a()));
        return f(w7mVar.g());
    }
}
