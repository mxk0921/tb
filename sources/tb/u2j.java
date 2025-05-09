package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TextMessage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u2j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SYS_PREFIX = "⁂∰⏇";

    static {
        t2o.a(806356488);
    }

    public static ChatMessage a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("8df41bdd", new Object[]{tLiveMsg});
        }
        ChatMessage chatMessage = new ChatMessage();
        if (tLiveMsg.type == 10105) {
            try {
                TextMessage textMessage = (TextMessage) JSON.parseObject(new String(tLiveMsg.data), TextMessage.class);
                chatMessage.mContent = textMessage.message;
                long j = tLiveMsg.timestamp;
                chatMessage.mMessageId = j;
                chatMessage.mUserNick = tLiveMsg.from;
                chatMessage.mTimestamp = j;
                chatMessage.mUserId = zqq.h(tLiveMsg.userId);
                chatMessage.renders = (HashMap) textMessage.params;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return chatMessage;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca5df179", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return true;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public static LiveItem d(ShareGoodMessage shareGoodMessage) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("f09c1fcb", new Object[]{shareGoodMessage});
        }
        LiveItem liveItem = new LiveItem();
        liveItem.itemName = shareGoodMessage.itemName;
        liveItem.itemPrice = shareGoodMessage.itemPrice;
        liveItem.itemPic = shareGoodMessage.itemPic;
        liveItem.itemId = zqq.h(shareGoodMessage.itemId);
        liveItem.liveId = shareGoodMessage.liveId;
        liveItem.itemUrl = shareGoodMessage.itemUrl;
        liveItem.itemH5TaokeUrl = shareGoodMessage.itemH5TaokeUrl;
        Object h = fkx.h(shareGoodMessage.itemExtData);
        if (h instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) h;
            liveItem.itemExtData = jSONObject;
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = liveItem.itemExtData.get(str)) != null && !(obj instanceof JSON)) {
                    liveItem.itemExtData.put(str, (Object) obj.toString());
                }
            }
        }
        LiveItem.Ext ext = (LiveItem.Ext) fkx.f(fkx.i(shareGoodMessage.extendVal), LiveItem.Ext.class);
        liveItem.extendVal = ext;
        if (ext == null) {
            liveItem.extendVal = new LiveItem.Ext();
        }
        Map<String, String> map = shareGoodMessage.extendVal;
        if (map != null) {
            liveItem.extendVal.itemType = map.get("itemType");
            liveItem.extendVal.groupInfo = shareGoodMessage.extendVal.get("groupInfo");
            liveItem.extendVal.anchorId = shareGoodMessage.extendVal.get(RequestConfig.KEY_ANCHOR_ID);
            liveItem.extendVal.liveId = shareGoodMessage.extendVal.get("liveId");
            liveItem.extendVal.adgrid = shareGoodMessage.extendVal.get("adgrid");
            liveItem.extendVal.refpid = shareGoodMessage.extendVal.get(yj4.REF_PID);
            liveItem.extendVal.isBulk = shareGoodMessage.extendVal.get("isBulk");
            liveItem.extendVal.bulkPrice = shareGoodMessage.extendVal.get("bulkPrice");
            liveItem.extendVal.bulkSize = zqq.j(shareGoodMessage.extendVal.get("bulkSize"));
            liveItem.extendVal.bulkEndTime = shareGoodMessage.extendVal.get("bulkEndTime");
            liveItem.extendVal.itemPick = shareGoodMessage.extendVal.get("itemPick");
            liveItem.extendVal.commission = shareGoodMessage.extendVal.get("commission");
            liveItem.extendVal.business = shareGoodMessage.extendVal.get("business");
            liveItem.extendVal.needJumpH5 = zqq.c(shareGoodMessage.extendVal.get("needJumpH5"));
            liveItem.extendVal.userType = shareGoodMessage.extendVal.get(mh1.PRD_USER_TYPE);
            liveItem.extendVal.itemTags = shareGoodMessage.extendVal.get("itemTags");
            liveItem.extendVal.msgUuid = shareGoodMessage.extendVal.get(cpr.TYPE_MSG_UUID);
            liveItem.extendVal.enableSKU = b(shareGoodMessage.extendVal.get("enableSKU"));
            liveItem.extendVal.itemBizType = shareGoodMessage.extendVal.get("itemBizType");
            liveItem.extendVal.groupItemTradeParams = shareGoodMessage.extendVal.get("groupItemTradeParams");
            liveItem.extendVal.groupItemTitle = shareGoodMessage.extendVal.get("groupItemTitle");
            liveItem.extendVal.canEnjoyDiscounts = shareGoodMessage.extendVal.get("canEnjoyDiscounts");
            liveItem.extendVal.groupItemShowPrice = shareGoodMessage.extendVal.get("groupItemShowPrice");
            liveItem.extendVal.discountsQuota = shareGoodMessage.extendVal.get("discountsQuota");
            liveItem.extendVal.groupItemInfos = shareGoodMessage.extendVal.get("groupItemInfos");
        }
        return liveItem;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6a5691c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str).optString("type");
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3201903", new Object[]{str})).booleanValue();
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("jsData");
            if (optJSONObject != null) {
                return optJSONObject.optBoolean("presentingHierarchy");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
