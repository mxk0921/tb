package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.util.HashMap;
import java.util.Map;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_LIST_KEY = "channelList2Show";
    public static final String CONFIG_DATA_KEY = "configData";
    public static final String PANEL_TYPE_KEY = "panelType";
    public static final String SHARE_UT_ARGS = "shareUTArgs";
    public static final String SHOW_CHANNEL_TYPE_KEY = "showChannelType";
    public static final String SHOW_FRIEND_KEY = "showFriend";
    public static final String SHOW_FRIEND_TYPE_KEY = "showFriendType";
    public static final String TAG = "EventBridge";
    public static final String TOOL_LIST_KEY = "toolList2Show";

    static {
        t2o.a(666894581);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59aeda0d", new Object[]{str, str2});
            return;
        }
        String targetByType = ShareTargetType.getTargetByType(str);
        HashMap hashMap = new HashMap();
        hashMap.put("target", targetByType);
        hashMap.put("shareTarget", targetByType);
        hashMap.put("shareChannelType", str2);
        hashMap.put("name", str);
        hashMap.put("params", JSON.toJSONString(bwr.h().e()));
        oj8.d().c("wvShareClickEvent", new JSONObject(hashMap));
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d87a97", new Object[]{str, str2, str3});
            return;
        }
        String targetByType = ShareTargetType.getTargetByType(str);
        HashMap hashMap = new HashMap();
        hashMap.put("target", targetByType);
        hashMap.put("shareTarget", targetByType);
        hashMap.put("shareChannelType", str2);
        hashMap.put("name", str);
        hashMap.put("params", str3);
        oj8.d().c("wvShareClickEvent", new JSONObject(hashMap));
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa7f77d", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(zk4.CONTACTS_INFO_KEY, (Object) str);
        if (TextUtils.isEmpty(str)) {
            jSONObject.put(zk4.CONTACTS_INFO_STATUS_KEY, (Object) "exception");
        } else {
            jSONObject.put(zk4.CONTACTS_INFO_STATUS_KEY, (Object) zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        }
        oj8.d().c(oj8.GET_CONTACTS_INFO_EVENT, jSONObject);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d7f4c5", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) SubstituteConstants.KEY_CHANNEL_FRIENDS);
        jSONObject.put("state", (Object) (-1));
        oj8.d().c(oj8.DATA_STATE_EVENT, jSONObject);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6f31d0", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "false");
        jSONObject.put("errorCode", (Object) "0");
        jSONObject.put("errorMsg", (Object) "saveFail");
        oj8.d().c("saveScreenShotWithQR", jSONObject);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bac4ae0", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "false");
        jSONObject.put("errorCode", (Object) "1");
        jSONObject.put("errorMsg", (Object) "noPermission");
        oj8.d().c("saveScreenShotWithQR", jSONObject);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1f9e4c", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) "true");
        oj8.d().c("saveScreenShotWithQR", jSONObject);
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a0f609", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", (Object) str);
        oj8.d().c("saveShareImageSuccess", jSONObject);
    }

    public static void i(String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69338f8f", new Object[]{str, tBShareContent});
        } else if (!TextUtils.isEmpty(str) && tBShareContent != null) {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            Map<String, String> map = tBShareContent.extraParams;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("bizID", tBShareContent.businessId);
            hashMap.put("url", tBShareContent.url);
            hashMap.put("imageUrl", tBShareContent.imageUrl);
            hashMap.put("title", tBShareContent.title);
            hashMap.put("desc", tBShareContent.description);
            jSONObject.put("weexUrl", (Object) str);
            jSONObject.put("params", (Object) new JSONObject(hashMap));
            oj8.d().c(oj8.SHOW_GIFT_EVENT, jSONObject);
            fwr.b("showGiftEvent", "weexUrl:" + str);
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79355b90", new Object[0]);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String d = lkp.b.d();
        if (TextUtils.isEmpty(d)) {
            d = gjp.a().getString(R.string.share_guide_tips);
        }
        jSONObject.put("url", (Object) d);
        oj8.d().c(oj8.SHOW_COVER_EVENT, jSONObject);
    }

    public static void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85694eb7", new Object[]{new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", (Object) Integer.valueOf(i));
        if (i == 2) {
            jSONObject.put("password", (Object) ShareBizAdapter.getInstance().getAppEnv().c());
        }
        oj8.d().c(oj8.SHOW_TIPS_EVENT, jSONObject);
    }

    public static void l(TBShareContent tBShareContent, String str, String str2, String str3, int i, boolean z, String str4, String str5) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab122646", new Object[]{tBShareContent, str, str2, str3, new Integer(i), new Boolean(z), str4, str5});
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "2";
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(tBShareContent));
            parseObject.put(CHANNEL_LIST_KEY, (Object) str);
            parseObject.put(TOOL_LIST_KEY, (Object) str2);
            parseObject.put(CONFIG_DATA_KEY, (Object) str3);
            parseObject.put(PANEL_TYPE_KEY, (Object) String.valueOf(i));
            if (z) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            parseObject.put(SHOW_FRIEND_KEY, (Object) str6);
            parseObject.put(SHOW_FRIEND_TYPE_KEY, (Object) str4);
            parseObject.put(SHOW_CHANNEL_TYPE_KEY, (Object) str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(oj8.SHARE_CONTENT_KEY, (Object) parseObject.toJSONString());
            oj8.d().a(parseObject);
            oj8.d().c(oj8.REGISTER_SHARE_LISTENER_EVENT, jSONObject);
        } catch (Exception e) {
            fwr.b(TAG, "updateShareContent err:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2cf41a", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("date", str);
        hashMap.put("originDate", str2);
        oj8.d().c("qrCodeValidDate", new JSONObject(hashMap));
    }
}
