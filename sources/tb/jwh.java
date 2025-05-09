package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_ability.page.MUSPageFragment;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.weex.weexv2.page.WeexV2Activity;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jwh extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler i = new Handler(Looper.getMainLooper());
    public static int j = 0;
    public final AppCompatActivity h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jwh jwhVar) {
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TBActionView d;
        public final /* synthetic */ Handler e;
        public final /* synthetic */ ActionBar f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$2$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                ActionBar actionBar = b.this.f;
                if (actionBar != null) {
                    actionBar.hide();
                }
            }
        }

        public b(TBActionView tBActionView, Handler handler, ActionBar actionBar) {
            this.d = tBActionView;
            this.e = handler;
            this.f = actionBar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            TBActionView tBActionView = this.d;
            if (tBActionView != null) {
                tBActionView.performClick();
            }
            this.e.postDelayed(new a(), 64L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActionBar d;

        public c(ActionBar actionBar) {
            this.d = actionBar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$3");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            ActionBar actionBar = this.d;
            if (actionBar != null) {
                actionBar.hide();
            }
        }
    }

    public jwh(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.h = appCompatActivity;
    }

    public static /* synthetic */ AppCompatActivity B(jwh jwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("25906e8a", new Object[]{jwhVar});
        }
        return jwhVar.h;
    }

    public static /* synthetic */ BitmapDrawable C(jwh jwhVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("c49dec", new Object[]{jwhVar, bitmapDrawable});
        }
        return jwhVar.K(bitmapDrawable);
    }

    public static /* synthetic */ Handler D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1907942d", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ MUSPageFragment E(jwh jwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("ee8e0f1f", new Object[]{jwhVar});
        }
        return jwhVar.s();
    }

    public static /* synthetic */ MUSPageFragment F(jwh jwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("5bfacc3e", new Object[]{jwhVar});
        }
        return jwhVar.s();
    }

    public static /* synthetic */ MUSPageFragment G(jwh jwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("c967895d", new Object[]{jwhVar});
        }
        return jwhVar.s();
    }

    public static Bitmap H(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cd0063e7", new Object[]{view});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public static /* synthetic */ Object ipc$super(jwh jwhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter");
    }

    public final Resources J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return this.h.getResources();
    }

    public final BitmapDrawable K(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("8405e662", new Object[]{this, bitmapDrawable});
        }
        try {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float height2 = ((int) (this.h.getSupportActionBar().getHeight() * 0.6d)) / height;
            Matrix matrix = new Matrix();
            matrix.postScale(height2, height2);
            return new BitmapDrawable(J(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }

    public final void L() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b65265", new Object[]{this});
            return;
        }
        com.taobao.android.weex_ability.page.b v = v();
        if (v != null && (supportActionBar = this.h.getSupportActionBar()) != null) {
            if (TextUtils.isEmpty(v.d)) {
                supportActionBar.setDisplayShowTitleEnabled(false);
                ImageView imageView = new ImageView(this.h);
                int i2 = v.f9958a;
                if (i2 > 0) {
                    imageView.setImageResource(i2);
                } else {
                    int i3 = v.b;
                    if (i3 > 0) {
                        imageView.setImageDrawable(K(I(this.h, i3)));
                    } else {
                        Bitmap bitmap = v.c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            imageView.setImageDrawable(K(new BitmapDrawable(J(), v.c)));
                        } else if (!TextUtils.isEmpty(v.e)) {
                            uvh.f().e().b(this.h, v.e, new mwh(this, supportActionBar, v, imageView), MUSImageQuality.ORIGINAL);
                        }
                    }
                }
                imageView.setClickable(true);
                supportActionBar.setCustomView(imageView);
                supportActionBar.setDisplayShowCustomEnabled(true);
                supportActionBar.setDisplayShowHomeEnabled(true);
                imageView.setOnClickListener(new nwh(this));
                return;
            }
            supportActionBar.setDisplayShowTitleEnabled(true);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setTitle(v.d);
        }
    }

    public final void M(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d361bc", new Object[]{this, menu});
            return;
        }
        menu.removeGroup(R.id.navigation_bar_more_group);
        List<com.taobao.android.weex_ability.page.b> t = t();
        if (!(t == null || t.isEmpty())) {
            int i2 = 0;
            for (com.taobao.android.weex_ability.page.b bVar : t) {
                int i3 = R.id.navigation_bar_more_start_id + i2;
                MenuItem add = menu.add(R.id.navigation_bar_more_group, i3, 0, bVar.d);
                int i4 = bVar.f9958a;
                if (i4 > 0) {
                    add.setIcon(i4);
                } else if (bVar.b > 0) {
                    add.setTitle(J().getString(bVar.b) + ":" + bVar.d);
                } else {
                    Bitmap bitmap = bVar.c;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        add.setIcon(K(new BitmapDrawable(J(), bVar.c)));
                    } else if (!TextUtils.isEmpty(bVar.e)) {
                        uvh.f().e().b(this.h, bVar.e, new kwh(this, i3), MUSImageQuality.ORIGINAL);
                    }
                }
                add.setIntent(bVar.f);
                add.setShowAsAction(8);
                add.setOnMenuItemClickListener(new lwh(this, bVar));
                i2++;
            }
        }
    }

    public final void N(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56380ab", new Object[]{this, menu});
            return;
        }
        com.taobao.android.weex_ability.page.b u = u();
        try {
            menu.removeItem(R.id.navigation_bar_right_id);
        } catch (Throwable unused) {
        }
        if (u != null) {
            MenuItem add = menu.add(0, R.id.navigation_bar_right_id, 0, "");
            if (!TextUtils.isEmpty(u.d)) {
                add.setTitle(u.d);
            } else {
                int i2 = u.f9958a;
                if (i2 > 0) {
                    add.setIcon(i2);
                } else {
                    int i3 = u.b;
                    if (i3 > 0) {
                        add.setTitle(AppcompatUtils.getMenuTitle("", i3));
                    } else {
                        Bitmap bitmap = u.c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            add.setIcon(K(new BitmapDrawable(J(), u.c)));
                        } else if (!TextUtils.isEmpty(u.e)) {
                            PhenixCreator T = s0m.B().T(u.e);
                            T.succListener(new owh(this, add));
                            T.fetch();
                        }
                    }
                }
            }
            add.setOnMenuItemClickListener(new pwh(this, u));
            add.setShowAsAction(2);
        }
    }

    @Override // com.taobao.android.weex_ability.page.a
    public synchronized lq0 a(com.taobao.android.weex_framework.a aVar) {
        int i2 = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lq0) ipChange.ipc$dispatch("7b1d496a", new Object[]{this, aVar});
            } else if (this.h.getSupportActionBar() == null) {
                return null;
            } else {
                Toolbar toolbar = (Toolbar) this.h.findViewById(R.id.action_bar);
                if (toolbar != null) {
                    i2 = toolbar.getHeight();
                    if (i2 == 0) {
                        i2 = j;
                    } else {
                        j = i2;
                    }
                }
                if (i2 == 0) {
                    TypedValue typedValue = new TypedValue();
                    this.h.getTheme().resolveAttribute(16843499, typedValue, true);
                    i2 = J().getDimensionPixelSize(typedValue.resourceId);
                }
                return new lq0(String.valueOf(i2), "");
            }
        }
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 b(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("abb1de95", new Object[]{this, aVar});
        }
        int identifier = J().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return new lq0(String.valueOf(J().getDimensionPixelSize(identifier)), "");
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public boolean e(com.taobao.android.weex_framework.a aVar, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc326d08", new Object[]{this, aVar, menu})).booleanValue();
        }
        if (z()) {
            N(menu);
            L();
        }
        M(menu);
        return true;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 f(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("36fe40fb", new Object[]{this, aVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        if (!(this.h instanceof WeexV2Activity)) {
            return new lq0("MS_NOT_SUPPORTED", "Only MUSPageActivity support setBadgeStyle(), or your own activity should implement getOverflowMenuButton()");
        }
        String string = jSONObject.getString("style");
        if (string == null) {
            return new lq0("MS_NOT_SUPPORTED", "params error");
        }
        TBActionView tBActionView = ((WeexV2Activity) this.h).overflowButton;
        if (tBActionView != null) {
            try {
                if ("light".equals(string)) {
                    tBActionView.setMessageNumColor(J().getColor(R.color.uik_action_message_num_dark));
                    tBActionView.setMessageBackgroundColor(J().getColor(R.color.uik_action_message_bg_dark));
                } else if (ThemeUtils.COLOR_SCHEME_DARK.equals(string)) {
                    tBActionView.setMessageNumColor(J().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(J().getColor(R.color.uik_action_message_bg_normal));
                } else {
                    tBActionView.setMessageNumColor(J().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(J().getColor(R.color.uik_action_message_bg_normal));
                }
            } catch (Throwable th) {
                dwh.h("exception in set badge style. ", th);
            }
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 j(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("835bc75a", new Object[]{this, aVar, jSONObject});
        }
        if (this.h.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        try {
            int parseColor = Color.parseColor(jSONObject.getString("color"));
            Toolbar toolbar = (Toolbar) this.h.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setTitleTextColor(parseColor);
                toolbar.setSubtitleTextColor(parseColor);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable mutate = DrawableCompat.wrap(navigationIcon).mutate();
                    DrawableCompat.setTint(mutate, parseColor);
                    toolbar.setNavigationIcon(mutate);
                }
                AppCompatActivity appCompatActivity = this.h;
                if (appCompatActivity instanceof ITBPublicMenu) {
                    TBPublicMenu publicMenu = ((ITBPublicMenu) appCompatActivity).getPublicMenu();
                    if (publicMenu != null) {
                        publicMenu.setActionViewIconColor(parseColor);
                    }
                } else {
                    Drawable overflowIcon = toolbar.getOverflowIcon();
                    if (overflowIcon != null) {
                        Drawable wrap = DrawableCompat.wrap(overflowIcon);
                        wrap.mutate();
                        DrawableCompat.setTint(wrap, parseColor);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 l(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("f8d6e2bb", new Object[]{this, aVar, jSONObject});
        }
        if (this.h.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        jSONObject.getString("transparent");
        boolean z = this.h instanceof WeexV2Activity;
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 m(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("2957d368", new Object[]{this, aVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        this.h.getSupportActionBar().show();
        return null;
    }

    public static BitmapDrawable I(Activity activity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("51f07bdd", new Object[]{activity, new Integer(i2)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(activity);
        tIconFontTextView.setText(i2);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setTextColor(FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, activity.getResources().getColor(R.color.abc_title_color)));
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(activity.getAssets(), "uik_iconfont.ttf"));
        } catch (RuntimeException e) {
            dwh.h("TBNavBarAdapter", e);
        }
        return new BitmapDrawable(activity.getResources(), H(tIconFontTextView));
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 c(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("c01c1684", new Object[]{this, aVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Boolean bool = jSONObject.getBoolean("show");
            if (this.h instanceof CustomBaseActivity) {
                if (bool == null || bool.booleanValue()) {
                    ((CustomBaseActivity) this.h).togglePublicMenu(true);
                } else {
                    ((CustomBaseActivity) this.h).togglePublicMenu(false);
                }
                this.h.supportInvalidateOptionsMenu();
                return null;
            }
        } catch (Throwable th) {
            dwh.i(th);
        }
        return new lq0("MUS_FAILED", "Activity not support");
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 n(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        ViewGroup viewGroup;
        if (jSONObject == null) {
            return null;
        }
        AppCompatActivity appCompatActivity = this.h;
        if ((appCompatActivity != null && appCompatActivity.getClass().getSimpleName().equals("TBMainActivity")) || (jSONObject.getBoolean("showMenu") != null && jSONObject.getBoolean("showMenu").booleanValue())) {
            TBPublicMenu tBPublicMenu = new TBPublicMenu(appCompatActivity);
            tBPublicMenu.setReportArguments(new a(this));
            tBPublicMenu.show();
            return null;
        } else if (!(appCompatActivity instanceof WeexV2Activity)) {
            return new lq0("WX_NOT_SUPPORTED", "Only WXActivity support showMenu(), or your own activity should implement getOverflowMenuButton()");
        } else {
            boolean equals = "true".equals(jSONObject.get("cancelActualShow"));
            try {
                WeexV2Activity weexV2Activity = (WeexV2Activity) appCompatActivity;
                ActionBar supportActionBar = weexV2Activity.getSupportActionBar();
                Method method = ActionBar.class.getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(supportActionBar, Boolean.FALSE);
                int identifier = weexV2Activity.getResources().getIdentifier("action_bar", "id", appCompatActivity.getPackageName());
                if (!(identifier == 0 || (viewGroup = (ViewGroup) weexV2Activity.findViewById(identifier)) == null)) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof ImageButton) {
                            ((ImageButton) childAt).setImageDrawable(weexV2Activity.getResources().getDrawable(17170445));
                        } else if (childAt instanceof TextView) {
                            ((TextView) childAt).setText("");
                        } else if (childAt instanceof ActionMenuView) {
                            childAt.setVisibility(4);
                        }
                    }
                }
                TBActionView tBActionView = weexV2Activity.overflowButton;
                if (tBActionView != null) {
                    tBActionView.setVisibility(4);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("color", "#00ffffff");
                j(aVar, jSONObject2);
                Handler handler = new Handler(Looper.getMainLooper());
                if (!equals) {
                    if (supportActionBar != null) {
                        supportActionBar.show();
                    }
                    handler.postDelayed(new b(tBActionView, handler, supportActionBar), 64L);
                } else {
                    if (supportActionBar != null) {
                        supportActionBar.show();
                    }
                    handler.postDelayed(new c(supportActionBar), 32L);
                }
                return null;
            } catch (Exception e) {
                dwh.h("exception in cancel action animation. ", e);
                return new lq0("ERROR", e.getMessage());
            }
        }
    }

    @Override // com.taobao.android.weex_ability.page.MSHCNavAdapter
    public boolean z() {
        AppCompatActivity appCompatActivity;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        try {
            appCompatActivity = this.h;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ((appCompatActivity instanceof WeexV2Activity) && ((WeexV2Activity) appCompatActivity).isMainHc()) {
            return false;
        }
        mpb a2 = e5x.b().a();
        if (a2 == null) {
            return true;
        }
        String config = a2.getConfig("group_weex_hc", "weex_main_hc_domain", "");
        if (!TextUtils.isEmpty(config)) {
            for (String str : config.split(",")) {
                if (!TextUtils.isEmpty(null)) {
                    throw null;
                }
            }
        }
        return true;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 d(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        AppCompatActivity appCompatActivity = this.h;
        if (appCompatActivity.getSupportActionBar() != null) {
            try {
                Method method = ActionBar.class.getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(appCompatActivity.getSupportActionBar(), Boolean.FALSE);
            } catch (Throwable th) {
                dwh.h("exception in cancel action animation. ", th);
            }
            appCompatActivity.getSupportActionBar().hide();
        }
        return null;
    }
}
