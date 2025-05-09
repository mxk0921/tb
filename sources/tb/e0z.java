package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321992);
    }

    public static tpz a(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpz) ipChange.ipc$dispatch("a552c58a", new Object[]{newDetailMaskFrameLayout});
        }
        tpz tpzVar = newDetailMaskFrameLayout.mAnimCardInfo;
        if (tpzVar != null) {
            return tpzVar;
        }
        tpz a2 = upz.a();
        a2.b(newDetailMaskFrameLayout.mImageViewScreenStartX);
        a2.c(newDetailMaskFrameLayout.mImageViewScreenStartY);
        a2.d(newDetailMaskFrameLayout.mImageViewStartHeight);
        a2.e(newDetailMaskFrameLayout.mImageViewStartWidth);
        a2.a(newDetailMaskFrameLayout.mCardBitmapRef);
        return a2;
    }
}
