package com.taobao.search.m3.more;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.more.MoreAreaView;
import com.taobao.search.m3.more.pk.PkButton;
import com.taobao.taobao.R;
import tb.a07;
import tb.ckf;
import tb.cuf;
import tb.dgw;
import tb.f4m;
import tb.lsk;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MoreAreaView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String oldMoreUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01lncuW41zjYNQq6yGO_!!6000000006750-2-tps-52-12.png";
    private static final String tb2024MoreUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01KIXQDn1WIsV5yGmpa_!!6000000002766-2-tps-40-10.png";
    private final MoreButton addCartButton;
    private lsk listener;
    private final MoreButton moreButton;
    private final PkButton pkButton;
    private boolean shouldExpand;
    public static final b Companion = new b(null);
    private static final int moreBtnSize = o1p.a(13.0f);
    private static final int addCartSize = o1p.a(16.0f);
    private static final int expandSize = o1p.a(5.0f);
    private static final int verticalExpandSize = o1p.a(3.5f);
    private int currentType = 3;
    private final Rect lastTouchRect = new Rect();
    private final Rect currentTouchRect = new Rect();
    private final Rect touchRect = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(815792415);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(815792414);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreAreaView(Context context) {
        super(context);
        ckf.g(context, "context");
        int i = moreBtnSize;
        MoreButton moreButton = new MoreButton(context, i, i, expandSize, oldMoreUrl);
        this.moreButton = moreButton;
        int i2 = addCartSize;
        this.addCartButton = new MoreButton(context, i2, i2, 0, "https://gw.alicdn.com/imgextra/i4/O1CN01fE3kPZ1EBOdeirK7R_!!6000000000313-2-tps-72-72.png");
        this.pkButton = new PkButton(context);
        setOnClickListener(new View.OnClickListener() { // from class: tb.rfz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreAreaView._init_$lambda$0(MoreAreaView.this, view);
            }
        });
        moreButton.setContentDescription(Localization.q(R.string.app_more_options));
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MoreAreaView moreAreaView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b70101", new Object[]{moreAreaView, view});
            return;
        }
        ckf.g(moreAreaView, "this$0");
        lsk lskVar = moreAreaView.listener;
        if (lskVar != null) {
            lskVar.q(moreAreaView.currentType);
        }
    }

    private final void expandTouchArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc523679", new Object[]{this});
            return;
        }
        getHitRect(this.currentTouchRect);
        if (!ckf.b(this.currentTouchRect, this.lastTouchRect)) {
            this.lastTouchRect.set(this.currentTouchRect);
            this.touchRect.set(this.currentTouchRect);
            Rect rect = this.touchRect;
            int i = rect.left;
            int i2 = expandSize;
            rect.left = i - i2;
            int i3 = rect.top;
            int i4 = verticalExpandSize;
            rect.top = i3 - i4;
            rect.right += i2;
            rect.bottom += i4;
            ViewParent parent = getParent();
            ckf.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setTouchDelegate(new TouchDelegate(this.touchRect, this));
        }
    }

    public static /* synthetic */ Object ipc$super(MoreAreaView moreAreaView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/more/MoreAreaView");
    }

    private final void updateAddCart(cuf cufVar) {
        String str;
        float f;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0d8d70", new Object[]{this, cufVar});
            return;
        }
        MoreButton moreButton = this.addCartButton;
        if (cufVar != null) {
            str = cufVar.c();
        } else {
            str = null;
        }
        moreButton.updateUrl(str);
        if (cufVar == null) {
            MoreButton moreButton2 = this.addCartButton;
            int i2 = addCartSize;
            moreButton2.setW(i2);
            this.addCartButton.setH(i2);
            return;
        }
        if (cufVar.d() <= 0 || cufVar.a() <= 0) {
            f = 1.0f;
        } else {
            f = cufVar.d() / cufVar.a();
        }
        if (cufVar.b() > 0) {
            i = o1p.b(cufVar.b());
        } else {
            i = addCartSize;
        }
        this.addCartButton.setW((int) (i * f));
        this.addCartButton.setH(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            if (this.shouldExpand) {
                expandTouchArea();
            } else {
                this.lastTouchRect.setEmpty();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public final void update(boolean z, f4m f4mVar, boolean z2, cuf cufVar, lsk lskVar, boolean z3) {
        View view;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb5f808", new Object[]{this, new Boolean(z), f4mVar, new Boolean(z2), cufVar, lskVar, new Boolean(z3)});
            return;
        }
        ckf.g(lskVar, DataReceiveMonitor.CB_LISTENER);
        removeAllViews();
        this.listener = lskVar;
        if (f4mVar != null && z) {
            this.currentType = 1;
            this.pkButton.update(f4mVar);
            this.shouldExpand = false;
            view = this.pkButton;
        } else if (z2) {
            this.currentType = 2;
            updateAddCart(cufVar);
            this.shouldExpand = false;
            view = this.addCartButton;
        } else {
            this.currentType = 3;
            this.shouldExpand = true;
            MoreButton moreButton = this.moreButton;
            if (z3) {
                str = tb2024MoreUrl;
            } else {
                str = oldMoreUrl;
            }
            moreButton.updateUrl(str);
            view = this.moreButton;
        }
        if (getChildCount() <= 0 || getChildAt(0) != view) {
            removeAllViews();
            addView(view);
            this.lastTouchRect.setEmpty();
        }
    }
}
