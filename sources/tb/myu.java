package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.ut.device.UTDevice;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class myu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HD_ALLOW_DUPLICATE_KEY = "hdDuplicateControl";
    public static final String HD_APP_ID_KEY = "hdAppId";
    public static final String HD_INTERCEPT_URL_KEY = "hdInterceptUrl";
    public static final String HD_TINY_APP_CONFIG_KEY = "hdTinyAppConfig";
    public static final myu INSTANCE = new myu();
    public static final String TAG = "TBHDURLMatcher";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends TypeReference<Map<String, ? extends Object>> {
    }

    static {
        t2o.a(1031798830);
    }

    public final Map<String, Object> b(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4e7c96b", new Object[]{this, uri, map});
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (TextUtils.equals(ckf.p(uri.getHost(), uri.getPath()), entry.getKey())) {
                return (Map) JSON.parseObject(value, new a(), new Feature[0]);
            }
        }
        return null;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("919b1dd4", new Object[]{this})).booleanValue();
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("hudong_common_config", "intercept_enable", "false"));
    }

    public final Bundle f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("fbd8c9ea", new Object[]{this, map});
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public final Uri a(Uri uri, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("17ea26b3", new Object[]{this, uri, intent});
        }
        if (!ckf.b(uri.getHost(), "m.duanqu.com")) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        Map<String, String> e = jbl.INSTANCE.e();
        if (e == null || (str = e.get(queryParameter)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ckf.f(queryParameterNames, "originUri.queryParameterNames");
        for (String str2 : queryParameterNames) {
            String queryParameter2 = uri.getQueryParameter(str2);
            if (ckf.b(str2, "_ariver_appid")) {
                intent.putExtra(HD_APP_ID_KEY, queryParameter2);
            } else {
                buildUpon.appendQueryParameter(str2, queryParameter2);
                if (ckf.b(str2, "noDupCheck") && ckf.b(queryParameter2, "true")) {
                    intent.putExtra(HD_ALLOW_DUPLICATE_KEY, true);
                }
            }
        }
        Uri build = buildUpon.build();
        ckf.f(build, "builder.build()");
        return build;
    }

    public final boolean c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fed57d12", new Object[]{this, map})).booleanValue();
        }
        Object obj = map.get(xxl.PERCENT);
        Number number = obj instanceof Number ? (Number) obj : null;
        float floatValue = number == null ? 0.0f : number.floatValue();
        if (1.0E-4f > floatValue || floatValue > 1.0f) {
            return false;
        }
        if (floatValue == 1.0f) {
            return true;
        }
        String utdid = UTDevice.getUtdid(Globals.getApplication());
        return utdid != null && ((float) (Math.abs(utdid.hashCode()) % 10000)) < floatValue * ((float) 10000);
    }

    public final boolean d(Uri uri, Intent intent) {
        myu myuVar;
        Map<String, Object> b;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45052486", new Object[]{this, uri, intent})).booleanValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (!e()) {
            TLog.loge(TAG, "切流总开关关闭");
            return false;
        }
        Uri a2 = ckf.b(uri.getHost(), "m.duanqu.com") ? a(uri, intent) : uri;
        jbl jblVar = jbl.INSTANCE;
        String b2 = jblVar.b(a2);
        if (ckf.b(b2, "TINYAPP")) {
            Map<String, String> f = jblVar.f(a2);
            if (f != null && !f.isEmpty()) {
                if (ckf.b(uri.getQueryParameter("forceHudong"), "true")) {
                    intent.putExtra(HD_TINY_APP_CONFIG_KEY, f(f));
                    intent.putExtra(HD_INTERCEPT_URL_KEY, a2.toString());
                    return true;
                }
                Map<String, String> d = jblVar.d();
                if (!(d == null || (b = (myuVar = INSTANCE).b(a2, d)) == null || !myuVar.c(b))) {
                    intent.putExtra(HD_TINY_APP_CONFIG_KEY, myuVar.f(f));
                    intent.putExtra(HD_INTERCEPT_URL_KEY, a2.toString());
                    return true;
                }
            }
            return false;
        }
        if (ckf.b(b2, "WEB")) {
            Map<String, String> d2 = jblVar.d();
            if (d2 != null) {
                myu myuVar2 = INSTANCE;
                Map<String, Object> b3 = myuVar2.b(a2, d2);
                Boolean valueOf = b3 == null ? null : Boolean.valueOf(myuVar2.c(b3));
                if (valueOf != null) {
                    z = valueOf.booleanValue();
                }
            }
            if (z) {
                intent.putExtra(HD_INTERCEPT_URL_KEY, a2.toString());
            }
        }
        return z;
    }
}
