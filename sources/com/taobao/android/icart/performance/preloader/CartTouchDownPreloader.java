package com.taobao.android.icart.performance.preloader;

import android.app.Activity;
import android.content.Context;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.android.icart.weex.prefetch.ColdStartPrefetch;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.c9x;
import tb.hav;
import tb.ic3;
import tb.l9v;
import tb.t2o;
import tb.ub3;
import tb.uc3;
import tb.vav;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/icart/performance/preloader/CartTouchDownPreloader;", "", "<init>", "()V", "", "hitTouchDown", "()Z", "Landroid/content/Context;", "context", "", "", "params", "Ltb/xhv;", "onTouchDown", "(Landroid/content/Context;Ljava/util/Map;)V", "onTouchCancel", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasProcessedTouchDown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sCodeHitTouchDown", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartTouchDownPreloader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final CartTouchDownPreloader INSTANCE = new CartTouchDownPreloader();
    private static final String TAG = "CartTouchDownPreloader";
    private static final AtomicBoolean hasProcessedTouchDown = new AtomicBoolean();
    private static final String sCodeHitTouchDown = "HitTouchDown";

    static {
        t2o.a(478150833);
    }

    private CartTouchDownPreloader() {
    }

    @JvmStatic
    public static final boolean hitTouchDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89565fb9", new Object[0])).booleanValue();
        }
        return hasProcessedTouchDown.get();
    }

    @JvmStatic
    public static final void onTouchCancel(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e18e07e", new Object[]{context, map});
            return;
        }
        ub3.e(ub3.a.a(sCodeHitTouchDown).branch(1).message("误触").sampling(0.05f));
        hav.d(TAG, "TouchDown误触");
    }

    @JvmStatic
    public static final void onTouchDown(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671e6aa6", new Object[]{context, map});
        } else if (!l9v.a("disableCartPreloader")) {
            ub3.e(ub3.a.a(sCodeHitTouchDown).branchEntry(true).sampling(0.05f));
            if (vav.a(c9x.CART_BIZ_NAME, "enableTouchDownPerf", true)) {
                if (OrangeUtil.isWeexCart()) {
                    ColdStartPrefetch.INSTANCE.m(ColdStartPrefetch.StartType.TOUCH_DOWN);
                } else if (!ic3.c() || CartVEngineFactory.isPrefetchSuccess()) {
                    hav.d(TAG, "非冷启或者闲时预加载已成功");
                } else if (hasProcessedTouchDown.getAndSet(true)) {
                    hav.d(TAG, "已经处理过了");
                } else {
                    ub3.n("TouchDownPerf", "提前时间", null);
                    hav.d(TAG, "开始TouchDown预加载");
                    uc3.e(context);
                    if (context instanceof Activity) {
                        CartVEngineFactory.doPreRequest((Activity) context, true, TBBuyPreloadScene.TOUCH_DOWN);
                    }
                }
            }
        }
    }
}
