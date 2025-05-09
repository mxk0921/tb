package com.alibaba.android.ultron.vfw.dataloader;

import android.text.TextUtils;
import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.ArrayList;
import tb.a8v;
import tb.i5e;
import tb.kih;
import tb.kr6;
import tb.lr6;
import tb.mr;
import tb.t2o;
import tb.xxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DataParserEngineImpl implements xxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.alibaba.android.ultron.vfw.instance.a f2323a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kih<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.android.ultron.vfw.dataloader.a f2324a;
        public final /* synthetic */ kr6 b;

        public a(com.alibaba.android.ultron.vfw.dataloader.a aVar, kr6 kr6Var) {
            this.f2324a = aVar;
            this.b = kr6Var;
        }

        /* renamed from: a */
        public void onReceiveValue(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d15f9c", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
                UnifyLog.m(DataParserEngineImpl.this.f2323a.getBizName(), "DataParserEngineImpl", "call method return null", new String[0]);
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("storedState");
                JSONObject jSONObject3 = jSONObject.getJSONObject("bizState");
                this.f2324a.b.c = jSONObject2;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("sku_script", (Object) jSONObject3);
                lr6 lr6Var = new lr6();
                lr6Var.c(jSONObject4);
                this.b.c(lr6Var);
            }
        }
    }

    static {
        t2o.a(157286609);
        t2o.a(157286617);
    }

    public DataParserEngineImpl(com.alibaba.android.ultron.vfw.instance.a aVar) {
        this.f2323a = aVar;
    }

    @Override // tb.xxb
    public void a(com.alibaba.android.ultron.vfw.dataloader.a aVar, kr6 kr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aca4993", new Object[]{this, aVar, kr6Var});
            return;
        }
        a.C0075a aVar2 = aVar.b;
        JSONObject jSONObject = aVar2.c;
        JSONObject jSONObject2 = aVar2.f2326a;
        JSONObject jSONObject3 = aVar2.d;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 != null) {
            jSONObject.put("initialState", (Object) jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject.put("extInput", (Object) jSONObject3);
        }
        JSONObject jSONObject4 = aVar.b.b;
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("platform", (Object) TimeCalculator.PLATFORM_ANDROID);
        jSONObject5.put("storedState", (Object) jSONObject);
        jSONObject5.put("opState", (Object) jSONObject4);
        if (TextUtils.isEmpty("main")) {
            b();
            return;
        }
        a8v E = this.f2323a.E();
        if (E == null) {
            new UltronError("引擎init出错: UltronEngine is null").code = "F_ULTRON_ENGINE_10006";
            kr6Var.c(null);
            b();
            return;
        }
        if (E.l()) {
            jSONObject5.put("platform", (Object) "AndroidOld");
        }
        b();
        E.d("main", new ArrayList<String>(jSONObject5) { // from class: com.alibaba.android.ultron.vfw.dataloader.DataParserEngineImpl.1
            public final /* synthetic */ JSONObject val$params;

            {
                this.val$params = jSONObject5;
                add(jSONObject5.toJSONString());
            }
        }, new a(aVar, kr6Var));
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8f1022", new Object[]{this});
            return;
        }
        i5e l = this.f2323a.F().l();
        if (l != null) {
            l.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_END);
        }
    }
}
