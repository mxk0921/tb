package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config;

import android.app.Application;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;
import tb.cfc;
import tb.eue;
import tb.evb;
import tb.fve;
import tb.h6c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InfoFlowItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<BaseSectionModel> f10676a;
    public int[] b;
    public h6c.a<RecyclerView> c;
    public final IFoldDeviceAndPadService d;
    public int e;
    public final boolean f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10677a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(View view, int i, int i2) {
            this.f10677a = view;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10677a.getLayoutParams();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.height;
            }
            if (i < 0) {
                i = this.f10677a.getHeight();
            }
            InfoFlowItemDecoration.this.m(this.b, i + this.c);
        }
    }

    static {
        t2o.a(486539691);
    }

    public InfoFlowItemDecoration(cfc cfcVar, int i) {
        boolean z;
        this.e = i;
        Application a2 = eue.a();
        if (a2 != null) {
            if (TBDeviceUtils.P(a2) || TBDeviceUtils.p(a2)) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
        }
        this.d = (IFoldDeviceAndPadService) cfcVar.a(IFoldDeviceAndPadService.class);
        this.g = g();
    }

    public static int d(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2639d999", new Object[]{viewGroup})).intValue();
        }
        View childAt = viewGroup.getChildAt(0);
        int i = childAt.getLayoutParams().width;
        if (i > 0) {
            return i;
        }
        if (!(childAt instanceof DXButterRootView)) {
            return i;
        }
        DXWidgetNode widgetNode = ((DXButterRootView) childAt).getWidgetNode();
        if (widgetNode == null) {
            return i;
        }
        DXRuntimeContext dXRuntimeContext = widgetNode.getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return i;
        }
        evb evbVar = dXRuntimeContext.G().get(-8936854687533104177L);
        if (evbVar == null) {
            return i;
        }
        return ((Integer) evbVar.evalWithArgs(new Object[0], dXRuntimeContext)).intValue();
    }

    public static /* synthetic */ Object ipc$super(InfoFlowItemDecoration infoFlowItemDecoration, String str, Object... objArr) {
        if (str.hashCode() == 1452916494) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/config/InfoFlowItemDecoration");
    }

    public final void a(View view, Rect rect, int i, int i2, int i3, int i4, StaggeredGridLayoutManager.LayoutParams layoutParams, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8015de", new Object[]{this, view, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), layoutParams, new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
        int i8 = i5 + i + i3;
        if (!(i7 == i8 || i7 == -1 || i7 == -2)) {
            view.setTag(R.id.tag_info_flow_decoration_width, Integer.valueOf(i5));
            ((ViewGroup.MarginLayoutParams) layoutParams).width = i8;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
        int i10 = i6 + i2 + i4;
        if (!(i9 == i10 || i9 == -1 || i9 == -2)) {
            view.setTag(R.id.tag_info_flow_decoration_height, Integer.valueOf(i6));
            ((ViewGroup.MarginLayoutParams) layoutParams).height = i10;
        }
        rect.set(i, i2, i3, i4);
    }

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b997fa", new Object[]{this, canvas, recyclerView});
            return;
        }
        try {
            h6c.a<RecyclerView> aVar = this.c;
            if (aVar != null) {
                aVar.b(canvas, recyclerView);
            }
        } catch (Exception e) {
            fve.c("InfoFlowItemDecoration", "drawSeparator exception = ", e);
        }
    }

    public int[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1828e97f", new Object[]{this});
        }
        return this.b;
    }

    public final int f(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("692007b1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return view.getTag(i) == null ? i2 : ((Integer) view.getTag(i)).intValue();
        } catch (Throwable th) {
            fve.e("InfoFlowItemDecoration", "getTagValue error : " + th.getMessage());
            return i2;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.d;
        if (iFoldDeviceAndPadService == null) {
            return false;
        }
        return iFoldDeviceAndPadService.isAdaptHudScreen();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a1ed6c", new Object[]{this});
            return;
        }
        int[] iArr = this.b;
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }

    public void i(h6c.a<RecyclerView> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a575fe", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1607399", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        this.g = g();
    }

    public void k(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
            return;
        }
        this.f10676a = list;
        h();
    }

    public void l(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67184ec3", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view != null) {
            view.post(new a(view, i2, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5699bf0e", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        c(canvas, recyclerView);
    }

    public void m(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d2413c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.b == null) {
            this.b = new int[32];
        }
        int[] iArr = this.b;
        if (i >= iArr.length) {
            this.b = Arrays.copyOf(iArr, 1 + i);
        }
        int[] iArr2 = this.b;
        if (i < iArr2.length && i2 != iArr2[i]) {
            fve.b("InfoFlowItemDecoration", "updateViewHeight 更新位置高度。set pos=" + i + ", oldHeight=" + this.b[i] + ", newHeight=" + i2);
            this.b[i] = i2;
            h6c.a<RecyclerView> aVar = this.c;
            if (aVar != null) {
                aVar.a(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1 A[Catch: all -> 0x01e8, TRY_ENTER, TryCatch #1 {all -> 0x01e8, blocks: (B:76:0x01a1, B:77:0x01c1, B:79:0x01c5, B:81:0x01ce, B:82:0x01d6, B:83:0x01d8), top: B:88:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1 A[Catch: all -> 0x01e8, TryCatch #1 {all -> 0x01e8, blocks: (B:76:0x01a1, B:77:0x01c1, B:79:0x01c5, B:81:0x01ce, B:82:0x01d6, B:83:0x01d8), top: B:88:0x019f }] */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getItemOffsets(android.graphics.Rect r16, android.view.View r17, androidx.recyclerview.widget.RecyclerView r18, androidx.recyclerview.widget.RecyclerView.State r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public final void b(View view, int i, int i2, int i3, Rect rect, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701b3180", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), rect, new Integer(i4)});
        } else if (i3 <= 0) {
            fve.e("InfoFlowItemDecoration", "view 宽度为0，不绘制边距");
        } else {
            view.setPadding(0, 0, 0, 0);
            int H = TBAutoSizeConfig.x().H(view.getContext());
            int i5 = this.e;
            int round = Math.round(((H - (i3 * i5)) - (i2 * 2)) / (i5 - 1));
            int i6 = i2 - round;
            int i7 = this.e;
            int i8 = (((i7 + 1) * round) + (i6 * 2)) / i7;
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
            int i9 = (((1 + spanIndex) * round) - (spanIndex * i8)) + i6;
            int i10 = i8 - i9;
            rect.set(i9, i, i10, 0);
            if (view.getHeight() <= 0) {
                return;
            }
            if (i9 <= 0 || i10 <= 0 || i <= 0) {
                fve.e("InfoFlowItemDecoration", "itemPosition: " + i4 + ", left: " + i9 + ", right: " + i10 + ", top: " + i + ", viewWidth: " + i3 + ", screenWidth: " + H);
                fve.e("InfoFlowItemDecoration", "itemPosition: " + i4 + " intermediate value: marginTop: " + i + ", marginSide: " + i2 + ", itemAllSpacing: " + i8 + ", spanIndex: " + spanIndex + ", spacing: " + round);
            }
        }
    }
}
