package com.taobao.detail.rate.vivid.ability;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.mtop.RateTranslateRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.c8;
import tb.dx1;
import tb.f8;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.to8;
import tb.u8;
import tb.w8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class XRateTranslateAbility extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";
    public static final long XRATETRANSLATE = 237350168599775648L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public XRateTranslateAbility build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XRateTranslateAbility) ipChange.ipc$dispatch("2948e5a", new Object[]{this, obj});
            }
            return new XRateTranslateAbility();
        }
    }

    public static /* synthetic */ List i(XRateTranslateAbility xRateTranslateAbility, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("427fdee2", new Object[]{xRateTranslateAbility, jSONArray, list});
        }
        return xRateTranslateAbility.n(jSONArray, list);
    }

    public static /* synthetic */ Object ipc$super(XRateTranslateAbility xRateTranslateAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/XRateTranslateAbility");
    }

    public static /* synthetic */ JSONObject j(XRateTranslateAbility xRateTranslateAbility, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("39a13d43", new Object[]{xRateTranslateAbility, jSONObject});
        }
        return xRateTranslateAbility.m(jSONObject);
    }

    public static void l(Object obj, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2782036c", new Object[]{obj, list});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            for (String str : jSONObject.keySet()) {
                l(jSONObject.get(str), list);
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                l(jSONArray.get(i), list);
            }
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (o(str2)) {
                list.add(str2);
            }
        }
    }

    public static boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7d8dd19", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str);
    }

    public static void p(Object obj, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f715eee2", new Object[]{obj, list, list2});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            for (String str : jSONObject.keySet()) {
                Object obj2 = jSONObject.get(str);
                if (!(obj2 instanceof String) || !o((String) obj2)) {
                    p(obj2, list, list2);
                } else {
                    int indexOf = list.indexOf(obj2);
                    if (indexOf != -1) {
                        jSONObject.put(str, (Object) list2.get(indexOf));
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj3 = jSONArray.get(i);
                if (!(obj3 instanceof String) || !o((String) obj3)) {
                    p(obj3, list, list2);
                } else {
                    int indexOf2 = list.indexOf(obj3);
                    if (indexOf2 != -1) {
                        jSONArray.add(i, list2.get(indexOf2));
                    }
                }
            }
        }
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            u8Var.callback("failure", new f8(new JSONObject()));
            return new f8();
        }
        JSONObject g = n8Var.g("data");
        if (g == null || g.size() == 0) {
            u8Var.callback("failure", new f8(new JSONObject()));
            return new f8();
        }
        q(g, k(g), u8Var);
        return new f8();
    }

    public final List<String> k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("78a79abd", new Object[]{this, obj});
        }
        ArrayList arrayList = new ArrayList();
        l(obj, arrayList);
        return arrayList;
    }

    public final JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b06a9be1", new Object[]{this, jSONObject});
        }
        return JSON.parseObject(JSON.toJSONString(jSONObject));
    }

    public final List<String> n(JSONArray jSONArray, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82d8d1d1", new Object[]{this, jSONArray, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                arrayList2.add(jSONObject.getString("sourceText"));
                arrayList.add(jSONObject.getString("targetText"));
            }
        }
        if (list == null || !list.equals(arrayList2)) {
            return null;
        }
        return arrayList;
    }

    public final void q(final JSONObject jSONObject, final List<String> list, final u8 u8Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ab625d", new Object[]{this, jSONObject, list, u8Var});
        } else if (list.size() <= 0) {
            u8Var.callback("success", new f8(jSONObject));
        } else {
            String a2 = dx1.a();
            RateTranslateRequest rateTranslateRequest = new RateTranslateRequest();
            rateTranslateRequest.bizScene = "mtop_online_comment";
            rateTranslateRequest.sourceTextFormatType = "text";
            rateTranslateRequest.sourceTextContentType = to8.COMMENT;
            rateTranslateRequest.sourceLanguage = "auto";
            rateTranslateRequest.targetLanguage = a2;
            rateTranslateRequest.sourceTextList = list;
            if (!"ru_RU".equals(a2) || list.size() < 2) {
                z = false;
            }
            rateTranslateRequest.parallel = z;
            MtopBusiness.build(Mtop.instance(null), rateTranslateRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.detail.rate.vivid.ability.XRateTranslateAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        u8Var.callback("failure", new f8(new JSONObject()));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        u8Var.callback("failure", new f8(new JSONObject()));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONArray jSONArray;
                    List i2;
                    boolean z2 = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                    JSONObject jSONObject2 = null;
                    if (parseObject == null || parseObject.isEmpty() || (jSONArray = parseObject.getJSONArray("translateResponseList")) == null || jSONArray.size() <= 0 || (i2 = XRateTranslateAbility.i(XRateTranslateAbility.this, jSONArray, list)) == null) {
                        z2 = false;
                    } else {
                        jSONObject2 = XRateTranslateAbility.j(XRateTranslateAbility.this, jSONObject);
                        if (jSONObject2 != null) {
                            XRateTranslateAbility.p(jSONObject2, list, i2);
                        } else {
                            jSONObject2 = jSONObject;
                        }
                    }
                    if (z2) {
                        u8Var.callback("success", new f8(jSONObject2));
                    } else {
                        u8Var.callback("failure", new f8(new JSONObject()));
                    }
                }
            }).reqMethod(MethodEnum.POST).startRequest();
        }
    }
}
