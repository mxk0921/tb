package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewEntity;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.MarqueeGalleryAdapter;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bg6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTAOLIVEJELLYMARQUEE_AUTOSCROLL = 2581999839571595826L;
    public static final long DXTAOLIVEJELLYMARQUEE_ISCACHE = 4954174782170669367L;
    public static final long DXTAOLIVEJELLYMARQUEE_MARQUEELISTDATA = -7994418844692357355L;
    public static final long DXTAOLIVEJELLYMARQUEE_ONCHANGE = 5288679823228297259L;
    public static final long DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE = 714296102135946647L;
    public static final int EVENT_TAOLIVE_FAXIAN_RECYCLER_SCROLL_LISTENER = 20001;
    public static final int EVENT_TAOLIVE_FAXIAN_SELECTED = 20002;
    public static final String EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND = "com.taobao.live.home.top_marquee_background";
    public static final String TAG = bg6.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public boolean f16366a;
    public boolean b;
    public JSONArray c;
    public List<FlexiblePageViewEntity> d;
    public int e;
    public int f;
    public int g;
    public FlexibleMarqueeGallery h;
    public MarqueeGalleryAdapter i;
    public boolean j = true;
    public boolean k = true;
    public int l = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements AbsFlexibleMarqueeGallery.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6abbfec8", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                return;
            }
            if (bg6.t(bg6.this) != null) {
                int size = i % bg6.t(bg6.this).size();
                if (bg6.t(bg6.this) != null) {
                    qyg.c().e(bg6.EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, bg6.t(bg6.this).getJSONObject(size).getString("channelBackgroudImg"));
                }
            }
            if (bg6.u(bg6.this) != null) {
                bg6.u(bg6.this).l(i);
            }
            if (bg6.v(bg6.this) != null && !bg6.v(bg6.this).isEmpty()) {
                FlexiblePageViewEntity flexiblePageViewEntity = (FlexiblePageViewEntity) bg6.v(bg6.this).get(i % bg6.v(bg6.this).size());
                FlexiblePageViewEntity flexiblePageViewEntity2 = (FlexiblePageViewEntity) bg6.v(bg6.this).get(i2 % bg6.v(bg6.this).size());
                bg6.w(bg6.this, flexiblePageViewEntity.showMaidian, true);
                if (!TextUtils.isEmpty(flexiblePageViewEntity.channelBackgroudImg)) {
                    bg6.w(bg6.this, flexiblePageViewEntity.showMaidianBackground, true);
                }
                bg6.w(bg6.this, flexiblePageViewEntity2.showMaidian, false);
            }
        }

        public void b(View view, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6171e7bc", new Object[]{this, view, new Integer(i), new Boolean(z)});
            }
        }

        public void c(View view, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3097e4c6", new Object[]{this, view, new Integer(i), new Boolean(z)});
            }
        }

        public void d(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("610b3767", new Object[]{this, new Integer(i), new Boolean(z)});
            }
        }

        public void e(int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87ecccae", new Object[]{this, new Integer(i), new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378574);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new bg6();
        }
    }

    static {
        t2o.a(310378572);
    }

    public static /* synthetic */ Object ipc$super(bg6 bg6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/DXTaoLiveJellyMarqueeWidgetNode");
        }
    }

    public static /* synthetic */ JSONArray t(bg6 bg6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6763828d", new Object[]{bg6Var});
        }
        return bg6Var.c;
    }

    public static /* synthetic */ MarqueeGalleryAdapter u(bg6 bg6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarqueeGalleryAdapter) ipChange.ipc$dispatch("45bd61ed", new Object[]{bg6Var});
        }
        return bg6Var.i;
    }

    public static /* synthetic */ List v(bg6 bg6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a36ce998", new Object[]{bg6Var});
        }
        return bg6Var.d;
    }

    public static /* synthetic */ void w(bg6 bg6Var, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135f20d2", new Object[]{bg6Var, jSONObject, new Boolean(z)});
        } else {
            bg6Var.z(jSONObject, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new bg6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof bg6)) {
            super.onClone(dXWidgetNode, z);
            bg6 bg6Var = (bg6) dXWidgetNode;
            if (!nvs.F() || !bg6Var.f16366a) {
                z2 = false;
            }
            this.f16366a = z2;
            this.b = bg6Var.b;
            this.c = bg6Var.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FlexibleMarqueeGallery flexibleMarqueeGallery = new FlexibleMarqueeGallery(context);
        this.h = flexibleMarqueeGallery;
        return flexibleMarqueeGallery;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 2581999839571595826L) {
            if (i == 0) {
                z = false;
            }
            this.f16366a = z;
        } else if (j == 4954174782170669367L) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXTAOLIVEJELLYMARQUEE_MARQUEELISTDATA) {
            this.c = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    public final int x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b16687b8", new Object[]{this, new Integer(i)})).intValue();
        }
        return ((this.f * i) * 2) / 210;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7303cc3c", new Object[]{this});
        } else if (this.j && this.f16366a && this.k) {
            c4a c4aVar = new c4a(this.h);
            c4aVar.p(Integer.MAX_VALUE);
            c4aVar.o(nvs.b());
            c4aVar.q();
        } else if (this.h.getAutoRunner() != null) {
            this.h.getAutoRunner().j();
        }
    }

    public final void z(JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a345711", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        String str2 = TAG;
        Log.e(str2, "track4Show " + this.b);
        if (!this.b && jSONObject != null) {
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("name");
            HashMap hashMap = new HashMap();
            hashMap.putAll(xxv.a(jSONObject.getString("params")));
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, str);
            mbu.k(string, string2, hashMap);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        Map<String, mw5> args;
        mw5 mw5Var;
        mw5 mw5Var2;
        FlexibleMarqueeGallery flexibleMarqueeGallery;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent != null) {
            if (dXEvent.getEventId() == 20001) {
                Map<String, mw5> args2 = dXEvent.getArgs();
                if (!(args2 == null || (mw5Var2 = args2.get("newState")) == null || !mw5Var2.y() || (flexibleMarqueeGallery = this.h) == null)) {
                    int[] iArr = new int[2];
                    flexibleMarqueeGallery.getLocationOnScreen(iArr);
                    this.l = Math.max(this.l, iArr[1]);
                    String str = TAG;
                    TLog.loge(str, "onScrollStateChanged " + iArr[1] + " " + this.l + " " + this.f + " " + mw5Var2);
                    if (mw5Var2.m() == 0) {
                        int i = iArr[1];
                        if (i != 0 && this.l - i <= this.f / 2) {
                            y();
                            TLog.loge(str, "onScrollStateChanged resume");
                        } else if (this.h.getAutoRunner() != null) {
                            this.h.getAutoRunner().j();
                            TLog.loge(str, "onScrollStateChanged pause");
                        }
                    }
                }
            } else if (!(dXEvent.getEventId() != 20002 || (args = dXEvent.getArgs()) == null || (mw5Var = args.get("isAppear")) == null || !mw5Var.u() || this.h == null)) {
                if (mw5Var.i()) {
                    this.k = true;
                    y();
                    TLog.loge(TAG, "FAXIAN_SELECTED resume");
                } else {
                    this.k = false;
                    if (this.h.getAutoRunner() != null) {
                        this.h.getAutoRunner().j();
                        TLog.loge(TAG, "FAXIAN_SELECTED pause");
                    }
                }
            }
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        this.j = nvs.k();
        this.l = 0;
        if (this.h == null) {
            if (view instanceof FlexibleMarqueeGallery) {
                this.h = (FlexibleMarqueeGallery) view;
            } else {
                return;
            }
        }
        String str = TAG;
        TLog.loge(str, "onRenderView " + this.c.toJSONString());
        this.f = pb6.c(context, 105.0f);
        this.e = x(174);
        this.g = x(83);
        int l = qw0.l();
        int i = ((l - this.e) - (this.g * 2)) / 4;
        int i2 = l - (i * 2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = this.f;
        marginLayoutParams.setMargins(i, 0, i, 0);
        this.h.setLayoutParams(marginLayoutParams);
        this.h.setEnableScaleAnime(true);
        this.h.setGalleryDisplayWidth(i2);
        this.h.setFoldedCardWidth(this.g);
        this.h.setFoldedCardVisibleCount(2);
        this.h.setCardHeight(this.f);
        this.h.setCardSpacing(i);
        this.h.setCardCornerRadius(x(6));
        this.h.setScrollAnimDuration(1000L);
        this.h.setBezierFactors(0.3f, 0.0f, 0.25f, 1.0f);
        this.h.setScaleAnimeMinValue(0.9f);
        this.h.setMoveAnimeDelayDistanceRate(0.09f);
        this.h.setOnGalleryScrollListener(new a());
        if (this.d == null) {
            this.d = fkx.c(this.c.toJSONString(), FlexiblePageViewEntity.class);
        }
        MarqueeGalleryAdapter marqueeGalleryAdapter = new MarqueeGalleryAdapter(this.j, this.b, this.e, this.f, this.g);
        this.i = marqueeGalleryAdapter;
        marqueeGalleryAdapter.k(this.d);
        this.h.setAdapter(this.i);
        y();
        this.h.setOnCardAnimatePerformListener(new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.a(this.h));
        int i3 = 0;
        while (i3 < 3) {
            List<FlexiblePageViewEntity> list = this.d;
            FlexiblePageViewEntity flexiblePageViewEntity = list.get(i3 % list.size());
            z(flexiblePageViewEntity.showMaidian, i3 == 0);
            if (i3 == 0) {
                if (!TextUtils.isEmpty(flexiblePageViewEntity.channelBackgroudImg)) {
                    z(flexiblePageViewEntity.showMaidianBackground, i3 == 0);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imageUrl", (Object) flexiblePageViewEntity.channelBackgroudImg);
                jSONObject.put("isCache", (Object) Boolean.valueOf(this.b));
                if (p0.g(p0.f())) {
                    qyg.c().e(EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, jSONObject);
                } else {
                    qyg.c().e(EVENT_TAOLIVE_FAXIAN_TOP_MARQUEE_BACKGROUND, flexiblePageViewEntity.channelBackgroudImg);
                }
            }
            i3++;
        }
    }
}
