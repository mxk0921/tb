package com.taobao.android.icart.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragParentFrameLayout;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import kotlin.Metadata;
import tb.ckf;
import tb.pb6;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/icart/widget/CartFragmentLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addViews", "Landroid/view/View;", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartFragmentLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151061);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartFragmentLayout(Context context) {
        super(context, null, -1, -1);
        ckf.g(context, "context");
        addViews(context);
    }

    private final View addViews(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("da065136", new Object[]{this, context});
        }
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setId(R.id.cart_container);
        setBackgroundColor(ContextCompat.getColor(context, R.color.icart_background));
        setClipToPadding(false);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setId(R.id.cart_theme_container_v2);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) frameLayout2.getResources().getDimension(R.dimen.cart_top_height)));
        frameLayout2.setId(R.id.cart_top_bg_container);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        CartInsetLinearLayout cartInsetLinearLayout = new CartInsetLinearLayout(context);
        cartInsetLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cartInsetLinearLayout.setId(R.id.cart_top_layout);
        cartInsetLinearLayout.setClipChildren(false);
        cartInsetLinearLayout.setOrientation(1);
        DragParentFrameLayout dragParentFrameLayout = new DragParentFrameLayout(context);
        dragParentFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        dragParentFrameLayout.setId(R.id.drag_parent_layout);
        PtrBase ptrBase = new PtrBase(context);
        ptrBase.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ptrBase.setId(R.id.cart_refresh);
        ptrBase.setMode(PullBase.Mode.PULL_FROM_START);
        CartRecyclerView cartRecyclerView = new CartRecyclerView(context);
        cartRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cartRecyclerView.setOverScrollMode(2);
        cartRecyclerView.setId(R.id.cart_recycler_view);
        cartRecyclerView.setDescendantFocusability(131072);
        ptrBase.addView(cartRecyclerView);
        dragParentFrameLayout.addView(ptrBase);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewStub.setId(R.id.drag_layer_viewstub);
        viewStub.setLayoutResource(R.layout.icart_viewstub_dragfloatlayer);
        dragParentFrameLayout.addView(viewStub);
        linearLayout.addView(cartInsetLinearLayout);
        linearLayout.addView(dragParentFrameLayout);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setVisibility(8);
        frameLayout3.setId(R.id.cart_pop_placeholder);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.setClickable(false);
        frameLayout3.setFocusable(false);
        frameLayout3.setClipToPadding(true);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.cart_bottom_float_layout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        xhv xhvVar = xhv.INSTANCE;
        frameLayout4.setLayoutParams(layoutParams);
        CartLinearLayout cartLinearLayout = new CartLinearLayout(context);
        cartLinearLayout.setClipChildren(false);
        cartLinearLayout.setClipToPadding(false);
        cartLinearLayout.setId(R.id.cart_bottom_layout);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        cartLinearLayout.setLayoutParams(layoutParams2);
        cartLinearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.status_container);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(1);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        view.setId(R.id.ptr_loading);
        view.setClickable(true);
        view.setBackgroundColor(0);
        view.setVisibility(8);
        TBErrorViewWidget tBErrorViewWidget = new TBErrorViewWidget(context, 8);
        tBErrorViewWidget.setId(R.id.icart_network_error_view_widget);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = pb6.f(context, 7.0f);
        layoutParams3.gravity = 81;
        tBErrorViewWidget.setLayoutParams(layoutParams3);
        tBErrorViewWidget.setAdaptiveWidth(true);
        addView(frameLayout);
        addView(frameLayout2);
        addView(linearLayout);
        addView(frameLayout3);
        addView(frameLayout4);
        addView(cartLinearLayout);
        addView(linearLayout2);
        addView(view);
        addView(tBErrorViewWidget);
        return this;
    }

    public static /* synthetic */ Object ipc$super(CartFragmentLayout cartFragmentLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/CartFragmentLayout");
    }
}
