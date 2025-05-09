package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import tb.cit;
import tb.lr6;
import tb.rb;
import tb.rq6;
import tb.sq6;
import tb.t2o;
import tb.wq6;
import tb.wxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DataLoaderEngineImpl implements wxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f2322a;

    static {
        t2o.a(157286599);
        t2o.a(157286616);
    }

    public DataLoaderEngineImpl(a aVar) {
        this.f2322a = aVar;
    }

    @Override // tb.wxb
    public void a(a aVar, sq6 sq6Var) {
        UltronError ultronError;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab13eb1", new Object[]{this, aVar, sq6Var});
        } else if (this.f2322a.E() == null) {
            UltronError ultronError2 = new UltronError("doRequest UltronEngine is null");
            ultronError2.code = "F_ULTRON_ENGINE_10006";
            UnifyLog.m(this.f2322a.getBizName(), "DataLoaderEngineImpl", "doRequest UltronEngine is null", new String[0]);
            ultronError2.domain = "ClientEngine";
            wq6 wq6Var = new wq6();
            wq6Var.c(aVar);
            sq6Var.b(wq6Var, ultronError2);
        } else {
            if ("initial".equals(aVar.f2325a)) {
                this.f2322a.E().n();
            }
            lr6 lr6Var = (lr6) aVar.e(rq6.KEY_DATA_PARSER_RESULT);
            cit m = this.f2322a.E().m(lr6Var != null ? lr6Var.a() : null);
            wq6 wq6Var2 = new wq6();
            wq6Var2.d(m);
            wq6Var2.c(aVar);
            if (m == null || m.f17087a) {
                if (m != null) {
                    cit.a aVar2 = m.b;
                    ultronError = new UltronError(aVar2.b);
                    ultronError.code = "F_ULTRON_ENGINE_10001";
                    String bizName = this.f2322a.getBizName();
                    StringBuilder sb = new StringBuilder("renderUserData error: ");
                    sb.append(aVar2.b);
                    String str = aVar2.c;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    UnifyLog.m(bizName, "DataLoaderEngineImpl", sb.toString(), new String[0]);
                } else {
                    ultronError = new UltronError("Template has generated error, result is empty!");
                    ultronError.code = "F_ULTRON_ENGINE_10001";
                    UnifyLog.m(this.f2322a.getBizName(), "DataLoaderEngineImpl", "renderUserData error: TempRenderInfo is null", new String[0]);
                }
                ultronError.domain = "ClientEngine";
                sq6Var.b(wq6Var2, ultronError);
                return;
            }
            JSONObject jSONObject = m.c;
            if (jSONObject == null || !"true".equals(jSONObject.getString("noNeedRefresh"))) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("api", (Object) "api.newultron");
                jSONObject2.put("data", (Object) jSONObject);
                jSONObject2.put(rb.RESULT_KEY, (Object) new ArrayList<String>() { // from class: com.alibaba.android.ultron.vfw.dataloader.DataLoaderEngineImpl.1
                    {
                        add("SUCCESS::调用成功");
                    }
                });
                jSONObject2.put("v", (Object) "1.0");
                m.c = jSONObject2;
                sq6Var.a(wq6Var2);
                return;
            }
            sq6Var.a(null);
        }
    }
}
