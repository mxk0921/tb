package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.PlayControllerConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782769);
    }

    public List<aaw> a(List<aaw> list, PlayControllerConfig playControllerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("696a711f", new Object[]{this, list, playControllerConfig});
        }
        if (list == null) {
            fve.e("ExposureRatioFilter", "无可用视频播控item");
            return null;
        }
        fve.e("ExposureRatioFilter", "可用视频播控item：" + list.size());
        float playControlFocusAreaMinPercent = playControllerConfig.getPlayControlFocusAreaMinPercent();
        if (playControlFocusAreaMinPercent > 1.0f) {
            fve.e("ExposureRatioFilter", "服务端配置最小曝光比例大于1，不播放视频。 serviceMinPercent:" + playControlFocusAreaMinPercent);
            return null;
        }
        List<aaw> b = b(list, 1.0f);
        if (!b.isEmpty()) {
            fve.e("ExposureRatioFilter", "存在100%曝光的视频播控item：" + b.size());
            return b;
        }
        List<aaw> b2 = b(list, playControlFocusAreaMinPercent);
        fve.e("ExposureRatioFilter", "小于 100% 大于等于 " + playControlFocusAreaMinPercent + " 视频播控item：" + b2.size());
        return b2;
    }

    public final List<aaw> b(List<aaw> list, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bbafd884", new Object[]{this, list, new Float(f)});
        }
        ArrayList arrayList = new ArrayList();
        for (aaw aawVar : list) {
            if (aawVar.f().a() >= f) {
                arrayList.add(aawVar);
            }
        }
        return arrayList;
    }
}
