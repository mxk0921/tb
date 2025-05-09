package com.taobao.android.detail.ttdetail.transfer.widget.avatar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bw6;
import tb.f7l;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AvatarsAnimView extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AvatarAnimationView";
    private double animationDuration;
    private double animationIntervalTime;
    private AnimatorSet animatorSet;
    private JSONArray avatarsData;
    private int mFirstToLastDistance;
    private int mLastToPreDistance;
    private b mRunningAnimRunnable;
    private int isAnimationOn = 1;
    private int isInfinite = 1;
    private List<DXNativeFrameLayout> mChildFrameLayout = new ArrayList();
    private Map<DXNativeFrameLayout, Float> mChildTranx = new HashMap();
    private List<Rect> mChildInitPos = new ArrayList();
    private int mCurLastInViewIndex = 0;
    private int mLastDataIndex = -1;
    private boolean mIsAppear = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AvatarsAnimView.access$000(AvatarsAnimView.this);
            AvatarsAnimView.this.setIsAppear(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXNativeFrameLayout f6969a;

            public a(DXNativeFrameLayout dXNativeFrameLayout) {
                this.f6969a = dXNativeFrameLayout;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    AvatarsAnimView.access$202(AvatarsAnimView.this, null);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                AvatarsAnimView.this.bringChildToFront(this.f6969a);
                int access$700 = AvatarsAnimView.access$700(AvatarsAnimView.this) + 1;
                if (access$700 < AvatarsAnimView.access$800(AvatarsAnimView.this).size()) {
                    AvatarsAnimView.access$702(AvatarsAnimView.this, access$700);
                } else if (AvatarsAnimView.access$900(AvatarsAnimView.this) == 1) {
                    AvatarsAnimView.access$702(AvatarsAnimView.this, 0);
                } else {
                    return;
                }
                ((TUrlImageView) this.f6969a.getChildAt(0)).setImageUrl(AvatarsAnimView.access$800(AvatarsAnimView.this).getString(AvatarsAnimView.access$700(AvatarsAnimView.this)));
                DXNativeFrameLayout dXNativeFrameLayout = this.f6969a;
                dXNativeFrameLayout.setTranslationX(dXNativeFrameLayout.getTranslationX() + AvatarsAnimView.access$1000(AvatarsAnimView.this));
                this.f6969a.setAlpha(1.0f);
                AvatarsAnimView.access$202(AvatarsAnimView.this, null);
                AvatarsAnimView.access$1100(AvatarsAnimView.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }
        }

        static {
            t2o.a(912262727);
        }

        private b() {
        }

        public /* synthetic */ b(AvatarsAnimView avatarsAnimView, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AvatarsAnimView.access$100(AvatarsAnimView.this) == null || !AvatarsAnimView.access$100(AvatarsAnimView.this).isRunning()) {
                AvatarsAnimView.access$102(AvatarsAnimView.this, new AnimatorSet());
                ArrayList arrayList = new ArrayList();
                int size = AvatarsAnimView.access$300(AvatarsAnimView.this).size();
                int access$400 = AvatarsAnimView.access$400(AvatarsAnimView.this);
                int i = access$400 + 1;
                if (i >= AvatarsAnimView.access$300(AvatarsAnimView.this).size()) {
                    AvatarsAnimView.access$402(AvatarsAnimView.this, 0);
                } else {
                    AvatarsAnimView.access$402(AvatarsAnimView.this, i);
                }
                DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get((access$400 + 2) % size);
                DXNativeFrameLayout dXNativeFrameLayout2 = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get(AvatarsAnimView.access$400(AvatarsAnimView.this));
                for (int i2 = 0; i2 < AvatarsAnimView.access$300(AvatarsAnimView.this).size(); i2++) {
                    DXNativeFrameLayout dXNativeFrameLayout3 = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get(i2);
                    if (dXNativeFrameLayout3.equals(dXNativeFrameLayout2)) {
                        float translationX = dXNativeFrameLayout3.getTranslationX();
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "translationX", translationX, (translationX - AvatarsAnimView.access$500(AvatarsAnimView.this)) + (dXNativeFrameLayout3.getWidth() / 2)));
                    } else if (dXNativeFrameLayout3.equals(dXNativeFrameLayout)) {
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "alpha", 1.0f, 0.0f));
                    } else {
                        float translationX2 = dXNativeFrameLayout3.getTranslationX();
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "translationX", translationX2, translationX2 - (dXNativeFrameLayout3.getWidth() / 2)));
                    }
                }
                AvatarsAnimView.access$100(AvatarsAnimView.this).playTogether(arrayList);
                AvatarsAnimView.access$100(AvatarsAnimView.this).setDuration((long) AvatarsAnimView.access$600(AvatarsAnimView.this));
                AvatarsAnimView.access$100(AvatarsAnimView.this).addListener(new a(dXNativeFrameLayout));
                AvatarsAnimView.access$100(AvatarsAnimView.this).start();
            } else {
                AvatarsAnimView.access$202(AvatarsAnimView.this, null);
            }
        }
    }

    static {
        t2o.a(912262725);
    }

    public AvatarsAnimView(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c2b976", new Object[]{avatarsAnimView});
        } else {
            avatarsAnimView.initPos();
        }
    }

    public static /* synthetic */ AnimatorSet access$100(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("497ea256", new Object[]{avatarsAnimView});
        }
        return avatarsAnimView.animatorSet;
    }

    public static /* synthetic */ int access$1000(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("517100da", new Object[]{avatarsAnimView})).intValue();
        }
        return avatarsAnimView.mFirstToLastDistance;
    }

    public static /* synthetic */ AnimatorSet access$102(AvatarsAnimView avatarsAnimView, AnimatorSet animatorSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("3e94011f", new Object[]{avatarsAnimView, animatorSet});
        }
        avatarsAnimView.animatorSet = animatorSet;
        return animatorSet;
    }

    public static /* synthetic */ void access$1100(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80226b06", new Object[]{avatarsAnimView});
        } else {
            avatarsAnimView.recycleTransImage();
        }
    }

    public static /* synthetic */ b access$202(AvatarsAnimView avatarsAnimView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8daf384", new Object[]{avatarsAnimView, bVar});
        }
        avatarsAnimView.mRunningAnimRunnable = bVar;
        return bVar;
    }

    public static /* synthetic */ List access$300(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e3bda14", new Object[]{avatarsAnimView});
        }
        return avatarsAnimView.mChildFrameLayout;
    }

    public static /* synthetic */ int access$400(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("128861e5", new Object[]{avatarsAnimView})).intValue();
        }
        return avatarsAnimView.mCurLastInViewIndex;
    }

    public static /* synthetic */ int access$402(AvatarsAnimView avatarsAnimView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff76fb46", new Object[]{avatarsAnimView, new Integer(i)})).intValue();
        }
        avatarsAnimView.mCurLastInViewIndex = i;
        return i;
    }

    public static /* synthetic */ int access$500(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4139cc04", new Object[]{avatarsAnimView})).intValue();
        }
        return avatarsAnimView.mLastToPreDistance;
    }

    public static /* synthetic */ double access$600(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6feb361e", new Object[]{avatarsAnimView})).doubleValue();
        }
        return avatarsAnimView.animationDuration;
    }

    public static /* synthetic */ int access$700(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e9ca042", new Object[]{avatarsAnimView})).intValue();
        }
        return avatarsAnimView.mLastDataIndex;
    }

    public static /* synthetic */ int access$702(AvatarsAnimView avatarsAnimView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5ea8889", new Object[]{avatarsAnimView, new Integer(i)})).intValue();
        }
        avatarsAnimView.mLastDataIndex = i;
        return i;
    }

    public static /* synthetic */ JSONArray access$800(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("50ab4210", new Object[]{avatarsAnimView});
        }
        return avatarsAnimView.avatarsData;
    }

    public static /* synthetic */ int access$900(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbff7480", new Object[]{avatarsAnimView})).intValue();
        }
        return avatarsAnimView.isInfinite;
    }

    private void dumpTrans(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cc54a5", new Object[]{this, str});
        } else if (bw6.a(tq4.d(this))) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) getChildAt(i);
                if (this.mChildFrameLayout.size() > 0 && !dXNativeFrameLayout.equals(this.mChildFrameLayout.get(i))) {
                    tgh.b(TAG, "dumpTrans: animaParam  view not equal:" + i);
                }
                tgh.b(TAG, "dumpTrans:" + str + ": animaParam view:(" + i + f7l.BRACKET_END_STR + dXNativeFrameLayout.hashCode() + ", transX:" + dXNativeFrameLayout.getTranslationX() + ", left:" + dXNativeFrameLayout.getLeft() + ", alpha:" + dXNativeFrameLayout.getAlpha());
            }
        }
    }

    private void initPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373c4dab", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        if (this.mChildFrameLayout.size() == childCount) {
            for (int i = 0; i < childCount; i++) {
                if (i < this.avatarsData.size()) {
                    DXNativeFrameLayout dXNativeFrameLayout = this.mChildFrameLayout.get(i);
                    dXNativeFrameLayout.setTranslationX(0.0f);
                    dXNativeFrameLayout.setAlpha(1.0f);
                    removeView(dXNativeFrameLayout);
                    addView(dXNativeFrameLayout, dXNativeFrameLayout.getLayoutParams());
                    ((TUrlImageView) dXNativeFrameLayout.getChildAt(0)).setImageUrl(this.avatarsData.getString(i));
                }
            }
        } else {
            this.mChildFrameLayout.clear();
            for (int i2 = 0; i2 < childCount; i2++) {
                DXNativeFrameLayout dXNativeFrameLayout2 = (DXNativeFrameLayout) getChildAt(i2);
                this.mChildInitPos.add(new Rect(dXNativeFrameLayout2.getLeft(), dXNativeFrameLayout2.getTop(), dXNativeFrameLayout2.getRight(), dXNativeFrameLayout2.getBottom()));
                this.mChildFrameLayout.add(dXNativeFrameLayout2);
            }
        }
        int i3 = childCount - 2;
        this.mCurLastInViewIndex = i3;
        this.mLastDataIndex = childCount - 1;
        Rect rect = this.mChildInitPos.get(childCount - 1);
        Rect rect2 = this.mChildInitPos.get(i3);
        this.mLastToPreDistance = (rect.right - rect2.right) + (rect2.width() / 2);
        this.mFirstToLastDistance = rect.right - this.mChildInitPos.get(0).right;
        dumpTrans("initPos");
    }

    public static /* synthetic */ Object ipc$super(AvatarsAnimView avatarsAnimView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/transfer/widget/avatar/AvatarsAnimView");
        }
    }

    private void recycleTransImage() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7753740d", new Object[]{this});
        } else if (!this.mIsAppear) {
            tgh.b(TAG, "recycleTransImage mIsAppear false");
        } else if (this.isAnimationOn == 0 || (jSONArray = this.avatarsData) == null || jSONArray.size() < this.mChildFrameLayout.size() || this.animationIntervalTime == vu3.b.GEO_NOT_SUPPORT || this.animationDuration == vu3.b.GEO_NOT_SUPPORT) {
            tgh.b(TAG, "recycleTransImage data null");
        } else if (this.mRunningAnimRunnable != null) {
            tgh.b(TAG, "recycleTransImage mRunningAnimRunnable not null");
        } else {
            b bVar = new b(this, null);
            this.mRunningAnimRunnable = bVar;
            this.mHandler.postDelayed(bVar, (long) this.animationIntervalTime);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        tgh.b(TAG, "onAttachedToWindow this:" + hashCode());
        this.mHandler.post(new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        StringBuilder sb = new StringBuilder("onDetachedFromWindow this:");
        sb.append(hashCode());
        sb.append(",animatorSet");
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            obj = Integer.valueOf(animatorSet.hashCode());
        } else {
            obj = "null";
        }
        sb.append(obj);
        tgh.b(TAG, sb.toString());
        setIsAppear(false);
    }

    public void setData(double d, double d2, JSONArray jSONArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743e377b", new Object[]{this, new Double(d), new Double(d2), jSONArray, new Integer(i), new Integer(i2)});
            return;
        }
        this.animationDuration = d;
        this.animationIntervalTime = d2;
        this.avatarsData = jSONArray;
        this.isAnimationOn = i;
        this.isInfinite = i2;
    }

    public void setIsAppear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11be5ec", new Object[]{this, new Boolean(z)});
        } else if (this.mIsAppear != z) {
            tgh.b(TAG, "setIsAppear mIsAppear:" + z);
            this.mIsAppear = z;
            if (!z) {
                b bVar = this.mRunningAnimRunnable;
                if (bVar != null) {
                    this.mHandler.removeCallbacks(bVar);
                    this.mRunningAnimRunnable = null;
                    return;
                }
                return;
            }
            recycleTransImage();
        }
    }

    public AvatarsAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarsAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
