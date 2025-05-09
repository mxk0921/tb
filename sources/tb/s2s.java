package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.BKAnimBgFrameLayout;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321977);
    }

    public static void a(aqz aqzVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout, BKAnimBgFrameLayout bKAnimBgFrameLayout, rpz rpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c6fd52", new Object[]{aqzVar, newDetailMaskFrameLayout, bKAnimBgFrameLayout, rpzVar});
        } else if (newDetailMaskFrameLayout.isDestroy()) {
            newDetailMaskFrameLayout.getMaskHandler().a(newDetailMaskFrameLayout.getLogTag(), "无极缩放根视图已被销毁。放弃initBackAnimInfo。");
        } else {
            tpz tpzVar = aqzVar.k;
            if (tpzVar == null) {
                tpzVar = e0z.a(newDetailMaskFrameLayout);
            }
            bKAnimBgFrameLayout.setAnimCardInfo(tpzVar);
            if (!rpzVar.a()) {
                bKAnimBgFrameLayout.setScaleImageView(newDetailMaskFrameLayout.mScaleImageView);
            }
            bKAnimBgFrameLayout.initScaleImageView();
            bKAnimBgFrameLayout.preparePageSnapShot(aqzVar);
        }
    }
}
