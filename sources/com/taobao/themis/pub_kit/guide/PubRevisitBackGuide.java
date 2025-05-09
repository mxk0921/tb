package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubRevisitGuideModelNew;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.p8s;
import tb.pg1;
import tb.q3n;
import tb.q9s;
import tb.r3n;
import tb.s0m;
import tb.t2o;
import tb.xcs;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubRevisitBackGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13728a;
    public final PubUserGuideModule b;
    public final PopupWindow c;
    public volatile boolean d;
    public final PubRevisitGuideModelNew e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void exit();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        static {
            t2o.a(845152311);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PubRevisitGuideModelNew b;

        public c(PubRevisitGuideModelNew pubRevisitGuideModelNew) {
            this.b = pubRevisitGuideModelNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            PubRevisitBackGuide.b(PubRevisitBackGuide.this).dismiss();
            String actionURL = this.b.getActionURL();
            if (actionURL != null) {
                PubRevisitBackGuide pubRevisitBackGuide = PubRevisitBackGuide.this;
                Object g = p8s.g(INavigatorAdapter.class);
                ckf.f(g, "getNotNull(INavigatorAdapter::class.java)");
                INavigatorAdapter.b.a((INavigatorAdapter) g, PubRevisitBackGuide.a(pubRevisitBackGuide), actionURL, null, null, null, 16, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;

        public d(a aVar) {
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            PubRevisitBackGuide.b(PubRevisitBackGuide.this).dismiss();
            a aVar = this.b;
            if (aVar != null) {
                aVar.exit();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PubRevisitBackGuide.b(PubRevisitBackGuide.this).dismiss();
            }
        }
    }

    static {
        t2o.a(845152309);
    }

    public PubRevisitBackGuide(Context context, PubUserGuideModule pubUserGuideModule) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        this.f13728a = context;
        this.b = pubUserGuideModule;
        this.c = new PopupWindow(context);
        this.e = pubUserGuideModule.getRevisitPopupByReturn();
    }

    public static final /* synthetic */ Context a(PubRevisitBackGuide pubRevisitBackGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b89ea9b8", new Object[]{pubRevisitBackGuide});
        }
        return pubRevisitBackGuide.f13728a;
    }

    public static final /* synthetic */ PopupWindow b(PubRevisitBackGuide pubRevisitBackGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("feb30626", new Object[]{pubRevisitBackGuide});
        }
        return pubRevisitBackGuide.c;
    }

    public final void c(String str, String str2) {
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Integer backFatigueCountValue;
        Integer backFatigueDayValue;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cb3fd", new Object[]{this, str, str2});
            return;
        }
        PubPropertiesModel properties = this.b.getProperties();
        int intValue = (properties == null || (backFatigueDayValue = properties.getBackFatigueDayValue()) == null) ? 0 : backFatigueDayValue.intValue();
        int intValue2 = (properties == null || (backFatigueCountValue = properties.getBackFatigueCountValue()) == null) ? 0 : backFatigueCountValue.intValue();
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.e;
        int parseInt = (pubRevisitGuideModelNew == null || (bizFatigueModel2 = pubRevisitGuideModelNew.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubRevisitGuideModelNew pubRevisitGuideModelNew2 = this.e;
        int parseInt2 = (pubRevisitGuideModelNew2 == null || (bizFatigueModel = pubRevisitGuideModelNew2.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("revisitPopupByReturn")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt3 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, parseInt3, i);
        }
        IpChange ipChange2 = r3n.$ipChange;
        r3n.a(this.f13728a, "revisitPopupByReturn", new q3n(str, parseInt, parseInt2), new q3n(str2, intValue, intValue2), q3nVar);
    }

    public final boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f13728a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("revisitPopupByReturn", "environment illegality");
            return false;
        } else if (this.e == null) {
            TMSLogger.b("revisitPopupByReturn", "mRevisitGuideModel is null");
            return false;
        } else if (this.d) {
            TMSLogger.b("revisitPopupByReturn", "has displayed");
            return false;
        } else if (!g(str, str2)) {
            return true;
        } else {
            TMSLogger.b("revisitPopupByReturn", "Beyond fatigue");
            return false;
        }
    }

    public final boolean f(View view, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baa3ea2d", new Object[]{this, view, str, str2, aVar})).booleanValue();
        }
        ckf.g(view, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (!d(str, str2)) {
            return false;
        }
        boolean e2 = e(view, aVar);
        if (e2) {
            this.d = true;
            c(str, str2);
        }
        return e2;
    }

    public final boolean g(String str, String str2) {
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Integer backFatigueCountValue;
        Integer backFatigueDayValue;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a90e5c0", new Object[]{this, str, str2})).booleanValue();
        }
        PubPropertiesModel properties = this.b.getProperties();
        int intValue = (properties == null || (backFatigueDayValue = properties.getBackFatigueDayValue()) == null) ? 0 : backFatigueDayValue.intValue();
        int intValue2 = (properties == null || (backFatigueCountValue = properties.getBackFatigueCountValue()) == null) ? 0 : backFatigueCountValue.intValue();
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.e;
        int parseInt = (pubRevisitGuideModelNew == null || (bizFatigueModel2 = pubRevisitGuideModelNew.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubRevisitGuideModelNew pubRevisitGuideModelNew2 = this.e;
        int parseInt2 = (pubRevisitGuideModelNew2 == null || (bizFatigueModel = pubRevisitGuideModelNew2.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("revisitPopupByReturn")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt3 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, parseInt3, i);
        }
        IpChange ipChange2 = r3n.$ipChange;
        return r3n.d(this.f13728a, "revisitPopupByReturn", new q3n(str, parseInt, parseInt2), new q3n(str2, intValue, intValue2), q3nVar);
    }

    public final boolean e(View view, a aVar) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ead6c011", new Object[]{this, view, aVar})).booleanValue();
        }
        PubRevisitGuideModelNew pubRevisitGuideModelNew = this.e;
        if (pubRevisitGuideModelNew == null) {
            return false;
        }
        View inflate = View.inflate(this.f13728a, R.layout.tms_pub_revisit_guide_layout, null);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tip_gif);
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
            if (!TextUtils.isEmpty(pubRevisitGuideModelNew.getGuideImg())) {
                str = pubRevisitGuideModelNew.getGuideImg();
            } else {
                str = q9s.c3();
            }
            s0m.B().U("common", str).bitmapProcessors(new RoundedCornersBitmapProcessor(xcs.a(this.f13728a, 15.0f), 0, RoundedCornersBitmapProcessor.CornerType.TOP)).into(tUrlImageView);
        }
        ((TIconFontTextView) inflate.findViewById(R.id.switch_image)).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(R.id.favor_tip);
        if (!TextUtils.isEmpty(pubRevisitGuideModelNew.getMainText())) {
            textView.setText(pubRevisitGuideModelNew.getMainText());
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.favor_tip_subtitle);
        if (!TextUtils.isEmpty(pubRevisitGuideModelNew.getSubText())) {
            textView2.setText(pubRevisitGuideModelNew.getSubText());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.guide_button);
        if (!TextUtils.isEmpty(pubRevisitGuideModelNew.getActionText())) {
            textView3.setVisibility(0);
            textView3.setText(pubRevisitGuideModelNew.getActionText());
            textView3.setOnClickListener(new c(pubRevisitGuideModelNew));
        }
        TextView textView4 = (TextView) inflate.findViewById(R.id.ok_button);
        textView4.setText("退出");
        textView4.setOnClickListener(new d(aVar));
        ((TIconFontTextView) inflate.findViewById(R.id.close_image)).setOnClickListener(new e());
        Object systemService = this.f13728a.getSystemService(pg1.ATOM_EXT_window);
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            PopupWindow popupWindow = this.c;
            FrameLayout frameLayout = new FrameLayout(this.f13728a);
            if (this.f13728a.getResources().getConfiguration().orientation == 2) {
                i = displayMetrics.widthPixels / 3;
            } else {
                i = (displayMetrics.widthPixels * 2) / 3;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.addView(inflate, layoutParams);
            popupWindow.setContentView(frameLayout);
            popupWindow.setOutsideTouchable(false);
            popupWindow.setFocusable(true);
            popupWindow.setClippingEnabled(false);
            popupWindow.setAnimationStyle(R.style.tms_pop_window_anim_alpha);
            popupWindow.setSoftInputMode(16);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            colorDrawable.setAlpha(100);
            popupWindow.setBackgroundDrawable(colorDrawable);
            popupWindow.setHeight(displayMetrics.heightPixels);
            popupWindow.setWidth(-1);
            popupWindow.getContentView().setPadding(0, 0, 0, displayMetrics.heightPixels - displayMetrics2.heightPixels);
            TMSLogger.f("revisitPopupByReturn", "show revisitPopupByReturn");
            CommonExtKt.o(new PubRevisitBackGuide$dpShowReVisitGuide$2(this, view));
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
