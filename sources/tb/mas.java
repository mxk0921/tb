package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mas {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONArray f23895a;
    public static final mas INSTANCE = new mas();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(839909967);
    }

    public final boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1f31da", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null || str.length() == 0 || ckf.b(str, "*") || ckf.b(str, str2)) {
            return true;
        }
        return false;
    }

    public final JSONArray c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d8614795", new Object[]{this});
        }
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get()) {
            return f23895a;
        }
        try {
            IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
            String customConfig = iConfigAdapter == null ? null : iConfigAdapter.getCustomConfig("themis_fragment_white_list", "");
            JSONArray parseArray = JSON.parseArray(customConfig);
            if (!(customConfig == null || customConfig.length() == 0)) {
                f23895a = parseArray;
                atomicBoolean.set(true);
                return f23895a;
            }
            return null;
        } catch (Exception e) {
            TMSLogger.c("TMSFragmentSwitchUtils", e.getMessage(), e);
            return null;
        }
    }

    @JvmStatic
    public static final no8 d(Context context, Uri uri) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("e83ea153", new Object[]{context, uri});
        }
        ckf.g(context, "context");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        no8 no8Var = new no8("getUseHomeFragmentABV3", false, 0);
        try {
            JSONArray c = INSTANCE.c();
            if (c == null) {
                return no8Var;
            }
            int size = c.size();
            while (i < size) {
                i++;
                JSONObject jSONObject = c.getJSONObject(i);
                mas masVar = INSTANCE;
                ckf.f(jSONObject, "item");
                if (masVar.f(uri, jSONObject)) {
                    IpChange ipChange2 = h8s.$ipChange;
                    String string = jSONObject.getString("expBucket");
                    String string2 = jSONObject.getString("ctrlBucket");
                    ckf.f(string, "getString(\"expBucket\")");
                    ckf.f(string2, "getString(\"ctrlBucket\")");
                    return h8s.k(context, "getUseHomeFragmentABV3", "[-1,-1]", "[-1,-1]", string, string2, null, 64, null);
                }
            }
            return no8Var;
        } catch (Exception e) {
            TMSLogger.c("TMSFragmentSwitchUtils", e.getMessage(), e);
            return no8Var;
        }
    }

    @JvmStatic
    public static final boolean e(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0a1fea", new Object[]{uri, context})).booleanValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ckf.g(context, "context");
        if (u9h.c()) {
            return true;
        }
        if (!q9s.w0()) {
            return false;
        }
        if (q9s.n1()) {
            return d(context, uri).d();
        }
        if (!h8s.p(context).d()) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("_ariver_appid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return INSTANCE.b(queryParameter);
        }
        mas masVar = INSTANCE;
        String uri2 = uri.toString();
        ckf.f(uri2, "uri.toString()");
        return masVar.a(uri2);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9b4d6a", new Object[]{this, str})).booleanValue();
        }
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal("themis_white_list_config", "tms_fragment_pub_white_list", "");
            if (TextUtils.isEmpty(configByGroupAndNameFromLocal)) {
                return false;
            }
            ckf.f(configByGroupAndNameFromLocal, "config");
            ckf.d(str);
            return wsq.O(configByGroupAndNameFromLocal, str, false, 2, null);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean f(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7d6e7ce", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("host");
        String string2 = jSONObject.getString("path");
        JSONArray<Object> jSONArray = jSONObject.getJSONArray("query");
        if (!(g(string, uri.getHost()) && g(string2, uri.getPath()))) {
            return false;
        }
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                List z0 = wsq.z0(obj.toString(), new String[]{"="}, false, 2, 2, null);
                if (!INSTANCE.g((String) z0.get(1), uri.getQueryParameter((String) z0.get(0)))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f02abc5", new Object[]{this, str})).booleanValue();
        }
        try {
            String configByGroupAndNameFromLocal = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndNameFromLocal("themis_white_list_config", "tms_fragment_url_white_list", "");
            if (TextUtils.isEmpty(configByGroupAndNameFromLocal)) {
                return false;
            }
            if (!ckf.b(configByGroupAndNameFromLocal, "*")) {
                ckf.f(configByGroupAndNameFromLocal, "config");
                List<String> split = new Regex(",").split(configByGroupAndNameFromLocal, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = i04.v0(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = yz3.i();
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        if (wsq.O(str, str2, false, 2, null)) {
                        }
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
