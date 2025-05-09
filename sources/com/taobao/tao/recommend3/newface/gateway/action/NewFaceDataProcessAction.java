package com.taobao.tao.recommend3.newface.gateway.action;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.RefreshPathData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tb.bqa;
import tb.cd0;
import tb.d90;
import tb.ddv;
import tb.dvh;
import tb.f4b;
import tb.fdv;
import tb.fve;
import tb.h5b;
import tb.hrg;
import tb.imn;
import tb.kmn;
import tb.knn;
import tb.mjv;
import tb.mxl;
import tb.n5a;
import tb.nbq;
import tb.p6j;
import tb.p7p;
import tb.phg;
import tb.rjj;
import tb.s4a;
import tb.t2o;
import tb.uqb;
import tb.v4a;
import tb.vxl;
import tb.wpo;
import tb.xsl;
import tb.yyj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NewFaceDataProcessAction implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f12652a;
    public String b;
    public long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RefreshModel implements Serializable {
        public String containerId;
        public String dataChangeType;

        static {
            t2o.a(729809775);
        }

        public RefreshModel(String str, String str2) {
            this.containerId = str;
            this.dataChangeType = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12653a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f12653a = jSONObject;
            this.b = d90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.b("NewFaceDataProcessAction_executeAction1");
            NewFaceDataProcessAction.this.l(this.f12653a, this.b);
            phg.a("NewFaceDataProcessAction_executeAction1");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends wpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AwesomeGetContainerData f12654a;

        public b(AwesomeGetContainerData awesomeGetContainerData) {
            this.f12654a = awesomeGetContainerData;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/gateway/action/NewFaceDataProcessAction$4");
        }

        @Override // tb.wpo
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4e76a87", new Object[]{this});
                return;
            }
            JSONObject ext = this.f12654a.getExt();
            JSONArray jSONArray = null;
            JSONObject jSONObject = ext == null ? null : ext.getJSONObject("abTest");
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray("track_data");
            }
            if (jSONArray != null && !jSONArray.isEmpty()) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        String string = jSONObject2.getString("experimentId");
                        String string2 = jSONObject2.getString("bucketId");
                        String string3 = jSONObject2.getString("publishId");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            nbq.a("homepage", string, string2, string3);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements h5b.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12655a;
        public final /* synthetic */ d90 b;

        public c(String str, d90 d90Var) {
            this.f12655a = str;
            this.b = d90Var;
        }

        @Override // tb.h5b.e
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
            NewFaceDataProcessAction.d(newFaceDataProcessAction, this.f12655a, NewFaceDataProcessAction.b(newFaceDataProcessAction).u(this.f12655a), "base", this.b, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements knn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12656a;
        public final /* synthetic */ d90 b;

        public d(String str, d90 d90Var) {
            this.f12656a = str;
            this.b = d90Var;
        }

        @Override // tb.knn.d
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
            NewFaceDataProcessAction.d(newFaceDataProcessAction, this.f12656a, NewFaceDataProcessAction.b(newFaceDataProcessAction).u(this.f12656a), "base", this.b, true);
            hrg.e(fdv.F_DATA_PROCESS, "NewFaceDataProcessAction", "template download completed trigger successfully");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12657a;
        public final /* synthetic */ d90 b;

        public e(String str, d90 d90Var) {
            this.f12657a = str;
            this.b = d90Var;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
            NewFaceDataProcessAction.d(newFaceDataProcessAction, this.f12657a, NewFaceDataProcessAction.b(newFaceDataProcessAction).u(this.f12657a), "base", this.b, true);
            hrg.e(fdv.F_DATA_PROCESS, "NewFaceDataProcessAction", "template download completed trigger successfully");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12658a;
        public final /* synthetic */ d90 b;

        public f(String str, d90 d90Var) {
            this.f12658a = str;
            this.b = d90Var;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
            NewFaceDataProcessAction.d(newFaceDataProcessAction, this.f12658a, NewFaceDataProcessAction.b(newFaceDataProcessAction).u(this.f12658a), "base", this.b, true);
            hrg.e(fdv.F_DATA_PROCESS, "NewFaceDataProcessAction", "template download completed trigger successfully");
        }
    }

    static {
        t2o.a(729809766);
        t2o.a(475004944);
    }

    public NewFaceDataProcessAction(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f12652a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static void D(Object obj, String str, JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104e794", new Object[]{obj, str, jSONObject});
            return;
        }
        List<String> x = x(str);
        JSONObject jSONObject4 = jSONObject;
        for (int i = 0; i < x.size(); i++) {
            try {
                String str2 = x.get(i);
                if (i == x.size() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                int n = n(str2);
                String o = o(str2);
                if (n >= 0) {
                    if (!(jSONObject4 instanceof JSONArray)) {
                        jSONArray = new JSONArray();
                        jSONObject.put(o, (Object) jSONArray);
                        jSONObject3 = jSONArray;
                    } else {
                        jSONObject3 = jSONObject4;
                        jSONArray = (JSONArray) jSONObject4;
                    }
                    if (jSONArray.size() <= n) {
                        for (int size = jSONArray.size(); size <= n; size++) {
                            jSONArray.set(size, new JSONObject());
                        }
                    }
                    if (z) {
                        jSONArray.set(n, obj);
                    } else {
                        jSONObject3 = jSONArray.getJSONObject(n);
                    }
                    jSONObject4 = jSONObject3;
                } else {
                    if (jSONObject4 instanceof JSONObject) {
                        jSONObject2 = jSONObject4;
                    } else {
                        JSONObject jSONObject5 = new JSONObject();
                        ((JSONArray) jSONObject4).add(jSONObject5);
                        jSONObject2 = jSONObject5;
                    }
                    if (z) {
                        jSONObject2.put(o, obj);
                    } else if (!jSONObject2.containsKey(o)) {
                        jSONObject2.put(o, (Object) new JSONObject());
                    }
                    jSONObject4 = jSONObject2.get(o);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    public static /* synthetic */ imn b(NewFaceDataProcessAction newFaceDataProcessAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("f3f68b8", new Object[]{newFaceDataProcessAction});
        }
        return newFaceDataProcessAction.f12652a;
    }

    public static /* synthetic */ void c(NewFaceDataProcessAction newFaceDataProcessAction, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6424acc", new Object[]{newFaceDataProcessAction, str, awesomeGetContainerData, str2, d90Var, new Boolean(z), jSONObject});
        } else {
            newFaceDataProcessAction.G(str, awesomeGetContainerData, str2, d90Var, z, jSONObject);
        }
    }

    public static /* synthetic */ void d(NewFaceDataProcessAction newFaceDataProcessAction, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37a4965", new Object[]{newFaceDataProcessAction, str, awesomeGetContainerData, str2, d90Var, new Boolean(z)});
        } else {
            newFaceDataProcessAction.F(str, awesomeGetContainerData, str2, d90Var, z);
        }
    }

    public static int n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f3f39fb", new Object[]{str})).intValue();
        }
        int indexOf = str.indexOf("[");
        if (indexOf == -1) {
            return -1;
        }
        try {
            return Integer.parseInt(str.substring(indexOf + 1, str.length() - 1));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static List<String> x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb5b4eb6", new Object[]{str});
        }
        return Arrays.asList(str.split("\\."));
    }

    public final void A(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7815ec", new Object[]{this, str, jSONObject});
            return;
        }
        dvh.c("data_process_" + str);
        uqb a2 = yyj.e().a(str);
        if (a2 != null) {
            a2.e(jSONObject);
        }
    }

    public final boolean B(String str, List<SectionModel> list, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d9a1492", new Object[]{this, str, list, d90Var})).booleanValue();
        }
        uqb a2 = yyj.e().a(str);
        if (a2 == null) {
            return false;
        }
        return a2.downloadTemplate(list, new f(str, d90Var));
    }

    public final void E(String str, AwesomeGetContainerData awesomeGetContainerData, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a4e425", new Object[]{this, str, awesomeGetContainerData, d90Var});
            return;
        }
        uqb a2 = yyj.e().a(str);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            List<SectionModel> baseData = awesomeGetContainerData.getBaseData();
            List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
            if (baseData != null && !baseData.isEmpty()) {
                arrayList.addAll(baseData);
            }
            if (deltaData != null && !deltaData.isEmpty()) {
                arrayList.addAll(deltaData);
            }
            if (!arrayList.isEmpty() && !a2.downloadTemplate(arrayList, new e(str, d90Var))) {
                i(str, arrayList, d90Var);
            }
        }
    }

    public final void F(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a43cf7c", new Object[]{this, str, awesomeGetContainerData, str2, d90Var, new Boolean(z)});
        } else {
            G(str, awesomeGetContainerData, str2, d90Var, z, null);
        }
    }

    public final void G(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z, JSONObject jSONObject) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c34af4", new Object[]{this, str, awesomeGetContainerData, str2, d90Var, new Boolean(z), jSONObject});
        } else if (d90Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject2.put("dataChangeType", (Object) str2);
            if (z) {
                str3 = "download";
            } else {
                str3 = "remote";
            }
            jSONObject2.put("dataSourceType", (Object) str3);
            if (jSONObject != null) {
                jSONObject2.put("scrollPosition", jSONObject.get("scrollPosition"));
                jSONObject2.put("UIOperation", jSONObject.get("UIOperation"));
                if (jSONObject.containsKey("isSecondReturn")) {
                    jSONObject2.put("isSecondReturn", jSONObject.get("isSecondReturn"));
                }
            }
            n5a.a(jSONObject2, n5a.c(jSONObject));
            ((v4a.a) d90Var).a("finish", jSONObject2, null);
        }
    }

    public final Object H(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d432a458", new Object[]{this, str, jSONObject});
        }
        for (String str2 : x(str)) {
            if (jSONObject instanceof JSONObject) {
                jSONObject = jSONObject.get(str2);
                continue;
            } else {
                if (jSONObject instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) jSONObject;
                    int n = n(str2);
                    if (n >= 0 && n < jSONArray.size()) {
                        jSONObject = jSONArray.get(n);
                        continue;
                    }
                }
                jSONObject = null;
                continue;
            }
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject;
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        phg.b("NewFaceDataProcessAction");
        this.b = jSONObject.getString("requestType");
        this.c = SystemClock.uptimeMillis();
        if (kmn.l()) {
            Coordinator.execute(new a(jSONObject, d90Var));
        } else {
            phg.b("NewFaceDataProcessAction_executeAction2");
            l(jSONObject, d90Var);
            phg.a("NewFaceDataProcessAction_executeAction2");
        }
        phg.a("NewFaceDataProcessAction");
    }

    public final void e(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83a1b36", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        if (TextUtils.equals("coldStart", jSONObject.getString("requestType"))) {
            str = "2";
        } else {
            str = "0";
        }
        this.f12652a.j(awesomeGetContainerData.base, str);
        this.f12652a.j(awesomeGetContainerData.delta, str);
    }

    public final void f(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae901a3", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2});
            return;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext != null) {
            JSONObject jSONObject = ext.getJSONObject("popContainerConfig");
            JSONObject ext2 = awesomeGetContainerData2.getExt();
            if (ext2 == null) {
                ext2 = new JSONObject();
            }
            ext2.put("popContainerConfig", (Object) jSONObject);
        }
    }

    public final void g(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404f476d", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData != null) {
            JSONObject a2 = xsl.a(str);
            if (w(awesomeGetContainerData.delta)) {
                JSONObject jSONObject = awesomeGetContainerData.delta.passParams;
                if (a2 == null) {
                    a2 = jSONObject;
                } else if (jSONObject != null && !jSONObject.isEmpty()) {
                    a2.putAll(jSONObject);
                }
                xsl.b(str, a2);
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.passParams = a2;
            }
        }
    }

    public void h(String str, List<SectionModel> list, d90 d90Var, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e6968", new Object[]{this, str, list, d90Var, new Boolean(z)});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str)) {
            if (yyj.e().q(str)) {
                str2 = "guess";
            } else {
                str2 = "homepage";
            }
            if (TextUtils.equals(str2, "homepage")) {
                h5b.e().c(list, "homepage", new c(str, d90Var));
            } else {
                knn.g().f(list, "guess", z, new d(str, d90Var), str);
            }
        }
    }

    public final void i(String str, List<SectionModel> list, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5726ec", new Object[]{this, str, list, d90Var});
        } else if (!B(str, list, d90Var)) {
            h(str, list, d90Var, false);
        }
    }

    public final void m(JSONObject jSONObject, JSONObject jSONObject2, List<RefreshPathData> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e0a692", new Object[]{this, jSONObject, jSONObject2, list});
        } else if (jSONObject != null && list != null && !list.isEmpty()) {
            for (RefreshPathData refreshPathData : list) {
                if (refreshPathData != null && !TextUtils.isEmpty(refreshPathData.path)) {
                    try {
                        obj = H(refreshPathData.path, jSONObject);
                    } catch (Exception e2) {
                        fve.c("NewFaceDataProcessAction", "valueForJSONPath...", e2);
                        obj = null;
                    }
                    if (obj != null) {
                        D(obj, refreshPathData.path, jSONObject2);
                    }
                }
            }
        }
    }

    public final JSONObject p(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3b209f4c", new Object[]{this, obj});
        }
        try {
            return (JSONObject) JSON.toJSON(obj);
        } catch (Exception e2) {
            bqa.b("NewFaceDataProcessAction", "getOriginDataJSONObj error", e2);
            return new JSONObject();
        }
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("495ccf28", new Object[]{this})).booleanValue();
        }
        return vxl.b().H();
    }

    public final void r(Context context, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e97d80", new Object[]{this, context, awesomeGetContainerData});
        } else if (context != null && awesomeGetContainerData != null) {
            Coordinator.execute(new b(awesomeGetContainerData));
        }
    }

    public final void t(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bada4", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
            return;
        }
        JSONObject jSONObject = awesomeGetContainerData2.delta.ext;
        if (!(jSONObject == null || awesomeGetContainerData == null || awesomeGetContainerData.base == null || (string = jSONObject.getString("feedsStartSectionBizCode")) == null || string.equals(awesomeGetContainerData.base.infoFlowCardStartBizCode))) {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
            awesomeGetContainerInnerData.infoFlowCardStartBizCode = string;
            JSONObject jSONObject2 = awesomeGetContainerInnerData.ext;
            if (jSONObject2 != null) {
                jSONObject2.put("feedsStartSectionBizCode", (Object) string);
            }
        }
        if (!(awesomeGetContainerData == null || awesomeGetContainerData.getBaseData() == null)) {
            awesomeGetContainerData2.base = awesomeGetContainerData.base;
            List<SectionModel> n = kmn.n(str, awesomeGetContainerData2, awesomeGetContainerData);
            awesomeGetContainerData2.totalSectionList = n;
            awesomeGetContainerData2.base.sections = n;
        }
        g(str, awesomeGetContainerData2);
    }

    public final void u(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        String str;
        List<RefreshPathData> list;
        List<RefreshPathData> list2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df07c311", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2});
        } else if (awesomeGetContainerData2 != null && (awesomeGetContainerInnerData = awesomeGetContainerData2.base) != null) {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = awesomeGetContainerData.base;
            if (awesomeGetContainerInnerData2 == null || awesomeGetContainerInnerData2.refreshPaths != null || awesomeGetContainerInnerData2.unRefreshPaths != null) {
                AwesomeGetContainerInnerData awesomeGetContainerInnerData3 = awesomeGetContainerData.delta;
                if (awesomeGetContainerInnerData3 == null || awesomeGetContainerInnerData3.refreshPaths != null || awesomeGetContainerInnerData3.unRefreshPaths != null) {
                    JSONObject p = p(awesomeGetContainerInnerData);
                    AwesomeGetContainerInnerData awesomeGetContainerInnerData4 = awesomeGetContainerData.base;
                    if (awesomeGetContainerInnerData4 != null) {
                        list2 = awesomeGetContainerInnerData4.unRefreshPaths;
                        list = awesomeGetContainerInnerData4.refreshPaths;
                        jSONObject = p(awesomeGetContainerInnerData4);
                        str = "base";
                    } else {
                        AwesomeGetContainerInnerData awesomeGetContainerInnerData5 = awesomeGetContainerData.delta;
                        if (awesomeGetContainerInnerData5 != null) {
                            list2 = awesomeGetContainerInnerData5.unRefreshPaths;
                            list = awesomeGetContainerInnerData5.refreshPaths;
                            jSONObject = p(awesomeGetContainerInnerData5);
                            str = "delta";
                        } else {
                            list2 = null;
                            str = "";
                            jSONObject = null;
                            list = null;
                        }
                    }
                    if (!TextUtils.isEmpty(str) && p != null) {
                        if (list2 != null && !list2.isEmpty()) {
                            m(p, jSONObject, list2);
                            AwesomeGetContainerInnerData awesomeGetContainerInnerData6 = (AwesomeGetContainerInnerData) JSON.parseObject(jSONObject.toJSONString(), AwesomeGetContainerInnerData.class);
                            if (TextUtils.equals("base", str)) {
                                awesomeGetContainerData.base = awesomeGetContainerInnerData6;
                            } else {
                                awesomeGetContainerData.delta = awesomeGetContainerInnerData6;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            m(jSONObject, p, list);
                            AwesomeGetContainerInnerData awesomeGetContainerInnerData7 = (AwesomeGetContainerInnerData) JSON.parseObject(p.toJSONString(), AwesomeGetContainerInnerData.class);
                            if (TextUtils.equals("base", str)) {
                                awesomeGetContainerData.base = awesomeGetContainerInnerData7;
                            } else {
                                awesomeGetContainerData.delta = awesomeGetContainerInnerData7;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void y(String str, AwesomeGetContainerData awesomeGetContainerData) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d7bc45", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData != null && w(awesomeGetContainerData.base)) {
            xsl.b(str, awesomeGetContainerData.base.passParams);
        } else if (awesomeGetContainerData != null && (awesomeGetContainerInnerData = awesomeGetContainerData.base) != null) {
            awesomeGetContainerInnerData.passParams = xsl.a(str);
        }
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdcf8f25", new Object[]{str});
        }
        int indexOf = str.indexOf("[");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    public final void C(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44886ea9", new Object[]{this, str, new Boolean(z)});
            return;
        }
        boolean z2 = !p7p.q(str);
        if (z) {
            str2 = "dataParse2";
            z2 = true;
        } else {
            str2 = p6j.MTOP_STAGE_DATAPARSE;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        p6j.b(this.b, str2, uptimeMillis, uptimeMillis - this.c, null, z2);
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b64b1", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableFirstPageNotMergeExtSections", true);
    }

    public final void k(String str, String str2, JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ef5ac1", new Object[]{this, str, str2, jSONObject, d90Var});
        } else if (d90Var != null) {
            hrg.c(fdv.F_DATA_PROCESS, "param_error", "网关2.0数据处理，参数异常", "NewFaceDataProcessAction", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("errorCode", (Object) 1);
            jSONObject2.put("errorMsg", (Object) str2);
            if (jSONObject != null && jSONObject.containsKey("isSecondReturn")) {
                jSONObject2.put("isSecondReturn", jSONObject.get("isSecondReturn"));
            }
            n5a.a(jSONObject2, n5a.c(jSONObject));
            ((v4a.a) d90Var).a("finish", jSONObject2, null);
            ddv.h(fdv.F_DATA_PROCESS, "1.0", "param_error", str2, "containerId", str);
        }
    }

    public final boolean w(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a190a551", new Object[]{this, awesomeGetContainerInnerData})).booleanValue();
        }
        if (awesomeGetContainerInnerData == null || (jSONObject = awesomeGetContainerInnerData.ext) == null) {
            return false;
        }
        return jSONObject.getBooleanValue("updatePassParams");
    }

    public final void z(String str, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc3a0dd", new Object[]{this, str, jSONObject, imnVar});
            return;
        }
        String j = dvh.j("data_process_" + str);
        if (!TextUtils.isEmpty(j)) {
            dvh.g(j, true);
        }
        uqb a2 = yyj.e().a(str);
        if (a2 != null) {
            a2.g(imnVar, jSONObject);
        }
    }

    public final void v(String str, rjj rjjVar, imn imnVar, AwesomeGetContainerData awesomeGetContainerData, d90 d90Var, JSONObject jSONObject, List<RefreshModel> list) {
        List<SectionModel> baseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2061266", new Object[]{this, str, rjjVar, imnVar, awesomeGetContainerData, d90Var, jSONObject, list});
            return;
        }
        List<SectionModel> H = imnVar.H(str);
        if (H != null && !H.isEmpty() && awesomeGetContainerData != null) {
            ArrayList arrayList = new ArrayList(H);
            if (mjv.a(arrayList, rjjVar) && (baseData = awesomeGetContainerData.getBaseData()) != null && baseData.size() != 0) {
                int i = rjjVar.f27422a;
                int i2 = rjjVar.b;
                if (i2 == -1) {
                    i2 = arrayList.size() - 1;
                }
                while (i2 >= i) {
                    arrayList.remove(i2);
                    i2--;
                }
                arrayList.addAll(i, baseData);
                String string = jSONObject.getString("requestType");
                bqa.d(mxl.TAG, "mergeUpdateData preloadCards ： " + str + " ,requestType = " + string);
                mxl.k(str, awesomeGetContainerData.getBaseData(), string, awesomeGetContainerData.getPageNum());
                awesomeGetContainerData.base.sections = arrayList;
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.delta;
                if (!(awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.sections == null)) {
                    awesomeGetContainerInnerData.sections = new ArrayList();
                }
                awesomeGetContainerData.totalSectionList = kmn.n(str, awesomeGetContainerData, null);
                imnVar.e0(false, str, awesomeGetContainerData.base, 2);
                imnVar.h0(str, awesomeGetContainerData.delta, kmn.d(awesomeGetContainerData));
                imnVar.k0(str, awesomeGetContainerData.getTotalData());
                i(str, awesomeGetContainerData.getTotalData(), d90Var);
                if (!vxl.j()) {
                    G(str, imnVar.u(str), "base", d90Var, false, jSONObject);
                } else {
                    list.add(new RefreshModel(str, "base"));
                }
                hrg.e(fdv.F_DATA_PROCESS, "NewFaceDataProcessAction", "end mergeUpdateData, dataChangeType : base");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(com.alibaba.fastjson.JSONObject r26, tb.d90 r27) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.l(com.alibaba.fastjson.JSONObject, tb.d90):void");
    }

    public final void s(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, d90 d90Var, List<RefreshModel> list) {
        String str2;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36da4d31", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, d90Var, list});
            return;
        }
        hrg.e(fdv.F_DATA_PROCESS, "NewFaceDataProcessAction", "start mergeDelta containerId : " + str);
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = awesomeGetContainerData2.base;
        boolean z = awesomeGetContainerInnerData2 != null && awesomeGetContainerInnerData2.dataChange;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData3 = awesomeGetContainerData2.delta;
        boolean z2 = awesomeGetContainerInnerData3 != null && awesomeGetContainerInnerData3.dataChange;
        boolean L = vxl.b().L();
        String string = jSONObject.getString("requestType");
        if (L) {
            E(str, awesomeGetContainerData2, d90Var);
        }
        if (z) {
            List<SectionModel> baseData = awesomeGetContainerData.getBaseData();
            boolean z3 = baseData != null && awesomeGetContainerData2.getPageNum() > 0;
            List<SectionModel> list2 = null;
            if (z3) {
                if (awesomeGetContainerData2.getBaseData() != null) {
                    list2 = new ArrayList(awesomeGetContainerData2.getBaseData());
                }
                awesomeGetContainerData2.base.sections.addAll(0, baseData);
                awesomeGetContainerData2.base.homePagePopDatas = awesomeGetContainerData.base.homePagePopDatas;
                f(awesomeGetContainerData, awesomeGetContainerData2);
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData4 = awesomeGetContainerData2.base;
            if (awesomeGetContainerInnerData4 == null || (awesomeGetContainerInnerData = awesomeGetContainerData.base) == null) {
                str2 = fdv.F_DATA_PROCESS;
            } else {
                str2 = fdv.F_DATA_PROCESS;
                awesomeGetContainerInnerData4.isFirstPage = !z3;
                awesomeGetContainerInnerData4.infoFlowCardStartBizCode = awesomeGetContainerInnerData.infoFlowCardStartBizCode;
                awesomeGetContainerInnerData4.infoFlowCardStartOffset = awesomeGetContainerInnerData.infoFlowCardStartOffset;
                awesomeGetContainerInnerData4.infoFlowCardPopBizCode = awesomeGetContainerInnerData.infoFlowCardPopBizCode;
                boolean z4 = j() ? z3 : true;
                JSONObject jSONObject2 = awesomeGetContainerData2.base.extSections;
                if ((jSONObject2 == null || jSONObject2.isEmpty()) && z4) {
                    awesomeGetContainerData2.base.extSections = awesomeGetContainerData.base.extSections;
                }
            }
            y(str, awesomeGetContainerData2);
            awesomeGetContainerData2.totalSectionList = kmn.n(str, awesomeGetContainerData2, awesomeGetContainerData);
            if (!z3) {
                list2 = awesomeGetContainerData2.getTotalData();
            }
            bqa.d(mxl.TAG, "mergeDelta preloadCards ： " + str + " ,requestType = " + string);
            mxl.k(str, list2, string, awesomeGetContainerData2.getPageNum());
        } else {
            str2 = fdv.F_DATA_PROCESS;
            if (z2) {
                t(awesomeGetContainerData, awesomeGetContainerData2, str);
            }
        }
        this.f12652a.j0(str, string);
        this.f12652a.c0(str, awesomeGetContainerData2.base);
        this.f12652a.h0(str, awesomeGetContainerData2.delta, kmn.d(awesomeGetContainerData2));
        this.f12652a.k0(str, awesomeGetContainerData2.getTotalData());
        String str3 = "delta";
        if (!vxl.j() ? !z2 : z) {
            str3 = "base";
        }
        jSONObject.put("dataChangeType", (Object) str3);
        z(str, jSONObject, this.f12652a);
        if (!L) {
            i(str, awesomeGetContainerData2.getTotalData(), d90Var);
        }
        cd0.f(awesomeGetContainerData2.getExt());
        if (!vxl.j()) {
            G(str, this.f12652a.u(str), str3, d90Var, false, jSONObject);
        } else {
            list.add(new RefreshModel(str, str3));
        }
        hrg.e(str2, "NewFaceDataProcessAction", "end mergeDelta, dataChangeType : ".concat(str3));
    }
}
