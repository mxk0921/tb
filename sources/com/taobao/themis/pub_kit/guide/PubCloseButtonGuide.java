package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.guide.model.PubCloseButtonModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a07;
import tb.ckf;
import tb.q3n;
import tb.r3n;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubCloseButtonGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13723a;
    public final PubUserGuideModule b;
    public final PopupWindow c;
    public final PubCloseButtonModel d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152283);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PubCloseButtonGuide.b(PubCloseButtonGuide.this).dismiss();
            }
        }
    }

    static {
        t2o.a(845152282);
    }

    public PubCloseButtonGuide(Context context, PubUserGuideModule pubUserGuideModule) {
        ckf.g(context, "mContext");
        ckf.g(pubUserGuideModule, "mUserGuideModule");
        this.f13723a = context;
        this.b = pubUserGuideModule;
        this.c = new PopupWindow(context);
        this.d = pubUserGuideModule.getCloseButtonTip();
    }

    public static final /* synthetic */ Context a(PubCloseButtonGuide pubCloseButtonGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fbcff103", new Object[]{pubCloseButtonGuide});
        }
        return pubCloseButtonGuide.f13723a;
    }

    public static final /* synthetic */ PopupWindow b(PubCloseButtonGuide pubCloseButtonGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("424a76fb", new Object[]{pubCloseButtonGuide});
        }
        return pubCloseButtonGuide.c;
    }

    public final void c(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        int i5;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cb3fd", new Object[]{this, str, str2});
            return;
        }
        PubCloseButtonModel pubCloseButtonModel = this.d;
        if (pubCloseButtonModel == null || (userFatigueModel2 = pubCloseButtonModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubCloseButtonModel pubCloseButtonModel2 = this.d;
        if (pubCloseButtonModel2 == null || (userFatigueModel = pubCloseButtonModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubCloseButtonModel pubCloseButtonModel3 = this.d;
        if (pubCloseButtonModel3 == null || (bizFatigueModel2 = pubCloseButtonModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubCloseButtonModel pubCloseButtonModel4 = this.d;
        if (pubCloseButtonModel4 == null || (bizFatigueModel = pubCloseButtonModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("closeButtonTip")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) {
                i5 = 0;
            } else {
                i5 = Integer.parseInt(fatigueDayValue);
            }
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i6 = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, i5, i6);
        }
        IpChange ipChange2 = r3n.$ipChange;
        r3n.a(this.f13723a, "closeButtonTip", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            CommonExtKt.o(new PubCloseButtonGuide$hide$1(this));
        }
    }

    public final boolean h(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        q3n q3nVar;
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        int i5;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a90e5c0", new Object[]{this, str, str2})).booleanValue();
        }
        PubCloseButtonModel pubCloseButtonModel = this.d;
        if (pubCloseButtonModel == null || (userFatigueModel2 = pubCloseButtonModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("fatigueDayValue")) == null) {
            i = 0;
        } else {
            i = Integer.parseInt(str6);
        }
        PubCloseButtonModel pubCloseButtonModel2 = this.d;
        if (pubCloseButtonModel2 == null || (userFatigueModel = pubCloseButtonModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("fatigueCountValue")) == null) {
            i2 = 0;
        } else {
            i2 = Integer.parseInt(str5);
        }
        PubCloseButtonModel pubCloseButtonModel3 = this.d;
        if (pubCloseButtonModel3 == null || (bizFatigueModel2 = pubCloseButtonModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("fatigueDayValue")) == null) {
            i3 = 0;
        } else {
            i3 = Integer.parseInt(str4);
        }
        PubCloseButtonModel pubCloseButtonModel4 = this.d;
        if (pubCloseButtonModel4 == null || (bizFatigueModel = pubCloseButtonModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("fatigueCountValue")) == null) {
            i4 = 0;
        } else {
            i4 = Integer.parseInt(str3);
        }
        PubPropertiesModel properties = this.b.getProperties();
        if (properties == null || (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) == null || (range = totalGuidePopupUserFatigueConfig.getRange()) == null || !range.contains("closeButtonTip")) {
            q3nVar = null;
        } else {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) {
                i5 = 0;
            } else {
                i5 = Integer.parseInt(fatigueDayValue);
            }
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (!(totalGuidePopupUserFatigueConfig3 == null || (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) == null)) {
                i6 = Integer.parseInt(fatigueCountValue);
            }
            q3nVar = new q3n(str2, i5, i6);
        }
        IpChange ipChange2 = r3n.$ipChange;
        return r3n.d(this.f13723a, "closeButtonTip", new q3n(str, i3, i4), new q3n(str2, i, i2), q3nVar);
    }

    public final boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb5780c", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        Context context = this.f13723a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("closeButtonTip", "environment illegality");
            return false;
        } else if (this.e.get()) {
            TMSLogger.b("closeButtonTip", "气泡已展示");
            return false;
        } else if (!h(str, str2)) {
            return true;
        } else {
            TMSLogger.b("closeButtonTip", "Beyond fatigue");
            return false;
        }
    }

    public final boolean f(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d16ff66", new Object[]{this, view, str, str2})).booleanValue();
        }
        ckf.g(view, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(str, "appId");
        ckf.g(str2, "userId");
        if (!d(str, str2)) {
            return false;
        }
        boolean g = g(view);
        if (g) {
            this.e.set(true);
            c(str, str2);
        }
        return g;
    }

    public final boolean g(View view) {
        String disappearTime;
        String title;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d80c2d20", new Object[]{this, view})).booleanValue();
        }
        PubCloseButtonModel pubCloseButtonModel = this.d;
        String str = "关闭频道退回首页";
        if (!(pubCloseButtonModel == null || (title = pubCloseButtonModel.getTitle()) == null)) {
            str = title;
        }
        View view2 = null;
        View inflate = View.inflate(this.f13723a, R.layout.tms_pub_close_button_tips_layout, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.tvMainText);
            if (textView != null) {
                textView.setText(str);
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.btnClose);
            if (imageView != null) {
                imageView.setOnClickListener(new b());
            }
            view2 = inflate;
        }
        if (view2 == null) {
            return false;
        }
        PopupWindow popupWindow = this.c;
        popupWindow.setContentView(view2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(false);
        popupWindow.setHeight(xcs.a(this.f13723a, 42.5f));
        popupWindow.setWidth(xcs.a(this.f13723a, 152.0f));
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        try {
            TMSLogger.f("closeButtonTip", "show closeButtonTip");
            this.c.getContentView().measure(0, 0);
            this.c.showAtLocation(view, 53, 22, rect.bottom);
            PubCloseButtonModel pubCloseButtonModel2 = this.d;
            int i = 3;
            if (!(pubCloseButtonModel2 == null || (disappearTime = pubCloseButtonModel2.getDisappearTime()) == null)) {
                i = Integer.parseInt(disappearTime);
            }
            CommonExtKt.q(new PubCloseButtonGuide$showCloseButtonGuide$2(this), i * 1000);
        } catch (Exception e) {
            TMSLogger.c("closeButtonTip", "showAsDropDown: ", e);
        }
        return true;
    }
}
