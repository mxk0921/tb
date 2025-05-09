package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y9t extends zwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends f47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(y9t y9tVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/collaborator/TaokeAdCollaborator$1");
        }

        @Override // tb.f47, tb.sxj
        public void b(VerticalAbsViewHolder verticalAbsViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de29b8d4", new Object[]{this, verticalAbsViewHolder});
            } else if (verticalAbsViewHolder != null) {
                if ((!SuperItemViewHolder.VIEWHOLDER_KEY.equals(verticalAbsViewHolder.t0().b) && !"item".equals(verticalAbsViewHolder.t0().b)) || !verticalAbsViewHolder.t0().N()) {
                    return;
                }
                if (!verticalAbsViewHolder.v0().r() || !verticalAbsViewHolder.v0().j().N().g0() || !verticalAbsViewHolder.b1()) {
                    y9t.b(verticalAbsViewHolder.B0(), verticalAbsViewHolder.v0().i(), verticalAbsViewHolder.v0().j(), (ue7) verticalAbsViewHolder.t0());
                }
            }
        }

        @Override // tb.f47, tb.sxj
        public void c(VerticalAbsViewHolder verticalAbsViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a0182d5", new Object[]{this, verticalAbsViewHolder});
            } else if (verticalAbsViewHolder == null || !verticalAbsViewHolder.W0()) {
            } else {
                if (("item".equals(verticalAbsViewHolder.t0().b) || SuperItemViewHolder.VIEWHOLDER_KEY.equals(verticalAbsViewHolder.t0().b)) && verticalAbsViewHolder.t0().N()) {
                    y9t.b(verticalAbsViewHolder.B0(), verticalAbsViewHolder.v0().i(), verticalAbsViewHolder.v0().j(), (ue7) verticalAbsViewHolder.t0());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements pyj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(y9t y9tVar) {
        }

        @Override // tb.pyj
        public Map<String, String> a(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, x3w x3wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("28bbee2e", new Object[]{this, activity, new Integer(i), str, str2, str3, map, x3wVar});
            }
            if (x3wVar instanceof ue7) {
                return y9t.c(activity, i, str, str2, str3, map, (ue7) x3wVar);
            }
            return null;
        }
    }

    static {
        t2o.a(352321577);
    }

    public static /* synthetic */ void b(utv utvVar, Activity activity, com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db49c731", new Object[]{utvVar, activity, aVar, ue7Var});
        } else {
            e(utvVar, activity, aVar, ue7Var);
        }
    }

    public static /* synthetic */ Map c(Activity activity, int i, String str, String str2, String str3, Map map, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b52d3ac9", new Object[]{activity, new Integer(i), str, str2, str3, map, ue7Var});
        }
        return f(activity, i, str, str2, str3, map, ue7Var);
    }

    public static void d(String str, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57812ad1", new Object[]{str, ue7Var});
            return;
        }
        o2r.a("commitTaokeInfoWithAfcId");
        HashMap hashMap = new HashMap();
        hashMap.put(ah0.AFC_ID, "");
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (!TextUtils.isEmpty(globalProperty)) {
                hashMap.put(ah0.AFC_ID, globalProperty);
            }
            AlimamaAdvertising.instance().commitTaokeInfo(str, ue7Var.K0(), ue7Var.h, ue7Var.P0(), hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_NewDetail", 2101, "NewDetail_Button_Advert_SDKCall", "", "", null).build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        o2r.b();
    }

    public static void e(utv utvVar, Activity activity, com.taobao.android.detail2.core.framework.data.global.a aVar, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9b790f", new Object[]{utvVar, activity, aVar, ue7Var});
            return;
        }
        o2r.a("trackCompleteExposureAd");
        if (activity == null) {
            o2r.b();
            return;
        }
        Uri data = activity.getIntent().getData();
        d((data == null || ue7Var.f31127a != 0) ? null : data.toString(), ue7Var);
        if (ue7Var.A || ue7Var.f31127a != 0) {
            o2r.b();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickid", aVar.q());
        utvVar.l("", hashMap);
        o2r.b();
    }

    public static Map<String, String> f(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, ue7 ue7Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a16e49a", new Object[]{activity, new Integer(i), str, str2, str3, map, ue7Var});
        }
        if (ue7Var == null || (jSONObject = ue7Var.q) == null || !"ad".equals(jSONObject.getString(q0j.BIZ_CONTEXT_KEY_CARD_TYPE)) || (jSONObject2 = ue7Var.q.getJSONObject("utAdList")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null || !jSONObject3.getString(tmu.UT_TYPE).equals(String.valueOf(i))) {
            return null;
        }
        String string = jSONObject3.getString("adUrlType");
        if (TextUtils.isEmpty(string) || (jSONObject4 = ue7Var.q.getJSONObject("adArgs")) == null) {
            return null;
        }
        String string2 = jSONObject4.getString(string);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        if (jSONObject5 != null) {
            Uri.Builder buildUpon = Uri.parse(string2).buildUpon();
            for (Map.Entry<String, Object> entry : jSONObject5.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        buildUpon.appendQueryParameter(key, (String) value);
                    }
                }
            }
            string2 = buildUpon.toString();
        }
        if (i == 2101) {
            String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(string2);
            if (TextUtils.isEmpty(handleAdUrlForClickid)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("clickid", handleAdUrlForClickid);
            return hashMap;
        }
        if (i == 2201) {
            AlimamaAdvertising.instance().buildIfsExposure(activity.getApplication(), string2).withArgPid("431468_1007").withArgNamespace("newdetail").commit();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(y9t y9tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/collaborator/TaokeAdCollaborator");
    }

    @Override // tb.zwj
    public void a(oxj oxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557e54c4", new Object[]{this, oxjVar});
        } else if (oxjVar != null) {
            oxjVar.e(new a(this));
            oxjVar.f(new b(this));
        }
    }
}
