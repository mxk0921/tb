package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class owp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f25715a = null;
    public static Set<String> b = null;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final Set<String> d;
    public static final Set<String> e;

    static {
        t2o.a(589300080);
        HashSet hashSet = new HashSet();
        d = hashSet;
        HashSet hashSet2 = new HashSet();
        e = hashSet2;
        hashSet.add("mtop.ovs.setting.country.lang.get$1.0");
        hashSet.add("mtop.taobao.wireless.home.newface.awesome.newget$1.0");
        hashSet2.add("mtop.taobao.wireless.home.newface.awesome.newget$1.0");
        hashSet2.add("mtop.taobao.wireless.home.newface.stream.newget$1.0");
        hashSet2.add("mtop.ovs.setting.country.lang.get$1.0");
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5c9344b", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Set<String> set = b;
        if (set == null) {
            return ((HashSet) e).contains(str);
        }
        return set.contains(str);
    }

    public static void b(Context context) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c27348", new Object[]{context});
        } else if (c.compareAndSet(false, true) && SwitchConfig.getInstance().isSimpleLinkEnable(context)) {
            f25715a = new HashSet();
            if (SwitchConfig.getInstance().isABGlobalFeatureOpened(context, SwitchConfig.AB_SIGN_DEGRADED) && StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList)) {
                try {
                    f25715a.addAll(JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList, String.class));
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList error.", th);
                }
            }
            if (StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList2)) {
                try {
                    JSONArray parseArray = JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList2);
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        String string = jSONObject.getString("ab");
                        if (!TextUtils.isEmpty(string)) {
                            if (SwitchConfig.getInstance().isABGlobalFeatureOpened(context, "mtop_sign_degraded_" + string) && (jSONArray = jSONObject.getJSONArray("api")) != null && jSONArray.size() > 0) {
                                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                    String string2 = jSONArray.getString(i2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        f25715a.add(string2);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 error.", th2);
                }
            }
            if (StringUtils.isNotBlank(RemoteConfig.getInstance().cookieDisableApiList)) {
                try {
                    List parseArray2 = JSON.parseArray(RemoteConfig.getInstance().cookieDisableApiList, String.class);
                    HashSet hashSet = new HashSet();
                    b = hashSet;
                    hashSet.addAll(parseArray2);
                } catch (Throwable th3) {
                    TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseCookieDisableList]parse and update cookieDisableList error.", th3);
                }
            }
            TBSdkLog.e("mtopsdk.SignDegradedUtils", "[initSignDegradedList]signDegradedList=" + f25715a + ", cookieDisableList=" + b);
        }
    }

    public static boolean c(w4j w4jVar) {
        Object th;
        boolean z;
        String str;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f80785", new Object[]{w4jVar})).booleanValue();
        }
        if (w4jVar == null || w4jVar.g.isSignDegradedRetry) {
            return false;
        }
        if (((HashSet) d).contains(w4jVar.b.getKey())) {
            return true;
        }
        Set<String> set = f25715a;
        if (set != null) {
            return ((HashSet) set).contains(w4jVar.b.getKey());
        }
        try {
            d();
            if (SwitchConfig.getInstance().signDegradedApiSet != null) {
                String key = w4jVar.b.getKey();
                if (SwitchConfig.getInstance().signDegradedApiSet.contains("*")) {
                    z = true;
                } else {
                    z = SwitchConfig.getInstance().signDegradedApiSet.contains(key);
                }
            } else {
                z = false;
            }
            try {
                if (SwitchConfig.getInstance().isEnableSignDegraded() && z) {
                    z2 = true;
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = z;
                TBSdkLog.e("mtopsdk.SignDegradedUtils", w4jVar.h, "[isSignDegraded] error " + th);
                return z2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (z2) {
            return true;
        }
        e();
        if (SwitchConfig.getInstance().signDegradedApiSet2 != null) {
            for (mwp mwpVar : SwitchConfig.getInstance().signDegradedApiSet2) {
                if (TextUtils.isEmpty(mwpVar.c())) {
                    str = SwitchConfig.AB_SIGN_DEGRADED;
                } else {
                    str = "mtop_sign_degraded_" + mwpVar.c();
                }
                if (SwitchConfig.getInstance().isABGlobalFeatureOpened(w4jVar.f30449a.getMtopConfig().context, str) && (mwpVar.a("*") || mwpVar.a(w4jVar.b.getKey()))) {
                    return true;
                }
            }
        }
        return z2;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e812ea3", new Object[0]);
        } else if (SwitchConfig.getInstance().signDegradedApiSet == null && StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().signDegradedApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().signDegradedApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SignDegradedUtils", "[parseSignDegradedList]parse and update signDegradedApiList succeed");
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dfb51d", new Object[0]);
        } else if (SwitchConfig.getInstance().signDegradedApiSet2 == null && StringUtils.isNotBlank(RemoteConfig.getInstance().signDegradedApiList2)) {
            try {
                ArrayList arrayList = new ArrayList();
                org.json.JSONArray jSONArray = new org.json.JSONArray(RemoteConfig.getInstance().signDegradedApiList2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(mwp.b(jSONArray.getJSONObject(i)));
                }
                SwitchConfig.getInstance().signDegradedApiSet2 = new HashSet(arrayList);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SignDegradedUtils", "[parseSignDegradedList2]parse and update signDegradedApiList2 succeed");
            }
        }
    }
}
