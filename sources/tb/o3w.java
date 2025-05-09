package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o3w extends pt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_ADD_NAVI_ITEM = "addNaviItem";
    public static final String OPERATE_CONTROL_SCROLL = "pageViewControlScroll";
    public static final String OPERATE_DISMISS_CARD = "dismissCard";
    public static final String OPERATE_EVENT_DX_TO_WEEX = "eventDXToWeex";
    public static final String OPERATE_GET_DETAIL_DATA = "getDetailData";
    public static final String OPERATE_GET_EXPOSURE_STATE = "getExposureStatus";
    public static final String OPERATE_GET_RECOMMENDWEEXPASS = "getRecommendWeexPassParams";
    public static final String OPERATE_MONITOR_LOG = "weexMonitorLog";
    public static final String OPERATE_PAGE_TRACE = "pageTrace";
    public static final String OPERATE_PREVENT_BACK = "preventBack";
    public static final String OPERATE_QUIT_NEW_DETAIL = "quitNewDetail";
    public static final String OPERATE_SHOW_WEEX_POP = "showWeexPop";
    public static final String OPERATE_UPDATE_DATA = "update_detail";

    static {
        t2o.a(352321631);
    }

    public o3w(Object obj, JSONObject jSONObject) {
        super(obj, jSONObject);
    }

    public static /* synthetic */ Object ipc$super(o3w o3wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/event/VerticalAbsViewHolderEvent");
    }

    @Override // tb.pt1, com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return kk8.a(o3w.class, this.f26280a);
    }
}
