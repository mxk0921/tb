package com.taobao.android.detail.ttdetail.data.converter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.d1i;
import tb.ef7;
import tb.ekj;
import tb.hny;
import tb.ie7;
import tb.jov;
import tb.kf7;
import tb.mop;
import tb.nb4;
import tb.nkj;
import tb.qg7;
import tb.rg0;
import tb.sqj;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.xka;
import tb.yns;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailV3Converter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CARD = 1;
    public static final int TYPE_MASK = 1;
    public static final int TYPE_NONE = 0;
    public static final String ULTRON_BOTTOM_BAR = "bottomBar";

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f6739a = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.1
        {
            put("native$descSuffixShrink", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.1.1
                {
                    put("name", "descSuffixShrink");
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject b = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.2
        {
            put("native$_industry_divider_", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.2.1
                {
                    put("name", ekj.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject c = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.3
        {
            put("native$headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.3.1
                {
                    put("name", "headerPic");
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject d = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.4
        {
            put("native$navBar", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.4.1
                {
                    put("name", "navBar");
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject e = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.5
        {
            put("native$division", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.5.1
                {
                    put("name", kf7.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject f = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.6
        {
            put("native$detaildesc", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.6.1
                {
                    put("name", ef7.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject g = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.7
        {
            put("native$guessyoulike", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.7.1
                {
                    put("name", qg7.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject h = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.8
        {
            put("native$aimatch", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.8.1
                {
                    put("name", ie7.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject i = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.9
        {
            put("native$headerlivephoto", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.9.1
                {
                    put("name", nkj.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject k = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.10
        {
            put("native$detail3shopredpacket", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.10.1
                {
                    put("name", hny.NAME);
                    put("type", "native");
                    put("version", "0");
                    put("url", "");
                }
            });
        }
    };
    public static final JSONObject l = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.11
        {
            put("containerType", "native");
            put("name", hny.NAME);
            put("type", (Object) new JSONArray() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.11.1
                {
                    add("native$detail3shopredpacket");
                }
            });
            put("version", "0");
        }
    };
    public static final List<String> j = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.12
        {
            add("apiStack");
        }
    };

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$19  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AnonymousClass19 extends JSONObject {
        public final /* synthetic */ String val$descRenderType;
        public final /* synthetic */ JSONObject val$mergedData;

        public AnonymousClass19(String str, JSONObject jSONObject) {
            this.val$descRenderType = str;
            this.val$mergedData = jSONObject;
            put("id", (Object) UUID.randomUUID().toString());
            put("type", (Object) str);
            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.19.1
                {
                    put("bizId", "desc");
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.19.1.1
                        {
                            JSONObject jSONObject2 = AnonymousClass19.this.val$mergedData.getJSONObject("item");
                            JSONObject jSONObject3 = AnonymousClass19.this.val$mergedData.getJSONObject("seller");
                            put("itemId", (Object) jSONObject2.getString("itemId"));
                            put("moduleDescParams", (Object) jSONObject2.getJSONObject("moduleDescParams"));
                            put("shopId", (Object) jSONObject3.getString("shopId"));
                            put("taobaoDescUrl", (Object) jSONObject2.getString("taobaoDescUrl"));
                            put("taobaoPcDescUrl", (Object) jSONObject2.getString("taobaoPcDescUrl"));
                            put("userId", (Object) jSONObject3.getString("userId"));
                        }
                    });
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$29  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AnonymousClass29 extends JSONObject {
        public final /* synthetic */ JSONArray val$children;
        public final /* synthetic */ String val$current;

        public AnonymousClass29(String str, JSONArray jSONArray) {
            this.val$current = str;
            this.val$children = jSONArray;
            put("component", (Object) ("native$" + str));
            put("children", (Object) jSONArray);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$30  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AnonymousClass30 extends ArrayList<String> {
        public final /* synthetic */ String val$current;

        public AnonymousClass30(String str) {
            this.val$current = str;
            add(str);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$31  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class AnonymousClass31 implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f6743a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;

        public AnonymousClass31(JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f6743a = jSONArray;
            this.b = jSONObject;
            this.c = jSONObject2;
        }

        @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
        public void a(String str, JSONObject jSONObject, JSONObject jSONObject2, List<String> list, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0e95b37", new Object[]{this, str, jSONObject, jSONObject2, list, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            jSONObject.put("id", (Object) UUID.randomUUID().toString());
            DetailV3Converter.a(jSONObject, list);
            DetailV3Converter.b(jSONObject, str);
            String string = jSONObject.getString("type");
            this.f6743a.add(new JSONObject(string, str) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.31.1
                public final /* synthetic */ String val$renderType;
                public final /* synthetic */ String val$structureNode;

                {
                    this.val$renderType = string;
                    this.val$structureNode = str;
                    put("component", (Object) string);
                    put("props", (Object) ("$model." + str));
                }
            });
            this.b.put(string, (Object) jSONObject2);
            this.c.put(str, (Object) jSONObject);
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface LayoutType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(String str, JSONObject jSONObject, JSONObject jSONObject2, List<String> list, int i, int i2, int i3);
    }

    static {
        t2o.a(912261550);
    }

    public static boolean A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ad50b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("components");
        JSONObject jSONObject3 = jSONObject.getJSONObject(d1i.KEY_LAYOUT_INFO);
        JSONObject jSONObject4 = jSONObject.getJSONObject("meta");
        JSONObject jSONObject5 = jSONObject.getJSONObject("model");
        if (jSONObject2 == null || jSONObject2.isEmpty() || jSONObject3 == null || jSONObject3.isEmpty() || jSONObject4 == null || jSONObject4.isEmpty() || jSONObject5 == null || jSONObject5.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void D(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded76f4b", new Object[]{jSONObject, list});
        } else if (jSONObject != null) {
            if (list == null) {
                list = new ArrayList<>(0);
            }
            jSONObject.put(nb4.KEY_PARENT, (Object) JSON.toJSONString(list));
        }
    }

    public static void E(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a475c31a", new Object[]{jSONObject, str});
        } else if (jSONObject != null) {
            jSONObject.put(nb4.KEY_ULTRON_NAME, (Object) str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> F(boolean r28, java.lang.String r29, java.util.List<java.lang.String> r30, com.alibaba.fastjson.JSONObject r31, com.alibaba.fastjson.JSONObject r32, com.alibaba.fastjson.JSONArray r33, boolean r34, java.util.List<java.lang.String> r35, int r36, int r37, int r38, com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a r39) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.F(boolean, java.lang.String, java.util.List, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONArray, boolean, java.util.List, int, int, int, com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter$a):java.util.List");
    }

    public static void G(final String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, final JSONObject jSONObject3, final JSONObject jSONObject4, final JSONObject jSONObject5, final boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c945090d", new Object[]{str, str2, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5, new Boolean(z)});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            i2 = 1;
        } else {
            i2 = jSONArray2.size();
        }
        F(false, str2, null, jSONObject, jSONObject2, jSONArray, z, new ArrayList<String>(str2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.27
            public final /* synthetic */ String val$child;

            {
                this.val$child = str2;
                add(str2);
            }
        }, 0, 0, i2, new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
            public void a(String str3, JSONObject jSONObject6, JSONObject jSONObject7, List<String> list, int i3, int i4, int i5) {
                JSONObject jSONObject8;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str3, jSONObject6, jSONObject7, list, new Integer(i3), new Integer(i4), new Integer(i5)});
                    return;
                }
                jSONObject6.put("id", (Object) UUID.randomUUID().toString());
                DetailV3Converter.a(jSONObject6, list);
                DetailV3Converter.b(jSONObject6, str3);
                String string = jSONObject6.getString("type");
                JSONObject.this.put(str, (Object) new JSONObject(string, str3) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.28.1
                    public final /* synthetic */ String val$renderType;
                    public final /* synthetic */ String val$structureNode;

                    {
                        this.val$renderType = string;
                        this.val$structureNode = str3;
                        put("component", (Object) string);
                        put("props", (Object) ("$model." + str3));
                    }
                });
                if (!z) {
                    jSONObject3.put(string, (Object) jSONObject7);
                }
                jSONObject5.put(str3, (Object) jSONObject6);
                JSONObject jSONObject9 = jSONObject6.getJSONObject("fields");
                if (jSONObject9 != null && (jSONObject8 = jSONObject9.getJSONObject("payload")) != null) {
                    boolean booleanValue = jSONObject8.getBooleanValue("shrinkPriceInfo");
                    if (TextUtils.equals("description", str) && booleanValue) {
                        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(jSONObject6, SerializerFeature.DisableCircularReferenceDetect));
                        parseObject.put("id", (Object) UUID.randomUUID().toString());
                        parseObject.put("type", (Object) "native$descSuffixShrink");
                        JSONObject.this.put("descSuffixShrink", (Object) new JSONObject("descSuffixShrink") { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.28.2
                            public final /* synthetic */ String val$shrinkComponent;

                            {
                                this.val$shrinkComponent = r3;
                                put("component", (Object) r3);
                                put("props", (Object) ("$model." + r3));
                            }
                        });
                        jSONObject3.putAll(DetailV3Converter.d());
                        jSONObject5.put("descSuffixShrink", (Object) parseObject);
                    }
                }
            }
        });
    }

    public static /* synthetic */ void a(JSONObject jSONObject, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b479f94a", new Object[]{jSONObject, list});
        } else {
            D(jSONObject, list);
        }
    }

    public static /* synthetic */ void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e413fb02", new Object[]{jSONObject, str});
        } else {
            E(jSONObject, str);
        }
    }

    public static /* synthetic */ void c(JSONObject jSONObject, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323bd6b7", new Object[]{jSONObject, new Integer(i2), new Integer(i3)});
        } else {
            C(jSONObject, i2, i3);
        }
    }

    public static /* synthetic */ JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d83fc5a", new Object[0]);
        }
        return f6739a;
    }

    public static /* synthetic */ String e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da699e21", new Object[]{jSONObject, str});
        }
        return t(jSONObject, str);
    }

    public static int f(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90d74f74", new Object[]{new Integer(i2), new Integer(i3)})).intValue();
        }
        if (x(i2)) {
            return i2;
        }
        return i3;
    }

    public static JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f721aeb5", new Object[]{jSONObject});
        }
        if (!B(jSONObject)) {
            return jSONObject;
        }
        JSONObject f2 = DynamicMergeUtils.f(jSONObject);
        JSONObject jSONObject2 = f2.getJSONObject("components");
        JSONObject jSONObject3 = f2.getJSONObject(d1i.KEY_LAYOUT_INFO);
        JSONObject jSONObject4 = f2.getJSONObject("model");
        JSONObject jSONObject5 = f2.getJSONObject("meta");
        if (z(jSONObject)) {
            return jSONObject;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            f2.put("components", (Object) jSONObject2);
        }
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
            f2.put("model", (Object) jSONObject4);
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            f2.put(d1i.KEY_LAYOUT_INFO, (Object) jSONObject3);
        }
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
            f2.put("meta", (Object) jSONObject5);
        }
        r(jSONObject, f2, jSONObject2, jSONObject3, jSONObject4);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!((ArrayList) j).contains(entry.getKey())) {
                jSONObject5.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static void h(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04458a", new Object[]{str, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5});
        } else {
            G("bottomBar", str, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject4, jSONObject5, false);
        }
    }

    public static void j(JSONObject jSONObject, JSONObject jSONObject2, String str, JSONObject jSONObject3, final JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152d4928", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        jSONObject5.putAll(d);
        jSONObject6.put("navBar", (Object) new JSONObject("native$navBar", TBBuyPreloadScene.NAV) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.36
            public final /* synthetic */ String val$navModelKey;
            public final /* synthetic */ String val$navRenderType;

            {
                this.val$navRenderType = r2;
                this.val$navModelKey = r3;
                put("component", (Object) r2);
                put("props", (Object) ("$model." + r3));
            }
        });
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject8 = new JSONObject("native$navBar", jSONObject2, jSONArray2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.37
            public final /* synthetic */ JSONObject val$esi;
            public final /* synthetic */ String val$navRenderType;
            public final /* synthetic */ JSONArray val$navRights;

            {
                this.val$navRenderType = r3;
                this.val$esi = jSONObject2;
                this.val$navRights = jSONArray2;
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r3);
                JSONObject jSONObject9 = jSONObject2.getJSONObject("anchorpoint");
                if (jSONObject9 != null) {
                    put("title", (Object) new JSONObject(jSONObject9) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.37.1
                        public final /* synthetic */ JSONObject val$anchorPoint;

                        {
                            this.val$anchorPoint = jSONObject9;
                            String string = jSONObject9.getString("detailExtraTitle");
                            put("detail", (Object) (TextUtils.isEmpty(string) ? jSONObject9.getString("detailTitle") : string));
                            put("content", (Object) jSONObject9.getString("contentTitle"));
                            put("shop", (Object) jSONObject9.getString("shopTitle"));
                            put(mop.KEY_APM_SHOP_URL, (Object) jSONObject9.getString(mop.KEY_APM_SHOP_URL));
                        }
                    });
                }
                put("right", (Object) jSONArray2);
            }
        };
        jSONObject8.put("search", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.38
            {
                JSONObject jSONObject9;
                put("icon", "끺");
                put(TaoliveSearchHotWords.TYPE_HINT, "搜索");
                JSONObject jSONObject10 = JSONObject.this.getJSONObject("diversion");
                String str2 = "";
                put("action", (Object) ((jSONObject10 == null || (jSONObject9 = jSONObject10.getJSONObject("detailTopSearch")) == null) ? str2 : jSONObject9.getString("url")));
                JSONObject jSONObject11 = JSONObject.this.getJSONObject("feature");
                put("asyncText", (Object) (jSONObject11 != null ? jSONObject11.getString("asyncLoadSearchInfo") : str2));
            }
        });
        Iterator<JSONObject> it = new ArrayList<JSONObject>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.39
            {
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.39.1
                    {
                        put("positionKey", "share");
                        put("value", "ꄪ");
                        put("accessHint", "分享");
                    }
                });
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.39.2
                    {
                        put("positionKey", "cart");
                        put("value", "ꁊ");
                        put("accessHint", "购物车");
                        put(rg0.JUMP_URL, (Object) DetailV3Converter.e(JSONObject.this, "https://h5.m.taobao.com/awp/base/cart.htm"));
                    }
                });
                add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.39.3
                    {
                        put("positionKey", "more");
                        put("value", "ꁪ");
                        put("accessHint", sqj.MORE_BUTTON);
                    }
                });
            }
        }.iterator();
        while (it.hasNext()) {
            jSONArray2.add(new JSONObject(jSONObject) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.40
                public final /* synthetic */ JSONObject val$mergedData;

                {
                    String str2;
                    String str3;
                    JSONObject jSONObject9;
                    this.val$mergedData = jSONObject;
                    String string = JSONObject.this.getString("positionKey");
                    put("key", (Object) string);
                    put("icon", (Object) JSONObject.this.getString("value"));
                    put(TaoliveSearchHotWords.TYPE_HINT, (Object) JSONObject.this.getString("accessHint"));
                    String string2 = JSONObject.this.getString(rg0.JUMP_URL);
                    put("action", (Object) (TextUtils.isEmpty(string2) ? string : string2));
                    if (TextUtils.equals("cart", string)) {
                        JSONObject jSONObject10 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE);
                        if (jSONObject10 == null || (jSONObject9 = jSONObject10.getJSONObject("cartIcon")) == null) {
                            str3 = "";
                            str2 = str3;
                        } else {
                            str3 = jSONObject9.getString("showBadge");
                            str2 = jSONObject9.getString("count");
                        }
                        put("showBadge", (Object) str3);
                        put("badge", (Object) str2);
                    }
                }
            });
        }
        jSONObject8.put("tabs", (Object) k(jSONObject3, jSONObject4, jSONArray));
        E(jSONObject8, str);
        jSONObject7.put(TBBuyPreloadScene.NAV, (Object) jSONObject8);
    }

    public static JSONArray k(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7db74f6c", new Object[]{jSONObject, jSONObject2, jSONArray});
        }
        final JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = jSONObject.getJSONArray("naviTabs");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            i2 = 1;
        } else {
            i2 = jSONArray3.size();
        }
        F(true, "naviTabs", null, jSONObject, jSONObject2, jSONArray, true, new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.44
            {
                add("naviTabs");
            }
        }, 0, 0, i2, new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.45
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
            public void a(String str, JSONObject jSONObject3, JSONObject jSONObject4, List<String> list, int i3, int i4, int i5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str, jSONObject3, jSONObject4, list, new Integer(i3), new Integer(i4), new Integer(i5)});
                    return;
                }
                JSONObject jSONObject5 = jSONObject3.getJSONObject("fields");
                JSONObject jSONObject6 = jSONObject5.getJSONObject("payload");
                if (jSONObject6 != null) {
                    String string = jSONObject6.getString("title");
                    if (!TextUtils.isEmpty(string)) {
                        JSONArray.this.add(new JSONObject(string, jSONObject5) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.45.1
                            public final /* synthetic */ JSONObject val$fields;
                            public final /* synthetic */ String val$title;

                            {
                                this.val$title = string;
                                this.val$fields = jSONObject5;
                                put("name", (Object) string);
                                put("targetBizId", (Object) jSONObject5.getString("targetBizId"));
                            }
                        });
                    }
                }
            }
        });
        return jSONArray2;
    }

    public static void o(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, JSONArray jSONArray, final JSONObject jSONObject4, JSONObject jSONObject5, final JSONObject jSONObject6) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d6e8db", new Object[]{jSONObject, str, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6});
            return;
        }
        jSONObject4.putAll(c);
        jSONObject5.put("headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.13
            {
                put("component", "native$headerPic");
                put("props", "$model.headerPic");
            }
        });
        TinyShopDetailHeaderPicConverter.d(jSONObject, jSONObject4, jSONObject6);
        final JSONArray jSONArray2 = new JSONArray();
        jSONObject5.put("mainScreen", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.14
            {
                put("component", "native$mainScreen");
                put("children", (Object) JSONArray.this);
            }
        });
        JSONArray jSONArray3 = jSONObject2.getJSONArray(str);
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            i2 = 1;
        } else {
            i2 = jSONArray3.size();
        }
        F(true, str, Collections.singletonList("detailHeaderPic"), jSONObject2, jSONObject3, jSONArray, false, new ArrayList<String>(str) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.15
            public final /* synthetic */ String val$current;

            {
                this.val$current = str;
                add(str);
            }
        }, 0, 0, i2, new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
            public void a(String str2, JSONObject jSONObject7, JSONObject jSONObject8, List<String> list, int i3, int i4, int i5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str2, jSONObject7, jSONObject8, list, new Integer(i3), new Integer(i4), new Integer(i5)});
                    return;
                }
                jSONObject7.put("id", (Object) UUID.randomUUID().toString());
                DetailV3Converter.a(jSONObject7, list);
                DetailV3Converter.b(jSONObject7, str2);
                String string = jSONObject7.getString("type");
                JSONArray.this.add(new JSONObject(string, str2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.16.1
                    public final /* synthetic */ String val$renderType;
                    public final /* synthetic */ String val$structureNode;

                    {
                        this.val$renderType = string;
                        this.val$structureNode = str2;
                        put("component", (Object) string);
                        put("props", (Object) ("$model." + str2));
                    }
                });
                jSONObject4.put(string, (Object) jSONObject8);
                jSONObject6.put(str2, (Object) jSONObject7);
            }
        });
        jSONObject4.putAll(e);
        JSONObject jSONObject7 = new JSONObject("native$division") { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.17
            public final /* synthetic */ String val$divisionRenderType;

            {
                this.val$divisionRenderType = r3;
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r3);
                put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.17.1
                    {
                        put("bizId", "desc");
                        put("payload", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.17.1.1
                            {
                                put("displayType", "text");
                                put("fgcolor", "0x666666");
                                put("title", "宝贝详情");
                            }
                        });
                    }
                });
            }
        };
        E(jSONObject7, yns.KEY_DIVISION_DESC);
        jSONObject5.put(yns.KEY_DIVISION_DESC, (Object) new JSONObject("native$division") { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.18
            public final /* synthetic */ String val$divisionRenderType;

            {
                this.val$divisionRenderType = r2;
                put("component", (Object) r2);
                put("props", "$model.divisionDesc");
            }
        });
        jSONObject6.put(yns.KEY_DIVISION_DESC, (Object) jSONObject7);
        jSONObject4.putAll(f);
        AnonymousClass19 r1 = new AnonymousClass19("native$detaildesc", jSONObject);
        E(r1, "description");
        jSONObject5.put("description", (Object) new JSONObject("native$detaildesc") { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.20
            public final /* synthetic */ String val$descRenderType;

            {
                this.val$descRenderType = r2;
                put("component", (Object) r2);
                put("props", "$model.description");
            }
        });
        jSONObject6.put("description", (Object) r1);
    }

    public static void r(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6374aaaf", new Object[]{jSONObject, jSONObject2, jSONObject3, jSONObject4, jSONObject5});
            return;
        }
        JSONObject jSONObject6 = jSONObject2.getJSONObject("hierarchy");
        n(jSONObject, jSONObject2, jSONObject6.getString("root"), jSONObject6.getJSONObject("structure"), jSONObject2.getJSONObject("data"), jSONObject2.getJSONObject("container").getJSONArray("data"), jSONObject3, jSONObject4, jSONObject5);
    }

    public static boolean u(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a675ae", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("model");
        if (jSONObject3 == null || jSONObject3.isEmpty() || (jSONObject2 = jSONObject3.getJSONObject("headerPic")) == null || jSONObject2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean w(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b63647e", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("headerPic");
        if (jSONObject3 == null || jSONObject3.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("mainContainer")) == null || jSONObject2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean x(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f653d22c", new Object[]{new Integer(i2)})).booleanValue();
        }
        if ((i2 & 1) == 1) {
            return true;
        }
        return false;
    }

    public static boolean y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da03c294", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null && !jSONObject2.isEmpty() && jSONObject2.getBooleanValue("finalUltron") && !jSONObject2.getBooleanValue("detail3")) {
            return true;
        }
        return false;
    }

    public static boolean z(JSONObject jSONObject) {
        JSONObject f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c30c64", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (f2 = DynamicMergeUtils.f(jSONObject)) == null || f2.isEmpty()) {
            return false;
        }
        JSONObject jSONObject2 = f2.getJSONObject("components");
        JSONObject jSONObject3 = f2.getJSONObject(d1i.KEY_LAYOUT_INFO);
        JSONObject jSONObject4 = f2.getJSONObject("meta");
        JSONObject jSONObject5 = f2.getJSONObject("model");
        if (jSONObject2 == null || jSONObject2.isEmpty() || jSONObject3 == null || jSONObject3.isEmpty() || jSONObject4 == null || jSONObject4.isEmpty() || jSONObject5 == null || jSONObject5.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void C(JSONObject jSONObject, int i2, int i3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6397ed", new Object[]{jSONObject, new Integer(i2), new Integer(i3)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("fields", (Object) jSONObject2);
        }
        if (i3 == 1) {
            str = CredentialRpcData.ACTION_BOTH;
        } else if (i2 == 0) {
            str = "top";
        } else if (i2 == i3 - 1) {
            str = "bottom";
        } else {
            str = "none";
        }
        jSONObject2.put("cornerType", (Object) str);
    }

    public static boolean B(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e4e7eff", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            tgh.b("DetailV3Converter", "mergedData is null");
            return false;
        } else if (z(jSONObject)) {
            return true;
        } else {
            Boolean bool = Boolean.FALSE;
            Map<String, Boolean> map = DevFeature.mFeature;
            if (bool.equals(map.get(DevFeature.sForceConvertUltron))) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    tgh.b("DetailV3Converter", "feature节点为空");
                    return false;
                } else if (!jSONObject2.getBooleanValue("finalUltron") && !jSONObject2.getBooleanValue("detail3")) {
                    tgh.b("DetailV3Converter", "不是行业化且不是详情3.0");
                    return false;
                }
            }
            JSONObject f2 = DynamicMergeUtils.f(jSONObject);
            if (f2 == null || f2.isEmpty()) {
                tgh.b("DetailV3Converter", "esi动态数据为空");
                return false;
            }
            JSONObject jSONObject3 = f2.getJSONObject("hierarchy");
            if (jSONObject3 == null || jSONObject3.isEmpty()) {
                tgh.b("DetailV3Converter", "hierarchy节点为空");
                return false;
            }
            JSONObject jSONObject4 = jSONObject3.getJSONObject("structure");
            if (jSONObject4 == null || jSONObject4.isEmpty()) {
                tgh.b("DetailV3Converter", "structure节点为空");
                return false;
            }
            JSONObject jSONObject5 = f2.getJSONObject("data");
            if (jSONObject5 == null || jSONObject5.isEmpty()) {
                tgh.b("DetailV3Converter", "data节点为空");
                return false;
            }
            JSONObject jSONObject6 = f2.getJSONObject("container");
            if (jSONObject6 == null || jSONObject6.isEmpty()) {
                tgh.b("DetailV3Converter", "container节点为空");
                return false;
            }
            JSONArray jSONArray = jSONObject6.getJSONArray("data");
            if (jSONArray == null || jSONArray.isEmpty()) {
                tgh.b("DetailV3Converter", "container.data节点为空");
                return false;
            }
            if (bool.equals(map.get(DevFeature.sForceConvertUltron))) {
                JSONObject jSONObject7 = jSONObject.getJSONObject("feature");
                if ((!w(jSONObject5) || !Boolean.TRUE.equals(map.get(DevFeature.sForceConvertIndustryHeader))) && (!u(f2) || jSONObject7 == null || !jSONObject7.getBooleanValue("detail3HeadPic"))) {
                    tgh.b("DetailV3Converter", "不是行业化奥创头图且新头图节点没有数据");
                    return false;
                }
            }
            if (!y(jSONObject) || !Boolean.TRUE.equals(map.get(DevFeature.sDowngradeIndustry))) {
                return true;
            }
            tgh.b("DetailV3Converter", "非详情3.0的行业化降级");
            return false;
        }
    }

    public static JSONObject p(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("99bc48b0", new Object[]{str, jSONArray});
        }
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            JSONArray jSONArray2 = jSONObject.getJSONArray("type");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                int size2 = jSONArray2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (TextUtils.equals(str, jSONArray2.getString(i3))) {
                        String string = jSONObject.getString("name");
                        String string2 = jSONObject.getString("containerType");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            return new JSONObject(string, string2, jSONObject) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.46
                                public final /* synthetic */ JSONObject val$component;
                                public final /* synthetic */ String val$ultronContainerName;
                                public final /* synthetic */ String val$ultronContainerType;

                                {
                                    this.val$ultronContainerName = string;
                                    this.val$ultronContainerType = string2;
                                    this.val$component = jSONObject;
                                    put("name", (Object) string);
                                    put("type", (Object) string2);
                                    put("version", (Object) jSONObject.getString("version"));
                                    put("url", (Object) jSONObject.getString("url"));
                                }
                            };
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void q(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2098d412", new Object[]{jSONObject});
        } else if (vbl.S() && jSONObject != null && (jSONArray = jSONObject.getJSONArray("groups")) != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                if (jSONObject4 != null && TextUtils.equals("image", jSONObject4.getString(xka.KEY_LOCATOR_ID)) && (jSONArray2 = jSONObject4.getJSONArray("items")) != null && !jSONArray2.isEmpty()) {
                    int size2 = jSONArray2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        JSONObject jSONObject5 = jSONArray2.getJSONObject(i3);
                        if (!(jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("content")) == null || (jSONObject3 = jSONObject2.getJSONObject("fields")) == null || !TextUtils.equals("livePhoto", jSONObject3.getString("subType")))) {
                            jSONObject2.put("type", "native$headerlivephoto");
                        }
                    }
                }
            }
        }
    }

    public static String t(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da49568", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("naviItemCustom");
        if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("events")) == null || (jSONArray = jSONObject2.getJSONArray("actions")) == null)) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                if (!(jSONObject5 == null || !"open_url".equalsIgnoreCase(jSONObject5.getString("type")) || (jSONObject3 = jSONObject5.getJSONObject("fields")) == null)) {
                    String string = jSONObject3.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        return jov.a(string, jSONObject3.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS));
                    }
                }
            }
        }
        return str;
    }

    public static boolean v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83abbc9a", new Object[]{jSONObject})).booleanValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ttNaviBar");
        return jSONArray != null && !jSONArray.isEmpty();
    }

    public static int s(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3063dc3", new Object[]{jSONObject, str})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            String string = jSONObject2.getString("type");
            if (!TextUtils.isEmpty(string)) {
                String[] split = string.split("\\$");
                return (split.length < 2 || !TextUtils.equals(split[0], "layout") || !TextUtils.equals(split[1], "card")) ? 0 : 1;
            }
        }
        return 0;
    }

    public static void n(JSONObject jSONObject, JSONObject jSONObject2, String str, JSONObject jSONObject3, JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6060a5c", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        JSONArray jSONArray2 = jSONObject3.getJSONArray(str);
        boolean v = v(jSONObject3);
        int size = jSONArray2.size();
        int i3 = 0;
        while (i3 < size) {
            String string = jSONArray2.getString(i3);
            if (!TextUtils.isEmpty(string)) {
                string.hashCode();
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1855408664:
                        if (string.equals("bottomBar")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1036652336:
                        if (string.equals("detailHome")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1034800196:
                        if (string.equals(yns.KEY_TT_FLOAT)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 149310114:
                        if (string.equals("detailInfoAura")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 191256557:
                        if (string.equals("ttNaviBar")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1730354829:
                        if (string.equals("naviBar")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        h(string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                        continue;
                        i3 = i2 + 1;
                    case 1:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        i(y(jSONObject), jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                        continue;
                        i3 = i2 + 1;
                    case 2:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        l(string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                        continue;
                        i3 = i2 + 1;
                    case 3:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sForceConvertUltron))) {
                            o(jSONObject, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                        } else {
                            continue;
                        }
                        i3 = i2 + 1;
                    case 4:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        m(jSONObject, jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                        continue;
                        i3 = i2 + 1;
                    case 5:
                        if (!v) {
                            i2 = i3;
                            size = size;
                            jSONArray2 = jSONArray2;
                            j(jSONObject, jSONObject2, string, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7);
                            continue;
                            i3 = i2 + 1;
                        }
                        break;
                }
            }
            i2 = i3;
            size = size;
            jSONArray2 = jSONArray2;
            i3 = i2 + 1;
        }
    }

    public static void l(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray, final JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        int i2;
        JSONObject jSONObject6 = jSONObject4;
        final JSONObject jSONObject7 = jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadf1856", new Object[]{str, jSONObject, jSONObject2, jSONArray, jSONObject3, jSONObject6, jSONObject7});
            return;
        }
        jSONObject3.putAll(k);
        jSONArray.add(l);
        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
        int size = jSONArray2.size();
        int i3 = 0;
        while (i3 < size) {
            String string = jSONArray2.getString(i3);
            if (TextUtils.isEmpty(string)) {
                i2 = i3;
                size = size;
                jSONArray2 = jSONArray2;
            } else {
                final JSONArray jSONArray3 = new JSONArray();
                jSONObject6.put(yns.KEY_TT_FLOAT, (Object) new JSONObject(str, jSONArray3) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.41
                    public final /* synthetic */ JSONArray val$children;
                    public final /* synthetic */ String val$current;

                    {
                        this.val$current = str;
                        this.val$children = jSONArray3;
                        put("component", (Object) ("native$" + str));
                        put("children", (Object) jSONArray3);
                    }
                });
                JSONArray jSONArray4 = jSONObject.getJSONArray(str);
                i2 = i3;
                size = size;
                jSONArray2 = jSONArray2;
                F(true, string, null, jSONObject, jSONObject2, jSONArray, false, new ArrayList<String>(string) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.42
                    public final /* synthetic */ String val$child;

                    {
                        this.val$child = string;
                        add(string);
                    }
                }, 0, 0, (jSONArray4 == null || jSONArray4.isEmpty()) ? 1 : jSONArray4.size(), new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.43
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
                    public void a(String str2, JSONObject jSONObject8, JSONObject jSONObject9, List<String> list, int i4, int i5, int i6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str2, jSONObject8, jSONObject9, list, new Integer(i4), new Integer(i5), new Integer(i6)});
                            return;
                        }
                        jSONObject8.put("id", (Object) UUID.randomUUID().toString());
                        DetailV3Converter.a(jSONObject8, list);
                        DetailV3Converter.b(jSONObject8, str2);
                        String string2 = jSONObject8.getString("type");
                        JSONArray.this.add(new JSONObject(string2, str2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.43.1
                            public final /* synthetic */ String val$renderType;
                            public final /* synthetic */ String val$structureNode;

                            {
                                this.val$renderType = string2;
                                this.val$structureNode = str2;
                                put("component", (Object) string2);
                                put("props", (Object) ("$model." + str2));
                            }
                        });
                        jSONObject3.put(string2, (Object) jSONObject9);
                        jSONObject7.put(str2, (Object) jSONObject8);
                    }
                });
            }
            i3 = i2 + 1;
            jSONObject6 = jSONObject4;
            jSONObject7 = jSONObject5;
        }
    }

    public static void m(final JSONObject jSONObject, JSONObject jSONObject2, String str, JSONObject jSONObject3, JSONObject jSONObject4, JSONArray jSONArray, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb819e8", new Object[]{jSONObject, jSONObject2, str, jSONObject3, jSONObject4, jSONArray, jSONObject5, jSONObject6, jSONObject7});
            return;
        }
        jSONObject5.putAll(d);
        jSONObject6.put("navBar", (Object) new JSONObject("native$navBar", TBBuyPreloadScene.NAV) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.32
            public final /* synthetic */ String val$navModelKey;
            public final /* synthetic */ String val$navRenderType;

            {
                this.val$navRenderType = r2;
                this.val$navModelKey = r3;
                put("component", (Object) r2);
                put("props", (Object) ("$model." + r3));
            }
        });
        final JSONArray jSONArray2 = new JSONArray();
        final JSONObject jSONObject8 = new JSONObject("native$navBar", jSONObject2, jSONArray2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.33
            public final /* synthetic */ JSONObject val$esi;
            public final /* synthetic */ String val$navRenderType;
            public final /* synthetic */ JSONArray val$navRights;

            {
                this.val$navRenderType = r3;
                this.val$esi = jSONObject2;
                this.val$navRights = jSONArray2;
                put("id", (Object) UUID.randomUUID().toString());
                put("type", (Object) r3);
                JSONObject jSONObject9 = jSONObject2.getJSONObject("anchorpoint");
                if (jSONObject9 != null) {
                    put("title", (Object) new JSONObject(jSONObject9) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.33.1
                        public final /* synthetic */ JSONObject val$anchorPoint;

                        {
                            this.val$anchorPoint = jSONObject9;
                            String string = jSONObject9.getString("detailExtraTitle");
                            put("detail", (Object) (TextUtils.isEmpty(string) ? jSONObject9.getString("detailTitle") : string));
                            put("content", (Object) jSONObject9.getString("contentTitle"));
                            put("shop", (Object) jSONObject9.getString("shopTitle"));
                            put(mop.KEY_APM_SHOP_URL, (Object) jSONObject9.getString(mop.KEY_APM_SHOP_URL));
                            put("isReviewPageShow", (Object) Boolean.valueOf(jSONObject9.getBooleanValue("isReviewPageShow")));
                            put("rateText", (Object) jSONObject9.getString("goodRateText"));
                            put("leftBlackPic", (Object) jSONObject9.getString("leftBlackPic"));
                            put("rightBlackPic", (Object) jSONObject9.getString("rightBlackPic"));
                            put("leftPic", (Object) jSONObject9.getString("leftPic"));
                            put("rightPic", (Object) jSONObject9.getString("rightPic"));
                        }
                    });
                }
                put("right", (Object) jSONArray2);
            }
        };
        JSONArray jSONArray3 = jSONObject3.getJSONArray(str);
        F(true, str, null, jSONObject3, jSONObject4, jSONArray, true, new ArrayList<String>(str) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.34
            public final /* synthetic */ String val$current;

            {
                this.val$current = str;
                add(str);
            }
        }, 0, 0, (jSONArray3 == null || jSONArray3.isEmpty()) ? 1 : jSONArray3.size(), new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
            public void a(String str2, JSONObject jSONObject9, JSONObject jSONObject10, List<String> list, int i2, int i3, int i4) {
                JSONObject jSONObject11;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str2, jSONObject9, jSONObject10, list, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                JSONObject jSONObject12 = jSONObject9.getJSONObject("fields");
                if (jSONObject12 != null && (jSONObject11 = jSONObject12.getJSONObject("payload")) != null) {
                    String string = jSONObject11.getString("positionKey");
                    if (!TextUtils.equals("detail3NaviItemBack", str2) && !TextUtils.equals("back", string)) {
                        if (TextUtils.equals("detail3NaviItemSearch", str2) || TextUtils.equals("search", string)) {
                            DetailV3Converter.a(JSONObject.this, list);
                            JSONObject.this.put("search", (Object) new JSONObject(jSONObject11) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35.1
                                public final /* synthetic */ JSONObject val$payload;

                                {
                                    JSONObject jSONObject13;
                                    this.val$payload = jSONObject11;
                                    put("icon", (Object) jSONObject11.getString("value"));
                                    put(TaoliveSearchHotWords.TYPE_HINT, (Object) jSONObject11.getString("accessHint"));
                                    put("args", (Object) jSONObject11.getString("args"));
                                    JSONObject jSONObject14 = jSONObject.getJSONObject("diversion");
                                    String str3 = "";
                                    put("action", (Object) ((jSONObject14 == null || (jSONObject13 = jSONObject14.getJSONObject("detailTopSearch")) == null) ? str3 : jSONObject13.getString("url")));
                                    JSONObject jSONObject15 = jSONObject.getJSONObject("feature");
                                    put("asyncText", (Object) (jSONObject15 != null ? jSONObject15.getString("asyncLoadSearchInfo") : str3));
                                }
                            });
                            return;
                        }
                        jSONArray2.add(new JSONObject(jSONObject11) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.35.2
                            public final /* synthetic */ JSONObject val$payload;

                            {
                                String str3;
                                String str4;
                                JSONObject jSONObject13;
                                this.val$payload = jSONObject11;
                                String string2 = jSONObject11.getString("positionKey");
                                put("key", (Object) string2);
                                put("icon", (Object) jSONObject11.getString("value"));
                                put(TaoliveSearchHotWords.TYPE_HINT, (Object) jSONObject11.getString("accessHint"));
                                put("args", (Object) jSONObject11.getString("args"));
                                put("url", (Object) jSONObject11.getString("url"));
                                put("componentId4Fatigue", (Object) jSONObject11.getString("componentId4Fatigue"));
                                String string3 = jSONObject11.getString(rg0.JUMP_URL);
                                put("action", (Object) (TextUtils.isEmpty(string3) ? string2 : string3));
                                if (TextUtils.equals("cart", string2)) {
                                    JSONObject jSONObject14 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE);
                                    if (jSONObject14 == null || (jSONObject13 = jSONObject14.getJSONObject("cartIcon")) == null) {
                                        str4 = "";
                                        str3 = str4;
                                    } else {
                                        str4 = jSONObject13.getString("showBadge");
                                        str3 = jSONObject13.getString("count");
                                    }
                                    put("showBadge", (Object) str4);
                                    put("badge", (Object) str3);
                                }
                            }
                        });
                    }
                }
            }
        });
        jSONObject8.put("tabs", (Object) k(jSONObject3, jSONObject4, jSONArray));
        E(jSONObject8, str);
        jSONObject7.put(TBBuyPreloadScene.NAV, (Object) jSONObject8);
    }

    public static void i(boolean z, JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, JSONArray jSONArray, final JSONObject jSONObject4, JSONObject jSONObject5, final JSONObject jSONObject6) {
        int i2;
        JSONObject jSONObject7 = jSONObject4;
        JSONObject jSONObject8 = jSONObject5;
        JSONObject jSONObject9 = jSONObject6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80d36bd", new Object[]{new Boolean(z), jSONObject, str, jSONObject2, jSONObject3, jSONArray, jSONObject7, jSONObject8, jSONObject9});
            return;
        }
        JSONArray jSONArray2 = jSONObject2.getJSONArray(str);
        boolean u = u(jSONObject);
        int size = jSONArray2.size();
        int i3 = 0;
        while (i3 < size) {
            String string = jSONArray2.getString(i3);
            if (!TextUtils.isEmpty(string)) {
                string.hashCode();
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1194473495:
                        if (string.equals("divisionDescRecmd")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1036780926:
                        if (string.equals("detailDesc")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -715070901:
                        if (string.equals("divisonDesc")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 149310114:
                        if (string.equals("detailInfoAura")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 379903091:
                        if (string.equals("detailInnovate")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1470195222:
                        if (string.equals("descRecmd")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        jSONObject7 = jSONObject7;
                        jSONObject7.putAll(e);
                        G(yns.KEY_DIVISION_RECOMMEND, string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                        continue;
                        i3 = i2 + 1;
                        jSONObject8 = jSONObject5;
                        jSONObject9 = jSONObject6;
                    case 1:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        jSONObject7 = jSONObject7;
                        jSONObject7.putAll(f);
                        G("description", string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                        continue;
                        i3 = i2 + 1;
                        jSONObject8 = jSONObject5;
                        jSONObject9 = jSONObject6;
                    case 2:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        jSONObject7 = jSONObject7;
                        jSONObject7.putAll(e);
                        G(yns.KEY_DIVISION_DESC, string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                        continue;
                        i3 = i2 + 1;
                        jSONObject8 = jSONObject5;
                        jSONObject9 = jSONObject6;
                    case 3:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        jSONObject7.putAll(c);
                        jSONObject7.putAll(i);
                        jSONObject8.put("headerPic", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.21
                            {
                                put("component", "native$headerPic");
                                put("props", "$model.headerPic");
                            }
                        });
                        if (!u) {
                            DetailV3HeaderPicConverter.e(jSONObject2, jSONObject3, jSONArray, jSONObject7, jSONObject9);
                        }
                        q(jSONObject9.getJSONObject("headerPic"));
                        jSONObject7.putAll(b);
                        jSONObject9.put(ekj.NAME, (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.22
                            {
                                put("type", "native$_industry_divider_");
                                put("fields", (Object) new JSONObject());
                            }
                        });
                        final JSONObject jSONObject10 = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.23
                            {
                                put("component", "native$_industry_divider_");
                                put("props", "$model._industry_divider_");
                            }
                        };
                        final JSONArray jSONArray3 = new JSONArray();
                        jSONObject8.put("mainScreen", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.24
                            {
                                put("component", "native$mainScreen");
                                put("children", (Object) JSONArray.this);
                            }
                        });
                        final boolean[] zArr = new boolean[1];
                        JSONArray jSONArray4 = jSONObject2.getJSONArray(str);
                        jSONObject7 = jSONObject7;
                        F(true, string, Collections.singletonList("detailHeaderPic"), jSONObject2, jSONObject3, jSONArray, false, new ArrayList<String>(string) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.25
                            public final /* synthetic */ String val$child;

                            {
                                this.val$child = string;
                                add(string);
                            }
                        }, 0, 0, (jSONArray4 == null || jSONArray4.isEmpty()) ? 1 : jSONArray4.size(), new a() { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.26
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.a
                            public void a(String str2, JSONObject jSONObject11, JSONObject jSONObject12, List<String> list, int i4, int i5, int i6) {
                                boolean z2 = true;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a0e95b37", new Object[]{this, str2, jSONObject11, jSONObject12, list, new Integer(i4), new Integer(i5), new Integer(i6)});
                                    return;
                                }
                                jSONObject11.put("id", (Object) UUID.randomUUID().toString());
                                boolean x = DetailV3Converter.x(i4);
                                if (x) {
                                    DetailV3Converter.c(jSONObject11, i5, i6);
                                    if (i5 == 0) {
                                        JSONArray.this.add(jSONObject10);
                                    }
                                }
                                boolean[] zArr2 = zArr;
                                if (!x || i5 != i6 - 1) {
                                    z2 = false;
                                }
                                zArr2[0] = z2;
                                DetailV3Converter.a(jSONObject11, list);
                                DetailV3Converter.b(jSONObject11, str2);
                                String string2 = jSONObject11.getString("type");
                                JSONArray.this.add(new JSONObject(string2, str2) { // from class: com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter.26.1
                                    public final /* synthetic */ String val$renderType;
                                    public final /* synthetic */ String val$structureNode;

                                    {
                                        this.val$renderType = string2;
                                        this.val$structureNode = str2;
                                        put("component", (Object) string2);
                                        put("props", (Object) ("$model." + str2));
                                    }
                                });
                                jSONObject4.put(string2, (Object) jSONObject12);
                                jSONObject6.put(str2, (Object) jSONObject11);
                            }
                        });
                        if (zArr[0]) {
                            jSONArray3.add(jSONObject10);
                        } else {
                            continue;
                        }
                        i3 = i2 + 1;
                        jSONObject8 = jSONObject5;
                        jSONObject9 = jSONObject6;
                        break;
                    case 4:
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        jSONObject7.putAll(h);
                        G(yns.KEY_AI_MATCH, string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                        break;
                    case 5:
                        jSONObject7.putAll(g);
                        i2 = i3;
                        size = size;
                        jSONArray2 = jSONArray2;
                        G("recommend", string, jSONObject2, jSONObject3, jSONArray, jSONObject4, jSONObject5, jSONObject6, true);
                        break;
                }
                jSONObject7 = jSONObject7;
                i3 = i2 + 1;
                jSONObject8 = jSONObject5;
                jSONObject9 = jSONObject6;
            }
            i2 = i3;
            size = size;
            jSONArray2 = jSONArray2;
            jSONObject7 = jSONObject7;
            i3 = i2 + 1;
            jSONObject8 = jSONObject5;
            jSONObject9 = jSONObject6;
        }
    }
}
