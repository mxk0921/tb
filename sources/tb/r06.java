package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowResponseData;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r06 extends v10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HIGHLIGHTTRACKUTILS = -5783209636750125903L;

    static {
        t2o.a(779092629);
    }

    public static /* synthetic */ Object ipc$super(r06 r06Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXHighlightTrackUtilsEventHandler");
    }

    @Override // tb.v10
    public void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, ux9 ux9Var) {
        HighlightRowResponseData.HighlightRow highlightRow;
        List<LiveTimemovingModel> list;
        LiveTimemovingModel liveTimemovingModel;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c45658f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, ux9Var});
            return;
        }
        JSONObject data = dXRuntimeContext.L().getData();
        HashMap hashMap = null;
        HighlightRowResponseData highlightRowResponseData = data != null ? (HighlightRowResponseData) JSON.parseObject(JSON.toJSONString(data), HighlightRowResponseData.class) : null;
        try {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            Object obj = objArr[2];
            if (obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
                hashMap = (HashMap) JSON.parseObject(String.valueOf(objArr[2]), HashMap.class);
            }
            if ("trackBtnWithExtras".equals(valueOf)) {
                sbu.f(ux9Var, valueOf2, hashMap);
            } else if ("trackShow".equals(valueOf)) {
                sbu.k(ux9Var, valueOf2, hashMap);
            } else if ("trackCustom".equals(valueOf)) {
                sbu.i(ux9Var, 19999, valueOf2, hashMap);
            } else if ("ChatViewTrackShow".equals(valueOf) && highlightRowResponseData != null && (highlightRow = highlightRowResponseData.model) != null && (list = highlightRow.timeMovingList) != null && (liveTimemovingModel = list.get(highlightRowResponseData.selectedItemIndex)) != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("item_id", liveTimemovingModel.itemId);
                if (liveTimemovingModel.commentsList != null) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap2.put("assess_type", str);
                sbu.k(ux9Var, valueOf2, hashMap2);
            }
        } catch (Exception unused) {
        }
    }
}
