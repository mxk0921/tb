package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.Tab3AnimationIcon;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final JSONObject r = JSON.parseObject("{\n  \"behaviorSequencePayload_livebar\":{\n    \"backgroundPicUrlList\":[\n      \"//gw.alicdn.com/bao/upload/bao/i4/2209744846528/O1CN01Ciouq11y5sPFKA5Fk_!!2209744846528.jpg\"\n    ],\n    \"bottomPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN01rKS5wv1tHiZ6ZzEMu_!!6000000005877-54-tps-99-34.apng\",\n    \"bottomTextColor\":\"#ffffff\",\n    \"bottomTextList\":[\n      \"秒杀\",\n      \"¥278\"\n    ],\n    \"currentTime\":1702449880736,\n    \"displayTime\":10,\n    \"displayTimes\":5,\n    \"expireTime\":1702450158000,\n    \"highPriorityBizCode\":\"seckill\",\n    \"iconSize\":20,\n    \"iconTextChangeInterval\":2000,\n    \"iconTextLeftPadding\":16,\n    \"iconTextRightPadding\":16,\n    \"lightPicUrl\":\"https://img.alicdn.com/imgextra/i3/O1CN015BhfMR1Kebo7ykeHr_!!6000000001189-54-tps-238-238.apng\",\n    \"mainImageSize\":88,\n    \"mainOuterImageSize\":96,\n    \"rightType\":\"seckill\",\n    \"sjsdItemId\":753895034719,\n    \"textBackgroundCornerRadius\":8,\n    \"textBackgroundGradientColor\":\"#ff0040,#ff4d79\",\n    \"textBackgroundHeight\":32,\n    \"textBackgroundMinWidth\":96,\n    \"type\":\"heterotype\"\n  }\n}");

    /* renamed from: a  reason: collision with root package name */
    public final int f19456a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final JSONArray g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final String n;
    public final int o;
    public final int p;
    public final Tab3AnimationIcon q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510404);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("1461f5a7", new Object[]{this});
            }
            return fps.d();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int a2 = fps.a(fps.this) + fps.b(fps.this);
            fps fpsVar = fps.this;
            TextPaint paint = fpsVar.g().getIconText().getPaint();
            ckf.f(paint, "tab3.iconText.paint");
            kew.g(fps.this.g().getIconText(), Math.max(Math.min(fps.c(fpsVar, paint) + a2, fps.this.g().getWidth()), fps.e(fps.this)));
        }
    }

    public fps(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        ckf.g(context, "context");
        this.b = kew.d(10);
        this.d = 2000;
        this.j = kew.d(44);
        this.l = kew.d(48);
        this.m = kew.d(4);
        this.n = "#ff0040,#ff4d79";
        this.o = kew.d(16);
        this.p = kew.d(48);
        this.q = new Tab3AnimationIcon(context);
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("behaviorSequencePayload_livebar")) == null)) {
            boolean b2 = ckf.b(jSONObject2.getString("rightType"), "right_dianTaoRedRain");
            JSONArray jSONArray = jSONObject2.getJSONArray("bottomTextList");
            if (jSONArray != null) {
                Object obj = jSONArray.get(0);
                if (obj != null) {
                    this.c = (String) obj;
                    this.g = b2 ? null : jSONArray;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.k = jSONObject2.getString("backgroundPicUrl");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("backgroundPicUrlList");
            if (jSONArray2 != null) {
                if (b2) {
                    str = jSONObject2.getString("backgroundPicUrl");
                } else {
                    Object obj2 = jSONArray2.get(0);
                    if (obj2 != null) {
                        str = (String) obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                this.k = str;
            }
            this.e = jSONObject2.getString("bottomPicUrl");
            this.h = jSONObject2.getIntValue("displayTimes");
            this.f19456a = Color.parseColor(jSONObject2.getString("bottomTextColor"));
            this.b = kew.v(Integer.valueOf(jSONObject2.getIntValue("iconSize")));
            this.d = jSONObject2.getIntValue("iconTextChangeInterval");
            this.j = kew.v(Integer.valueOf(jSONObject2.getIntValue("mainImageSize")));
            this.l = kew.v(Integer.valueOf(jSONObject2.getIntValue("mainOuterImageSize")));
            this.m = kew.v(Integer.valueOf(jSONObject2.getIntValue("textBackgroundCornerRadius")));
            this.p = kew.v(Integer.valueOf(jSONObject2.getIntValue("textBackgroundMinWidth")));
            this.o = kew.v(Integer.valueOf(jSONObject2.getIntValue("textBackgroundHeight")));
            this.n = jSONObject2.getString("textBackgroundGradientColor");
            this.f = kew.v(Integer.valueOf(jSONObject2.getIntValue("iconTextLeftPadding")));
            this.i = kew.v(Integer.valueOf(jSONObject2.getIntValue("iconTextRightPadding")));
        }
        h();
    }

    public static final /* synthetic */ int a(fps fpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29864099", new Object[]{fpsVar})).intValue();
        }
        return fpsVar.f;
    }

    public static final /* synthetic */ int b(fps fpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("488690dc", new Object[]{fpsVar})).intValue();
        }
        return fpsVar.i;
    }

    public static final /* synthetic */ int c(fps fpsVar, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e43dc68", new Object[]{fpsVar, paint})).intValue();
        }
        return fpsVar.f(paint);
    }

    public static final /* synthetic */ JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61f597f8", new Object[0]);
        }
        return r;
    }

    public static final /* synthetic */ int e(fps fpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eade590", new Object[]{fpsVar})).intValue();
        }
        return fpsVar.p;
    }

    public final Tab3AnimationIcon g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tab3AnimationIcon) ipChange.ipc$dispatch("9a48c2e1", new Object[]{this});
        }
        return this.q;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.q.setClipChildren(false);
        kew.f(this.q.getRootLayout(), kew.d(70), kew.d(55));
        this.q.getIconText().setText(this.c);
        this.q.getIconText().setTextSize(0, this.b);
        this.q.getIconText().setTextColor(this.f19456a);
        kew.e(this.q.getIconText(), this.o);
        this.q.getMainImage().setImageUrl(this.k);
        String str = this.n;
        if (str != null) {
            List y0 = wsq.y0(str, new char[]{','}, false, 0, 6, null);
            kew.S(g().getFlIconText(), g().getTab3IconTextBackgroundDrawable((String) i04.d0(y0, 0), (String) i04.d0(y0, 1), this.m));
        }
        this.q.getIconTextFloatImage().setImageUrl(this.e);
        kew.e(this.q.getMainImageLayout(), this.j);
        kew.g(this.q.getMainImageLayout(), this.j);
        kew.e(this.q.getBorderImageLayout(), this.l);
        kew.g(this.q.getBorderImageLayout(), this.l);
        kew.e(this.q.getBorderImage2(), this.l);
        kew.g(this.q.getBorderImage2(), this.l);
        kew.d0(this.q.getRootLayout(), 0);
        kew.e0(this.q.getMainImageLayout(), true, this.j / 2);
        this.q.getIconText().setPadding(this.f, 0, this.i, 0);
        int i = this.f + this.i;
        if (this.p != 0) {
            this.q.post(new b());
        } else {
            kew.g(this.q.getIconText(), i);
        }
        this.q.startBreathAni();
        this.q.startSwitchText(this.d, this.h, this.g);
    }

    public final int f(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3cff443", new Object[]{this, paint})).intValue();
        }
        JSONArray jSONArray = this.g;
        if (jSONArray == null || jSONArray.isEmpty()) {
            return 0;
        }
        float f = 0.0f;
        for (Object obj : jSONArray) {
            if (obj != null) {
                float measureText = paint.measureText((String) obj);
                if (measureText > f) {
                    f = measureText;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return (int) f;
    }

    static {
        t2o.a(766510403);
    }
}
