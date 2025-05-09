package com.taobao.themis.pub.titlebar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.taobao.R;
import com.taobao.themis.container.title.titlebar.TMSBaseTitleBar;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub.titlebar.action.PubAddIconAction;
import com.taobao.themis.pub.titlebar.action.PubMoreCloseAction;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.PubIconChangeGuide;
import com.taobao.themis.pub_kit.guide.PubRecommendCloseGuide;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.utils.PubKitCommonUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.a1e;
import tb.a90;
import tb.bbs;
import tb.c3n;
import tb.c8;
import tb.ccs;
import tb.ckf;
import tb.fbs;
import tb.h3n;
import tb.iqw;
import tb.iud;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.lxt;
import tb.mcs;
import tb.n4d;
import tb.ncs;
import tb.ner;
import tb.o3n;
import tb.p8s;
import tb.q9s;
import tb.qml;
import tb.qx;
import tb.r2n;
import tb.r8s;
import tb.t2n;
import tb.t2o;
import tb.tll;
import tb.u3n;
import tb.u8;
import tb.unl;
import tb.v0e;
import tb.vbs;
import tb.w2n;
import tb.w5d;
import tb.x5d;
import tb.xcs;
import tb.xhv;
import tb.y2n;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J-\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0018¨\u0006("}, d2 = {"Lcom/taobao/themis/pub/titlebar/PubTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/xhv;", "attachPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "", "icon", "Landroid/view/View$OnClickListener;", DataReceiveMonitor.CB_LISTENER, "", "addRightButton", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)Z", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Z", "lightIcon", "darkIcon", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Z", "resetBackground", "()V", "Lcom/taobao/themis/kernel/container/Window$Theme;", "style", "setStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)Z", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "type", "hideTitleBar", "(Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;)Z", "Ltb/u8;", "callback", "showRevisitEducationPop", "(Ltb/u8;)Ljava/lang/Boolean;", "onDestroy", "Companion", "a", "themis_pub_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String PUB_GUIDE_RECOMMEND_CUSTOM_REPLACE = "recommendCustomReplace";
    public static final String PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE = "userActiveCustomReplace";
    public JSONArray j;
    public final t2n g = new t2n();
    public final r2n h = new r2n(null, 1, null);
    public final long i = System.currentTimeMillis();
    public final k k = new k();
    public final jqw l = new i();
    public final AtomicBoolean m = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103722);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(844103723);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            iArr[Window.Theme.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public c(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (!PubTitleBar.access$getHasInit$p(PubTitleBar.this).get()) {
                PubTitleBar.access$getHasInit$p(PubTitleBar.this).set(true);
                PubTitleBar.access$setMHomePagePopDataList$p(PubTitleBar.this, fbs.f(this.b.getInstance()));
                PubTitleBar.access$initTitleBarActions(PubTitleBar.this, this.b, pubUserGuideModule);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements PubAddIconAction.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public e(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.pub.titlebar.action.PubAddIconAction.b
        public final void hasClickAddIcon() {
            PubAddIconGuide pubAddIconGuide;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bb78853", new Object[]{this});
                return;
            }
            PubTitleBar.access$setMUserActiveIconChangeGuideDisplay$p(PubTitleBar.this, true);
            PubContainerContext g = fbs.g(this.b.getInstance());
            if (!(g == null || (pubAddIconGuide = g.getPubAddIconGuide()) == null)) {
                pubAddIconGuide.j();
            }
            PubMoreCloseAction pubMoreCloseAction = (PubMoreCloseAction) PubTitleBar.this.getAction(PubMoreCloseAction.class);
            if (pubMoreCloseAction != null) {
                pubMoreCloseAction.D();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (q9s.m1()) {
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).s(xcs.a(PubTitleBar.access$getMContext(PubTitleBar.this), 180.0f));
            } else {
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).r();
                PubTitleBar.access$getMTitleView(PubTitleBar.this).getContentView().measure(-2, -2);
                int c = xcs.c(PubTitleBar.access$getMContext(PubTitleBar.this)) - PubTitleBar.access$getMTitleView(PubTitleBar.this).getContentView().findViewById(R.id.right_panel).getMeasuredWidth();
                View l = PubTitleBar.access$getMPubBackAction$p(PubTitleBar.this).l(PubTitleBar.access$getMContext(PubTitleBar.this));
                if (l != null) {
                    i = l.getMeasuredWidth();
                }
                PubTitleBar.access$getMPubNameAction$p(PubTitleBar.this).s((c - i) - xcs.a(PubTitleBar.access$getMContext(PubTitleBar.this), 24.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public g(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object systemService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                systemService = PubTitleBar.access$getMContext(PubTitleBar.this).getSystemService("input_method");
            } catch (Throwable th) {
                TMSLogger.c("PubTitleBar", "backClick cause error", th);
            }
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                this.b.getInstance().G(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements PubAddIconGuide.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;

        public h(ITMSPage iTMSPage) {
            this.b = iTMSPage;
        }

        @Override // com.taobao.themis.pub_kit.guide.PubAddIconGuide.b
        public final void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            PubMoreCloseAction pubMoreCloseAction = (PubMoreCloseAction) PubTitleBar.this.getAction(PubMoreCloseAction.class);
            if (pubMoreCloseAction != null) {
                pubMoreCloseAction.E();
            }
            PubContainerContext pubContainerContext = (PubContainerContext) this.b.getInstance().g(PubContainerContext.class);
            if (pubContainerContext != null) {
                pubContainerContext.setAddIconGuideIsShowing(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class k extends qx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/PubTitleBar$pubTitleBarPosition$1");
        }

        @Override // tb.qx
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
                return;
            }
            ITMSPage access$getMPage = PubTitleBar.access$getMPage(PubTitleBar.this);
            if (access$getMPage != null) {
                access$getMPage.A(qx.TARGET, qx.EVENT_NAME, generatePosition());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class l implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<JSONObject> f13704a;
        public final /* synthetic */ PubTitleBar b;
        public final /* synthetic */ View c;
        public final /* synthetic */ Ref$ObjectRef<JSONObject> d;
        public final /* synthetic */ h3n e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public l(Ref$ObjectRef<JSONObject> ref$ObjectRef, PubTitleBar pubTitleBar, View view, Ref$ObjectRef<JSONObject> ref$ObjectRef2, h3n h3nVar, String str, String str2) {
            this.f13704a = ref$ObjectRef;
            this.b = pubTitleBar;
            this.c = view;
            this.d = ref$ObjectRef2;
            this.e = h3nVar;
            this.f = str;
            this.g = str2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.f13704a.element = PubTitleBar.access$getActionLocationAndSize(this.b, this.c);
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.d.element != null) {
                h3n h3nVar = this.e;
                String str = this.f;
                ckf.f(str, "appId");
                String str2 = this.g;
                JSONObject jSONObject = new JSONObject();
                Ref$ObjectRef<JSONObject> ref$ObjectRef = this.f13704a;
                Ref$ObjectRef<JSONObject> ref$ObjectRef2 = this.d;
                jSONObject.put((JSONObject) "addIconFrame", (String) ref$ObjectRef.element);
                jSONObject.put((JSONObject) "backHomeFrame", (String) ref$ObjectRef2.element);
                xhv xhvVar = xhv.INSTANCE;
                h3nVar.d(str, str2, 1, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class m implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<JSONObject> f13705a;
        public final /* synthetic */ PubTitleBar b;
        public final /* synthetic */ View c;
        public final /* synthetic */ h3n d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Ref$ObjectRef<JSONObject> g;

        public m(Ref$ObjectRef<JSONObject> ref$ObjectRef, PubTitleBar pubTitleBar, View view, h3n h3nVar, String str, String str2, Ref$ObjectRef<JSONObject> ref$ObjectRef2) {
            this.f13705a = ref$ObjectRef;
            this.b = pubTitleBar;
            this.c = view;
            this.d = h3nVar;
            this.e = str;
            this.f = str2;
            this.g = ref$ObjectRef2;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, com.alibaba.fastjson.JSONObject] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            this.f13705a.element = PubTitleBar.access$getActionLocationAndSize(this.b, this.c);
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.b.getAction(PubAddIconAction.class) == null) {
                h3n h3nVar = this.d;
                String str = this.e;
                ckf.f(str, "appId");
                String str2 = this.f;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "backHomeFrame", (String) this.f13705a.element);
                xhv xhvVar = xhv.INSTANCE;
                h3nVar.d(str, str2, 0, jSONObject);
            } else if (this.g.element != null) {
                h3n h3nVar2 = this.d;
                String str3 = this.e;
                ckf.f(str3, "appId");
                String str4 = this.f;
                JSONObject jSONObject2 = new JSONObject();
                Ref$ObjectRef<JSONObject> ref$ObjectRef = this.g;
                Ref$ObjectRef<JSONObject> ref$ObjectRef2 = this.f13705a;
                jSONObject2.put((JSONObject) "addIconFrame", (String) ref$ObjectRef.element);
                jSONObject2.put((JSONObject) "backHomeFrame", (String) ref$ObjectRef2.element);
                xhv xhvVar2 = xhv.INSTANCE;
                h3nVar2.d(str3, str4, 1, jSONObject2);
            }
        }
    }

    static {
        t2o.a(844103721);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubTitleBar(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ JSONObject access$getActionLocationAndSize(PubTitleBar pubTitleBar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ac9c5051", new Object[]{pubTitleBar, view});
        }
        return pubTitleBar.c(view);
    }

    public static final /* synthetic */ AtomicBoolean access$getHasInit$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("4574d4ea", new Object[]{pubTitleBar});
        }
        return pubTitleBar.m;
    }

    public static final /* synthetic */ jqw access$getMAddIconStatusEventListener$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqw) ipChange.ipc$dispatch("e0788e0f", new Object[]{pubTitleBar});
        }
        return pubTitleBar.l;
    }

    public static final /* synthetic */ Context access$getMContext(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6823723a", new Object[]{pubTitleBar});
        }
        return pubTitleBar.getMContext();
    }

    public static final /* synthetic */ JSONArray access$getMHomePagePopDataList$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("68a28734", new Object[]{pubTitleBar});
        }
        return pubTitleBar.j;
    }

    public static final /* synthetic */ ITMSPage access$getMPage(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("d7f085d1", new Object[]{pubTitleBar});
        }
        return pubTitleBar.getMPage();
    }

    public static final /* synthetic */ t2n access$getMPubBackAction$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2n) ipChange.ipc$dispatch("e811a47d", new Object[]{pubTitleBar});
        }
        return pubTitleBar.g;
    }

    public static final /* synthetic */ r2n access$getMPubNameAction$p(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2n) ipChange.ipc$dispatch("eabdb6", new Object[]{pubTitleBar});
        }
        return pubTitleBar.h;
    }

    public static final /* synthetic */ a1e access$getMTitleView(PubTitleBar pubTitleBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a1e) ipChange.ipc$dispatch("65a07274", new Object[]{pubTitleBar});
        }
        return pubTitleBar.getMTitleView();
    }

    public static final /* synthetic */ void access$initAddIconAction(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419415da", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.d(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initPopWindows(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a43b9c", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.g(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initRecommendGuide(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fbe8ca", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.h(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$initTitleBarActions(PubTitleBar pubTitleBar, ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4463ac", new Object[]{pubTitleBar, iTMSPage, pubUserGuideModule});
        } else {
            pubTitleBar.i(iTMSPage, pubUserGuideModule);
        }
    }

    public static final /* synthetic */ void access$setMHomePagePopDataList$p(PubTitleBar pubTitleBar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe3aefe", new Object[]{pubTitleBar, jSONArray});
        } else {
            pubTitleBar.j = jSONArray;
        }
    }

    public static final /* synthetic */ void access$setMUserActiveIconChangeGuideDisplay$p(PubTitleBar pubTitleBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3232b273", new Object[]{pubTitleBar, new Boolean(z)});
        } else {
            pubTitleBar.getClass();
        }
    }

    public static /* synthetic */ Object ipc$super(PubTitleBar pubTitleBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548369673) {
            return new Boolean(super.hideTitleBar((NavigatorBarAnimType) objArr[0]));
        }
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/pub/titlebar/PubTitleBar");
    }

    public final void a(a90 a90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94b5090", new Object[]{this, a90Var});
            return;
        }
        if (getAction(w2n.class) == null) {
            getMTitleView().addRightAction(a90Var);
        } else {
            getMTitleView().addRightAction(a90Var, 1);
        }
        if (getMTitleView().getContentView().getVisibility() == 0) {
            a90Var.o();
        } else {
            a90Var.n();
        }
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public boolean addRightButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad477f9f", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        w2n w2nVar = (w2n) getMTitleView().getAction(w2n.class);
        if (w2nVar == null) {
            w2n w2nVar2 = new w2n();
            getMTitleView().addRightAction(w2nVar2);
            ITMSPage mPage = getMPage();
            ckf.d(mPage);
            w2nVar2.i(mPage);
            w2nVar2.c(str, onClickListener);
        } else {
            w2nVar.c(str, onClickListener);
        }
        return true;
    }

    public final void b() {
        TMSSolutionType tMSSolutionType;
        Integer num;
        ccs pageParams;
        ccs pageParams2;
        unl e2;
        Window m2;
        bbs instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203a0697", new Object[]{this});
            return;
        }
        ITMSPage mPage = getMPage();
        String str = null;
        Integer num2 = null;
        str = null;
        if (mPage == null || (instance = mPage.getInstance()) == null) {
            tMSSolutionType = null;
        } else {
            tMSSolutionType = instance.a0();
        }
        if (tMSSolutionType == TMSSolutionType.UNIAPP) {
            ITMSPage mPage2 = getMPage();
            if (mPage2 != null) {
                num2 = Integer.valueOf(qml.h(mPage2));
            }
            if (num2 != null) {
                setTitleBarBgColor(num2.intValue());
                return;
            }
            return;
        }
        ITMSPage mPage3 = getMPage();
        if (mPage3 == null || (pageParams2 = mPage3.getPageParams()) == null || (e2 = pageParams2.e()) == null || (m2 = e2.m()) == null) {
            num = null;
        } else {
            num = m2.f();
        }
        ITMSPage mPage4 = getMPage();
        if (!(mPage4 == null || (pageParams = mPage4.getPageParams()) == null)) {
            str = pageParams.d();
        }
        if (str != null && str.length() != 0) {
            setTitleBarBgDrawable(str);
        } else if (num != null) {
            setTitleBarBgColor(num.intValue());
        } else {
            setTitleBarBgColor(Color.parseColor("#FFFFFF"));
        }
    }

    public final void e(ITMSPage iTMSPage) {
        Boolean c2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6372a4", new Object[]{this, iTMSPage});
            return;
        }
        Window m2 = iTMSPage.getPageParams().e().m();
        if (!(m2 == null || (c2 = m2.c()) == null)) {
            z = c2.booleanValue();
        }
        if (!z) {
            getMTitleView().addLeftAction(this.h);
            getMTitleView().getContentView().post(new f());
        }
        if (!qml.d(iTMSPage)) {
            setTitle(qml.l(iTMSPage), (Drawable) null);
            setTitle((String) null, qml.n(iTMSPage));
            if (q9s.Q2() && qml.m(iTMSPage) != null) {
                Integer m3 = qml.m(iTMSPage);
                ckf.d(m3);
                setTitleColor(m3);
            }
        }
    }

    public final void f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1fa2df", new Object[]{this, iTMSPage});
            return;
        }
        this.g.t(new g(iTMSPage));
        getMTitleView().addLeftAction(this.g);
    }

    public final void i(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6650a9", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else {
            CommonExtKt.o(new PubTitleBar$initTitleBarActions$1(pubUserGuideModule, this, iTMSPage));
        }
    }

    public final void k(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        View l2;
        View findViewById;
        View l3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4f832c", new Object[]{this, iTMSPage, pubUserGuideModule});
            return;
        }
        String L = iTMSPage.getInstance().L();
        String userId = ((IAccountAdapter) p8s.g(IAccountAdapter.class)).getUserId(iTMSPage.getInstance());
        if (userId != null) {
            if (getMTitleView().getContentView().getVisibility() != 0) {
                TMSLogger.b("PubTitleBar", "showOperateGuide, titleView is invisible");
                return;
            }
            PubContainerContext g2 = fbs.g(iTMSPage.getInstance());
            h3n pubOperateGuide = g2 == null ? null : g2.getPubOperateGuide();
            if (pubOperateGuide != null) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                PubAddIconAction pubAddIconAction = (PubAddIconAction) getAction(PubAddIconAction.class);
                if (!(pubAddIconAction == null || (l3 = pubAddIconAction.l(getMContext())) == null)) {
                    ViewTreeObserver viewTreeObserver = l3.getViewTreeObserver();
                    ckf.f(viewTreeObserver, "addIconView.viewTreeObserver");
                    viewTreeObserver.addOnGlobalLayoutListener(new l(ref$ObjectRef, this, l3, ref$ObjectRef2, pubOperateGuide, L, userId));
                }
                PubMoreCloseAction pubMoreCloseAction = (PubMoreCloseAction) getAction(PubMoreCloseAction.class);
                if (pubMoreCloseAction != null && (l2 = pubMoreCloseAction.l(getMContext())) != null && (findViewById = l2.findViewById(R.id.back_home_btn)) != null) {
                    ViewTreeObserver viewTreeObserver2 = findViewById.getViewTreeObserver();
                    ckf.f(viewTreeObserver2, "backHomeView.viewTreeObserver");
                    viewTreeObserver2.addOnGlobalLayoutListener(new m(ref$ObjectRef2, this, findViewById, pubOperateGuide, L, userId, ref$ObjectRef));
                }
            }
        }
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        lqw.d().h(this.l);
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public void resetBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff85e4", new Object[]{this});
            return;
        }
        ITMSPage mPage = getMPage();
        if (mPage != null) {
            setTranslucent(qml.j(mPage));
        }
        b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements w5d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements u8 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ITMSPage f13696a;
            public final /* synthetic */ v0e b;

            public a(ITMSPage iTMSPage, v0e v0eVar) {
                this.f13696a = iTMSPage;
                this.b = v0eVar;
            }

            @Override // tb.u8
            public final void callback(String str, c8 c8Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                    return;
                }
                TMSLogger.f("PubTitleBar", ckf.p(str, c8Var));
                if (this.f13696a.getInstance().getExtension(n4d.class) != null) {
                    this.b.p(this.f13696a);
                } else {
                    this.f13696a.getInstance().W().e();
                }
            }
        }

        public d() {
        }

        @Override // tb.w5d.c
        public int getPriority() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // tb.w5d.c
        public boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType) {
            v0e v0eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89a4e043", new Object[]{this, iTMSPage, tMSBackPressedType})).booleanValue();
            }
            ckf.g(iTMSPage, "page");
            ckf.g(tMSBackPressedType, "type");
            if (!qml.z(iTMSPage) || tMSBackPressedType != TMSBackPressedType.TITLE_BAR_BACK_ACTION || (v0eVar = (v0e) iTMSPage.getInstance().getExtension(v0e.class)) == null) {
                return false;
            }
            PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
            if (pubContainerContext != null && !pubContainerContext.getAddIconTipsDisplayInApp() && !ner.o(fbs.e(iTMSPage.getInstance())) && ckf.b(PubTitleBar.this.showRevisitEducationPop(new a(iTMSPage, v0eVar)), Boolean.TRUE)) {
                PubContainerContext pubContainerContext2 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                if (pubContainerContext2 != null) {
                    pubContainerContext2.setRevisitBackGuideIsShowing(true);
                }
                return true;
            } else if (iTMSPage.getInstance().getExtension(n4d.class) == null) {
                return false;
            } else {
                v0eVar.p(iTMSPage);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            String string;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            ckf.g(objArr, "params");
            try {
                ITMSPage access$getMPage = PubTitleBar.access$getMPage(PubTitleBar.this);
                if (access$getMPage != null && i == 3005) {
                    Object obj = objArr[0];
                    JSONObject parseObject = JSON.parseObject(obj instanceof String ? (String) obj : null);
                    if (parseObject == null || (string = parseObject.getString("event")) == null || (jSONObject = parseObject.getJSONObject("param")) == null) {
                        return null;
                    }
                    if (ckf.b(string, "pub_broadcast_update_add_icon_status")) {
                        if (ckf.b(jSONObject.getString("code"), "1")) {
                            PubAddIconAction pubAddIconAction = (PubAddIconAction) PubTitleBar.this.getAction(PubAddIconAction.class);
                            if (pubAddIconAction != null) {
                                PubTitleBar.this.removeAction(pubAddIconAction);
                            }
                            PubContainerContext g = fbs.g(access$getMPage.getInstance());
                            if (g != null) {
                                g.setHasAddToIcon(true);
                            }
                            c3n c3nVar = (c3n) access$getMPage.getInstance().g(c3n.class);
                            if (c3nVar != null) {
                                c3nVar.u();
                            }
                            if (ckf.b(jSONObject.getString("popType"), PubTitleBar.PUB_GUIDE_USER_ACTIVE_CUSTOM_REPLACE)) {
                                access$getMPage.y("userActiveAddIcon", null);
                            }
                        }
                    } else if (ckf.b(string, "pub_user_cancel_add_icon")) {
                        PubAddIconAction pubAddIconAction2 = (PubAddIconAction) PubTitleBar.this.getAction(PubAddIconAction.class);
                        View l = pubAddIconAction2 == null ? null : pubAddIconAction2.l(PubTitleBar.access$getMContext(PubTitleBar.this));
                        if (l == null) {
                            return null;
                        }
                        new PubRecommendCloseGuide(PubTitleBar.access$getMContext(PubTitleBar.this)).d(l);
                    }
                }
            } catch (Throwable th) {
                TMSLogger.c("PubTitleBar", th.getMessage(), th);
            }
            return null;
        }
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public void attachPage(ITMSPage iTMSPage) {
        Window.Theme theme;
        bbs instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        setMPage(iTMSPage);
        getMTitleView().attachPage(iTMSPage);
        j(iTMSPage);
        if (qml.c(iTMSPage)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        }
        ITMSPage mPage = getMPage();
        Window.Theme theme2 = null;
        TMSSolutionType a0 = (mPage == null || (instance = mPage.getInstance()) == null) ? null : instance.a0();
        TMSSolutionType tMSSolutionType = TMSSolutionType.UNIAPP;
        if (a0 == tMSSolutionType) {
            theme = qml.k(iTMSPage);
        } else {
            Window m2 = iTMSPage.getPageParams().e().m();
            if (m2 != null) {
                theme2 = m2.i();
            }
            theme = theme2 == null ? Window.Theme.DARK : theme2;
        }
        if (iTMSPage.getInstance().a0() == tMSSolutionType) {
            b();
        } else if (!qml.j(iTMSPage)) {
            b();
        }
        setStyle(theme);
        PubContainerContext g2 = fbs.g(iTMSPage.getInstance());
        if (g2 != null) {
            g2.setUserClickedCount(g2.getUserClickedCount() + 1);
            f(iTMSPage);
            e(iTMSPage);
            a(new PubMoreCloseAction());
            for (a90 a90Var : getMTitleView().getActions()) {
                a90Var.i(iTMSPage);
            }
            fbs.c(iTMSPage.getInstance(), new c(iTMSPage));
            w5d w5dVar = (w5d) iTMSPage.getExtension(w5d.class);
            if (w5dVar != null) {
                w5dVar.A(new d());
            }
        }
    }

    public final void d(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85805fd7", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else if (TBDeviceUtils.P(getMContext())) {
            TMSLogger.b("PubTitleBar", "当前设备为平板，不展示AddIcon");
        } else if (TBDeviceUtils.p(getMContext())) {
            TMSLogger.b("PubTitleBar", "当前设备为折叠屏，不展示AddIcon");
        } else {
            PubContainerContext g2 = fbs.g(iTMSPage.getInstance());
            if (g2 != null && g2.getHasAddToIcon()) {
                TMSLogger.b("PubTitleBar", "用户已经添加上Icon区");
                return;
            }
            PubAddIconAction pubAddIconAction = new PubAddIconAction(pubUserGuideModule, new e(iTMSPage));
            a(pubAddIconAction);
            pubAddIconAction.i(iTMSPage);
            if (q9s.t1() && new PubIconChangeGuide(getMContext(), pubUserGuideModule, null, 4, null).c("", "").a() == 10000) {
                TMSLogger.b("PubTitleBar", "临时保障Triver复用，不会调用到");
            }
        }
    }

    public final void g(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0f2a19", new Object[]{this, iTMSPage, pubUserGuideModule});
        } else if (TBDeviceUtils.P(getMContext())) {
            TMSLogger.b("PubTitleBar", "当前设备为平板，不展示AddIcon");
        } else if (TBDeviceUtils.p(getMContext())) {
            TMSLogger.b("PubTitleBar", "当前设备为折叠屏，不展示AddIcon");
        } else {
            PubNavBarModel navbar = pubUserGuideModule.getNavbar();
            if (navbar != null && navbar.getEnableNewNavbar()) {
                PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                if (pubContainerContext != null) {
                    pubContainerContext.setPubOperateGuide(new h3n(getMContext(), pubUserGuideModule));
                }
                k(iTMSPage, pubUserGuideModule);
            }
            PubContainerContext pubContainerContext2 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
            if (pubContainerContext2 != null) {
                pubContainerContext2.setPubIconChangeGuide(new PubIconChangeGuide(getMContext(), pubUserGuideModule, this.j));
            }
            PubContainerContext pubContainerContext3 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
            if (pubContainerContext3 != null) {
                pubContainerContext3.setPubRevisitBackGuideV2(new o3n(getMContext(), ner.INSTANCE.b(fbs.d(iTMSPage.getInstance()))));
            }
            PubContainerContext pubContainerContext4 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
            if (pubContainerContext4 != null) {
                pubContainerContext4.setPubAddIconGuide(new PubAddIconGuide(getMContext(), pubUserGuideModule, this.j, new h(iTMSPage)));
            }
        }
    }

    public final void h(ITMSPage iTMSPage, PubUserGuideModule pubUserGuideModule) {
        Integer c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf08447", new Object[]{this, iTMSPage, pubUserGuideModule});
            return;
        }
        JSONObject d2 = fbs.d(iTMSPage.getInstance());
        JSONArray i2 = ner.i(d2);
        PubContainerContext g2 = fbs.g(iTMSPage.getInstance());
        if (d2 == null || i2 == null || g2 == null) {
            String c3 = ncs.c(iTMSPage);
            String d3 = mcs.d(ncs.c(iTMSPage));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "errorMsg", "delta or homePagePopData is null");
            xhv xhvVar = xhv.INSTANCE;
            mcs.c("PubRecommendClient", mcs.EVENT_ON_ERROR, c3, d3, jSONObject);
            return;
        }
        IAccountAdapter iAccountAdapter = (IAccountAdapter) p8s.b(IAccountAdapter.class);
        String userId = iAccountAdapter == null ? null : iAccountAdapter.getUserId(null);
        if (userId != null && userId.length() != 0) {
            PubKitCommonUtils pubKitCommonUtils = PubKitCommonUtils.INSTANCE;
            Context mContext = getMContext();
            String L = iTMSPage.getInstance().L();
            ckf.f(L, "page.getInstance().appId");
            Runnable c4 = pubKitCommonUtils.c(mContext, L, userId, d2, i2, pubUserGuideModule, g2, ncs.c(iTMSPage));
            Integer b2 = u3n.b(pubUserGuideModule);
            if (g2.getUserClickedCount() - 1 == (b2 == null ? -1 : b2.intValue())) {
                CommonExtKt.n(c4);
            } else if (qml.z(iTMSPage) && (c2 = u3n.c(pubUserGuideModule)) != null) {
                CommonExtKt.p(c4, (c2.intValue() * 1000) - (System.currentTimeMillis() - g2.getUserEnterTime()));
            }
        }
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public boolean hideTitleBar(NavigatorBarAnimType navigatorBarAnimType) {
        bbs instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3b5c0f7", new Object[]{this, navigatorBarAnimType})).booleanValue();
        }
        ckf.g(navigatorBarAnimType, "type");
        if (q9s.S2()) {
            return false;
        }
        ITMSPage mPage = getMPage();
        if (!(mPage == null || (instance = mPage.getInstance()) == null)) {
            vbs.s(instance);
        }
        return super.hideTitleBar(navigatorBarAnimType);
    }

    public final void j(ITMSPage iTMSPage) {
        x5d pageContainer;
        x5d pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac3062d", new Object[]{this, iTMSPage});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getMTitleView().getContentView();
        this.k.getSafeAreaInsets()[0] = xcs.f(getMContext(), xcs.d(getMContext()));
        this.k.setImmersive(qml.j(iTMSPage));
        tll pageContext = iTMSPage.getPageContext();
        View view = null;
        View view2 = (pageContext == null || (pageContainer2 = pageContext.getPageContainer()) == null) ? null : pageContainer2.getView();
        if ((view2 instanceof ViewGroup ? (ViewGroup) view2 : null) == null || !q9s.x()) {
            lxt.e(viewGroup, null, this.k);
            return;
        }
        tll pageContext2 = iTMSPage.getPageContext();
        if (!(pageContext2 == null || (pageContainer = pageContext2.getPageContainer()) == null)) {
            view = pageContainer.getView();
        }
        if (view != null) {
            lxt.e(viewGroup, ((ViewGroup) view).getChildAt(0), this.k);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final Boolean showRevisitEducationPop(u8 u8Var) {
        o3n pubRevisitBackGuideV2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b6664a57", new Object[]{this, u8Var});
        }
        ITMSPage mPage = getMPage();
        if (mPage == null) {
            return Boolean.FALSE;
        }
        JSONObject b2 = ner.INSTANCE.b(fbs.d(mPage.getInstance()));
        if (b2 != null) {
            i2 = b2.getIntValue("stayTimeSeconds");
        }
        int i3 = i2 * 1000;
        if (System.currentTimeMillis() - this.i < i3) {
            TMSLogger.b("PubTitleBar", "StayTime not enough: " + (System.currentTimeMillis() - this.i) + " < " + i3);
            return Boolean.FALSE;
        }
        String userId = ((IAccountAdapter) p8s.g(IAccountAdapter.class)).getUserId(mPage.getInstance());
        if (userId == null) {
            return Boolean.FALSE;
        }
        PubContainerContext g2 = fbs.g(mPage.getInstance());
        if (g2 == null || (pubRevisitBackGuideV2 = g2.getPubRevisitBackGuideV2()) == null) {
            return null;
        }
        String L = mPage.getInstance().L();
        ckf.f(L, "page.getInstance().appId");
        return Boolean.valueOf(pubRevisitBackGuideV2.d(L, userId, r8s.f(mPage.getInstance()), r8s.e(mPage.getInstance()), mPage.getInstance().L(), u8Var));
    }

    public final JSONObject c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("496317f4", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "x", (String) Integer.valueOf(xcs.f(getMContext(), iArr[0])));
        jSONObject.put((JSONObject) "y", (String) Integer.valueOf(xcs.f(getMContext(), iArr[1])));
        jSONObject.put((JSONObject) "width", (String) Integer.valueOf(xcs.f(getMContext(), view.getWidth())));
        jSONObject.put((JSONObject) "height", (String) Integer.valueOf(xcs.f(getMContext(), view.getHeight())));
        return jSONObject;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public boolean setStyle(Window.Theme theme) {
        iud iudVar;
        bbs instance;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f45710", new Object[]{this, theme})).booleanValue();
        }
        ckf.g(theme, "style");
        ITMSPage mPage = getMPage();
        TMSSolutionType tMSSolutionType = null;
        if (!(mPage == null || (instance = mPage.getInstance()) == null)) {
            tMSSolutionType = instance.a0();
        }
        if (tMSSolutionType == TMSSolutionType.UNIAPP) {
            int i2 = b.$EnumSwitchMapping$0[theme.ordinal()];
            if (i2 == 1) {
                theme = Window.Theme.DARK;
            } else if (i2 == 2) {
                theme = Window.Theme.LIGHT;
            } else if (i2 == 3) {
                theme = Window.Theme.DARK;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        ITMSPage mPage2 = getMPage();
        if (!(mPage2 == null || (iudVar = (iud) mPage2.getExtension(iud.class)) == null)) {
            if (theme == Window.Theme.DARK) {
                z = true;
            }
            iudVar.R(z);
        }
        getMTitleView().setStyle(theme);
        setMStyle(theme);
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public boolean addRightButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324b505", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        w2n w2nVar = (w2n) getMTitleView().getAction(w2n.class);
        if (w2nVar == null) {
            w2n w2nVar2 = new w2n();
            getMTitleView().addRightAction(w2nVar2);
            ITMSPage mPage = getMPage();
            ckf.d(mPage);
            w2nVar2.i(mPage);
            w2nVar2.b(drawable, onClickListener);
        } else {
            w2nVar.b(drawable, onClickListener);
        }
        return true;
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, tb.y0e
    public boolean addRightButton(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1873dd15", new Object[]{this, str, str2, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        w2n w2nVar = (w2n) getMTitleView().getAction(w2n.class);
        if (w2nVar == null) {
            w2n w2nVar2 = new w2n();
            getMTitleView().addRightAction(w2nVar2);
            ITMSPage mPage = getMPage();
            ckf.d(mPage);
            w2nVar2.i(mPage);
            w2nVar2.h(str, str2, onClickListener);
        } else {
            w2nVar.h(str, str2, onClickListener);
        }
        return true;
    }
}
