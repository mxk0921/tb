package com.taobao.taopai2.material.business.specified;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.specified.MaterialSpecifiedModel;
import com.taobao.taopai2.material.exception.ResponseDataException;
import com.taobao.taopai2.material.request.RequestBuilder;
import com.taobao.taopai2.material.request.Response;
import java.util.HashMap;
import java.util.List;
import tb.irc;
import tb.mk4;
import tb.t2o;
import tb.v1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taopai2.material.business.specified.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0764a implements mk4<MaterialSpecifiedModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ irc f13378a;

        public C0764a(irc ircVar) {
            this.f13378a = ircVar;
        }

        /* renamed from: a */
        public void accept(MaterialSpecifiedModel materialSpecifiedModel) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0a457a6", new Object[]{this, materialSpecifiedModel});
            } else {
                a.a(a.this, this.f13378a, materialSpecifiedModel);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements mk4<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ irc f13379a;

        public b(a aVar, irc ircVar) {
            this.f13379a = ircVar;
        }

        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8addc6", new Object[]{this, th});
            } else {
                a.b(this.f13379a, (ResponseDataException) th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements v1a<Response<MaterialSpecifiedModel>, MaterialSpecifiedModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(a aVar) {
        }

        /* renamed from: a */
        public MaterialSpecifiedModel apply(Response<MaterialSpecifiedModel> response) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MaterialSpecifiedModel) ipChange.ipc$dispatch("78664de6", new Object[]{this, response});
            }
            return response.data;
        }
    }

    static {
        t2o.a(782237914);
    }

    public static /* synthetic */ void a(a aVar, irc ircVar, MaterialSpecifiedModel materialSpecifiedModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fce7a6", new Object[]{aVar, ircVar, materialSpecifiedModel});
        } else {
            aVar.d(ircVar, materialSpecifiedModel);
        }
    }

    public static /* synthetic */ void b(irc ircVar, ResponseDataException responseDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b73bb6", new Object[]{ircVar, responseDataException});
        } else {
            c(ircVar, responseDataException);
        }
    }

    public static void c(irc ircVar, ResponseDataException responseDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18626aeb", new Object[]{ircVar, responseDataException});
            return;
        }
        ircVar.onFail(responseDataException.getErrorCode(), responseDataException.getErrorInfo());
        StringBuilder sb = new StringBuilder("specifyMaterial fail ");
        sb.append(responseDataException.getErrorCode());
        sb.append("|");
        sb.append(responseDataException.getErrorInfo());
    }

    public final void d(irc ircVar, MaterialSpecifiedModel materialSpecifiedModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d8ba76", new Object[]{this, ircVar, materialSpecifiedModel});
        } else if (materialSpecifiedModel == null) {
            ircVar.onFail("success_response_null", "");
        } else {
            materialSpecifiedModel.toString();
            SpecifiedFilterResultBean specifiedFilterResultBean = new SpecifiedFilterResultBean();
            specifiedFilterResultBean.mMaterialList = materialSpecifiedModel.materialList;
            try {
                e(materialSpecifiedModel, specifiedFilterResultBean);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("SpecifiedRequester", "specifyMaterial success, parse error ");
            }
            ircVar.f(specifiedFilterResultBean);
        }
    }

    public final void e(MaterialSpecifiedModel materialSpecifiedModel, SpecifiedFilterResultBean specifiedFilterResultBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61e9845", new Object[]{this, materialSpecifiedModel, specifiedFilterResultBean});
        } else if (!TextUtils.isEmpty(materialSpecifiedModel.filterInfoMap)) {
            specifiedFilterResultBean.mRuleMap = new HashMap();
            JSONObject parseObject = JSON.parseObject(materialSpecifiedModel.filterInfoMap);
            for (String str : parseObject.getInnerMap().keySet()) {
                JSONObject jSONObject = parseObject.getJSONObject(str);
                MaterialSpecifiedRule materialSpecifiedRule = new MaterialSpecifiedRule();
                materialSpecifiedRule.mRuleCode = jSONObject.getInteger("ruleCode").intValue();
                materialSpecifiedRule.mRuleMessage = jSONObject.getString("ruleMessage");
                specifiedFilterResultBean.mRuleMap.put(str, materialSpecifiedRule);
            }
        }
    }

    public void f(String str, String str2, int i, List<Long> list, irc ircVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da518490", new Object[]{this, str, str2, new Integer(i), list, ircVar});
            return;
        }
        SpecifiedRequestParams specifiedRequestParams = new SpecifiedRequestParams(str, str2, i, JSON.toJSONString(list));
        new RequestBuilder(specifiedRequestParams, MaterialSpecifiedModel.MaterialSpecifiedResponse.class).setTarget(specifiedRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new c(this)).subscribe(new C0764a(ircVar), new b(this, ircVar));
    }
}
