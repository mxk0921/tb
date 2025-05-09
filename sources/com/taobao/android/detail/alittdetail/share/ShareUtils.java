package com.taobao.android.detail.alittdetail.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Price;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.b5m;
import tb.bwr;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.wxi;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ShareUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void onUpdateShareContainer(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6570a;
        public String b;
        public String c;
        public String d;
        public String e;
        public JSONObject f;

        static {
            t2o.a(354418781);
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("16c302be", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ff5052fb", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4f49e157", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("96b21a1c", new Object[]{this, str});
            }
            this.f6570a = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8c8043d7", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b f(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4472c886", new Object[]{this, jSONObject});
            }
            this.f = jSONObject;
            return this;
        }
    }

    static {
        t2o.a(354418777);
    }

    public static ShareContent a(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("4ac7cb3", new Object[]{ze7Var});
        }
        return b(ze7Var, null);
    }

    public static JSONObject c(Activity activity) {
        Uri data;
        String[] S0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d34f3ee", new Object[]{activity});
        }
        Intent intent = activity.getIntent();
        JSONObject jSONObject = null;
        if (intent == null || (data = intent.getData()) == null || TextUtils.isEmpty(data.getQuery())) {
            return null;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            jSONObject = new JSONObject();
            for (String str : queryParameterNames) {
                for (String str2 : vbl.S0()) {
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, str)) {
                        jSONObject.put(str, (Object) data.getQueryParameter(str));
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void d(ze7 ze7Var, JSONObject jSONObject, View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ecdb233", new Object[]{ze7Var, jSONObject, view});
        } else if (jSONObject != null && !b5m.H().isI18nEdition()) {
            ShareContent a2 = a(ze7Var);
            String string = jSONObject.getString("bizId");
            if (!TextUtils.isEmpty(string)) {
                a2.businessId = string;
            } else {
                a2.businessId = "skublacklight";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("image");
            if (jSONObject2 != null) {
                str = jSONObject2.getString("url");
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = jSONObject2.getString("icon");
            }
            if (!TextUtils.isEmpty(str)) {
                a2.imageUrl = str;
            }
            Item item = (Item) ze7Var.e().f(Item.class);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("toolsFirst", (Object) "true");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", (Object) DataUtils.n(item, ""));
            jSONObject4.put("itemId", (Object) DataUtils.w(item, ""));
            jSONObject4.put(wxi.KEY_PIC_URL, (Object) str);
            jSONObject4.put("sellerId", (Object) DataUtils.E((Seller) ze7Var.e().f(Seller.class), ""));
            jSONObject3.put("detailData", (Object) jSONObject4);
            a2.templateParams = jSONObject3;
            Context c = ze7Var.c();
            if (c instanceof Activity) {
                if (view != null && (c instanceof a)) {
                    ((a) c).onUpdateShareContainer(view);
                }
                ShareBusiness.share((Activity) c, a2);
            }
        }
    }

    public static void e(ze7 ze7Var, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260f736", new Object[]{ze7Var, bVar});
        } else {
            f(ze7Var, bVar, null);
        }
    }

    public static void f(ze7 ze7Var, b bVar, View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5799dc", new Object[]{ze7Var, bVar, view});
            return;
        }
        if (bVar != null) {
            jSONObject = bVar.f;
        } else {
            jSONObject = null;
        }
        ShareContent b2 = b(ze7Var, jSONObject);
        if (bVar != null) {
            if (TextUtils.isEmpty(b2.businessId) && !TextUtils.isEmpty(bVar.b)) {
                b2.businessId = bVar.b;
            }
            if (!TextUtils.isEmpty(bVar.e)) {
                List list = b2.snapshotImages;
                if (list == null) {
                    list = new ArrayList();
                    b2.snapshotImages = list;
                }
                list.remove(bVar.e);
                list.add(0, bVar.e);
                b2.imageUrl = bVar.e;
            }
            if (!TextUtils.isEmpty(bVar.f6570a)) {
                b2.isActivity = bVar.f6570a;
            }
            if (!TextUtils.isEmpty(bVar.d)) {
                b2.description = bVar.d;
            }
        }
        if (b5m.H().isI18nEdition()) {
            b2.businessId = "1_" + b5m.H().getLocation();
        }
        if (TextUtils.isEmpty(b2.businessId)) {
            b2.businessId = "1";
        }
        Context c = ze7Var.c();
        if (c instanceof Activity) {
            if (view != null && (c instanceof a)) {
                ((a) c).onUpdateShareContainer(view);
            }
            if (bVar == null || TextUtils.isEmpty(bVar.c)) {
                ShareBusiness.share((Activity) c, b2);
            } else {
                ShareBusiness.share((Activity) c, bVar.c, b2);
            }
        }
    }

    public static ShareContent b(ze7 ze7Var, JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject c;
        Map<String, String> b2;
        Resource.g share;
        Map<String, String> b3;
        String str3;
        Resource.g share2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("59564519", new Object[]{ze7Var, jSONObject});
        }
        Context c2 = ze7Var.c();
        boolean z = c2 instanceof Activity;
        if (z && (c2 instanceof a)) {
            ((a) c2).onUpdateShareContainer(((Activity) c2).getWindow().getDecorView());
        }
        ShareContent shareContent = new ShareContent();
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        Resource resource = (Resource) ze7Var.e().f(Resource.class);
        if (!(resource == null || (share2 = resource.getShare()) == null)) {
            shareContent.activityParams = share2.b();
        }
        Item item = (Item) ze7Var.e().f(Item.class);
        String w = DataUtils.w(item, "");
        String str4 = bwr.NAV_URL_DETAIL_BASE + w + ".htm";
        Price price = (Price) ze7Var.e().f(Price.class);
        if (price != null) {
            str = price.getBasePrice();
            if (TextUtils.isEmpty(str)) {
                Price.b price2 = price.getPrice();
                if (price2 != null) {
                    str = price2.b();
                } else {
                    str = "";
                }
                ArrayList<Price.b> extraPrices = price.getExtraPrices();
                if (extraPrices != null) {
                    for (Price.b bVar : extraPrices) {
                        if (bVar.c() == 2) {
                            str2 = bVar.b();
                            break;
                        }
                    }
                }
            }
            str2 = "";
        } else {
            str2 = "";
            str = str2;
        }
        if (item != null) {
            String shareItemLink = item.getShareItemLink();
            if (!TextUtils.isEmpty(shareItemLink)) {
                str4 = shareItemLink;
            }
        }
        Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("price", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("original_price", str2);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value != null) {
                    str3 = String.valueOf(value);
                } else {
                    str3 = "";
                }
                buildUpon.appendQueryParameter(key, str3);
            }
        }
        shareContent.url = buildUpon.toString();
        if (!(resource == null || (share = resource.getShare()) == null || (b3 = share.b()) == null)) {
            String str5 = b3.get("bizId");
            if (!TextUtils.isEmpty(str5)) {
                shareContent.businessId = str5;
            }
        }
        String x = DataUtils.x(item, "");
        Vertical vertical = (Vertical) ze7Var.e().f(Vertical.class);
        if (!(vertical == null || vertical.getJhs() == null)) {
            x = "这个#聚划算团购#宝贝不错:" + x + "(分享自@手机淘宝android客户端)";
        }
        shareContent.description = x;
        if (item != null) {
            String shareBizCode = item.getShareBizCode();
            if (!TextUtils.isEmpty(shareBizCode)) {
                shareContent.businessId = shareBizCode;
            }
        }
        if (item != null) {
            ArrayList<String> images = item.getImages();
            shareContent.snapshotImages = images;
            if (images != null && !images.isEmpty()) {
                shareContent.imageUrl = shareContent.snapshotImages.get(0);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("price", str);
        hashMap.put("targetId", w);
        if (resource != null) {
            Resource.g share3 = resource.getShare();
            if (!(share3 == null || (b2 = share3.b()) == null)) {
                hashMap.putAll(b2);
                hashMap.remove("iconFont");
            }
            if (item != null) {
                final String wxShareUrl = item.getWxShareUrl();
                if (!TextUtils.isEmpty(wxShareUrl)) {
                    hashMap.put("defineToolParams", new JSONArray() { // from class: com.taobao.android.detail.alittdetail.share.ShareUtils.1
                        {
                            add(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.share.ShareUtils.1.1
                                {
                                    put("type", "wxfriend");
                                    put("shareUrl", (Object) wxShareUrl);
                                }
                            });
                        }
                    }.toJSONString());
                }
            }
            Map<String, String> rsExtParams = resource.getRsExtParams();
            if (rsExtParams != null) {
                hashMap.putAll(rsExtParams);
            }
            if (z && (c = c((Activity) c2)) != null) {
                c.put("itemId", (Object) w);
                c.put("supportPresent", (Object) String.valueOf(DataUtils.d0((Feature) ze7Var.e().f(Feature.class))));
                hashMap.put("skuParams", c.toJSONString());
                tgh.b("share", "extendParams: " + hashMap);
            }
        }
        shareContent.extendParams = hashMap;
        return shareContent;
    }
}
