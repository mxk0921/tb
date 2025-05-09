package com.taobao.trade.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.hv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY_ABOVE_NORMAL = 750;
    public static final int PRIORITY_BELOW_NORMAL = 250;
    public static final int PRIORITY_HIGHEST = 1000;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 500;
    private static final HashMap<String, a> featureMap;
    private static FeatureFactory mSelf = new FeatureFactory();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13842a;
        public final int b;

        static {
            t2o.a(724566084);
        }

        public a(int i, int i2) {
            this.f13842a = i;
            this.b = i2;
        }
    }

    static {
        t2o.a(724566083);
        HashMap<String, a> hashMap = new HashMap<>();
        featureMap = hashMap;
        hashMap.put("ClickDrawableMaskFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_clickDrawableMaskFeature, 750));
        hashMap.put("RatioFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_ratioFeature, 500));
        hashMap.put("RoundRectFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_roundRectFeature, 500));
        hashMap.put("RoundFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_roundFeature, 500));
        hashMap.put("ClickViewMaskFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_clickViewMaskFeature, 250));
        hashMap.put("BinaryPageFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_binaryPageFeature, 500));
        hashMap.put("PinnedHeaderFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pinnedHeaderFeature, 500));
        hashMap.put("PullToRefreshFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pullToRefreshFeature, 500));
        hashMap.put("StickyScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_stickyScrollFeature, 500));
        hashMap.put("ParallaxScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_parallaxScrollFeature, 500));
        hashMap.put("BounceScrollFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_bounceScrollFeature, 500));
        hashMap.put("PencilShapeFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_pencilShapeFeature, 500));
        hashMap.put("AutoScaleFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_autoScaleFeature, 500));
        hashMap.put("RotateFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_rotateFeature, 500));
        hashMap.put("ImageSaveFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_imagesavefeature, 500));
        hashMap.put("CellAnimatorFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_cellAnimatorFeature, 500));
        hashMap.put("RecyclerCellAnimatorFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_recyclerCellAnimatorFeature, 500));
        hashMap.put("DragToRefreshFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_dragToRefreshFeature, 500));
        hashMap.put("ImageShapeFeature", new a(R.styleable.TradeFeatureNameSpace_trade_uik_imageShapeFeature, 500));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<hv<? super T>> creator(Context context, TypedArray typedArray) {
        ArrayList<hv<? super T>> arrayList = (ArrayList<hv<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : featureMap.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f13842a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(mSelf.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static int getFeaturePriority(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23271408", new Object[]{str})).intValue();
        }
        HashMap<String, a> hashMap = featureMap;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).b;
        }
        return 0;
    }
}
