package com.taobao.uikit.extend.feature.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.features.ImageLoadFeature;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.feature.view.TImageView;
import com.taobao.uikit.utils.UIKITLog;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cy0;
import tb.dtl;
import tb.s8d;
import tb.t9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TUrlImageView extends TImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "Phenix.UIKitImage";
    private static Application.ActivityLifecycleCallbacks sActivityCallbacks;
    private static boolean sAutoSizeSkippedGlobally;
    private static FinalUrlInspector sGlobalFinalUrlInspector;
    public static boolean sIsSpeed;
    public static boolean sTemporaryDrawableGetting;
    private static Map<Integer, LinkedHashMap<Integer, WeakReference<TUrlImageView>>> sViewGroupByActivity = new ConcurrentHashMap();
    private boolean mDoNotLayout;
    private ImageLoadFeature mImageLoad;
    private boolean mKeepImageIfShownInLastScreen;
    private boolean mOutWindowVisibilityChangedReally;
    private boolean mShouldRecoverOnNextVisible;
    private boolean mEnableLayoutOptimize = false;
    public boolean mEnableAutoRelease = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface FinalUrlInspector {
        String inspectFinalUrl(String str, int i, int i2);
    }

    public TUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initImageLoad(context, attributeSet, i);
    }

    public static /* synthetic */ void access$000(Activity activity, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad8942b", new Object[]{activity, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            onActivityStateChanged(activity, z, z2, z3);
        }
    }

    public static FinalUrlInspector getGlobalFinalUrlInspector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinalUrlInspector) ipChange.ipc$dispatch("15341616", new Object[0]);
        }
        return sGlobalFinalUrlInspector;
    }

    private void initImageLoad(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be69e9c5", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        ImageLoadFeature imageLoadFeature = new ImageLoadFeature();
        this.mImageLoad = imageLoadFeature;
        boolean[] zArr = {true};
        imageLoadFeature.constructor(context, attributeSet, i, zArr);
        this.mEnableAutoRelease = zArr[0];
        addFeature(this.mImageLoad);
    }

    public static /* synthetic */ Object ipc$super(TUrlImageView tUrlImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -1142475969:
                return super.getDrawable();
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 327977732:
                super.dispatchWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/view/TUrlImageView");
        }
    }

    public static boolean isAutoSizeSkippedGlobally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9079a851", new Object[0])).booleanValue();
        }
        return sAutoSizeSkippedGlobally;
    }

    private static void onActivityStateChanged(Activity activity, boolean z, boolean z2, boolean z3) {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea428aa", new Object[]{activity, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        int hashCode = activity.hashCode();
        LinkedHashMap<Integer, WeakReference<TUrlImageView>> linkedHashMap = sViewGroupByActivity.get(Integer.valueOf(hashCode));
        if (linkedHashMap != null) {
            for (Map.Entry<Integer, WeakReference<TUrlImageView>> entry : linkedHashMap.entrySet()) {
                WeakReference<TUrlImageView> value = entry.getValue();
                if (!(value == null || (tUrlImageView = value.get()) == null || !z3)) {
                    tUrlImageView.onDestroyed();
                }
            }
            if (z3) {
                sViewGroupByActivity.remove(Integer.valueOf(hashCode));
            }
        }
    }

    private void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
        } else {
            this.mImageLoad.setHost((ImageView) null);
        }
    }

    private void putThisIntoViewGroup() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493b0514", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            num = Integer.valueOf(context.hashCode());
        } else {
            View rootView = getRootView();
            if (rootView == null || !(rootView.getContext() instanceof Activity)) {
                num = null;
            } else {
                num = Integer.valueOf(rootView.getContext().hashCode());
            }
        }
        if (num != null) {
            Integer valueOf = Integer.valueOf(hashCode());
            LinkedHashMap<Integer, WeakReference<TUrlImageView>> linkedHashMap = sViewGroupByActivity.get(num);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(0, 0.75f, true);
                sViewGroupByActivity.put(num, linkedHashMap);
            }
            if (linkedHashMap.isEmpty() || linkedHashMap.get(valueOf) == null) {
                linkedHashMap.put(valueOf, new WeakReference<>(this));
            }
        }
    }

    private Drawable realDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("890e27c9", new Object[]{this, new Boolean(z)});
        }
        Drawable drawable = super.getDrawable();
        if (drawable instanceof DrawableProxy) {
            return ((DrawableProxy) drawable).getRealDrawable(z);
        }
        return drawable;
    }

    private synchronized void recoverImageIfPossible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c942e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mShouldRecoverOnNextVisible && getWindowToken() != null) {
            this.mShouldRecoverOnNextVisible = false;
            if (!z || (getWidth() >= 100 && getHeight() >= 100)) {
                Drawable drawable = super.getDrawable();
                if (drawable instanceof DrawableProxy) {
                    ((DrawableProxy) drawable).recover();
                }
            }
        }
    }

    private synchronized void releaseImageIfPossible() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e661e9", new Object[]{this});
                return;
            }
            if (this.mEnableAutoRelease && !this.mShouldRecoverOnNextVisible) {
                Drawable drawable = super.getDrawable();
                if ((drawable instanceof DrawableProxy) && ((DrawableProxy) drawable).release()) {
                    z = true;
                }
                this.mShouldRecoverOnNextVisible = z;
            }
        }
    }

    private void releaseImageWhenInvisible(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b76e66", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z2 || (z && !this.mKeepImageIfShownInLastScreen)) {
            releaseImageIfPossible();
        }
    }

    public static void setGlobalFinalUrlInspector(FinalUrlInspector finalUrlInspector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486b08cc", new Object[]{finalUrlInspector});
        } else {
            sGlobalFinalUrlInspector = finalUrlInspector;
        }
    }

    public static void skipAutoSizeGlobally(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b221200e", new Object[]{new Boolean(z)});
        } else {
            sAutoSizeSkippedGlobally = z;
        }
    }

    public void async(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa78ea31", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.realAsync(z);
        }
    }

    public void asyncSetImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec7c38b", new Object[]{this, str});
            return;
        }
        this.mImageLoad.setImageUrl(str, null, true, false, null);
        this.mEnableLayoutOptimize = true;
    }

    @Override // android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            return;
        }
        this.mOutWindowVisibilityChangedReally = true;
        super.dispatchWindowVisibilityChanged(i);
        this.mOutWindowVisibilityChangedReally = false;
    }

    public void enableLoadOnFling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f2fe39", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.enableLoadOnFling(z);
        }
    }

    public void enableSizeInLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371a2674", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.enableSizeInLayoutParams(z);
        }
    }

    public ImageLoadFeature failListener(s8d<FailPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("cf3535f4", new Object[]{this, s8dVar});
        }
        return this.mImageLoad.failListener(s8dVar);
    }

    @Override // android.widget.ImageView
    public Drawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
        }
        return realDrawable(sTemporaryDrawableGetting);
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        ImageLoadFeature imageLoadFeature = this.mImageLoad;
        if (imageLoadFeature == null) {
            return null;
        }
        return imageLoadFeature.getImageUrl();
    }

    public String getLoadingUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8098410", new Object[]{this});
        }
        ImageLoadFeature imageLoadFeature = this.mImageLoad;
        if (imageLoadFeature == null) {
            return null;
        }
        return imageLoadFeature.getLoadingUrl();
    }

    @Deprecated
    public ImageLoadFeature getmImageLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("972c3349", new Object[]{this});
        }
        return this.mImageLoad;
    }

    public boolean isDrawableSameWith(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815bb283", new Object[]{this, drawable})).booleanValue();
        }
        if (realDrawable(true) == drawable) {
            return true;
        }
        return false;
    }

    public boolean isViewBitmapDifferentWith(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a347d6ea", new Object[]{this, bitmap})).booleanValue();
        }
        Drawable realDrawable = realDrawable(true);
        if (!(realDrawable instanceof BitmapDrawable) || ((BitmapDrawable) realDrawable).getBitmap() == bitmap) {
            return false;
        }
        return true;
    }

    public void keepBackgroundOnForegroundUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26be9e0f", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.keepBackgroundOnForegroundUpdate(z);
        }
    }

    public void keepImageIfShownInLastScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4006948", new Object[]{this, new Boolean(z)});
        } else {
            this.mKeepImageIfShownInLastScreen = z;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        putThisIntoViewGroup();
        recoverImageIfPossible(false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseImageIfPossible();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        releaseImageIfPossible();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (view != this) {
            return;
        }
        if (i == 0) {
            recoverImageIfPossible(false);
        } else if (i == 4 || i == 8) {
            if (getWindowVisibility() != 0) {
                z = true;
            }
            releaseImageWhenInvisible(z, true);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mImageLoad.pause();
        }
    }

    public void preRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10090cb4", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.preRender(z);
        }
    }

    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            this.mImageLoad.reload(false);
        }
    }

    @Override // android.view.View
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (this.mDoNotLayout) {
            this.mDoNotLayout = false;
        } else {
            super.requestLayout();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.mImageLoad.resume();
        }
    }

    public t9o retrieveImageData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("a6643c16", new Object[]{this});
        }
        ImageLoadFeature imageLoadFeature = this.mImageLoad;
        if (imageLoadFeature != null) {
            return imageLoadFeature.retrieveImageData();
        }
        return null;
    }

    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAutoRelease = z;
        }
    }

    public void setEnableLayoutOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa902a1", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableLayoutOptimize = z;
        }
    }

    public void setErrorImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4358a676", new Object[]{this, new Integer(i)});
        } else {
            this.mImageLoad.setErrorImageResId(i);
        }
    }

    public void setFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8994a", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.setFadeIn(z);
        }
    }

    public void setFinalUrlInspector(FinalUrlInspector finalUrlInspector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e9e0ef", new Object[]{this, finalUrlInspector});
        } else {
            this.mImageLoad.setFinalUrlInspector(finalUrlInspector);
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = super.getDrawable();
        ImageLoadFeature imageLoadFeature = this.mImageLoad;
        if (imageLoadFeature != null) {
            if (drawable == null) {
                if (drawable2 != null) {
                    imageLoadFeature.resetState();
                }
            } else if ((drawable instanceof dtl) && !(drawable instanceof cy0)) {
                drawable = DrawableProxy.obtain((dtl) drawable).bindHostView(this);
                if (!this.mEnableLayoutOptimize || getLayoutParams() == null || getLayoutParams().height == -2 || getLayoutParams().width == -2) {
                    z = false;
                }
                this.mDoNotLayout = z;
            }
        }
        super.setImageDrawable(drawable);
        if (drawable2 != drawable) {
            this.mShouldRecoverOnNextVisible = false;
            if (drawable2 instanceof DrawableProxy) {
                DrawableProxy drawableProxy = (DrawableProxy) drawable2;
                if (drawableProxy.isContentDifferent(drawable)) {
                    drawableProxy.release();
                }
            }
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.mImageLoad.setImageUrl(str, null, false, false, null);
        }
    }

    public void setPhenixOptions(PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61067f8", new Object[]{this, phenixOptions});
        } else {
            this.mImageLoad.setPhenixOptions(phenixOptions);
        }
    }

    public void setPlaceHoldForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3dddb2", new Object[]{this, drawable});
        } else {
            this.mImageLoad.setPlaceHoldForeground(drawable);
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
        } else {
            this.mImageLoad.setPlaceHoldImageResId(i);
        }
    }

    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
        } else {
            this.mImageLoad.setPriorityModuleName(str);
        }
    }

    public void setSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6b77c6", new Object[]{this, str});
        } else {
            this.mImageLoad.setSceneName(str);
        }
    }

    public void setSkipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683ef35c", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.skipAutoSize(z);
        }
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
        } else {
            this.mImageLoad.setStrategyConfig(obj);
        }
    }

    public void setWhenNullClearImg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206d9914", new Object[]{this, new Boolean(z)});
        } else {
            this.mImageLoad.setWhenNullClearImg(z);
        }
    }

    public void simplifyLoadPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a9e8db", new Object[]{this});
        } else {
            this.mImageLoad.simplifyLoadPath();
        }
    }

    public ImageLoadFeature succListener(s8d<SuccPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("42fdbf18", new Object[]{this, s8dVar});
        }
        return this.mImageLoad.succListener(s8dVar);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        recoverImageIfPossible(false);
    }

    public void setImageUrl(String str, PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfcfba6c", new Object[]{this, str, phenixOptions});
        } else {
            this.mImageLoad.setImageUrl(str, null, false, false, phenixOptions);
        }
    }

    public static void registerActivityCallback(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1854a261", new Object[]{application});
            return;
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.uikit.extend.feature.view.TUrlImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                } else {
                    TUrlImageView.access$000(activity, false, false, true);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                }
            }
        };
        sActivityCallbacks = activityLifecycleCallbacks;
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        UIKITLog.i(LOG_TAG, "register activity callback for cancelling on destroyed, app=%s", application);
    }

    public static void unregisterActivityCallback(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b00168", new Object[]{application});
            return;
        }
        application.unregisterActivityLifecycleCallbacks(sActivityCallbacks);
        UIKITLog.i(LOG_TAG, "unregister activity callback for cancelling on destroyed, app=%s", application);
    }

    public void asyncSetImageUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c54095", new Object[]{this, str, str2});
        } else {
            this.mImageLoad.setImageUrl(str, str2, true, false, null);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (!this.mOutWindowVisibilityChangedReally) {
            return;
        }
        if (i == 0) {
            recoverImageIfPossible(true);
        } else if (i == 4 || i == 8) {
            if (getVisibility() != 0) {
                z = true;
            }
            releaseImageWhenInvisible(true, z);
        }
    }

    public void setImageUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb674b1", new Object[]{this, str, str2});
        } else {
            this.mImageLoad.setImageUrl(str, str2, false, false, null);
        }
    }

    public void asyncSetImageUrl(String str, PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44a7b50", new Object[]{this, str, phenixOptions});
            return;
        }
        this.mImageLoad.setImageUrl(str, null, true, false, phenixOptions);
        this.mEnableLayoutOptimize = true;
    }

    public void setImageUrl(String str, String str2, PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6b8276", new Object[]{this, str, str2, phenixOptions});
        } else {
            this.mImageLoad.setImageUrl(str, str2, false, false, phenixOptions);
        }
    }

    public TUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initImageLoad(context, attributeSet, 0);
    }

    public TUrlImageView(Context context) {
        super(context);
        initImageLoad(context, null, 0);
    }
}
