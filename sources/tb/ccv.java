package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ccv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String PARAM_ASYNC_DATA_SOURCE = "asyncDataSource";
    public static final String PARAM_PREFETCH_IGNORE_DISK = "prefetchImgIgnoreDisk";
    public static final String PARAM_PREFETCH_IMG_LIST = "prefetchImgList";
    public static final String PARAM_PREFETCH_IMG_QUALITY = "prefetchImgQuality";
    public static final String PARAM_PREFETCH_IMG_SIZE = "prefetchImgSize";

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Drawable> f16977a = new LruCache<>(v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "cachedDrawableNum", 30));
    public final LruCache<String, String> b = new LruCache<>(v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "cachedUrlMapNum", 30));
    public final cbv c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(157286840);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(List<unm> list);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ List c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ TaobaoImageUrlStrategy.ImageQuality e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                ckf.f(succPhenixEvent, "event");
                if (TextUtils.isEmpty(succPhenixEvent.getUrl())) {
                    hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: url is empty");
                    return false;
                }
                String b = ccv.b(ccv.this, succPhenixEvent.getUrl());
                if (TextUtils.isEmpty(b)) {
                    hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: formatImgUrl is empty, oriUrl: " + succPhenixEvent.getUrl());
                    return false;
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable == null || succPhenixEvent.isIntermediate()) {
                    hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: drawable is null, formatImgUrl: " + b);
                } else {
                    if (drawable instanceof uwn) {
                        ((uwn) drawable).l();
                    }
                    if (drawable.getBitmap() != null) {
                        Bitmap bitmap = drawable.getBitmap();
                        ckf.f(bitmap, "drawable.bitmap");
                        if (bitmap.getByteCount() > 307200) {
                            hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: prefetch success, but drawable is too large, formatImgUrl: " + b);
                            return false;
                        }
                    }
                    ccv.c(ccv.this).put(b, drawable);
                    hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: prefetch success, formatImgUrl: " + b);
                }
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b<T extends b1m> implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final b INSTANCE = new b();

            /* renamed from: a */
            public final boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                StringBuilder sb = new StringBuilder("onHappen: prefetch failed, oriUrl: ");
                ckf.f(failPhenixEvent, "failPhenixEvent");
                sb.append(failPhenixEvent.getUrl());
                hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", sb.toString());
                return false;
            }
        }

        public c(boolean z, List list, boolean z2, TaobaoImageUrlStrategy.ImageQuality imageQuality) {
            this.b = z;
            this.c = list;
            this.d = z2;
            this.e = imageQuality;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                s0m B = s0m.B();
                if (B != null) {
                    if (!this.b && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enablePrefetchTradeImg", true)) {
                        ArrayList arrayList = new ArrayList();
                        for (unm unmVar : this.c) {
                            if (unmVar.b().length() != 0) {
                                if (unmVar.d()) {
                                    arrayList.add(unmVar.b());
                                } else {
                                    arrayList.add(ImageStrategyDecider.decideUrl(unmVar.b(), Integer.valueOf(unmVar.c()), Integer.valueOf(unmVar.a()), null));
                                }
                            }
                        }
                        B.e0("trade-module", arrayList).b();
                        hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "=== phenix.preload ===" + arrayList);
                    }
                    HashSet hashSet = new HashSet(this.c);
                    if (!this.d) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            unm unmVar2 = (unm) it.next();
                            if (unmVar2.b().length() != 0) {
                                if (unmVar2.d()) {
                                    str2 = unmVar2.b();
                                } else {
                                    str2 = ImageStrategyDecider.decideUrl(unmVar2.b(), Integer.valueOf(unmVar2.c()), Integer.valueOf(unmVar2.a()), this.e != TaobaoImageUrlStrategy.ImageQuality.non ? ImageStrategyConfig.u("default").j(unmVar2.c()).h(unmVar2.a()).i(this.e).a() : null);
                                }
                                B.T(str2).limitSize(null, unmVar2.c(), unmVar2.a()).fetch();
                            }
                        }
                        hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "=== phenix.load ===" + hashSet.toString());
                        return;
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        unm unmVar3 = (unm) it2.next();
                        if (unmVar3.b().length() == 0) {
                            hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: imgUrl is empty");
                        } else {
                            String b2 = ccv.b(ccv.this, unmVar3.b());
                            if (TextUtils.isEmpty(b2)) {
                                hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: formatImgUrl is empty, oriUrl: " + unmVar3.b());
                            } else {
                                String str3 = (String) ccv.d(ccv.this).get(b2);
                                if (TextUtils.isEmpty(str3) || ccv.c(ccv.this).get(str3) == null) {
                                    if (unmVar3.d()) {
                                        str = unmVar3.b();
                                    } else {
                                        str = ImageStrategyDecider.decideUrl(unmVar3.b(), Integer.valueOf(unmVar3.c()), Integer.valueOf(unmVar3.a()), null);
                                    }
                                    ccv.d(ccv.this).put(b2, ccv.b(ccv.this, str));
                                    B.T(str).limitSize(null, unmVar3.c(), unmVar3.a()).succListener(new a()).failListener(b.INSTANCE).fetch();
                                } else {
                                    hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: cache drawable is existed(success), formatImgUrl: " + b2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                hav.g("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "throwable: " + th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dcv b;

        public d(String str, dcv dcvVar) {
            this.b = dcvVar;
        }

        @Override // tb.ccv.b
        public void a(List<unm> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646daf53", new Object[]{this, list});
                return;
            }
            ckf.g(list, "imgList");
            ccv.f(ccv.this, list, this.b.d(), false, null, 12, null);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", "mytaobao-orderList async img list is not empty, imgList:" + list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dcv b;

        public e(String str, dcv dcvVar) {
            this.b = dcvVar;
        }

        @Override // tb.ccv.b
        public void a(List<unm> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646daf53", new Object[]{this, list});
                return;
            }
            ckf.g(list, "imgList");
            ccv.f(ccv.this, list, this.b.d(), false, null, 12, null);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", "mytaobao-refundList async img list is not empty, imgList:" + list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dcv b;

        public f(String str, dcv dcvVar) {
            this.b = dcvVar;
        }

        @Override // tb.ccv.b
        public void a(List<unm> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646daf53", new Object[]{this, list});
                return;
            }
            ckf.g(list, "imgList");
            ccv.f(ccv.this, list, this.b.d(), false, null, 12, null);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", "orderList-orderList async img list is not empty");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dcv b;

        public g(String str, dcv dcvVar) {
            this.b = dcvVar;
        }

        @Override // tb.ccv.b
        public void a(List<unm> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646daf53", new Object[]{this, list});
                return;
            }
            ckf.g(list, "imgList");
            ccv.f(ccv.this, list, this.b.d(), false, null, 12, null);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", "orderList-refundList async img list is not empty");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dcv b;

        public h(String str, dcv dcvVar) {
            this.b = dcvVar;
        }

        @Override // tb.ccv.b
        public void a(List<unm> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646daf53", new Object[]{this, list});
                return;
            }
            ckf.g(list, "imgList");
            ccv.f(ccv.this, list, this.b.d(), false, null, 12, null);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", "refundList-refundList async img list is not empty");
        }
    }

    static {
        t2o.a(157286839);
        t2o.a(157286824);
        t2o.a(157286825);
    }

    public ccv(cbv cbvVar) {
        this.c = cbvVar;
    }

    public static final /* synthetic */ String b(ccv ccvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5850dde", new Object[]{ccvVar, str});
        }
        return ccvVar.i(str);
    }

    public static final /* synthetic */ LruCache c(ccv ccvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("43eacc5c", new Object[]{ccvVar});
        }
        return ccvVar.f16977a;
    }

    public static final /* synthetic */ LruCache d(ccv ccvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("5ceaa1fb", new Object[]{ccvVar});
        }
        return ccvVar.b;
    }

    public static /* synthetic */ void f(ccv ccvVar, List list, boolean z, boolean z2, TaobaoImageUrlStrategy.ImageQuality imageQuality, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf09d43", new Object[]{ccvVar, list, new Boolean(z), new Boolean(z2), imageQuality, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            imageQuality = TaobaoImageUrlStrategy.ImageQuality.non;
        }
        ccvVar.e(list, z, z2, imageQuality);
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        ckf.g(str2, "sceneName");
        g(str, str2, l(jSONObject));
    }

    public final void e(List<unm> list, boolean z, boolean z2, TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f053af73", new Object[]{this, list, new Boolean(z), new Boolean(z2), imageQuality});
            return;
        }
        List<unm> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            pav.k(new c(z2, list, z, imageQuality));
        }
    }

    public final void g(String str, String str2, JSONObject jSONObject) {
        hcv c2;
        List<dcv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b7611", new Object[]{this, str, str2, jSONObject});
            return;
        }
        cbv cbvVar = this.c;
        if (!(cbvVar == null || (c2 = cbvVar.c(str2)) == null || (list = c2.e) == null || list.isEmpty())) {
            for (dcv dcvVar : list) {
                if (dcvVar != null) {
                    if (!TextUtils.equals(str, dcvVar.c())) {
                        hav.g("UltronTradeHybridPreRequestImageManager", "dispatchStage:", str2 + '-' + dcvVar.a() + '-' + str + " stage not match");
                    } else if (!h(str2, dcvVar.a())) {
                        hav.g("UltronTradeHybridPreRequestImageManager", "dispatchStage:", str2 + '-' + dcvVar.a() + " switcher is off");
                    } else {
                        k(str2, dcvVar, jSONObject);
                    }
                }
            }
        }
    }

    public boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "sceneName");
        return UltronTradeHybridSwitcherHelper.h(str, str2);
    }

    public final String i(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5fd674c", new Object[]{this, str});
        }
        if (str == null) {
            return "";
        }
        if (str.length() != 0) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    str2 = parse.getPath();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return "";
                }
                if (str2.length() == 0) {
                    return "";
                }
            } catch (Throwable unused) {
                return "";
            }
        }
        return str2;
    }

    public final Drawable j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6aa097ca", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "sceneName");
        ckf.g(str2, "bizName");
        ckf.g(str3, "imgUrl");
        if (!h(str, str2)) {
            hav.g("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str.concat(" switcher is off"));
            return null;
        }
        String i = i(str3);
        if (i.length() == 0) {
            hav.g("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " formatImgUrl is empty, oriUrl: " + str3);
            return null;
        }
        String str4 = this.b.get(i);
        if (str4 == null || str4.length() == 0) {
            hav.g("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " cachedUrl is empty, oriUrl: " + str3);
            return null;
        }
        Drawable drawable = this.f16977a.get(str4);
        if (drawable == null) {
            hav.g("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " drawable is null, imgUrl: " + str3);
            return null;
        }
        hav.g("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " success, imgUrl: " + str3);
        return drawable;
    }

    public JSONObject l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }

    public final void k(String str, dcv dcvVar, JSONObject jSONObject) {
        String string;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb6a87d", new Object[]{this, str, dcvVar, jSONObject});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<unm> b2 = dcvVar.b();
        if (b2 == null) {
            b2 = new ArrayList<>();
        }
        List<unm> list = b2;
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        TaobaoImageUrlStrategy.ImageQuality imageQuality = TaobaoImageUrlStrategy.ImageQuality.non;
        if (jSONObject != null) {
            int i = 320;
            try {
                if (jSONObject.containsKey(PARAM_PREFETCH_IMG_SIZE)) {
                    int intValue = jSONObject.getIntValue(PARAM_PREFETCH_IMG_SIZE);
                    if (intValue > 320) {
                        i = intValue;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (jSONObject.containsKey(PARAM_PREFETCH_IMG_QUALITY) && !TextUtils.isEmpty(jSONObject.getString(PARAM_PREFETCH_IMG_QUALITY))) {
                    q9b q9bVar = q9b.INSTANCE;
                    String string2 = jSONObject.getString(PARAM_PREFETCH_IMG_QUALITY);
                    ckf.f(string2, "it.getString(PARAM_PREFETCH_IMG_QUALITY)");
                    imageQuality = q9bVar.d(string2);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                if (jSONObject.containsKey(PARAM_PREFETCH_IGNORE_DISK)) {
                    if (TextUtils.equals(jSONObject.getString(PARAM_PREFETCH_IGNORE_DISK), "true")) {
                        z = true;
                    }
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(PARAM_PREFETCH_IMG_LIST);
                if (jSONArray != null && (!jSONArray.isEmpty())) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if ((next instanceof String) && ((CharSequence) next).length() != 0) {
                            arrayList.add(new unm((String) next, i, i, false, 8, null));
                        }
                    }
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
        if (!arrayList.isEmpty()) {
            e(arrayList, dcvVar.d(), z, imageQuality);
            hav.g("UltronTradeHybridPreRequestImageManager", "processImgList:", str + " sync img list is not empty");
        }
        if (jSONObject != null && (string = jSONObject.getString(PARAM_ASYNC_DATA_SOURCE)) != null && string.length() != 0 && TextUtils.equals(string, "true")) {
            int hashCode = str.hashCode();
            if (hashCode != -1711306698) {
                if (hashCode != -391817972) {
                    if (hashCode == 120528346 && str.equals("mytaobao")) {
                        String a2 = dcvVar.a();
                        int hashCode2 = a2.hashCode();
                        if (hashCode2 != -754911396) {
                            if (hashCode2 == -82300954 && a2.equals(dbv.BIZ_REFUND_LIST)) {
                                q9b.INSTANCE.c(new e(str, dcvVar));
                            }
                        } else if (a2.equals(dbv.BIZ_ORDER_LIST)) {
                            q9b.INSTANCE.b(new d(str, dcvVar));
                        }
                    }
                } else if (str.equals("orderList")) {
                    String a3 = dcvVar.a();
                    int hashCode3 = a3.hashCode();
                    if (hashCode3 != -754911396) {
                        if (hashCode3 == -82300954 && a3.equals(dbv.BIZ_REFUND_LIST)) {
                            q9b.INSTANCE.c(new g(str, dcvVar));
                        }
                    } else if (a3.equals(dbv.BIZ_ORDER_LIST)) {
                        q9b.INSTANCE.b(new f(str, dcvVar));
                    }
                }
            } else if (str.equals("refundList")) {
                String a4 = dcvVar.a();
                if (a4.hashCode() == -82300954 && a4.equals(dbv.BIZ_REFUND_LIST)) {
                    q9b.INSTANCE.c(new h(str, dcvVar));
                }
            }
        }
    }
}
