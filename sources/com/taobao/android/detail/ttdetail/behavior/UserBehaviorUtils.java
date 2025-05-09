package com.taobao.android.detail.ttdetail.behavior;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import tb.oa4;
import tb.pg1;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UserBehaviorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAVI_BAR_CART = "click_cart";
    public static final String ACTION_NAVI_BAR_COLLECT = "click_collect";
    public static final String ACTION_NAVI_BAR_MORE = "click_more";
    public static final String ACTION_NAVI_BAR_SEARCH = "click_search";
    public static final String ACTION_NAVI_BAR_SHARE = "click_share";
    public static final String COMPONENT_NAME_GALLERY_CONTAINER = "GalleryContainer";
    public static final String COMPONENT_NAME_GALLERY_LIGHTOFF_CONTAINER = "GalleryLightoffContainer";
    public static final String COMPONENT_NAME_NAVI_BAR = "NaviBar";
    public static final String COMPONENT_NAME_NAVI_TAB = "NaviTab";

    static {
        t2o.a(912261307);
    }

    public static boolean a(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95c6a7c", new Object[]{jSONArray, new Integer(i)})).booleanValue();
        }
        if (jSONArray == null || jSONArray.size() <= 0) {
            return false;
        }
        return TextUtils.equals(BehaviorChainGenerator.d(i), jSONArray.getJSONObject(jSONArray.size() - 1).getString("behavior_type"));
    }

    public static void f(Context context, oa4 oa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e764d08", new Object[]{context, oa4Var});
            return;
        }
        c(context, oa4Var);
        d(context, oa4Var);
        e(context, oa4Var);
        b(context, oa4Var);
    }

    public static void e(Context context, oa4 oa4Var) {
        JSONObject f;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad44283", new Object[]{context, oa4Var});
        } else if ("detail3Service".equalsIgnoreCase(RuntimeUtils.d(oa4Var)) && (f = oa4Var.getComponentData().f()) != null && !f.isEmpty() && (jSONObject = f.getJSONObject("group")) != null && !jSONObject.isEmpty() && (jSONArray = jSONObject.getJSONArray("items")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONArray(pg1.ATOM_values);
                if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                    UserBehaviorTracker.k(context, "detail3Service", pg1.ATOM_values, jSONArray2);
                }
            } catch (Throwable th) {
                tgh.c("UserBehaviorUtils", "put detail3Service values error", th);
            }
        }
    }

    public static void b(Context context, oa4 oa4Var) {
        JSONObject f;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5519572d", new Object[]{context, oa4Var});
        } else if ("detail3Comment".equalsIgnoreCase(RuntimeUtils.d(oa4Var)) && (f = oa4Var.getComponentData().f()) != null && !f.isEmpty() && (jSONArray = f.getJSONArray("keywords")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        String string = jSONObject.getString(TaoliveSearchHotWords.TYPE_WORD);
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject(string) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils.3
                                public final /* synthetic */ String val$word;

                                {
                                    this.val$word = string;
                                    put(TaoliveSearchHotWords.TYPE_WORD, (Object) string);
                                }
                            });
                        }
                    }
                }
                if (!jSONArray2.isEmpty()) {
                    UserBehaviorTracker.k(context, "detail3Comment", "keywords", jSONArray2);
                }
            } catch (Throwable th) {
                tgh.c("UserBehaviorUtils", "put detail3Comment keywords error", th);
            }
        }
    }

    public static void c(Context context, oa4 oa4Var) {
        JSONObject f;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667fab38", new Object[]{context, oa4Var});
        } else if ("detail3GoodsTag".equalsIgnoreCase(RuntimeUtils.d(oa4Var)) && (f = oa4Var.getComponentData().f()) != null && !f.isEmpty() && (jSONArray = f.getJSONArray("tags")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject(string) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils.1
                                public final /* synthetic */ String val$text;

                                {
                                    this.val$text = string;
                                    put("text", (Object) string);
                                }
                            });
                        }
                    }
                }
                if (!jSONArray2.isEmpty()) {
                    UserBehaviorTracker.k(context, "detail3GoodsTag", "tags", jSONArray2);
                }
            } catch (Throwable th) {
                tgh.c("UserBehaviorUtils", "put detail3GoodsTag tags error", th);
            }
        }
    }

    public static void d(Context context, oa4 oa4Var) {
        JSONObject f;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87813c6", new Object[]{context, oa4Var});
        } else if ("detail3GoodsTagAdjusted".equalsIgnoreCase(RuntimeUtils.d(oa4Var)) && (f = oa4Var.getComponentData().f()) != null && !f.isEmpty() && (jSONArray = f.getJSONArray("tags")) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            jSONArray2.add(new JSONObject(string) { // from class: com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils.2
                                public final /* synthetic */ String val$text;

                                {
                                    this.val$text = string;
                                    put("text", (Object) string);
                                }
                            });
                        }
                    }
                }
                if (!jSONArray2.isEmpty()) {
                    UserBehaviorTracker.k(context, "detail3GoodsTagAdjusted", "tags", jSONArray2);
                }
            } catch (Throwable th) {
                tgh.c("UserBehaviorUtils", "put detail3GoodsTagAdjusted tags error", th);
            }
        }
    }
}
