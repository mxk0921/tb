package com.taobao.uikit.extend.feature.features;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.manager.HomeUrlCacheManager;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.utils.UIKITLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.czn;
import tb.dgr;
import tb.dgw;
import tb.dki;
import tb.drt;
import tb.dtl;
import tb.f2b;
import tb.itw;
import tb.jjo;
import tb.nd2;
import tb.p1m;
import tb.qkd;
import tb.s0m;
import tb.s8d;
import tb.sz8;
import tb.t9o;
import tb.us2;
import tb.uuo;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageLoadFeature extends AbsFeature<ImageView> implements LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int APM_UI_KEY = -308;
    private static final int L_SCROLLING = 1;
    private static final int L_SHOWING = 0;
    private static final int S_DONE_FAIL = 3;
    private static final int S_DONE_SUC = 2;
    private static final int S_INIT = 0;
    private static final int S_LOADING = 1;
    private static final int S_LOAD_IMMEDIATE = 4;
    private static final int S_NEED_REFRESH = 5;
    private static boolean isViewTokenValid;
    public ObjectAnimator mAlphaAnim;
    private String mCacheKey4PlaceHolder;
    private Context mContext;
    private boolean mEnableSizeInLayoutParams;
    private int mErrorImageId;
    public boolean mFadeIn;
    private volatile TUrlImageView.FinalUrlInspector mFinalUrlInspector;
    private PhenixOptions mGlobalPhenixOptions;
    private WeakReference<ImageView> mHostReference;
    private int mKeepBackgroundState;
    private int mLastMaxViewSize;
    private p1m mLastResTicket;
    private PhenixOptions mNextPhenixOptions;
    private Drawable mPlaceHoldForeground;
    public int mPlaceHoldResourceId;
    private String mPriorityModuleName;
    private volatile boolean mRealAsync;
    private volatile Boolean mSkipAutoSize;
    private ImageStrategyConfig mStrategyConfig;
    private volatile p1m mTicket;
    private volatile String mUrl;
    public s8d<FailPhenixEvent> mUserFailListener;
    public s8d<SuccPhenixEvent> mUserSuccListener;
    private boolean mNoRepeatOnError = true;
    public volatile int mLoadState = 0;
    private String mSceneName = "";
    private AtomicBoolean mPreRender = new AtomicBoolean(false);
    private int mScrollState = 0;
    public volatile String mLoadingUrl = "";
    private boolean mWhenNullClearImg = true;
    private boolean mEnabledLoadOnFling = true;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private ImageLoadSuccListener mSuccListener = new ImageLoadSuccListener();
    private ImageLoadFailListener mFailListener = new ImageLoadFailListener();
    private ImageRetryHandler mRetryHandler = new ImageRetryHandler();
    private boolean mUserCalledSetImageUrl = false;
    private AtomicBoolean mShouldAsync = new AtomicBoolean(false);
    private boolean mSimplifyLoadPath = s0m.B().N();
    private s8d<dki> mMemoryMissListener = new s8d<dki>() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean onHappen(dki dkiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72d3ebbb", new Object[]{this, dkiVar})).booleanValue();
            }
            int i = ImageLoadFeature.this.mLoadState;
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            ImageLoadFeature.access$100(imageLoadFeature, imageLoadFeature.getHost(), null, false, ImageLoadFeature.access$000(ImageLoadFeature.this));
            ImageLoadFeature.this.mLoadState = i;
            return false;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ImageLoadFailListener implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public PhenixCreator mCreator;

        public ImageLoadFailListener() {
        }

        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            UIKITLog.d(TUrlImageView.LOG_TAG, "load image failed, state=%d, url=%s", Integer.valueOf(ImageLoadFeature.this.mLoadState), ImageLoadFeature.access$600(ImageLoadFeature.this));
            int resultCode = failPhenixEvent.getResultCode();
            if (resultCode == -1 || resultCode == 404) {
                ImageLoadFeature.access$702(ImageLoadFeature.this, true);
            } else {
                ImageLoadFeature.access$702(ImageLoadFeature.this, false);
            }
            ImageView host = ImageLoadFeature.this.getHost();
            if (host != null) {
                host.setTag(ImageLoadFeature.APM_UI_KEY, "ERROR");
            }
            failPhenixEvent.getTicket().d(true);
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            ImageLoadFeature.access$100(imageLoadFeature, imageLoadFeature.getHost(), null, true, ImageLoadFeature.access$000(ImageLoadFeature.this));
            ImageLoadFeature.this.mLoadState = 3;
            s8d<FailPhenixEvent> s8dVar = ImageLoadFeature.this.mUserFailListener;
            if (s8dVar != null) {
                s8dVar.onHappen(failPhenixEvent);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("resultCode", String.valueOf(failPhenixEvent.getResultCode()));
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("oriUrl", ImageLoadFeature.access$600(ImageLoadFeature.this));
            dgr a2 = dgr.a();
            PhenixCreator phenixCreator = this.mCreator;
            a2.onError(phenixCreator != null ? String.valueOf(phenixCreator.id()) : "", failPhenixEvent.getUrl(), hashMap);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ImageLoadSuccListener implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean isInLayoutPass;
        public PhenixCreator mCreator;

        public ImageLoadSuccListener() {
        }

        public void setIsInLayoutPass(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89e5f601", new Object[]{this, new Boolean(z)});
            } else {
                this.isInLayoutPass = z;
            }
        }

        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue() : applyEvent(succPhenixEvent, succPhenixEvent.isImmediate());
        }

        public boolean applyEvent(final SuccPhenixEvent succPhenixEvent, boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c0d8001d", new Object[]{this, succPhenixEvent, new Boolean(z)})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            ImageView host = ImageLoadFeature.this.getHost();
            if (host != null) {
                host.setTag(ImageLoadFeature.APM_UI_KEY, "END");
            }
            if (ImageLoadFeature.access$800()) {
                ImageLoadFeature.access$900(ImageLoadFeature.this, dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
            }
            if (url == null || ImageLoadFeature.this.mLoadingUrl == null || url.startsWith(ImageLoadFeature.this.mLoadingUrl)) {
                final ImageView host2 = ImageLoadFeature.this.getHost();
                if (host2 == null) {
                    ImageLoadFeature.this.mLoadState = 3;
                    return false;
                } else if (!z || !this.isInLayoutPass) {
                    ImageLoadFeature.this.mLoadState = 3;
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable == null) {
                        ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
                        ImageLoadFeature.access$100(imageLoadFeature, host2, null, false, ImageLoadFeature.access$000(imageLoadFeature));
                        return true;
                    }
                    boolean isIntermediate = succPhenixEvent.isIntermediate();
                    ImageLoadFeature imageLoadFeature2 = ImageLoadFeature.this;
                    boolean z2 = imageLoadFeature2.mFadeIn;
                    if (ImageLoadFeature.access$1000(imageLoadFeature2, host2, drawable.getBitmap())) {
                        z2 = false;
                    }
                    if (z || isIntermediate || !z2 || ImageLoadFeature.this.mLoadState == 2) {
                        ImageLoadFeature imageLoadFeature3 = ImageLoadFeature.this;
                        ImageLoadFeature.access$100(imageLoadFeature3, host2, drawable, false, ImageLoadFeature.access$000(imageLoadFeature3));
                    } else {
                        host2.setImageDrawable(drawable);
                        ImageLoadFeature imageLoadFeature4 = ImageLoadFeature.this;
                        ObjectAnimator objectAnimator = imageLoadFeature4.mAlphaAnim;
                        if (objectAnimator == null) {
                            imageLoadFeature4.mAlphaAnim = ObjectAnimator.ofInt(host2, "alpha", 0, 255);
                            ImageLoadFeature.this.mAlphaAnim.setInterpolator(new AccelerateInterpolator());
                            ImageLoadFeature.this.mAlphaAnim.setDuration(300L);
                            ImageLoadFeature.this.mAlphaAnim.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.ImageLoadSuccListener.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                                    str2.hashCode();
                                    int hashCode = str2.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/features/ImageLoadFeature$ImageLoadSuccListener$2");
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                    } else if (ImageLoadFeature.access$1100(ImageLoadFeature.this) < 0 || (ImageLoadFeature.access$1100(ImageLoadFeature.this) == 0 && ImageLoadFeature.this.mPlaceHoldResourceId != 0)) {
                                        host2.setBackgroundDrawable(null);
                                    }
                                }
                            });
                            ImageLoadFeature.this.mAlphaAnim.start();
                        } else if (!objectAnimator.isRunning()) {
                            ImageLoadFeature.this.mAlphaAnim.start();
                        }
                    }
                    if (!isIntermediate) {
                        succPhenixEvent.getTicket().d(true);
                        if (succPhenixEvent.isNeedRefresh()) {
                            ImageLoadFeature.this.mLoadState = 5;
                        } else {
                            ImageLoadFeature.this.mLoadState = 2;
                        }
                        s8d<SuccPhenixEvent> s8dVar = ImageLoadFeature.this.mUserSuccListener;
                        if (s8dVar != null) {
                            s8dVar.onHappen(succPhenixEvent);
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("intermediate", Boolean.valueOf(isIntermediate));
                    hashMap.put("animation", Boolean.valueOf(z2));
                    hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
                    dgr a2 = dgr.a();
                    PhenixCreator phenixCreator = this.mCreator;
                    if (phenixCreator != null) {
                        str = String.valueOf(phenixCreator.id());
                    } else {
                        str = "";
                    }
                    a2.onFinished(str, url, hashMap);
                    return true;
                } else {
                    host2.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.ImageLoadSuccListener.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ImageLoadSuccListener.this.applyEvent(succPhenixEvent, false);
                            }
                        }
                    });
                    return true;
                }
            } else {
                UIKITLog.w(TUrlImageView.LOG_TAG, "callback url not match target url, callback=%s, target=%s", url, ImageLoadFeature.this.mLoadingUrl);
                return true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class ImageRetryHandler implements qkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String defaultRetryUrl;
        private int height;
        private String retryUrl;
        private int width;

        public ImageRetryHandler() {
        }

        @Override // tb.qkd
        public String getRetryUrl(PhenixCreator phenixCreator, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bd53dee", new Object[]{this, phenixCreator, th});
            }
            if (!(th instanceof HttpCodeResponseException) || ((HttpCodeResponseException) th).getHttpCode() != 404) {
                return null;
            }
            ImageLoadFeature.this.mLoadingUrl = this.retryUrl;
            return this.retryUrl;
        }

        public void seImageInfo(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eee545e", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.width = i;
            this.height = i2;
        }

        public ImageRetryHandler setRetryUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageRetryHandler) ipChange.ipc$dispatch("7365c859", new Object[]{this, str});
            }
            if (str == null || !str.endsWith("END_IMAGE_URL")) {
                this.retryUrl = str;
            } else {
                this.retryUrl = str.substring(0, str.length() - 13);
            }
            return this;
        }

        @Override // tb.qkd
        public Pair<String, String> getDefaultRetryUrlPair() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("101e44dd", new Object[]{this});
            }
            if (!czn.a().b()) {
                return null;
            }
            if (ImageLoadFeature.access$1200(ImageLoadFeature.this) == null) {
                ImageLoadFeature.access$1202(ImageLoadFeature.this, ImageStrategyConfig.u("default").n(true).a());
            } else {
                ImageLoadFeature.access$1200(ImageLoadFeature.this).y(true);
            }
            this.defaultRetryUrl = ImageStrategyDecider.decideUrl(ImageLoadFeature.access$600(ImageLoadFeature.this), Integer.valueOf(this.width), Integer.valueOf(this.height), ImageLoadFeature.access$1200(ImageLoadFeature.this));
            String str = ImageLoadFeature.this.mLoadingUrl;
            ImageLoadFeature.this.mLoadingUrl = this.defaultRetryUrl;
            return new Pair<>(str, this.defaultRetryUrl);
        }
    }

    static {
        try {
            int i = dgw.APM_VIEW_TOKEN;
            isViewTokenValid = true;
        } catch (Throwable unused) {
            isViewTokenValid = false;
        }
    }

    public static /* synthetic */ boolean access$000(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5e1d675", new Object[]{imageLoadFeature})).booleanValue();
        }
        return imageLoadFeature.mWhenNullClearImg;
    }

    public static /* synthetic */ void access$100(ImageLoadFeature imageLoadFeature, ImageView imageView, BitmapDrawable bitmapDrawable, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a3637f", new Object[]{imageLoadFeature, imageView, bitmapDrawable, new Boolean(z), new Boolean(z2)});
        } else {
            imageLoadFeature.fillImageDrawable(imageView, bitmapDrawable, z, z2);
        }
    }

    public static /* synthetic */ boolean access$1000(ImageLoadFeature imageLoadFeature, ImageView imageView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70721c96", new Object[]{imageLoadFeature, imageView, bitmap})).booleanValue();
        }
        return imageLoadFeature.isViewBitmapDifferentWith(imageView, bitmap);
    }

    public static /* synthetic */ int access$1100(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b876a7f4", new Object[]{imageLoadFeature})).intValue();
        }
        return imageLoadFeature.mKeepBackgroundState;
    }

    public static /* synthetic */ ImageStrategyConfig access$1200(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("549039e9", new Object[]{imageLoadFeature});
        }
        return imageLoadFeature.mStrategyConfig;
    }

    public static /* synthetic */ ImageStrategyConfig access$1202(ImageLoadFeature imageLoadFeature, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("62c254d8", new Object[]{imageLoadFeature, imageStrategyConfig});
        }
        imageLoadFeature.mStrategyConfig = imageStrategyConfig;
        return imageStrategyConfig;
    }

    public static /* synthetic */ boolean access$200(ImageLoadFeature imageLoadFeature, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ddca209", new Object[]{imageLoadFeature, new Boolean(z)})).booleanValue();
        }
        return imageLoadFeature.loadImageIfNecessary(z);
    }

    public static /* synthetic */ boolean access$300(ImageLoadFeature imageLoadFeature, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da264dd2", new Object[]{imageLoadFeature, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return imageLoadFeature.loadImageIfNecessaryProxy(z, z2);
    }

    public static /* synthetic */ void access$400(ImageLoadFeature imageLoadFeature, ImageView imageView, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74d7c6d", new Object[]{imageLoadFeature, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            imageLoadFeature.fetch(imageView, z, i, i2);
        }
    }

    public static /* synthetic */ void access$500(ImageLoadFeature imageLoadFeature, ImageView imageView, boolean z, int i, int i2, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8dafecc", new Object[]{imageLoadFeature, imageView, new Boolean(z), new Integer(i), new Integer(i2), str, new Long(j)});
        } else {
            imageLoadFeature.realFetch(imageView, z, i, i2, str, j);
        }
    }

    public static /* synthetic */ String access$600(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55cac8d5", new Object[]{imageLoadFeature});
        }
        return imageLoadFeature.mUrl;
    }

    public static /* synthetic */ boolean access$702(ImageLoadFeature imageLoadFeature, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6422fcd0", new Object[]{imageLoadFeature, new Boolean(z)})).booleanValue();
        }
        imageLoadFeature.mNoRepeatOnError = z;
        return z;
    }

    public static /* synthetic */ boolean access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6407e183", new Object[0])).booleanValue();
        }
        return isViewTokenValid;
    }

    public static /* synthetic */ void access$900(ImageLoadFeature imageLoadFeature, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91fe585", new Object[]{imageLoadFeature, new Integer(i), str});
        } else {
            imageLoadFeature.markHostView(i, str);
        }
    }

    private void asyncFetch(final ImageView imageView, final boolean z, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbe3735", new Object[]{this, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            drt.a(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageLoadFeature.access$400(ImageLoadFeature.this, imageView, z, i, i2);
                    }
                }
            });
        }
    }

    private void fillImageDrawable(ImageView imageView, BitmapDrawable bitmapDrawable, boolean z, boolean z2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f7230c", new Object[]{this, imageView, bitmapDrawable, new Boolean(z), new Boolean(z2)});
        } else if (imageView != null) {
            p1m p1mVar = this.mLastResTicket;
            if (p1mVar != null) {
                p1mVar.a();
                this.mLastResTicket = null;
            }
            if (bitmapDrawable != null) {
                imageView.setImageDrawable(bitmapDrawable);
                int i = this.mKeepBackgroundState;
                if (i < 0 || (i == 0 && this.mPlaceHoldResourceId != 0)) {
                    imageView.setBackgroundDrawable(null);
                }
            } else if (z && z2) {
                imageView.setImageDrawable(null);
                int i2 = this.mErrorImageId;
                if (i2 == 0) {
                    i2 = this.mPlaceHoldResourceId;
                }
                placeBgResImage(i2);
            } else if ((z2 || isViewDrawableSameWith(imageView, null)) && (drawable = this.mPlaceHoldForeground) != null) {
                imageView.setImageDrawable(drawable);
            } else if (z2) {
                imageView.setImageDrawable(null);
                placeBgResImage(this.mPlaceHoldResourceId);
            }
        }
    }

    private String getPriorityModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4f8b1c8", new Object[]{this});
        }
        PhenixOptions phenixOptions = this.mNextPhenixOptions;
        if (phenixOptions != null) {
            return phenixOptions.priorityModuleName;
        }
        String str = this.mPriorityModuleName;
        if (str != null) {
            return str;
        }
        PhenixOptions phenixOptions2 = this.mGlobalPhenixOptions;
        if (phenixOptions2 != null) {
            return phenixOptions2.priorityModuleName;
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(ImageLoadFeature imageLoadFeature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/features/ImageLoadFeature");
    }

    private boolean isViewBitmapDifferentWith(ImageView imageView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e761a70", new Object[]{this, imageView, bitmap})).booleanValue();
        }
        if (imageView instanceof TUrlImageView) {
            return ((TUrlImageView) imageView).isViewBitmapDifferentWith(bitmap);
        }
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() != bitmap) {
                return true;
            }
        }
        return false;
    }

    private boolean isViewDrawableSameWith(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79f802", new Object[]{this, imageView, drawable})).booleanValue();
        }
        if (imageView instanceof TUrlImageView) {
            return ((TUrlImageView) imageView).isDrawableSameWith(drawable);
        }
        if (imageView == null || imageView.getDrawable() != drawable) {
            return false;
        }
        return true;
    }

    private boolean loadImageIfNecessary(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c291f4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        final boolean z2 = TUrlImageView.sIsSpeed;
        if (!z2 || !jjo.b()) {
            loadImageIfNecessaryProxy(z, z2);
        } else if (TextUtils.isEmpty(this.mUrl)) {
            if (this.mTicket != null) {
                this.mTicket.a();
            }
            fillImageDrawable(getHost(), null, false, this.mUserCalledSetImageUrl);
            return false;
        } else {
            if (this.mTicket != null && !this.mTicket.f(this.mUrl)) {
                this.mTicket.a();
            }
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageLoadFeature.access$300(ImageLoadFeature.this, z, z2);
                    }
                }
            });
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean loadImageIfNecessaryProxy(boolean r8, boolean r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.uikit.extend.feature.features.ImageLoadFeature.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0029
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            java.lang.Boolean r8 = new java.lang.Boolean
            r8.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r7
            r9[r0] = r3
            r0 = 2
            r9[r0] = r8
            java.lang.String r8 = "65b4b59c"
            java.lang.Object r8 = r2.ipc$dispatch(r8, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0029:
            android.widget.ImageView r9 = r7.getHost()
            if (r9 != 0) goto L_0x0030
            return r1
        L_0x0030:
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            if (r4 == 0) goto L_0x0052
            boolean r5 = r7.mEnableSizeInLayoutParams
            if (r5 == 0) goto L_0x0054
            int r5 = r4.width
            if (r5 <= 0) goto L_0x0054
            int r6 = r4.height
            if (r6 <= 0) goto L_0x0054
            int r2 = java.lang.Math.max(r5, r6)
            r7.mLastMaxViewSize = r2
            r2 = r5
            r3 = r6
        L_0x0052:
            r4 = 0
            goto L_0x005e
        L_0x0054:
            int r5 = r4.height
            r6 = -2
            if (r5 != r6) goto L_0x0052
            int r4 = r4.width
            if (r4 != r6) goto L_0x0052
            r4 = 1
        L_0x005e:
            if (r2 != 0) goto L_0x007b
            if (r3 != 0) goto L_0x007b
            if (r4 != 0) goto L_0x007b
            boolean r4 = r7.mSimplifyLoadPath
            if (r4 == 0) goto L_0x0076
            com.taobao.uikit.extend.feature.features.PhenixOptions r4 = r7.mNextPhenixOptions
            if (r4 == 0) goto L_0x0076
            int r2 = r4.getWidth()
            com.taobao.uikit.extend.feature.features.PhenixOptions r3 = r7.mNextPhenixOptions
            int r3 = r3.getHeight()
        L_0x0076:
            if (r2 != 0) goto L_0x007b
            if (r3 != 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r4 = r7.mUrl
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0093
            tb.p1m r8 = r7.mTicket
            if (r8 == 0) goto L_0x008c
            tb.p1m r8 = r7.mTicket
            r8.a()
        L_0x008c:
            r8 = 0
            boolean r0 = r7.mUserCalledSetImageUrl
            r7.fillImageDrawable(r9, r8, r1, r0)
            return r1
        L_0x0093:
            tb.p1m r4 = r7.mTicket
            if (r4 == 0) goto L_0x00a6
            tb.p1m r4 = r7.mTicket
            java.lang.String r5 = r7.mUrl
            boolean r4 = r4.f(r5)
            if (r4 != 0) goto L_0x00a6
            tb.p1m r4 = r7.mTicket
            r4.a()
        L_0x00a6:
            boolean r4 = r7.mNoRepeatOnError
            if (r4 == 0) goto L_0x00ab
            return r1
        L_0x00ab:
            int r4 = r7.mLoadState
            if (r4 == 0) goto L_0x00b0
            return r1
        L_0x00b0:
            int r4 = r7.mScrollState
            if (r4 != r0) goto L_0x00b9
            boolean r4 = r7.mEnabledLoadOnFling
            if (r4 != 0) goto L_0x00ba
            return r1
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            com.taobao.uikit.extend.feature.features.ImageLoadFeature$ImageLoadSuccListener r4 = r7.mSuccListener
            r4.setIsInLayoutPass(r8)
            boolean r8 = r7.mRealAsync
            if (r8 == 0) goto L_0x00c7
            r7.asyncFetch(r9, r0, r2, r3)
            return r1
        L_0x00c7:
            r7.fetch(r9, r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.feature.features.ImageLoadFeature.loadImageIfNecessaryProxy(boolean, boolean):boolean");
    }

    private void markHostView(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b701a68c", new Object[]{this, new Integer(i), str});
            return;
        }
        ImageView host = getHost();
        if (host != null) {
            host.setTag(i, str);
        }
    }

    private void placeBgResImage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c88f55", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView host = getHost();
        if (i != 0 && host != null) {
            if (!jjo.c(this.mContext, i)) {
                host.setBackgroundResource(i);
            } else {
                this.mLastResTicket = s0m.B().N0(this.mContext).T(uuo.r(i)).schedulePriority(4).succListener(new s8d<SuccPhenixEvent>() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        dtl dtlVar;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        ImageView host2 = ImageLoadFeature.this.getHost();
                        if (!(host2 == null || (dtlVar = (dtl) succPhenixEvent.getDrawable()) == null)) {
                            NinePatchDrawable a2 = dtlVar.a();
                            if (a2 != null) {
                                dtlVar = a2;
                            }
                            host2.setBackgroundDrawable(dtlVar);
                        }
                        return false;
                    }
                }).fetch();
            }
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int max = Math.max(i3 - i, i4 - i2);
        int i5 = this.mLastMaxViewSize;
        if (i5 > 0 && max - i5 >= 100) {
            z2 = true;
        }
        this.mLastMaxViewSize = max;
        if (z2 || this.mLoadState != 2) {
            if (z2) {
                resetState();
            }
            loadImageIfNecessary(true);
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            constructor(context, attributeSet, i, null);
        }
    }

    public void enableLoadOnFling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f2fe39", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnabledLoadOnFling = z;
        }
    }

    public void enableSizeInLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371a2674", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableSizeInLayoutParams = z;
        }
    }

    public ImageLoadFeature failListener(s8d<FailPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("cf3535f4", new Object[]{this, s8dVar});
        }
        this.mUserFailListener = s8dVar;
        return this;
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.mUrl;
    }

    public String getLoadingUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8098410", new Object[]{this});
        }
        return this.mLoadingUrl;
    }

    public boolean isFadeIn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa1c6996", new Object[]{this})).booleanValue();
        }
        return this.mFadeIn;
    }

    public void keepBackgroundOnForegroundUpdate(boolean z) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26be9e0f", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            i = -1;
        }
        this.mKeepBackgroundState = i;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mScrollState = 1;
        }
    }

    public void preRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10090cb4", new Object[]{this, new Boolean(z)});
        } else {
            this.mPreRender.set(z);
        }
    }

    public void realAsync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8b326f", new Object[]{this, new Boolean(z)});
        } else {
            this.mRealAsync = z;
        }
    }

    public void reload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecf5534", new Object[]{this, new Boolean(z)});
        } else {
            setImageUrl(this.mUrl, this.mCacheKey4PlaceHolder, z, true, this.mNextPhenixOptions);
        }
    }

    public void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
        } else {
            this.mLoadState = 0;
        }
    }

    public t9o retrieveImageData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("a6643c16", new Object[]{this});
        }
        String str = this.mLoadingUrl;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return s0m.B().j(getPriorityModuleName(), str, 0, false);
    }

    public void setErrorImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4358a676", new Object[]{this, new Integer(i)});
        } else {
            this.mErrorImageId = i;
        }
    }

    public void setFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8994a", new Object[]{this, new Boolean(z)});
        } else {
            this.mFadeIn = z;
        }
    }

    public void setFinalUrlInspector(TUrlImageView.FinalUrlInspector finalUrlInspector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e9e0ef", new Object[]{this, finalUrlInspector});
        } else {
            this.mFinalUrlInspector = finalUrlInspector;
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            setImageUrl(str, null, false, false, null);
        }
    }

    public void setPhenixOptions(PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61067f8", new Object[]{this, phenixOptions});
        } else {
            this.mGlobalPhenixOptions = phenixOptions;
        }
    }

    public void setPlaceHoldForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3dddb2", new Object[]{this, drawable});
        } else {
            this.mPlaceHoldForeground = drawable;
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
        } else {
            this.mPlaceHoldResourceId = i;
        }
    }

    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
        } else {
            this.mPriorityModuleName = str;
        }
    }

    public void setSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6b77c6", new Object[]{this, str});
        } else {
            this.mSceneName = str;
        }
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
        } else if (obj instanceof ImageStrategyConfig) {
            this.mStrategyConfig = (ImageStrategyConfig) obj;
        }
    }

    public void setWhenNullClearImg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206d9914", new Object[]{this, new Boolean(z)});
        } else {
            this.mWhenNullClearImg = z;
        }
    }

    public void simplifyLoadPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a9e8db", new Object[]{this});
        } else {
            this.mSimplifyLoadPath = s0m.B().N();
        }
    }

    public boolean skipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39745fa2", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.mSkipAutoSize = Boolean.valueOf(z);
        return z;
    }

    public ImageLoadFeature succListener(s8d<SuccPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("42fdbf18", new Object[]{this, s8dVar});
        }
        this.mUserSuccListener = s8dVar;
        return this;
    }

    public void constructor(Context context, AttributeSet attributeSet, int i, boolean[] zArr) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e168eb7b", new Object[]{this, context, attributeSet, new Integer(i), zArr});
        } else if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageLoadFeature, i, 0)) != null) {
            this.mFadeIn = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_fade_in, false);
            int i2 = R.styleable.ImageLoadFeature_uik_skip_auto_size;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.mSkipAutoSize = Boolean.valueOf(obtainStyledAttributes.getBoolean(i2, false));
            }
            this.mWhenNullClearImg = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_when_null_clear_img, true);
            this.mPlaceHoldResourceId = obtainStyledAttributes.getResourceId(R.styleable.ImageLoadFeature_uik_place_hold_background, 0);
            this.mErrorImageId = obtainStyledAttributes.getResourceId(R.styleable.ImageLoadFeature_uik_error_background, 0);
            this.mPlaceHoldForeground = obtainStyledAttributes.getDrawable(R.styleable.ImageLoadFeature_uik_place_hold_foreground);
            if (zArr != null) {
                zArr[0] = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_auto_release_image, true);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public ImageView getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("286ccf8b", new Object[]{this});
        }
        WeakReference<ImageView> weakReference = this.mHostReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
        } else if (imageView == null) {
            this.mHostReference = null;
            this.mUserSuccListener = null;
            this.mUserFailListener = null;
            if (this.mTicket != null) {
                this.mTicket.a();
            }
        } else {
            this.mHostReference = new WeakReference<>(imageView);
            this.mContext = imageView.getContext().getApplicationContext();
            if (!TextUtils.isEmpty(this.mUrl)) {
                loadImageIfNecessary(false);
            }
        }
    }

    public void setImageUrl(String str, String str2, boolean z, boolean z2, PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323bb4b6", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), phenixOptions});
            return;
        }
        sz8.b("phenix", "setImageUrl");
        this.mUserCalledSetImageUrl = true;
        if (z2 || this.mLoadState == 0 || this.mLoadState == 3 || this.mLoadState == 5 || !TextUtils.equals(this.mUrl, str) || !TextUtils.equals(this.mCacheKey4PlaceHolder, str2) || !PhenixOptions.isSame(this.mNextPhenixOptions, phenixOptions)) {
            if (!TextUtils.isEmpty(str)) {
                String str3 = "TUrlImageView setImageUrl | url= " + str + "| mLoadState:" + this.mLoadState + "| forceLoad:" + z2 + "| hostView:" + getHost();
                xv8.b(6, "Phenix", str3);
                HashMap hashMap = new HashMap();
                hashMap.put("url", str);
                hashMap.put("log", str3);
                dgr.a().onEvent("IMAGE", "setImageUrl", hashMap);
            }
            if (isViewTokenValid && !TextUtils.isEmpty(str)) {
                markHostView(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
            }
            this.mUrl = str;
            this.mCacheKey4PlaceHolder = str2;
            this.mNoRepeatOnError = false;
            resetState();
            this.mNextPhenixOptions = phenixOptions;
            ImageView host = getHost();
            if (host != null) {
                if (!z) {
                    loadImageIfNecessary(false);
                } else if (this.mUrl == null) {
                    s0m.B().f(this.mTicket);
                    fillImageDrawable(host, null, false, true);
                } else {
                    this.mMainHandler.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ImageLoadFeature.access$200(ImageLoadFeature.this, false);
                            }
                        }
                    });
                }
            }
            sz8.e();
            return;
        }
        sz8.e();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.mScrollState == 1) {
            this.mScrollState = 0;
            if (this.mLoadState == 0 || this.mLoadState == 4) {
                resetState();
                loadImageIfNecessary(false);
            }
        }
    }

    public boolean shouldAsyncRequest(String str) {
        String str2;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f897bdb", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ImageStrategyConfig imageStrategyConfig = this.mStrategyConfig;
        if (imageStrategyConfig != null) {
            String b = imageStrategyConfig.b();
            if (TextUtils.isEmpty(b)) {
                b = String.valueOf(this.mStrategyConfig.a());
            }
            if (TextUtils.equals(b, "32001")) {
                return false;
            }
        }
        if (str.indexOf("?") > 0 || str.indexOf("#") > 0) {
            return false;
        }
        PhenixOptions phenixOptions = this.mNextPhenixOptions;
        if (phenixOptions != null && (phenixOptions.bitmapProcessors != null || phenixOptions.thumbnailType > 0)) {
            return false;
        }
        if (!str.startsWith("http") && !str.startsWith(itw.URL_SEPARATOR)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf > 0) {
            str2 = str.substring(lastIndexOf + 1);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Iterator<String> it = s0m.B().t().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!TextUtils.isEmpty(next) && next.contains(str2)) {
                z2 = true;
                break;
            }
        }
        if (!z2 && TextUtils.equals(getPriorityModuleName(), "homepage-ads")) {
            if (s0m.B().b0()) {
                z = f2b.h().i(this.mSceneName, str2);
            } else {
                z = us2.e().f(str2);
            }
            if (z) {
                z2 = true;
            }
        }
        return !z2;
    }

    private void realFetch(ImageView imageView, boolean z, int i, int i2, String str, long j) {
        ArrayList<String> Q0;
        ArrayList<String> O0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a2ec03", new Object[]{this, imageView, new Boolean(z), new Integer(i), new Integer(i2), str, new Long(j)});
        } else if (imageView != null) {
            PhenixOptions phenixOptions = this.mNextPhenixOptions;
            if (phenixOptions == null) {
                phenixOptions = this.mGlobalPhenixOptions;
            }
            PhenixCreator failListener = s0m.B().N0(this.mContext).U(getPriorityModuleName(), str).releasableDrawable(true).secondary(this.mCacheKey4PlaceHolder).sceneName(this.mSceneName).memOnly(z).succListener(this.mSuccListener).failListener(this.mFailListener);
            if (!this.mSimplifyLoadPath || imageView.getWidth() != 0 || imageView.getHeight() != 0 || i <= 0 || i2 <= 0) {
                failListener.limitSize(imageView);
            } else {
                failListener.limitSize(i, i2);
            }
            this.mSuccListener.mCreator = failListener;
            this.mFailListener.mCreator = failListener;
            if (!this.mSimplifyLoadPath || (!this.mShouldAsync.get() && (this.mWhenNullClearImg || this.mPlaceHoldForeground != null))) {
                failListener.memCacheMissListener(this.mMemoryMissListener);
            }
            if (this.mShouldAsync.get()) {
                failListener.skipMemCache();
                this.mShouldAsync.set(false);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("oriUrl", this.mUrl);
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            dgr.a().onRequest(String.valueOf(failListener.id()), str, hashMap);
            if (phenixOptions != null) {
                failListener.preloadWithSmall(phenixOptions.isOpened(1)).scaleFromLarge(phenixOptions.isOpened(2)).bitmapProcessors(phenixOptions.bitmapProcessors).asThumbnail(phenixOptions.thumbnailType, phenixOptions.isOpened(16)).diskCachePriority(phenixOptions.diskCachePriority).schedulePriority(phenixOptions.schedulePriority).memoryCachePriority(phenixOptions.memoryCachePriority);
                if (phenixOptions.isOpened(4)) {
                    failListener.skipCache();
                }
                if (phenixOptions.isOpened(8)) {
                    failListener.onlyCache();
                }
                if (phenixOptions.isOpened(32)) {
                    failListener.fuzzyMatchCache();
                }
                if (phenixOptions.isStrictMatchCache()) {
                    failListener.strictMatchCache(true);
                }
                Map<String, String> loaderExtras = phenixOptions.getLoaderExtras();
                if (loaderExtras != null) {
                    for (Map.Entry<String, String> entry : loaderExtras.entrySet()) {
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(value)) {
                            failListener.addLoaderExtra(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
            if (!this.mUrl.equals(str)) {
                failListener.retryHandler(this.mRetryHandler.setRetryUrl(this.mUrl));
                this.mRetryHandler.seImageInfo(i, i2);
            }
            ImageStatistics statistics = failListener.getStatistics();
            if (statistics != null) {
                if (TUrlImageView.isAutoSizeSkippedGlobally() || (this.mSkipAutoSize != null && this.mSkipAutoSize.booleanValue())) {
                    statistics.I = true;
                }
                ImageStrategyConfig imageStrategyConfig = this.mStrategyConfig;
                if (imageStrategyConfig != null && imageStrategyConfig.t()) {
                    statistics.J = true;
                }
                statistics.F = j;
            }
            failListener.addLoaderExtra("origin_url", this.mUrl);
            ImageStrategyConfig imageStrategyConfig2 = this.mStrategyConfig;
            if (imageStrategyConfig2 != null) {
                String b = imageStrategyConfig2.b();
                if (TextUtils.isEmpty(b)) {
                    b = String.valueOf(this.mStrategyConfig.a());
                }
                failListener.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, b);
                if (!TextUtils.isEmpty(this.mStrategyConfig.j())) {
                    failListener.addLoaderExtra("p_trace_id", this.mStrategyConfig.j());
                }
                if (this.mStrategyConfig.i() != null && this.mStrategyConfig.i().size() > 0) {
                    failListener.setOpenTraceContext(this.mStrategyConfig.i());
                } else if (!(phenixOptions == null || phenixOptions.getOpenTraceContext() == null || phenixOptions.getOpenTraceContext().size() <= 0)) {
                    failListener.setOpenTraceContext(phenixOptions.getOpenTraceContext());
                }
                if (!s0m.B().X()) {
                    if (this.mStrategyConfig.A()) {
                        ArrayList<String> E = s0m.B().E();
                        if (E != null && ((!TextUtils.isEmpty(b) && E.contains(b)) || E.contains("*"))) {
                            failListener.heightScale(true);
                        } else if (s0m.B().X0() && (O0 = s0m.B().O0()) != null && ((!TextUtils.isEmpty(b) && O0.contains(b)) || O0.contains("*"))) {
                            failListener.heightScale(true);
                        }
                    }
                    if (this.mStrategyConfig.z()) {
                        ArrayList<String> P0 = s0m.B().P0();
                        if (P0 != null && ((!TextUtils.isEmpty(b) && P0.contains(b)) || P0.contains("*"))) {
                            failListener.forceHighQualityAccess(true);
                        } else if (s0m.B().X0() && (Q0 = s0m.B().Q0()) != null && ((!TextUtils.isEmpty(b) && Q0.contains(b)) || Q0.contains("*"))) {
                            failListener.forceHighQualityAccess(true);
                        }
                    }
                }
            }
            if (!this.mPreRender.get() || !s0m.B().G() || jjo.b()) {
                this.mTicket = failListener.fetch();
            } else {
                xv8.b(6, "Phenix", "DX-PRE-REND " + this.mSceneName + ", " + this.mUrl);
                this.mTicket = failListener.fetch(Thread.currentThread().getName(), Thread.currentThread().getId());
                this.mPreRender.set(false);
            }
            this.mTicket.e(this.mUrl);
        }
    }

    private void fetch(final ImageView imageView, final boolean z, final int i, final int i2) {
        int i3 = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7de8599", new Object[]{this, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        long nanoTime = System.nanoTime();
        String str = "";
        if (this.mSimplifyLoadPath && s0m.B().I() && TextUtils.equals("homepage-ads", getPriorityModuleName())) {
            String str2 = HomeUrlCacheManager.getInstance().get(this.mUrl);
            if (TextUtils.isEmpty(str2) || !str2.endsWith("_.avif") || czn.a().b()) {
                str = str2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            if ((this.mSkipAutoSize != null || TUrlImageView.isAutoSizeSkippedGlobally()) && (this.mSkipAutoSize == null || this.mSkipAutoSize.booleanValue())) {
                str = this.mUrl;
            } else if (this.mSimplifyLoadPath) {
                str = ImageStrategyDecider.simpleDecideUrl(this.mUrl, Integer.valueOf(i), Integer.valueOf(i2), this.mStrategyConfig);
            } else {
                str = ImageStrategyDecider.decideUrl(this.mUrl, Integer.valueOf(i), Integer.valueOf(i2), this.mStrategyConfig);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = this.mUrl;
        }
        final long nanoTime2 = System.nanoTime() - nanoTime;
        if (this.mFinalUrlInspector != null) {
            str = this.mFinalUrlInspector.inspectFinalUrl(str, i, i2);
        }
        TUrlImageView.FinalUrlInspector globalFinalUrlInspector = TUrlImageView.getGlobalFinalUrlInspector();
        if (globalFinalUrlInspector != null) {
            str = globalFinalUrlInspector.inspectFinalUrl(str, i, i2);
        }
        this.mLoadingUrl = str;
        if (!z) {
            i3 = 1;
        }
        this.mLoadState = i3;
        ImageView host = getHost();
        if (host != null) {
            host.setTag(APM_UI_KEY, "START");
        }
        if (!this.mSimplifyLoadPath || !s0m.B().K() || !jjo.b()) {
            realFetch(imageView, z, i, i2, this.mLoadingUrl, nanoTime2);
        } else if (!shouldAsyncRequest(this.mUrl)) {
            realFetch(imageView, z, i, i2, this.mLoadingUrl, nanoTime2);
        } else {
            this.mShouldAsync.set(true);
            fillImageDrawable(getHost(), null, false, this.mWhenNullClearImg);
            drt.a(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
                    ImageLoadFeature.access$500(imageLoadFeature, imageView, z, i, i2, imageLoadFeature.mLoadingUrl, nanoTime2);
                }
            });
        }
    }
}
