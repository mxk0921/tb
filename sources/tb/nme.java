package tb;

import android.text.TextUtils;
import android.util.Size;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nme extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean d;

    static {
        t2o.a(481297362);
    }

    public nme(String str, String str2, String str3, boolean z) {
        this.d = z;
    }

    public static /* synthetic */ Object ipc$super(nme nmeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageMockSearchNode");
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageMockSearch";
    }

    @Override // tb.yy1
    public x7m k(w7m w7mVar) {
        Size f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7m) ipChange.ipc$dispatch("826f33b6", new Object[]{this, w7mVar});
        }
        ckf.g(w7mVar, "pipLineDS");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (w7mVar.l() != null) {
            Map<String, String> l = w7mVar.l();
            ckf.d(l);
            if (!l.isEmpty()) {
                Map<String, String> c = u7j.c(w7mVar.k(), w7mVar.l());
                ckf.f(c, "preHandleRequestExtraPar…neDS.pageParams\n        )");
                linkedHashMap.putAll(c);
            }
        }
        if (this.d && !w7mVar.x()) {
            linkedHashMap.putAll(w7mVar.b());
            String str = w7mVar.e().get();
            if (str != null) {
                linkedHashMap.put("universalCardFeature", str);
            }
            linkedHashMap.put(ImageSearchMtopUtil.KEY_IMG, w7mVar.n());
            String str2 = "";
            if (w7mVar.f() != null) {
                String str3 = "0," + f.getWidth() + ",0," + f.getHeight();
                if (str3 != null) {
                    str2 = str3;
                }
            }
            linkedHashMap.put("full_region_size", str2);
        }
        if (!TextUtils.isEmpty(w7mVar.r())) {
            linkedHashMap.put("region", w7mVar.r());
        }
        ImageSearchMtopUtil.h(linkedHashMap);
        ImageSearchMtopUtil.g(linkedHashMap);
        b(linkedHashMap);
        n();
        return f(linkedHashMap);
    }
}
