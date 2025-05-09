package tb;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c49 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRIORITY_ABOVE_NORMAL = 750;
    public static final int PRIORITY_BELOW_NORMAL = 250;
    public static final int PRIORITY_HIGHEST = 1000;
    public static final int PRIORITY_LOWEST = 0;
    public static final int PRIORITY_NORMAL = 500;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, a> f16845a;
    public static final c49 b = new c49();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16846a;
        public final int b;

        static {
            t2o.a(912263039);
        }

        public a(int i, int i2) {
            this.f16846a = i;
            this.b = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> ArrayList<iv<? super T>> a(Context context, TypedArray typedArray) {
        ArrayList<iv<? super T>> arrayList = (ArrayList<iv<? super T>>) new ArrayList();
        for (Map.Entry<String, a> entry : f16845a.entrySet()) {
            String key = entry.getKey();
            int i = entry.getValue().f16846a;
            if (i >= 0 && typedArray.getBoolean(i, false)) {
                try {
                    arrayList.add(Class.forName(b.getClass().getPackage().getName() + "." + key).newInstance());
                } catch (ClassNotFoundException e) {
                    tgh.c("FeatureFactory", "Android UiKit can't find feature by id", e);
                } catch (Exception e2) {
                    tgh.c("FeatureFactory", "exception", e2);
                }
            }
        }
        return arrayList;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23271408", new Object[]{str})).intValue();
        }
        HashMap<String, a> hashMap = f16845a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).b;
        }
        return 0;
    }

    static {
        t2o.a(912263038);
        HashMap<String, a> hashMap = new HashMap<>();
        f16845a = hashMap;
        hashMap.put("ClickDrawableMaskFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_clickDrawableMaskFeature, 750));
        hashMap.put("skuRatioFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_ratioFeature, 500));
        hashMap.put("skuRoundRectFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_roundRectFeature, 500));
        hashMap.put("skuRoundFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_roundFeature, 500));
        hashMap.put("skuClickViewMaskFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_clickViewMaskFeature, 250));
        hashMap.put("skuBinaryPageFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_binaryPageFeature, 500));
        hashMap.put("skuPinnedHeaderFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pinnedHeaderFeature, 500));
        hashMap.put("skuPullToRefreshFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pullToRefreshFeature, 500));
        hashMap.put("skuStickyScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_stickyScrollFeature, 500));
        hashMap.put("skuParallaxScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_parallaxScrollFeature, 500));
        hashMap.put("skuBounceScrollFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_bounceScrollFeature, 500));
        hashMap.put("skuPencilShapeFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_pencilShapeFeature, 500));
        hashMap.put("skuAutoScaleFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_autoScaleFeature, 500));
        hashMap.put("skuRotateFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_rotateFeature, 500));
        hashMap.put("skuImagesavefeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_imagesavefeature, 500));
        hashMap.put("skuCellAnimatorFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_cellAnimatorFeature, 500));
        hashMap.put("skuRecyclerskuCellAnimatorFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_recyclerCellAnimatorFeature, 500));
        hashMap.put("skuDragToRefreshFeature", new a(R.styleable.TTDetailExt_FeatureNameSpace_dragToRefreshFeature, 500));
    }
}
