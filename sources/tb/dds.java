package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONArray f17747a;
    public static final dds INSTANCE = new dds();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(837812326);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.WEEX.ordinal()] = 1;
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 2;
            iArr[TMSSolutionType.WEB_SINGLE_PAGE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(837812325);
    }

    public final boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1f31da", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null || str.length() == 0 || ckf.b(str, "*") || ckf.b(str, str2)) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef5b801", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "url");
        Uri g = ies.g(str);
        if (g == null) {
            return false;
        }
        return d(g);
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d8614795", new Object[]{this});
        }
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get()) {
            return f17747a;
        }
        try {
            IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
            String customConfig = iConfigAdapter == null ? null : iConfigAdapter.getCustomConfig("themis_std_pop_embed_white_list", "");
            JSONArray parseArray = JSON.parseArray(customConfig);
            if (!(customConfig == null || customConfig.length() == 0)) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    f17747a = parseArray;
                }
                return f17747a;
            }
            return null;
        } catch (Exception e) {
            TMSLogger.c("TMSStdPopSwitchUtils", e.getMessage(), e);
            return null;
        }
    }

    public final boolean c(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c43c28e0", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("host");
        String string2 = jSONObject.getString("path");
        JSONObject jSONObject2 = jSONObject.getJSONObject("query");
        if (!(e(string, uri.getHost()) && e(string2, uri.getPath()))) {
            return false;
        }
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (!INSTANCE.e(entry.getValue().toString(), uri.getQueryParameter(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c500769a", new Object[]{this, uri})).booleanValue();
        }
        if (!uri.isHierarchical()) {
            String uri2 = uri.toString();
            ckf.f(uri2, "uri.toString()");
            vbs.u(uri2);
            return false;
        }
        TMSSolutionType type = TMSSolutionType.getType(uri);
        int i = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return false;
        }
        try {
            JSONArray a2 = a();
            if (a2 == null) {
                return false;
            }
            int size = a2.size();
            int i2 = 0;
            while (i2 < size) {
                i2++;
                JSONObject jSONObject = a2.getJSONObject(i2);
                ckf.f(jSONObject, "item");
                if (c(uri, jSONObject)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            TMSLogger.c("TMSStdPopSwitchUtils", e.getMessage(), e);
            return false;
        }
    }
}
