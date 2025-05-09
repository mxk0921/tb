package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539648);
    }

    public static String b(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6bc6c6", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (ext = baseSectionModel.getExt()) == null) {
            return null;
        }
        return ext.getString("cardFeatureId");
    }

    public static String c(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8199dea", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null) {
            return null;
        }
        return args.getString(yj4.PARAM_PVID);
    }

    public static String d(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e68c79f7", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (ext = baseSectionModel.getExt()) == null) {
            return null;
        }
        return ext.getString("originalCardFeatureId");
    }

    public static int e(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa85e5da", new Object[]{baseSectionModel})).intValue();
        }
        if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null || !args.containsKey("recIndex")) {
            return -1;
        }
        try {
            return args.getIntValue("recIndex");
        } catch (InfoFlowRuntimeException e) {
            fve.c("RecyclerViewExposeUtils", "getRecIndex error", e);
            return -1;
        }
    }

    public static void a(BaseSectionModel<?> baseSectionModel, View view) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b204e9", new Object[]{baseSectionModel, view});
        } else if (mve.a("enableCollectionHandGesture", true) && view != null) {
            JSONObject args = baseSectionModel.getArgs();
            if (eue.a() == null || (!TBDeviceUtils.P(eue.a()) && !TBDeviceUtils.p(eue.a()))) {
                z = false;
            }
            if (args != null && !z) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                    if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == 0) {
                        str = "left";
                    } else {
                        str = "right";
                    }
                    args.put("cardPosition", (Object) str);
                    args.put("slideGestureHands", (Object) u6a.t());
                }
            }
        }
    }
}
