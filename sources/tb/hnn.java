package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hnn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VIDEO_SOURCE = "videoSource";
    public static final String KEY_VIDEO_TYPE = "videoType";
    public static final String VALUE_NORMAL_VIDEO = "normal";
    public static final String VALUE_TB_VIDEO_URL = "TBVideoUrl";
    public static final String VALUE_URL_VIDEO = "url";

    static {
        t2o.a(468714252);
    }

    public static MediaContentDetailData.Account c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Account) ipChange.ipc$dispatch("ef1e32a1", new Object[]{jSONObject});
        }
        MediaContentDetailData.Account account = new MediaContentDetailData.Account();
        if (jSONObject == null) {
            return account;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("basicData");
        try {
            if (jSONObject2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("accountData");
                if (jSONObject3 != null) {
                    account.name = jSONObject3.getString("name");
                    account.avatar = jSONObject3.getString("icon");
                    account.targetUrl = jSONObject3.getString("linkUrl");
                    account.keyName = jSONObject3.getString("keyName");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("follow");
                    if (jSONObject4 != null) {
                        account.followCountFmt = jSONObject4.getString("countFmt");
                    }
                }
                JSONObject jSONObject5 = jSONObject2.getJSONObject("interactData");
                if (jSONObject5 != null) {
                    String string = jSONObject5.getJSONObject("follow").getString("isSelected");
                    if ("y".equalsIgnoreCase(string)) {
                        account.followed = Boolean.TRUE;
                    } else if ("n".equalsIgnoreCase(string)) {
                        account.followed = Boolean.FALSE;
                    }
                }
            } else {
                JSONObject jSONObject6 = jSONObject.getJSONObject("newCard").getJSONObject("data").getJSONObject("mainPic").getJSONObject("page").getJSONObject("global").getJSONObject("itemData").getJSONObject("Account").getJSONObject("data");
                if (jSONObject6 != null) {
                    account.name = jSONObject6.getString("name");
                    account.avatar = jSONObject6.getString("icon");
                    account.targetUrl = jSONObject6.getString("linkUrl");
                    if (jz3.d()) {
                        account.iconExtraText = jSONObject6.getString("iconExtraText");
                    }
                    account.keyName = jSONObject6.getString("keyName");
                    String string2 = jSONObject6.getString("isSelected");
                    if ("true".equalsIgnoreCase(string2)) {
                        account.followed = Boolean.TRUE;
                    } else if ("false".equalsIgnoreCase(string2)) {
                        account.followed = Boolean.FALSE;
                    }
                }
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("extraData");
        if (jSONObject7 != null) {
            account.idStr = jSONObject7.getString("accountIdStr");
        }
        return account;
    }

    public static MediaContentDetailData.Content d(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData.Content) ipChange.ipc$dispatch("1d08cd2d", new Object[]{str, jSONObject, jSONObject2, jSONObject3, jSONObject4});
        }
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        content.id = str;
        if (jSONObject2 != null) {
            content.status = jSONObject2.getString("status");
            content.interactiveId = jSONObject2.getString("interactiveId");
            if (hn4.b()) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("blackScreenConfig");
                content.isValid = jSONObject5 == null;
                if (jSONObject5 != null) {
                    content.errorText = jSONObject5.getString("text");
                    content.errorUrl = jSONObject5.getString("iconUrl");
                    content.errorType = jSONObject5.getString("blackScreenType");
                    content.errorUtpairs = jSONObject5.getString("blackScreenUtpairs");
                }
            }
        }
        if (jSONObject4 != null) {
            try {
                JSONObject jSONObject6 = jSONObject4.getJSONObject("Description").getJSONObject("data");
                content.summary = jSONObject6.getString("summary");
                content.title = jSONObject6.getString("title");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (jSONObject3 != null) {
            try {
                JSONObject jSONObject7 = jSONObject3.getJSONObject("itemData").getJSONObject("Description").getJSONObject("data");
                content.summary = jSONObject7.getString("summary");
                content.title = jSONObject7.getString("title");
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (jSONObject != null) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("view");
            JSONObject jSONObject9 = jSONObject8.getJSONObject("mainMedia");
            if (jSONObject9 != null) {
                ArrayList arrayList = new ArrayList();
                if ("VIDEO".equals(jSONObject9.getString("type"))) {
                    JSONObject jSONObject10 = jSONObject9.getJSONObject("data").getJSONArray("data").getJSONObject(0);
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put("type", (Object) jSONObject9.getString("type"));
                    jSONObject11.put("resourceStr", (Object) jSONObject10.getString("videoResourceStr"));
                    jSONObject11.put("firstFrameUrl", (Object) jSONObject10.getString("videoThumbnailURL"));
                    jSONObject11.put("videoId", (Object) jSONObject10.getString("videoId"));
                    jSONObject11.put("url", (Object) jSONObject10.getString("url"));
                    String string = jSONObject10.getString("videoSource");
                    jSONObject11.put("videoSource", (Object) string);
                    JSONObject jSONObject12 = jSONObject9.getJSONObject("data");
                    JSONObject jSONObject13 = jSONObject12.getJSONObject("extra");
                    jSONObject11.put("duration", (Object) jSONObject13.getString("duration"));
                    jSONObject11.put("height", (Object) jSONObject13.getString("height"));
                    jSONObject11.put("width", (Object) jSONObject13.getString("width"));
                    String I = nwv.I(jSONObject12.getString(KEY_VIDEO_TYPE), "normal");
                    jSONObject11.put(KEY_VIDEO_TYPE, (Object) I);
                    arrayList.add(jSONObject11);
                    ir9.b("RecommendDataConvertHelper", "解析videoElement字段2 videoType:" + I + ",videoSource:" + string);
                }
                content.elements = arrayList;
            }
            JSONObject jSONObject14 = jSONObject8.getJSONObject("music");
            if (jSONObject14 != null && "music".equals(jSONObject14.getString("type"))) {
                content.musicInfoVO = (MediaContentDetailData.MusicInfoVO) JSON.toJavaObject(jSONObject14.getJSONObject("data"), MediaContentDetailData.MusicInfoVO.class);
            }
            JSONObject jSONObject15 = jSONObject8.getJSONObject("picAlbum");
            if (!(jSONObject15 == null || (jSONArray = jSONObject15.getJSONArray(bia.UNDER_TAKE_GOODS_LIST)) == null)) {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject16 = jSONArray.getJSONObject(i);
                    MediaContentDetailData.Pic pic = new MediaContentDetailData.Pic();
                    pic.width = jSONObject16.getString("width");
                    pic.height = jSONObject16.getString("height");
                    pic.type = jSONObject16.getString("type");
                    pic.url = jSONObject16.getString("url");
                    pic.picType = jSONObject16.getString("picType");
                    pic.videoResourceJsonObj = jSONObject16;
                    arrayList2.add(pic);
                }
                content.picAlbum = arrayList2;
            }
            JSONObject jSONObject17 = jSONObject8.getJSONObject("live");
            if (jSONObject17 != null) {
                ArrayList arrayList3 = new ArrayList();
                if ("live".equals(jSONObject17.getString("type"))) {
                    JSONObject jSONObject18 = jSONObject17.getJSONObject("data");
                    jSONObject18.put("type", (Object) jSONObject17.getString("type"));
                    arrayList3.add(jSONObject18);
                    content.coverUrl = jSONObject18.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
                }
                content.elements = arrayList3;
            }
            if (zyw.e()) {
                JSONObject jSONObject19 = jSONObject8.getJSONObject("game");
                if (!sz3.b(jSONObject19) && TextUtils.equals("ggGame", jSONObject19.getString("type"))) {
                    JSONObject jSONObject20 = jSONObject19.getJSONObject("data");
                    if (!sz3.b(jSONObject20)) {
                        content.material = (MediaContentDetailData.Material) JSON.toJavaObject(jSONObject20.getJSONObject("material"), MediaContentDetailData.Material.class);
                        ir9.b("RecommendDataConvertHelper", "[webcomponent]游戏卡片服务端返回数据：" + jSONObject20.toJSONString());
                    }
                }
            }
            if (ws6.e()) {
                JSONObject jSONObject21 = jSONObject8.getJSONObject("hotTopic");
                if (!sz3.b(jSONObject21)) {
                    content.isSecondPageUpBar = TextUtils.equals(c.LOCATION_SECOND, jSONObject21.getString("showBar"));
                }
            }
        }
        return content;
    }

    public static String g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5c5e4d", new Object[]{jSONObject});
        }
        return f(jSONObject, "videoThumbnailURL");
    }

    public static String h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e974fc26", new Object[]{jSONObject});
        }
        return f(jSONObject, "videoResourceStr");
    }

    public static MediaContentDetailData e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaContentDetailData) ipChange.ipc$dispatch("afca1394", new Object[]{jSONObject});
        }
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        if (jSONObject == null) {
            return mediaContentDetailData;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("detailInfo");
        JSONObject jSONObject4 = jSONObject.getJSONObject("extraData");
        JSONObject jSONObject5 = jSONObject.getJSONObject("args");
        int intValue = jSONObject.getIntValue("index");
        String string = jSONObject.getString("nid");
        String string2 = jSONObject.getString("subType");
        String string3 = jSONObject.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        mediaContentDetailData.index = intValue;
        mediaContentDetailData.utPairs = (Map) JSON.toJavaObject(jSONObject5, Map.class);
        if (jSONObject4 != null) {
            mediaContentDetailData.adParam = jSONObject4.getJSONObject("adParam");
            mediaContentDetailData.relativeIndex = jSONObject4.getIntValue("relativeIndex");
            mediaContentDetailData.playletInfo = (MediaContentDetailData.PlayletInfo) JSON.toJavaObject(jSONObject4.getJSONObject("playletInfo"), MediaContentDetailData.PlayletInfo.class);
            mediaContentDetailData.bginteractive = (MediaContentDetailData.BGInteractive) JSON.toJavaObject(jSONObject4.getJSONObject("bginteractive"), MediaContentDetailData.BGInteractive.class);
            mediaContentDetailData.businessExtraMap = jSONObject4.getJSONObject("businessExtraMap");
            mediaContentDetailData.topTitle = (MediaContentDetailData.TopTitle) JSON.toJavaObject(jSONObject4.getJSONObject("topAtmosphereBar"), MediaContentDetailData.TopTitle.class);
            mediaContentDetailData.contentAdParams = jSONObject4.getJSONObject("contentAdParams");
            mediaContentDetailData.contentPassParams = jSONObject4.getJSONObject(c4o.KEY_CONTENT_PASSPARAMS);
            JSONObject jSONObject6 = jSONObject4.getJSONObject("collectionData");
            mediaContentDetailData.collectionData = jSONObject6;
            if (jSONObject6 != null) {
                mediaContentDetailData.sequenceNumber = nwv.t(jSONObject6.get("index"), -1);
            }
            mediaContentDetailData.slideUpIncludeMultiCard = nwv.o(jSONObject4.getString("slideUpIncludeMultiCard"), false);
            mediaContentDetailData.slideUpTransparency = nwv.t(jSONObject4.getString("slideUpTransparency"), 10);
            int t = nwv.t(jSONObject4.getString("contentBottomGap"), 0);
            mediaContentDetailData.contentBottomGap = t;
            int a2 = f2k.a(t);
            mediaContentDetailData.progressBarBottomGapMore = a2;
            jSONObject4.put("contentBottomGapMore", (Object) Integer.valueOf(a2));
            try {
                JSONObject jSONObject7 = jSONObject4.getJSONObject("shareChannel");
                if (jSONObject7 != null) {
                    mediaContentDetailData.enableShareUpdate = nwv.o(jSONObject7.getBoolean("enableShareUpdate"), false);
                    mediaContentDetailData.shareIconUrl = nwv.I(jSONObject7.getString("icon"), "");
                }
            } catch (Throwable th2) {
                ir9.b("RecommendDataConvertHelper", "convertNewRecommendToDetail convert content shareChannel failed:" + th2.getMessage());
                th2.printStackTrace();
            }
        }
        JSONObject jSONObject8 = null;
        try {
            jSONObject2 = jSONObject.getJSONObject("basicData");
        } catch (Throwable th3) {
            th = th3;
            jSONObject2 = null;
        }
        try {
            if (jSONObject2 != null) {
                mediaContentDetailData.config = (MediaContentDetailData.Config) JSON.toJavaObject(jSONObject2.getJSONObject("config"), MediaContentDetailData.Config.class);
            } else {
                jSONObject8 = jSONObject.getJSONObject("newCard").getJSONObject("data").getJSONObject("mainPic").getJSONObject("page").getJSONObject("global");
                mediaContentDetailData.config = (MediaContentDetailData.Config) JSON.toJavaObject(jSONObject8.getJSONObject("globalData").getJSONObject("data").getJSONObject("config"), MediaContentDetailData.Config.class);
            }
        } catch (Throwable th4) {
            th = th4;
            ir9.b("RecommendDataConvertHelper", "convertNewRecommendToDetail convert content config failed:" + th.getMessage());
            th.printStackTrace();
            mediaContentDetailData.account = c(jSONObject);
            mediaContentDetailData.content = d(string, jSONObject3, jSONObject4, jSONObject8, jSONObject2);
            mediaContentDetailData.type = string2;
            mediaContentDetailData.cardType = string3;
            mediaContentDetailData.id = string;
            return mediaContentDetailData;
        }
        mediaContentDetailData.account = c(jSONObject);
        mediaContentDetailData.content = d(string, jSONObject3, jSONObject4, jSONObject8, jSONObject2);
        mediaContentDetailData.type = string2;
        mediaContentDetailData.cardType = string3;
        mediaContentDetailData.id = string;
        return mediaContentDetailData;
    }

    public static String f(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ab4d365", new Object[]{jSONObject, str});
        }
        if (TextUtils.isEmpty(str) || sz3.b(jSONObject)) {
            return null;
        }
        try {
            JSONArray d = vt6.d(jSONObject, "data", "sectionList");
            JSONObject jSONObject2 = ((d == null || d.isEmpty()) ? null : d.getJSONObject(0)).getJSONObject("detailInfo").getJSONObject("view").getJSONObject("mainMedia");
            if (jSONObject2 != null && "VIDEO".equals(jSONObject2.getString("type"))) {
                return jSONObject2.getJSONObject("data").getJSONArray("data").getJSONObject(0).getString(str);
            }
        } catch (Throwable th) {
            ir9.b("RecommendDataConvertHelper", str + "FromDetailNew failed:" + th.getMessage());
        }
        return null;
    }

    public static MediaMixContentDetail a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetail) ipChange.ipc$dispatch("ca4f02f9", new Object[]{jSONObject});
        }
        MediaMixContentDetail mediaMixContentDetail = new MediaMixContentDetail();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                mediaMixContentDetail.config = jSONObject2.getJSONObject("config");
                mediaMixContentDetail.transmission = jSONObject2.getJSONObject("passParams");
                mediaMixContentDetail.noMoreData = jSONObject2.getString("noMoreData");
                mediaMixContentDetail.noMoreMsg = jSONObject2.getString("noMoreMsg");
                mediaMixContentDetail.isBackUp = jSONObject2.getBooleanValue("isBackUp");
                mediaMixContentDetail.currentDataVersion = jSONObject2.getIntValue("currentDataVersion");
                mediaMixContentDetail.nextDataVersion = jSONObject2.getIntValue("nextDataVersion");
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject2.getJSONArray("sectionList");
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        MediaContentDetailData e = e(jSONArray.getJSONObject(i));
                        e.currentDataVersion = mediaMixContentDetail.currentDataVersion;
                        arrayList.add(e);
                    }
                }
                nz3.k(arrayList);
                mediaMixContentDetail.list = arrayList;
            } catch (Throwable th) {
                ir9.b("RecommendDataConvertHelper", "[dataRequest]convertNewRecommendToDetail convert new recommend to detail failed:" + th.getMessage() + " data:" + jSONObject.toJSONString());
                th.printStackTrace();
            }
        }
        return mediaMixContentDetail;
    }

    public static MediaMixContentDetailResponse b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("c3c6a9f2", new Object[]{jSONObject});
        }
        MediaMixContentDetailResponse mediaMixContentDetailResponse = new MediaMixContentDetailResponse();
        try {
            mediaMixContentDetailResponse.setApi(jSONObject.getString("api"));
            JSONArray jSONArray = jSONObject.getJSONArray(rb.RESULT_KEY);
            int size = jSONArray.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = jSONArray.getString(i);
            }
            mediaMixContentDetailResponse.setRet(strArr);
            mediaMixContentDetailResponse.setV(jSONObject.getString("v"));
            mediaMixContentDetailResponse.data = a(jSONObject);
        } catch (Throwable th) {
            ir9.b("RecommendDataConvertHelper", "[dataRequest]convertNewRecommendToDetailResponse convert new recommend to detail response failed:" + th.getMessage());
        }
        return mediaMixContentDetailResponse;
    }
}
