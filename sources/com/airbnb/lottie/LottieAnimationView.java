package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.taobao.taobao.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import tb.ayl;
import tb.dmh;
import tb.dxp;
import tb.e4g;
import tb.fmh;
import tb.fxv;
import tb.iu9;
import tb.kkh;
import tb.nlh;
import tb.oie;
import tb.plh;
import tb.ukh;
import tb.ulh;
import tb.vkt;
import tb.vxp;
import tb.ylh;
import tb.zhh;
import tb.zlh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final plh<Throwable> DEFAULT_FAILURE_LISTENER = new plh() { // from class: tb.ikh
        @Override // tb.plh
        public final void onResult(Object obj) {
            LottieAnimationView.lambda$static$0((Throwable) obj);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private kkh composition;
    private dmh<kkh> compositionTask;
    private plh<Throwable> failureListener;
    private final plh<kkh> loadedListener = new plh() { // from class: tb.gkh
        @Override // tb.plh
        public final void onResult(Object obj) {
            LottieAnimationView.this.setComposition((kkh) obj);
        }
    };
    private final plh<Throwable> wrappedFailureListener = new a();
    private int fallbackResource = 0;
    private final LottieDrawable lottieDrawable = new LottieDrawable();
    private boolean ignoreUnschedule = false;
    private boolean autoPlay = false;
    private boolean cacheComposition = true;
    private final Set<UserActionTaken> userActionsTaken = new HashSet();
    private final Set<ulh> lottieOnCompositionLoadedListeners = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() != 1 ? false : true;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements plh<Throwable> {
        public a() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends fmh<T> {
        public b(LottieAnimationView lottieAnimationView, vxp vxpVar) {
        }

        @Override // tb.fmh
        public T a(nlh<T> nlhVar) {
            throw null;
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        init(null, R.attr.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        dmh<kkh> dmhVar = this.compositionTask;
        if (dmhVar != null) {
            dmhVar.j(this.loadedListener);
            this.compositionTask.i(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.y();
    }

    private dmh<kkh> fromAssets(final String str) {
        if (isInEditMode()) {
            return new dmh<>(new Callable() { // from class: tb.hkh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zlh lambda$fromAssets$2;
                    lambda$fromAssets$2 = LottieAnimationView.this.lambda$fromAssets$2(str);
                    return lambda$fromAssets$2;
                }
            }, true);
        }
        if (this.cacheComposition) {
            return ukh.k(getContext(), str);
        }
        return ukh.l(getContext(), str, null);
    }

    private dmh<kkh> fromRawRes(final int i) {
        if (isInEditMode()) {
            return new dmh<>(new Callable() { // from class: tb.jkh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zlh lambda$fromRawRes$1;
                    lambda$fromRawRes$1 = LottieAnimationView.this.lambda$fromRawRes$1(i);
                    return lambda$fromRawRes$1;
                }
            }, true);
        }
        if (this.cacheComposition) {
            return ukh.t(getContext(), i);
        }
        return ukh.u(getContext(), i, null);
    }

    private void init(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = R.styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            zhh.b("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue) {
            int resourceId2 = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId2 != 0) {
                setAnimation(resourceId2);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.i1(-1);
        }
        int i5 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = R.styleable.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = R.styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i9 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i9)) {
            addValueCallback(new e4g("**"), (e4g) ylh.COLOR_FILTER, (fmh<e4g>) new fmh(new dxp(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i9, -1)).getDefaultColor())));
        }
        int i10 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i10)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i11 = obtainStyledAttributes.getInt(i10, renderMode.ordinal());
            if (i11 >= RenderMode.values().length) {
                i11 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i11]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        obtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (fxv.f(getContext()) != 0.0f) {
            z = true;
        }
        lottieDrawable.m1(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zlh lambda$fromAssets$2(String str) throws Exception {
        if (this.cacheComposition) {
            return ukh.m(getContext(), str);
        }
        return ukh.n(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zlh lambda$fromRawRes$1(int i) throws Exception {
        if (this.cacheComposition) {
            return ukh.v(getContext(), i);
        }
        return ukh.w(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Throwable th) {
        if (fxv.k(th)) {
            zhh.c("Unable to load composition.", th);
        } else {
            zhh.c("Unable to parse composition.", th);
        }
    }

    private void setCompositionTask(dmh<kkh> dmhVar) {
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        dmhVar.d(this.loadedListener);
        dmhVar.c(this.wrappedFailureListener);
        this.compositionTask = dmhVar;
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.I0();
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.r(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.s(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.t(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(ulh ulhVar) {
        kkh kkhVar = this.composition;
        if (kkhVar != null) {
            ulhVar.onCompositionLoaded(kkhVar);
        }
        return this.lottieOnCompositionLoadedListeners.add(ulhVar);
    }

    public <T> void addValueCallback(e4g e4gVar, T t, fmh<T> fmhVar) {
        this.lottieDrawable.u(e4gVar, t, fmhVar);
    }

    public void cancelAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.x();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.C();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.E(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.K();
    }

    public kkh getComposition() {
        return this.composition;
    }

    public long getDuration() {
        kkh kkhVar = this.composition;
        if (kkhVar != null) {
            return kkhVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.O();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.Q();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.S();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.T();
    }

    public float getMinFrame() {
        return this.lottieDrawable.U();
    }

    public ayl getPerformanceTracker() {
        return this.lottieDrawable.V();
    }

    public float getProgress() {
        return this.lottieDrawable.W();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.X();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.Y();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.Z();
    }

    public float getSpeed() {
        return this.lottieDrawable.a0();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.d0();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.e0();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).X() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.g0();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.j0();
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable.i1(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.autoPlay) {
            this.lottieDrawable.A0();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgress(savedState.progress);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.repeatCount);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.W();
        savedState.isAnimating = this.lottieDrawable.h0();
        savedState.imageAssetsFolder = this.lottieDrawable.Q();
        savedState.repeatMode = this.lottieDrawable.Z();
        savedState.repeatCount = this.lottieDrawable.Y();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.z0();
    }

    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.A0();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.B0();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.C0();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.D0(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.E0(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(ulh ulhVar) {
        return this.lottieOnCompositionLoadedListeners.remove(ulhVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.F0(animatorUpdateListener);
    }

    public List<e4g> resolveKeyPath(e4g e4gVar) {
        return this.lottieDrawable.H0(e4gVar);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.I0();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.J0();
    }

    public void setAnimation(int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? ukh.x(getContext(), str) : ukh.y(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.L0(z);
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.lottieDrawable.M0(z);
    }

    public void setComposition(kkh kkhVar) {
        this.lottieDrawable.setCallback(this);
        this.composition = kkhVar;
        this.ignoreUnschedule = true;
        boolean N0 = this.lottieDrawable.N0(kkhVar);
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || N0) {
            if (!N0) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (ulh ulhVar : this.lottieOnCompositionLoadedListeners) {
                ulhVar.onCompositionLoaded(kkhVar);
            }
        }
    }

    public void setFailureListener(plh<Throwable> plhVar) {
        this.failureListener = plhVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(iu9 iu9Var) {
        this.lottieDrawable.O0(iu9Var);
    }

    public void setFrame(int i) {
        this.lottieDrawable.P0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.Q0(z);
    }

    public void setImageAssetDelegate(oie oieVar) {
        this.lottieDrawable.R0(oieVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.S0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.T0(z);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.U0(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.W0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.Y0(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.a1(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.b1(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.d1(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.lottieDrawable.e1(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.f1(z);
    }

    public void setProgress(float f) {
        this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        this.lottieDrawable.g1(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.h1(renderMode);
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.i1(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.j1(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.k1(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.l1(f);
    }

    public void setTextDelegate(vkt vktVar) {
        this.lottieDrawable.n1(vktVar);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.g0()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.g0()) {
                lottieDrawable2.z0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.o1(str, bitmap);
    }

    public <T> void addValueCallback(e4g e4gVar, T t, vxp<T> vxpVar) {
        this.lottieDrawable.u(e4gVar, t, new b(this, vxpVar));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.V0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.Z0(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.c1(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.X0(i, i2);
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(ukh.y(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(ukh.o(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
