package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.login4android.api.Login;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ccv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class q9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final q9b INSTANCE = new q9b();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ccv.b f26593a;

        public a(ccv.b bVar) {
            this.f26593a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String userId = Login.getUserId();
                if (TextUtils.isEmpty(userId)) {
                    hav.g("HybridPreRequestImageHelper", "asyncGetOListPrefetchImgList:", "userId is empty");
                    return;
                }
                List<String> n = p9b.Companion.n();
                m9v d = m9v.d("order_list");
                ckf.f(d, "UltronMMKV.get(\"order_list\")");
                int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, ccv.PARAM_PREFETCH_IMG_SIZE, 320);
                for (String str : n) {
                    String l = d.l(userId + str + "_img");
                    if (!TextUtils.isEmpty(l)) {
                        list = JSON.parseArray(l, String.class);
                    } else {
                        q9b q9bVar = q9b.INSTANCE;
                        ckf.f(userId, "userId");
                        list = q9b.a(q9bVar, d, userId, str);
                    }
                    if (list == null) {
                        list = new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!list.isEmpty()) {
                        for (String str2 : list) {
                            if ((str2 instanceof String) && str2.length() != 0) {
                                arrayList.add(new unm(str2, e, e, false));
                            }
                        }
                    }
                    ccv.b bVar = this.f26593a;
                    if (bVar != null) {
                        bVar.a(arrayList);
                    }
                }
            } catch (Throwable th) {
                hav.g("HybridPreRequestImageHelper", "asyncGetOListPrefetchImgList:", "throwable: " + th);
            }
        }
    }

    static {
        t2o.a(157286928);
    }

    public static final /* synthetic */ List a(q9b q9bVar, m9v m9vVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bce29feb", new Object[]{q9bVar, m9vVar, str, str2});
        }
        return q9bVar.e(m9vVar, str, str2);
    }

    public final void b(ccv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb05833a", new Object[]{this, bVar});
        } else {
            pav.k(new a(bVar));
        }
    }

    public final void c(ccv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4dd1f7", new Object[]{this, bVar});
        } else {
            pav.k(new b(bVar));
        }
    }

    public final TaobaoImageUrlStrategy.ImageQuality d(String str) {
        TaobaoImageUrlStrategy.ImageQuality imageQuality;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("cf8466e8", new Object[]{this, str});
        }
        ckf.g(str, "qualityStr");
        try {
            int hashCode = str.hashCode();
            if (hashCode != 110351) {
                if (hashCode == 110408 && str.equals(ImageAdapter.IMAGE_QUALITY_Q90)) {
                    imageQuality = TaobaoImageUrlStrategy.ImageQuality.q90;
                    return imageQuality;
                }
                imageQuality = TaobaoImageUrlStrategy.ImageQuality.non;
                return imageQuality;
            }
            if (str.equals("q75")) {
                imageQuality = TaobaoImageUrlStrategy.ImageQuality.q75;
                return imageQuality;
            }
            imageQuality = TaobaoImageUrlStrategy.ImageQuality.non;
            return imageQuality;
        } catch (Throwable unused) {
            return TaobaoImageUrlStrategy.ImageQuality.non;
        }
        return TaobaoImageUrlStrategy.ImageQuality.non;
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ccv.b f26594a;

        public b(ccv.b bVar) {
            this.f26594a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<String> list;
            String str;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            String a2 = j.g().a("first_data", ae2.BizKeyRefund);
            if (a2 == null) {
                hav.g("HybridPreRequestImageHelper", "asyncGetRefundListPrefetchImgList:", "cacheData is null");
                return;
            }
            int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_REFUND_LIST, ccv.PARAM_PREFETCH_IMG_SIZE, 320);
            try {
                JSONArray jSONArray = JSON.parseObject(a2).getJSONObject("resultData").getJSONObject("data").getJSONArray("disputeContainerList");
                if (jSONArray != null) {
                    ArrayList arrayList = new ArrayList(zz3.q(jSONArray, 10));
                    for (Object obj : jSONArray) {
                        if (!(obj instanceof JSONObject)) {
                            obj = null;
                        }
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String str2 = "";
                        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("itemInfoVO")) == null || (str = jSONObject.getString("picUrl")) == null) {
                            str = str2;
                        }
                        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(e), Integer.valueOf(e), ImageStrategyConfig.u("default").j(e).h(e).i(TaobaoImageUrlStrategy.ImageQuality.q90).a());
                        if (decideUrl != null) {
                            str2 = decideUrl;
                        }
                        arrayList.add(str2);
                    }
                    List B0 = i04.B0(arrayList);
                    List list2 = B0;
                    if (list2 != null && !list2.isEmpty()) {
                        if (B0.size() > 4) {
                            list = i04.S(B0.subList(0, 4));
                        } else {
                            list = i04.S(B0);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str3 : list) {
                            if (str3.length() != 0) {
                                arrayList2.add(new unm(str3, e, e, true));
                            }
                        }
                        ccv.b bVar = this.f26594a;
                        if (bVar != null) {
                            bVar.a(arrayList2);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final List<String> e(m9v m9vVar, String str, String str2) {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f233b3b8", new Object[]{this, m9vVar, str, str2});
        }
        try {
            String l = m9vVar.l(str + str2);
            if (TextUtils.isEmpty(l)) {
                qbv j = qbv.j();
                ckf.f(j, "UltronTradeHybridManager.getInstance()");
                bbv g = j.g();
                l = g.a(str + str2, dbv.BIZ_ORDER_LIST);
            }
            if (!TextUtils.isEmpty(l) && (parseObject = JSON.parseObject(l)) != null && (jSONObject = parseObject.getJSONObject("data")) != null && !jSONObject.isEmpty()) {
                int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "prefetchOListImgCnt", 3);
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    if (arrayList.size() >= e) {
                        break;
                    }
                    String key = entry.getKey();
                    if (key != null && key.length() != 0 && tsq.I(key, "item_", false, 2, null) && (entry.getValue() instanceof JSONObject)) {
                        Object value = entry.getValue();
                        if (value != null) {
                            JSONObject jSONObject3 = ((JSONObject) value).getJSONObject("fields");
                            if (!(jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("item")) == null || (string = jSONObject2.getString("pic")) == null || string.length() <= 0)) {
                                arrayList.add(string);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    m9vVar.s(str + str2 + "_img", JSON.toJSONString(arrayList));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
