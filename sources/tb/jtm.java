package tb;

import android.app.Application;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.irm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jtm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, irm> f22202a = new LruCache<>(10);
    public final Map<String, String> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jtm f22203a = new jtm();

        static {
            t2o.a(912262211);
        }

        public static /* synthetic */ jtm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jtm) ipChange.ipc$dispatch("6396415c", new Object[0]);
            }
            return f22203a;
        }
    }

    static {
        t2o.a(912262210);
    }

    public static jtm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jtm) ipChange.ipc$dispatch("dd71f577", new Object[0]);
        }
        return a.a();
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32106a41", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) ((ConcurrentHashMap) this.b).get(str);
    }

    public irm c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irm) ipChange.ipc$dispatch("7675e9ff", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f22202a.get(str);
    }

    public JSONObject d(String str) {
        irm c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cc73c476", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (c = c(str)) != null) {
            return c.b();
        }
        return null;
    }

    public final void e(JSONObject jSONObject, boolean z, String str) {
        List<SimpleEntry<String, Integer>> d;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a6086a", new Object[]{this, jSONObject, new Boolean(z), str});
            return;
        }
        Application a2 = o91.a();
        if (!(jSONObject == null || TextUtils.isEmpty(str) || !rua.g(a2, jSONObject) || (d = rua.d(jSONObject, z)) == null)) {
            int size = d.size();
            for (int i = 0; i < size; i++) {
                SimpleEntry<String, Integer> simpleEntry = d.get(i);
                if (simpleEntry != null) {
                    str2 = simpleEntry.getKey();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    cg2.r(str, str2, simpleEntry.getValue().intValue(), rua.b(a2, null, jSONObject));
                }
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b591b", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            List<String> a2 = mtm.a(jSONObject);
            String c = mtm.c(jSONObject);
            if (a2 != null) {
                for (String str : a2) {
                    mpe.s(str, 480, 480, true, mpe.h(TaobaoImageUrlStrategy.ImageQuality.q30));
                }
            }
            mpe.t(c, true);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a4a638", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f22202a.remove(str);
            ((ConcurrentHashMap) this.b).remove(str);
        }
    }

    public void i(MtopResponse mtopResponse, List<wrm> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03c7b", new Object[]{this, mtopResponse, list});
        } else {
            j(mtopResponse, list, false);
        }
    }

    public void j(MtopResponse mtopResponse, List<wrm> list, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6805b9", new Object[]{this, mtopResponse, list, new Boolean(z)});
        } else if (mtopResponse != null) {
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                originFastJsonObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            }
            if (originFastJsonObject == null) {
                bw7.a(-200001, "预加载请求返回数据为空");
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null) {
                bw7.a(-200001, "预加载请求返回数据为空");
            } else if (z) {
                if (!DataUtils.Z(originFastJsonObject)) {
                    jSONObject.put("preload", (Object) Boolean.TRUE);
                }
                if (list == null || list.size() <= 0) {
                    str = "";
                } else {
                    str = list.get(0).b;
                }
                h(originFastJsonObject, str, mtopResponse, list, true);
            } else {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof JSONObject) {
                        String key = entry.getKey();
                        if (!TextUtils.isEmpty(key)) {
                            JSONObject jSONObject2 = (JSONObject) value;
                            if (DataUtils.Z(jSONObject2)) {
                                h(jSONObject2, key, mtopResponse, list, z);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(JSONObject jSONObject, String str, MtopResponse mtopResponse, List<wrm> list, boolean z) {
        wrm wrmVar;
        String str2;
        String str3;
        String str4;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7714a868", new Object[]{this, jSONObject, str, mtopResponse, list, new Boolean(z)});
            return;
        }
        JSONObject j = DynamicMergeUtils.j(jSONObject);
        if (DetailV3Converter.B(j)) {
            if (z) {
                qyh.a(j);
            }
            JSONObject g = DetailV3Converter.g(j);
            if (nj7.a().f26769a != 1 || !Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sClipLowDevicePreloadData))) {
                DataUtils.b(g);
            } else {
                DataUtils.c(g);
            }
            if (vbl.w()) {
                String a2 = mg1.Companion.a(g);
                if (!TextUtils.isEmpty(a2)) {
                    ((ConcurrentHashMap) this.b).put(str, a2);
                }
            }
            Iterator<wrm> it = list.iterator();
            while (true) {
                wrmVar = null;
                if (!it.hasNext()) {
                    str2 = "unKnow";
                    str3 = null;
                    str4 = TBBuyPreloadScene.NAV;
                    z2 = false;
                    break;
                }
                wrm next = it.next();
                if (TextUtils.equals(str, next.b)) {
                    str2 = next.d;
                    str4 = next.c;
                    z2 = next.e;
                    str3 = next.f;
                    break;
                }
            }
            if (TextUtils.equals(TBBuyPreloadScene.NAV, str4)) {
                f(jSONObject);
                e(jSONObject, z2, str3);
                DataUtils.d(jSONObject);
            }
            Iterator<wrm> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                wrm next2 = it2.next();
                if (next2.b.equals(str)) {
                    wrmVar = next2;
                    break;
                }
            }
            this.f22202a.put(str, new irm.b().g(jSONObject).i(str2).h(str4).f(mtopResponse.getHeaderFields()).k(wrmVar).e());
            tgh.b("PreloadTaskStore", "保存预加载数据, itemId=" + str);
        }
    }
}
