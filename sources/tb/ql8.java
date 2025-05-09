package tb;

import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ql8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends qtd>> f26808a;

    public static Map<String, Class<? extends qtd>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8dd1bfc", new Object[0]);
        }
        return f26808a;
    }

    static {
        t2o.a(155189328);
        HashMap hashMap = new HashMap();
        f26808a = hashMap;
        hashMap.put("openUrl", m5l.class);
        hashMap.put("openUrlResult", k5l.class);
        hashMap.put("openPopupWindow", h4l.class);
        hashMap.put(ThemisConfig.SCENE_SELECT, s9p.class);
        hashMap.put("input", zaf.class);
        hashMap.put("closePopupWindow", iw3.class);
        hashMap.put("confirmPopupWindow", ei4.class);
        hashMap.put("autoJumpOpenUrl", yk1.class);
        hashMap.put("autoJumpOpenUrlResult", xk1.class);
        hashMap.put("adjustAndOpenPopupWindow", tf0.class);
        hashMap.put("userTrack", fuv.class);
        hashMap.put("openSimplePopup", OpenSimplePopupSubscriber.class);
        hashMap.put("openSimpleGroupPopup", u4l.class);
        hashMap.put("popupSelect", qim.class);
        hashMap.put("confirmSimplePopup", fi4.class);
        hashMap.put(wm.EVENT_TYPE, u64.class);
        hashMap.put("postMessage", m64.class);
        hashMap.put("hideItem", bwa.class);
        hashMap.put(f4l.EVENT_TYPE, d3l.class);
    }
}
