package com.taobao.android.behavix;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.cxw;
import tb.f45;
import tb.kpw;
import tb.mj7;
import tb.nsw;
import tb.q82;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BehaviRWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends TypeReference<HashMap<String, Object>> {
        public a(BehaviRWVPlugin behaviRWVPlugin) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements f45 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f6448a;
        public final /* synthetic */ WVCallBackContext b;

        public b(BehaviRWVPlugin behaviRWVPlugin, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f6448a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.f45
        public void a(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24bed594", new Object[]{this, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject(map);
            if (z) {
                this.f6448a.d("data", jSONObject);
                this.b.success(this.f6448a);
                return;
            }
            this.f6448a.d("data", jSONObject);
            this.b.error(this.f6448a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends TypeReference<HashMap<String, Object>> {
        public c(BehaviRWVPlugin behaviRWVPlugin) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements f45 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f6449a;
        public final /* synthetic */ WVCallBackContext b;

        public d(BehaviRWVPlugin behaviRWVPlugin, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f6449a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.f45
        public void a(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24bed594", new Object[]{this, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject(map);
            if (z) {
                this.f6449a.d("data", jSONObject);
                this.b.success(this.f6449a);
                return;
            }
            this.f6449a.d("data", jSONObject);
            this.b.error(this.f6449a);
        }
    }

    static {
        t2o.a(404750442);
    }

    private boolean c(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString(r4p.KEY_MODEL_NAME);
            string2 = parseObject.getString("key");
            nswVar = new nsw();
        } catch (Throwable th) {
            q82.f("getModelInfo_Exception", null, null, th);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            nswVar.b("modelInfoResult", cxw.a(string, string2));
            wVCallBackContext.success(nswVar);
            return true;
        }
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
        return true;
    }

    private boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            nsw nswVar = new nsw();
            nswVar.b("deviceLevel", mj7.b());
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            q82.f("getModelInfo_Exception", null, null, th);
            wVCallBackContext.error();
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(BehaviRWVPlugin behaviRWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/BehaviRWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("runComputeByName".equals(str)) {
            return a(str2, wVCallBackContext);
        }
        if ("runComputeByAlias".equals(str)) {
            return b(str2, wVCallBackContext);
        }
        if ("getModelInfo".equals(str)) {
            return c(str2, wVCallBackContext);
        }
        if (PerformanceAbility.API_GET_DEVICE_LEVEL.equals(str)) {
            return d(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString("pageName");
            string2 = parseObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
            string3 = parseObject.getString("inputArgs");
            nswVar = new nsw();
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("info", str);
            q82.f("runComputeByName_Exception", null, hashMap, e);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            HashMap hashMap2 = string3 == null ? null : (HashMap) JSON.parseObject(string3, new a(this), new Feature[0]);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("_walle_bizname", string);
            DAI.runCompute(string2, hashMap2, new b(this, nswVar, wVCallBackContext), hashMap3);
            return true;
        }
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
        return true;
    }

    private boolean b(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString("alias");
            string2 = parseObject.getString("pageName");
            string3 = parseObject.getString("inputArgs");
            nswVar = new nsw();
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("info", str);
            q82.f("runComputeByAlias_Exception", null, hashMap, th);
            wVCallBackContext.error();
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            HashMap hashMap2 = string3 == null ? null : (HashMap) JSON.parseObject(string3, new c(this), new Feature[0]);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("_walle_bizname", string2);
            DAI.runComputeByAlias(string, hashMap2, new d(this, nswVar, wVCallBackContext), hashMap3);
            return true;
        }
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
        return true;
    }
}
