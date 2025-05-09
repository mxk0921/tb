package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.nav.Nav;
import com.taobao.tao.content.business.ContentBusiness;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.NavUrls;
import com.taobao.weex.bridge.JSCallback;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCOUNT_ID = "adUserId";
    public static final String ADD_CART_WITHOUT_SKU = "2";
    public static final String ADD_CART_WITH_SKU = "3";
    public static final String BIZ_TYPE = "businessScenceId";
    public static final String CONTENT_ID = "contentId";
    public static final String CONTEXT = "context";
    public static final String CT = "ct";
    public static final String ITEM_ID = "itemId";
    public static final String PAGE_NAME = "pageName";
    public static final String SID = "sId";
    public static final String TCP_BID = "tcpBid";
    public static final String URL_INTERRUPT = "1";
    public static final String sourceType = "sourceType";

    /* renamed from: a  reason: collision with root package name */
    public Uri f19840a;
    public ContentBusinessModel b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f19841a;

        public a(gat gatVar, JSCallback jSCallback) {
            this.f19841a = jSCallback;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            HashMap hashMap = new HashMap(16);
            if (map != null) {
                try {
                    if (map.containsKey("response") && (map.get("response") instanceof MtopResponse)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("errorCode", (Object) ((MtopResponse) map.get("response")).getRetCode());
                        jSONObject.put("msg", (Object) ((MtopResponse) map.get("response")).getRetMsg());
                        hashMap.put("error", jSONObject);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            hashMap.put("success", "false");
            this.f19841a.invoke(hashMap);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map != null) {
                HashMap hashMap = new HashMap(16);
                try {
                    if (map.containsKey("response") && (map.get("response") instanceof MtopResponse)) {
                        hashMap.put("result", JSON.parseObject(new String(((MtopResponse) map.get("response")).getBytedata(), "UTF-8")).getJSONObject("data"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                hashMap.put("success", "true");
                this.f19841a.invoke(hashMap);
            }
        }
    }

    static {
        t2o.a(701497360);
    }

    @Deprecated
    public void a(ContentBusinessModel contentBusinessModel, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c18640a", new Object[]{this, contentBusinessModel, jSCallback});
        } else if (contentBusinessModel != null) {
            this.b = contentBusinessModel;
            HashMap hashMap = new HashMap(16);
            hashMap.put("itemId", contentBusinessModel.itemId);
            hashMap.put("quantity", "1");
            hashMap.put("from", "video_weex");
            rrh.e().o(new vrh("video_weex", "msoa.taobao.cart.sdk.add", "2.0", "video_weex", hashMap), new a(this, jSCallback));
            new ContentBusiness().h(contentBusinessModel, null);
        }
    }

    @Deprecated
    public void b(Context context, ContentBusinessModel contentBusinessModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174ddf97", new Object[]{this, context, contentBusinessModel, new Integer(i)});
        } else if (contentBusinessModel != null) {
            this.b = contentBusinessModel;
            Bundle bundle = new Bundle();
            bundle.putString("bizName", "video_weex");
            Nav.from(context).withExtras(bundle).forResult(i).toUri("http://a.m.taobao.com/sku" + contentBusinessModel.itemId + ".htm");
            new ContentBusiness().h(contentBusinessModel, null);
        }
    }

    public void d(ContentBusinessModel contentBusinessModel, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ccb949", new Object[]{this, contentBusinessModel, iRemoteBaseListener});
        } else {
            new ContentBusiness().g(contentBusinessModel, iRemoteBaseListener);
        }
    }

    public void e(ContentBusinessModel contentBusinessModel, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa29bc7", new Object[]{this, contentBusinessModel, iRemoteBaseListener});
        } else {
            new ContentBusiness().h(contentBusinessModel, iRemoteBaseListener);
        }
    }

    public void c(Context context, Intent intent) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b45acf", new Object[]{this, context, intent});
            return;
        }
        Uri data = intent.getData();
        this.f19840a = data;
        if (data != null && (a2 = vov.a(data)) != null && a2.size() > 0) {
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            this.b = contentBusinessModel;
            contentBusinessModel.url = this.f19840a.toString();
            this.b.itemId = a2.get("itemId");
            this.b.adUserId = a2.get(ACCOUNT_ID);
            this.b.scenceId = a2.get(BIZ_TYPE);
            this.b.contentId = a2.get("contentId");
            this.b.pageName = a2.get("pageName");
            ContentBusinessModel contentBusinessModel2 = this.b;
            contentBusinessModel2.source = "1";
            contentBusinessModel2.tcpBid = a2.get(TCP_BID);
            if (!TextUtils.isEmpty(this.b.tcpBid)) {
                this.b.ct = a2.get(CT);
                if (this.b.ct.equals("1")) {
                    this.b.itemId = a2.get("itemId");
                } else if (this.b.ct.equals("2")) {
                    this.b.sId = a2.get(SID);
                }
            }
            String format = String.format(NavUrls.nav_urls_detail[3], this.b.itemId);
            Nav.from(context).toUri(format + "?" + vov.b(a2));
            if (TextUtils.isDigitsOnly(this.b.itemId)) {
                new ContentBusiness().h(this.b, null);
            }
        }
    }
}
