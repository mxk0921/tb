package tb;

import android.util.LruCache;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ief {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, f59> f21275a;

    static {
        t2o.a(468713519);
    }

    public static int[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f0a282fb", new Object[0]);
        }
        int[] iArr = {0, 300};
        VariationSet activate = UTABTest.activate("AB_fullscreenpage_sensor", "sensor_collection");
        if (activate == null) {
            return iArr;
        }
        Variation variation = activate.getVariation("enableGesture");
        Variation variation2 = activate.getVariation("maxMoveCount");
        if (variation != null) {
            iArr[0] = variation.getValueAsBoolean(false) ? 1 : 0;
        }
        if (variation2 != null) {
            iArr[1] = variation2.getValueAsInt(300);
        }
        return iArr;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3a111ed", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableGGVideoBxFeatures", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("187f3513", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableReceiveAINotification", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349b1b57", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("isEnablePredictTracker", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("197b4a8c", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoBxFeatures", true);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7456ff31", new Object[0])).intValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("maxModelTriggerTime", 1000);
    }

    public LruCache<String, f59> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("cdfb727", new Object[]{this});
        }
        return this.f21275a;
    }

    public void h(LruCache<String, f59> lruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802cbfbf", new Object[]{this, lruCache});
        } else {
            this.f21275a = lruCache;
        }
    }
}
