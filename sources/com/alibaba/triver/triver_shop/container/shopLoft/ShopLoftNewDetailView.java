package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.a;
import kotlin.b;
import tb.bpp;
import tb.ckf;
import tb.kew;
import tb.njg;
import tb.npp;
import tb.t2o;
import tb.xhv;
import tb.xpd;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftNewDetailView implements xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3004a;
    public JSONObject b;
    public JSONObject c;
    public Context d;
    public xpd.c e;
    public final njg f = a.b(new ShopLoftNewDetailView$rootView$2(this));
    public ShopWrapWebView g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class HorizontalSwipeLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        private int swipeThreshold = 20;
        public final /* synthetic */ ShopLoftNewDetailView this$0;

        static {
            t2o.a(766509189);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalSwipeLayout(ShopLoftNewDetailView shopLoftNewDetailView, Context context) {
            super(context);
            ckf.g(shopLoftNewDetailView, "this$0");
            ckf.g(context, "context");
            this.this$0 = shopLoftNewDetailView;
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("d44d670b", new Object[]{this});
            }
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RecyclerView) {
                    return (RecyclerView) parent;
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(HorizontalSwipeLayout horizontalSwipeLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftNewDetailView$HorizontalSwipeLayout");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            RecyclerView findRecyclerView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.startX = 0.0f;
                this.startY = 0.0f;
                this.alreadyDetect = false;
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(this.startX - x);
                float abs2 = Math.abs(this.startY - y);
                double d = 2;
                float sqrt = (float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)));
                if (abs2 <= abs && sqrt >= 20.0f && (findRecyclerView = findRecyclerView()) != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(true);
                }
                this.alreadyDetect = true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue();
            }
            return this.alreadyDetect;
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
            }
            return this.startX;
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
            }
            return this.startY;
        }

        public final int getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5f169c41", new Object[]{this})).intValue();
            }
            return this.swipeThreshold;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        public final void setSwipeThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2021fe9", new Object[]{this, new Integer(i)});
            } else {
                this.swipeThreshold = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class HorizontalSwipeLayoutV2 extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private int moveEventCount;
        private float startX;
        private float startY;
        private int swipeThreshold = 20;
        public final /* synthetic */ ShopLoftNewDetailView this$0;

        static {
            t2o.a(766509190);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalSwipeLayoutV2(ShopLoftNewDetailView shopLoftNewDetailView, Context context) {
            super(context);
            ckf.g(shopLoftNewDetailView, "this$0");
            ckf.g(context, "context");
            this.this$0 = shopLoftNewDetailView;
        }

        private final void clearStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
                return;
            }
            this.startX = 0.0f;
            this.startY = 0.0f;
            this.alreadyDetect = false;
            this.moveEventCount = 0;
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("d44d670b", new Object[]{this});
            }
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RecyclerView) {
                    return (RecyclerView) parent;
                }
            }
            return null;
        }

        public static /* synthetic */ Object ipc$super(HorizontalSwipeLayoutV2 horizontalSwipeLayoutV2, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLoftNewDetailView$HorizontalSwipeLayoutV2");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                clearStatus();
                RecyclerView findRecyclerView = findRecyclerView();
                if (findRecyclerView != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                clearStatus();
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                int i = this.moveEventCount + 1;
                this.moveEventCount = i;
                if (i == 3) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float abs = Math.abs(this.startX - x);
                    float abs2 = Math.abs(this.startY - y);
                    double d = 2;
                    float sqrt = (float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)));
                    RecyclerView findRecyclerView3 = findRecyclerView();
                    if (abs2 > abs || sqrt < 20.0f) {
                        if (findRecyclerView3 != null) {
                            findRecyclerView3.requestDisallowInterceptTouchEvent(false);
                        }
                    } else if (findRecyclerView3 != null) {
                        findRecyclerView3.requestDisallowInterceptTouchEvent(true);
                    }
                    this.alreadyDetect = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue();
            }
            return this.alreadyDetect;
        }

        public final int getMoveEventCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("79ae98b6", new Object[]{this})).intValue();
            }
            return this.moveEventCount;
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
            }
            return this.startX;
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
            }
            return this.startY;
        }

        public final int getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5f169c41", new Object[]{this})).intValue();
            }
            return this.swipeThreshold;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final void setMoveEventCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a69b214", new Object[]{this, new Integer(i)});
            } else {
                this.moveEventCount = i;
            }
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        public final void setSwipeThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2021fe9", new Object[]{this, new Integer(i)});
            } else {
                this.swipeThreshold = i;
            }
        }
    }

    static {
        t2o.a(766509188);
        t2o.a(766509126);
    }

    public static final /* synthetic */ Context a(ShopLoftNewDetailView shopLoftNewDetailView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("72054f30", new Object[]{shopLoftNewDetailView});
        }
        return shopLoftNewDetailView.d;
    }

    public final HorizontalSwipeLayoutV2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HorizontalSwipeLayoutV2) ipChange.ipc$dispatch("42300c40", new Object[]{this});
        }
        return (HorizontalSwipeLayoutV2) this.f.getValue();
    }

    @Override // tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        play();
        WVStandardEventCenter.postNotificationToJS(this.g, "shopContentList.viewAppear", "");
    }

    @Override // tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS(this.g, "shopContentList.viewDisappear", "");
        }
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        return null;
    }

    @Override // tb.xpd
    public String getUTPageName() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null || (string = jSONObject.getString("arg1")) == null) {
            return "Page_NewDetail";
        }
        return string;
    }

    @Override // tb.xpd
    public Map<String, String> getUTProperties() {
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.c;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("args");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    String key = entry.getKey();
                    ckf.f(key, "entry.key");
                    hashMap.put(key, entry.getValue().toString());
                }
            }
        }
        String str5 = "";
        if (hashMap.get("shop_id") == null) {
            JSONObject jSONObject3 = this.b;
            if (jSONObject3 == null || (str4 = jSONObject3.getString("shopId")) == null) {
                str4 = str5;
            }
            hashMap.put("shop_id", str4);
        }
        if (hashMap.get("seller_id") == null) {
            JSONObject jSONObject4 = this.b;
            if (jSONObject4 == null || (str3 = jSONObject4.getString("sellerId")) == null) {
                str3 = str5;
            }
            hashMap.put("seller_id", str3);
        }
        if (hashMap.get("item_id") == null) {
            Uri parse = Uri.parse(this.f3004a);
            if (parse == null || (str2 = parse.getQueryParameter("itemId")) == null) {
                str2 = str5;
            }
            hashMap.put("item_id", str2);
        }
        if (hashMap.get("newDetailChannel") == null) {
            hashMap.put("newDetailChannel", "shopdetailcard");
        }
        if (hashMap.get("entrySpm") == null) {
            JSONObject jSONObject5 = this.b;
            if (jSONObject5 == null || (str = jSONObject5.getString("entrySpm")) == null) {
                str = str5;
            }
            hashMap.put("entrySpm", str);
        }
        JSONObject jSONObject6 = this.b;
        if (!(jSONObject6 == null || (string = jSONObject6.getString("source")) == null)) {
            str5 = string;
        }
        hashMap.put(yj4.PARAM_ENTRY_SOURCE, str5);
        return hashMap;
    }

    @Override // tb.xpd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return b();
    }

    @Override // tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        if (context != null) {
            this.d = context;
        }
        this.b = jSONObject;
        if (jSONObject != null) {
            this.f3004a = jSONObject.getString("ndPageUrl");
            this.c = jSONObject.getJSONObject("spmParams");
        }
        this.e = cVar;
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        pause();
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView != null) {
            bpp.b(shopWrapWebView);
        }
    }

    @Override // tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView != null) {
            bpp.a(shopWrapWebView);
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onDestroyed() {
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        try {
            shopWrapWebView = this.g;
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
        if (shopWrapWebView != null && shopWrapWebView.isDestroied()) {
            Result.m1108constructorimpl(xhv.INSTANCE);
            this.g = null;
            b().removeAllViews();
        }
        ShopWrapWebView shopWrapWebView2 = this.g;
        if (shopWrapWebView2 != null) {
            shopWrapWebView2.destroy();
        }
        Result.m1108constructorimpl(xhv.INSTANCE);
        this.g = null;
        b().removeAllViews();
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        } else {
            play();
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView != null) {
            shopWrapWebView.onPause();
        }
        npp.Companion.b("newDetail paused");
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        npp.Companion.b("newDetail play");
        ShopWrapWebView shopWrapWebView = this.g;
        if (shopWrapWebView == null) {
            Context context = this.d;
            if (context != null) {
                ShopWrapWebView shopWrapWebView2 = new ShopWrapWebView(context);
                this.g = shopWrapWebView2;
                shopWrapWebView2.getShopLoftWebViewBizAdapter().o(this.b);
                shopWrapWebView2.loadUrl(this.f3004a);
                shopWrapWebView2.setBackgroundColor(-16777216);
                kew.a(b(), shopWrapWebView2);
                return;
            }
            ckf.y("context");
            throw null;
        } else if (shopWrapWebView != null) {
            shopWrapWebView.onResume();
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }
}
