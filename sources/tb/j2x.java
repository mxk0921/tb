package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class j2x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f21731a = null;
    public static final List<String> b = Arrays.asList("heic.alicdn.com", "img.alicdn.com", "gw.alicdn.com", "picasso.alicdn.com");

    public static boolean needSampleWebp() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf071c27", new Object[0])).booleanValue();
        }
        wpw wpwVar = vpw.commonConfig;
        if (!wpwVar.J1) {
            return false;
        }
        Boolean bool = f21731a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (wpwVar.K1 > Math.random()) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f21731a = valueOf;
        return valueOf.booleanValue();
    }

    public static void commitWebpResource(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec49cec7", new Object[]{str, str2, new Integer(i)});
        } else if (needSampleWebp() && !isImageSpaceUrl(str) && !TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageUrl", str2);
                jSONObject.put("resourceUrl", str);
                jSONObject.put("coreType", i);
                y71.commitSuccess(y71.MONITOR_POINT_WEBP_RESOURCE, jSONObject.toString());
            } catch (JSONException e) {
                v7t.e("WebpSampleUtil", "commitWebpResource error", e, new Object[0]);
            }
        }
    }

    public static boolean isImageSpaceUrl(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4df30f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
            v7t.d("WebpSampleUtil", "url parse fail");
        }
        if (parse == null) {
            return false;
        }
        for (String str2 : b) {
            if (TextUtils.equals(str2, parse.getHost())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWebpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee49a57e", new Object[]{str})).booleanValue();
        }
        return str != null && str.endsWith(".webp");
    }

    static {
        t2o.a(989856348);
    }
}
