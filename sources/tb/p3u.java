package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p3u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25861a = "openComponent";
    public static final String b = "FansClub";

    public static boolean b(TBLiveDataModel tBLiveDataModel, Context context) {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        List<String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fd18615", new Object[]{tBLiveDataModel, context})).booleanValue();
        }
        if (!nh4.R() || tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null || TextUtils.isEmpty(accountInfo.accountId) || (c = c(context)) == null || !c.contains(tBLiveDataModel.mVideoInfo.broadCaster.accountId)) {
            return false;
        }
        return true;
    }

    public static boolean f(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        VideoInfo.AdmireInfo admireInfo;
        AccountInfo.WidgetTip widgetTip;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6743b6f9", new Object[]{ux9Var, tBLiveDataModel})).booleanValue();
        }
        if (!nh4.R0() || up6.d0(ux9Var) == VideoStatus.VIDEO_TIMESHIFT_STATUS || tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null || (admireInfo = videoInfo.admireInfo) == null || admireInfo.contributionEnabled || (widgetTip = accountInfo.widgetTip) == null || !widgetTip.showWidgetTip || gnk.a().d(tBLiveDataModel) || giv.c().b()) {
            return false;
        }
        return true;
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5df87843", new Object[]{jSONObject});
        }
        String string = jSONObject.getString("activityKey");
        String string2 = jSONObject.getString("activityType");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("subFrom", (Object) "tblive_newPreLive_notify");
        jSONObject2.put("activityType", (Object) string2);
        jSONObject2.put("topicIds", (Object) string);
        jSONObject2.put("version", (Object) 1);
        jSONObject2.put("bindingPreCheck", (Object) Boolean.FALSE);
        jSONArray.add(jSONObject2);
        return jSONArray.toJSONString();
    }

    public static List<String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9086fa1", new Object[]{context});
        }
        return fkx.c(context.getSharedPreferences("taolive", 0).getString("shopWindowPrerenderList", ""), String.class);
    }

    public static void d(Context context, ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa858579", new Object[]{context, ux9Var, str, str2});
            return;
        }
        Uri build = Uri.parse(lvs.n()).buildUpon().appendQueryParameter("liveId", str).appendQueryParameter(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, str2).build();
        HashMap hashMap = new HashMap();
        hashMap.put("x", "0");
        hashMap.put("y", String.valueOf(0));
        hashMap.put("width", String.valueOf(-1));
        hashMap.put("height", String.valueOf(-1));
        hashMap.put("modal", "true");
        if (ux9Var instanceof t54) {
            IInteractiveProxy.h z0 = ((t54) ux9Var).z0();
            if (z0 != null) {
                o3s.d(b, "open fansClub page success");
                z0.f(z0.getActionAdapter().A(context), build.toString(), hashMap);
                return;
            }
            o3s.d(b, "open fansClub page fail, interactiveManager null");
            return;
        }
        o3s.d(b, "open fansClub page fail, FrameContext not CommonFrameContext");
    }

    public static void h(String str, ux9 ux9Var, String str2, AccountInfo.ComponentData componentData, Context context) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ceef36", new Object[]{str, ux9Var, str2, componentData, context});
        } else if (nh4.g0() && context != null && vc.a() && !vc.i(context) && context.getResources().getConfiguration().orientation == 2) {
            kiv.c(context, "请切换至竖屏状态添加桌面主播");
        } else if (f25861a.equals(str2) && componentData != null && !TextUtils.isEmpty(componentData.componentName)) {
            HashMap hashMap = new HashMap();
            hashMap.put("data", componentData.params);
            giv.d().a(componentData.componentName, hashMap);
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("componentName", "tblive-base-openWebview");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(rg0.JUMP_URL, (Object) str);
            jSONObject2.put("bannerTag", (Object) "widget");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("maxHeightRpx", (Object) "700");
            jSONObject3.put(hij.KEY_CORNER_RADIUS, (Object) "12");
            jSONObject2.put("options", (Object) jSONObject3);
            jSONObject.put("data", (Object) jSONObject2);
            if (ux9Var == null) {
                ux9Var = vx9.d();
            }
            if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
                z0.v("TBLiveWVPlugin.Event.openComponent", jSONObject);
            }
        }
    }

    static {
        t2o.a(295700141);
    }
}
