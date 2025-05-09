package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963114);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b519344", new Object[0])).booleanValue();
        }
        return akt.p2("weitao_switch.enableBrowserBadgeDelayReport", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37875e8", new Object[0])).booleanValue();
        }
        return akt.p2("weitao_switch.enableFixH5LayerWhenLogin", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2f79c00", new Object[0])).booleanValue();
        }
        return !TBDeviceUtils.p(Globals.getApplication()) && !TBDeviceUtils.P(Globals.getApplication()) && akt.p2("weitao_switch.enableNativeBrowserBadge", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d089e148", new Object[0])).booleanValue();
        }
        return akt.p2("weitao_switch.enableOptimizeBrowserBadgeBottomAreaShowTime", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a875f0d", new Object[0])).booleanValue();
        }
        return akt.p2("weitao_switch.fixCircleProgressCallbackAtInfiniteLoop", true);
    }

    public static JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f4b031dc", new Object[0]);
        }
        JSONObject parseObject = JSON.parseObject("{\"去提现\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN01HfQ67w1rOT9Qpsqmc_!!6000000005621-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"去兑换\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN011wYyd0221X5aKnVPH_!!6000000007060-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"现金账户\":{\"url\":\"https://img.alicdn.com/imgextra/i2/O1CN01hmSCxw1KGKnu8EMoT_!!6000000001136-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"}}");
        try {
            JSONObject parseObject2 = JSON.parseObject(akt.H2("weitao_switch.browserBadgeBottomAreaTextToPicMapping", "{\"去提现\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN01HfQ67w1rOT9Qpsqmc_!!6000000005621-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"去兑换\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN011wYyd0221X5aKnVPH_!!6000000007060-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"现金账户\":{\"url\":\"https://img.alicdn.com/imgextra/i2/O1CN01hmSCxw1KGKnu8EMoT_!!6000000001136-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"}}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取浏览挂角中底部区域文本与图片URL的映射关系异常", th);
            return parseObject;
        }
    }

    public static long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3b532ee", new Object[0])).longValue();
        }
        long w2 = akt.w2("weitao_switch.browserBadgeDelayReportTime", 500);
        if (w2 >= 0) {
            return w2;
        }
        return 500L;
    }

    public static List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc192b2a", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vff.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM);
        arrayList.add("bubbleDTO");
        arrayList.add("paddingComponent");
        arrayList.add("push");
        arrayList.add("pop");
        arrayList.add("popJson");
        try {
            String H2 = akt.H2("weitao_switch.browserBadgeDelegateShowDataFields", "bottomComponent,bubbleDTO,paddingComponent,push,pop,popJson");
            if (H2 == null) {
                return arrayList;
            }
            String[] split = H2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取浏览挂角中委托展示的服务端数据字段异常", th);
            return arrayList;
        }
    }

    public static Pair<Integer, Integer> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c823de29", new Object[0]);
        }
        Pair<Integer, Integer> create = Pair.create(265, 63);
        try {
            String H2 = akt.H2("weitao_switch.browserBadgeProgressBarCenterMargin", "265,63");
            if (H2 == null) {
                return create;
            }
            String[] split = H2.split(",");
            return Pair.create(Integer.valueOf(nwv.t(split[0], 265)), Integer.valueOf(nwv.t(split[1], 63)));
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取浏览挂角中环形进度条圆心的顶部、右侧边距异常", th);
            return create;
        }
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e2c2dd7", new Object[0])).longValue();
        }
        long w2 = akt.w2("weitao_switch.browserBadgeViewDelayHideTime", 200);
        if (w2 >= 0) {
            return w2;
        }
        return 200L;
    }

    public static JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e816bc0", new Object[0]);
        }
        JSONObject parseObject = JSON.parseObject("{\"entityId\":\"101635\"}");
        try {
            JSONObject parseObject2 = JSON.parseObject(akt.H2("weitao_switch.h5LayerDataRequestBody", "{\"entityId\":\"101635\"}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取H5互动层数据的请求body异常", th);
            return parseObject;
        }
    }

    public static JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61694c73", new Object[0]);
        }
        JSONObject parseObject = JSON.parseObject("{\"video\":1000,\"newFollow\":1000}");
        try {
            JSONObject parseObject2 = JSON.parseObject(akt.H2("weitao_switch.h5LayerDelayInitTimesOnTabStarted", "{\"video\":1000,\"newFollow\":1000}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取H5互动层在Tab可见时延迟初始化的时间异常", th);
            return parseObject;
        }
    }

    public static List<String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fb253a2", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("video");
        arrayList.add("newFollow");
        try {
            String H2 = akt.H2("weitao_switch.h5LayerInitWebViewTabIds", "video,newFollow");
            if (H2 == null) {
                return arrayList;
            }
            String[] split = H2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取H5互动层初始化WebView的Tab的ID异常", th);
            return arrayList;
        }
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c6fcd7b", new Object[0]);
        }
        String H2 = akt.H2("weitao_switch.h5LayerWebViewLoadURL", "https://web.m.taobao.com/app/tbvideo/global-interaction-view/global?isGlobal=true");
        return !TextUtils.isEmpty(H2) ? H2 : "https://web.m.taobao.com/app/tbvideo/global-interaction-view/global?isGlobal=true";
    }

    public static long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c4f4941", new Object[0])).longValue();
        }
        long w2 = akt.w2("weitao_switch.h5TaskTimeoutTime", 15000);
        if (w2 >= 0) {
            return w2;
        }
        return 15000L;
    }

    public static List<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("376bd0b2", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("video");
        arrayList.add("newFollow");
        try {
            String H2 = akt.H2("weitao_switch.nativeBrowserBadgeEnableTabIds", "video,newFollow");
            if (H2 == null) {
                return arrayList;
            }
            String[] split = H2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获取开启Native浏览挂角的Tab的ID异常", th);
            return arrayList;
        }
    }

    public static List q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("48591d8f", new Object[0]);
        }
        try {
            return Arrays.asList(akt.H2("weitao_switch.supportBrowseTaskTypes", "share_help").split(","));
        } catch (Throwable th) {
            vgh.d(null, k0r.TAG, "获得支持的浏览任务类型异常", th);
            return Collections.EMPTY_LIST;
        }
    }
}
