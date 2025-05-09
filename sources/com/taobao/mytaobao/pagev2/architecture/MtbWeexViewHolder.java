package com.taobao.mytaobao.pagev2.architecture;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.pagev2.MtbWeexManager;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import tb.ckf;
import tb.h3j;
import tb.i3j;
import tb.pb6;
import tb.pgj;
import tb.t2o;
import tb.uv6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbWeexViewHolder;", "Lcom/taobao/mytaobao/pagev2/architecture/MtbAbsViewHolder;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbWeexViewHolder extends MtbAbsViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;
    public String c;
    public final MtbWeexManager d;
    public final FrameLayout e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TUrlImageView b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.mytaobao.pagev2.architecture.MtbWeexViewHolder$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class View$OnClickListenerC0634a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public View$OnClickListenerC0634a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    MtbWeexViewHolder.c0(MtbWeexViewHolder.this).n();
                }
            }
        }

        public a(TUrlImageView tUrlImageView) {
            this.b = tUrlImageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.setOnClickListener(new View$OnClickListenerC0634a());
            this.b.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN0102AGvY1sfhbYFAQhR_!!6000000005794-2-tps-78-78.png");
        }
    }

    static {
        t2o.a(745537904);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbWeexViewHolder(MtbWeexManager mtbWeexManager, FrameLayout frameLayout, String str) {
        super(frameLayout, str);
        ckf.h(mtbWeexManager, "weexManager");
        ckf.h(frameLayout, "flContainer");
        ckf.h(str, "identifier");
        this.d = mtbWeexManager;
        this.e = frameLayout;
    }

    public static final /* synthetic */ MtbWeexManager c0(MtbWeexViewHolder mtbWeexViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbWeexManager) ipChange.ipc$dispatch("9ccf23e3", new Object[]{mtbWeexViewHolder});
        }
        return mtbWeexViewHolder.d;
    }

    public static /* synthetic */ Object ipc$super(MtbWeexViewHolder mtbWeexViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/architecture/MtbWeexViewHolder");
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc30de37", new Object[]{this});
            return;
        }
        View childAt = this.e.getChildAt(0);
        if (!(childAt instanceof MTBBasementContainerView)) {
            childAt = null;
        }
        MTBBasementContainerView mTBBasementContainerView = (MTBBasementContainerView) childAt;
        if (mTBBasementContainerView != null) {
            mTBBasementContainerView.onDestroy();
            this.e.removeAllViews();
            this.d.o();
        }
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72071e0a", new Object[]{this});
            return;
        }
        View childAt = this.e.getChildAt(0);
        BasementWeexView basementWeexView = null;
        if (!(childAt instanceof MTBBasementContainerView)) {
            childAt = null;
        }
        MTBBasementContainerView mTBBasementContainerView = (MTBBasementContainerView) childAt;
        if (mTBBasementContainerView != null) {
            basementWeexView = mTBBasementContainerView.getWeexView();
        }
        if (basementWeexView == null) {
            i0();
        }
    }

    public final String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.c;
    }

    public final boolean h0(String str, h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67d5243", new Object[]{this, str, h3jVar})).booleanValue();
        }
        if (h3jVar.d()) {
            h3jVar.l(false);
            return true;
        } else if (ckf.b(str, this.b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.e.removeAllViews();
    }

    public final void d0(h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c60b02", new Object[]{this, h3jVar});
            return;
        }
        ckf.h(h3jVar, "data");
        String a2 = i3j.a(h3jVar);
        if (a2 != null) {
            f0();
            if (!h0(a2, h3jVar)) {
                uv6.j("VH 无diff, moduleName=" + h3jVar.f());
                return;
            }
            uv6.j("二屏bind");
            this.b = a2;
            this.c = h3jVar.f();
            e0();
            MTPtrRecyclerView u = this.d.u();
            if (u != null) {
                int width = u.getWidth();
                MTPtrRecyclerView u2 = this.d.u();
                if (u2 != null) {
                    int height = u2.getHeight() - pgj.b();
                    MtbWeexManager mtbWeexManager = this.d;
                    View view = this.itemView;
                    ckf.c(view, "itemView");
                    Context context = view.getContext();
                    ckf.c(context, "itemView.context");
                    MTBBasementContainerView s = mtbWeexManager.s(context, width, height, a2, h3jVar);
                    s.setLayoutParams(new ViewGroup.LayoutParams(-1, height));
                    this.e.addView(s, 0);
                    View view2 = this.itemView;
                    ckf.c(view2, "itemView");
                    TUrlImageView tUrlImageView = new TUrlImageView(view2.getContext());
                    tUrlImageView.setId(R.id.mtb_back_to_mainpage);
                    View view3 = this.itemView;
                    ckf.c(view3, "itemView");
                    int f = pb6.f(view3.getContext(), 39.0f);
                    View view4 = this.itemView;
                    ckf.c(view4, "itemView");
                    int f2 = pb6.f(view4.getContext(), 15.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f, f);
                    layoutParams.bottomMargin = f2;
                    layoutParams.rightMargin = f2;
                    layoutParams.gravity = BadgeDrawable.BOTTOM_END;
                    tUrlImageView.setLayoutParams(layoutParams);
                    this.e.postDelayed(new a(tUrlImageView), 1000L);
                    this.e.addView(tUrlImageView);
                    return;
                }
                ckf.s();
                throw null;
            }
            ckf.s();
            throw null;
        }
    }
}
