package tb;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import com.taobao.android.weex_ability.page.a;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.musie.MUSPageActivity;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iwh extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler k = new Handler(Looper.getMainLooper());
    public static int l = 0;
    public String h;
    public final AppCompatActivity i;
    public boolean j = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TBActionView d;
        public final /* synthetic */ Handler e;
        public final /* synthetic */ ActionBar f;

        /* compiled from: Taobao */
        /* renamed from: tb.iwh$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0951a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0951a() {
            }

            public static /* synthetic */ Object ipc$super(C0951a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$1$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                ActionBar actionBar = a.this.f;
                if (actionBar != null) {
                    actionBar.hide();
                }
            }
        }

        public a(TBActionView tBActionView, Handler handler, ActionBar actionBar) {
            this.d = tBActionView;
            this.e = handler;
            this.f = actionBar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$1");
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
            this.e.postDelayed(new C0951a(), 64L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActionBar d;

        public b(ActionBar actionBar) {
            this.d = actionBar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$2");
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends qxp {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Drawable d;

            public a(Drawable drawable) {
                this.d = drawable;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$3$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                TBPublicMenu publicMenu = ((ITBPublicMenu) iwh.B(iwh.this)).getPublicMenu();
                TBPublicMenuItem extraMenu = publicMenu.getExtraMenu(c.this.b);
                if (extraMenu != null) {
                    extraMenu.setIconDrawable(iwh.C(iwh.this, (BitmapDrawable) this.d));
                    publicMenu.notifyMenuChanged();
                }
            }
        }

        public c(int i) {
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$3");
        }

        @Override // tb.qxp, tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            } else {
                iwh.D().post(new a(drawable));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_ability.page.b f21611a;

        public d(com.taobao.android.weex_ability.page.b bVar) {
            this.f21611a = bVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            JSONObject jSONObject = new JSONObject();
            int i = -1;
            if (!(menuItem == null || menuItem.getIntent() == null)) {
                try {
                    i = menuItem.getIntent().getIntExtra("index", -1);
                } catch (Exception unused) {
                }
            }
            if (i >= 0) {
                jSONObject.put("index", (Object) Integer.valueOf(i));
                a.AbstractC0517a aVar = this.f21611a.g;
                if (aVar != null) {
                    aVar.a(i);
                } else {
                    iwh.E(iwh.this).s2(MSHCNavAdapter.f, jSONObject);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends qxp {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActionBar b;
        public final /* synthetic */ com.taobao.android.weex_ability.page.b c;
        public final /* synthetic */ ImageView d;

        public e(iwh iwhVar, ActionBar actionBar, com.taobao.android.weex_ability.page.b bVar, ImageView imageView) {
            this.b = actionBar;
            this.c = bVar;
            this.d = imageView;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$5");
        }

        @Override // tb.qxp, tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                return;
            }
            int height = (int) (this.b.getHeight() * 0.6d);
            this.c.getClass();
            this.d.setLayoutParams(new Toolbar.LayoutParams((int) ((height / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()), height));
            this.d.setImageDrawable(drawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                iwh.F(iwh.this).s2(MSHCNavAdapter.g, new JSONObject());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends qxp {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MenuItem b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Drawable d;

            public a(Drawable drawable) {
                this.d = drawable;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$7$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                g gVar = g.this;
                gVar.b.setIcon(iwh.C(iwh.this, (BitmapDrawable) this.d));
            }
        }

        public g(MenuItem menuItem) {
            this.b = menuItem;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter$7");
        }

        @Override // tb.qxp, tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            } else {
                iwh.D().post(new a(drawable));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_ability.page.b f21613a;

        public h(com.taobao.android.weex_ability.page.b bVar) {
            this.f21613a = bVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            a.AbstractC0517a aVar = this.f21613a.g;
            if (aVar != null) {
                aVar.a(0);
            } else {
                iwh.G(iwh.this).s2(MSHCNavAdapter.e, new JSONObject());
            }
            return true;
        }
    }

    static {
        t2o.a(815792606);
    }

    public iwh(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.i = appCompatActivity;
    }

    public static /* synthetic */ AppCompatActivity B(iwh iwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("13a48c3d", new Object[]{iwhVar});
        }
        return iwhVar.i;
    }

    public static /* synthetic */ BitmapDrawable C(iwh iwhVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("484c335f", new Object[]{iwhVar, bitmapDrawable});
        }
        return iwhVar.M(bitmapDrawable);
    }

    public static /* synthetic */ Handler D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1907942d", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ MUSPageFragment E(iwh iwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("cd06ed2", new Object[]{iwhVar});
        }
        return iwhVar.s();
    }

    public static /* synthetic */ MUSPageFragment F(iwh iwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("d52e9371", new Object[]{iwhVar});
        }
        return iwhVar.s();
    }

    public static /* synthetic */ MUSPageFragment G(iwh iwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("9d8cb810", new Object[]{iwhVar});
        }
        return iwhVar.s();
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

    public static /* synthetic */ Object ipc$super(iwh iwhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSNavBarAdapter");
    }

    public final Resources J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        return this.i.getResources();
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4d3bd6", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8789abc9", new Object[]{this})).booleanValue();
        }
        return true ^ z();
    }

    public final BitmapDrawable M(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("8405e662", new Object[]{this, bitmapDrawable});
        }
        try {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float height2 = ((int) (this.i.getSupportActionBar().getHeight() * 0.6d)) / height;
            Matrix matrix = new Matrix();
            matrix.postScale(height2, height2);
            return new BitmapDrawable(J(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f47eb7", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void O() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b65265", new Object[]{this});
            return;
        }
        com.taobao.android.weex_ability.page.b v = v();
        if (v != null && (supportActionBar = this.i.getSupportActionBar()) != null) {
            if (TextUtils.isEmpty(v.d)) {
                supportActionBar.setDisplayShowTitleEnabled(false);
                ImageView imageView = new ImageView(this.i);
                int i = v.f9958a;
                if (i > 0) {
                    imageView.setImageResource(i);
                } else {
                    int i2 = v.b;
                    if (i2 > 0) {
                        imageView.setImageDrawable(M(I(this.i, i2)));
                    } else {
                        Bitmap bitmap = v.c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            imageView.setImageDrawable(M(new BitmapDrawable(J(), v.c)));
                        } else if (!TextUtils.isEmpty(v.e)) {
                            uvh.f().e().b(this.i, v.e, new e(this, supportActionBar, v, imageView), MUSImageQuality.ORIGINAL);
                        }
                    }
                }
                imageView.setClickable(true);
                supportActionBar.setCustomView(imageView);
                supportActionBar.setDisplayShowCustomEnabled(true);
                supportActionBar.setDisplayShowHomeEnabled(true);
                imageView.setOnClickListener(new f());
                return;
            }
            supportActionBar.setDisplayShowTitleEnabled(true);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setTitle(v.d);
        }
    }

    public final void P(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d361bc", new Object[]{this, menu});
            return;
        }
        menu.removeGroup(R.id.navigation_bar_more_group);
        List<com.taobao.android.weex_ability.page.b> t = t();
        if (!(t == null || t.isEmpty())) {
            int i = 0;
            for (com.taobao.android.weex_ability.page.b bVar : t) {
                int i2 = R.id.navigation_bar_more_start_id + i;
                MenuItem add = menu.add(R.id.navigation_bar_more_group, i2, 0, bVar.d);
                int i3 = bVar.f9958a;
                if (i3 > 0) {
                    add.setIcon(i3);
                } else if (bVar.b > 0) {
                    add.setTitle(J().getString(bVar.b) + ":" + bVar.d);
                } else {
                    Bitmap bitmap = bVar.c;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        add.setIcon(M(new BitmapDrawable(J(), bVar.c)));
                    } else if (!TextUtils.isEmpty(bVar.e)) {
                        uvh.f().e().b(this.i, bVar.e, new c(i2), MUSImageQuality.ORIGINAL);
                    }
                }
                add.setIntent(bVar.f);
                add.setShowAsAction(8);
                add.setOnMenuItemClickListener(new d(bVar));
                i++;
            }
        }
    }

    public final void Q(Menu menu) {
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
                int i = u.f9958a;
                if (i > 0) {
                    add.setIcon(i);
                } else {
                    int i2 = u.b;
                    if (i2 > 0) {
                        add.setTitle(AppcompatUtils.getMenuTitle("", i2));
                    } else {
                        Bitmap bitmap = u.c;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            add.setIcon(M(new BitmapDrawable(J(), u.c)));
                        } else if (!TextUtils.isEmpty(u.e)) {
                            uvh.f().e().b(this.i, u.e, new g(add), MUSImageQuality.ORIGINAL);
                        }
                    }
                }
            }
            add.setOnMenuItemClickListener(new h(u));
            add.setShowAsAction(2);
        }
    }

    @Override // com.taobao.android.weex_ability.page.a
    public synchronized lq0 a(com.taobao.android.weex_framework.a aVar) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lq0) ipChange.ipc$dispatch("7b1d496a", new Object[]{this, aVar});
            } else if (this.i.getSupportActionBar() == null) {
                return null;
            } else {
                Toolbar toolbar = (Toolbar) this.i.findViewById(R.id.action_bar);
                if (toolbar != null) {
                    i = toolbar.getHeight();
                    if (i == 0) {
                        i = l;
                    } else {
                        l = i;
                    }
                }
                if (i == 0) {
                    TypedValue typedValue = new TypedValue();
                    this.i.getTheme().resolveAttribute(16843499, typedValue, true);
                    i = J().getDimensionPixelSize(typedValue.resourceId);
                }
                return new lq0(String.valueOf(i), "");
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
            Q(menu);
            O();
        }
        P(menu);
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
        if (!(this.i instanceof MUSPageActivity)) {
            return new lq0("MS_NOT_SUPPORTED", "Only MUSPageActivity support setBadgeStyle(), or your own activity should implement getOverflowMenuButton()");
        }
        String string = jSONObject.getString("style");
        if (string == null) {
            return new lq0("MS_NOT_SUPPORTED", "params error");
        }
        TBActionView tBActionView = ((MUSPageActivity) this.i).f11558a;
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
        if (this.i.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        try {
            int parseColor = Color.parseColor(jSONObject.getString("color"));
            Toolbar toolbar = (Toolbar) this.i.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setTitleTextColor(parseColor);
                toolbar.setSubtitleTextColor(parseColor);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable mutate = DrawableCompat.wrap(navigationIcon).mutate();
                    DrawableCompat.setTint(mutate, parseColor);
                    toolbar.setNavigationIcon(mutate);
                }
                AppCompatActivity appCompatActivity = this.i;
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
                this.j = true;
            }
        } catch (Exception unused) {
        }
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
        this.i.getSupportActionBar().show();
        return null;
    }

    public static BitmapDrawable I(Activity activity, int i) {
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
            dwh.h("TBNavBarAdapter", e2);
        }
        return new BitmapDrawable(activity.getResources(), H(tIconFontTextView));
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 l(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("f8d6e2bb", new Object[]{this, aVar, jSONObject});
        }
        if (this.i.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("transparent");
        AppCompatActivity appCompatActivity = this.i;
        if (appCompatActivity instanceof MUSPageActivity) {
            ((MUSPageActivity) appCompatActivity).n3(!"true".equals(string));
        }
        return null;
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
            if (this.i instanceof CustomBaseActivity) {
                if (bool == null || bool.booleanValue()) {
                    ((CustomBaseActivity) this.i).togglePublicMenu(true);
                } else {
                    ((CustomBaseActivity) this.i).togglePublicMenu(false);
                }
                this.i.supportInvalidateOptionsMenu();
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
        AppCompatActivity appCompatActivity = this.i;
        if (!(appCompatActivity instanceof MUSPageActivity)) {
            return new lq0("WX_NOT_SUPPORTED", "Only WXActivity support showMenu(), or your own activity should implement getOverflowMenuButton()");
        }
        boolean equals = "true".equals(jSONObject.get("cancelActualShow"));
        try {
            MUSPageActivity mUSPageActivity = (MUSPageActivity) appCompatActivity;
            ActionBar supportActionBar = mUSPageActivity.getSupportActionBar();
            Method method = ActionBar.class.getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(supportActionBar, Boolean.FALSE);
            int identifier = mUSPageActivity.getResources().getIdentifier("action_bar", "id", appCompatActivity.getPackageName());
            if (!(identifier == 0 || (viewGroup = (ViewGroup) mUSPageActivity.findViewById(identifier)) == null)) {
                for (int i = 0; i < 3; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ImageButton) {
                        ((ImageButton) childAt).setImageDrawable(mUSPageActivity.getResources().getDrawable(17170445));
                    } else if (childAt instanceof TextView) {
                        ((TextView) childAt).setText("");
                    } else if (childAt instanceof ActionMenuView) {
                        childAt.setVisibility(4);
                    }
                }
            }
            TBActionView tBActionView = mUSPageActivity.f11558a;
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
                handler.postDelayed(new a(tBActionView, handler, supportActionBar), 64L);
            } else {
                if (supportActionBar != null) {
                    supportActionBar.show();
                }
                handler.postDelayed(new b(supportActionBar), 32L);
            }
            return null;
        } catch (Exception e2) {
            dwh.h("exception in cancel action animation. ", e2);
            return new lq0("ERROR", e2.getMessage());
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
            appCompatActivity = this.i;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if ((appCompatActivity instanceof MUSPageActivity) && ((MUSPageActivity) appCompatActivity).isMainHc()) {
            return false;
        }
        mpb a2 = e5x.b().a();
        if (a2 == null) {
            return true;
        }
        String config = a2.getConfig("group_weex_hc", "weex_main_hc_domain", "");
        if (!TextUtils.isEmpty(config)) {
            for (String str : config.split(",")) {
                if (!TextUtils.isEmpty(this.h) && this.h.contains(str)) {
                    return false;
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
        AppCompatActivity appCompatActivity = this.i;
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
