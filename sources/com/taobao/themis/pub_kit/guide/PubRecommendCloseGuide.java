package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubRecommendCloseGuide;", "", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubRecommendCloseGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13727a;
    public final PopupWindow b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152304);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(845152303);
    }

    public PubRecommendCloseGuide(Context context) {
        ckf.g(context, "mContext");
        this.f13727a = context;
        this.b = new PopupWindow(context);
    }

    public static final /* synthetic */ Context a(PubRecommendCloseGuide pubRecommendCloseGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("36b50f8b", new Object[]{pubRecommendCloseGuide});
        }
        return pubRecommendCloseGuide.f13727a;
    }

    public static final /* synthetic */ PopupWindow b(PubRecommendCloseGuide pubRecommendCloseGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("ba7d5dcf", new Object[]{pubRecommendCloseGuide});
        }
        return pubRecommendCloseGuide.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c942acf8", new Object[]{this})).booleanValue();
        }
        Context context = this.f13727a;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.b("PubRecommendCloseGuide", "environment illegality");
            return false;
        } else if (!this.c.get()) {
            return true;
        } else {
            TMSLogger.b("PubRecommendCloseGuide", "already showed");
            return false;
        }
    }

    public final boolean d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9d952", new Object[]{this, view})).booleanValue();
        }
        ckf.g(view, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (!c()) {
            return false;
        }
        View view2 = null;
        View inflate = View.inflate(this.f13727a, R.layout.tms_pub_recommend_close_tips_layout, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.tvMainText);
            if (textView != null) {
                textView.setText("可以随时将频道添加到首页哦");
            }
            view2 = inflate;
        }
        if (view2 == null) {
            return false;
        }
        PopupWindow popupWindow = this.b;
        popupWindow.setContentView(view2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(false);
        popupWindow.setFocusable(false);
        popupWindow.setHeight(xcs.a(this.f13727a, 41.15f));
        popupWindow.setWidth(xcs.a(this.f13727a, 193.0f));
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        try {
            TMSLogger.f("PubRecommendCloseGuide", "show PubRecommendCloseGuide");
            this.b.getContentView().measure(0, 0);
            this.b.showAtLocation(view, 53, 22, rect.bottom);
            CommonExtKt.q(new PubRecommendCloseGuide$show$2(this), 3 * 1000);
        } catch (Exception e) {
            TMSLogger.c("PubRecommendCloseGuide", "showAsDropDown: ", e);
        }
        this.c.set(true);
        return true;
    }
}
