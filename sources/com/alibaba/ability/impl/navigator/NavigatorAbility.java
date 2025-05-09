package com.alibaba.ability.impl.navigator;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsNavigatorAbility;
import com.taobao.android.abilityidl.ability.NavigatorActionResult;
import com.taobao.android.abilityidl.ability.NavigatorFailureResult;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.weex.WeexInstance;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.tbmainfragment.SupportActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.cw7;
import tb.f7l;
import tb.hp6;
import tb.iih;
import tb.iqj;
import tb.izc;
import tb.jdb;
import tb.jzc;
import tb.kdb;
import tb.kqj;
import tb.kzc;
import tb.ldb;
import tb.lqj;
import tb.q6x;
import tb.t2o;
import tb.u2e;
import tb.u3g;
import tb.ueu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class NavigatorAbility extends AbsNavigatorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public u3g f1989a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(122683395);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile Drawable f1990a;
        public volatile Drawable b;

        static {
            t2o.a(122683396);
        }

        public b() {
            this(null, null, 3, null);
        }

        public final Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("d3db8c3d", new Object[]{this});
            }
            return this.f1990a;
        }

        public final Drawable b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("af039eac", new Object[]{this});
            }
            return this.b;
        }

        public final void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3e2100d", new Object[]{this, drawable});
            } else {
                this.f1990a = drawable;
            }
        }

        public final void d(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dbc4b7e", new Object[]{this, drawable});
            } else {
                this.b = drawable;
            }
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!ckf.b(this.f1990a, bVar.f1990a) || !ckf.b(this.b, bVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            Drawable drawable = this.f1990a;
            if (drawable != null) {
                i = drawable.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                i2 = drawable2.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NavigatorTransition(bodyDrawable=" + this.f1990a + ", itemDrawable=" + this.b + f7l.BRACKET_END_STR;
        }

        public b(Drawable drawable, Drawable drawable2) {
            this.f1990a = drawable;
            this.b = drawable2;
        }

        public /* synthetic */ b(Drawable drawable, Drawable drawable2, int i, a07 a07Var) {
            this((i & 1) != 0 ? null : drawable, (i & 2) != 0 ? null : drawable2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements q6x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1991a;
        public final /* synthetic */ kdb b;

        public c(b bVar, NavigatorAbility navigatorAbility, String str, Nav nav, kdb kdbVar, Context context, lqj lqjVar) {
            this.f1991a = bVar;
            this.b = kdbVar;
        }

        @Override // tb.q6x.b
        public void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4) {
            BitmapDrawable bitmapDrawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6d3284", new Object[]{this, bitmap, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            b bVar = this.f1991a;
            if (bitmap != null) {
                bitmapDrawable = new BitmapDrawable(bitmap);
            } else {
                bitmapDrawable = null;
            }
            bVar.c(bitmapDrawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements q6x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1992a;
        public final /* synthetic */ kdb b;

        public d(b bVar, NavigatorAbility navigatorAbility, String str, Nav nav, kdb kdbVar, Context context, lqj lqjVar) {
            this.f1992a = bVar;
            this.b = kdbVar;
        }

        @Override // tb.q6x.b
        public void a(Bitmap bitmap, int i, int i2, double d, double d2, double d3, double d4) {
            BitmapDrawable bitmapDrawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f6d3284", new Object[]{this, bitmap, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
                return;
            }
            b bVar = this.f1992a;
            if (bitmap != null) {
                bitmapDrawable = new BitmapDrawable(bitmap);
            } else {
                bitmapDrawable = null;
            }
            bVar.d(bitmapDrawable);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements u2e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1993a;
        public final /* synthetic */ kdb b;

        public e(b bVar, NavigatorAbility navigatorAbility, String str, Nav nav, kdb kdbVar, Context context, lqj lqjVar) {
            this.f1993a = bVar;
            this.b = kdbVar;
        }

        @Override // tb.u2e
        public Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("fcfab9d1", new Object[]{this});
            }
            return this.f1993a.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements u2e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1994a;
        public final /* synthetic */ kdb b;

        public f(b bVar, NavigatorAbility navigatorAbility, String str, Nav nav, kdb kdbVar, Context context, lqj lqjVar) {
            this.f1994a = bVar;
            this.b = kdbVar;
        }

        @Override // tb.u2e
        public Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("fcfab9d1", new Object[]{this});
            }
            return this.f1994a.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements u3g.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kzc f1995a;

        public g(kzc kzcVar) {
            this.f1995a = kzcVar;
        }

        @Override // tb.u3g.d
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
            }
            ckf.g(keyEvent, "e");
            if (keyEvent.getKeyCode() != 4) {
                return false;
            }
            if (keyEvent.getAction() != 1) {
                return true;
            }
            this.f1995a.onSuccess();
            return true;
        }
    }

    static {
        t2o.a(122683394);
    }

    public static /* synthetic */ Object ipc$super(NavigatorAbility navigatorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/navigator/NavigatorAbility");
    }

    public final boolean a(Activity activity, izc izcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9fbdb7", new Object[]{this, activity, izcVar})).booleanValue();
        }
        if (!(activity instanceof SupportActivity) || TBMainHost.fromActivity(activity) == null) {
            activity.finish();
        } else if (!((SupportActivity) activity).getSupportDelegate().a()) {
            izcVar.O(new ErrorResult("500", "finish failed, is main activity but top fragment is not support fragment.", (Map) null, 4, (a07) null));
            return false;
        }
        return true;
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        u3g u3gVar = this.f1989a;
        if (u3gVar != null) {
            u3gVar.c();
        }
        this.f1989a = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void removeSystemBackBlockListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0818659", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        u3g u3gVar = this.f1989a;
        if (u3gVar != null) {
            u3gVar.c();
        }
        this.f1989a = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void setSystemBackBlockListener(kdb kdbVar, kzc kzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b08e413", new Object[]{this, kdbVar, kzcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kzcVar, "callback");
        u3g u3gVar = this.f1989a;
        if (u3gVar != null) {
            u3gVar.c();
            this.f1989a = null;
        }
        Context context = kdbVar.l().getContext();
        if (!(context instanceof Activity)) {
            kzcVar.O(new ErrorResult("500", "env.getContext is null or invalid", (Map) null, 4, (a07) null));
            return;
        }
        Window window = ((Activity) context).getWindow();
        ckf.f(window, "act.window");
        u3g u3gVar2 = new u3g(window, new g(kzcVar));
        u3gVar2.b();
        xhv xhvVar = xhv.INSTANCE;
        this.f1989a = u3gVar2;
    }

    public final boolean c(kdb kdbVar, kqj kqjVar, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("123f2db6", new Object[]{this, kdbVar, kqjVar, activity, new Boolean(z)})).booleanValue();
        }
        Nav from = Nav.from(activity);
        if (z) {
            from.allowEscape();
            from.withFlags(268435456);
        }
        String str = kqjVar.f22854a;
        Map<String, ? extends Object> map = kqjVar.b;
        if (map != null) {
            str = hp6.b(str, (JSONObject) map);
        }
        Map<String, ? extends Object> map2 = kqjVar.c;
        if (map2 != null) {
            from.withExtras(hp6.a(null, (JSONObject) map2));
        }
        if (kqjVar.f) {
            String str2 = kqjVar.d;
            String str3 = (str2 == null || str2.length() <= 0) ? null : str2;
            lqj lqjVar = kqjVar.e;
            if (!(str3 == null || lqjVar == null)) {
                ckf.f(from, TBBuyPreloadScene.NAV);
                b(kdbVar, activity, from, str3, lqjVar);
            }
        } else {
            from.disableTransition();
            activity.overridePendingTransition(0, 0);
        }
        return from.toUri(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void close(kdb kdbVar, iqj iqjVar, izc izcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729d39c2", new Object[]{this, kdbVar, iqjVar, izcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(iqjVar, "params");
        ckf.g(izcVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            izcVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        } else if (!(context instanceof Activity)) {
            izcVar.O(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (a07) null));
        } else {
            Activity activity = (Activity) context;
            if (a(activity, izcVar)) {
                if (!iqjVar.f21509a) {
                    activity.overridePendingTransition(0, 0);
                }
                NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
                navigatorActionResult.result = Boolean.TRUE;
                xhv xhvVar = xhv.INSTANCE;
                izcVar.E0(navigatorActionResult);
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void openExternalURL(kdb kdbVar, kqj kqjVar, jzc jzcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5925b", new Object[]{this, kdbVar, kqjVar, jzcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kqjVar, "params");
        ckf.g(jzcVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            jzcVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        } else if (!(context instanceof Activity)) {
            jzcVar.O(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (a07) null));
        } else if (c(kdbVar, kqjVar, (Activity) context, true)) {
            jzcVar.onSuccess();
        } else {
            NavigatorFailureResult navigatorFailureResult = new NavigatorFailureResult();
            navigatorFailureResult.errorMsg = "跳转失败";
            xhv xhvVar = xhv.INSTANCE;
            jzcVar.f1(navigatorFailureResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void openURL(kdb kdbVar, kqj kqjVar, izc izcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96046a28", new Object[]{this, kdbVar, kqjVar, izcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kqjVar, "params");
        ckf.g(izcVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            izcVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        } else if (!(context instanceof Activity)) {
            izcVar.O(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (a07) null));
        } else {
            NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
            navigatorActionResult.result = Boolean.valueOf(c(kdbVar, kqjVar, (Activity) context, false));
            xhv xhvVar = xhv.INSTANCE;
            izcVar.E0(navigatorActionResult);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavigatorAbility
    public void replace(kdb kdbVar, kqj kqjVar, izc izcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1555a719", new Object[]{this, kdbVar, kqjVar, izcVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(kqjVar, "params");
        ckf.g(izcVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            izcVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        } else if (!(context instanceof Activity)) {
            izcVar.O(new ErrorResult("500", "env.getContext is invalid", (Map) null, 4, (a07) null));
        } else {
            Activity activity = (Activity) context;
            if (a(activity, izcVar)) {
                NavigatorActionResult navigatorActionResult = new NavigatorActionResult();
                navigatorActionResult.result = Boolean.valueOf(c(kdbVar, kqjVar, activity, false));
                xhv xhvVar = xhv.INSTANCE;
                izcVar.E0(navigatorActionResult);
            }
        }
    }

    public final void b(kdb kdbVar, Context context, Nav nav, String str, lqj lqjVar) {
        String str2;
        Object obj;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40787d0", new Object[]{this, kdbVar, context, nav, str, lqjVar});
            return;
        }
        ldb a2 = kdbVar.a();
        if (ckf.b(a2 != null ? a2.getNamespace() : null, "weex")) {
            Object userContext = kdbVar.getUserContext();
            if (!(userContext instanceof Map)) {
                userContext = null;
            }
            Map map = (Map) userContext;
            Object obj2 = map != null ? map.get("instance") : null;
            if (!(obj2 instanceof WeexInstance)) {
                obj2 = null;
            }
            WeexInstance weexInstance = (WeexInstance) obj2;
            if (weexInstance != null) {
                b bVar = new b(null, null, 3, null);
                q6x q6xVar = (q6x) weexInstance.getExtend(q6x.class);
                if (q6xVar != null) {
                    q6xVar.i("#body", null, new c(bVar, this, str, nav, kdbVar, context, lqjVar));
                    q6xVar.i(str, null, new d(bVar, this, str, nav, kdbVar, context, lqjVar));
                    ueu.b d2 = new ueu.b().b(2).e(new e(bVar, this, str, nav, kdbVar, context, lqjVar)).d(new f(bVar, this, str, nav, kdbVar, context, lqjVar));
                    RectF rectF = new RectF();
                    int[] iArr = new int[2];
                    WeakReference<View> h = kdbVar.h();
                    if (!(h == null || (view = h.get()) == null)) {
                        view.getLocationOnScreen(iArr);
                    }
                    rectF.left = iArr[0] + cw7.a(context, (float) lqjVar.f23513a);
                    rectF.top = iArr[1] + cw7.a(context, (float) lqjVar.b);
                    rectF.right = rectF.left + cw7.a(context, (float) lqjVar.c);
                    rectF.bottom = rectF.top + cw7.a(context, (float) lqjVar.d);
                    xhv xhvVar = xhv.INSTANCE;
                    nav.withTransitionParams(d2.f(rectF).c(false).a());
                    obj = q6xVar;
                    str2 = "NavigatorAbility";
                } else {
                    str2 = "NavigatorAbility";
                    iih.INSTANCE.a(str2, "weex instance get extend WeexInstanceUnicornExt is null");
                    obj = xhv.INSTANCE;
                }
                if (obj != null) {
                    return;
                }
            } else {
                str2 = "NavigatorAbility";
            }
            iih.INSTANCE.a(str2, "weex instance is null");
            xhv xhvVar2 = xhv.INSTANCE;
        }
    }
}
