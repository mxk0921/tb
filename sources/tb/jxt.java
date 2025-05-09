package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.megadesign.dx.view.DisplayVideoView;
import com.taobao.android.order.bundle.base.BaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031808);
    }

    public static List<DisplayVideoView> b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e41f1149", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DisplayVideoView) {
                arrayList.add((DisplayVideoView) childAt);
            } else if (childAt instanceof ViewGroup) {
                arrayList.addAll(b((ViewGroup) childAt));
            }
        }
        return arrayList;
    }

    public static void d(Context context, String str, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708083a8", new Object[]{context, str, viewGroup});
            return;
        }
        View c = c(viewGroup);
        if (c instanceof ViewGroup) {
            a(context, str, b((ViewGroup) c));
        }
    }

    public static void a(Context context, String str, List<DisplayVideoView> list) {
        DisplayVideoView next;
        Integer currentVideoPosition;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524e03a", new Object[]{context, str, list});
            return;
        }
        Iterator<DisplayVideoView> it = list.iterator();
        while (it.hasNext() && (currentVideoPosition = (next = it.next()).getCurrentVideoPosition()) != null && currentVideoPosition.intValue() > 0) {
            try {
                str2 = ((t7v) ((BaseActivity) context).q3().c()).getInstance().w().i().getJSONObject("events").getJSONObject("utExplosure").getJSONObject("fields").getJSONObject("args").getString("sellerId");
            } catch (Exception unused) {
                lor.c("TBOrderDetailActivity", "Tips_video_UT", new String[0]);
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("orderId", str);
            String videoId = next.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            hashMap.put("videoId", videoId);
            hashMap.put("sellerId", str2);
            hashMap.put(tmu.CURRENT_TIME, String.valueOf(currentVideoPosition));
            hashMap.put("videoDuration", next.getVideoDuration().toString());
            String c = ParallelBizValueHelper.c(ParallelBizValueHelper.PageType.order_detail);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(c, 19999, c + "_Tips_AutoPlay", null, null, hashMap).build());
        }
    }

    public static View c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5c684ee0", new Object[]{viewGroup});
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) childAt;
                JSONObject data = dXRootView.getData();
                if (!(data == null || data.get("fields") == null || !"true".equals((String) ((JSONObject) data.get("fields")).get("needsVideoAnalyze")))) {
                    return dXRootView;
                }
            } else if (childAt instanceof ViewGroup) {
                return c((ViewGroup) childAt);
            }
        }
        return null;
    }
}
