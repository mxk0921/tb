package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kje implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_ENABLE_TRANSITION = "extraEnableTransition";
    public static final String KEY_EXTRA_ENABLE_TRA_STYLE_DATA = "extraEnableTraStyleData";
    public static final String KEY_ON_NAV_HIT_PRE_CACHE_DATA = "onNavHitPreCacheData";
    public static final String KEY_REAL_HIT_MASK_FRAME_ANIM = "realHitMaskFrameAnim";
    public static long b = 0;
    public static boolean c = false;
    public static long d = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22701a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f22702a;
        public final /* synthetic */ long b;

        public a(kje kjeVar, long j, long j2) {
            this.f22702a = j;
            this.b = j2;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            txj.e("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download time : " + (currentTimeMillis - this.f22702a));
            if (this.b == kje.a()) {
                kje.b(true);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22703a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public b(kje kjeVar, String str, long j, long j2) {
            this.f22703a = str;
            this.b = j;
            this.c = j2;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            s0m.B().T(this.f22703a).fetch();
            txj.e("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download time : " + (currentTimeMillis - this.b));
            if (this.c == kje.a()) {
                kje.b(true);
            }
            return false;
        }
    }

    static {
        t2o.a(352322220);
        t2o.a(578814049);
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return b;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static long c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3878fff", new Object[]{intent})).longValue();
        }
        long j = 0;
        if (intent == null) {
            return 0L;
        }
        long longExtra = intent.getLongExtra("image_content_current_nav_token", 0L);
        if (longExtra == 0) {
            return 0L;
        }
        if (longExtra == b) {
            if (c) {
                txj.e("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download success.");
                return 0L;
            }
            long currentTimeMillis = 140 - (System.currentTimeMillis() - d);
            if (currentTimeMillis >= 0) {
                j = 60;
                if (currentTimeMillis <= 60) {
                    j = currentTimeMillis;
                }
            }
            txj.e("ImageContentDetailFragmentNavProcessor", "ImageContentMainPic download wait , remainTime = " + currentTimeMillis + " realWaitTime: " + j);
        }
        return j;
    }

    public final void d(Intent intent, long j) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bea1624", new Object[]{this, intent, new Long(j)});
        } else if (intent != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString(fnm.KEY_TARGET_PARAMS);
            if (!TextUtils.isEmpty(string)) {
                try {
                    String j2 = ywj.j(ywj.d(ywj.h(ywj.d(ywj.h(JSON.parseObject(string).getJSONObject("simpleDeliverData"), "mainImage")), "data")), "url");
                    if (TextUtils.isEmpty(j2)) {
                        txj.e("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic Abort.firstPicUrl is null.");
                        return;
                    }
                    txj.e("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic Success.hit firstPicUrl = " + j2);
                    e(j2, j);
                } catch (Exception e) {
                    txj.f("ImageContentDetailFragmentNavProcessor", "preFetchDeliverPic exception", e);
                }
            }
        }
    }

    public final void e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758d9c26", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        s0m.B().T(str).failListener(new b(this, str, currentTimeMillis, j)).succListener(new a(this, currentTimeMillis, j)).fetch();
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ImageContentDetailFragmentProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void f(Intent intent, zmj zmjVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7425e3", new Object[]{this, intent, zmjVar, new Long(j)});
        } else if (intent != null && zmjVar != null) {
            txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData will check.");
            String dataString = intent.getDataString();
            if (TextUtils.isEmpty(dataString)) {
                d(intent, j);
                txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort. intentDataStr is null.");
                return;
            }
            Uri parse = Uri.parse(dataString);
            if ("content".equals(parse.getQueryParameter("materialType"))) {
                str = parse.getQueryParameter("contentId");
            } else {
                str = parse.getQueryParameter("id");
            }
            ktm a2 = ltm.a(yq0.PRELOAD_REQUESTER_BIZ_NAME_LITE);
            if (TextUtils.isEmpty(str) || a2 == null) {
                d(intent, j);
                txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort. targetId or preloadTaskStore is null.");
                return;
            }
            btm a3 = a2.a(ynm.a(str, ynm.d(parse)));
            if (a3 != null) {
                T t = a3.e;
                if (t instanceof JSONObject) {
                    String j2 = ywj.j(ywj.d(ywj.h(ywj.d(ywj.h((JSONObject) t, "mainImage")), "data")), "url");
                    if (TextUtils.isEmpty(j2)) {
                        txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort.firstPicUrl is null.");
                        return;
                    }
                    this.f22701a = true;
                    txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Success.hit firstPicUrl = " + j2);
                    e(j2, j);
                    return;
                }
            }
            d(intent, j);
            txj.e("ImageContentDetailFragmentNavProcessor", "preloadImageContentData Abort.preloadTaskCacheData is null.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // tb.xnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean process(android.content.Intent r9, tb.zmj r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kje.process(android.content.Intent, tb.zmj):boolean");
    }
}
