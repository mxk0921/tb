package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class snj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262818);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c9bbb238", new Object[]{uri});
        }
        if (!nj7.h()) {
            return uri;
        }
        if ("fullscreen".equalsIgnoreCase(uri.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY))) {
            return uri;
        }
        return uri.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
    }

    public static boolean b(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef8af08", new Object[]{intent})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("detailRequestId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = String.valueOf(UUID.randomUUID().hashCode());
        }
        Uri c = jov.c(data);
        if ("true".equalsIgnoreCase(c.getQueryParameter("hybrid"))) {
            return false;
        }
        JSONObject M0 = vbl.M0();
        if (vbl.U0(M0) || !vbl.i1(null, M0)) {
            return false;
        }
        if (jov.h(intent)) {
            return true;
        }
        Uri a2 = ybf.a(a(c));
        PerformanceUtils.e(stringExtra);
        PreRenderManager.b(stringExtra);
        cg2.o(stringExtra);
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        if (longExtra >= 0) {
            PerformanceUtils.p(stringExtra, "userClick", longExtra);
        }
        PerformanceUtils.p(stringExtra, TBBuyPreloadScene.NAV, currentTimeMillis);
        intent.putExtra("originalHost", a2.getAuthority());
        intent.setData(a2);
        intent.putExtra("detailRequestId", stringExtra);
        tgh.b("NavOnClickUtils", "nav token=" + stringExtra);
        if (Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sDisableStreamingNetwork))) {
            a4o.d(stringExtra);
            if (vbl.X() && (!b5m.H().isI18nEdition() || vbl.M())) {
                u4o.j(intent);
            }
            u4o.i(intent);
        }
        PreRenderManager.h(stringExtra).a(null);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "onNavClicked2TTDetail(): " + (currentTimeMillis2 - currentTimeMillis));
        return true;
    }
}
