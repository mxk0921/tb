package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h0 implements t9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f20334a = new HashMap<>();

    static {
        t2o.a(502267911);
        t2o.a(503316573);
    }

    @Override // tb.t9b
    public synchronized Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8141639c", new Object[]{this, str, obj});
        }
        Object b = m9h.b(str);
        if (b != null) {
            return b;
        }
        if (akt.p()) {
            Object obj2 = this.f20334a.get(str);
            if (obj2 != null) {
                return obj2;
            }
            Object c = c(str, obj);
            this.f20334a.put(str, c);
            return c;
        }
        return c(str, obj);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b4cf770", new Object[]{this})).booleanValue();
        }
        return "true".equals(vfs.g().e("tnode", "enableFixABNonKey", "true"));
    }

    public final Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("84c9cac", new Object[]{this, str, obj});
        }
        return d(str, obj);
    }

    public final Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4bd2689", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tnodeOsVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("tnodeBrand", Build.BRAND);
        hashMap.put("tnodeModel", Build.MODEL);
        hashMap.put("tnodeDevice", Build.DEVICE);
        IDeviceInfo i = od0.D().i();
        if (i != null) {
            hashMap.put("tnodeDeviceLevel", i.m(o.J()).get("deviceLevel"));
        }
        return hashMap;
    }

    public final Object d(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bc713751", new Object[]{this, str, obj});
        }
        String[] split = str.split("\\.");
        if (split.length == 1 && akt.p2("enableAppABTest", true)) {
            return Boolean.valueOf(t.a(o.J(), split[0]));
        }
        if (!(split.length == 3 || split.length == 2)) {
            return obj;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (split.length == 3) {
            str2 = split[2];
        } else {
            str2 = "";
        }
        VariationSet activate = UTABTest.activate(str3, str4, e(), null);
        if (activate != null) {
            long experimentId = activate.getExperimentId();
            long experimentReleaseId = activate.getExperimentReleaseId();
            long experimentBucketId = activate.getExperimentBucketId();
            qau.v("tab2", experimentId, experimentReleaseId, experimentBucketId);
            JSONObject jSONObject = new JSONObject();
            Variation variation = activate.getVariation(str2);
            if (variation != null || activate.size() <= 0) {
                if (variation != null && !TextUtils.isEmpty(variation.getValueAsString(""))) {
                    return variation.getValueAsString("");
                }
            } else if (b() && !TextUtils.isEmpty(str2)) {
                return obj;
            } else {
                for (Variation variation2 : activate) {
                    if (variation2 != null) {
                        jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                    }
                }
                jSONObject.put("experimentId", (Object) Long.valueOf(experimentId));
                jSONObject.put("experimentReleaseId", (Object) Long.valueOf(experimentReleaseId));
                jSONObject.put("experimentBucketId", (Object) Long.valueOf(experimentBucketId));
                return jSONObject;
            }
        }
        return obj;
    }
}
