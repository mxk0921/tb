package tb;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bpp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509182);
    }

    public static final void a(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b83ed0", new Object[]{shopWrapWebView});
            return;
        }
        ckf.g(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.containerAppear", "");
    }

    public static final void b(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8477d49a", new Object[]{shopWrapWebView});
            return;
        }
        ckf.g(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.containerDisappear", "");
    }

    public static final void c(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952935ea", new Object[]{shopWrapWebView});
            return;
        }
        ckf.g(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoLongTap", "");
    }

    public static final void d(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594c5579", new Object[]{shopWrapWebView});
            return;
        }
        ckf.g(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoPause", "");
    }

    public static final void e(ShopWrapWebView shopWrapWebView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64658403", new Object[]{shopWrapWebView, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoPlay", brf.a(jpu.a(iiz.PERF_STAG_TOTAL, Integer.valueOf(i)), jpu.a("current", Integer.valueOf(i2))).toString());
    }
}
