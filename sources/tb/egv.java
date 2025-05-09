package tb;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoRequest;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ISmartLandingProxy.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18569a;
        public final /* synthetic */ ux9 b;
        public final /* synthetic */ TBLiveDataModel c;

        public a(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
            this.f18569a = context;
            this.b = ux9Var;
            this.c = tBLiveDataModel;
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
        public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
            }
            x5t.d("UnImportantLiveInfoRequestUtil", "getComponentList onTaskActionListener popId " + str2 + " actionData " + jSONObject);
            String str3 = null;
            String string = jSONObject == null ? null : jSONObject.getString(yj4.PARAM_ITEM_HOLD_TYPE);
            String string2 = jSONObject == null ? null : jSONObject.getString(yj4.PARAM_ITEM_IDS);
            if (jSONObject != null) {
                str3 = jSONObject.getString(yj4.PARAM_SJSD_ITEM_ID);
            }
            egv.a(this.f18569a, this.b, this.c, false, string, string2, str3);
            return true;
        }
    }

    static {
        t2o.a(779092908);
    }

    public static /* synthetic */ void a(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c1a260", new Object[]{context, ux9Var, tBLiveDataModel, new Boolean(z), str, str2, str3});
        } else {
            p(context, ux9Var, tBLiveDataModel, z, str, str2, str3);
        }
    }

    public static void b(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c48c668", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.AtmosphereResourceReq atmosphereResourceReq = new UnImportantLiveInfoRequest.AtmosphereResourceReq();
            atmosphereResourceReq.liveId = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                atmosphereResourceReq.anchorId = accountInfo.accountId;
                atmosphereResourceReq.encryptAnchorId = accountInfo.encodeAccountId;
            }
            unImportantLiveInfoRequest.atmosphereResourceReq = atmosphereResourceReq;
        }
    }

    public static void c(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423365df", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.GrowthReq growthReq = new UnImportantLiveInfoRequest.GrowthReq();
            growthReq.liveId = videoInfo.liveId;
            growthReq.liveSource = up6.L(ux9Var);
            unImportantLiveInfoRequest.growthReq = growthReq;
        }
    }

    public static void d(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7082773c", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.IntimacyReq intimacyReq = new UnImportantLiveInfoRequest.IntimacyReq();
            intimacyReq.setBizCode("live");
            intimacyReq.setInvokeType("native");
            intimacyReq.setRoomType(videoInfo.roomType);
            intimacyReq.setSource(up6.L(ux9Var));
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                intimacyReq.setTargetUid(accountInfo.accountId);
                intimacyReq.setFollow(videoInfo.broadCaster.follow);
            }
            intimacyReq.setShowCodes("");
            intimacyReq.setLiveId(videoInfo.liveId);
            intimacyReq.setSpm(up6.U(ux9Var));
            intimacyReq.member = videoInfo.shopVip;
            intimacyReq.hasMember = videoInfo.shopHasVip;
            unImportantLiveInfoRequest.intimacyReq = intimacyReq;
        }
    }

    public static void h(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        cba G0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998bfbd1", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.ShareReq shareReq = new UnImportantLiveInfoRequest.ShareReq();
            shareReq.liveId = videoInfo.liveId;
            shareReq.anchorId = videoInfo.broadCaster.accountId;
            if (!giv.c().b() && (ux9Var instanceof air) && (G0 = ((air) ux9Var).j()) != null) {
                shareReq.liveSource = G0.k().q().L();
            }
            unImportantLiveInfoRequest.shareReq = shareReq;
        }
    }

    public static void j(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1687f495", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.TabInfoReq tabInfoReq = new UnImportantLiveInfoRequest.TabInfoReq();
            tabInfoReq.anchorId = videoInfo.broadCaster.accountId;
            tabInfoReq.liveId = videoInfo.liveId;
            tabInfoReq.useWelfareCenterEntry = "true";
            unImportantLiveInfoRequest.tabInfoReq = tabInfoReq;
        }
    }

    public static void k(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701029fb", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
            return;
        }
        UnImportantLiveInfoRequest.TrivialReq trivialReq = new UnImportantLiveInfoRequest.TrivialReq();
        unImportantLiveInfoRequest.trivialReq = trivialReq;
        trivialReq.liveId = videoInfo.liveId;
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo != null) {
            String str = accountInfo.encodeAccountId;
            trivialReq.creatorId = str;
            if (TextUtils.isEmpty(str)) {
                unImportantLiveInfoRequest.trivialReq.creatorId = videoInfo.broadCaster.accountId;
            }
        }
    }

    public static String l(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b612e7a2", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return "";
        }
        return videoInfo.dispatchItemID;
    }

    public static String m(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b503ff3", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
            return "";
        }
        return videoInfo.recExtParams;
    }

    public static Long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("7b2493b6", new Object[0]);
        }
        try {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = simpleDateFormat.format(Long.valueOf(date.getTime()));
            PrintStream printStream = System.out;
            printStream.println("当天日期" + format);
            return Long.valueOf(simpleDateFormat.parse(format).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static void o(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        cv1 f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5240c", new Object[]{context, ux9Var, tBLiveDataModel});
        } else if (!(ux9Var instanceof clo) || ((clo) ux9Var).t0() == null || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || (f = vx9.f(ux9Var)) == null || f.u == null || !pvs.J()) {
            p(context, ux9Var, tBLiveDataModel, true, null, null, null);
        } else {
            f.u.j(true, "goods", new a(context, ux9Var, tBLiveDataModel));
        }
    }

    public static void p(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb0cc26", new Object[]{context, ux9Var, tBLiveDataModel, new Boolean(z), str, str2, str3});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        UnImportantLiveInfoRequest unImportantLiveInfoRequest = new UnImportantLiveInfoRequest();
        k(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        e(context, ux9Var, tBLiveDataModel, unImportantLiveInfoRequest, videoInfo, z, str, str2, str3);
        g(context, ux9Var, unImportantLiveInfoRequest, videoInfo, tBLiveDataModel);
        f(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        h(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        b(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        j(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        i(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        c(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        d(context, ux9Var, unImportantLiveInfoRequest, videoInfo);
        fgv t0 = ((clo) ux9Var).t0();
        if (t0 != null) {
            t0.l(unImportantLiveInfoRequest);
        }
    }

    public static void f(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dc1e50", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.MessReq messReq = new UnImportantLiveInfoRequest.MessReq();
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                messReq.creatorId = accountInfo.accountId;
            }
            messReq.liveId = videoInfo.liveId;
            messReq.type = "sponsor,timerInteractive4NeoProtocol,broadcasterScore,activity,liveHeadBanner,visitorIdentity,hasLive";
            messReq.serviceVersion = j5m.API_VERSION;
            if (up6.c0(ux9Var) != null && up6.c0(ux9Var).extraBizType == 1) {
                messReq.type += ",auction";
            }
            unImportantLiveInfoRequest.messReq = messReq;
        }
    }

    public static void i(Context context, ux9 ux9Var, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3000a3", new Object[]{context, ux9Var, unImportantLiveInfoRequest, videoInfo});
        } else if (ux9Var != null) {
            UnImportantLiveInfoRequest.SlideReq slideReq = new UnImportantLiveInfoRequest.SlideReq();
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                slideReq.anchorId = accountInfo.accountId;
                slideReq.liveId = videoInfo.liveId;
                slideReq.entryLiveId = up6.q(ux9Var);
                slideReq.liveSource = up6.v(ux9Var);
                slideReq.entryLiveSource = up6.r(ux9Var);
                slideReq.entrySpm = up6.w(ux9Var);
                slideReq.needRec = false;
                slideReq.tppParam = null;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("useWelfareCenterEntry", (Object) "true");
                String a2 = cgv.a(cgv.KEY_PREFERENCE_RESOURCE_ID);
                if (!zqq.a(a2)) {
                    JSONObject parseObject = JSON.parseObject(a2);
                    Long l = parseObject.getLong("saveTime");
                    String string = parseObject.getString("operatorId");
                    if (l.longValue() < n().longValue()) {
                        cgv.b(cgv.KEY_PREFERENCE_RESOURCE_ID, null);
                    } else {
                        jSONObject.put("expoResourseIds", (Object) string);
                    }
                }
                slideReq.extendParams = jSONObject.toJSONString();
            }
            unImportantLiveInfoRequest.slideReq = slideReq;
        }
    }

    public static void e(Context context, ux9 ux9Var, TBLiveDataModel tBLiveDataModel, UnImportantLiveInfoRequest unImportantLiveInfoRequest, VideoInfo videoInfo, boolean z, String str, String str2, String str3) {
        String str4;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480959e0", new Object[]{context, ux9Var, tBLiveDataModel, unImportantLiveInfoRequest, videoInfo, new Boolean(z), str, str2, str3});
        } else if (ux9Var != null && ux9Var.D() != null) {
            UnImportantLiveInfoRequest.ItemCardListReq itemCardListReq = new UnImportantLiveInfoRequest.ItemCardListReq();
            itemCardListReq.liveId = videoInfo.liveId;
            ArrayList<String> arrayList = videoInfo.interacts;
            if (arrayList != null && !arrayList.isEmpty()) {
                itemCardListReq.interacts = fkx.i(videoInfo.interacts);
            }
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                itemCardListReq.creatorId = accountInfo.accountId;
            }
            if (!(tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null)) {
                itemCardListReq.isHighlight = ubt.a(tBLiveDataModel.mVideoInfo, map.get(yj4.PARAM_SJSD_ITEM_ID), tBLiveDataModel.mInitParams.get("keyPointId")) != null;
            }
            if (z) {
                itemCardListReq.itemHoldType = videoInfo.itemHoldType;
                itemCardListReq.holdItemIds = videoInfo.holdItemIds;
                String str5 = ux9Var.D().get(yj4.PARAM_SJSD_ITEM_ID);
                if (!TextUtils.isEmpty(str5) && TextUtils.isEmpty(itemCardListReq.itemHoldType) && TextUtils.isEmpty(itemCardListReq.holdItemIds)) {
                    itemCardListReq.holdItemIds = str5;
                    itemCardListReq.itemHoldType = fgv.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            } else {
                itemCardListReq.itemHoldType = str;
                itemCardListReq.holdItemIds = str2;
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(itemCardListReq.itemHoldType) && TextUtils.isEmpty(itemCardListReq.holdItemIds)) {
                    itemCardListReq.holdItemIds = str3;
                    itemCardListReq.itemHoldType = fgv.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            }
            itemCardListReq.liveSource = up6.L(ux9Var);
            itemCardListReq.entryLiveSource = up6.r(ux9Var);
            itemCardListReq.needRecommendItem = vvs.b("goodlist", "enableRecSort", true);
            JSONObject jSONObject = videoInfo.itemTransferInfo;
            if (jSONObject == null) {
                str4 = "";
            } else {
                str4 = jSONObject.toJSONString();
            }
            itemCardListReq.itemTransferInfo = str4;
            if (nh4.r0()) {
                if (!DateUtils.isToday(t6t.d("new_user_zone_card_show_time"))) {
                    t6t.g("new_user_zone_card_show_count", 0);
                }
                itemCardListReq.todayExposureCount = String.valueOf(t6t.c("new_user_zone_card_show_count", 0));
            }
            unImportantLiveInfoRequest.itemCardListReq = itemCardListReq;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r8, tb.ux9 r9, com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoRequest r10, com.taobao.taolive.sdk.model.common.VideoInfo r11, com.taobao.taolive.sdk.model.TBLiveDataModel r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.egv.g(android.content.Context, tb.ux9, com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoRequest, com.taobao.taolive.sdk.model.common.VideoInfo, com.taobao.taolive.sdk.model.TBLiveDataModel):void");
    }
}
