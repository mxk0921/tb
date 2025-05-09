package com.taobao.android.sku.bizevent;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.CommonRequestSubscriber;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.cjz;
import tb.t2o;
import tb.zr8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuRequestHandler extends CommonRequestSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_request";
    public static final Pattern k = Pattern.compile("\\$response\\[([a-zA-Z()_\\-0-9]*)\\]\\{(ret\\[0\\]|mtopRetCode|mtopRetMsg)\\}");

    static {
        t2o.a(442499141);
    }

    public static /* synthetic */ Pattern G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ Object ipc$super(SkuRequestHandler skuRequestHandler, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        } else if (hashCode == -1949095387) {
            return super.a((JSONObject) objArr[0], objArr[1], (String) objArr[2], (JSONObject) objArr[3], (MtopResponse) objArr[4]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/bizevent/SkuRequestHandler");
        }
    }

    @Override // tb.l6v
    public b8v a(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("8bd32a25", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse});
        }
        b8v a2 = super.a(jSONObject, obj, str, jSONObject2, mtopResponse);
        if (!(jSONObject == null || a2 == null)) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("fields");
            if (jSONObject4 != null) {
                jSONObject3 = JSON.parseObject(jSONObject4.toJSONString());
            } else {
                jSONObject3 = null;
            }
            zr8.b(null, jSONObject3, new a(this, Pattern.compile("\\$response\\[[a-zA-Z()_\\-0-9]*\\]\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*\\})[a-zA-Z()\\. _\\-\\[\\]0-9]*\\}"), new JSONObject(a2) { // from class: com.taobao.android.sku.bizevent.SkuRequestHandler.1
                public final /* synthetic */ b8v val$event;

                {
                    this.val$event = a2;
                    put("response", (Object) a2.j().f());
                    put("__Mtop__", (Object) a2.j().e());
                }
            }));
            a2.r(new DMEvent(a2.h(), jSONObject3, null));
        }
        return a2;
    }

    @Override // com.alibaba.android.ultron.event.CommonRequestSubscriber, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuRequestHandler.handleEvent");
        }
        super.t(b8vVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends zr8.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SkuRequestHandler skuRequestHandler, Pattern pattern, Object obj) {
            super(pattern, obj);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1486617428) {
                return super.a(objArr[0], (String) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/bizevent/SkuRequestHandler$2");
        }

        @Override // tb.zr8.a
        public Object a(Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a76404ac", new Object[]{this, obj, str});
            }
            Object a2 = super.a(obj, str);
            if (TextUtils.isEmpty(str) || !str.startsWith("$response") || a2 != null || !(obj instanceof JSONObject)) {
                return a2;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Matcher matcher = SkuRequestHandler.G().matcher(str);
            String str2 = "";
            String str3 = str2;
            while (matcher.find()) {
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            }
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return a2;
            }
            Object obj2 = jSONObject.get("__Mtop__");
            if (!(obj2 instanceof Map)) {
                return a2;
            }
            Object obj3 = ((Map) obj2).get(str2);
            if (!(obj3 instanceof MtopResponse)) {
                return a2;
            }
            MtopResponse mtopResponse = (MtopResponse) obj3;
            if ("ret[0]".equals(str3)) {
                return mtopResponse.getRetCode() + "::" + mtopResponse.getRetMsg();
            } else if ("mtopRetMsg".equals(str3)) {
                return mtopResponse.getRetMsg();
            } else {
                return "mtopRetCode".equals(str3) ? mtopResponse.getRetCode() : a2;
            }
        }
    }
}
