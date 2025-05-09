package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.prefetch.ImageCache;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.List;
import tb.m9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ine INSTANCE = new ine();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21446a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f21446a = str;
            this.b = str2;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            m9u.a aVar = m9u.Companion;
            aVar.a("Cart#ImagePrefetch#" + this.f21446a);
            hav.d(c9x.TAG, "preloadImagesByCacheImages decideUrl=" + this.f21446a + ",instanceID=" + this.b);
            StringBuilder sb = new StringBuilder("Cart#ImagePrefetch#");
            sb.append(this.f21446a);
            aVar.b(sb.toString());
            return false;
        }
    }

    static {
        t2o.a(478151034);
    }

    public final List<ImageCache> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("931069ce", new Object[]{this});
        }
        String c = uii.Companion.b().a("supercart", "SuperCartData::floatCart::imageCache").c();
        if (c == null) {
            c = "";
        }
        try {
            return JSON.parseArray(c, ImageCache.class);
        } catch (Exception e) {
            hav.a(c9x.TAG, "ImagePrefetch error=" + e.getMessage());
            return null;
        }
    }

    public final void c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac6dd3", new Object[]{this, jSONObject, str});
            return;
        }
        ckf.g(jSONObject, "params");
        JSONArray jSONArray = jSONObject.getJSONArray(BaseJsExecutor.NAME_IMAGE_LIST);
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                if (obj != null) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    ImageCache imageCache = new ImageCache();
                    String string = jSONObject2.getString("url");
                    ckf.f(string, "item.getString(\"url\")");
                    imageCache.setUrl(string);
                    imageCache.setWidth(jSONObject2.getIntValue("width"));
                    imageCache.setHeight(jSONObject2.getIntValue("height"));
                    arrayList.add(imageCache);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        b(arrayList, str);
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eca5e7", new Object[]{this, str});
        } else {
            b(a(), str);
        }
    }

    public final void b(List<ImageCache> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d059d24", new Object[]{this, list, str});
            return;
        }
        hav.d(c9x.TAG, "preloadImagesByCacheImages cacheImages=" + list + ",instanceID=" + str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (ImageCache imageCache : list) {
                String decideUrl = ImageStrategyDecider.decideUrl(imageCache.getUrl(), Integer.valueOf(imageCache.getWidth()), Integer.valueOf(imageCache.getHeight()), null);
                ckf.f(decideUrl, "decideUrl");
                arrayList.add(decideUrl);
                s0m.B().T(decideUrl).preRequest(true).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "32001").succListener(new a(decideUrl, str)).limitSize(null, imageCache.getWidth(), imageCache.getHeight()).fetch();
            }
        }
    }
}
