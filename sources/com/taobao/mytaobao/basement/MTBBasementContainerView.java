package com.taobao.mytaobao.basement;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.ckf;
import tb.h3j;
import tb.s0m;
import tb.t2o;
import tb.uuo;
import tb.uv6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0018R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/taobao/mytaobao/basement/MTBBasementContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "weexView", "Ltb/xhv;", "installWeex", "(Lcom/taobao/mytaobao/basement/weex/BasementWeexView;)V", "Landroid/view/View$OnClickListener;", "reloadClickListener", "showErrorPage", "(Landroid/view/View$OnClickListener;)V", "Ltb/h3j;", "data", "delayShowPlaceHolder", "(Ltb/h3j;)V", "hidePlaceHolder", "()V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDestroy", "<set-?>", "Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "getWeexView", "()Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "isShowErrorPage", "Z", "Ljava/lang/Runnable;", "showSnapshotTask", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MTBBasementContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private boolean isShowErrorPage;
    private final Handler mainHandler;
    private Runnable showSnapshotTask;
    private BasementWeexView weexView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public b(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MTBBasementContainerView.access$setShowErrorPage$p(MTBBasementContainerView.this, false);
            View findViewById = MTBBasementContainerView.this.findViewById(R.id.llMtbError);
            if (!(findViewById instanceof View)) {
                findViewById = null;
            }
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            this.b.onClick(view);
        }
    }

    static {
        t2o.a(745537599);
    }

    public MTBBasementContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ boolean access$isShowErrorPage$p(MTBBasementContainerView mTBBasementContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa25fa8", new Object[]{mTBBasementContainerView})).booleanValue();
        }
        return mTBBasementContainerView.isShowErrorPage;
    }

    public static final /* synthetic */ void access$setShowErrorPage$p(MTBBasementContainerView mTBBasementContainerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9eb9bf8", new Object[]{mTBBasementContainerView, new Boolean(z)});
        } else {
            mTBBasementContainerView.isShowErrorPage = z;
        }
    }

    public static /* synthetic */ Object ipc$super(MTBBasementContainerView mTBBasementContainerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/MTBBasementContainerView");
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void delayShowPlaceHolder(h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d1519ce", new Object[]{this, h3jVar});
            return;
        }
        ckf.h(h3jVar, "data");
        uv6.j(".........delayShowPlaceHolder");
        Runnable runnable = this.showSnapshotTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(h3jVar);
        this.showSnapshotTask = aVar;
        this.mainHandler.postDelayed(aVar, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isShowErrorPage || this.weexView == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final BasementWeexView getWeexView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementWeexView) ipChange.ipc$dispatch("64635b9d", new Object[]{this});
        }
        return this.weexView;
    }

    public final void hidePlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a162f8", new Object[]{this});
            return;
        }
        uv6.j(".........hidePlaceHolder");
        Runnable runnable = this.showSnapshotTask;
        if (runnable != null) {
            Handler handler = this.mainHandler;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            } else {
                ckf.s();
                throw null;
            }
        }
        View findViewById = findViewById(R.id.mtb_iv_basement_placeholder);
        if (!(findViewById instanceof ImageView)) {
            findViewById = null;
        }
        ImageView imageView = (ImageView) findViewById;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
    }

    public final void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BasementWeexView basementWeexView = this.weexView;
        if (basementWeexView != null) {
            basementWeexView.dispose();
        }
        this.weexView = null;
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ h3j b;

        public a(h3j h3jVar) {
            this.b = h3jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!MTBBasementContainerView.access$isShowErrorPage$p(MTBBasementContainerView.this)) {
                uv6.j(".........real delayShowPlaceHolder");
                MTBBasementContainerView mTBBasementContainerView = MTBBasementContainerView.this;
                int i2 = R.id.mtb_iv_basement_placeholder;
                View findViewById = mTBBasementContainerView.findViewById(i2);
                String str = null;
                if (!(findViewById instanceof ImageView)) {
                    findViewById = null;
                }
                ImageView imageView = (ImageView) findViewById;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                TUrlImageView tUrlImageView = new TUrlImageView(MTBBasementContainerView.this.getContext());
                tUrlImageView.setId(i2);
                tUrlImageView.setAdjustViewBounds(true);
                MTBBasementContainerView.this.addView(tUrlImageView, -1, -2);
                JSONObject g = this.b.g();
                if (!(g == null || (jSONObject = g.getJSONObject("fields")) == null || (jSONObject2 = jSONObject.getJSONObject("basementTip")) == null)) {
                    str = jSONObject2.getString("placeHolderType");
                }
                if (TextUtils.equals("2", str) || TextUtils.equals("3", str)) {
                    i = R.drawable.mtb_basement_placeholder2;
                } else {
                    i = R.drawable.mtb_basement_placeholder;
                }
                s0m.B().T(uuo.r(i)).into(tUrlImageView);
            }
        }
    }

    public MTBBasementContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void installWeex(BasementWeexView basementWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0043ed", new Object[]{this, basementWeexView});
            return;
        }
        ckf.h(basementWeexView, "weexView");
        this.weexView = basementWeexView;
        addView(basementWeexView, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTBBasementContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.h(context, "context");
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public final void showErrorPage(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7892d8", new Object[]{this, onClickListener});
            return;
        }
        ckf.h(onClickListener, "reloadClickListener");
        View findViewById = findViewById(R.id.llMtbError);
        if (!(findViewById instanceof View)) {
            findViewById = null;
        }
        b bVar = new b(onClickListener);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            View findViewById2 = findViewById.findViewById(R.id.btn_basement_refresh);
            if (findViewById2 != null) {
                ViewProxy.setOnClickListener(findViewById2, bVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mtb_basement_error, (ViewGroup) this, true);
            ckf.c(inflate, "errorView");
            inflate.setVisibility(0);
            View findViewById3 = inflate.findViewById(R.id.basement_error_img);
            if (findViewById3 != null) {
                s0m.B().T("https://gw.alicdn.com/imgextra/i1/O1CN01hLnyGq1u2tFgVTqNH_!!6000000005980-2-tps-200-200.png").into((ImageView) findViewById3);
                View findViewById4 = inflate.findViewById(R.id.btn_basement_refresh);
                if (findViewById4 != null) {
                    ViewProxy.setOnClickListener(findViewById4, bVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
        }
        this.isShowErrorPage = true;
        hidePlaceHolder();
    }

    public /* synthetic */ MTBBasementContainerView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
