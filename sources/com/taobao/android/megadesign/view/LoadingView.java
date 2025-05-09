package com.taobao.android.megadesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hsq;
import tb.j1c;
import tb.nii;
import tb.ssc;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\rR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR2\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130 j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013`!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/taobao/android/megadesign/view/LoadingView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Ltb/xhv;", "initAttrs", "(Landroid/util/AttributeSet;)V", "setupLoadingView", "()V", "Landroid/view/ViewGroup;", "viewGroup", "show", "(Landroid/view/ViewGroup;)V", "hide", "", "message", "setMessage", "(Ljava/lang/String;)V", "style", "setStyle", DMComponent.RESET, "Ltb/ssc;", "mWidgetService", "Ltb/ssc;", "", "mIsLoading", "Z", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mLoadingParams", "Ljava/util/HashMap;", "Landroid/view/View;", "mDXRootView", "Landroid/view/View;", "mNeedRender", "mNeedInitDx", "mFrameLayout", "Landroid/widget/FrameLayout;", "Companion", TplMsg.VALUE_T_NATIVE_RETURN, "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class LoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    private static final String LOADING_TYPE = "loading";
    private View mDXRootView;
    private FrameLayout mFrameLayout;
    private boolean mIsLoading;
    private HashMap<String, String> mLoadingParams;
    private boolean mNeedInitDx;
    private boolean mNeedRender;
    private ssc mWidgetService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements j1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.j1c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            LoadingView.this.removeAllViews();
            if (view != null) {
                LoadingView.this.addView(view);
            }
            LoadingView.access$setMDXRootView$p(LoadingView.this, view);
        }

        @Override // tb.j1c
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            String str2 = null;
            View inflate = View.inflate(LoadingView.this.getContext(), R.layout.loading_view, null);
            Object obj = LoadingView.access$getMLoadingParams$p(LoadingView.this).get("message");
            if (obj instanceof String) {
                str2 = obj;
            }
            String str3 = str2;
            if (!TextUtils.isEmpty(str3)) {
                View findViewById = inflate.findViewById(R.id.loading_text);
                ckf.f(findViewById, "view.findViewById<TextView>(R.id.loading_text)");
                ((TextView) findViewById).setText(str3);
            }
            LoadingView.this.removeAllViews();
            LoadingView.this.addView(inflate);
        }
    }

    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final /* synthetic */ View access$getMDXRootView$p(LoadingView loadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9429a2f3", new Object[]{loadingView});
        }
        return loadingView.mDXRootView;
    }

    public static final /* synthetic */ HashMap access$getMLoadingParams$p(LoadingView loadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d8264dad", new Object[]{loadingView});
        }
        return loadingView.mLoadingParams;
    }

    public static final /* synthetic */ void access$setMDXRootView$p(LoadingView loadingView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c9d34d", new Object[]{loadingView, view});
        } else {
            loadingView.mDXRootView = view;
        }
    }

    public static final /* synthetic */ void access$setMLoadingParams$p(LoadingView loadingView, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204ac81d", new Object[]{loadingView, hashMap});
        } else {
            loadingView.mLoadingParams = hashMap;
        }
    }

    private final void initAttrs(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed4775", new Object[]{this, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LoadingView);
            ckf.f(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.LoadingView)");
            String string = obtainStyledAttributes.getString(R.styleable.LoadingView_mega_loading_message);
            if (string == null) {
                string = "";
            }
            this.mLoadingParams.put("message", string);
            String string2 = obtainStyledAttributes.getString(R.styleable.LoadingView_mega_loading_style);
            if (string2 == null) {
                string2 = "light";
            }
            this.mLoadingParams.put("style", string2);
            obtainStyledAttributes.recycle();
        }
        HashMap<String, String> hashMap = this.mLoadingParams;
        if (TextUtils.isEmpty(hashMap.get("message"))) {
            hashMap.put("message", "");
        }
        if (TextUtils.isEmpty(hashMap.get("style"))) {
            hashMap.put("style", "light");
        }
    }

    public static /* synthetic */ Object ipc$super(LoadingView loadingView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/view/LoadingView");
    }

    private final void setupLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac5c1cb", new Object[]{this});
            return;
        }
        ssc b2 = nii.INSTANCE.b();
        this.mWidgetService = b2;
        if (b2 != null) {
            HashMap<String, String> hashMap = this.mLoadingParams;
            if (!(hashMap instanceof Map)) {
                hashMap = null;
            }
            JSONObject jSONObject = new JSONObject(hashMap);
            Context context = getContext();
            ckf.f(context, "context");
            b2.b("loading", jSONObject, context, new c());
        }
    }

    public final void hide() {
        ViewParent viewParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.mIsLoading = false;
        FrameLayout frameLayout = this.mFrameLayout;
        ViewGroup viewGroup = null;
        if (frameLayout != null) {
            viewParent = frameLayout.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = viewParent;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.mFrameLayout);
        }
        setVisibility(8);
        ssc sscVar = this.mWidgetService;
        if (sscVar != null) {
            sscVar.a(getContext());
        }
        this.mNeedInitDx = true;
    }

    public final void setMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else if (!hsq.f(str)) {
            this.mIsLoading = false;
            if (str != null) {
                this.mLoadingParams.put("message", str);
            }
            this.mNeedRender = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.mLoadingParams = new HashMap<>();
        initAttrs(attributeSet);
        setupLoadingView();
        FrameLayout frameLayout = new FrameLayout(context);
        this.mFrameLayout = frameLayout;
        frameLayout.setBackgroundColor(0);
        FrameLayout frameLayout2 = this.mFrameLayout;
        if (frameLayout2 != null) {
            frameLayout2.setOnTouchListener(a.INSTANCE);
        }
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mIsLoading = false;
        this.mLoadingParams.put("style", "light");
        this.mLoadingParams.put("message", "");
        this.mNeedRender = true;
    }

    public final void setStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c790bc0", new Object[]{this, str});
        } else if (!hsq.f(str)) {
            this.mIsLoading = false;
            if (str != null) {
                this.mLoadingParams.put("style", str);
            }
            this.mNeedRender = true;
        }
    }

    public final void show(ViewGroup viewGroup) {
        ssc sscVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e127943", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, "viewGroup");
        if (!this.mIsLoading) {
            ViewGroup viewGroup2 = null;
            if (this.mNeedRender) {
                View view = this.mDXRootView;
                if (!(view instanceof DXRootView)) {
                    view = null;
                }
                DXRootView dXRootView = (DXRootView) view;
                if (!(dXRootView == null || (sscVar = this.mWidgetService) == null)) {
                    Context context = getContext();
                    ckf.f(context, "context");
                    sscVar.c(context, dXRootView, new JSONObject(this.mLoadingParams));
                }
                this.mNeedRender = false;
            }
            if (this.mNeedInitDx) {
                setupLoadingView();
                this.mNeedInitDx = false;
            }
            this.mIsLoading = true;
            FrameLayout frameLayout = this.mFrameLayout;
            ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup2 = parent;
            }
            ViewGroup viewGroup3 = viewGroup2;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.mFrameLayout);
            }
            FrameLayout frameLayout2 = this.mFrameLayout;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this);
            }
            FrameLayout frameLayout3 = this.mFrameLayout;
            if (frameLayout3 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                xhv xhvVar = xhv.INSTANCE;
                frameLayout3.addView(this, layoutParams);
            }
            viewGroup.addView(this.mFrameLayout, new ViewGroup.LayoutParams(-1, -1));
            setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context) {
        this(context, null);
        ckf.g(context, "context");
    }
}
