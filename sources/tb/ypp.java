package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.taobao.TBActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MenuItemCompat;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ypp extends WXHCNavBarAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = "clickrightitem";
    public static final String f = "clickmoreitem";
    public static final String g = "clickcenteritem";

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<AppCompatActivity> f32262a;
    public final Context b;
    public boolean c = false;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements WXImageStrategy.ImageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32263a;

        public a(int i) {
            this.f32263a = i;
        }

        @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
        public void onImageFinish(String str, ImageView imageView, boolean z, Map map) {
            WeakReference weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView, new Boolean(z), map});
            } else if (map != null && (weakReference = (WeakReference) map.get(zk4.CONTACTS_INFO_NOT_EMPTY_STATUS)) != null && weakReference.get() != null && ypp.a(ypp.this) != null) {
                TBPublicMenu publicMenu = ((ITBPublicMenu) ypp.a(ypp.this)).getPublicMenu();
                publicMenu.getExtraMenu(this.f32263a).setIconDrawable(ypp.b(ypp.this, (BitmapDrawable) weakReference.get()));
                publicMenu.notifyMenuChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ otw f32264a;

        public b(otw otwVar) {
            this.f32264a = otwVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            HashMap hashMap = new HashMap();
            int i = -1;
            if (!(menuItem == null || menuItem.getIntent() == null)) {
                try {
                    i = menuItem.getIntent().getIntExtra("index", -1);
                } catch (Exception unused) {
                }
            }
            if (i >= 0) {
                hashMap.put("index", Integer.valueOf(i));
                fzc.a aVar = this.f32264a.h;
                if (aVar != null) {
                    aVar.a(i);
                } else {
                    ypp.c(ypp.this).fireEvent(ypp.f, hashMap);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements WXImageStrategy.ImageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionBar f32265a;
        public final /* synthetic */ otw b;
        public final /* synthetic */ ImageView c;

        public c(ypp yppVar, ActionBar actionBar, otw otwVar, ImageView imageView) {
            this.f32265a = actionBar;
            this.b = otwVar;
            this.c = imageView;
        }

        @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
        public void onImageFinish(String str, ImageView imageView, boolean z, Map map) {
            WeakReference weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView, new Boolean(z), map});
            } else if (map != null && (weakReference = (WeakReference) map.get(zk4.CONTACTS_INFO_NOT_EMPTY_STATUS)) != null && weakReference.get() != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) weakReference.get();
                int height = (int) (this.f32265a.getHeight() * 0.6d);
                if (this.b.g) {
                    this.c.setLayoutParams(new Toolbar.LayoutParams(-1, height));
                    this.c.setScaleType(ImageView.ScaleType.FIT_XY);
                    return;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                this.c.setLayoutParams(new Toolbar.LayoutParams((int) ((height / bitmap.getHeight()) * bitmap.getWidth()), height));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ypp.d(ypp.this).fireEvent(ypp.g, new HashMap());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements WXImageStrategy.ImageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MenuItem f32267a;

        public e(MenuItem menuItem) {
            this.f32267a = menuItem;
        }

        @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
        public void onImageFinish(String str, ImageView imageView, boolean z, Map map) {
            WeakReference weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView, new Boolean(z), map});
            } else if (map != null && (weakReference = (WeakReference) map.get(zk4.CONTACTS_INFO_NOT_EMPTY_STATUS)) != null && weakReference.get() != null) {
                this.f32267a.setIcon(ypp.b(ypp.this, (BitmapDrawable) weakReference.get()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ otw f32268a;

        public f(otw otwVar) {
            this.f32268a = otwVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            fzc.a aVar = this.f32268a.h;
            if (aVar != null) {
                aVar.a(0);
            } else {
                ypp.e(ypp.this).fireEvent(ypp.e, new HashMap());
            }
            return true;
        }
    }

    static {
        t2o.a(764412026);
    }

    public ypp(AppCompatActivity appCompatActivity, Map<String, String> map) {
        super(appCompatActivity);
        this.f32262a = new WeakReference<>(appCompatActivity);
        this.b = appCompatActivity.getApplicationContext();
        if (map != null && map.containsKey("shopId")) {
            this.d = map.get("shopId");
        }
    }

    public static /* synthetic */ AppCompatActivity a(ypp yppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("e3f5e7ce", new Object[]{yppVar});
        }
        return yppVar.g();
    }

    public static /* synthetic */ BitmapDrawable b(ypp yppVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("77888670", new Object[]{yppVar, bitmapDrawable});
        }
        return yppVar.resizeIcon(bitmapDrawable);
    }

    public static /* synthetic */ WeexPageFragment c(ypp yppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("bbbc6f7c", new Object[]{yppVar});
        }
        return yppVar.getWeexPageFragment();
    }

    public static /* synthetic */ WeexPageFragment d(ypp yppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("da76a73d", new Object[]{yppVar});
        }
        return yppVar.getWeexPageFragment();
    }

    public static /* synthetic */ WeexPageFragment e(ypp yppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("f930defe", new Object[]{yppVar});
        }
        return yppVar.getWeexPageFragment();
    }

    public static Bitmap f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cd0063e7", new Object[]{view});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8de91bd", new Object[0])).booleanValue();
        }
        try {
            String str = FestivalMgr.i().g().get("isFestivalOn");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.valueOf(str).intValue() == 1) {
                    return true;
                }
            }
        } catch (RuntimeException e2) {
            WXLogUtils.e("TBNavBarAdapter", WXLogUtils.getStackTrace(e2));
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(ypp yppVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopNavBarAdapter");
    }

    public final AppCompatActivity g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("31a1fbe7", new Object[]{this});
        }
        return this.f32262a.get();
    }

    @Override // tb.fzc
    public euw getHeight(WXSDKInstance wXSDKInstance) {
        Toolbar toolbar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("84d3d145", new Object[]{this, wXSDKInstance});
        }
        AppCompatActivity g2 = g();
        if (g2 == null || g2.getSupportActionBar() == null || (toolbar = (Toolbar) g2.findViewById(R.id.action_bar)) == null) {
            return null;
        }
        euw euwVar = new euw();
        euwVar.f18829a = String.valueOf(toolbar.getHeight());
        return euwVar;
    }

    public final Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return h().getResources();
    }

    @Override // tb.fzc
    public euw getStatusBarHeight(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("40a469b0", new Object[]{this, wXSDKInstance});
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return null;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(identifier);
        euw euwVar = new euw();
        euwVar.f18829a = String.valueOf(dimensionPixelSize);
        return euwVar;
    }

    public final Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.fzc
    public boolean onCreateOptionsMenu(WXSDKInstance wXSDKInstance, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a4d4d7", new Object[]{this, wXSDKInstance, menu})).booleanValue();
        }
        if (shouldSetNavigator()) {
            updateRightItem(menu);
            updateCustomTitle();
        }
        updateOverflowItems(menu);
        return true;
    }

    public final BitmapDrawable resizeIcon(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("8405e662", new Object[]{this, bitmapDrawable});
        }
        try {
            int height = (int) (g().getSupportActionBar().getHeight() * 0.6d);
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (height < 1) {
                height = Math.min(116, bitmap.getHeight());
            }
            float f2 = height / height2;
            Matrix matrix = new Matrix();
            matrix.postScale(f2, f2);
            return new BitmapDrawable(getResources(), Bitmap.createBitmap(bitmap, 0, 0, width, height2, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }

    @Override // tb.fzc
    public euw setBadgeStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("13cd2294", new Object[]{this, wXSDKInstance, jSONObject});
        }
        euw euwVar = new euw();
        euwVar.b = "Activity not support";
        return euwVar;
    }

    @Override // tb.fzc
    public euw setStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("3283e733", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (g() == null) {
            return null;
        }
        AppCompatActivity g2 = g();
        if (g2.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        try {
            int parseColor = Color.parseColor(jSONObject.getString("color"));
            Toolbar toolbar = (Toolbar) g2.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setTitleTextColor(parseColor);
                toolbar.setSubtitleTextColor(parseColor);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable mutate = DrawableCompat.wrap(navigationIcon).mutate();
                    DrawableCompat.setTint(mutate, parseColor);
                    toolbar.setNavigationIcon(mutate);
                }
                if (g() instanceof ITBPublicMenu) {
                    TBPublicMenu publicMenu = ((ITBPublicMenu) g()).getPublicMenu();
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
                this.c = true;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter
    public boolean shouldSetNavigator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        if (g() instanceof ShopRenderActivity) {
            return ((ShopRenderActivity) g()).mActionBarShow;
        }
        return true;
    }

    public final void updateCustomTitle() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b65265", new Object[]{this});
            return;
        }
        otw menuItemTitle = getMenuItemTitle();
        if (menuItemTitle != null && (supportActionBar = g().getSupportActionBar()) != null) {
            if (TextUtils.isEmpty(menuItemTitle.d)) {
                supportActionBar.setDisplayShowTitleEnabled(false);
                ImageView imageView = new ImageView(h());
                if (menuItemTitle.g) {
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                }
                int i = menuItemTitle.f25650a;
                if (i > 0) {
                    imageView.setImageResource(i);
                } else if (menuItemTitle.b > 0) {
                    imageView.setImageDrawable(resizeIcon(getIconFontDrawable(g(), menuItemTitle.b)));
                } else {
                    Bitmap bitmap = menuItemTitle.c;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        imageView.setImageDrawable(resizeIcon(new BitmapDrawable(getResources(), menuItemTitle.c)));
                    } else if (!TextUtils.isEmpty(menuItemTitle.e)) {
                        WXImageStrategy wXImageStrategy = new WXImageStrategy();
                        wXImageStrategy.isClipping = true;
                        wXImageStrategy.setImageListener(new c(this, supportActionBar, menuItemTitle, imageView));
                        WXSDKEngine.getIWXImgLoaderAdapter().setImage(menuItemTitle.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
                    }
                }
                imageView.setClickable(true);
                supportActionBar.setCustomView(imageView);
                supportActionBar.setDisplayShowCustomEnabled(true);
                supportActionBar.setDisplayShowHomeEnabled(true);
                imageView.setOnClickListener(new d());
                return;
            }
            supportActionBar.setDisplayShowTitleEnabled(true);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setTitle(menuItemTitle.d);
        }
    }

    public final void updateOverflowItems(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d361bc", new Object[]{this, menu});
            return;
        }
        menu.removeGroup(R.id.navigation_bar_more_group);
        List<otw> menuItemMore = getMenuItemMore();
        if (!(menuItemMore == null || menuItemMore.isEmpty())) {
            int i = 0;
            for (otw otwVar : menuItemMore) {
                int i2 = R.id.navigation_bar_more_start_id + i;
                MenuItem add = menu.add(R.id.navigation_bar_more_group, i2, 0, otwVar.d);
                int i3 = otwVar.f25650a;
                if (i3 > 0) {
                    add.setIcon(i3);
                } else if (otwVar.b > 0) {
                    add.setTitle(getResources().getString(otwVar.b) + ":" + otwVar.d);
                } else {
                    Bitmap bitmap = otwVar.c;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        add.setIcon(resizeIcon(new BitmapDrawable(getResources(), otwVar.c)));
                    } else if (!TextUtils.isEmpty(otwVar.e)) {
                        ImageView imageView = new ImageView(h());
                        WXImageStrategy wXImageStrategy = new WXImageStrategy();
                        wXImageStrategy.isClipping = true;
                        wXImageStrategy.setImageListener(new a(i2));
                        WXSDKEngine.getIWXImgLoaderAdapter().setImage(otwVar.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
                    }
                }
                add.setIntent(otwVar.f);
                MenuItemCompat.setShowAsAction(add, 8);
                add.setOnMenuItemClickListener(new b(otwVar));
                i++;
            }
        }
    }

    public final void updateRightItem(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56380ab", new Object[]{this, menu});
            return;
        }
        otw menuItemRight = getMenuItemRight();
        try {
            menu.removeItem(R.id.navigation_bar_right_id);
        } catch (Throwable unused) {
        }
        if (menuItemRight != null) {
            MenuItem add = menu.add(0, R.id.navigation_bar_right_id, 0, "");
            if (!TextUtils.isEmpty(menuItemRight.d)) {
                add.setTitle(menuItemRight.d);
            } else {
                int i = menuItemRight.f25650a;
                if (i > 0) {
                    add.setIcon(i);
                } else {
                    int i2 = menuItemRight.b;
                    if (i2 > 0) {
                        add.setTitle(AppcompatUtils.getMenuTitle("", i2));
                    } else {
                        Bitmap bitmap = menuItemRight.c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            add.setIcon(resizeIcon(new BitmapDrawable(getResources(), menuItemRight.c)));
                        } else if (!TextUtils.isEmpty(menuItemRight.e)) {
                            ImageView imageView = new ImageView(h());
                            WXImageStrategy wXImageStrategy = new WXImageStrategy();
                            wXImageStrategy.isClipping = true;
                            wXImageStrategy.setImageListener(new e(add));
                            WXSDKEngine.getIWXImgLoaderAdapter().setImage(menuItemRight.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
                        }
                    }
                }
            }
            add.setOnMenuItemClickListener(new f(menuItemRight));
            MenuItemCompat.setShowAsAction(add, 2);
        }
    }

    public static BitmapDrawable getIconFontDrawable(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("51f07bdd", new Object[]{activity, new Integer(i)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(activity);
        tIconFontTextView.setText(i);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setTextColor(FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, activity.getResources().getColor(R.color.abc_title_color)));
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(activity.getAssets(), "uik_iconfont.ttf"));
        } catch (RuntimeException e2) {
            WXLogUtils.e("TBNavBarAdapter", WXLogUtils.getStackTrace(e2));
        }
        return new BitmapDrawable(activity.getResources(), f(tIconFontTextView));
    }

    @Override // tb.fzc
    public euw hide(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("8c95c206", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (g() != null) {
            boolean booleanValue = jSONObject.getBooleanValue("navVisible");
            View findViewById = g().findViewById(R.id.fake_title);
            if (booleanValue && findViewById != null) {
                findViewById.setVisibility(0);
            } else if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            g().getSupportActionBar().hide();
            if (g() instanceof ShopRenderActivity) {
                ((ShopRenderActivity) g()).mActionBarShow = false;
            }
        }
        return null;
    }

    @Override // tb.fzc
    public euw setTransparent(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("8d56d454", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (this.f32262a.get().getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("transparence");
        if (this.f32262a.get() instanceof ShopRenderActivity) {
            ((ShopRenderActivity) this.f32262a.get()).setNaviTransparent(!"true".equals(string));
        }
        return null;
    }

    @Override // tb.fzc
    public euw show(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("45d1bbc1", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (g() != null) {
            boolean booleanValue = jSONObject.getBooleanValue("navVisible");
            View findViewById = g().findViewById(R.id.fake_title);
            if (booleanValue && findViewById != null) {
                findViewById.setVisibility(0);
            } else if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            g().getSupportActionBar().show();
            if (i() && !this.c) {
                FestivalMgr.i().E(g(), findViewById, TBActionBar.ActionBarStyle.NORMAL);
            }
            if (g() instanceof ShopRenderActivity) {
                ((ShopRenderActivity) g()).mActionBarShow = false;
            }
        }
        return null;
    }

    @Override // tb.fzc
    public euw showMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        TBPublicMenuItem publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("9e4b4ac0", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AppCompatActivity g2 = g();
        if (g2 == null) {
            euw euwVar = new euw();
            euwVar.f18829a = "WX_NOT_SUPPORTED";
            euwVar.b = "activity reference is null";
            return euwVar;
        } else if (!(g2 instanceof ShopRenderActivity)) {
            euw euwVar2 = new euw();
            euwVar2.f18829a = "WX_NOT_SUPPORTED";
            euwVar2.b = "Only ShopRenderActivity support showMenu()";
            return euwVar2;
        } else if ("true".equals(jSONObject.get("cancelActualShow"))) {
            return null;
        } else {
            try {
                ShopRenderActivity shopRenderActivity = (ShopRenderActivity) g2;
                if (shopRenderActivity.mTBPublicMenu != null) {
                    TBPublicMenu publicMenu2 = ((ITBPublicMenu) g2).getPublicMenu();
                    if (!(publicMenu2 == null || (publicMenu = TBPublicMenu.getPublicMenu(R.id.uik_menu_feedback)) == null)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("shopId", this.d);
                        bundle.putString("pageName", "n_Page_Shop");
                        Bundle bundle2 = new Bundle();
                        bundle2.putBundle(jjx.ZZB_BUNDLE_KEY, bundle);
                        publicMenu2.setDefaultPageUserInfo(bundle2);
                        TBPublicMenu.updatePublicMenu(publicMenu, false);
                        Boolean bool = Boolean.TRUE;
                        if (bool.toString().equals(OrangeConfig.getInstance().getConfig("shop_render", "miniapp_feedback_enable", bool.toString())) && (wXSDKInstance instanceof AliWXSDKInstance)) {
                            String str = (String) ((AliWXSDKInstance) wXSDKInstance).getExtra("miniAppFeedBackUri", "");
                            JSONObject jSONObject2 = (JSONObject) ((AliWXSDKInstance) wXSDKInstance).getExtra("miniAppFeedBackExtraInfo", "");
                            if (!TextUtils.isEmpty(str) && jSONObject2 != null) {
                                Bundle bundle3 = new Bundle();
                                jSONObject2.put("shopId", (Object) this.d);
                                bundle3.putSerializable("extraInfo", jSONObject2);
                                Bundle bundle4 = new Bundle();
                                bundle4.putBundle(jjx.ZZB_BUNDLE_KEY, bundle3);
                                publicMenu.setNavUrl(str);
                                publicMenu2.setDefaultPageUserInfo(bundle4);
                                TBPublicMenu.updatePublicMenu(publicMenu, false);
                            }
                        }
                    }
                    shopRenderActivity.mTBPublicMenu.show();
                    return null;
                }
                euw euwVar3 = new euw();
                euwVar3.f18829a = "WX_NO_TBPUBLICMENU";
                euwVar3.b = "is Activity onCreateOptionsMenu called?";
                return euwVar3;
            } catch (Exception e2) {
                WXLogUtils.e("exception in cancel action animation. ", WXLogUtils.getStackTrace(e2));
                euw euwVar4 = new euw();
                euwVar4.f18829a = "ERROR";
                euwVar4.b = e2.getMessage();
                return euwVar4;
            }
        }
    }

    @Override // tb.fzc
    public euw hasMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("ab7ccfdd", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Boolean bool = jSONObject.getBoolean("show");
            AppCompatActivity g2 = g();
            if (g2 instanceof CustomBaseActivity) {
                if (bool == null || bool.booleanValue()) {
                    ((CustomBaseActivity) g2).togglePublicMenu(true);
                } else {
                    ((CustomBaseActivity) g2).togglePublicMenu(false);
                }
                g2.supportInvalidateOptionsMenu();
                return null;
            }
        } catch (Throwable unused) {
        }
        euw euwVar = new euw();
        euwVar.b = "Activity not support";
        return euwVar;
    }

    @Override // com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter, tb.cvw
    public void push(Activity activity, String str, org.json.JSONObject jSONObject) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991897a1", new Object[]{this, activity, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("wx_options", JSON.parseObject(jSONObject.toString()));
        Nav.from(activity).withExtras(bundle).toUri(str.trim());
        String optString = jSONObject.optString("transform");
        Object opt = jSONObject.opt("animated");
        if (opt != null) {
            if (opt instanceof String) {
                z2 = Boolean.parseBoolean((String) opt);
            } else {
                z2 = opt instanceof Boolean ? ((Boolean) opt).booleanValue() : true;
            }
            z = !z2;
        } else {
            z = false;
        }
        if (z) {
            activity.overridePendingTransition(0, 0);
        } else if ("3d".equals(optString)) {
            activity.overridePendingTransition(0, 0);
        }
    }
}
