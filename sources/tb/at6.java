package tb;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.bzj;
import tb.py8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class at6 implements b6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLAG_CACHE = "1";
    public static final int SOURCE_FROM_CONTAINER_DEFAULT_CACHE = 0;
    public static final int SOURCE_FROM_CONTAINER_ONLY_NEW_TIME = 2;
    public static final int SOURCE_FROM_TAB_CACHE = 1;
    public JSONObject b;
    public JSONObject c;
    public JSONObject d;
    public final String e;
    public final Context f;
    public final boolean h;
    public JSONObject i;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AwesomeGetContainerData> f15984a = new ConcurrentHashMap(16);
    public final Object g = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f15985a;
        public final /* synthetic */ qmn b;

        public a(List list, qmn qmnVar) {
            this.f15985a = list;
            this.b = qmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                at6.a(at6.this, this.f15985a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends TypeReference<HashMap<String, String>> {
        public b(at6 at6Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15986a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AwesomeGetContainerInnerData c;

        public c(String str, String str2, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
            this.f15986a = str;
            this.b = str2;
            this.c = awesomeGetContainerInnerData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String b = ud9.a(at6.b(at6.this)).b();
            String str = this.f15986a;
            String str2 = this.b;
            File file = new File(b, str + "_" + str2 + ".dat");
            try {
                at6.c(at6.this, this.c);
            } catch (Throwable th) {
                i65.c("DataSource", "addGetTimeToArgs error. error is " + th);
            }
            try {
                zd9.d(file, JSON.toJSONBytes(at6.d(at6.this, this.f15986a, this.c), new SerializerFeature[0]));
            } catch (Exception e) {
                s3a.b("load cache file error", e);
            } catch (OutOfMemoryError unused) {
                s3a.d("load cache file error, out of memory.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15987a;
        public final /* synthetic */ JSONObject b;

        public d(String str, JSONObject jSONObject) {
            this.f15987a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String b = ud9.a(at6.b(at6.this)).b();
            String e = at6.e(at6.this);
            String str = this.f15987a;
            zd9.d(new File(b, e + "_" + str + ".dat"), JSON.toJSONBytes(this.b, new SerializerFeature[0]));
        }
    }

    static {
        t2o.a(487587857);
        t2o.a(487587863);
    }

    public at6(Context context, String str, boolean z) {
        this.f = context;
        this.e = str;
        this.h = z;
    }

    public static /* synthetic */ void a(at6 at6Var, List list, qmn qmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48a8e90", new Object[]{at6Var, list, qmnVar});
        } else {
            at6Var.t(list, qmnVar);
        }
    }

    public static /* synthetic */ Context b(at6 at6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee0d0b1", new Object[]{at6Var});
        }
        return at6Var.f;
    }

    public static /* synthetic */ void c(at6 at6Var, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474bf536", new Object[]{at6Var, awesomeGetContainerInnerData});
        } else {
            at6Var.g(awesomeGetContainerInnerData);
        }
    }

    public static /* synthetic */ AwesomeGetContainerInnerData d(at6 at6Var, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("3fa12c2b", new Object[]{at6Var, str, awesomeGetContainerInnerData});
        }
        return at6Var.j(str, awesomeGetContainerInnerData);
    }

    public static /* synthetic */ String e(at6 at6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7617ee4", new Object[]{at6Var});
        }
        return at6Var.e;
    }

    public void A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ccc2df", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.d = jSONObject;
        i(jSONObject, "global");
    }

    public final void B(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388dd6f9", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.getPageParams() != null) {
            awesomeGetContainerInnerData.getPageParams().setRequestInAdvance(4);
        }
    }

    public void C(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f170db9", new Object[]{this, str, awesomeGetContainerInnerData, new Boolean(z)});
        } else {
            D(false, str, awesomeGetContainerInnerData, 0, z);
        }
    }

    public void E(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f699430a", new Object[]{this, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else {
            F(false, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2);
        }
    }

    public void F(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6958bc5e", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else if (z || ((ConcurrentHashMap) this.f15984a).get(str) == null || ((AwesomeGetContainerData) ((ConcurrentHashMap) this.f15984a).get(str)).getDelta() != awesomeGetContainerInnerData) {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.setCacheTime(w(System.currentTimeMillis()));
                awesomeGetContainerInnerData.setDataCacheTime(w(System.currentTimeMillis()));
            }
            l(str).setDelta(awesomeGetContainerInnerData);
            if (awesomeGetContainerInnerData2 != null) {
                h(awesomeGetContainerInnerData2, str, "delta");
            }
        }
    }

    public void G(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f60c9fb", new Object[]{this, str, list});
        } else {
            l(str).setTotalData(list);
        }
    }

    public void H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef4a04a", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.i = jSONObject;
        i(jSONObject, "ext");
    }

    public final void f(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddcfee", new Object[]{this, awesomeGetContainerInnerData, str});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.getSections() != null && !awesomeGetContainerInnerData.getSections().isEmpty()) {
            for (SectionModel sectionModel : awesomeGetContainerInnerData.getSections()) {
                if (ao4.c(str)) {
                    sectionModel.put("isTracked", (Object) Boolean.TRUE);
                }
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put(jtv.S_ARGS_IS_CLIENT_CACHE, (Object) "1");
                }
            }
        }
    }

    public final void g(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b0a90f", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.getSections() != null && !awesomeGetContainerInnerData.getSections().isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (SectionModel sectionModel : awesomeGetContainerInnerData.getSections()) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put("clientGetDataTime", (Object) Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    @Override // tb.b6d
    public Map<String, String> getCurrentPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("816c6714", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(JSON.toJSONString(jSONObject), new b(this), new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.b6d
    public String getCurrentUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("518748b1", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return JSON.toJSONString(jSONObject);
        }
        return null;
    }

    @Override // tb.b6d
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return this.i;
    }

    public final void h(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a740d5f5", new Object[]{this, awesomeGetContainerInnerData, str, str2});
        } else if (awesomeGetContainerInnerData != null) {
            nt6.a().c(new c(str, str2, awesomeGetContainerInnerData));
        }
    }

    public final void i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9540842b", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            nt6.a().c(new d(str, jSONObject));
        }
    }

    public final AwesomeGetContainerInnerData j(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("58defc63", new Object[]{this, str, awesomeGetContainerInnerData});
        }
        if (!ao4.c(str)) {
            return awesomeGetContainerInnerData;
        }
        AwesomeGetContainerInnerData clone = awesomeGetContainerInnerData.clone();
        List<SectionModel> sections = clone.getSections();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sections.size(); i++) {
            SectionModel sectionModel = sections.get(i);
            if (q(sectionModel)) {
                arrayList.add(sectionModel);
            }
        }
        sections.removeAll(arrayList);
        return clone;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("96d48ab5", new Object[]{this, str});
        }
        return l(str).getBase();
    }

    public AwesomeGetContainerData l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("5668c186", new Object[]{this, str});
        }
        if (((ConcurrentHashMap) this.f15984a).get(str) == null) {
            synchronized (this.g) {
                try {
                    if (((ConcurrentHashMap) this.f15984a).get(str) == null) {
                        ((ConcurrentHashMap) this.f15984a).put(str, new AwesomeGetContainerData());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (AwesomeGetContainerData) ((ConcurrentHashMap) this.f15984a).get(str);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("ec6b55a", new Object[]{this, str});
        }
        return l(str).getDelta();
    }

    public List<SectionModel> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2615e4a", new Object[]{this, str});
        }
        return l(str).getDeltaData();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return this.e;
    }

    public List<SectionModel> p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9032c3e", new Object[]{this, str});
        }
        return l(str).getTotalData();
    }

    public final boolean q(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e30632", new Object[]{this, sectionModel})).booleanValue();
        }
        if (sectionModel == null) {
            return false;
        }
        String sectionBizCode = sectionModel.getSectionBizCode();
        if (TextUtils.isEmpty(sectionBizCode)) {
            return false;
        }
        return sectionBizCode.contains(lz7.DRESS_UP_BIZ_CODE);
    }

    public void s(List<String> list, boolean z, qmn qmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1a75b9", new Object[]{this, list, new Boolean(z), qmnVar});
            return;
        }
        ugh.b("DataSource", "start loadCache");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f15984a).get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                ((ConcurrentHashMap) this.f15984a).put(str, awesomeGetContainerData);
            }
            if (awesomeGetContainerData.getBaseData() != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == list.size()) {
            jrg.e("cacheProcess", "DataSource", "memory data");
            ((bzj.a) qmnVar).a(arrayList, null);
        } else if (z) {
            t(list, qmnVar);
        } else {
            nt6.a().c(new a(list, qmnVar));
        }
    }

    public final JSONObject v(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dd6cc65", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] c2 = zd9.c(file);
            if (c2 == null || c2.length <= 0) {
                return null;
            }
            return (JSONObject) JSON.parseObject(c2, JSONObject.class, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public long w(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef8b6b5", new Object[]{this, new Long(j)})).longValue();
        }
        return j + (SDKUtils.getTimeOffset() * 1000);
    }

    public void x(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc44be65", new Object[]{this, new Long(j), str});
            return;
        }
        py8.b.d("homepage_common", "homeBaseCacheTime" + str, j + "");
    }

    public void y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f58fbd", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b = jSONObject;
            i(jSONObject, "page");
        }
    }

    public void z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f4c0d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.c = jSONObject;
            i(jSONObject, BHRTaskConfigBase.TYPE_CONFIG_UT);
        }
    }

    public void D(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i, boolean z2) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770c020e", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i), new Boolean(z2)});
        } else if (z || ((ConcurrentHashMap) this.f15984a).get(str) == null || ((AwesomeGetContainerData) ((ConcurrentHashMap) this.f15984a).get(str)).getBase() != awesomeGetContainerInnerData) {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.setCacheTime(w(System.currentTimeMillis()));
                awesomeGetContainerInnerData.setDataCacheTime(w(System.currentTimeMillis()));
            }
            l(str).setBase(awesomeGetContainerInnerData);
            i65.c("DataSource", "net success, and call to refresh ui");
            if (awesomeGetContainerInnerData == null) {
                return;
            }
            if (awesomeGetContainerInnerData.getPageParams() == null || awesomeGetContainerInnerData.getPageParams().getPageNum() == 0) {
                if (z2) {
                    String str4 = "passParams_" + str;
                    if (awesomeGetContainerInnerData.getPassParams() == null) {
                        str3 = "";
                    } else {
                        str3 = JSON.toJSONString(awesomeGetContainerInnerData.getPassParams());
                    }
                    py8.b.d(cml.GATEWAY_SP_FILE, str4, str3);
                    x(awesomeGetContainerInnerData.getDataCacheTime(), str);
                }
                if (this.h || ot6.f()) {
                    str2 = "base";
                } else {
                    str2 = "base_Forigen";
                }
                if (i == 0) {
                    h(awesomeGetContainerInnerData, str, str2);
                } else if (i == 1) {
                    h(awesomeGetContainerInnerData, str, str2);
                }
            }
        }
    }

    public final AwesomeGetContainerInnerData r(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("b826899b", new Object[]{this, str});
        }
        try {
            byte[] a3 = zd9.a("awesome/container_" + str + q2s.JSON);
            if (a3 != null && a3.length > 0) {
                return (AwesomeGetContainerInnerData) JSON.parseObject(a3, AwesomeGetContainerInnerData.class, new Feature[0]);
            }
            if (!str.contains("recommend_home") || (a2 = zd9.a("awesome/container_recommend_home_main_1001.json")) == null || a2.length <= 0) {
                return null;
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
            i65.a("xingzed", "gateway2.0 default hit and cid=".concat(str));
            return awesomeGetContainerInnerData;
        } catch (Throwable unused) {
            ugh.b("gateway2-GatewayDataSource.loadAsset", str);
            return null;
        }
    }

    public final synchronized void t(List<String> list, qmn qmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b5de0", new Object[]{this, list, qmnVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String b2 = ud9.a(this.f).b();
        if (this.b == null) {
            this.b = v(new File(b2, this.e + "_page.dat"));
        }
        if (this.c == null) {
            this.c = v(new File(b2, this.e + "_ut.dat"));
        }
        if (this.d == null) {
            this.d = v(new File(b2, this.e + "_global.dat"));
        }
        if (this.i == null) {
            this.i = v(new File(b2, this.e + "_ext.dat"));
        }
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f15984a).get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                ((ConcurrentHashMap) this.f15984a).put(str, awesomeGetContainerData);
            }
            awesomeGetContainerData.setContainerId(str);
            if (awesomeGetContainerData.getBase() == null) {
                try {
                    Process.setThreadPriority(0);
                } catch (Throwable unused) {
                }
                String str2 = "base";
                if (!this.h && !ot6.f()) {
                    str2 = str2 + "_Forigen";
                }
                AwesomeGetContainerInnerData u = u(new File(b2, str + "_" + str2 + ".dat"));
                if (u == null) {
                    jrg.c("cacheProcess", "process_error", "网络缓存数据加载失败", "DataSource", "containerId : " + str);
                    u = r(str);
                }
                if (u != null) {
                    u.setCacheTime(0L);
                }
                if (u != null) {
                    if (awesomeGetContainerData.getBase() == null) {
                        awesomeGetContainerData.setBase(u);
                        B(u);
                        f(u, str);
                        awesomeGetContainerData.setTotalData(u.getSections());
                        i65.c("DataSource", "load cache success, and call to refresh ui");
                        jrg.e("cacheProcess", "DataSource", "load cache success, and call to refresh ui");
                    }
                    arrayList.add(str);
                } else {
                    jrg.c("cacheProcess", "process_error", "预置数据加载失败", "DataSource", "containerId : " + str);
                    arrayList2.add(str);
                }
            } else {
                arrayList.add(str);
            }
        }
        jrg.e("cacheProcess", "DataSource", "end loadCache");
        ((bzj.a) qmnVar).a(arrayList, arrayList2);
    }

    public final AwesomeGetContainerInnerData u(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("d0abd0e0", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] c2 = zd9.c(file);
            if (c2 == null || c2.length <= 0) {
                return null;
            }
            return (AwesomeGetContainerInnerData) JSON.parseObject(c2, AwesomeGetContainerInnerData.class, new Feature[0]);
        } catch (Throwable th) {
            s3a.b("loadFile error", th);
            ugh.b("gateway2-GatewayDataSource.loadFile", file.getAbsolutePath());
            return null;
        }
    }
}
