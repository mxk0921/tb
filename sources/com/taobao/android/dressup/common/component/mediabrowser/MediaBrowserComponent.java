package com.taobao.android.dressup.common.component.mediabrowser;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.MediaBrowserModel;
import com.taobao.android.dressup.common.view.indicator.IndicatorView;
import com.taobao.android.dressup.common.view.mediabrowser.MediaBrowserViewPager;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.afi;
import tb.at4;
import tb.ckf;
import tb.fwa;
import tb.mqu;
import tb.qpu;
import tb.r6o;
import tb.rx7;
import tb.sol;
import tb.t2o;
import tb.tpu;
import tb.vjc;
import tb.wh6;
import tb.xhv;
import tb.ybi;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/dressup/common/component/mediabrowser/MediaBrowserComponent;", "Ltb/fwa;", "Lcom/taobao/android/dressup/common/model/MediaBrowserModel;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MediaBrowserComponent extends fwa<MediaBrowserModel, FrameLayout> implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "MediaBrowserComponent";
    public MediaBrowserAdapter e;
    public ViewPager f;
    public IndicatorView g;
    public TextView h;
    public Runnable j;
    public ObjectAnimator k;
    public View m;
    public final Handler i = new Handler(Looper.getMainLooper());
    public int l = -1;
    public final ybi n = new ybi(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552639);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MediaBrowserComponent.s(MediaBrowserComponent.this);
            }
        }
    }

    static {
        t2o.a(918552638);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaBrowserComponent(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(MediaBrowserComponent mediaBrowserComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate(objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 916714806:
                super.updateDataImpl(objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/mediabrowser/MediaBrowserComponent");
        }
    }

    public static final /* synthetic */ void s(MediaBrowserComponent mediaBrowserComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad86cd03", new Object[]{mediaBrowserComponent});
        } else {
            mediaBrowserComponent.F();
        }
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            return viewPager.getCurrentItem();
        }
        return 0;
    }

    public final TextView C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("23fe5cbd", new Object[]{this});
        }
        return this.h;
    }

    public final ybi D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ybi) ipChange.ipc$dispatch("1f0475c5", new Object[]{this});
        }
        return this.n;
    }

    public final ViewPager E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        return this.f;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83899068", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        TextView textView = this.h;
        if (textView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", textView.getAlpha(), 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            xhv xhvVar = xhv.INSTANCE;
            this.k = ofFloat;
        }
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2f676c", new Object[]{this})).booleanValue();
        }
        return this instanceof ZoomMediaBrowserComponent;
    }

    /* renamed from: H */
    public void onCreate(MediaBrowserModel mediaBrowserModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebdd07", new Object[]{this, mediaBrowserModel, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onCreate(mediaBrowserModel, iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "onCreate data:" + mediaBrowserModel + " triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        MediaBrowserAdapter mediaBrowserAdapter = new MediaBrowserAdapter(this, o().getContext());
        this.e = mediaBrowserAdapter;
        mediaBrowserAdapter.B(mediaBrowserModel);
    }

    public final void I(int i, afi afiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb5cf6", new Object[]{this, new Integer(i), afiVar});
            return;
        }
        ckf.g(afiVar, "model");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "onItemClick position:" + i + " model:" + afiVar, null, 4, null);
        K();
    }

    public final void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297fb92a", new Object[]{this, new Integer(i)});
        } else if (this.l == -1) {
            this.l = i;
        }
    }

    public final void L(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, z);
        }
    }

    public final void M(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5573048f", new Object[]{this, textView});
        } else {
            this.h = textView;
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6dd2fe", new Object[]{this});
        } else if (!G()) {
            ObjectAnimator objectAnimator = this.k;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            Runnable runnable = this.j;
            if (runnable != null) {
                this.i.removeCallbacks(runnable);
            }
            TextView textView = this.h;
            if (textView != null && textView.getAlpha() < 1.0f) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", textView.getAlpha(), 1.0f);
                ofFloat.setDuration(100L);
                ofFloat.start();
                xhv xhvVar = xhv.INSTANCE;
                this.k = ofFloat;
            }
            b bVar = new b();
            this.i.postDelayed(bVar, 3000L);
            xhv xhvVar2 = xhv.INSTANCE;
            this.j = bVar;
        }
    }

    /* renamed from: O */
    public void updateDataImpl(MediaBrowserModel mediaBrowserModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e670421c", new Object[]{this, mediaBrowserModel});
            return;
        }
        ckf.g(mediaBrowserModel, "data");
        super.updateDataImpl(mediaBrowserModel);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "updateDataImpl data:" + mediaBrowserModel, null, 4, null);
        MediaBrowserAdapter mediaBrowserAdapter = this.e;
        if (mediaBrowserAdapter != null) {
            mediaBrowserAdapter.B(mediaBrowserModel);
            ViewPager y = y();
            if (y != null) {
                if (y.getParent() == null) {
                    VIEW view = getView();
                    ckf.d(view);
                    t((FrameLayout) view, y);
                }
                ViewGroup.LayoutParams layoutParams = y.getLayoutParams();
                if (!(layoutParams == null || layoutParams.height == v())) {
                    layoutParams.height = v();
                    y.setLayoutParams(layoutParams);
                }
            }
            IndicatorView w = w();
            if (w != null && w.getParent() == null) {
                VIEW view2 = getView();
                ckf.d(view2);
                ((FrameLayout) view2).addView(w);
            }
            TextView x = x();
            if (x != null && x.getParent() == null) {
                VIEW view3 = getView();
                ckf.d(view3);
                ((FrameLayout) view3).addView(x);
                return;
            }
            return;
        }
        ckf.y("adapter");
        throw null;
    }

    public final void P(int i) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb9eeb5", new Object[]{this, new Integer(i)});
            return;
        }
        MediaBrowserAdapter mediaBrowserAdapter = this.e;
        if (mediaBrowserAdapter != null) {
            List<afi> data = mediaBrowserAdapter.getData();
            if (data != null && !data.isEmpty() && (textView = this.h) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i + 1);
                sb.append(wh6.DIR);
                sb.append(data.size());
                textView.setText(sb.toString());
                return;
            }
            return;
        }
        ckf.y("adapter");
        throw null;
    }

    @Override // tb.fwa
    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        return "mediaBrowser";
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        if (this.f != null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                mediaBrowserAdapter.r();
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
        Runnable runnable = this.j;
        if (runnable != null) {
            this.i.removeCallbacks(runnable);
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "onPageSelected position:" + i, null, 4, null);
        IndicatorView indicatorView = this.g;
        if (indicatorView != null) {
            indicatorView.setIndex(i);
        }
        P(i);
        N();
        int i2 = this.l;
        if (i2 != -1) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                mediaBrowserAdapter.u(i2);
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
        MediaBrowserAdapter mediaBrowserAdapter2 = this.e;
        if (mediaBrowserAdapter2 != null) {
            mediaBrowserAdapter2.s(i);
            this.l = i;
            return;
        }
        ckf.y("adapter");
        throw null;
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "onPause triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                mediaBrowserAdapter.u(viewPager.getCurrentItem());
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
    }

    @Override // tb.fwa, com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onResume(iComponentLifecycle$TriggerType);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "onResume triggerType:" + iComponentLifecycle$TriggerType, null, 4, null);
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                mediaBrowserAdapter.s(viewPager.getCurrentItem());
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
    }

    public final void t(FrameLayout frameLayout, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc9874", new Object[]{this, frameLayout, viewPager});
            return;
        }
        frameLayout.addView(viewPager, new FrameLayout.LayoutParams(-1, v()));
        View view = this.m;
        if (view != null) {
            frameLayout.removeView(view);
        }
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("751beb99", new Object[]{this})).intValue();
        }
        MediaBrowserAdapter mediaBrowserAdapter = this.e;
        if (mediaBrowserAdapter != null) {
            List<afi> data = mediaBrowserAdapter.getData();
            if (data == null || data.isEmpty()) {
                tpu.a.b(tpu.Companion, TAG, "calculateViewPagerHeight height: WRAP_CONTENT", null, 4, null);
                return -2;
            }
            int displayHeight = data.get(0).getDisplayHeight();
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "calculateViewPagerHeight height:" + displayHeight, null, 4, null);
            return displayHeight;
        }
        ckf.y("adapter");
        throw null;
    }

    public IndicatorView w() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndicatorView) ipChange.ipc$dispatch("b209d4bb", new Object[]{this});
        }
        if (this.g == null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                List<afi> data = mediaBrowserAdapter.getData();
                if (data != null) {
                    i = data.size();
                }
                if (i > 1) {
                    tpu.a.b(tpu.Companion, TAG, "createIndicatorIfNeeded", null, 4, null);
                    IndicatorView indicatorView = new IndicatorView(getContext());
                    at4.a aVar = at4.Companion;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, at4.a.c(aVar, getContext(), 15, false, 4, null));
                    layoutParams.gravity = 81;
                    layoutParams.bottomMargin = at4.a.c(aVar, getContext(), 20, false, 4, null);
                    xhv xhvVar = xhv.INSTANCE;
                    indicatorView.setLayoutParams(layoutParams);
                    MediaBrowserAdapter mediaBrowserAdapter2 = this.e;
                    if (mediaBrowserAdapter2 != null) {
                        List<afi> data2 = mediaBrowserAdapter2.getData();
                        ckf.d(data2);
                        indicatorView.setTotal(data2.size());
                        int c = at4.a.c(aVar, getContext(), 5, false, 4, null);
                        indicatorView.setBorderWidth(0.0f);
                        indicatorView.setRadius(c);
                        indicatorView.setGapMargin(at4.a.c(aVar, getContext(), 10, false, 4, null));
                        indicatorView.setUnfocusColor(Color.parseColor("#F2F0F0F0"));
                        indicatorView.setFocusColor(Color.parseColor("#B8A4FF"));
                        indicatorView.setNewControlParams(true, 5, 0.6f);
                        this.g = indicatorView;
                    } else {
                        ckf.y("adapter");
                        throw null;
                    }
                }
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
        return this.g;
    }

    public TextView x() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ce217be3", new Object[]{this});
        }
        if (this.h == null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                List<afi> data = mediaBrowserAdapter.getData();
                if (data != null) {
                    i = data.size();
                } else {
                    i = 0;
                }
                if (i > 1) {
                    tpu.a.b(tpu.Companion, TAG, "createPageIndexIndicator", null, 4, null);
                    TextView textView = new TextView(getContext());
                    textView.setTextColor(-1);
                    at4.a aVar = at4.Companion;
                    textView.setTextSize(0, at4.a.c(aVar, getContext(), 24, false, 4, null));
                    textView.setGravity(17);
                    textView.setTypeface(null, 1);
                    textView.setBackgroundDrawable(rx7.Companion.a(Color.parseColor("#8011192d"), 0, 0, at4.a.c(aVar, getContext(), 8, false, 4, null)));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(at4.a.c(aVar, getContext(), 66, false, 4, null), at4.a.c(aVar, getContext(), 40, false, 4, null));
                    layoutParams.gravity = 53;
                    layoutParams.topMargin = at4.a.c(aVar, getContext(), 24, false, 4, null);
                    layoutParams.rightMargin = at4.a.c(aVar, getContext(), 24, false, 4, null);
                    textView.setLayoutParams(layoutParams);
                    this.h = textView;
                    P(0);
                    N();
                }
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
        return this.h;
    }

    public final ViewPager y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("c46f6dc2", new Object[]{this});
        }
        if (this.f == null) {
            MediaBrowserAdapter mediaBrowserAdapter = this.e;
            if (mediaBrowserAdapter != null) {
                List<afi> data = mediaBrowserAdapter.getData();
                if (data != null && (!data.isEmpty())) {
                    tpu.a.b(tpu.Companion, TAG, "createViewPagerIfNeeded", null, 4, null);
                    MediaBrowserViewPager mediaBrowserViewPager = new MediaBrowserViewPager(getContext());
                    mediaBrowserViewPager.setOffscreenPageLimit(2);
                    MediaBrowserAdapter mediaBrowserAdapter2 = this.e;
                    if (mediaBrowserAdapter2 != null) {
                        mediaBrowserViewPager.setAdapter(mediaBrowserAdapter2);
                        mediaBrowserViewPager.setLayoutParams(new FrameLayout.LayoutParams(-1, v()));
                        mediaBrowserViewPager.addOnPageChangeListener(this);
                        this.f = mediaBrowserViewPager;
                    } else {
                        ckf.y("adapter");
                        throw null;
                    }
                }
            } else {
                ckf.y("adapter");
                throw null;
            }
        }
        return this.f;
    }

    public final MediaBrowserAdapter z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaBrowserAdapter) ipChange.ipc$dispatch("c88e7d3f", new Object[]{this});
        }
        MediaBrowserAdapter mediaBrowserAdapter = this.e;
        if (mediaBrowserAdapter != null) {
            return mediaBrowserAdapter;
        }
        ckf.y("adapter");
        throw null;
    }

    public final void K() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b57d003", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, TAG, "openZoomMediaBrowserComponent", null, 4, null);
        ZoomMediaBrowserComponent zoomMediaBrowserComponent = new ZoomMediaBrowserComponent(o(), this);
        MediaBrowserAdapter mediaBrowserAdapter = this.e;
        if (mediaBrowserAdapter != null) {
            List<afi> data = mediaBrowserAdapter.getData();
            if (data != null) {
                ViewPager viewPager = this.f;
                if (viewPager != null) {
                    i = viewPager.getCurrentItem();
                }
                MediaBrowserModel mediaBrowserModel = new MediaBrowserModel();
                mediaBrowserModel.setList(data);
                zoomMediaBrowserComponent.onCreate(mediaBrowserModel, IComponentLifecycle$TriggerType.UNSPECIFIED);
                zoomMediaBrowserComponent.createView();
                ViewPager E = zoomMediaBrowserComponent.E();
                if (E != null) {
                    E.setCurrentItem(i);
                }
                ((vjc) o().getService(vjc.class)).I().k(zoomMediaBrowserComponent);
                MediaBrowserAdapter mediaBrowserAdapter2 = this.e;
                if (mediaBrowserAdapter2 != null) {
                    View m = mediaBrowserAdapter2.m(i);
                    ArrayList arrayList = new ArrayList();
                    if (m != null) {
                        arrayList.add(new Pair(m, m.getTransitionName()));
                    }
                    sol.Companion.y(this.n, zoomMediaBrowserComponent.D(), arrayList);
                    MediaBrowserAdapter mediaBrowserAdapter3 = this.e;
                    if (mediaBrowserAdapter3 != null) {
                        mediaBrowserAdapter3.d(i, 0L);
                    } else {
                        ckf.y("adapter");
                        throw null;
                    }
                } else {
                    ckf.y("adapter");
                    throw null;
                }
            }
        } else {
            ckf.y("adapter");
            throw null;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewPager y = y();
        if (y != null) {
            t(frameLayout, y);
        }
        IndicatorView w = w();
        if (w != null && w.getParent() == null) {
            frameLayout.addView(w);
        }
        TextView x = x();
        if (x != null && x.getParent() == null) {
            frameLayout.addView(x);
        }
        if (y == null) {
            View view = new View(getContext());
            this.m = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, u()));
            frameLayout.addView(this.m);
        }
        return frameLayout;
    }

    public final int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e698644e", new Object[]{this})).intValue();
        }
        float c = mqu.Companion.c(o().a().o("prePicRatio"), 0.0f);
        if (c > 0) {
            return (int) (r6o.Companion.h(getContext()) / c);
        }
        return -2;
    }
}
