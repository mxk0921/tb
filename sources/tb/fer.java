package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.hudong.ZCacheMatchType;
import com.taobao.tao.log.TLog;
import com.taobao.zcache.Error;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class fer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fer INSTANCE = new fer();

    static {
        t2o.a(1031798799);
    }

    public final void b(String str, int i, String str2) {
        final y8o y8oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccd76d8", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        ckf.g(str, "resUrl");
        ZCacheMatchType zCacheMatchType = (ZCacheMatchType) ic1.L(ZCacheMatchType.values(), i);
        if (zCacheMatchType == null) {
            TLog.loge("TBHDZCache", "getResource(" + str + ") type=" + i + " is invalid");
            return;
        }
        if (zCacheMatchType != ZCacheMatchType.REFERER || str2 == null || str2.length() == 0) {
            y8oVar = new y8o(str);
        } else {
            y8oVar = new y8o(str, str2);
        }
        yox.i(y8oVar, new ResourceResponseCallback() { // from class: tb.eer
            @Override // com.taobao.zcache.ResourceResponseCallback
            public final void finish(ResourceResponse resourceResponse) {
                fer.c(y8o.this, resourceResponse);
            }
        });
    }

    public static final void c(y8o y8oVar, ResourceResponse resourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8536af", new Object[]{y8oVar, resourceResponse});
            return;
        }
        ckf.g(y8oVar, "$request");
        StringBuilder sb = new StringBuilder("ZCache getResource(");
        sb.append((Object) y8oVar.e());
        sb.append(") response=");
        Error error = resourceResponse.getError();
        sb.append((Object) (error == null ? null : error.getMessage()));
        TLog.loge("TBHDZCache", sb.toString());
        if (resourceResponse.getError() == null) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TBHD_Prefetch", 19999, "touchResource", "", null, a.j(jpu.a("resourceUrl", y8oVar.e()), jpu.a("response", "error==null"))).build());
            return;
        }
        Pair a2 = jpu.a("resourceUrl", y8oVar.e());
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_TBHD_Prefetch", 19999, "touchResource", "", null, a.j(a2, jpu.a("response", "errCode=" + resourceResponse.getError().getCode() + ", errMsg=" + ((Object) resourceResponse.getError().getMessage())))).build());
    }
}
