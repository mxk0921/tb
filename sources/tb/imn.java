package tb;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class imn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_FROM_CONTAINER_DEFAULT_CACHE = 0;
    public static final int SOURCE_FROM_CONTAINER_ONLY_NEW_TIME = 2;
    public static final int SOURCE_FROM_TAB_CACHE = 1;
    public JSONObject b;
    public JSONObject c;
    public JSONObject d;
    public JSONObject e;
    public JSONObject f;
    public final String g;
    public final Context h;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AwesomeGetContainerData> f21430a = new ConcurrentHashMap(16);
    public final Object i = new Object();
    public final Object j = new Object();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final Map<String, Object> l = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21431a;

        public a(String str) {
            this.f21431a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.e("loadCache_loadParams");
            imn.b(imn.this, this.f21431a);
            phg.d("loadCache_loadParams");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21432a;
        public final /* synthetic */ String b;
        public final /* synthetic */ jmc c;

        public b(String str, String str2, jmc jmcVar) {
            this.f21432a = str;
            this.b = str2;
            this.c = jmcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.e("loadCache_loadContainerData_" + this.f21432a);
            imn.c(imn.this, this.b, this.f21432a, this.c);
            phg.d("loadCache_loadContainerData_" + this.f21432a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f21433a;
        public final /* synthetic */ pmn b;

        public c(List list, pmn pmnVar) {
            this.f21433a = list;
            this.b = pmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f0b.i().p("loadCacheAsync", 2);
            phg.e("loadCacheAsync");
            imn.d(imn.this, this.f21433a, this.b);
            phg.d("loadCacheAsync");
            f0b.i().c("loadCacheAsync");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21434a;
        public final /* synthetic */ AwesomeGetContainerInnerData b;
        public final /* synthetic */ String c;

        public d(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str2) {
            this.f21434a = str;
            this.b = awesomeGetContainerInnerData;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (p7p.k() && bve.p() && TextUtils.equals(this.f21434a, yyj.e().k()) && this.b.getPageParams() != null && this.b.getPageParams().getPageNum() == 0 && this.b.getPageParams().getRequestInAdvance() != 999) {
                ArrayList<SectionModel> arrayList = this.b.getSections() != null ? new ArrayList(this.b.getSections()) : null;
                if (arrayList != null && !arrayList.isEmpty()) {
                    z73.a();
                    for (SectionModel sectionModel : arrayList) {
                        z73.g(sectionModel);
                        if (bve.r()) {
                            z73.h(sectionModel);
                        }
                    }
                    bqa.d("RecmdDataSource", "save overlay data");
                }
            }
            imn imnVar = imn.this;
            String f = imn.f(imnVar, imn.e(imnVar));
            if (TextUtils.isEmpty(f)) {
                bqa.d("RecmdDataSource", "cacheFileData path is null");
                return;
            }
            String str = this.f21434a;
            String str2 = this.c;
            File file = new File(f, str + "_" + str2 + ".dat");
            try {
                imn.g(imn.this, this.b);
            } catch (Throwable th) {
                bqa.d("RecmdDataSource", "addGetTimeToArgs error. error is " + th);
            }
            try {
                ae9.d(file, dt2.e(this.f21434a, this.b));
            } catch (Exception e) {
                s3a.b("load cache file error", e);
            } catch (OutOfMemoryError unused) {
                s3a.d("load cache file error, out of memory.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21435a;
        public final /* synthetic */ JSONObject b;

        public e(String str, JSONObject jSONObject) {
            this.f21435a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            imn imnVar = imn.this;
            String f = imn.f(imnVar, imn.e(imnVar));
            if (TextUtils.isEmpty(f)) {
                bqa.d("RecmdDataSource", "cacheParams path is null");
                return;
            }
            String h = imn.h(imn.this);
            String str = this.f21435a;
            ae9.d(new File(f, h + "_" + str + ".dat"), JSON.toJSONBytes(this.b, new SerializerFeature[0]));
        }
    }

    static {
        t2o.a(729809690);
    }

    public imn(Context context, String str) {
        this.h = context;
        this.g = str;
    }

    public static /* synthetic */ void b(imn imnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964397cb", new Object[]{imnVar, str});
        } else {
            imnVar.U(str);
        }
    }

    public static /* synthetic */ boolean c(imn imnVar, String str, String str2, jmc jmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67aa6d10", new Object[]{imnVar, str, str2, jmcVar})).booleanValue();
        }
        return imnVar.P(str, str2, jmcVar);
    }

    public static /* synthetic */ void d(imn imnVar, List list, pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1684e62c", new Object[]{imnVar, list, pmnVar});
        } else {
            imnVar.O(list, pmnVar);
        }
    }

    public static /* synthetic */ Context e(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b0689dbc", new Object[]{imnVar});
        }
        return imnVar.h;
    }

    public static /* synthetic */ String f(imn imnVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa6ea5dd", new Object[]{imnVar, context});
        }
        return imnVar.F(context);
    }

    public static /* synthetic */ void g(imn imnVar, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc6544", new Object[]{imnVar, awesomeGetContainerInnerData});
        } else {
            imnVar.k(awesomeGetContainerInnerData);
        }
    }

    public static /* synthetic */ String h(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14ecd239", new Object[]{imnVar});
        }
        return imnVar.g;
    }

    public static void n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab9bb48", new Object[]{context});
            return;
        }
        bqa.d("RecmdDataSource", "clearHomeDiskCache");
        String str = yyj.l().b;
        String b2 = ud9.a(context).b();
        o(b2, str + "_page.dat");
        o(b2, str + "_ut.dat");
        o(b2, str + "_global.dat");
        o(b2, str + "_ext.dat");
        String k = yyj.e().k();
        String f = yyj.e().f();
        o(b2, k + "_base.dat");
        o(b2, f + "_base.dat");
    }

    public static void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de5a5ce", new Object[]{str, str2});
            return;
        }
        File file = new File(str, str2);
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            bqa.d("RecmdDataSource", "file delete error : " + str + " " + str2 + " " + e2.getMessage());
        }
    }

    public JSONObject A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3879745", new Object[]{this});
        }
        return this.d;
    }

    public Object C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6c6a5c6b", new Object[]{this, str});
        }
        Object obj = ((ConcurrentHashMap) this.l).get(str);
        if (obj == null) {
            synchronized (this.l) {
                try {
                    obj = ((ConcurrentHashMap) this.l).get(str);
                    if (obj == null) {
                        obj = new Object();
                        ((ConcurrentHashMap) this.l).put(str, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return this.g;
    }

    public JSONObject E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("800f9b6f", new Object[]{this, str});
        }
        try {
            AwesomeGetContainerInnerData q = q(str);
            if (q != null) {
                return q.passParams;
            }
            return JSON.parseObject(qy8.b.e(cml.GATEWAY_SP_FILE, "passParams_" + str, ""));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3152fa", new Object[]{this, context});
        }
        try {
            return ud9.a(context).b();
        } catch (Throwable th) {
            bqa.b("RecmdDataSource", "FileStore.from(context).getPath() error.", th);
            return null;
        }
    }

    public final int G(List<SectionModel> list, JSONObject jSONObject) {
        JSONArray jSONArray;
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c973dd19", new Object[]{this, list, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            jSONArray = null;
        } else {
            jSONArray = jSONObject.getJSONArray("jumpAnchor");
        }
        if (jSONArray != null && !jSONArray.isEmpty() && list != null && !list.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null && (f = kmn.f(next.toString(), list)) >= 0) {
                    return f + 1;
                }
            }
        }
        return 0;
    }

    public List<SectionModel> H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9032c3e", new Object[]{this, str});
        }
        return u(str).getTotalData();
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fe142b", new Object[]{this, str});
        } else if (!TextUtils.equals(str, yyj.e().k()) && !TextUtils.equals(str, yyj.e().f())) {
            String k = kmn.k(von.m(0));
            if (str != null && TextUtils.equals(k, str)) {
                gh0.j().g();
            }
            if (!TextUtils.isEmpty(str)) {
                gh0.j().h(str);
                gh0.j().l(true, str, null);
            }
        }
    }

    public boolean J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b6a7a3", new Object[]{this, str})).booleanValue();
        }
        return u(str).isBaseAbandoned();
    }

    public boolean K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ef1fb6", new Object[]{this, str})).booleanValue();
        }
        return u(str).isDeltaAbandoned();
    }

    public void M(List<String> list, pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6d05c8", new Object[]{this, list, pmnVar});
        } else if (V(list, pmnVar)) {
            g0(false);
            Coordinator.execute(new c(list, pmnVar));
        }
    }

    public void N(List<String> list, boolean z, jmc jmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb71edd", new Object[]{this, list, new Boolean(z), jmcVar});
            return;
        }
        String b2 = ud9.a(this.h).b();
        if (z) {
            new Thread(new a(b2), "homeCacheLoadParams").start();
        }
        for (String str : list) {
            new Thread(new b(str, b2, jmcVar), "homeCacheLoadContainerData").start();
        }
        hrg.e("cacheProcess", "RecmdDataSource", "end loadCache");
    }

    public final synchronized void O(List<String> list, pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6a60a7", new Object[]{this, list, pmnVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String b2 = ud9.a(this.h).b();
        U(b2);
        for (String str : list) {
            if (P(b2, str, null)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        hrg.e("cacheProcess", "RecmdDataSource", "end loadCache");
        pmnVar.a(arrayList, arrayList2);
    }

    public final boolean P(String str, String str2, jmc jmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d75fec86", new Object[]{this, str, str2, jmcVar})).booleanValue();
        }
        if (vxl.j()) {
            if (vxl.b().x()) {
                bqa.d("RecmdDataSource", "loadContainerDataWithMultiLock");
                return R(str, str2, jmcVar);
            }
            bqa.d("RecmdDataSource", "loadContainerDataMainLand");
            return Q(str, str2, jmcVar);
        } else if (vxl.a()) {
            bqa.d("RecmdDataSource", "loadContainerDataForeign");
            return R(str, str2, jmcVar);
        } else {
            bqa.d("RecmdDataSource", "loadContainerDataMainLand");
            return Q(str, str2, jmcVar);
        }
    }

    public final JSONObject T(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1dd6cc65", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] c2 = ae9.c(file);
            if (c2 == null || c2.length <= 0) {
                return null;
            }
            return (JSONObject) JSON.parseObject(c2, JSONObject.class, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d6cf9d", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            String str2 = this.g;
            this.b = T(new File(str, str2 + "_page.dat"));
        }
        if (this.c == null) {
            String str3 = this.g;
            this.c = T(new File(str, str3 + "_ut.dat"));
        }
        if (this.d == null) {
            String str4 = this.g;
            this.d = T(new File(str, str4 + "_global.dat"));
        }
        if (this.e == null) {
            String str5 = this.g;
            this.e = T(new File(str, str5 + "_ext.dat"));
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae41a8e", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            jSONObject.clear();
        }
    }

    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645017df", new Object[]{this, str});
        } else if (this.f != null && !TextUtils.isEmpty(str)) {
            this.f.remove(str);
        }
    }

    public void Y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f58fbd", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b = jSONObject;
            m(jSONObject, "page");
        }
    }

    public void Z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f4c0d", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.c = jSONObject;
            m(jSONObject, BHRTaskConfigBase.TYPE_CONFIG_UT);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6933ea3", new Object[]{this, str, str2});
            return;
        }
        AwesomeGetContainerData u = u(str);
        if (u != null && u.base != null) {
            u.abandonData();
            u.base.expireType = str2;
        }
    }

    public void a0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef4a04a", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.e = jSONObject;
        m(jSONObject, "ext");
    }

    public void b0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ccc2df", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.d = jSONObject;
        m(jSONObject, "global");
    }

    public void c0(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c5195", new Object[]{this, str, awesomeGetContainerInnerData});
        } else {
            f0(false, str, awesomeGetContainerInnerData, 0, false);
        }
    }

    public void d0(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90e93df", new Object[]{this, str, awesomeGetContainerInnerData, new Boolean(z)});
        } else {
            f0(false, str, awesomeGetContainerInnerData, 0, z);
        }
    }

    public void e0(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ce5fac", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i)});
        } else {
            f0(z, str, awesomeGetContainerInnerData, i, false);
        }
    }

    public synchronized void f0(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i, boolean z2) {
        AwesomeGetPageData awesomeGetPageData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fe48a8", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i), new Boolean(z2)});
            return;
        }
        if (z || ((ConcurrentHashMap) this.f21430a).get(str) == null || ((AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str)).base != awesomeGetContainerInnerData) {
            if (awesomeGetContainerInnerData != null) {
                long l = s5a.l(System.currentTimeMillis());
                awesomeGetContainerInnerData.cacheTime = l;
                awesomeGetContainerInnerData.dataCacheTime = l;
            }
            synchronized (this.j) {
                u(str).base = awesomeGetContainerInnerData;
            }
            bqa.d("RecmdDataSource", "net success, and call to refresh ui");
            if (!z2 && awesomeGetContainerInnerData != null && ((awesomeGetPageData = awesomeGetContainerInnerData.pageParams) == null || awesomeGetPageData.pageNum == 0)) {
                xsl.b(str, awesomeGetContainerInnerData.passParams);
                a3b.n(awesomeGetContainerInnerData.dataCacheTime, str);
                if (i == 0) {
                    l(awesomeGetContainerInnerData, str, "base");
                    p(str);
                } else if (i == 1) {
                    l(awesomeGetContainerInnerData, str, "base");
                }
                I(str);
            }
        }
    }

    public void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d98329", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.j) {
            this.k.set(z);
        }
    }

    public void h0(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7900bca", new Object[]{this, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else {
            i0(false, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2);
        }
    }

    public void i(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef61fd8", new Object[]{this, str, obj});
            return;
        }
        if (this.f == null) {
            this.f = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f.put(str, obj);
        }
    }

    public void i0(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c4251e", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else if (z || ((ConcurrentHashMap) this.f21430a).get(str) == null || ((AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str)).delta != awesomeGetContainerInnerData) {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.cacheTime = s5a.l(System.currentTimeMillis());
                awesomeGetContainerInnerData.dataCacheTime = s5a.l(System.currentTimeMillis());
            }
            u(str).delta = awesomeGetContainerInnerData;
        }
    }

    public void j(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d467e88", new Object[]{this, awesomeGetContainerInnerData, str});
        } else if (awesomeGetContainerInnerData != null && (list = awesomeGetContainerInnerData.sections) != null && !list.isEmpty()) {
            boolean equals = TextUtils.equals(str, "1");
            awesomeGetContainerInnerData.isCacheData = equals;
            for (SectionModel sectionModel : awesomeGetContainerInnerData.sections) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    sectionModel.put("args", (Object) jSONObject);
                }
                if (equals) {
                    jSONObject.put(jtv.S_ARGS_IS_CLIENT_CACHE, (Object) str);
                }
                jSONObject.put("dataFlag", (Object) str);
            }
        }
    }

    public void j0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ea3ffb", new Object[]{this, str, str2});
        } else {
            u(str).requestType = str2;
        }
    }

    public final void k(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c941629", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && (list = awesomeGetContainerInnerData.sections) != null && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (SectionModel sectionModel : awesomeGetContainerInnerData.sections) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put("clientGetDataTime", (Object) Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    public void k0(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f60c9fb", new Object[]{this, str, list});
            return;
        }
        AwesomeGetContainerData u = u(str);
        u.totalSectionList = list;
        u.r4uAnchor = G(list, u.getExt());
    }

    public void l(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf060f", new Object[]{this, awesomeGetContainerInnerData, str, str2});
        } else if (awesomeGetContainerInnerData != null && l9n.a(str)) {
            get.a().i(new d(str, awesomeGetContainerInnerData, str2));
        }
    }

    public final void m(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9540842b", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null) {
            m5a.a().h(new e(str, jSONObject));
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f326551", new Object[]{this, str});
            return;
        }
        String str2 = str + "_tab_";
        for (Map.Entry entry : ((ConcurrentHashMap) this.f21430a).entrySet()) {
            if (((String) entry.getKey()).startsWith(str2)) {
                ((AwesomeGetContainerData) entry.getValue()).abandonData();
            }
        }
    }

    public AwesomeGetContainerInnerData q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("3e43024f", new Object[]{this, str});
        }
        return u(str).base;
    }

    public List<SectionModel> r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de0c42a5", new Object[]{this, str});
        }
        return u(str).getBaseData();
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c1c187a", new Object[]{this});
        }
        return this.f;
    }

    public AtomicBoolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("b7e9b718", new Object[]{this});
        }
        return this.k;
    }

    public AwesomeGetContainerData u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("ed126dac", new Object[]{this, str});
        }
        if (((ConcurrentHashMap) this.f21430a).get(str) == null) {
            synchronized (this.i) {
                try {
                    if (((ConcurrentHashMap) this.f21430a).get(str) == null) {
                        ((ConcurrentHashMap) this.f21430a).put(str, new AwesomeGetContainerData());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str);
    }

    public JSONObject v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58f7263f", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83ce92ef", new Object[]{this});
        }
        return this.c;
    }

    public AwesomeGetContainerInnerData x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("41a100f4", new Object[]{this, str});
        }
        return u(str).delta;
    }

    public List<SectionModel> y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2615e4a", new Object[]{this, str});
        }
        return u(str).getDeltaData();
    }

    public String z(String str) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f1cde60", new Object[]{this, str});
        }
        AwesomeGetContainerData u = u(str);
        if (u == null || (awesomeGetContainerInnerData = u.base) == null) {
            return null;
        }
        return awesomeGetContainerInnerData.expireType;
    }

    public final AwesomeGetContainerInnerData L(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("e19a1935", new Object[]{this, str});
        }
        try {
            a2 = ae9.a("awesome/container_" + str + q2s.JSON, this.h);
        } catch (Throwable th) {
            s3a.b("loadAsset error", th);
            TLog.logd("gateway2-GatewayDataSource.loadAsset", str);
        }
        if (a2 != null && a2.length > 0) {
            return (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
        }
        byte[] a3 = str.contains("recommend_home") ? xd9.a("awesome/container_recommend_home_main_1001.json") : null;
        if (str.contains(NativeContainerProvider.MULTI_NATIVE_INFOFLOW_CID_PREFIX)) {
            a3 = ae9.a("awesome/container_recommend_multi_channel.json", this.h);
        }
        if (a3 != null && a3.length > 0) {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a3, AwesomeGetContainerInnerData.class, new Feature[0]);
            bqa.a("xingzed", "gateway2.0 default hit and cid=".concat(str));
            return awesomeGetContainerInnerData;
        }
        return null;
    }

    public final boolean Q(String str, String str2, jmc jmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3ef6a2", new Object[]{this, str, str2, jmcVar})).booleanValue();
        }
        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str2);
        if (awesomeGetContainerData == null) {
            awesomeGetContainerData = new AwesomeGetContainerData();
            ((ConcurrentHashMap) this.f21430a).put(str2, awesomeGetContainerData);
        }
        awesomeGetContainerData.containerId = str2;
        if (this.k.get()) {
            return false;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
        if (awesomeGetContainerInnerData == null) {
            try {
                Process.setThreadPriority(0);
            } catch (Throwable unused) {
            }
            if (!l9n.a(str2)) {
                hrg.c("cacheProcess", "process_error", "不需要读取缓存文件的场景", "RecmdDataSource", "containerId :" + str2);
                return false;
            }
            AwesomeGetContainerInnerData S = S(new File(str, str2 + "_base.dat"), str2);
            if (S == null) {
                hrg.c("cacheProcess", "process_error", "网络缓存数据加载失败", "RecmdDataSource", "containerId: " + str2);
                fau.b(str2);
                if (fau.a(str2)) {
                    ddv.h("GATEWAY_LOAD_CACHE", "1.0", "awesome_loadCacheFailed", "awesome_loadCacheFailed", "containerId", str2);
                }
                S = L(str2);
            }
            if (S != null) {
                S.cacheTime = 0L;
            }
            if (S != null) {
                if (awesomeGetContainerData.base == null) {
                    synchronized (this.j) {
                        try {
                            if (this.k.get()) {
                                return false;
                            }
                            awesomeGetContainerData.setBaseSync(S);
                            awesomeGetContainerData.delta = null;
                            S.initCacheRequestInAdvance();
                            j(S, "1");
                            awesomeGetContainerData.setTotalSectionListSync(S.sections);
                            awesomeGetContainerData.requestType = s0j.MTS_SUB_STAGE_LOAD_CACHE;
                            bqa.d("RecmdDataSource", "load cache success, and call to refresh ui");
                            hrg.e("cacheProcess", "RecmdDataSource", "load cache success, and call to refresh ui");
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (jmcVar == null) {
                    return true;
                }
                jmcVar.a(str2, S);
                return true;
            }
            hrg.c("cacheProcess", "process_error", "预置数据加载失败", "RecmdDataSource", "containerId : " + str2);
            fau.c(str2);
            if (fau.a(str2)) {
                ddv.h("GATEWAY_LOAD_PRESET", "1.0", "awesome_loadPresetDataFailed", "awesome_loadPresetDataFailed", "containerId", str2);
            }
            return false;
        } else if (jmcVar == null) {
            return true;
        } else {
            jmcVar.a(str2, awesomeGetContainerInnerData);
            return true;
        }
    }

    public final AwesomeGetContainerInnerData S(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("4afdf4c4", new Object[]{this, file, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!file.exists()) {
            return null;
        }
        try {
            phg.e(phg.RmdCacheLoad);
            String c2 = dvh.c("load_file_" + str);
            byte[] c3 = ae9.c(file);
            dvh.g(c2, true);
            phg.d(phg.RmdCacheLoad);
            if (c3 != null && c3.length > 0) {
                String c4 = dvh.c("rmd_data_parse_" + str);
                phg.b(phg.RmdDataParse);
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(c3, AwesomeGetContainerInnerData.class, new Feature[0]);
                phg.a(phg.RmdDataParse);
                dvh.g(c4, true);
                bqa.d("RecmdDataSource", "loadFile end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms , file: " + file.getAbsolutePath());
                return awesomeGetContainerInnerData;
            }
        } catch (Throwable th) {
            s3a.b("loadFile error", th);
            TLog.logd("gateway2-GatewayDataSource.loadFile", file.getAbsolutePath());
        }
        bqa.d("RecmdDataSource", "loadFile end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms , file: " + file.getAbsolutePath());
        return null;
    }

    public final boolean V(List<String> list, pmn pmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2825a1d2", new Object[]{this, list, pmnVar})).booleanValue();
        }
        hrg.e("cacheProcess", "RecmdDataSource", "start loadCache");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                ((ConcurrentHashMap) this.f21430a).put(str, awesomeGetContainerData);
            }
            if (awesomeGetContainerData.getBaseData() != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() != list.size()) {
            return true;
        }
        hrg.e("cacheProcess", "RecmdDataSource", "memory data");
        pmnVar.a(arrayList, null);
        return false;
    }

    public final boolean R(String str, String str2, jmc jmcVar) {
        String str3;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b6d432", new Object[]{this, str, str2, jmcVar})).booleanValue();
        }
        bqa.d("RecmdDataSource", "loadContainerDataWithMultiLock...cacheCallback:" + jmcVar + " , coldStartDataReady: " + this.k.get() + " , containerId: " + str2);
        long currentTimeMillis = System.currentTimeMillis();
        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) ((ConcurrentHashMap) this.f21430a).get(str2);
        if (awesomeGetContainerData == null) {
            awesomeGetContainerData = new AwesomeGetContainerData();
            ((ConcurrentHashMap) this.f21430a).put(str2, awesomeGetContainerData);
        }
        awesomeGetContainerData.containerId = str2;
        if (this.k.get()) {
            return false;
        }
        if (awesomeGetContainerData.base == null) {
            try {
                Process.setThreadPriority(0);
            } catch (Throwable unused) {
            }
            if (!l9n.a(str2)) {
                hrg.c("cacheProcess", "process_error", "不需要读取缓存文件的场景", "RecmdDataSource", "containerId :" + str2);
                return false;
            }
            File file = new File(str, str2 + "_base.dat");
            if (!TextUtils.isEmpty(file.getAbsolutePath())) {
                str3 = file.getAbsolutePath();
            } else {
                str3 = "null";
            }
            Object C = C(str3);
            bqa.d("RecmdDataSource", "load cache file synchronized... : " + file.getAbsolutePath() + " , exist: " + file.exists() + " , lockObj" + C + " cacheKey:" + str3);
            synchronized (C) {
                StringBuilder sb = new StringBuilder("load cache file synchronized inner... cacheKey:");
                sb.append(str3);
                sb.append(" , isBased:");
                sb.append(awesomeGetContainerData.base != null);
                sb.append(" , coldStartDataReady:");
                sb.append(this.k.get());
                bqa.d("RecmdDataSource", sb.toString());
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
                if (awesomeGetContainerInnerData == null) {
                    synchronized (this.j) {
                        bqa.d("RecmdDataSource", "coldStartDataReady: " + this.k.get() + " , containerId: " + str2);
                        if (this.k.get()) {
                            return false;
                        }
                        awesomeGetContainerInnerData = S(file, str2);
                        bqa.d("RecmdDataSource", "load cache file end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms, cacheCallback:" + jmcVar + " , containerId: " + str2);
                        if (awesomeGetContainerInnerData == null) {
                            hrg.c("cacheProcess", "process_error", "网络缓存数据加载失败", "RecmdDataSource", "containerId: " + str2);
                            fau.b(str2);
                            if (fau.a(str2)) {
                                ddv.h("GATEWAY_LOAD_CACHE", "1.0", "awesome_loadCacheFailed", "awesome_loadCacheFailed", "containerId", str2);
                            }
                            awesomeGetContainerInnerData = L(str2);
                        }
                        if (awesomeGetContainerInnerData != null) {
                            awesomeGetContainerInnerData.cacheTime = 0L;
                        }
                    }
                }
                if (awesomeGetContainerInnerData != null) {
                    StringBuilder sb2 = new StringBuilder("containerData isBased: ");
                    sb2.append(awesomeGetContainerData.base != null);
                    sb2.append(" , coldStartDataReady: ");
                    sb2.append(this.k.get());
                    sb2.append(" , containerId: ");
                    sb2.append(str2);
                    bqa.d("RecmdDataSource", sb2.toString());
                    if (awesomeGetContainerData.base == null) {
                        synchronized (this.j) {
                            if (this.k.get()) {
                                return false;
                            }
                            if (awesomeGetContainerData.base == null) {
                                bqa.d("RecmdDataSource", "containerData.base is null, setBaseSync, containerId:" + str2);
                                awesomeGetContainerData.setBaseSync(awesomeGetContainerInnerData);
                            }
                            awesomeGetContainerData.delta = null;
                            awesomeGetContainerInnerData.initCacheRequestInAdvance();
                            j(awesomeGetContainerInnerData, "1");
                            awesomeGetContainerData.setTotalSectionListSync(awesomeGetContainerInnerData.sections);
                            bqa.d("RecmdDataSource", "load cache success, and call to refresh ui");
                            hrg.e("cacheProcess", "RecmdDataSource", "load cache success, and call to refresh ui");
                        }
                    }
                    bqa.d("RecmdDataSource", "loadContainerData end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms, cacheCallback:" + jmcVar);
                    if (jmcVar != null) {
                        jmcVar.a(str2, awesomeGetContainerInnerData);
                    }
                    z = true;
                } else {
                    hrg.c("cacheProcess", "process_error", "预置数据加载失败", "RecmdDataSource", "containerId : " + str2);
                    fau.c(str2);
                    if (fau.a(str2)) {
                        ddv.h("GATEWAY_LOAD_PRESET", "1.0", "awesome_loadPresetDataFailed", "awesome_loadPresetDataFailed", "containerId", str2);
                    }
                    z = false;
                }
                return z;
            }
        }
        bqa.d("RecmdDataSource", "loadContainerDataWithMultiLock... , containerId: " + str2 + " , base data is not null, load success");
        if (jmcVar != null) {
            jmcVar.a(str2, awesomeGetContainerData.base);
        }
        return true;
    }
}
