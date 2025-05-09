package com.taobao.mytaobao.biztool;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.acq;
import tb.ckf;
import tb.jpu;
import tb.pb6;
import tb.pg1;
import tb.rhx;
import tb.s0m;
import tb.suv;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/mytaobao/biztool/MtbToolEditActivity;", "Lcom/taobao/tao/BaseActivity;", "<init>", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbToolEditActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtbToolEditPresenter f11198a = new MtbToolEditPresenter();
    public WrapContentRecyclerView b;
    public ToolAdapter c;
    public WrapContentRecyclerView d;
    public ToolAdapter e;
    public TextView f;
    public int g;
    public int h;
    public ViewTreeObserver.OnWindowFocusChangeListener i;
    public OnScreenChangedListener j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MtbToolEditActivity.n3(MtbToolEditActivity.this).e();
            this.b.setVisibility(8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            } else {
                ckf.h(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            ckf.h(configuration, p1.d);
            MtbToolEditActivity mtbToolEditActivity = MtbToolEditActivity.this;
            MtbToolEditActivity.o3(mtbToolEditActivity, rhx.a(mtbToolEditActivity).width());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements ViewTreeObserver.OnWindowFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            } else if (z) {
                MtbToolEditActivity mtbToolEditActivity = MtbToolEditActivity.this;
                Window window = mtbToolEditActivity.getWindow();
                ckf.c(window, pg1.ATOM_EXT_window);
                View decorView = window.getDecorView();
                ckf.c(decorView, "window.decorView");
                MtbToolEditActivity.o3(mtbToolEditActivity, decorView.getWidth());
            }
        }
    }

    static {
        t2o.a(745537660);
    }

    public MtbToolEditActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(MtbToolEditActivity mtbToolEditActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/MtbToolEditActivity");
        }
    }

    public static final /* synthetic */ void l3(MtbToolEditActivity mtbToolEditActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e8faa8", new Object[]{mtbToolEditActivity, new Integer(i)});
        } else {
            mtbToolEditActivity.q3(i);
        }
    }

    public static final /* synthetic */ ToolAdapter m3(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToolAdapter) ipChange.ipc$dispatch("31ac54b3", new Object[]{mtbToolEditActivity});
        }
        ToolAdapter toolAdapter = mtbToolEditActivity.c;
        if (toolAdapter != null) {
            return toolAdapter;
        }
        ckf.y("myToolAdapter");
        throw null;
    }

    public static final /* synthetic */ MtbToolEditPresenter n3(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbToolEditPresenter) ipChange.ipc$dispatch("d4b204fe", new Object[]{mtbToolEditActivity});
        }
        return mtbToolEditActivity.f11198a;
    }

    public static final /* synthetic */ void o3(MtbToolEditActivity mtbToolEditActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af99f69a", new Object[]{mtbToolEditActivity, new Integer(i)});
        } else {
            mtbToolEditActivity.r3(i);
        }
    }

    public static final /* synthetic */ void p3(MtbToolEditActivity mtbToolEditActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6eeef4b", new Object[]{mtbToolEditActivity, new Integer(i)});
        } else {
            mtbToolEditActivity.s3(i);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.h(motionEvent, "ev");
        if (motionEvent.getAction() == 1) {
            this.f11198a.d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        w3();
        this.f11198a.n(null);
        super.onDestroy();
    }

    public final void u3(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71599ccd", new Object[]{this, jSONArray, jSONArray2});
            return;
        }
        ckf.h(jSONArray, "listMyTool");
        ckf.h(jSONArray2, "listMarket");
        ToolAdapter toolAdapter = this.c;
        View view = null;
        if (toolAdapter != null) {
            toolAdapter.O(jSONArray);
            ToolAdapter toolAdapter2 = this.c;
            if (toolAdapter2 != null) {
                toolAdapter2.notifyDataSetChanged();
                ToolAdapter toolAdapter3 = this.e;
                if (toolAdapter3 != null) {
                    toolAdapter3.O(jSONArray2);
                    ToolAdapter toolAdapter4 = this.e;
                    if (toolAdapter4 != null) {
                        toolAdapter4.notifyDataSetChanged();
                        View findViewById = findViewById(R.id.llMtbError);
                        if (findViewById instanceof View) {
                            view = findViewById;
                        }
                        if (view != null) {
                            view.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    ckf.y("marketAdapter");
                    throw null;
                }
                ckf.y("marketAdapter");
                throw null;
            }
            ckf.y("myToolAdapter");
            throw null;
        }
        ckf.y("myToolAdapter");
        throw null;
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167f19b1", new Object[]{this});
            return;
        }
        c cVar = new c();
        Window window = getWindow();
        ckf.c(window, pg1.ATOM_EXT_window);
        View decorView = window.getDecorView();
        ckf.c(decorView, "window.decorView");
        decorView.getViewTreeObserver().addOnWindowFocusChangeListener(cVar);
        this.i = cVar;
        if (TBDeviceUtils.p(this) || TBDeviceUtils.P(this)) {
            b bVar = new b();
            TBAutoSizeConfig.x().d0(bVar);
            this.j = bVar;
        }
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed7938", new Object[]{this});
            return;
        }
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.i;
        if (onWindowFocusChangeListener != null) {
            Window window = getWindow();
            ckf.c(window, pg1.ATOM_EXT_window);
            View decorView = window.getDecorView();
            ckf.c(decorView, "window.decorView");
            decorView.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
        OnScreenChangedListener onScreenChangedListener = this.j;
        if (onScreenChangedListener != null) {
            TBAutoSizeConfig.x().h0(onScreenChangedListener);
        }
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1648dc1", new Object[]{this});
            return;
        }
        View findViewById = findViewById(R.id.viewStubError);
        if (!(findViewById instanceof ViewStub)) {
            findViewById = null;
        }
        ViewStub viewStub = (ViewStub) findViewById;
        if (viewStub != null) {
            viewStub.inflate();
        }
        View findViewById2 = findViewById(R.id.llMtbError);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
            View findViewById3 = findViewById(R.id.basement_error_img);
            if (findViewById3 != null) {
                s0m.B().T("https://gw.alicdn.com/imgextra/i1/O1CN01hLnyGq1u2tFgVTqNH_!!6000000005980-2-tps-200-200.png").into((ImageView) findViewById3);
                View findViewById4 = findViewById(R.id.btn_basement_refresh);
                if (findViewById4 != null) {
                    ViewProxy.setOnClickListener(findViewById4, new a(findViewById2));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    public final void pageUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3f22f5", new Object[]{this});
            return;
        }
        suv.m(this, this.f11198a.j());
        suv.n(this, kotlin.collections.a.k(jpu.a("spm-cnt", "mytaobao.itool.0.0")));
    }

    public final void q3(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc272123", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            Object remove = this.f11198a.g().remove(i);
            ToolAdapter toolAdapter = this.e;
            if (toolAdapter != null) {
                toolAdapter.O(this.f11198a.g());
                ToolAdapter toolAdapter2 = this.e;
                if (toolAdapter2 != null) {
                    toolAdapter2.notifyDataSetChanged();
                    WrapContentRecyclerView wrapContentRecyclerView = this.d;
                    if (wrapContentRecyclerView != null) {
                        wrapContentRecyclerView.refreshHeight(this.h);
                        this.f11198a.h().add(remove);
                        ToolAdapter toolAdapter3 = this.c;
                        if (toolAdapter3 != null) {
                            toolAdapter3.O(this.f11198a.h());
                            ToolAdapter toolAdapter4 = this.c;
                            if (toolAdapter4 != null) {
                                toolAdapter4.notifyDataSetChanged();
                                WrapContentRecyclerView wrapContentRecyclerView2 = this.b;
                                if (wrapContentRecyclerView2 != null) {
                                    wrapContentRecyclerView2.refreshHeight(this.h);
                                    this.f11198a.m(true);
                                    this.f11198a.d();
                                    TextView textView = this.f;
                                    if (textView != null) {
                                        if (this.f11198a.g().isEmpty()) {
                                            i2 = 4;
                                        }
                                        textView.setVisibility(i2);
                                        MtbToolEditPresenter mtbToolEditPresenter = this.f11198a;
                                        if (remove != null) {
                                            mtbToolEditPresenter.a((JSONObject) remove);
                                            return;
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                    }
                                    ckf.y("tvMarketTitle");
                                    throw null;
                                }
                                ckf.y("rvMyTool");
                                throw null;
                            }
                            ckf.y("myToolAdapter");
                            throw null;
                        }
                        ckf.y("myToolAdapter");
                        throw null;
                    }
                    ckf.y("rvMarket");
                    throw null;
                }
                ckf.y("marketAdapter");
                throw null;
            }
            ckf.y("marketAdapter");
            throw null;
        } catch (Throwable unused) {
        }
    }

    public final void r3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a82d2f1", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = (i * 232) / 750;
        int i3 = (i * 264) / 750;
        if (i2 != this.g || i3 != this.h) {
            this.g = i2;
            this.h = i3;
            WrapContentRecyclerView wrapContentRecyclerView = this.b;
            if (wrapContentRecyclerView != null) {
                ViewGroup.LayoutParams layoutParams = wrapContentRecyclerView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins((i - (this.g * 3)) / 2, 0, 0, 0);
                    WrapContentRecyclerView wrapContentRecyclerView2 = this.b;
                    if (wrapContentRecyclerView2 != null) {
                        wrapContentRecyclerView2.setLayoutParams(marginLayoutParams);
                        WrapContentRecyclerView wrapContentRecyclerView3 = this.d;
                        if (wrapContentRecyclerView3 != null) {
                            ViewGroup.LayoutParams layoutParams2 = wrapContentRecyclerView3.getLayoutParams();
                            if (layoutParams2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                marginLayoutParams2.setMargins((i - (this.g * 3)) / 2, 0, 0, 0);
                                WrapContentRecyclerView wrapContentRecyclerView4 = this.d;
                                if (wrapContentRecyclerView4 != null) {
                                    wrapContentRecyclerView4.setLayoutParams(marginLayoutParams2);
                                    ToolAdapter toolAdapter = this.e;
                                    if (toolAdapter != null) {
                                        toolAdapter.N(this.g, this.h);
                                        ToolAdapter toolAdapter2 = this.c;
                                        if (toolAdapter2 != null) {
                                            toolAdapter2.N(this.g, this.h);
                                            ToolAdapter toolAdapter3 = this.e;
                                            if (toolAdapter3 != null) {
                                                toolAdapter3.notifyDataSetChanged();
                                                ToolAdapter toolAdapter4 = this.c;
                                                if (toolAdapter4 != null) {
                                                    toolAdapter4.notifyDataSetChanged();
                                                } else {
                                                    ckf.y("myToolAdapter");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("marketAdapter");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y("myToolAdapter");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("marketAdapter");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("rvMarket");
                                    throw null;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        } else {
                            ckf.y("rvMarket");
                            throw null;
                        }
                    } else {
                        ckf.y("rvMyTool");
                        throw null;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                ckf.y("rvMyTool");
                throw null;
            }
        }
    }

    public final void s3(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623bd0a0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.f11198a.h().size() <= 3) {
                Toast.makeText(this, "至少保留3个工具哦~", 0).show();
                return;
            }
            Object remove = this.f11198a.h().remove(i);
            ToolAdapter toolAdapter = this.c;
            if (toolAdapter != null) {
                toolAdapter.O(this.f11198a.h());
                ToolAdapter toolAdapter2 = this.c;
                if (toolAdapter2 != null) {
                    toolAdapter2.notifyDataSetChanged();
                    WrapContentRecyclerView wrapContentRecyclerView = this.b;
                    if (wrapContentRecyclerView != null) {
                        wrapContentRecyclerView.refreshHeight(this.h);
                        this.f11198a.g().add(0, remove);
                        ToolAdapter toolAdapter3 = this.e;
                        if (toolAdapter3 != null) {
                            toolAdapter3.O(this.f11198a.g());
                            ToolAdapter toolAdapter4 = this.e;
                            if (toolAdapter4 != null) {
                                toolAdapter4.notifyDataSetChanged();
                                WrapContentRecyclerView wrapContentRecyclerView2 = this.d;
                                if (wrapContentRecyclerView2 != null) {
                                    wrapContentRecyclerView2.refreshHeight(this.h);
                                    this.f11198a.m(true);
                                    this.f11198a.d();
                                    TextView textView = this.f;
                                    if (textView != null) {
                                        if (this.f11198a.g().isEmpty()) {
                                            i2 = 4;
                                        }
                                        textView.setVisibility(i2);
                                        MtbToolEditPresenter mtbToolEditPresenter = this.f11198a;
                                        if (remove != null) {
                                            mtbToolEditPresenter.c((JSONObject) remove);
                                            return;
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                    }
                                    ckf.y("tvMarketTitle");
                                    throw null;
                                }
                                ckf.y("rvMarket");
                                throw null;
                            }
                            ckf.y("marketAdapter");
                            throw null;
                        }
                        ckf.y("marketAdapter");
                        throw null;
                    }
                    ckf.y("rvMyTool");
                    throw null;
                }
                ckf.y("myToolAdapter");
                throw null;
            }
            ckf.y("myToolAdapter");
            throw null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        systemBarDecorator.enableImmersiveStatusBar(true);
        systemBarDecorator.setStatusBarColor((int) 4294178552L, false);
        setContentView(R.layout.activity_tool_edit);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle("自定义");
        }
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3F6F8")));
        }
        this.f11198a.n(this);
        this.f11198a.e();
        int s = pb6.s(this);
        this.g = (s * 232) / 750;
        this.h = (s * 264) / 750;
        View findViewById = findViewById(R.id.tvMarketTitle);
        ckf.c(findViewById, "findViewById<TextView>(R.id.tvMarketTitle)");
        this.f = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.rvTool);
        ckf.c(findViewById2, "findViewById<WrapContentRecyclerView>(R.id.rvTool)");
        WrapContentRecyclerView wrapContentRecyclerView = (WrapContentRecyclerView) findViewById2;
        this.b = wrapContentRecyclerView;
        wrapContentRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        WrapContentRecyclerView wrapContentRecyclerView2 = this.b;
        if (wrapContentRecyclerView2 != null) {
            wrapContentRecyclerView2.setLayoutManager(gridLayoutManager);
            WrapContentRecyclerView wrapContentRecyclerView3 = this.b;
            if (wrapContentRecyclerView3 != null) {
                ViewGroup.LayoutParams layoutParams = wrapContentRecyclerView3.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins((s - (this.g * 3)) / 2, 0, 0, 0);
                    WrapContentRecyclerView wrapContentRecyclerView4 = this.b;
                    if (wrapContentRecyclerView4 != null) {
                        wrapContentRecyclerView4.setLayoutParams(marginLayoutParams);
                        ToolAdapter toolAdapter = new ToolAdapter(0, this.g, this.h);
                        this.c = toolAdapter;
                        toolAdapter.setHasStableIds(true);
                        ToolAdapter toolAdapter2 = this.c;
                        if (toolAdapter2 != null) {
                            toolAdapter2.P(new MtbToolEditActivity$onCreate$1(this));
                            WrapContentRecyclerView wrapContentRecyclerView5 = this.b;
                            if (wrapContentRecyclerView5 != null) {
                                ToolAdapter toolAdapter3 = this.c;
                                if (toolAdapter3 != null) {
                                    wrapContentRecyclerView5.setAdapter(toolAdapter3);
                                    ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: com.taobao.mytaobao.biztool.MtbToolEditActivity$onCreate$itemTouchCallback$1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(MtbToolEditActivity$onCreate$itemTouchCallback$1 mtbToolEditActivity$onCreate$itemTouchCallback$1, String str, Object... objArr) {
                                            str.hashCode();
                                            int hashCode = str.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/MtbToolEditActivity$onCreate$itemTouchCallback$1");
                                        }

                                        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                                        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                return ((Boolean) ipChange2.ipc$dispatch("3ec6018c", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
                                            }
                                            ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                                            ckf.h(viewHolder, "viewHolder");
                                            ckf.h(viewHolder2, "target");
                                            boolean k = MtbToolEditActivity.n3(MtbToolEditActivity.this).k(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                                            if (k) {
                                                MtbToolEditActivity.m3(MtbToolEditActivity.this).O(MtbToolEditActivity.n3(MtbToolEditActivity.this).h());
                                                MtbToolEditActivity.m3(MtbToolEditActivity.this).notifyDataSetChanged();
                                            }
                                            return k;
                                        }

                                        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                                        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("fc91c0af", new Object[]{this, viewHolder, new Integer(i)});
                                            } else {
                                                ckf.h(viewHolder, "viewHolder");
                                            }
                                        }

                                        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
                                        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                return ((Number) ipChange2.ipc$dispatch("60866505", new Object[]{this, recyclerView, viewHolder})).intValue();
                                            }
                                            ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
                                            ckf.h(viewHolder, "viewHolder");
                                            if (((MyToolViewHolder) viewHolder).c0()) {
                                                return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                                            }
                                            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                                        }
                                    });
                                    WrapContentRecyclerView wrapContentRecyclerView6 = this.b;
                                    if (wrapContentRecyclerView6 != null) {
                                        itemTouchHelper.attachToRecyclerView(wrapContentRecyclerView6);
                                        WrapContentRecyclerView wrapContentRecyclerView7 = this.b;
                                        if (wrapContentRecyclerView7 != null) {
                                            wrapContentRecyclerView7.refreshHeight(this.h);
                                            View findViewById3 = findViewById(R.id.rvMarket);
                                            ckf.c(findViewById3, "findViewById<WrapContent…yclerView>(R.id.rvMarket)");
                                            WrapContentRecyclerView wrapContentRecyclerView8 = (WrapContentRecyclerView) findViewById3;
                                            this.d = wrapContentRecyclerView8;
                                            wrapContentRecyclerView8.setHasFixedSize(true);
                                            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this, 3);
                                            WrapContentRecyclerView wrapContentRecyclerView9 = this.d;
                                            if (wrapContentRecyclerView9 != null) {
                                                wrapContentRecyclerView9.setLayoutManager(gridLayoutManager2);
                                                WrapContentRecyclerView wrapContentRecyclerView10 = this.d;
                                                if (wrapContentRecyclerView10 != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = wrapContentRecyclerView10.getLayoutParams();
                                                    if (layoutParams2 != null) {
                                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                                        marginLayoutParams2.setMargins((s - (this.g * 3)) / 2, 0, 0, 0);
                                                        WrapContentRecyclerView wrapContentRecyclerView11 = this.d;
                                                        if (wrapContentRecyclerView11 != null) {
                                                            wrapContentRecyclerView11.setLayoutParams(marginLayoutParams2);
                                                            ToolAdapter toolAdapter4 = new ToolAdapter(1, this.g, this.h);
                                                            this.e = toolAdapter4;
                                                            toolAdapter4.setHasStableIds(true);
                                                            ToolAdapter toolAdapter5 = this.e;
                                                            if (toolAdapter5 != null) {
                                                                toolAdapter5.P(new MtbToolEditActivity$onCreate$2(this));
                                                                WrapContentRecyclerView wrapContentRecyclerView12 = this.d;
                                                                if (wrapContentRecyclerView12 != null) {
                                                                    ToolAdapter toolAdapter6 = this.e;
                                                                    if (toolAdapter6 != null) {
                                                                        wrapContentRecyclerView12.setAdapter(toolAdapter6);
                                                                        pageUT();
                                                                        v3();
                                                                        return;
                                                                    }
                                                                    ckf.y("marketAdapter");
                                                                    throw null;
                                                                }
                                                                ckf.y("rvMarket");
                                                                throw null;
                                                            }
                                                            ckf.y("marketAdapter");
                                                            throw null;
                                                        }
                                                        ckf.y("rvMarket");
                                                        throw null;
                                                    }
                                                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                }
                                                ckf.y("rvMarket");
                                                throw null;
                                            }
                                            ckf.y("rvMarket");
                                            throw null;
                                        }
                                        ckf.y("rvMyTool");
                                        throw null;
                                    }
                                    ckf.y("rvMyTool");
                                    throw null;
                                }
                                ckf.y("myToolAdapter");
                                throw null;
                            }
                            ckf.y("rvMyTool");
                            throw null;
                        }
                        ckf.y("myToolAdapter");
                        throw null;
                    }
                    ckf.y("rvMyTool");
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ckf.y("rvMyTool");
            throw null;
        }
        ckf.y("rvMyTool");
        throw null;
    }
}
