package tb;

import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.executor.response.AwesomeGetContainerData;
import com.taobao.gateway.executor.response.AwesomeGetContainerInnerData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cml {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_SP_FILE = "home_gateway";
    public static final String TYPE_BASE = "base";
    public static final String TYPE_DELTA = "delta";
    public JSONObject b;
    public JSONObject c;
    public String d;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AwesomeGetContainerData> f17154a = new ConcurrentHashMap(16);
    public final List<String> e = new ArrayList();

    static {
        t2o.a(729808921);
    }

    public cml(String str, List<String> list) {
        f(str, list);
    }

    public static /* synthetic */ void a(cml cmlVar, List list, s5h s5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1105a9f1", new Object[]{cmlVar, list, s5hVar});
        } else {
            cmlVar.h(list, s5hVar);
        }
    }

    public static /* synthetic */ String b(cml cmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57f4d0d7", new Object[]{cmlVar});
        }
        return cmlVar.d;
    }

    public AwesomeGetContainerData c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("9a35cd57", new Object[]{this, str});
        }
        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f17154a).get(str);
        if (awesomeGetContainerData != null) {
            return awesomeGetContainerData;
        }
        AwesomeGetContainerData awesomeGetContainerData2 = new AwesomeGetContainerData();
        ((ConcurrentHashMap) this.f17154a).put(str, awesomeGetContainerData2);
        return awesomeGetContainerData2;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this});
        }
        return this.c;
    }

    public final void f(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd599e92", new Object[]{this, str, list});
            return;
        }
        this.d = str;
        this.e.clear();
        this.e.addAll(list);
        if (!this.e.isEmpty()) {
            for (String str2 : this.e) {
                this.f17154a.put(str2, new AwesomeGetContainerData());
            }
        }
        JSONObject jSONObject = new JSONObject();
        this.c = jSONObject;
        jSONObject.put("homepage_version", (Object) "v5");
        JSONObject jSONObject2 = new JSONObject();
        this.b = jSONObject2;
        jSONObject2.put(tm2.HOME_BUCKETS, (Object) "tsp2189_11196_tsp2218_11203");
        this.b.put("resultVersion", (Object) "v5");
        this.b.put("homepage_bucket", (Object) "tsp2189_11196");
        this.b.put(eza.RANGER_BUCKETS_KEY, (Object) "tsp2189_11196_tsp2218_11203");
        this.b.put("containerId", (Object) "main");
        this.b.put("spm-cnt", (Object) "a2141.1.1.1");
    }

    public final JSONObject j(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dd6cc65", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] d = xd9.d(file);
            if (d == null || d.length <= 0) {
                return null;
            }
            return (JSONObject) JSON.parseObject(d, JSONObject.class, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AwesomeGetContainerInnerData g(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("6f0b03ea", new Object[]{this, str});
        }
        try {
            byte[] a3 = xd9.a("awesome/container_" + str + q2s.JSON);
            if (a3 != null && a3.length > 0) {
                return (AwesomeGetContainerInnerData) JSON.parseObject(a3, AwesomeGetContainerInnerData.class, new Feature[0]);
            }
            if (!str.contains("recommend_home") || (a2 = xd9.a("awesome/container_recommend_home_main_1001.json")) == null || a2.length <= 0) {
                return null;
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
            bqa.a("gateway.PageDataSource", "default hit and cid=".concat(str));
            return awesomeGetContainerInnerData;
        } catch (Throwable th) {
            bqa.b("gateway.PageDataSource", "loadAsset error", th);
            return null;
        }
    }

    public final AwesomeGetContainerInnerData i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("51d99eaf", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            phg.e(phg.MainCacheLoad);
            byte[] d = xd9.d(file);
            phg.d(phg.MainCacheLoad);
            if (d == null || d.length <= 0) {
                return null;
            }
            phg.b(phg.MainDataParse);
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(d, AwesomeGetContainerInnerData.class, new Feature[0]);
            phg.a(phg.MainDataParse);
            return awesomeGetContainerInnerData;
        } catch (Throwable th) {
            bqa.b("gateway.PageDataSource", "loadFile error", th);
            return null;
        }
    }

    public final void h(List<String> list, s5h s5hVar) {
        String str;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdee1f1", new Object[]{this, list, s5hVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String b = xd9.b(m0b.c());
        String str3 = this.d;
        File file = new File(b, str3 + "_page.dat");
        String str4 = this.d;
        File file2 = new File(b, str4 + "_ut.dat");
        String str5 = this.d;
        File file3 = new File(b, str5 + "_global.dat");
        phg.e(phg.SmallFileLoad);
        this.b = j(file);
        this.c = j(file2);
        j(file3);
        phg.d(phg.SmallFileLoad);
        for (String str6 : list) {
            if (!((ConcurrentHashMap) this.f17154a).containsKey(str6) || ((AwesomeGetContainerData) ((ConcurrentHashMap) this.f17154a).get(str6)).base == null) {
                try {
                    Process.setThreadPriority(i);
                } catch (Throwable unused) {
                }
                File file4 = new File(b, str6 + "_base.dat");
                new File(b, str6 + "_delta.dat");
                AwesomeGetContainerInnerData i2 = i(file4);
                if (i2 == null) {
                    hrg.c("cacheProcess", "process_error", "网关1.0缓存处理-网络缓存数据加载失败", "gateway.PageDataSource", "containerId : " + str6);
                    fau.b(str6);
                    if (fau.a(str6)) {
                        str2 = "cacheProcess";
                        b = b;
                        str = "process_error";
                        ddv.h("GATEWAY_LOAD_CACHE", "1.0", "awesome_loadCacheFailed", "awesome_loadCacheFailed", "containerId", str6);
                    } else {
                        b = b;
                        str2 = "cacheProcess";
                        str = "process_error";
                    }
                    i2 = g(str6);
                } else {
                    b = b;
                    str2 = "cacheProcess";
                    str = "process_error";
                }
                if (i2 != null) {
                    i2.cacheTime = 0L;
                }
                if (i2 != null) {
                    if (((AwesomeGetContainerData) ((ConcurrentHashMap) this.f17154a).get(str6)).base == null) {
                        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f17154a).get(str6);
                        awesomeGetContainerData.base = i2;
                        awesomeGetContainerData.delta = null;
                        awesomeGetContainerData.totalSectionList = i2.sections;
                    }
                    arrayList.add(str6);
                } else {
                    hrg.c(str2, str, "网关1.0缓存处理-预置数据加载失败", "gateway.PageDataSource", "containerId : " + str6);
                    fau.c(str6);
                    if (fau.a(str6)) {
                        ddv.h("GATEWAY_LOAD_PRESET", "1.0", "awesome_loadPresetDataFailed", "awesome_loadPresetDataFailed", "containerId", str6);
                    }
                    arrayList2.add(str6);
                }
            } else {
                arrayList.add(str6);
                b = b;
            }
            i = 0;
        }
        s5hVar.a(arrayList, arrayList2);
    }
}
