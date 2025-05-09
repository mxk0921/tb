package com.taobao.android.home.component.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RatioFeature;
import java.lang.ref.WeakReference;
import tb.cy0;
import tb.fy0;
import tb.i2b;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_BG_COLOR = Color.parseColor("#F3F8FC");
    private a failListener;
    private d succListener;
    private boolean isImageLoaded = false;
    private boolean isImageFailed = false;
    public float oldRatio = -1.0f;
    public float newRatio = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<HImageView> f7922a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements fy0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HImageView f7923a;
            public final /* synthetic */ BitmapDrawable b;

            public a(c cVar, HImageView hImageView, BitmapDrawable bitmapDrawable) {
                this.f7923a = hImageView;
                this.b = bitmapDrawable;
            }

            @Override // tb.fy0
            public boolean onLoopCompleted(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (i == 0) {
                    if (HImageView.access$300(this.f7923a) != null) {
                        HImageView.access$300(this.f7923a).a();
                    }
                    ((cy0) this.b).A(null);
                }
                return true;
            }
        }

        static {
            t2o.a(473956408);
            t2o.a(620757101);
        }

        public c(HImageView hImageView) {
            this.f7922a = new WeakReference<>(hImageView);
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            HImageView hImageView = this.f7922a.get();
            if (hImageView == null) {
                return false;
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                if (HImageView.access$300(hImageView) != null) {
                    ((cy0) drawable).A(new a(this, hImageView, drawable));
                }
                HImageView.access$102(hImageView, true);
                AppMonitor.Alarm.commitSuccess("Page_Home", "HomeItemLoad");
                return false;
            } else if (succPhenixEvent.getDrawable() == null || succPhenixEvent.getDrawable().getBitmap() == null) {
                if (HImageView.access$200(hImageView) != null) {
                    HImageView.access$200(hImageView).b();
                }
                HImageView.access$002(hImageView, true);
                return false;
            } else {
                if (HImageView.access$300(hImageView) != null) {
                    HImageView.access$300(hImageView).a();
                }
                HImageView.access$102(hImageView, true);
                AppMonitor.Alarm.commitSuccess("Page_Home", "HomeItemLoad");
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a();
    }

    static {
        t2o.a(473956405);
    }

    public HImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ boolean access$002(HImageView hImageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba5cd423", new Object[]{hImageView, new Boolean(z)})).booleanValue();
        }
        hImageView.isImageFailed = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(HImageView hImageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb12a0e4", new Object[]{hImageView, new Boolean(z)})).booleanValue();
        }
        hImageView.isImageLoaded = z;
        return z;
    }

    public static /* synthetic */ a access$200(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6a7e048d", new Object[]{hImageView});
        }
        return hImageView.failListener;
    }

    public static /* synthetic */ d access$300(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9ba09aea", new Object[]{hImageView});
        }
        return hImageView.succListener;
    }

    public static /* synthetic */ Object ipc$super(HImageView hImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1899510901:
                super.asyncSetImageUrl((String) objArr[0]);
                return null;
            case -1414105935:
                super.setImageUrl((String) objArr[0], (String) objArr[1]);
                return null;
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -826210649:
                super.setImageUrl((String) objArr[0]);
                return null;
            case 29704341:
                super.asyncSetImageUrl((String) objArr[0], (String) objArr[1]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 713139031:
                super.setAutoRelease(((Boolean) objArr[0]).booleanValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/HImageView");
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView
    public void asyncSetImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec7c38b", new Object[]{this, str});
            return;
        }
        super.asyncSetImageUrl(str);
        this.isImageFailed = false;
        this.isImageLoaded = false;
    }

    public void bindEmptyImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59908b32", new Object[]{this});
        } else if (this.isImageFailed && !TextUtils.isEmpty(getImageUrl())) {
            reload();
        }
    }

    public boolean isImageLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3376b41", new Object[]{this})).booleanValue();
        }
        return this.isImageLoaded;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            bindEmptyImage();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else if (this.mEnableAutoRelease) {
            super.onDetachedFromWindow();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
        } else if (this.mEnableAutoRelease) {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View
    public void requestLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || ((((i = layoutParams.width) != -2 || layoutParams.height == -2) && (layoutParams.height != -2 || i == -2)) || this.newRatio <= 0.0f || TextUtils.isEmpty(getImageUrl()) || isDrawableSameWith(null) || this.oldRatio != this.newRatio)) {
            this.oldRatio = this.newRatio;
            super.requestLayout();
            return;
        }
        Log.e("home.HImageView", "requestlayout 拦截");
        invalidate();
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public void setAspectRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8d1e8", new Object[]{this, new Float(f)});
            return;
        }
        this.newRatio = f;
        RatioFeature ratioFeature = (RatioFeature) findFeature(RatioFeature.class);
        if (ratioFeature == null) {
            RatioFeature ratioFeature2 = new RatioFeature();
            ratioFeature2.setRatio(f);
            addFeature(ratioFeature2);
            return;
        }
        ratioFeature.setRatio(f);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
        } else {
            super.setAutoRelease(z);
        }
    }

    public void setFailListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8afc8e7", new Object[]{this, aVar});
        } else {
            this.failListener = aVar;
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else if (!isDrawableSameWith(drawable)) {
            super.setImageDrawable(drawable);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        super.setImageUrl(str);
        this.isImageFailed = false;
        this.isImageLoaded = false;
    }

    public void setSuccListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391a7467", new Object[]{this, dVar});
        } else {
            this.succListener = dVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<HImageView> f7921a;

        static {
            t2o.a(473956407);
            t2o.a(620757101);
        }

        public b(HImageView hImageView) {
            this.f7921a = new WeakReference<>(hImageView);
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            HImageView hImageView = this.f7921a.get();
            if (hImageView == null) {
                AppMonitor.Counter.commit("Page_Home", "ZuanZhanExplosureQuestion", "callbackFail@null", 1.0d);
                return false;
            }
            HImageView.access$002(hImageView, true);
            HImageView.access$102(hImageView, false);
            if (failPhenixEvent.getResultCode() == 404) {
                AppMonitor.Alarm.commitFail("Page_Home", "HomeItemLoad", "61000", "首页核心资源位加载失败");
            }
            if (HImageView.access$200(hImageView) != null) {
                HImageView.access$200(hImageView).b();
            }
            return false;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setStrategyConfig(i2b.IMAGE_STRATEGY_CONFIG);
        setPriorityModuleName("homepage-ads");
        setFadeIn(false);
        setWhenNullClearImg(false);
        setAutoRelease(false);
        setEnableLayoutOptimize(true);
        try {
            failListener(new b(this));
            succListener(new c(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView
    public void asyncSetImageUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c54095", new Object[]{this, str, str2});
            return;
        }
        super.asyncSetImageUrl(str, str2);
        this.isImageFailed = false;
        this.isImageLoaded = false;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView
    public void setImageUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb674b1", new Object[]{this, str, str2});
            return;
        }
        super.setImageUrl(str, str2);
        this.isImageFailed = false;
        this.isImageLoaded = false;
    }

    public HImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HImageView(Context context) {
        super(context);
        init();
    }
}
