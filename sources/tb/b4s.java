package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.interact.ShareDo;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b4s implements dpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ShareBusinessListener f16179a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
                return;
            }
            TLog.loge(cwd.LOG_TAG, "TLiveShareAdapter", "[ShareBusinessListener#onShare] shareTargetType: " + shareTargetType);
            ux9 d = vx9.d();
            if (d != null) {
                str = d.C();
            } else {
                str = null;
            }
            sjr.g().c("com.taobao.taolive.room.share", shareContent, str);
            b4s.c();
        }
    }

    static {
        t2o.a(779092370);
        t2o.a(806355936);
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            q();
        }
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b298408", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("tblive_share", "hideWatchNumsText", "大家都在看");
    }

    public static boolean o(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd783fb", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || !videoInfo.isOfficialType()) {
            return false;
        }
        return true;
    }

    public static void q() {
        long j;
        long j2;
        IUniversalProxy.b liveEventReportInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a84b56", new Object[0]);
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            try {
                j = Long.parseLong(c0.liveId);
                try {
                    AccountInfo accountInfo = c0.broadCaster;
                    if (accountInfo != null) {
                        j2 = Long.parseLong(accountInfo.accountId);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                j = 0;
            }
            j2 = 0;
        } else {
            j = 0;
            j2 = 0;
        }
        if (giv.f() != null && giv.f().e() != null) {
            if (!(d9m.L() == null || (liveEventReportInstance = d9m.L().getLiveEventReportInstance()) == null)) {
                liveEventReportInstance.a(j, j2);
                if (o(c0)) {
                    liveEventReportInstance.b(yqq.n(c0.officialLiveInfo.officialLiveId, 0L), yqq.n(c0.officialLiveInfo.accountId, 0L));
                }
            }
            giv.f().f("share_test", new HashMap());
        }
    }

    public final String e(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2368fd6e", new Object[]{this, str, str2, str3, new Boolean(z)});
        }
        if (str == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            TLog.loge(cwd.LOG_TAG, "TLiveShareAdapter", "[appendValueToUrl] params error,  url: " + str + ", key: " + str2 + ", value: " + str3);
            return str;
        } else if (str.contains("?")) {
            if (z) {
                return str + "&" + str2 + "=" + Uri.encode(str3);
            }
            return str + "&" + str2 + "=" + str3;
        } else if (z) {
            return str + "?" + str2 + "=" + Uri.encode(str3);
        } else {
            return str + "?" + str2 + "=" + str3;
        }
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f154a79", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            jSONObject.put("feed_id", (Object) c0.liveId);
            AccountInfo accountInfo = c0.broadCaster;
            if (accountInfo != null) {
                jSONObject.put(z9u.KEY_ACCOUNT_ID, (Object) accountInfo.accountId);
            }
            if (pvs.M0() && up6.r0(vx9.d())) {
                jSONObject.put("spm-cnt", (Object) "a2141.23201685");
            } else if (rbu.l()) {
                jSONObject.put("spm-cnt", (Object) rbu.p());
            } else {
                jSONObject.put("spm-cnt", (Object) "a2141.8001249");
            }
            if (v2s.o().f() != null) {
                jSONObject.put(MspGlobalDefine.APP_KEY, (Object) v2s.o().f().getAppKey());
            }
            jSONObject.put("os", (Object) "android");
        }
        return Uri.encode("taobaozhibo|a2141.8001249|" + jSONObject.toJSONString());
    }

    public final Map<String, String> h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7aa0ec6b", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coverImageSource", map.get(yj4.PARAM_FANDOM_ACCOUNT_IMG));
        hashMap.put("preShareHeadPic", map.get(yj4.PARAM_FANDOM_HEAD_IMG));
        hashMap.put("liveTitle", map.get(yj4.PARAM_SHARE_TITLE));
        hashMap.put("accountName", map.get(yj4.PARAM_FANDOM_ACCOUNT_NAME));
        hashMap.put("startTime", map.get(yj4.PARAM_FANDOM_START_TIME));
        hashMap.put("hotItems", map.get(yj4.PARAM_FANDOM_HOT_ITEMS));
        return hashMap;
    }

    public final String l() {
        ShareDo shareDo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("732de433", new Object[]{this});
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 == null || (shareDo = c0.shareUrlDO) == null) {
            return null;
        }
        return shareDo.shareUrl;
    }

    public final String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c39c1b1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.contains("cp_origin=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&cp_origin=" + g();
        }
        return str + "?cp_origin=" + g();
    }

    public final boolean p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9733062", new Object[]{this, new Long(j)})).booleanValue();
        }
        if ((j & 256) == 256) {
            return true;
        }
        return false;
    }

    public static String d(String str) {
        ArrayList<QualitySelectItem> arrayList;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97f0448f", new Object[]{str});
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 == null || !TextUtils.isEmpty(c0.paidLiveType) || !"1".equals(c0.roomStatus) || (arrayList = c0.liveUrlList) == null || arrayList.size() <= 1) {
            return str;
        }
        QualitySelectItem qualitySelectItem = c0.liveUrlList.get(1);
        if (!TextUtils.isEmpty(qualitySelectItem.rtcLiveUrl) && qvs.d()) {
            str3 = Uri.encode(qualitySelectItem.rtcLiveUrl);
            str2 = "rtcLive";
        } else if (!TextUtils.isEmpty(qualitySelectItem.bfrtcUrl) && qvs.c()) {
            str3 = Uri.encode(qualitySelectItem.bfrtcUrl);
            str2 = "bfrtc";
        } else if (TextUtils.isEmpty(qualitySelectItem.artpUrl) || !qvs.b()) {
            str3 = Uri.encode(qualitySelectItem.flvUrl);
            str2 = "flv";
        } else {
            str3 = Uri.encode(qualitySelectItem.artpUrl);
            str2 = "artp";
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&livePlayUrl=" + str3 + "&liveUrlType=" + str2;
        }
        return str + "?livePlayUrl=" + str3 + "&liveUrlType=" + str2;
    }

    /* renamed from: j */
    public ShareContent b(Activity activity, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("b9daace3", new Object[]{this, activity, str, str2, str3, str4, new Boolean(z), str5, str6, str7, str8});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.title = "直播";
        shareContent.description = str;
        shareContent.imageUrl = str2;
        shareContent.shareScene = "talent";
        if (!TextUtils.isEmpty(str5)) {
            shareContent.url = str5;
        } else {
            if (z) {
                shareContent.url = u90.d(str3, str4);
            } else {
                shareContent.url = u90.f(str3, str4);
            }
            shareContent.url = u90.h(shareContent.url, "share");
        }
        String d = d(shareContent.url);
        shareContent.url = d;
        shareContent.url = n(d);
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDefault;
        shareContent.disableBackToClient = true;
        if (!TextUtils.isEmpty(str7)) {
            shareContent.businessId = str7;
            shareContent.templateId = "live";
        } else if (!TextUtils.isEmpty(str6)) {
            shareContent.businessId = "tblive_guard";
            shareContent.templateId = "weex";
            shareContent.templateParams = m(activity, z, str8);
        } else {
            shareContent.businessId = "zhibo";
            shareContent.templateId = "live";
        }
        shareContent.businessInfo = f(activity, str2);
        return shareContent;
    }

    public final void t(ShareContent shareContent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f220a0", new Object[]{this, shareContent, map});
            return;
        }
        String str = map.get(yj4.PARAM_SHARE_WEEX);
        if (shareContent != null && !TextUtils.isEmpty(str)) {
            shareContent.businessId = "taobaolive_fandom";
            shareContent.templateId = "weex";
            HashMap hashMap = new HashMap();
            hashMap.put("weexURL", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("width", "750");
            if (!TextUtils.isEmpty(map.get(yj4.PARAM_FANDOM_HOT_ITEMS))) {
                hashMap2.put("height", "" + ((Math.min(yqq.o(map.get(yj4.PARAM_FANDOM_HOT_ITEM_COUNT)) / 2, 8) * 492) + 854));
            } else {
                hashMap2.put("height", "855");
            }
            hashMap.put("weexCardSize", hashMap2);
            hashMap.put("useBroadcast", Boolean.TRUE);
            hashMap.put("shareInfo", h(map));
            shareContent.templateParams = hashMap;
        }
    }

    public final Map<String, String> f(Activity activity, String str) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b17391c", new Object[]{this, activity, str});
        }
        HashMap hashMap = new HashMap();
        VideoInfo c0 = up6.c0(vx9.d());
        if (!(c0 == null || (accountInfo = c0.broadCaster) == null)) {
            String str2 = accountInfo.headImg;
            ShareDo shareDo = c0.shareUrlDO;
            if (shareDo != null && !TextUtils.isEmpty(shareDo.iconUrl)) {
                str2 = c0.shareUrlDO.iconUrl;
            }
            String str3 = c0.broadCaster.accountName;
            ShareDo shareDo2 = c0.shareUrlDO;
            if (shareDo2 != null && !TextUtils.isEmpty(shareDo2.accountName)) {
                str3 = c0.shareUrlDO.accountName;
            }
            String str4 = c0.title;
            ShareDo shareDo3 = c0.shareUrlDO;
            if (shareDo3 != null && !TextUtils.isEmpty(shareDo3.title)) {
                str4 = c0.shareUrlDO.title;
            }
            hashMap.put("topLogo", str2);
            hashMap.put("topTitle", str3);
            hashMap.put("title", str4);
            int i = c0.status;
            if (i == 4) {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB1XCwanWmWBuNjy1XaXXXCbXXa-99-54.png");
            } else if (i == 1) {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB15pJ4fLiSBuNkSnhJXXbDcpXa-99-54.png");
            } else {
                hashMap.put("bottomLogo", "http://gw.alicdn.com/mt/TB1pFYLn1uSBuNjSsziXXbq8pXa-153-54.png");
            }
            if (!c0.enableHideWatchNums) {
                hashMap.put("bottomText", activity.getString(R.string.tb_impl_online_number, String.valueOf(uak.d(uak.f(c0)))));
            } else {
                hashMap.put("bottomText", i());
            }
            hashMap.put("descriptionImage", sbt.v());
        }
        return hashMap;
    }

    public final Map<String, Object> m(Activity activity, boolean z, String str) {
        ShareDo shareDo;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67c72e84", new Object[]{this, activity, new Boolean(z), str});
        }
        VideoInfo c0 = up6.c0(vx9.d());
        HashMap hashMap = new HashMap();
        if (!(c0 == null || (shareDo = c0.shareUrlDO) == null)) {
            hashMap.put("weexURL", shareDo.shareCardUrl);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("width", sbt.E());
            hashMap2.put("height", sbt.D());
            hashMap.put("weexCardSize", hashMap2);
            String string = activity.getString(R.string.tb_impl_online_number, String.valueOf(uak.f(c0)));
            if (c0.status == 0) {
                str2 = "living";
            } else {
                str2 = "replay";
            }
            hashMap.put("shareInfo", k(z, string, str2));
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("singleTarget", str);
            }
        }
        return hashMap;
    }

    public final boolean r(Context context, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97919a32", new Object[]{this, context, videoInfo})).booleanValue();
        }
        ShareDo shareDo = videoInfo.shareUrlDO;
        if (shareDo == null || !"openUrl".equals(shareDo.shareType)) {
            return false;
        }
        v2s.o().v().b(context, videoInfo.shareUrlDO.shareUrl, null);
        return true;
    }

    public final void s(Activity activity, Map<String, String> map, Map<String, String> map2) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e3b65f", new Object[]{this, activity, map, map2});
            return;
        }
        FandomInfo B = up6.B(vx9.d());
        if (B != null && (accountInfo = B.broadCaster) != null) {
            String str = accountInfo.headImg;
            String str2 = accountInfo.accountName;
            map.put("topLogo", str);
            map.put("topTitle", str2);
            map.put("title", map2.get(yj4.PARAM_SHARE_TITLE));
            map.put("bottomLogo", "http://gw.alicdn.com/mt/TB1XCwanWmWBuNjy1XaXXXCbXXa-99-54.png");
            if (!B.enableHideWatchNums) {
                map.put("bottomText", activity.getString(R.string.tb_impl_online_number, String.valueOf(B.hot)));
            } else {
                map.put("bottomText", i());
            }
            map.put("descriptionImage", sbt.v());
        }
    }

    public final Map<String, String> k(boolean z, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        String str7;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a62c1df", new Object[]{this, new Boolean(z), str, str2});
        }
        HashMap hashMap = new HashMap();
        VideoInfo c0 = up6.c0(vx9.d());
        joc u = v2s.o().u();
        if (u != null) {
            str3 = u.getHeadPicLink();
        } else {
            str3 = "https://img.alicdn.com/tfs/TB1_AKpfSf2gK0jSZFPXXXsopXa-400-400.png";
        }
        if (!(c0 == null || c0.broadCaster == null || c0.shareUrlDO == null)) {
            if (p(c0.newRoomType)) {
                hashMap.put("accountAvatar", c0.broadCaster.headImg);
                hashMap.put("accountName", c0.broadCaster.accountName);
                hashMap.put("accountId", c0.broadCaster.accountId);
                hashMap.put("coverImageSource", c0.coverImg);
                if (z) {
                    obj2 = "1";
                } else {
                    obj2 = "0";
                }
                hashMap.put("landscape", obj2);
                hashMap.put("liveId", c0.liveId);
                hashMap.put("liveTitle", c0.title);
                hashMap.put("livetype", str2);
                hashMap.put("userCount", str);
                hashMap.put("vrType", "" + c0.vrType);
                hashMap.put(yj4.PARAM_ELEVEN_LIVE_ID, c0.topic);
                hashMap.put("userAvatar", str3);
            } else {
                if (!TextUtils.isEmpty(c0.shareUrlDO.iconUrl)) {
                    str4 = c0.shareUrlDO.iconUrl;
                } else {
                    str4 = c0.broadCaster.headImg;
                }
                hashMap.put("accountAvatar", str4);
                if (!TextUtils.isEmpty(c0.shareUrlDO.accountName)) {
                    str5 = c0.shareUrlDO.accountName;
                } else {
                    str5 = c0.broadCaster.accountName;
                }
                hashMap.put("accountName", str5);
                hashMap.put("accountId", c0.broadCaster.accountId);
                if (!TextUtils.isEmpty(c0.shareUrlDO.bgImgUrl)) {
                    str6 = c0.shareUrlDO.bgImgUrl;
                } else {
                    str6 = c0.coverImg;
                }
                hashMap.put("coverImageSource", str6);
                if (z) {
                    obj = "1";
                } else {
                    obj = "0";
                }
                hashMap.put("landscape", obj);
                hashMap.put("liveId", c0.liveId);
                if (!TextUtils.isEmpty(c0.shareUrlDO.title)) {
                    str7 = c0.shareUrlDO.title;
                } else {
                    str7 = c0.title;
                }
                hashMap.put("liveTitle", str7);
                hashMap.put("livetype", str2);
                hashMap.put("userCount", str);
                hashMap.put("vrType", "" + c0.vrType);
                hashMap.put(yj4.PARAM_ELEVEN_LIVE_ID, c0.topic);
                hashMap.put("userAvatar", str3);
            }
        }
        return hashMap;
    }

    @Override // tb.dpd
    public void a(Activity activity, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z2;
        String str15;
        boolean z3;
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6c6fdb", new Object[]{this, activity, str, str2, str3, str4, str5, new Boolean(z), map});
        } else if (!up6.p0(vx9.d()) || map == null) {
            VideoInfo c0 = up6.c0(vx9.d());
            if (activity != null && c0 != null && c0.broadCaster != null && !r(activity, c0)) {
                ShareDo shareDo = c0.shareUrlDO;
                String str16 = null;
                if (shareDo != null) {
                    String str17 = !TextUtils.isEmpty(shareDo.shareCardUrl) ? c0.shareUrlDO.shareCardUrl : null;
                    if (!TextUtils.isEmpty(c0.shareUrlDO.bgImgUrl)) {
                        str6 = str17;
                        str7 = c0.shareUrlDO.bgImgUrl;
                    } else {
                        str7 = str3;
                        str6 = str17;
                    }
                } else {
                    str7 = str3;
                    str6 = null;
                }
                String l = l();
                if (map != null) {
                    str8 = ", content.url: ";
                    String str18 = map.get(yj4.PARAM_SJSD_ITEM_ID);
                    String str19 = map.get("livesource");
                    str11 = cwd.LOG_TAG;
                    String str20 = str19;
                    str12 = map.get("business_id");
                    str9 = ", content.templateId: ";
                    String str21 = map.get("singleTarget");
                    if (TextUtils.isEmpty(str12)) {
                        str12 = map.get("businessId");
                    }
                    if (!TextUtils.isEmpty(l)) {
                        if (!TextUtils.isEmpty(str18)) {
                            z3 = false;
                            l = e(l, yj4.PARAM_SJSD_ITEM_ID, str18, false);
                        } else {
                            z3 = false;
                        }
                        if (!TextUtils.isEmpty(str20)) {
                            l = e(l, "livesource", str20, z3);
                        }
                    }
                    str14 = map.get(ejp.LIVE_SHARE_ACTION_INFO_PARAMS);
                    str10 = str21;
                    str13 = map.get("liveShareUrlParams");
                } else {
                    str8 = ", content.url: ";
                    str11 = cwd.LOG_TAG;
                    str9 = ", content.templateId: ";
                    l = l;
                    str14 = null;
                    str13 = null;
                    str12 = null;
                    str10 = null;
                }
                String str22 = map != null ? map.get("desc") : null;
                if (pvs.r()) {
                    AccountInfo accountInfo = c0.broadCaster;
                    if (accountInfo != null) {
                        str15 = accountInfo.accountName;
                    } else {
                        str15 = "";
                    }
                    if (TextUtils.isEmpty(str22)) {
                        if (TextUtils.isEmpty(pvs.x2())) {
                            str22 = String.format("%1$s的直播简直有毒，快来看！\n%2$s", str15, c0.title);
                        } else {
                            str22 = String.format(pvs.x2(), str15, c0.title);
                        }
                        if (map != null) {
                            str16 = map.get("invite_code");
                        }
                        if (!TextUtils.isEmpty(str16)) {
                            str22 = str22 + "\n\n" + str16;
                        }
                    }
                }
                if (!pvs.r()) {
                    str22 = str2;
                }
                ShareContent j = b(activity, str22, str7, str4, str5, false, l, str6, str12, str10);
                if (!TextUtils.isEmpty(j.url)) {
                    if (!TextUtils.isEmpty(str13)) {
                        z2 = true;
                        j.url = e(j.url, "liveShareUrlParams", str13, true);
                    } else {
                        z2 = true;
                    }
                    if (!TextUtils.isEmpty(str14)) {
                        j.url = e(j.url, ejp.LIVE_SHARE_ACTION_INFO_PARAMS, str14, z2);
                    }
                }
                try {
                    TLog.loge(str11, "TLiveShareAdapter", "[share] content.businessId: " + j.businessId + str9 + j.templateId + str8 + j.url + ", content.businessInfo: " + JSON.toJSONString(j.businessInfo));
                } catch (Exception unused) {
                }
                ShareBusiness.share(activity, j, f16179a);
            }
        } else {
            String str23 = map.get(yj4.PARAM_SHARE_URL);
            String str24 = map.get("business_id");
            String str25 = map.get("liveShareUrlParams");
            String str26 = map.get(ejp.LIVE_SHARE_ACTION_INFO_PARAMS);
            if (TextUtils.isEmpty(str24)) {
                str24 = map.get("businessId");
            }
            ShareContent j2 = b(activity, str2, str3, str4, str5, false, str23, null, str24, null);
            if (!TextUtils.isEmpty(j2.url)) {
                if (!TextUtils.isEmpty(str25)) {
                    z4 = true;
                    j2.url = e(j2.url, "liveShareUrlParams", str25, true);
                } else {
                    z4 = true;
                }
                if (!TextUtils.isEmpty(str26)) {
                    j2.url = e(j2.url, ejp.LIVE_SHARE_ACTION_INFO_PARAMS, str26, z4);
                }
            }
            try {
                TLog.loge(cwd.LOG_TAG, "TLiveShareAdapter", "[share] content.businessId: " + j2.businessId + ", content.templateId: " + j2.templateId + ", content.url: " + j2.url + ", content.businessInfo: " + JSON.toJSONString(j2.businessInfo));
            } catch (Exception unused2) {
            }
            t(j2, map);
            s(activity, j2.businessInfo, map);
            ShareBusiness.share(activity, j2, f16179a);
        }
    }
}
