package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.detail.rate.model.itemrates.entity.RateKeywordV2;
import com.taobao.detail.rate.model.v2.AskInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @JvmStatic
        public final RateKeyword a(RateKeywordV2 rateKeywordV2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateKeyword) ipChange.ipc$dispatch("c7771cf5", new Object[]{this, rateKeywordV2});
            }
            ckf.g(rateKeywordV2, "keyword");
            try {
                RateKeyword rateKeyword = new RateKeyword();
                rateKeyword.word = rateKeywordV2.word;
                rateKeyword.count = rateKeywordV2.count;
                rateKeyword.attribute = rateKeywordV2.attribute;
                rateKeyword.type = rateKeywordV2.type;
                rateKeyword.status = rateKeywordV2.status;
                rateKeyword.setRateType(rateKeywordV2.rateType);
                rateKeyword.attributeId = rateKeywordV2.attributeId;
                rateKeyword.level = rateKeywordV2.level;
                rateKeyword.subImprList = rateKeywordV2.subImprList;
                return rateKeyword;
            } catch (Throwable th) {
                odg.c("DataUtils", "keywordNew2Keyword Error: " + Log.getStackTraceString(th));
                return new RateKeyword();
            }
        }

        @JvmStatic
        public final List<RateKeyword> b(List<? extends RateKeywordV2> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("57826ce9", new Object[]{this, list});
            }
            if (list == null) {
                return null;
            }
            try {
                List<? extends RateKeywordV2> list2 = list;
                ArrayList arrayList = new ArrayList(zz3.q(list2, 10));
                for (RateKeywordV2 rateKeywordV2 : list2) {
                    arrayList.add(wt6.Companion.a(rateKeywordV2));
                }
                return arrayList;
            } catch (Throwable th) {
                odg.c("DataUtils", "keywordsNew2Keywords Error: " + Log.getStackTraceString(th));
                return null;
            }
        }

        @JvmStatic
        public final Object f(Object obj) {
            Object jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("cfaaa0d", new Object[]{this, obj});
            }
            if (obj instanceof JSONObject) {
                jSONArray = new JSONObject((Map) obj);
            } else if (!(obj instanceof JSONArray)) {
                return obj;
            } else {
                jSONArray = new JSONArray((List) obj);
            }
            return jSONArray;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0174  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.detail.rate.mtop.RateListDetailRequest d(com.taobao.detail.rate.model.RateInfoV2 r12) {
            /*
                Method dump skipped, instructions count: 401
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.wt6.a.d(com.taobao.detail.rate.model.RateInfoV2):com.taobao.detail.rate.mtop.RateListDetailRequest");
        }

        @JvmStatic
        public final RateInfo e(RateInfoV2 rateInfoV2) {
            String feedId;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateInfo) ipChange.ipc$dispatch("5ad2f7d1", new Object[]{this, rateInfoV2});
            }
            ckf.g(rateInfoV2, "rateInfoV2");
            try {
                RateInfo.a aVar = new RateInfo.a();
                long j = 0;
                aVar.N(qrf.k(rateInfoV2.getExParams(), RateInfoV2.KEY_NAV_TIME_MS, 0L));
                aVar.C(qrf.k(rateInfoV2.getExParams(), RateInfoV2.KEY_CLICK_TIME_MS, 0L));
                aVar.O(qrf.m(rateInfoV2.getExParams(), RateInfoV2.KEY_OPEN_MODE, "default"));
                aVar.E(rateInfoV2.getDetailRate());
                aVar.L(rateInfoV2.getItemId());
                if (!TextUtils.isEmpty(rateInfoV2.getFeedId()) && (feedId = rateInfoV2.getFeedId()) != null) {
                    j = Long.parseLong(feedId);
                }
                aVar.H(j);
                aVar.K(krq.i(rateInfoV2.getInvokeSource(), Integer.parseInt("-1")));
                aVar.D(String.valueOf(rateInfoV2.getCommentCount()));
                aVar.Y(rateInfoV2.getShopId());
                RateKeywordV2 keyword = rateInfoV2.getKeyword();
                aVar.G(keyword != null ? keyword.attribute : null);
                aVar.U(b(rateInfoV2.getRateKeywordList()));
                aVar.F(rateInfoV2.getExParams());
                aVar.W(rateInfoV2.getSellerId());
                AskInfo askInfo = rateInfoV2.getAskInfo();
                aVar.S(askInfo != null ? askInfo.getAskText() : null);
                AskInfo askInfo2 = rateInfoV2.getAskInfo();
                aVar.Q(askInfo2 != null ? askInfo2.getAskIcon() : null);
                AskInfo askInfo3 = rateInfoV2.getAskInfo();
                aVar.R(askInfo3 != null ? askInfo3.getLinkUrl() : null);
                aVar.M((JSONObject) JSON.toJSON(rateInfoV2.getItemInfo()));
                aVar.Z(rateInfoV2.getSkuInfo());
                if (aVar.A() == Integer.parseInt("12")) {
                    aVar.T((JSONObject) JSON.toJSON(rateInfoV2));
                } else if (aVar.A() == Integer.parseInt("13")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("invokeSource", (Object) Integer.valueOf(aVar.A()));
                    xhv xhvVar = xhv.INSTANCE;
                    aVar.T(jSONObject);
                }
                return aVar.z();
            } catch (Throwable th) {
                odg.c("DataUtils", "rateInfoNew2RateInfo Error: " + Log.getStackTraceString(th));
                return null;
            }
        }

        @JvmStatic
        public final RateInfo c(RateInfo rateInfo) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RateInfo) ipChange.ipc$dispatch("4e2d2086", new Object[]{this, rateInfo});
            }
            if (rateInfo == null) {
                return null;
            }
            if (rateInfo.getInvokeSource() != Integer.parseInt("12")) {
                return rateInfo;
            }
            if (rateInfo.getRateExtParams() == null) {
                rateInfo.setRateExtParams(new JSONObject());
            }
            Object json = JSON.toJSON(rateInfo);
            if (json != null) {
                JSONObject jSONObject2 = (JSONObject) json;
                for (String str : yz3.l("itemId", "shopId", "sellerId", "mSelectTag", DXTraceUtil.TYPE_EXPRESSION_STRING, "rateType", "invokeSource", "rateKeywordList", "exParams", "foldFlag")) {
                    try {
                        Object obj = jSONObject2.get(str);
                        if (obj != null) {
                            if (str.hashCode() == 1439850521 && str.equals("exParams")) {
                                Object obj2 = rateInfo.getRateExtParams().get(str);
                                if (obj2 instanceof JSONObject) {
                                    jSONObject = (JSONObject) obj2;
                                } else if (obj2 == null) {
                                    jSONObject = new JSONObject();
                                } else {
                                    jSONObject = new JSONObject();
                                }
                                if (obj instanceof JSONObject) {
                                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                                        String str2 = (String) entry.getKey();
                                        try {
                                            jSONObject.put((JSONObject) str2, (String) wt6.Companion.f(entry.getValue()));
                                        } catch (Exception e) {
                                            odg.c("DataUtils", "Error merging subKey: " + str2, e);
                                        }
                                    }
                                }
                                JSONObject rateExtParams = rateInfo.getRateExtParams();
                                ckf.f(rateExtParams, "rateInfo.rateExtParams");
                                rateExtParams.put((JSONObject) str, (String) jSONObject);
                            } else {
                                JSONObject rateExtParams2 = rateInfo.getRateExtParams();
                                ckf.f(rateExtParams2, "rateInfo.rateExtParams");
                                rateExtParams2.put((JSONObject) str, (String) wt6.Companion.f(obj));
                            }
                        }
                    } catch (Exception e2) {
                        odg.c("DataUtils", "Error processing key: " + str, e2);
                    }
                }
                return rateInfo;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
    }
}
