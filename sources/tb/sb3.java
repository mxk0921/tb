package tb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int c;
    public static int d;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Drawable> f27923a = new ConcurrentHashMap();
    public static int b = 0;
    public static final AtomicBoolean e = new AtomicBoolean();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f27924a;

        public a(JSONObject jSONObject) {
            this.f27924a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONArray jSONArray;
            JSONObject jSONObject3;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sb3.b(vav.e(c9x.CART_BIZ_NAME, "maxPreloadItemImageCount", 5));
            JSONObject jSONObject4 = this.f27924a.getJSONObject("data");
            if (jSONObject4 != null && (jSONObject = this.f27924a.getJSONObject("hierarchy")) != null && (jSONObject2 = jSONObject.getJSONObject("structure")) != null && (jSONArray = jSONObject2.getJSONArray("extendBody_1")) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        if (arrayList.size() >= sb3.a()) {
                            break;
                        }
                        sb3.c(jSONObject2, (String) next, arrayList);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject((String) it2.next());
                    if (!(jSONObject5 == null || (jSONObject3 = jSONObject5.getJSONObject("fields")) == null || (string = jSONObject3.getString("pic")) == null)) {
                        arrayList2.add(string);
                    }
                }
                sb3.d(arrayList2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            hav.d(c9x.CART_BIZ_NAME, "图片加载失败:" + failPhenixEvent.getUrl());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                if (drawable instanceof uwn) {
                    ((uwn) drawable).l();
                }
                String url = succPhenixEvent.getUrl();
                sb3.e().put(url, drawable);
                hav.i(c9x.CART_BIZ_NAME, "图片加载成功:", url);
            }
            return false;
        }
    }

    static {
        t2o.a(479199503);
        c = -1;
        d = -1;
        try {
            hav.d("CartItemImagePreLoader", "是否开启图片库缓存预加载优化：" + ABGlobal.b(Globals.getApplication(), "taobao", "tbspeed", "image_add_decoded_cache_cards"));
        } catch (Throwable th) {
            ub3.g("CartItemImagePreLoader", "初始化错误：" + th.getMessage());
        }
        m9v d2 = m9v.d(c9x.CART_BIZ_NAME);
        c = d2.j("itemImageWidthV2");
        d = d2.j("itemImageHeightV2");
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        b = i;
        return i;
    }

    public static /* synthetic */ void c(JSONObject jSONObject, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370043f3", new Object[]{jSONObject, str, list});
        } else {
            j(jSONObject, str, list);
        }
    }

    public static /* synthetic */ void d(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42ff8ea", new Object[]{list});
        } else {
            n(list);
        }
    }

    public static /* synthetic */ Map e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeb91def", new Object[0]);
        }
        return f27923a;
    }

    public static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4485f4", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            pav.m(true, new a(jSONObject));
        }
    }

    public static void g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641eb3ae", new Object[]{new Integer(i), new Integer(i2)});
        } else if (c <= 0 || d <= 0) {
            m9v d2 = m9v.d(c9x.CART_BIZ_NAME);
            if (i > 0) {
                c = i;
                d2.q("itemImageWidthV2", i);
            }
            if (i2 > 0) {
                d = i2;
                d2.q("itemImageHeightV2", i2);
            }
            hav.d("CartItemImagePreLoader", "缓存宽高：" + c + "," + d);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
        } else {
            ((ConcurrentHashMap) f27923a).clear();
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
        } else {
            h();
        }
    }

    public static void j(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7be885d", new Object[]{jSONObject, str, list});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            Iterator<Object> it = jSONArray2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    String str2 = (String) next;
                    if (str2.startsWith("group_") && (jSONArray = jSONObject.getJSONArray(str2)) != null && !jSONArray.isEmpty()) {
                        Iterator<Object> it2 = jSONArray.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (list.size() >= b) {
                                break;
                            } else if (next2 instanceof String) {
                                String str3 = (String) next2;
                                if (str3.startsWith("item_") && !list.contains(next2)) {
                                    list.add(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static Drawable l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("deba27e", new Object[]{str});
        }
        return (Drawable) ((ConcurrentHashMap) f27923a).remove(str);
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec962d3d", new Object[0]);
            return;
        }
        String str = null;
        try {
            str = m9v.d(c9x.CART_BIZ_NAME).l("firstScreenItemImageUrls");
            if (str != null) {
                n(Arrays.asList(str.split(",")));
            }
        } catch (Exception e2) {
            ub3.g("syncLoadPictureToDrawableException", "pictureUrlStr=" + str + " | message=" + e2.getMessage());
        }
    }

    public static void n(List<String> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c004a02e", new Object[]{list});
        } else if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    int i = c;
                    if (i <= 0 || d <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        next = ImageStrategyDecider.decideUrl(next, Integer.valueOf(i), Integer.valueOf(d), null);
                    }
                    if (!((ConcurrentHashMap) f27923a).containsKey(next)) {
                        PhenixCreator failListener = s0m.B().T(next).preRequest(true).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "32001").succListener(new c()).failListener(new b());
                        if (z) {
                            failListener.limitSize(null, c, d);
                        }
                        failListener.fetch();
                    }
                }
            }
        }
    }

    public static void k(fsb fsbVar, kmb kmbVar, boolean z, boolean z2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3cd8ca", new Object[]{fsbVar, kmbVar, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (fsbVar != null && z && !fsbVar.d() && !z2 && !kmbVar.b0() && !e.getAndSet(true) && vav.a(c9x.CART_BIZ_NAME, "preloadFirstPageItemPicturesV2", true) && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null) {
            f(jSONObject2);
            hav.d("CartItemImagePreLoader", "请求结束，预加载首屏商品图片");
        }
    }
}
