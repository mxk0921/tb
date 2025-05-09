package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.util.Arrays;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MockUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262815);
    }

    public static MtopInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("2578965e", new Object[]{context});
        }
        try {
            byte[] d = IOUtils.d(AssetsDelegate.proxy_open(context.getAssets(), "tbLive_video_tinyShop.json"));
            if (d == null || d.length <= 0) {
                return null;
            }
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.d(Arrays.asList(d));
            mtopInfo.f(2);
            mtopInfo.e(new MtopResponse(d) { // from class: com.taobao.android.detail.ttdetail.utils.MockUtils.1
                final /* synthetic */ byte[] val$tinyShopDetailBytes;

                {
                    this.val$tinyShopDetailBytes = d;
                    setBytedata(d);
                }
            });
            return mtopInfo;
        } catch (Throwable th) {
            tgh.c("MockUtils", "mockTBLiveTinyShopDetail error", th);
            return null;
        }
    }
}
