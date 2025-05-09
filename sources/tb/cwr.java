package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.contacts.data.member.ContactMember;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.contacts.data.member.ShareResultMember;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.core.contacts.control.ContactsSendShareBusiness;
import com.taobao.share.core.contacts.mtop.response.ComTaobaoMclContactsSendshareResponseData;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cwr implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ContactsSendShareBusiness.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f17376a;
        public final /* synthetic */ String b;

        public a(Map map, String str) {
            this.f17376a = map;
            this.b = str;
        }

        @Override // com.taobao.share.core.contacts.control.ContactsSendShareBusiness.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aecef52f", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitFail("share", "Share", "SHARE_FAILED_CONTACTS", Localization.q(R.string.taobao_app_1010_1_17832));
            }
        }

        @Override // com.taobao.share.core.contacts.control.ContactsSendShareBusiness.a
        public void a(ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e888447", new Object[]{this, comTaobaoMclContactsSendshareResponseData});
            } else if (comTaobaoMclContactsSendshareResponseData == null) {
                TBS.Page.ctrlClicked(CT.Button, "GotoChat");
                if (ShareBizAdapter.getInstance().getFriendsProvider() != null) {
                    ShareBizAdapter.getInstance().getFriendsProvider().e(null);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(comTaobaoMclContactsSendshareResponseData.getSendSuccessList()));
                String str = (String) this.f17376a.get("ccode");
                if (TextUtils.isEmpty(str)) {
                    str = ((ShareResultMember) arrayList.get(0)).getUserId();
                }
                if (TextUtils.isEmpty(str)) {
                    str = (String) this.f17376a.get("userId");
                }
                cwr.b(cwr.this, this.b, str, this.f17376a, comTaobaoMclContactsSendshareResponseData.intercept);
            }
        }
    }

    static {
        t2o.a(666894419);
        t2o.a(666894439);
    }

    public static /* synthetic */ void b(cwr cwrVar, String str, String str2, Map map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b02cc5a", new Object[]{cwrVar, str, str2, map, str3});
        } else {
            cwrVar.f(str, str2, map, str3);
        }
    }

    public static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e47a71cc", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getValue())) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(String.format("%s=%s", entry.getKey(), URLEncoder.encode(entry.getValue())));
            }
        }
        return sb.toString();
    }

    @Override // tb.xhp
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{this, str, map});
            return;
        }
        TBShareContent e = bwr.h().e();
        if (e != null) {
            String str2 = e.description;
            if (bwr.h().n() != null && !TextUtils.isEmpty(null)) {
                str2 = "null " + str2;
            }
            if (map == null || map.size() == 0) {
                d(Localization.q(R.string.share_app_share), str2);
                return;
            }
            Properties properties = new Properties();
            properties.put("Type", "RecentlyContacts");
            e.fillUTProperties(properties);
            TBS.Ext.commitEvent("ShareTypes", properties);
            e(str, str2, map);
        }
    }

    public final void e(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5686ba", new Object[]{this, str, str2, map});
        } else {
            g(new ContactsSendShareBusiness(hjp.a().getApplicationContext(), new bl4(hjp.a().getApplicationContext()), new a(map, str)), str2, map);
        }
    }

    public final long h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad61214a", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return j;
            }
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c983a688", new Object[]{this, str, str2});
            return;
        }
        TBShareContent e = bwr.h().e();
        if (e != null) {
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("itemDescription", str2);
            bundle.putString("itemPic", e.imageUrl);
            bundle.putString("itemUrl", e.url);
            bundle.putString("itemId", bwr.h().j());
            bundle.putString("itemType", bwr.h().o());
            bundle.putString("businessId", e.businessId);
            bundle.putBoolean("isShowShare", false);
            bundle.putString(MspGlobalDefine.EXTENDINFO, JSON.toJSONString((Object) e.activityParams, true));
            bundle.putString("shareId", e.shareId);
            bundle.putString("suId", e.suId);
            String config = OrangeConfig.getInstance().getConfig("android_share", "moreContactsWeexUrl", "https://market.m.taobao.com/apps/market/msgrax/share_address_book.html?wh_weex=true");
            if (TextUtils.isEmpty(config)) {
                config = "http://m.taobao.com/go/importcontacts.html";
            } else {
                bundle.putString(oj8.SHARE_CONTENT_KEY, JSON.toJSONString(e));
            }
            Nav.from(hjp.a().getApplicationContext()).withExtras(bundle).toUri(config);
        }
    }

    public final void f(String str, String str2, Map<String, String> map, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f2f551", new Object[]{this, str, str2, map, str3});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            TBS.Page.ctrlClicked(CT.Button, "GotoChat");
            Bundle bundle = new Bundle();
            HashMap hashMap = new HashMap();
            hashMap.put(MessageNavProcessorV2.KEY_BIZ_CONFIG_TYPE, "mpm_chat");
            hashMap.put(MessageNavProcessorV2.KEY_DATASOURCE_TYPE, "im_cc");
            String str5 = map.get("type");
            if (String.valueOf(2).equals(str5) || String.valueOf(4).equals(str5)) {
                bundle.putString("conversation_code", str2);
                hashMap.put("conversation_code", str2);
            } else {
                bundle.putLong("amp_uid", Long.valueOf(str2).longValue());
                bundle.putString("amp_displayname", map.get("name"));
                hashMap.put("amp_uid", str2);
                hashMap.put("amp_displayname", map.get("name"));
                if ("1".equals(str3)) {
                    TBShareContent e = bwr.h().e();
                    if (e != null) {
                        hashMap.put(yj4.PARAM_SHAQRE_ITEM_ID, bwr.h().j());
                        hashMap.put("shareTitle", e.description);
                        Map<String, String> map2 = e.extraParams;
                        if (map2 != null) {
                            str4 = map2.get("price");
                        } else {
                            str4 = "";
                        }
                        hashMap.put("sharePrice", str4);
                        hashMap.put("shareImage", e.imageUrl);
                        hashMap.put("shareUrl", e.url);
                        hashMap.put("msgType", "1");
                        hashMap.put("shareType", e.shareScene);
                        hashMap.put("activityId", e.businessId);
                    } else {
                        return;
                    }
                }
            }
            String str6 = "?" + c(hashMap);
            TLog.logd("TBShareFriendHandler", " extInfo:" + str6);
            Nav.from(hjp.a()).withExtras(bundle).toUri(ShareBizAdapter.getInstance().getFriendsProvider().c() + str6);
        } else {
            TLog.loge(hjp.UNUSED_CODE_TAG, " userid empty and ContactsShareFinishPushView has been del!!!");
        }
        AppMonitor.Alarm.commitSuccess("share", "Share");
    }

    public final void g(ContactsSendShareBusiness contactsSendShareBusiness, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b929ab", new Object[]{this, contactsSendShareBusiness, str, map});
            return;
        }
        ArrayList<ContactMember> arrayList = new ArrayList<>();
        ContactMember contactMember = new ContactMember();
        RecentMember recentMember = new RecentMember();
        recentMember.setCcode(map.get("ccode"));
        recentMember.setHeadUrl(map.get("headUrl"));
        recentMember.setPhone(map.get("phone"));
        recentMember.setName(map.get("name"));
        recentMember.setUserId(map.get("userId"));
        recentMember.setTimeStamp(h(map.get("timeStamp"), System.currentTimeMillis()));
        recentMember.setTaoFlag(map.get("taoFlag"));
        recentMember.setTaoFriendName(map.get("taoFriendName"));
        if ("true".equals(map.get("taoFriend"))) {
            recentMember.setTaoFriend(true);
        } else {
            recentMember.setTaoFriend(false);
        }
        recentMember.setType(Integer.parseInt(map.get("type")));
        recentMember.setRecordNum(Integer.parseInt(map.get("recordNum")));
        contactMember.setData(recentMember);
        arrayList.add(contactMember);
        contactsSendShareBusiness.startShare(arrayList, "", "", "1");
    }
}
