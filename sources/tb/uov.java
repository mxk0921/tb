package tb;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.a;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uov INSTANCE = new uov();

    static {
        t2o.a(913309709);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d966351", new Object[]{this});
        }
        return "https://market.m.taobao.com/app/motu/tucaoba-web/web/index.html";
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return "tucaoba-android";
    }

    public final void c(Context context, Intent intent) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5185092b", new Object[]{this, context, intent});
            return;
        }
        ckf.g(context, "context");
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        String a2 = a();
        Uri data = intent.getData();
        String str3 = null;
        if (data != null) {
            str = data.getEncodedQuery();
        } else {
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            Uri data2 = intent.getData();
            if (data2 != null) {
                str2 = data2.getEncodedQuery();
            } else {
                str2 = null;
            }
            a2 = a2 + f7l.CONDITION_IF + str2;
        }
        Uri data3 = intent.getData();
        if (data3 != null) {
            str3 = data3.getEncodedFragment();
        }
        if (!ckf.b(str3, "")) {
            a2 = a2 + '#' + str3;
        }
        Nav.from(context).toUri(Uri.parse(a2));
    }

    public final void d(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58867ee9", new Object[]{this, context, intent});
            return;
        }
        ckf.g(context, "context");
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Uri data = intent.getData();
        String str = null;
        String encodedFragment = data != null ? data.getEncodedFragment() : null;
        Pair<String, String> i = encodedFragment != null ? INSTANCE.i(encodedFragment) : null;
        str = i != null ? i.getSecond() : null;
        Intent className = new Intent().setClassName(context.getPackageName(), "com.taobao.android.tucaoba.ondemand.EntryActivity");
        Uri data2 = intent.getData();
        if ((data2 != null ? data2.getEncodedFragment() : null) == null) {
            Uri data3 = intent.getData();
            if ((data3 != null ? data3.getEncodedQuery() : null) != null) {
                Uri data4 = intent.getData();
                if (data4 != null) {
                    str = data4.getEncodedQuery();
                }
            } else {
                str = "";
            }
        }
        className.putExtra(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, str);
        context.startActivity(className);
    }

    public final boolean e(Intent intent) {
        String str;
        String str2;
        Pair<String, String> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7203c830", new Object[]{this, intent})).booleanValue();
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Uri data = intent.getData();
        String str3 = null;
        if (data != null) {
            str = data.getEncodedFragment();
        } else {
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            Uri data2 = intent.getData();
            if (data2 != null) {
                str2 = data2.getEncodedFragment();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                pair = INSTANCE.i(str2);
            } else {
                pair = null;
            }
            if (pair != null) {
                str3 = pair.getFirst();
            }
            if (!ckf.b(str3, "/")) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 23) {
                activeNetwork = connectivityManager.getActiveNetwork();
                return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d55cbaf", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        bcq.a().g(context, false, "tucaobafeature");
        if (BundleInfoManager.instance().getDynamicFeatureInfo("tucaobafeature") == null) {
            return true;
        }
        ucq h = a.Companion.a().h();
        if (h == null) {
            return false;
        }
        if (h.f().contains("tucaobafeature")) {
            return true;
        }
        if (!h.f().contains("tucaobafeature")) {
            h.d(Arrays.asList("tucaobafeature"));
        }
        return false;
    }

    public final JSONObject h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3fd28717", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str, Feature.OrderedField);
        } catch (Exception e) {
            TLog.loge(b(), "parseStringToJsonObject error: ", e.toString());
            return null;
        }
    }

    public final Pair<String, String> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("55420f2f", new Object[]{this, str});
        }
        ckf.g(str, "str");
        if (!wsq.O(str, "?", false, 2, null)) {
            return new Pair<>(str, "");
        }
        return new Pair<>(wsq.O0(str, "?", null, 2, null), wsq.I0(str, "?", null, 2, null));
    }
}
