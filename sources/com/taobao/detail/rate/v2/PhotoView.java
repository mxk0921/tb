package com.taobao.detail.rate.v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.hgo;
import tb.ste;
import tb.uwn;
import tb.vu3;
import tb.wtk;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PhotoView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMA_DURING = 340;
    private static final float MAX_SCALE = 2.5f;
    private static final int MIN_ROTATE = 35;
    private boolean canRotate;
    private boolean hasDrawable;
    private boolean hasMultiTouch;
    private boolean hasOverTranslate;
    private boolean imgLargeHeight;
    private boolean imgLargeWidth;
    private boolean isInit;
    private boolean isKnowSize;
    private boolean isZoonUp;
    private boolean mAdjustViewBounds;
    private int mAnimaDuring;
    private Paint mBackPaint;
    private List<Rect> mBackRectList;
    private g mCacheDrawableListener;
    private View.OnClickListener mClickListener;
    private RectF mClip;
    private Runnable mCompleteCallBack;
    private float mDegrees;
    private GestureDetector mDetector;
    private Paint mForePaint;
    private List<Rect> mForeRectList;
    private ste mFromInfo;
    private float mHalfBaseRectHeight;
    private float mHalfBaseRectWidth;
    private boolean mHasNotifyCacheLoaded;
    private long mInfoTime;
    private View.OnLongClickListener mLongClick;
    private float mMaxScale;
    private int mMinRotate;
    private hgo mRotateDetector;
    private float mRotateFlag;
    private ScaleGestureDetector mScaleDetector;
    private ImageView.ScaleType mScaleType;
    private int mTranslateX;
    private int mTranslateY;
    private l onPhotoViewLongClickLisenter;
    private JSONArray tagData;
    private int MAX_OVER_SCROLL = 0;
    private int MAX_FLING_OVER_SCROLL = 0;
    private int MAX_OVER_RESISTANCE = 0;
    private int MAX_ANIM_FROM_WAITE = 500;
    private Matrix mBaseMatrix = new Matrix();
    private Matrix mAnimaMatrix = new Matrix();
    private Matrix mSynthesisMatrix = new Matrix();
    private Matrix mTmpMatrix = new Matrix();
    private boolean isEnable = false;
    private boolean isRotateEnable = false;
    private float mScale = 1.0f;
    private RectF mWidgetRect = new RectF();
    private RectF mBaseRect = new RectF();
    private RectF mImgRect = new RectF();
    private RectF mTmpRect = new RectF();
    private RectF mCommonRect = new RectF();
    private PointF mScreenCenter = new PointF();
    private PointF mScaleCenter = new PointF();
    private PointF mRotateCenter = new PointF();
    private n mTranslate = new n();
    private int textSize = zhn.F(14.0f);
    private wtk mRotateListener = new a();
    private ScaleGestureDetector.OnScaleGestureListener mScaleListener = new b();
    private Runnable mClickRunnable = new c();
    private GestureDetector.OnGestureListener mGestureListener = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements wtk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(float f, float f2, float f3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb58247f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
                return;
            }
            PhotoView photoView = PhotoView.this;
            PhotoView.access$002(photoView, PhotoView.access$000(photoView) + f);
            if (PhotoView.access$100(PhotoView.this)) {
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$202(photoView2, PhotoView.access$200(photoView2) + f);
                PhotoView.access$300(PhotoView.this).postRotate(f, f2, f3);
            } else if (Math.abs(PhotoView.access$000(PhotoView.this)) >= PhotoView.access$400(PhotoView.this)) {
                PhotoView.access$102(PhotoView.this, true);
                PhotoView.access$002(PhotoView.this, 0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ScaleGestureDetector.OnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            PhotoView photoView = PhotoView.this;
            PhotoView.access$502(photoView, PhotoView.access$500(photoView) * scaleFactor);
            PhotoView.access$300(PhotoView.this).postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            PhotoView.access$600(PhotoView.this);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (PhotoView.access$700(PhotoView.this) != null) {
                PhotoView.access$700(PhotoView.this).onClick(PhotoView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -223117518) {
                return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/v2/PhotoView$4");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            PhotoView.access$1500(PhotoView.this).e();
            float width = PhotoView.access$1600(PhotoView.this).left + (PhotoView.access$1600(PhotoView.this).width() / 2.0f);
            float height = PhotoView.access$1600(PhotoView.this).top + (PhotoView.access$1600(PhotoView.this).height() / 2.0f);
            PhotoView.access$2700(PhotoView.this).set(width, height);
            PhotoView.access$2800(PhotoView.this).set(width, height);
            PhotoView.access$1902(PhotoView.this, 0);
            PhotoView.access$2302(PhotoView.this, 0);
            if (PhotoView.access$2900(PhotoView.this)) {
                f = PhotoView.access$500(PhotoView.this);
                f2 = 1.0f;
            } else {
                float access$500 = PhotoView.access$500(PhotoView.this);
                float access$3000 = PhotoView.access$3000(PhotoView.this);
                PhotoView.access$2700(PhotoView.this).set(motionEvent.getX(), motionEvent.getY());
                f = access$500;
                f2 = access$3000;
            }
            PhotoView.access$3100(PhotoView.this).reset();
            PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
            PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
            PhotoView.access$3100(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$3100(PhotoView.this).postScale(f2, f2, PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
            PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
            PhotoView.access$3100(PhotoView.this).mapRect(PhotoView.access$3500(PhotoView.this), PhotoView.access$3200(PhotoView.this));
            PhotoView photoView = PhotoView.this;
            PhotoView.access$1800(photoView, PhotoView.access$3500(photoView));
            PhotoView photoView2 = PhotoView.this;
            PhotoView.access$2902(photoView2, true ^ PhotoView.access$2900(photoView2));
            PhotoView.access$1500(PhotoView.this).j(f, f2);
            PhotoView.access$1500(PhotoView.this).d();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            PhotoView.access$1002(PhotoView.this, false);
            PhotoView.access$1102(PhotoView.this, false);
            PhotoView.access$102(PhotoView.this, false);
            PhotoView photoView = PhotoView.this;
            photoView.removeCallbacks(PhotoView.access$1200(photoView));
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3;
            float f4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            if (PhotoView.access$1100(PhotoView.this)) {
                return false;
            }
            if ((!PhotoView.access$1300(PhotoView.this) && !PhotoView.access$1400(PhotoView.this)) || PhotoView.access$1500(PhotoView.this).f10356a) {
                return false;
            }
            if (Math.round(PhotoView.access$1600(PhotoView.this).left) >= PhotoView.access$1700(PhotoView.this).left || Math.round(PhotoView.access$1600(PhotoView.this).right) <= PhotoView.access$1700(PhotoView.this).right) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if (Math.round(PhotoView.access$1600(PhotoView.this).top) >= PhotoView.access$1700(PhotoView.this).top || Math.round(PhotoView.access$1600(PhotoView.this).bottom) <= PhotoView.access$1700(PhotoView.this).bottom) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            if (PhotoView.access$100(PhotoView.this) || PhotoView.access$200(PhotoView.this) % 90.0f != 0.0f) {
                float access$200 = ((int) (PhotoView.access$200(PhotoView.this) / 90.0f)) * 90;
                float access$2002 = PhotoView.access$200(PhotoView.this) % 90.0f;
                if (access$2002 > 45.0f) {
                    access$200 += 90.0f;
                } else if (access$2002 < -45.0f) {
                    access$200 -= 90.0f;
                }
                PhotoView.access$1500(PhotoView.this).h((int) PhotoView.access$200(PhotoView.this), (int) access$200);
                PhotoView.access$202(PhotoView.this, access$200);
            }
            PhotoView photoView = PhotoView.this;
            PhotoView.access$1800(photoView, PhotoView.access$1600(photoView));
            PhotoView.access$1500(PhotoView.this).g(f3, f4);
            PhotoView.access$1500(PhotoView.this).d();
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            if (PhotoView.access$800(PhotoView.this) != null) {
                PhotoView.access$800(PhotoView.this).onLongClick(PhotoView.this);
            }
            if (PhotoView.access$900(PhotoView.this) != null) {
                PhotoView.access$900(PhotoView.this).a(PhotoView.this, motionEvent);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            if (PhotoView.access$1500(PhotoView.this).f10356a) {
                PhotoView.access$1500(PhotoView.this).e();
            }
            if (PhotoView.this.canScrollHorizontallySelf(f)) {
                if (f < 0.0f && PhotoView.access$1600(PhotoView.this).left - f > PhotoView.access$1700(PhotoView.this).left) {
                    f = PhotoView.access$1600(PhotoView.this).left;
                }
                if (f > 0.0f && PhotoView.access$1600(PhotoView.this).right - f < PhotoView.access$1700(PhotoView.this).right) {
                    f = PhotoView.access$1600(PhotoView.this).right - PhotoView.access$1700(PhotoView.this).right;
                }
                PhotoView.access$300(PhotoView.this).postTranslate(-f, 0.0f);
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1902(photoView, (int) (PhotoView.access$1900(photoView) - f));
            } else if (PhotoView.access$1300(PhotoView.this) || PhotoView.access$1100(PhotoView.this) || PhotoView.access$1000(PhotoView.this)) {
                PhotoView.access$2000(PhotoView.this);
                if (!PhotoView.access$1100(PhotoView.this)) {
                    if (f < 0.0f && PhotoView.access$1600(PhotoView.this).left - f > PhotoView.access$2100(PhotoView.this).left) {
                        PhotoView photoView2 = PhotoView.this;
                        f = PhotoView.access$2200(photoView2, PhotoView.access$1600(photoView2).left - PhotoView.access$2100(PhotoView.this).left, f);
                    }
                    if (f > 0.0f && PhotoView.access$1600(PhotoView.this).right - f < PhotoView.access$2100(PhotoView.this).right) {
                        PhotoView photoView3 = PhotoView.this;
                        f = PhotoView.access$2200(photoView3, PhotoView.access$1600(photoView3).right - PhotoView.access$2100(PhotoView.this).right, f);
                    }
                }
                PhotoView photoView4 = PhotoView.this;
                PhotoView.access$1902(photoView4, (int) (PhotoView.access$1900(photoView4) - f));
                PhotoView.access$300(PhotoView.this).postTranslate(-f, 0.0f);
                PhotoView.access$1002(PhotoView.this, true);
            }
            if (PhotoView.this.canScrollVerticallySelf(f2)) {
                if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f2 > PhotoView.access$1700(PhotoView.this).top) {
                    f2 = PhotoView.access$1600(PhotoView.this).top;
                }
                if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f2 < PhotoView.access$1700(PhotoView.this).bottom) {
                    f2 = PhotoView.access$1600(PhotoView.this).bottom - PhotoView.access$1700(PhotoView.this).bottom;
                }
                PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f2);
                PhotoView photoView5 = PhotoView.this;
                PhotoView.access$2302(photoView5, (int) (PhotoView.access$2300(photoView5) - f2));
            } else if (PhotoView.access$1400(PhotoView.this) || PhotoView.access$1000(PhotoView.this) || PhotoView.access$1100(PhotoView.this)) {
                PhotoView.access$2000(PhotoView.this);
                if (!PhotoView.access$1100(PhotoView.this)) {
                    if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f2 > PhotoView.access$2100(PhotoView.this).top) {
                        PhotoView photoView6 = PhotoView.this;
                        f2 = PhotoView.access$2400(photoView6, PhotoView.access$1600(photoView6).top - PhotoView.access$2100(PhotoView.this).top, f2);
                    }
                    if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f2 < PhotoView.access$2100(PhotoView.this).bottom) {
                        PhotoView photoView7 = PhotoView.this;
                        f2 = PhotoView.access$2400(photoView7, PhotoView.access$1600(photoView7).bottom - PhotoView.access$2100(PhotoView.this).bottom, f2);
                    }
                }
                PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f2);
                PhotoView photoView8 = PhotoView.this;
                PhotoView.access$2302(photoView8, (int) (PhotoView.access$2300(photoView8) - f2));
                PhotoView.access$1002(PhotoView.this, true);
            }
            PhotoView.access$600(PhotoView.this);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (PhotoView.access$2500(PhotoView.this) != null && PhotoView.access$2500(PhotoView.this).size() > 0) {
                for (int i = 0; i < PhotoView.access$2500(PhotoView.this).size(); i++) {
                    if (((Rect) PhotoView.access$2500(PhotoView.this).get(i)).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (PhotoView.access$2600(PhotoView.this) != null) {
                            JSONObject jSONObject = PhotoView.access$2600(PhotoView.this).getJSONObject(i);
                            if (!TextUtils.isEmpty(jSONObject.getString("detailUrl"))) {
                                Nav.from(PhotoView.this.getContext()).toUri(jSONObject.getString("detailUrl"));
                            }
                        }
                        return false;
                    }
                }
            }
            PhotoView photoView = PhotoView.this;
            photoView.postDelayed(PhotoView.access$1200(photoView), 250L);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f10351a;
        public final /* synthetic */ float b;
        public final /* synthetic */ h c;

        public e(float f, float f2, h hVar) {
            this.f10351a = f;
            this.b = f2;
            this.c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PhotoView.access$1500(PhotoView.this).f(1.0f, 1.0f, this.f10351a - 1.0f, this.b - 1.0f, PhotoView.access$3700(PhotoView.this) / 2, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface g {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface h {
        float a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.h
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc56a906", new Object[]{this})).floatValue();
            }
            return PhotoView.access$1600(PhotoView.this).bottom;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Interpolator f10353a;

        public /* synthetic */ j(PhotoView photoView, a aVar) {
            this(photoView);
        }

        public void a(Interpolator interpolator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4be544", new Object[]{this, interpolator});
            } else {
                this.f10353a = interpolator;
            }
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            Interpolator interpolator = this.f10353a;
            if (interpolator != null) {
                return interpolator.getInterpolation(f);
            }
            return f;
        }

        public j(PhotoView photoView) {
            this.f10353a = new DecelerateInterpolator();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class k implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.h
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc56a906", new Object[]{this})).floatValue();
            }
            return (PhotoView.access$1600(PhotoView.this).top + PhotoView.access$1600(PhotoView.this).bottom) / 2.0f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface l {
        void a(View view, MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class m implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.h
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc56a906", new Object[]{this})).floatValue();
            }
            return PhotoView.access$1600(PhotoView.this).top;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10356a;
        public OverScroller b;
        public OverScroller c;
        public Scroller d;
        public Scroller e;
        public Scroller f;
        public h g;
        public int h;
        public int i;
        public int j;
        public int k;
        public RectF l = new RectF();
        public j m;

        public n() {
            this.m = new j(PhotoView.this, null);
            Context context = PhotoView.this.getContext();
            this.b = new OverScroller(context, this.m);
            this.d = new Scroller(context, this.m);
            this.c = new OverScroller(context, this.m);
            this.e = new Scroller(context, this.m);
            this.f = new Scroller(context, this.m);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d42e529", new Object[]{this});
                return;
            }
            PhotoView.access$300(PhotoView.this).reset();
            PhotoView.access$300(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
            PhotoView.access$300(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
            PhotoView.access$300(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postScale(PhotoView.access$500(PhotoView.this), PhotoView.access$500(PhotoView.this), PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
            PhotoView.access$600(PhotoView.this);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("287924bc", new Object[]{this});
            } else if (this.f10356a) {
                PhotoView.this.post(this);
            }
        }

        public void c(Interpolator interpolator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
            } else {
                this.m.a(interpolator);
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            this.f10356a = true;
            b();
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
                return;
            }
            PhotoView.this.removeCallbacks(this);
            this.b.abortAnimation();
            this.d.abortAnimation();
            this.c.abortAnimation();
            this.f.abortAnimation();
            this.f10356a = false;
        }

        public void f(float f, float f2, float f3, float f4, int i, h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa573b21", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Integer(i), hVar});
                return;
            }
            this.e.startScroll((int) (f * 10000.0f), (int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), i);
            this.g = hVar;
        }

        public void g(float f, float f2) {
            int i;
            float f3;
            int i2;
            int i3;
            int i4;
            float f4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4cee7d", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            int i13 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i13 < 0) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            this.h = i;
            int i14 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            RectF access$1600 = PhotoView.access$1600(PhotoView.this);
            if (i14 > 0) {
                f3 = Math.abs(access$1600.left);
            } else {
                f3 = access$1600.right - PhotoView.access$1700(PhotoView.this).right;
            }
            int i15 = (int) f3;
            if (i13 < 0) {
                i15 = Integer.MAX_VALUE - i15;
            }
            if (i13 < 0) {
                i2 = i15;
            } else {
                i2 = 0;
            }
            if (i13 < 0) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = i15;
            }
            if (i13 < 0) {
                i15 = Integer.MAX_VALUE - i2;
            }
            int i16 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i16 < 0) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = 0;
            }
            this.i = i4;
            int i17 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            RectF access$16002 = PhotoView.access$1600(PhotoView.this);
            if (i17 > 0) {
                f4 = Math.abs(access$16002.top);
            } else {
                f4 = access$16002.bottom - PhotoView.access$1700(PhotoView.this).bottom;
            }
            int i18 = (int) f4;
            if (i16 < 0) {
                i18 = Integer.MAX_VALUE - i18;
            }
            if (i16 < 0) {
                i5 = i18;
            } else {
                i5 = 0;
            }
            if (i16 < 0) {
                i6 = Integer.MAX_VALUE;
            } else {
                i6 = i18;
            }
            if (i16 < 0) {
                i18 = Integer.MAX_VALUE - i5;
            }
            if (i14 == 0) {
                i8 = 0;
                i7 = 0;
            } else {
                i8 = i2;
                i7 = i3;
            }
            if (i17 == 0) {
                i10 = 0;
                i9 = 0;
            } else {
                i10 = i5;
                i9 = i6;
            }
            OverScroller overScroller = this.c;
            int i19 = this.h;
            int i20 = this.i;
            int i21 = (int) f;
            int i22 = (int) f2;
            if (Math.abs(i15) < PhotoView.access$3800(PhotoView.this) * 2) {
                i11 = 0;
            } else {
                i11 = PhotoView.access$3800(PhotoView.this);
            }
            if (Math.abs(i18) < PhotoView.access$3800(PhotoView.this) * 2) {
                i12 = 0;
            } else {
                i12 = PhotoView.access$3800(PhotoView.this);
            }
            overScroller.fling(i19, i20, i21, i22, i8, i7, i10, i9, i11, i12);
        }

        public void h(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a7f1828", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                this.f.startScroll(i, 0, i2 - i, 0, PhotoView.access$3700(PhotoView.this));
            }
        }

        public void i(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35645fdb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f.startScroll(i, 0, i2 - i, 0, i3);
            }
        }

        public void j(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ba2bfeb", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                this.d.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, PhotoView.access$3700(PhotoView.this));
            }
        }

        public void k(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5af948ef", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.j = 0;
            this.k = 0;
            this.b.startScroll(0, 0, i3, i4, PhotoView.access$3700(PhotoView.this));
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.d.computeScrollOffset()) {
                PhotoView.access$502(PhotoView.this, this.d.getCurrX() / 10000.0f);
                z = false;
            } else {
                z = true;
            }
            if (this.b.computeScrollOffset()) {
                int currX = this.b.getCurrX() - this.j;
                int currY = this.b.getCurrY() - this.k;
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1902(photoView, PhotoView.access$1900(photoView) + currX);
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$2302(photoView2, PhotoView.access$2300(photoView2) + currY);
                this.j = this.b.getCurrX();
                this.k = this.b.getCurrY();
                z = false;
            }
            if (this.c.computeScrollOffset()) {
                int currX2 = this.c.getCurrX() - this.h;
                int currY2 = this.c.getCurrY() - this.i;
                this.h = this.c.getCurrX();
                this.i = this.c.getCurrY();
                PhotoView photoView3 = PhotoView.this;
                PhotoView.access$1902(photoView3, PhotoView.access$1900(photoView3) + currX2);
                PhotoView photoView4 = PhotoView.this;
                PhotoView.access$2302(photoView4, PhotoView.access$2300(photoView4) + currY2);
                z = false;
            }
            if (this.f.computeScrollOffset()) {
                PhotoView.access$202(PhotoView.this, this.f.getCurrX());
                z = false;
            }
            if (this.e.computeScrollOffset() || PhotoView.access$3900(PhotoView.this) != null) {
                float currX3 = this.e.getCurrX() / 10000.0f;
                float currY3 = this.e.getCurrY() / 10000.0f;
                PhotoView.access$3100(PhotoView.this).setScale(currX3, currY3, (PhotoView.access$1600(PhotoView.this).left + PhotoView.access$1600(PhotoView.this).right) / 2.0f, this.g.a());
                PhotoView.access$3100(PhotoView.this).mapRect(this.l, PhotoView.access$1600(PhotoView.this));
                if (currX3 == 1.0f) {
                    this.l.left = PhotoView.access$1700(PhotoView.this).left;
                    this.l.right = PhotoView.access$1700(PhotoView.this).right;
                }
                if (currY3 == 1.0f) {
                    this.l.top = PhotoView.access$1700(PhotoView.this).top;
                    this.l.bottom = PhotoView.access$1700(PhotoView.this).bottom;
                }
                PhotoView.access$3902(PhotoView.this, this.l);
            }
            if (!z) {
                a();
                b();
                return;
            }
            this.f10356a = false;
            if (PhotoView.access$1300(PhotoView.this)) {
                if (PhotoView.access$1600(PhotoView.this).left > 0.0f) {
                    PhotoView photoView5 = PhotoView.this;
                    PhotoView.access$1902(photoView5, (int) (PhotoView.access$1900(photoView5) - PhotoView.access$1600(PhotoView.this).left));
                } else if (PhotoView.access$1600(PhotoView.this).right < PhotoView.access$1700(PhotoView.this).width()) {
                    PhotoView photoView6 = PhotoView.this;
                    PhotoView.access$1902(photoView6, PhotoView.access$1900(photoView6) - ((int) (PhotoView.access$1700(PhotoView.this).width() - PhotoView.access$1600(PhotoView.this).right)));
                }
                z2 = true;
            }
            if (!PhotoView.access$1400(PhotoView.this)) {
                z3 = z2;
            } else if (PhotoView.access$1600(PhotoView.this).top > 0.0f) {
                PhotoView photoView7 = PhotoView.this;
                PhotoView.access$2302(photoView7, (int) (PhotoView.access$2300(photoView7) - PhotoView.access$1600(PhotoView.this).top));
            } else if (PhotoView.access$1600(PhotoView.this).bottom < PhotoView.access$1700(PhotoView.this).height()) {
                PhotoView photoView8 = PhotoView.this;
                PhotoView.access$2302(photoView8, PhotoView.access$2300(photoView8) - ((int) (PhotoView.access$1700(PhotoView.this).height() - PhotoView.access$1600(PhotoView.this).bottom)));
            }
            if (z3) {
                a();
            }
            PhotoView.this.invalidate();
            if (PhotoView.access$4000(PhotoView.this) != null) {
                PhotoView.access$4000(PhotoView.this).run();
                PhotoView.access$4002(PhotoView.this, null);
            }
        }
    }

    public PhotoView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ float access$000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90fcb552", new Object[]{photoView})).floatValue();
        }
        return photoView.mRotateFlag;
    }

    public static /* synthetic */ float access$002(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("591d3c10", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mRotateFlag = f2;
        return f2;
    }

    public static /* synthetic */ boolean access$100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53e91ec5", new Object[]{photoView})).booleanValue();
        }
        return photoView.canRotate;
    }

    public static /* synthetic */ boolean access$1000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d92a997", new Object[]{photoView})).booleanValue();
        }
        return photoView.hasOverTranslate;
    }

    public static /* synthetic */ boolean access$1002(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f461927", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.hasOverTranslate = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3be49b9", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.canRotate = z;
        return z;
    }

    public static /* synthetic */ boolean access$1100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f12f6", new Object[]{photoView})).booleanValue();
        }
        return photoView.hasMultiTouch;
    }

    public static /* synthetic */ boolean access$1102(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9e6dba8", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.hasMultiTouch = z;
        return z;
    }

    public static /* synthetic */ Runnable access$1200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("8f227da3", new Object[]{photoView});
        }
        return photoView.mClickRunnable;
    }

    public static /* synthetic */ boolean access$1300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8657e5b4", new Object[]{photoView})).booleanValue();
        }
        return photoView.imgLargeWidth;
    }

    public static /* synthetic */ boolean access$1400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49444f13", new Object[]{photoView})).booleanValue();
        }
        return photoView.imgLargeHeight;
    }

    public static /* synthetic */ n access$1500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3dbe6e2f", new Object[]{photoView});
        }
        return photoView.mTranslate;
    }

    public static /* synthetic */ RectF access$1600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("cec880fa", new Object[]{photoView});
        }
        return photoView.mImgRect;
    }

    public static /* synthetic */ RectF access$1700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("aa89fcbb", new Object[]{photoView});
        }
        return photoView.mWidgetRect;
    }

    public static /* synthetic */ void access$1800(PhotoView photoView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8229c", new Object[]{photoView, rectF});
        } else {
            photoView.doTranslateReset(rectF);
        }
    }

    public static /* synthetic */ int access$1900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17e25ddd", new Object[]{photoView})).intValue();
        }
        return photoView.mTranslateX;
    }

    public static /* synthetic */ int access$1902(PhotoView photoView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeecafce", new Object[]{photoView, new Integer(i2)})).intValue();
        }
        photoView.mTranslateX = i2;
        return i2;
    }

    public static /* synthetic */ float access$200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16d58810", new Object[]{photoView})).floatValue();
        }
        return photoView.mDegrees;
    }

    public static /* synthetic */ void access$2000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8336c14", new Object[]{photoView});
        } else {
            photoView.checkRect();
        }
    }

    public static /* synthetic */ float access$202(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e5ec112", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mDegrees = f2;
        return f2;
    }

    public static /* synthetic */ RectF access$2100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("206f1294", new Object[]{photoView});
        }
        return photoView.mCommonRect;
    }

    public static /* synthetic */ float access$2200(PhotoView photoView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c04ca42", new Object[]{photoView, new Float(f2), new Float(f3)})).floatValue();
        }
        return photoView.resistanceScrollByX(f2, f3);
    }

    public static /* synthetic */ int access$2300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20f8a824", new Object[]{photoView})).intValue();
        }
        return photoView.mTranslateY;
    }

    public static /* synthetic */ int access$2302(PhotoView photoView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c89fae67", new Object[]{photoView, new Integer(i2)})).intValue();
        }
        photoView.mTranslateY = i2;
        return i2;
    }

    public static /* synthetic */ float access$2400(PhotoView photoView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ef3e580", new Object[]{photoView, new Float(f2), new Float(f3)})).floatValue();
        }
        return photoView.resistanceScrollByY(f2, f3);
    }

    public static /* synthetic */ List access$2500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("187f3b78", new Object[]{photoView});
        }
        return photoView.mBackRectList;
    }

    public static /* synthetic */ JSONArray access$2600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f6b82c30", new Object[]{photoView});
        }
        return photoView.tagData;
    }

    public static /* synthetic */ PointF access$2700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("3f9daae4", new Object[]{photoView});
        }
        return photoView.mScaleCenter;
    }

    public static /* synthetic */ PointF access$2800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("dc0ba743", new Object[]{photoView});
        }
        return photoView.mRotateCenter;
    }

    public static /* synthetic */ boolean access$2900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b283206f", new Object[]{photoView})).booleanValue();
        }
        return photoView.isZoonUp;
    }

    public static /* synthetic */ boolean access$2902(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68647d4f", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.isZoonUp = z;
        return z;
    }

    public static /* synthetic */ Matrix access$300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("52619f0b", new Object[]{photoView});
        }
        return photoView.mAnimaMatrix;
    }

    public static /* synthetic */ float access$3000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72d42e85", new Object[]{photoView})).floatValue();
        }
        return photoView.mMaxScale;
    }

    public static /* synthetic */ Matrix access$3100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("d0617680", new Object[]{photoView});
        }
        return photoView.mTmpMatrix;
    }

    public static /* synthetic */ RectF access$3200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("989e8ab4", new Object[]{photoView});
        }
        return photoView.mBaseRect;
    }

    public static /* synthetic */ float access$3300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb996aa2", new Object[]{photoView})).floatValue();
        }
        return photoView.mHalfBaseRectWidth;
    }

    public static /* synthetic */ float access$3400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e85d401", new Object[]{photoView})).floatValue();
        }
        return photoView.mHalfBaseRectHeight;
    }

    public static /* synthetic */ RectF access$3500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("2be2fdf7", new Object[]{photoView});
        }
        return photoView.mTmpRect;
    }

    public static /* synthetic */ int access$3700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c74b1021", new Object[]{photoView})).intValue();
        }
        return photoView.mAnimaDuring;
    }

    public static /* synthetic */ int access$3800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a377980", new Object[]{photoView})).intValue();
        }
        return photoView.MAX_FLING_OVER_SCROLL;
    }

    public static /* synthetic */ RectF access$3900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("9ae8ecfb", new Object[]{photoView});
        }
        return photoView.mClip;
    }

    public static /* synthetic */ RectF access$3902(PhotoView photoView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8e5738cc", new Object[]{photoView, rectF});
        }
        photoView.mClip = rectF;
        return rectF;
    }

    public static /* synthetic */ int access$400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cae5ad1", new Object[]{photoView})).intValue();
        }
        return photoView.mMinRotate;
    }

    public static /* synthetic */ Runnable access$4000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("232680be", new Object[]{photoView});
        }
        return photoView.mCompleteCallBack;
    }

    public static /* synthetic */ Runnable access$4002(PhotoView photoView, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d6224c82", new Object[]{photoView, runnable});
        }
        photoView.mCompleteCallBack = runnable;
        return runnable;
    }

    public static /* synthetic */ float access$500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f9ac42d", new Object[]{photoView})).floatValue();
        }
        return photoView.mScale;
    }

    public static /* synthetic */ float access$502(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e410895", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mScale = f2;
        return f2;
    }

    public static /* synthetic */ void access$600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22872d9c", new Object[]{photoView});
        } else {
            photoView.executeTranslate();
        }
    }

    public static /* synthetic */ View.OnClickListener access$700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("eed4cba4", new Object[]{photoView});
        }
        return photoView.mClickListener;
    }

    public static /* synthetic */ View.OnLongClickListener access$800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("7cde14df", new Object[]{photoView});
        }
        return photoView.mLongClick;
    }

    public static /* synthetic */ l access$900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("b35cda9a", new Object[]{photoView});
        }
        return photoView.onPhotoViewLongClickLisenter;
    }

    private void checkRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60700d93", new Object[]{this});
        } else if (!this.hasOverTranslate) {
            mapRect(this.mWidgetRect, this.mImgRect, this.mCommonRect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doTranslateReset(android.graphics.RectF r7) {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.detail.rate.v2.PhotoView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "484f9aa4"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r0 = 1
            r3[r0] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            float r1 = r7.width()
            android.graphics.RectF r2 = r6.mWidgetRect
            float r2 = r2.width()
            r3 = 1073741824(0x40000000, float:2.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x003d
            boolean r1 = r6.isImageCenterWidth(r7)
            if (r1 != 0) goto L_0x0054
            android.graphics.RectF r1 = r6.mWidgetRect
            float r1 = r1.width()
            float r2 = r7.width()
            float r1 = r1 - r2
            float r1 = r1 / r3
            float r2 = r7.left
            float r1 = r1 - r2
            int r1 = (int) r1
            int r1 = -r1
            goto L_0x0055
        L_0x003d:
            float r1 = r7.left
            android.graphics.RectF r2 = r6.mWidgetRect
            float r4 = r2.left
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x004a
            float r1 = r1 - r4
        L_0x0048:
            int r1 = (int) r1
            goto L_0x0055
        L_0x004a:
            float r1 = r7.right
            float r2 = r2.right
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0054
            float r1 = r1 - r2
            goto L_0x0048
        L_0x0054:
            r1 = 0
        L_0x0055:
            float r2 = r7.height()
            android.graphics.RectF r4 = r6.mWidgetRect
            float r4 = r4.height()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x007b
            boolean r2 = r6.isImageCenterHeight(r7)
            if (r2 != 0) goto L_0x0092
            android.graphics.RectF r0 = r6.mWidgetRect
            float r0 = r0.height()
            float r2 = r7.height()
            float r0 = r0 - r2
            float r0 = r0 / r3
            float r7 = r7.top
            float r0 = r0 - r7
            int r7 = (int) r0
            int r0 = -r7
            goto L_0x0092
        L_0x007b:
            float r2 = r7.top
            android.graphics.RectF r3 = r6.mWidgetRect
            float r4 = r3.top
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            float r2 = r2 - r4
            int r0 = (int) r2
            goto L_0x0092
        L_0x0088:
            float r7 = r7.bottom
            float r2 = r3.bottom
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0092
            float r7 = r7 - r2
            int r0 = (int) r7
        L_0x0092:
            if (r1 != 0) goto L_0x0096
            if (r0 == 0) goto L_0x00b2
        L_0x0096:
            com.taobao.detail.rate.v2.PhotoView$n r7 = r6.mTranslate
            android.widget.OverScroller r7 = r7.c
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L_0x00a7
            com.taobao.detail.rate.v2.PhotoView$n r7 = r6.mTranslate
            android.widget.OverScroller r7 = r7.c
            r7.abortAnimation()
        L_0x00a7:
            com.taobao.detail.rate.v2.PhotoView$n r7 = r6.mTranslate
            int r2 = r6.mTranslateX
            int r3 = r6.mTranslateY
            int r1 = -r1
            int r0 = -r0
            r7.k(r2, r3, r1, r0)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.v2.PhotoView.doTranslateReset(android.graphics.RectF):void");
    }

    private void executeTranslate() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6ddd60", new Object[]{this});
            return;
        }
        this.mSynthesisMatrix.set(this.mBaseMatrix);
        this.mSynthesisMatrix.postConcat(this.mAnimaMatrix);
        setImageMatrix(this.mSynthesisMatrix);
        this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
        if (this.mImgRect.width() > this.mWidgetRect.width()) {
            z = true;
        } else {
            z = false;
        }
        this.imgLargeWidth = z;
        if (this.mImgRect.height() > this.mWidgetRect.height()) {
            z2 = true;
        }
        this.imgLargeHeight = z2;
    }

    private static int getDrawableHeight(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b360d579", new Object[]{drawable})).intValue();
        }
        if (drawable == null) {
            return 0;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        if (intrinsicHeight <= 0) {
            return drawable.getBounds().height();
        }
        return intrinsicHeight;
    }

    private static int getDrawableWidth(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46066230", new Object[]{drawable})).intValue();
        }
        if (drawable == null) {
            return 0;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        if (intrinsicWidth <= 0) {
            return drawable.getBounds().width();
        }
        return intrinsicWidth;
    }

    public static ste getImageViewInfo(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ste) ipChange.ipc$dispatch("56889c8f", new Object[]{imageView});
        }
        int[] iArr = new int[2];
        getLocation(imageView, iArr);
        Drawable drawable = imageView.getDrawable();
        Matrix imageMatrix = imageView.getImageMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, getDrawableWidth(drawable), getDrawableHeight(drawable));
        imageMatrix.mapRect(rectF);
        int i2 = iArr[0];
        int i3 = iArr[1];
        RectF rectF2 = new RectF(i2 + rectF.left, i3 + rectF.top, i2 + rectF.right, i3 + rectF.bottom);
        RectF rectF3 = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
        return new ste(rectF2, rectF, rectF3, new RectF(rectF3), new PointF(rectF3.width() / 2.0f, rectF3.height() / 2.0f), 1.0f, 0.0f, imageView.getScaleType());
    }

    private static void getLocation(View view, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980e7a6e", new Object[]{view, iArr});
            return;
        }
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (iArr[0] + 0.5f);
        iArr[1] = (int) (iArr[1] + 0.5f);
    }

    private boolean hasSize(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("465fa2ea", new Object[]{this, drawable})).booleanValue();
        }
        if ((drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) && ((drawable.getMinimumWidth() <= 0 || drawable.getMinimumHeight() <= 0) && (drawable.getBounds().width() <= 0 || drawable.getBounds().height() <= 0))) {
            return false;
        }
        return true;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.mRotateDetector = new hgo(this.mRotateListener);
        this.mDetector = new GestureDetector(getContext(), this.mGestureListener);
        this.mScaleDetector = new ScaleGestureDetector(getContext(), this.mScaleListener);
        float f2 = getResources().getDisplayMetrics().density;
        int i2 = (int) (30.0f * f2);
        this.MAX_OVER_SCROLL = i2;
        this.MAX_FLING_OVER_SCROLL = i2;
        this.MAX_OVER_RESISTANCE = (int) (f2 * 140.0f);
        Paint paint = new Paint();
        this.mBackPaint = paint;
        paint.setColor(Color.parseColor("#80000000"));
        Paint paint2 = new Paint();
        this.mForePaint = paint2;
        paint2.setColor(Color.parseColor("#F0FFFFFF"));
        this.mForePaint.setTextSize(this.textSize * this.mScale);
        this.mBackRectList = new ArrayList();
        this.mForeRectList = new ArrayList();
        this.mMinRotate = 35;
        this.mAnimaDuring = ANIMA_DURING;
        this.mMaxScale = MAX_SCALE;
    }

    private void initBase() {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206f7408", new Object[]{this});
        } else if (this.hasDrawable && this.isKnowSize) {
            this.mBaseMatrix.reset();
            this.mAnimaMatrix.reset();
            this.isZoonUp = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            float f3 = drawableWidth;
            float f4 = drawableHeight;
            this.mBaseRect.set(0.0f, 0.0f, f3, f4);
            int i2 = (width - drawableWidth) / 2;
            int i3 = (height - drawableHeight) / 2;
            float f5 = 1.0f;
            if (drawableWidth > width) {
                f2 = width / f3;
            } else {
                f2 = 1.0f;
            }
            if (drawableHeight > height) {
                f5 = height / f4;
            }
            if (f2 >= f5) {
                f2 = f5;
            }
            this.mBaseMatrix.reset();
            this.mBaseMatrix.postTranslate(i2, i3);
            Matrix matrix = this.mBaseMatrix;
            PointF pointF = this.mScreenCenter;
            matrix.postScale(f2, f2, pointF.x, pointF.y);
            this.mBaseMatrix.mapRect(this.mBaseRect);
            this.mHalfBaseRectWidth = this.mBaseRect.width() / 2.0f;
            this.mHalfBaseRectHeight = this.mBaseRect.height() / 2.0f;
            this.mScaleCenter.set(this.mScreenCenter);
            this.mRotateCenter.set(this.mScaleCenter);
            executeTranslate();
            switch (f.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()]) {
                case 1:
                    initCenter();
                    break;
                case 2:
                    initCenterCrop();
                    break;
                case 3:
                    initCenterInside();
                    break;
                case 4:
                    initFitCenter();
                    break;
                case 5:
                    initFitStart();
                    break;
                case 6:
                    initFitEnd();
                    break;
                case 7:
                    initFitXY();
                    break;
            }
            this.isInit = true;
            if (this.mFromInfo != null && System.currentTimeMillis() - this.mInfoTime < this.MAX_ANIM_FROM_WAITE) {
                animaFrom(this.mFromInfo);
            }
            this.mFromInfo = null;
        }
    }

    private void initCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc44b8c", new Object[]{this});
        } else if (this.hasDrawable && this.isKnowSize) {
            Drawable drawable = getDrawable();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            float f2 = drawableWidth;
            if (f2 > this.mWidgetRect.width() || drawableHeight > this.mWidgetRect.height()) {
                float width = f2 / this.mImgRect.width();
                float height = drawableHeight / this.mImgRect.height();
                if (width <= height) {
                    width = height;
                }
                this.mScale = width;
                Matrix matrix = this.mAnimaMatrix;
                PointF pointF = this.mScreenCenter;
                matrix.postScale(width, width, pointF.x, pointF.y);
                executeTranslate();
                resetBase();
            }
        }
    }

    private void initCenterCrop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5897bc", new Object[]{this});
        } else if (this.mImgRect.width() < this.mWidgetRect.width() || this.mImgRect.height() < this.mWidgetRect.height()) {
            float width = this.mWidgetRect.width() / this.mImgRect.width();
            float height = this.mWidgetRect.height() / this.mImgRect.height();
            if (width <= height) {
                width = height;
            }
            this.mScale = width;
            Matrix matrix = this.mAnimaMatrix;
            PointF pointF = this.mScreenCenter;
            matrix.postScale(width, width, pointF.x, pointF.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initCenterInside() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf481e8", new Object[]{this});
        } else if (this.mImgRect.width() > this.mWidgetRect.width() || this.mImgRect.height() > this.mWidgetRect.height()) {
            float width = this.mWidgetRect.width() / this.mImgRect.width();
            float height = this.mWidgetRect.height() / this.mImgRect.height();
            if (width >= height) {
                width = height;
            }
            this.mScale = width;
            Matrix matrix = this.mAnimaMatrix;
            PointF pointF = this.mScreenCenter;
            matrix.postScale(width, width, pointF.x, pointF.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initFitCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92aea1d", new Object[]{this});
        } else if (this.mImgRect.width() < this.mWidgetRect.width()) {
            float width = this.mWidgetRect.width() / this.mImgRect.width();
            this.mScale = width;
            Matrix matrix = this.mAnimaMatrix;
            PointF pointF = this.mScreenCenter;
            matrix.postScale(width, width, pointF.x, pointF.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initFitEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714adbc1", new Object[]{this});
            return;
        }
        initFitCenter();
        float f2 = this.mWidgetRect.bottom - this.mImgRect.bottom;
        this.mTranslateY = (int) (this.mTranslateY + f2);
        this.mAnimaMatrix.postTranslate(0.0f, f2);
        executeTranslate();
        resetBase();
    }

    private void initFitStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8f8008", new Object[]{this});
            return;
        }
        initFitCenter();
        float f2 = -this.mImgRect.top;
        this.mAnimaMatrix.postTranslate(0.0f, f2);
        executeTranslate();
        resetBase();
        this.mTranslateY = (int) (this.mTranslateY + f2);
    }

    private void initFitXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb20f29", new Object[]{this});
            return;
        }
        float width = this.mWidgetRect.width() / this.mImgRect.width();
        float height = this.mWidgetRect.height() / this.mImgRect.height();
        Matrix matrix = this.mAnimaMatrix;
        PointF pointF = this.mScreenCenter;
        matrix.postScale(width, height, pointF.x, pointF.y);
        executeTranslate();
        resetBase();
    }

    public static /* synthetic */ Object ipc$super(PhotoView photoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2079798281:
                super.setOnClickListener((View.OnClickListener) objArr[0]);
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 891063010:
                super.setAdjustViewBounds(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/v2/PhotoView");
        }
    }

    private boolean isImageCenterHeight(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ebb27e9", new Object[]{this, rectF})).booleanValue();
        }
        if (Math.abs(Math.round(rectF.top) - ((this.mWidgetRect.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    private boolean isImageCenterWidth(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c771fc", new Object[]{this, rectF})).booleanValue();
        }
        if (Math.abs(Math.round(rectF.left) - ((this.mWidgetRect.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    private void mapRect(RectF rectF, RectF rectF2, RectF rectF3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bded1f1a", new Object[]{this, rectF, rectF2, rectF3});
            return;
        }
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 <= f3) {
            f2 = f3;
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 >= f5) {
            f4 = f5;
        }
        if (f2 > f4) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        float f6 = rectF.top;
        float f7 = rectF2.top;
        if (f6 <= f7) {
            f6 = f7;
        }
        float f8 = rectF.bottom;
        float f9 = rectF2.bottom;
        if (f8 >= f9) {
            f8 = f9;
        }
        if (f6 > f8) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            rectF3.set(f2, f6, f4, f8);
        }
    }

    private void notifyCacheDrawableLoaded(Drawable drawable) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449bf487", new Object[]{this, drawable});
        } else if (!this.mHasNotifyCacheLoaded && (drawable instanceof uwn) && ((uwn) drawable).h() && (gVar = this.mCacheDrawableListener) != null) {
            gVar.a();
            this.mHasNotifyCacheLoaded = true;
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mAnimaMatrix.reset();
        executeTranslate();
        this.mScale = 1.0f;
        this.mTranslateX = 0;
        this.mTranslateY = 0;
    }

    private void resetBase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f537d47", new Object[]{this});
            return;
        }
        Drawable drawable = getDrawable();
        this.mBaseRect.set(0.0f, 0.0f, getDrawableWidth(drawable), getDrawableHeight(drawable));
        this.mBaseMatrix.set(this.mSynthesisMatrix);
        this.mBaseMatrix.mapRect(this.mBaseRect);
        this.mHalfBaseRectWidth = this.mBaseRect.width() / 2.0f;
        this.mHalfBaseRectHeight = this.mBaseRect.height() / 2.0f;
        this.mScale = 1.0f;
        this.mTranslateX = 0;
        this.mTranslateY = 0;
        this.mAnimaMatrix.reset();
    }

    private float resistanceScrollByX(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b791df12", new Object[]{this, new Float(f2), new Float(f3)})).floatValue();
        }
        return f3 * (Math.abs(Math.abs(f2) - this.MAX_OVER_RESISTANCE) / this.MAX_OVER_RESISTANCE);
    }

    private float resistanceScrollByY(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec781a53", new Object[]{this, new Float(f2), new Float(f3)})).floatValue();
        }
        return f3 * (Math.abs(Math.abs(f2) - this.MAX_OVER_RESISTANCE) / this.MAX_OVER_RESISTANCE);
    }

    public void animaFrom(ste steVar) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56f313", new Object[]{this, steVar});
        } else if (this.isInit) {
            reset();
            ste info = getInfo();
            float width = steVar.b.width() / info.b.width();
            float height = steVar.b.height() / info.b.height();
            if (width >= height) {
                width = height;
            }
            RectF rectF = steVar.f28262a;
            float width2 = rectF.left + (rectF.width() / 2.0f);
            RectF rectF2 = steVar.f28262a;
            float height2 = rectF2.top + (rectF2.height() / 2.0f);
            RectF rectF3 = info.f28262a;
            float width3 = rectF3.left + (rectF3.width() / 2.0f);
            RectF rectF4 = info.f28262a;
            float height3 = rectF4.top + (rectF4.height() / 2.0f);
            this.mAnimaMatrix.reset();
            float f2 = width2 - width3;
            float f3 = height2 - height3;
            this.mAnimaMatrix.postTranslate(f2, f3);
            this.mAnimaMatrix.postScale(width, width, width2, height2);
            this.mAnimaMatrix.postRotate(steVar.d, width2, height2);
            executeTranslate();
            this.mScaleCenter.set(width2, height2);
            this.mRotateCenter.set(width2, height2);
            this.mTranslate.k(0, 0, (int) (-f2), (int) (-f3));
            this.mTranslate.j(width, 1.0f);
            this.mTranslate.h((int) steVar.d, 0);
            if (steVar.c.width() < steVar.b.width() || steVar.c.height() < steVar.b.height()) {
                float width4 = steVar.c.width() / steVar.b.width();
                float height4 = steVar.c.height() / steVar.b.height();
                if (width4 > 1.0f) {
                    width4 = 1.0f;
                }
                if (height4 > 1.0f) {
                    height4 = 1.0f;
                }
                ImageView.ScaleType scaleType = steVar.e;
                if (scaleType == ImageView.ScaleType.FIT_START) {
                    hVar = new m();
                } else if (scaleType == ImageView.ScaleType.FIT_END) {
                    hVar = new i();
                } else {
                    hVar = new k();
                }
                this.mTranslate.f(width4, height4, 1.0f - width4, 1.0f - height4, this.mAnimaDuring / 3, hVar);
                Matrix matrix = this.mTmpMatrix;
                RectF rectF5 = this.mImgRect;
                matrix.setScale(width4, height4, (rectF5.left + rectF5.right) / 2.0f, hVar.a());
                this.mTmpMatrix.mapRect(this.mTranslate.l, this.mImgRect);
                this.mClip = this.mTranslate.l;
            }
            this.mTranslate.d();
        } else {
            this.mFromInfo = steVar;
            this.mInfoTime = System.currentTimeMillis();
        }
    }

    public void animaTo(ste steVar, Runnable runnable) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b003c9e2", new Object[]{this, steVar, runnable});
        } else if (this.isInit) {
            this.mTranslate.e();
            this.mTranslateX = 0;
            this.mTranslateY = 0;
            RectF rectF = steVar.f28262a;
            float width = rectF.left + (rectF.width() / 2.0f);
            RectF rectF2 = steVar.f28262a;
            float height = rectF2.top + (rectF2.height() / 2.0f);
            PointF pointF = this.mScaleCenter;
            RectF rectF3 = this.mImgRect;
            float width2 = rectF3.left + (rectF3.width() / 2.0f);
            RectF rectF4 = this.mImgRect;
            pointF.set(width2, rectF4.top + (rectF4.height() / 2.0f));
            this.mRotateCenter.set(this.mScaleCenter);
            PointF pointF2 = this.mScaleCenter;
            this.mAnimaMatrix.postRotate(-this.mDegrees, pointF2.x, pointF2.y);
            this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
            float width3 = steVar.b.width() / this.mBaseRect.width();
            float height2 = steVar.b.height() / this.mBaseRect.height();
            if (width3 <= height2) {
                width3 = height2;
            }
            Matrix matrix = this.mAnimaMatrix;
            float f2 = this.mDegrees;
            PointF pointF3 = this.mScaleCenter;
            matrix.postRotate(f2, pointF3.x, pointF3.y);
            this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
            this.mDegrees %= 360.0f;
            n nVar = this.mTranslate;
            PointF pointF4 = this.mScaleCenter;
            nVar.k(0, 0, (int) (width - pointF4.x), (int) (height - pointF4.y));
            this.mTranslate.j(this.mScale, width3);
            this.mTranslate.i((int) this.mDegrees, (int) steVar.d, (this.mAnimaDuring * 2) / 3);
            if (steVar.c.width() < steVar.f28262a.width() || steVar.c.height() < steVar.f28262a.height()) {
                float width4 = steVar.c.width() / steVar.f28262a.width();
                float height3 = steVar.c.height() / steVar.f28262a.height();
                if (width4 > 1.0f) {
                    width4 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                ImageView.ScaleType scaleType = steVar.e;
                if (scaleType == ImageView.ScaleType.FIT_START) {
                    hVar = new m();
                } else if (scaleType == ImageView.ScaleType.FIT_END) {
                    hVar = new i();
                } else {
                    hVar = new k();
                }
                postDelayed(new e(width4, height3, hVar), this.mAnimaDuring / 2);
            }
            this.mCompleteCallBack = runnable;
            this.mTranslate.d();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.hasMultiTouch) {
            return true;
        }
        return canScrollHorizontallySelf(i2);
    }

    public boolean canScrollHorizontallySelf(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39322be3", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (this.mImgRect.width() <= this.mWidgetRect.width()) {
            return false;
        }
        if (f2 < 0.0f && Math.round(this.mImgRect.left) - f2 >= this.mWidgetRect.left) {
            return false;
        }
        if (f2 <= 0.0f || Math.round(this.mImgRect.right) - f2 > this.mWidgetRect.right) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.hasMultiTouch) {
            return true;
        }
        return canScrollVerticallySelf(i2);
    }

    public boolean canScrollVerticallySelf(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4af8de11", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (this.mImgRect.height() <= this.mWidgetRect.height()) {
            return false;
        }
        if (f2 < 0.0f && Math.round(this.mImgRect.top) - f2 >= this.mWidgetRect.top) {
            return false;
        }
        if (f2 <= 0.0f || Math.round(this.mImgRect.bottom) - f2 > this.mWidgetRect.bottom) {
            return true;
        }
        return false;
    }

    public void disableRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72bb96a", new Object[]{this});
        } else {
            this.isRotateEnable = false;
        }
    }

    public void disenable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68ddb98", new Object[]{this});
        } else {
            this.isEnable = false;
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isEnable) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (motionEvent.getPointerCount() >= 2) {
            this.hasMultiTouch = true;
            this.mScale *= 1.001f;
        }
        this.mDetector.onTouchEvent(motionEvent);
        if (this.isRotateEnable) {
            this.mRotateDetector.b(motionEvent);
        }
        this.mScaleDetector.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            onUp(motionEvent);
        }
        return true;
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        RectF rectF = this.mClip;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.mClip = null;
        }
        super.draw(canvas);
    }

    public void enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
        } else {
            this.isEnable = true;
        }
    }

    public void enableRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed407645", new Object[]{this});
        } else {
            this.isRotateEnable = true;
        }
    }

    public int getAnimaDuring() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfcda495", new Object[]{this})).intValue();
        }
        return this.mAnimaDuring;
    }

    public int getDefaultAnimaDuring() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fadbc140", new Object[]{this})).intValue();
        }
        return ANIMA_DURING;
    }

    public ste getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ste) ipChange.ipc$dispatch("341a79dd", new Object[]{this});
        }
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        getLocation(this, iArr);
        int i2 = iArr[0];
        RectF rectF2 = this.mImgRect;
        int i3 = iArr[1];
        rectF.set(i2 + rectF2.left, i3 + rectF2.top, i2 + rectF2.right, i3 + rectF2.bottom);
        return new ste(rectF, this.mImgRect, this.mWidgetRect, this.mBaseRect, this.mScreenCenter, this.mScale, this.mDegrees, this.mScaleType);
    }

    public float getMaxScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c1bb633", new Object[]{this})).floatValue();
        }
        return this.mMaxScale;
    }

    public boolean isScaled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f442e4af", new Object[]{this})).booleanValue();
        }
        if (Math.abs(this.mScale - 1.0f) > vu3.b.GEO_NOT_SUPPORT) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!this.hasDrawable) {
            super.onMeasure(i2, i3);
        } else {
            Drawable drawable = getDrawable();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            int i4 = layoutParams.width;
            if (i4 != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || drawableWidth <= size) : mode == 0) {
                size = drawableWidth;
            }
            int i5 = layoutParams.height;
            if (i5 != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || drawableHeight <= size2) : mode2 == 0) {
                size2 = drawableHeight;
            }
            if (drawableHeight > 0 && size2 > 0 && drawableWidth > 0 && this.mAdjustViewBounds) {
                float f2 = drawableWidth;
                float f3 = drawableHeight;
                float f4 = size;
                float f5 = size2;
                if (f2 / f3 != f4 / f5) {
                    float f6 = f5 / f3;
                    float f7 = f4 / f2;
                    if (f6 >= f7) {
                        f6 = f7;
                    }
                    if (i4 != -1) {
                        size = (int) (f2 * f6);
                    }
                    if (i5 != -1) {
                        size2 = (int) (f3 * f6);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        this.mWidgetRect.set(0.0f, 0.0f, i2, i3);
        this.mScreenCenter.set(i2 / 2, i3 / 2);
        if (!this.isKnowSize) {
            this.isKnowSize = true;
            initBase();
        }
    }

    public void onUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64597736", new Object[]{this, motionEvent});
            return;
        }
        n nVar = this.mTranslate;
        if (!nVar.f10356a) {
            if (this.canRotate || this.mDegrees % 90.0f != 0.0f) {
                float f2 = this.mDegrees;
                float f3 = ((int) (f2 / 90.0f)) * 90;
                float f4 = f2 % 90.0f;
                if (f4 > 45.0f) {
                    f3 += 90.0f;
                } else if (f4 < -45.0f) {
                    f3 -= 90.0f;
                }
                nVar.h((int) f2, (int) f3);
                this.mDegrees = f3;
            }
            float f5 = this.mScale;
            if (f5 < 1.0f) {
                this.mTranslate.j(f5, 1.0f);
                f5 = 1.0f;
            } else {
                float f6 = this.mMaxScale;
                if (f5 > f6) {
                    this.mTranslate.j(f5, f6);
                    f5 = f6;
                }
            }
            RectF rectF = this.mImgRect;
            float width = rectF.left + (rectF.width() / 2.0f);
            RectF rectF2 = this.mImgRect;
            float height = rectF2.top + (rectF2.height() / 2.0f);
            this.mScaleCenter.set(width, height);
            this.mRotateCenter.set(width, height);
            this.mTranslateX = 0;
            this.mTranslateY = 0;
            this.mTmpMatrix.reset();
            Matrix matrix = this.mTmpMatrix;
            RectF rectF3 = this.mBaseRect;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.mTmpMatrix.postTranslate(width - this.mHalfBaseRectWidth, height - this.mHalfBaseRectHeight);
            this.mTmpMatrix.postScale(f5, f5, width, height);
            this.mTmpMatrix.postRotate(this.mDegrees, width, height);
            this.mTmpMatrix.mapRect(this.mTmpRect, this.mBaseRect);
            doTranslateReset(this.mTmpRect);
            this.mTranslate.d();
        }
    }

    public void rotate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4bb79e", new Object[]{this, new Float(f2)});
            return;
        }
        this.mDegrees += f2;
        RectF rectF = this.mWidgetRect;
        int width = (int) (rectF.left + (rectF.width() / 2.0f));
        RectF rectF2 = this.mWidgetRect;
        this.mAnimaMatrix.postRotate(f2, width, (int) (rectF2.top + (rectF2.height() / 2.0f)));
        executeTranslate();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351c8ae2", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setAdjustViewBounds(z);
        this.mAdjustViewBounds = z;
    }

    public void setAnimaDuring(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde3f7ad", new Object[]{this, new Integer(i2)});
        } else {
            this.mAnimaDuring = i2;
        }
    }

    public void setCacheListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1248a7ee", new Object[]{this, gVar});
        } else {
            this.mCacheDrawableListener = gVar;
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.hasDrawable = false;
            return;
        }
        notifyCacheDrawableLoaded(drawable);
        if (hasSize(drawable)) {
            if (!this.hasDrawable) {
                this.hasDrawable = true;
            }
            initBase();
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i2)});
            return;
        }
        try {
            drawable = getResources().getDrawable(i2);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.mTranslate.c(interpolator);
        }
    }

    public void setMaxAnimFromWaiteTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d0bb7c", new Object[]{this, new Integer(i2)});
        } else {
            this.MAX_ANIM_FROM_WAITE = i2;
        }
    }

    public void setMaxScale(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a31e051", new Object[]{this, new Float(f2)});
        } else {
            this.mMaxScale = f2;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        super.setOnClickListener(onClickListener);
        this.mClickListener = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mLongClick = onLongClickListener;
        }
    }

    public void setOnPhotoViewLongClickLisenter(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa5427c", new Object[]{this, lVar});
        } else {
            this.onPhotoViewLongClickLisenter = lVar;
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (scaleType != ImageView.ScaleType.MATRIX && scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            if (this.isInit) {
                initBase();
            }
        }
    }

    public void setTagData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b2d0e7", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.tagData = jSONObject.getJSONArray("tags");
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        JSONArray jSONArray = this.tagData;
        if (jSONArray != null && jSONArray.size() > 0) {
            this.mBackRectList.clear();
            this.mForeRectList.clear();
            for (int i2 = 0; i2 < this.tagData.size(); i2++) {
                JSONObject jSONObject = this.tagData.getJSONObject(i2);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("position");
                if (!TextUtils.isEmpty(string2)) {
                    String[] split = string2.split(",");
                    if (split.length == 2) {
                        int floatValue = (int) (((Float.valueOf(split[0]).floatValue() * this.mBaseRect.width()) + this.mBaseRect.left) * 1.0f);
                        int floatValue2 = (int) (((Float.valueOf(split[1]).floatValue() * this.mBaseRect.height()) + this.mBaseRect.top) * 1.0f);
                        Rect rect = new Rect();
                        this.mForePaint.setTextSize(1.0f * this.textSize);
                        this.mForePaint.getTextBounds(string, 0, string.length(), rect);
                        float f2 = floatValue;
                        float f3 = floatValue2;
                        Rect rect2 = new Rect((int) (f2 - 30.0f), (int) ((floatValue2 - rect.height()) - 20.0f), (int) (floatValue + rect.width() + 30.0f), (int) (30.0f + f3));
                        canvas.drawRect(rect2, this.mBackPaint);
                        canvas.drawText(string, f2, f3, this.mForePaint);
                        this.mBackRectList.add(rect2);
                        this.mForeRectList.add(rect);
                    }
                }
            }
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }
}
