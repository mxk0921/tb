package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class rnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093384);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4981d2e1", new Object[]{str});
        }
        try {
            return new String(b(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cc7a14fe", new Object[]{str});
        }
        return Base64.decode(str.replace('.', '+').replace('_', wh6.DIR).replace('-', '='), 0);
    }

    public static boolean c(String str, ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c26302e4", new Object[]{str, arrayList})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || tz3.a(arrayList)) {
            return false;
        }
        Iterator<QualitySelectItem> it = arrayList.iterator();
        while (it.hasNext()) {
            QualitySelectItem next = it.next();
            if (next != null) {
                if (!TextUtils.isEmpty(next.rtcLiveUrl) && next.rtcLiveUrl.contains(str)) {
                    o3s.b("UriUtils", "checkUniPlayerLivePlayIsSame, rtcLiveUrl isSame");
                    return true;
                } else if (!TextUtils.isEmpty(next.flvUrl) && next.flvUrl.contains(str)) {
                    o3s.b("UriUtils", "checkUniPlayerLivePlayIsSame, flvUrl isSame");
                    return true;
                } else if (!TextUtils.isEmpty(next.hlsUrl) && next.hlsUrl.contains(str)) {
                    o3s.b("UriUtils", "checkUniPlayerLivePlayIsSame, hlsUrl isSame");
                    return true;
                }
            }
        }
        return false;
    }

    public static String d(String str, String str2) {
        Uri parse;
        JSONObject jSONObject;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8098f794", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            jSONObject = null;
        } else {
            jSONObject = fkx.d(str);
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String queryParameter = parse.getQueryParameter("huanduanParams");
        if (!TextUtils.isEmpty(queryParameter) && (split = queryParameter.split(",")) != null) {
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put(str3, (Object) parse.getQueryParameter(str3));
                }
            }
        }
        return jSONObject.toJSONString();
    }

    public static String h(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a211314", new Object[]{arrayList});
        }
        String str = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size > 0) {
            int i = size - 1;
            if (arrayList.get(i) != null) {
                if (arrayList.get(i).rtcLiveUrl != null) {
                    str = arrayList.get(i).rtcLiveUrl;
                }
                if (TextUtils.isEmpty(str) && arrayList.get(i).flvUrl != null) {
                    str = arrayList.get(i).flvUrl;
                }
            }
        }
        return g(str);
    }

    public static Map<String, String> e(Uri uri) {
        String str = yj4.PARAM_USER_TASK_JSON;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("62f97986", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null) {
            if (pvs.a()) {
                for (Iterator<String> it = uri.getQueryParameterNames().iterator(); it.hasNext(); it = it) {
                    String next = it.next();
                    hashMap.put(next, uri.getQueryParameter(next));
                    str = str;
                }
            }
            if (kyt.TMCS_PAY_SUCCESS_HOST.equals(uri.getHost())) {
                hashMap.put("id", uri.getQueryParameter(yj4.PARAM_ELEVEN_LIVE_ID));
            } else {
                String queryParameter = uri.getQueryParameter("id");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = uri.getQueryParameter(yj4.PARAM_ELEVEN_LIVE_ID);
                }
                String f = f(uri);
                hashMap.put(yj4.PARAM_IGNORE_PV, uri.getQueryParameter(yj4.PARAM_IGNORE_PV));
                if (f == null) {
                    f = "";
                }
                hashMap.put(yj4.PARAM_TRANSPARENT_PARAMS, f);
                hashMap.put("id", queryParameter);
                hashMap.put("userId", uri.getQueryParameter("userId"));
                hashMap.put("spm", uri.getQueryParameter("spm"));
                hashMap.put("scm", uri.getQueryParameter("scm"));
                hashMap.put("trackInfo", uri.getQueryParameter("trackInfo"));
                hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, uri.getQueryParameter(yj4.PARAM_TRACK_LIVEOPRT_ID));
                hashMap.put("clickid", uri.getQueryParameter("clickid"));
                hashMap.put(yj4.PARAM_FORCE_FULL_SCREEN, uri.getQueryParameter(yj4.PARAM_FORCE_FULL_SCREEN));
                hashMap.put("livesource", uri.getQueryParameter("livesource"));
                hashMap.put("itemid", uri.getQueryParameter("itemid"));
                hashMap.put(yj4.PARAM_TIMEMOVING_ITEM_ID, uri.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID));
                hashMap.put(yj4.PARAM_SJSD_ITEM_ID, uri.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID));
                hashMap.put(yj4.PARAM_HIDE_UI, uri.getQueryParameter(yj4.PARAM_HIDE_UI));
                hashMap.put(yj4.PARAM_HIDE_DYNAMIC, uri.getQueryParameter(yj4.PARAM_HIDE_DYNAMIC));
                hashMap.put(yj4.PARAM_HIDE_H5_DYNAMIC, uri.getQueryParameter(yj4.PARAM_HIDE_H5_DYNAMIC));
                hashMap.put(yj4.PARAM_FORCE_FANDOM, uri.getQueryParameter(yj4.PARAM_FORCE_FANDOM));
                hashMap.put(yj4.PARAM_VRPASS, uri.getQueryParameter(yj4.PARAM_VRPASS));
                hashMap.put("utLogMap", uri.getQueryParameter("utLogMap"));
                hashMap.put(yj4.PARAMS_LIVE_TRACKINFO, uri.getQueryParameter(yj4.PARAMS_LIVE_TRACKINFO));
                hashMap.put(yj4.PARAM_ACTIVITY_URL, uri.getQueryParameter(yj4.PARAM_ACTIVITY_URL));
                hashMap.put("renderType", uri.getQueryParameter("renderType"));
                hashMap.put(yj4.PARAM_ACTIVITY_POSITION, uri.getQueryParameter(yj4.PARAM_ACTIVITY_POSITION));
                hashMap.put(yj4.PARAM_SHOULD_OPEN_ONCE, uri.getQueryParameter(yj4.PARAM_SHOULD_OPEN_ONCE));
                hashMap.put("enterAnimation", uri.getQueryParameter("enterAnimation"));
                hashMap.put("exitAnimation", uri.getQueryParameter("exitAnimation"));
                hashMap.put("modal", uri.getQueryParameter("modal"));
                hashMap.put(yj4.PARAM_TIME_PLAY_URL, uri.getQueryParameter(yj4.PARAM_TIME_PLAY_URL));
                hashMap.put(yj4.PARAM_CUSTOM_PLAY_CTRL, uri.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL));
                hashMap.put(yj4.PARAM_GOOD_INFO_JSON, uri.getQueryParameter(yj4.PARAM_GOOD_INFO_JSON));
                hashMap.put(yj4.PARAM_BACKWARD_SWITCH, uri.getQueryParameter(yj4.PARAM_BACKWARD_SWITCH));
                hashMap.put(yj4.PARAM_BACKWARD_RETURN, uri.getQueryParameter(yj4.PARAM_BACKWARD_RETURN));
                hashMap.put(yj4.PARAM_INTENT_URL, uri.toString());
                hashMap.put(yj4.PARAM_MINILIVE_ENABLE_SHOW, uri.getQueryParameter(yj4.PARAM_MINILIVE_ENABLE_SHOW));
                hashMap.put(str, uri.getQueryParameter(str));
                hashMap.put(yj4.PARAM_FANDOM_INTERACTTYPE, uri.getQueryParameter(yj4.PARAM_FANDOM_INTERACTTYPE));
                hashMap.put(yj4.PARAM_PRODUCT_TYPE, uri.getQueryParameter(yj4.PARAM_PRODUCT_TYPE));
                hashMap.put(yj4.PARAM_NEED_RECOMMEND, uri.getQueryParameter(yj4.PARAM_NEED_RECOMMEND));
                hashMap.put(yj4.PARAM_TCP_OUTER_PARAM, uri.getQueryParameter(yj4.PARAM_TCP_OUTER_PARAM));
                hashMap.put(yj4.PARAM_COVER_GAUSS_SAMPLING, uri.getQueryParameter(yj4.PARAM_COVER_GAUSS_SAMPLING));
                hashMap.put(yj4.PARAM_COVER_GAUSS_RADIUS, uri.getQueryParameter(yj4.PARAM_COVER_GAUSS_RADIUS));
                hashMap.put(yj4.PARAM_ITEM_IDS, uri.getQueryParameter(yj4.PARAM_ITEM_IDS));
                hashMap.put(yj4.PARAM_ITEM_HOLD_TYPE, uri.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE));
                hashMap.put(yj4.PARAM_LIVE_IS_AD, uri.getQueryParameter(yj4.PARAM_LIVE_IS_AD));
                String shareFissionLiveShareActionInfoParams = d9m.g().getShareFissionLiveShareActionInfoParams();
                if (!TextUtils.isEmpty(shareFissionLiveShareActionInfoParams)) {
                    hashMap.put(shareFissionLiveShareActionInfoParams, uri.getQueryParameter(shareFissionLiveShareActionInfoParams));
                }
                hashMap.put("content", uri.getQueryParameter("content"));
                hashMap.put(iws.PARAM_LIVEHOME_SPM, uri.getQueryParameter(iws.PARAM_LIVEHOME_SPM));
                iba.f1(uri.getQueryParameter(yj4.PARAM_SERVER_PARAMS), vx9.f(vx9.d()));
            }
        }
        return hashMap;
    }

    public static String f(Uri uri) {
        JSONArray b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0c6bc42", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(yj4.PARAM_TRANSPARENT_KEY);
        if (TextUtils.isEmpty(queryParameter) || (b = fkx.b(queryParameter)) == null || b.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            String string = b.getString(i);
            if (!TextUtils.isEmpty(string)) {
                String queryParameter2 = uri.getQueryParameter(string);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    hashMap.put(string, queryParameter2);
                }
            }
        }
        return fkx.i(hashMap);
    }

    public static String g(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("903585f8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = new URI(str).getPath().split("/");
            if (split.length - 1 < 0) {
                return null;
            }
            String str2 = split[split.length - 1];
            if (str2 != null && (indexOf = str2.indexOf(".")) >= 0) {
                str2 = str2.substring(0, indexOf);
            }
            return (str2 == null || !str2.contains("transcode")) ? str2 : str2.substring(0, str2.indexOf("___transcode___"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
