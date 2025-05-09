package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.view.CategoryViewTouchHelper;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.view.PanelCategoryAdapter;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fpl implements o7d, View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final o7d f19454a;
    public PanelStyleModel b;
    public PanelCategoryAdapter c;
    public StaggeredGridLayoutManager d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(fpl fplVar) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType;

        static {
            int[] iArr = new int[WindowType.values().length];
            $SwitchMap$com$taobao$android$autosize$WindowType = iArr;
            try {
                iArr[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(729809563);
        t2o.a(729809552);
    }

    public fpl(o7d o7dVar) {
        this.f19454a = o7dVar;
    }

    @Override // tb.o7d
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9887f3", new Object[]{this})).booleanValue();
        }
        PanelCategoryAdapter panelCategoryAdapter = this.c;
        if (panelCategoryAdapter == null) {
            return false;
        }
        return panelCategoryAdapter.D();
    }

    public final View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("82ab55bd", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, trs.a(context, this.b.panelGradientHeight));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(new int[]{Color.parseColor(this.b.panelGradientStartBgColor), Color.parseColor(this.b.panelBgColor)});
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(gradientDrawable);
        return frameLayout;
    }

    public final ViewGroup b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d5792835", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColor(Color.parseColor(this.b.panelBgColor));
        float a2 = trs.a(context, 6.0f);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a2, a2, a2, a2});
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLongClickable(false);
        frameLayout.setOnLongClickListener(new a(this));
        return frameLayout;
    }

    public final View c(Context context, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("78496815", new Object[]{this, context, list});
        }
        RecyclerView tRecyclerView = new TRecyclerView(context);
        tRecyclerView.setOnTouchListener(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = trs.a(context, 8.0f);
        int a3 = trs.a(context, 8.0f);
        layoutParams.leftMargin = a2;
        layoutParams.rightMargin = a3;
        layoutParams.bottomMargin = trs.a(context, 24.0f);
        layoutParams.gravity = 17;
        tRecyclerView.setLayoutParams(layoutParams);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(e(this.b.columnConfig, context), 1);
        this.d = staggeredGridLayoutManager;
        tRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        PanelCategoryAdapter panelCategoryAdapter = new PanelCategoryAdapter(this.f19454a);
        this.c = panelCategoryAdapter;
        tRecyclerView.setAdapter(panelCategoryAdapter);
        this.c.e0(list, this.b);
        new ItemTouchHelper(new CategoryViewTouchHelper(this.c)).attachToRecyclerView(tRecyclerView);
        return tRecyclerView;
    }

    public View d(JSONObject jSONObject, PanelStyleModel panelStyleModel, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b87dccc", new Object[]{this, jSONObject, panelStyleModel, context, new Integer(i)});
        }
        this.b = panelStyleModel;
        ViewGroup b2 = b(context);
        b2.addView(a(context));
        b2.addView(c(context, hpl.d(jSONObject, i)));
        return b2;
    }

    @Override // tb.o7d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85541df", new Object[]{this});
            return;
        }
        PanelCategoryAdapter panelCategoryAdapter = this.c;
        if (panelCategoryAdapter != null) {
            panelCategoryAdapter.f();
        }
    }

    public int[] g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3eceb570", new Object[]{this, str});
        }
        int[] iArr = new int[2];
        if (TextUtils.isEmpty(str)) {
            return iArr;
        }
        PanelCategoryAdapter panelCategoryAdapter = this.c;
        if (panelCategoryAdapter == null) {
            return iArr;
        }
        int W = panelCategoryAdapter.W(str);
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.d;
        if (staggeredGridLayoutManager == null) {
            return iArr;
        }
        View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(W);
        if (findViewByPosition == null) {
            return iArr;
        }
        findViewByPosition.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], findViewByPosition.getWidth(), findViewByPosition.getHeight()};
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12be64fe", new Object[]{this})).booleanValue();
        }
        return this.c.a0();
    }

    @Override // tb.o7d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fcc21e", new Object[]{this});
        }
    }

    @Override // tb.o7d
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
            return;
        }
        d9j.c("PanelCategoryViewProvider", "onClose mAdapter onClose:");
        PanelCategoryAdapter panelCategoryAdapter = this.c;
        if (panelCategoryAdapter != null) {
            panelCategoryAdapter.onClose();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.f19454a.m();
        return false;
    }

    @Override // tb.o7d
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901b9a6e", new Object[]{this});
            return;
        }
        PanelCategoryAdapter panelCategoryAdapter = this.c;
        if (panelCategoryAdapter != null) {
            panelCategoryAdapter.v();
        }
    }

    public final int e(String str, Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14530bc3", new Object[]{this, str, context})).intValue();
        }
        int i2 = 4;
        if ((!b9b.e() && !b9b.h()) || TextUtils.isEmpty(str)) {
            return 4;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (!(context instanceof Activity)) {
                return 4;
            }
            int i3 = b.$SwitchMap$com$taobao$android$autosize$WindowType[TBAutoSizeConfig.x().M((Activity) context).ordinal()];
            if (i3 == 1) {
                i = parseObject.getIntValue("min");
            } else if (i3 == 2) {
                i = parseObject.getIntValue("small");
            } else if (i3 == 3) {
                i = parseObject.getIntValue("medium");
            } else if (i3 == 4) {
                i = parseObject.getIntValue("large");
            } else if (i3 == 5) {
                i = parseObject.getIntValue("max");
            }
            if (i > 0) {
                i2 = i;
            }
            d9j.c("PanelCategoryViewProvider", "getColumns columns:" + i2);
            return i2;
        } catch (Exception unused) {
            d9j.c("PanelCategoryViewProvider", "getColumns columnsData parse error");
            return 4;
        }
    }
}
