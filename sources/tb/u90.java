package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.business.InteractBusiness;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u90 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_CART_REQUEST_CODE = 10000;
    public static final int DETAIL_BULK_REQUEST_CODE = 20001;
    public static final int DETAIL_REQUEST_CODE = 20000;
    public static final String SCREENTYPE_HALF_PORTRAIT = "halfPortrait";
    public static final String SCREENTYPE_LANDSCAPE = "landscape";
    public static final String SCREENTYPE_PORTRAIT = "portrait";
    public static final int SKU_RESULT_ADDCART_SUCCESS = 1;
    public static final int SKU_RESULT_QUERAYDATA_FAIL = 8;

    static {
        t2o.a(779093335);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8400148", new Object[]{str});
        }
        if (pvs.M0() && up6.r0(vx9.d())) {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=a2141.23201685&source=taolive";
        } else if (iws.c()) {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=" + iws.e() + "&source=taolive";
        } else {
            return "https://market.m.taobao.com/app/mtb/app-rax-daren-page1/pages/index/index.html?disableNav=YES&userId=" + str + "&spm=a2141.8001249&source=taolive";
        }
    }

    public static String c(Context context, String str) {
        String str2;
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc8ec5cc", new Object[]{context, str});
        }
        FandomInfo B = up6.B(vx9.d());
        if (B == null || (accountInfo = B.broadCaster) == null) {
            str2 = "";
        } else {
            str2 = accountInfo.accountName;
        }
        if (TextUtils.isEmpty(pvs.k2())) {
            return context.getString(R.string.taolive_share_live, str2, str);
        }
        return String.format(pvs.k2(), str2);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5783867", new Object[]{str, str2});
        }
        String str3 = "https://huodong.m.taobao.com/act/talent/live.html?id=" + str + "&type=508&screenOrientation=landscape";
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + "&wh_cid=" + str2;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09b4e2", new Object[]{str});
        }
        return "https://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db54bd8", new Object[]{str, str2});
        }
        String str3 = "https://huodong.m.taobao.com/act/talent/live.html?id=" + str + "&type=508";
        if (TextUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + "&wh_cid=" + str2;
    }

    public static String g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c7dcec", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            str = uyv.HTTPS_SCHEMA.concat(str);
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        if (str.contains("?" + str2 + "=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2 + "=" + str3;
        }
        return str + "?" + str2 + "=" + str3;
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb19a9ba", new Object[]{str, str2});
        }
        return g(str, "livesource", str2);
    }

    public static void i(Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e965d856", new Object[]{activity, liveItem, str, hashMap});
        } else if (liveItem != null) {
            ux9 d = vx9.d();
            String valueOf = String.valueOf(liveItem.itemId);
            rbu.k(d, "showDetail", "", valueOf, "itemId=" + liveItem.itemId);
            j(activity, liveItem, str, hashMap);
        }
    }

    public static void j(Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d3ce21", new Object[]{activity, liveItem, str, hashMap});
            return;
        }
        gq0.a().c(vx9.c(), activity, liveItem, str, hashMap);
        uo8.f(vx9.d(), to8.GOTO_DETAIL, liveItem != null ? liveItem.itemId : 0L);
        if (!TextUtils.isEmpty(str)) {
            boolean h = yqq.h(liveItem.extendVal.isBulk);
            ux9 d = vx9.d();
            long j = liveItem.itemId;
            String str3 = liveItem.clickSource;
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext != null) {
                str2 = ext.tradeParams;
            } else {
                str2 = "";
            }
            rbu.U(d, str, j, str3, h, str2, hashMap);
        }
        if (!up6.x0(vx9.c())) {
            umr.b(liveItem.itemUrl);
        }
        sjr.g().c("com.taobao.taolive.room.gotoDetail", Long.valueOf(liveItem.itemId), vx9.e());
        rbu.f0(vx9.d());
        rbu.k0(vx9.d());
        if (v2s.o().E() != null && pvs.X()) {
            v2s.o().E().updateNextPageUtParam(twm.a(liveItem));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", liveItem.itemUrl);
        hashMap2.put("itemH5TaokeUrl", liveItem.itemH5TaokeUrl);
        hashMap2.put("itemId", liveItem.itemId + "");
        rbu.K(vx9.d(), "gotoDetailForTaoke", hashMap2);
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a32c92", new Object[]{context, str});
            return;
        }
        gq0.a().b(context, str);
        sjr.g().c("com.taobao.taolive.room.gotoShop", str, vx9.e());
    }

    public static String l(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cb2245", new Object[]{str, str2, str3});
        }
        String queryParameter = Uri.parse(str).getQueryParameter(str2);
        if (!TextUtils.isEmpty(queryParameter)) {
            return str.replace(str2 + "=" + queryParameter, str2 + "=" + str3);
        } else if (str.contains("?")) {
            return str + "&" + str2 + "=" + str3;
        } else {
            return str + "?" + str2 + "=" + str3;
        }
    }

    public static void m(Activity activity, String str, String str2, String str3, String str4, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7467227a", new Object[]{activity, str, str2, str3, str4, new Boolean(z), map});
            return;
        }
        v2s.o().y().a(activity, "直播", str, str2, str3, str4, z, map);
        sjr.g().c("com.taobao.taolive.room.share.click", null, vx9.e());
    }

    public static void n(Activity activity, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c3ef99", new Object[]{activity, str, str2, str3, str4, map});
            return;
        }
        v2s.o().y().a(activity, "直播", str, str2, str3, null, false, map);
        sjr.g().c("com.taobao.taolive.room.share.click", null, vx9.e());
    }

    public static void o(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb8e139", new Object[]{activity, new Boolean(z)});
        } else {
            p(activity, z, null);
        }
    }

    public static void a(Activity activity, int i, LiveItem liveItem, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb3a1aa", new Object[]{activity, new Integer(i), liveItem, hashMap});
            return;
        }
        up6.E0(true, vx9.d());
        String str = "";
        if (liveItem != null) {
            ux9 d = vx9.d();
            String valueOf = String.valueOf(liveItem.itemId);
            rbu.k(d, to8.ADD_CART, str, valueOf, "itemId=" + liveItem.itemId);
        }
        gq0.a().a(vx9.c(), activity, liveItem, i, hashMap);
        uo8.f(vx9.d(), to8.ADD_CART, liveItem != null ? liveItem.itemId : 0L);
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null && c0.broadCaster != null) {
            String str2 = c0.topic;
            if (pvs.U2() && !TextUtils.isEmpty(str2)) {
                InteractBusiness.l(c0.liveId, c0.broadCaster.accountId, str2, 10010, null, null, null, e7w.i(null));
            }
            rbu.f0(vx9.d());
            ux9 d2 = vx9.d();
            long j = liveItem.itemId;
            String str3 = liveItem.clickSource;
            LiveItem.Ext ext = liveItem.extendVal;
            if (ext != null) {
                str = ext.tradeParams;
            }
            rbu.U(d2, z9u.CLICK_GOODS_BUY, j, str3, false, str, hashMap);
            sjr.g().c("com.taobao.taolive.room.addcarting", Long.valueOf(liveItem.itemId), vx9.e());
        }
    }

    public static void p(Activity activity, boolean z, Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e315412c", new Object[]{activity, new Boolean(z), map});
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            AccountInfo accountInfo = c0.broadCaster;
            String str2 = "";
            String str3 = accountInfo != null ? accountInfo.accountName : str2;
            String str4 = null;
            String str5 = map != null ? map.get("desc") : null;
            if (TextUtils.isEmpty(str5)) {
                if (TextUtils.isEmpty(pvs.x2())) {
                    str = activity.getString(R.string.taolive_share_live, str3, c0.title);
                } else {
                    str = String.format(pvs.x2(), str3, c0.title);
                }
                String str6 = map != null ? map.get("invite_code") : null;
                if (!TextUtils.isEmpty(str6)) {
                    str = str + "\n\n" + str6;
                }
            } else {
                str = str5;
            }
            if (!z) {
                n(activity, str, c0.coverImg, c0.liveId, c0.topic, map);
            } else {
                m(activity, str, c0.coverImg, c0.liveId, c0.topic, true, map);
            }
            uo8.f(vx9.d(), "share", 0L);
            if (map != null) {
                str4 = map.get(yj4.PARAM_TRACK_LIVEOPRT_ID);
            }
            if (map != null) {
                str2 = map.get("sharelive_location");
            }
            rbu.L(vx9.d(), "ShareLive", "liveoprt_id=" + str4, "sharelive_location = " + str2);
            rbu.i(vx9.d(), "share", new String[0]);
        }
    }
}
