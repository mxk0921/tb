package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Deque<String> f31267a = new ArrayDeque();

    static {
        t2o.a(806356120);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cc8c472", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return u(str, p());
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfde4016", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return u(str, q());
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f28aff9", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            Deque<String> deque = f31267a;
            if (((ArrayDeque) deque).size() >= 30) {
                ((ArrayDeque) deque).pop();
            }
            if (!((ArrayDeque) deque).contains(str)) {
                ((ArrayDeque) deque).add(str);
            }
        }
    }

    public static boolean d(Context context, LiveItem liveItem) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5917b1cd", new Object[]{context, liveItem})).booleanValue();
        }
        if (!h()) {
            return false;
        }
        kzb h = v2s.o().h();
        if (h == null || h.getDeviceLevel() != 2 || !v()) {
            qab b = v2s.o().b();
            if (b == null || (!b.a(context) && !b.b(context))) {
                if (!(liveItem == null || (jSONObject = liveItem.itemConfigInfo) == null || !jSONObject.getBooleanValue(bia.UNDER_TAKE_INSIDE_DETAIL))) {
                    boolean booleanValue = liveItem.itemConfigInfo.getBooleanValue(bia.UNDER_TAKE_INSIDE_DETAIL);
                    if ((!giv.c().b() || (jSONObject2 = liveItem.itemExtData) == null || !jSONObject2.containsKey(ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL) || liveItem.itemExtData.getBooleanValue(ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL)) && booleanValue) {
                        String r = r(context, liveItem);
                        for (String str : s().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                            if (r.contains(str)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            o3s.d("InsidePrefetchUtils", "canGotoInsideItemDetail | pad or fold device.");
            return false;
        }
        o3s.d("InsidePrefetchUtils", "canGotoInsideItemDetail | low device.");
        return false;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e6da4d8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !((ArrayDeque) f31267a).contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a800d611", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableGoodPrefetch", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e91259a0", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableItemHoldPrefetch", "true"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee70f11b", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", ItemCardViewHolder.KEY_FEATURE_ENABLE_INSIDE_DETAIL, "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2245ccca", new Object[0])).booleanValue();
        }
        if (!h() || !j()) {
            return false;
        }
        kzb h = v2s.o().h();
        if (h == null || h.getDeviceLevel() != 2 || !v()) {
            return true;
        }
        o3s.d("InsidePrefetchUtils", "canGotoInsideItemDetail | low device.");
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bd24fec", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableInsideDetailProcessConfig", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc97e401", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableItemPrefetch", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17aad354", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "EnableNewCps", "true"));
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87e9d2eb", new Object[0]);
        }
        return v2s.o().p().b("tblive", "itemPrefetchNoEntryLiveSource", "");
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae0089fa", new Object[0]);
        }
        return v2s.o().p().b("tblive", "itemPrefetchNoItemIds", "");
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cc5d001", new Object[0]);
        }
        return v2s.o().p().b("tblive", "itemPrefetchNoLiveIds", "");
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa8cfe00", new Object[0]);
        }
        return v2s.o().p().b("tblive", "itemPrefetchSources", "live,hold");
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a827926b", new Object[0]);
        }
        return v2s.o().p().b("tblive", "triggerMayClickOpenSources", "open_goodslist,switch_goodslist_tab,scroll_goodslist,open_aggregation,scroll_aggregation,open_search,scroll_search,hold");
    }

    public static String r(Context context, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42f327da", new Object[]{context, liveItem});
        }
        String lowerCase = t(context).toLowerCase();
        boolean l = l();
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext == null || ext.getBusinessJSON() == null || liveItem.extendVal.getBusinessJSON().getJSONObject("cpsTcpInfo") == null || !liveItem.extendVal.getBusinessJSON().getJSONObject("cpsTcpInfo").containsKey(lowerCase) || liveItem.extendVal.getBusinessJSON().getJSONObject("itemBizInfo") == null || !l) {
            String str = liveItem.itemUrl;
            if (TextUtils.isEmpty(str)) {
                str = "http://a.m.taobao.com/i" + liveItem.itemId + ".htm";
            }
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:" + liveItem.itemUrl;
            }
            return str;
        }
        JSONObject jSONObject = liveItem.extendVal.getBusinessJSON().getJSONObject("itemBizInfo");
        String string = (!zga.c() || !"secKill".equals(liveItem.extendVal.itemBizType)) ? null : jSONObject.getString("itemJumpUrl2");
        return TextUtils.isEmpty(string) ? jSONObject.getString("itemJumpUrl") : string;
    }

    public static String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be24170e", new Object[0]);
        }
        return v2s.o().p().b("tblive", "needReplaceInsideUrls", "h5.m.taobao.com/awp/core/detail.htm");
    }

    public static String t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa913c8", new Object[]{context});
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppName(context);
        }
        return "unknow";
    }

    public static boolean u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7bec8f9", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f532d2d2", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enable_insidedetail_low", "true"));
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a7ba0e9", new Object[0])).intValue();
        }
        return Integer.parseInt(v2s.o().p().b("tblive", "triggerMayClickMaxNum", "4"));
    }

    public static void x(Context context, String str, String str2, List<String> list, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da34a6ed", new Object[]{context, str, str2, list, str3, str4});
        } else if (b(str4)) {
            if (!TextUtils.isEmpty(str) && m().contains(str)) {
                return;
            }
            if ((TextUtils.isEmpty(str2) || !o().contains(str2)) && a(str3) && list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str5 : list) {
                    if (!TextUtils.isEmpty(str5) && !n().contains(str5)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("itemId", (Object) str5);
                        jSONArray.add(jSONObject);
                        c(str5);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("bizName", (Object) PreloadTaskEntity.PAGE_DETAIL);
                jSONObject2.put(PreloadTaskEntity.SOURCE_FROM, (Object) str3);
                jSONObject2.put("items", (Object) jSONArray);
                Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
                intent.setPackage("com.taobao.taobao");
                intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject2.toJSONString());
                context.sendBroadcast(intent);
            }
        }
    }
}
