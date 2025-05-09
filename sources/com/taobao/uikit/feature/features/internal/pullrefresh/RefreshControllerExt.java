package com.taobao.uikit.feature.features.internal.pullrefresh;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.features.PullToRefreshFeatureExt;
import com.taobao.uikit.feature.view.TScrollView;
import java.util.Date;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RefreshControllerExt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DISTANCE_GAP = 20;
    public static final int DONE = 3;
    private static final int INVALID_POINTER = -1;
    public static final int JUMPED = 5;
    public static final int JUMPING = 4;
    public static final int PULL_TO_REFRESH = 1;
    public static final int REFRESHING = 2;
    public static final int RELEASE_TO_REFRESH = 0;
    private Context mContext;
    private int mDistance;
    private IViewEdgeJudge mEdgeJudger;
    private RefreshHeadViewManager mHeaderViewManager;
    private boolean mIsBack;
    private boolean mIsRecored;
    private float mLastMotionX;
    private float mLastMotionY;
    private int mPreDistance;
    private PullToRefreshFeatureExt.OnPullToRefreshListenerExt mPullRefreshListener;
    private Scroller mScroller;
    private int mStartX;
    private int mStartY;
    public int mDistanceToJump = 50;
    private boolean mEnableJump = false;
    private boolean mDownPullFinish = false;
    private int mPositionY = 0;
    private int mPositionX = 0;
    private int mPrePositionY = 0;
    private int mPrePositionX = 0;
    private int mPreActivePointerId = -1;
    public int mActivePointerId = -1;
    private boolean mIsHeadViewHeightContainLogoImage = false;
    private int mPullDownDistance = 0;
    private boolean mIsMultiPointer = false;
    private float mAlpha = 1.0f;
    private boolean mEnableScroll = true;
    private int mState = 3;

    static {
        t2o.a(931135575);
    }

    public RefreshControllerExt(Context context, Scroller scroller, IViewEdgeJudge iViewEdgeJudge) {
        this.mContext = context;
        this.mScroller = scroller;
        this.mEdgeJudger = iViewEdgeJudge;
    }

    private boolean JudgeArrivedRecoredEdge(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f191f9", new Object[]{this, motionEvent})).booleanValue();
        }
        IViewEdgeJudge iViewEdgeJudge = this.mEdgeJudger;
        if (iViewEdgeJudge == null || !iViewEdgeJudge.hasArrivedTopEdge() || this.mIsRecored) {
            return false;
        }
        this.mIsRecored = true;
        this.mStartY = (int) motionEvent.getY();
        this.mStartX = (int) motionEvent.getX();
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (this.mActivePointerId == -1) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            this.mLastMotionY = motionEvent.getY();
            this.mLastMotionX = motionEvent.getX();
            this.mPreActivePointerId = this.mActivePointerId;
        }
        return true;
    }

    private void changeHeaderAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588897b8", new Object[]{this, new Float(f)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.changeHeaderAlpha(f);
        }
    }

    private void changeHeaderProgressBarState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cb2654", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.changeProgressBarState(i);
        }
    }

    private void changeHeaderViewByState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766195ff", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.changeHeaderViewByState(this.mState);
            int i = this.mState;
            if (i == 1 && this.mIsBack) {
                this.mIsBack = false;
            } else if (i == 2) {
                resetHeadViewPadding(i);
            } else if (i == 3) {
                resetHeadViewPadding(i);
            }
        }
    }

    private int getPointerIndex(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6128e2f", new Object[]{this, motionEvent, new Integer(i)})).intValue();
        }
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    private int getTopRealScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9570a0", new Object[]{this, new Integer(i)})).intValue();
        }
        return i;
    }

    private void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        } else if (this.mDownPullFinish) {
            onRefreshComplete();
        } else {
            PullToRefreshFeatureExt.OnPullToRefreshListenerExt onPullToRefreshListenerExt = this.mPullRefreshListener;
            if (onPullToRefreshListenerExt != null) {
                onPullToRefreshListenerExt.onPullDownToRefresh();
            }
        }
    }

    private void resetHeadViewPadding(int i) {
        int height;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7dcb1f", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null && (height = refreshHeadViewManager.getHeight()) != 0) {
            if (i != 2 && i == 3) {
                i2 = -height;
            }
            if (this.mIsHeadViewHeightContainLogoImage) {
                this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, i2 - this.mHeaderViewManager.getPaddingTop(), 350);
            } else if (i == 2) {
                this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, (this.mHeaderViewManager.getImageHeight() - this.mHeaderViewManager.getPaddingTop()) - this.mHeaderViewManager.getHeight(), 350);
            } else if (i == 3) {
                this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, i2 - this.mHeaderViewManager.getPaddingTop(), 350);
            }
            this.mEdgeJudger.trigger();
        }
    }

    public void addHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d47655a", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            this.mEdgeJudger.setHeadView(refreshHeadViewManager.getView());
        }
    }

    public void enableJump(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16cb57c", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableJump = z;
        }
    }

    public void enablePullDownRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9864e86b", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else {
            enablePullDownRefresh(z, i, view, true);
        }
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.mPullDownDistance;
    }

    public View getRefreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("378be073", new Object[]{this});
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            return refreshHeadViewManager.getRefreshView();
        }
        return null;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.mState;
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.isHeadViewHeightContainImage(z);
        }
        this.mIsHeadViewHeightContainLogoImage = z;
    }

    public void onRefreshStateChanged(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957892b7", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.mState != 3) {
            ((TScrollView) ((PullToRefreshFeatureExt) this.mEdgeJudger).getHost()).setScrollingEnabled(false);
            this.mEnableScroll = false;
        } else {
            ((TScrollView) ((PullToRefreshFeatureExt) this.mEdgeJudger).getHost()).setScrollingEnabled(true);
            this.mEnableScroll = true;
        }
        PullToRefreshFeatureExt.OnPullToRefreshListenerExt onPullToRefreshListenerExt = this.mPullRefreshListener;
        if (onPullToRefreshListenerExt != null) {
            onPullToRefreshListenerExt.onRefreshStateChanged(i, z);
        }
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            return;
        }
        switch (motionEvent.getAction() & 255) {
            case 0:
                JudgeArrivedRecoredEdge(motionEvent);
                return;
            case 1:
            case 3:
            case 4:
                int i3 = this.mState;
                if (i3 != 2) {
                    if (i3 == 1) {
                        this.mState = 3;
                        onRefreshStateChanged(3, true);
                        changeHeaderViewByState();
                    }
                    int i4 = this.mState;
                    if (i4 == 0 || i4 == 4) {
                        this.mState = 2;
                        onRefreshStateChanged(2, false);
                        changeHeaderViewByState();
                        onRefresh();
                    }
                }
                this.mIsRecored = false;
                this.mIsBack = false;
                this.mIsMultiPointer = false;
                this.mDistance = 0;
                this.mPositionY = 0;
                this.mPositionX = 0;
                this.mActivePointerId = -1;
                return;
            case 2:
                if (this.mActivePointerId == -1) {
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    this.mLastMotionY = motionEvent.getY();
                    this.mLastMotionX = motionEvent.getX();
                    this.mPreActivePointerId = this.mActivePointerId;
                }
                try {
                    int y = (int) MotionEventCompat.getY(motionEvent, getPointerIndex(motionEvent, this.mActivePointerId));
                    JudgeArrivedRecoredEdge(motionEvent);
                    if (this.mIsMultiPointer) {
                        int i5 = this.mPreActivePointerId;
                        int i6 = this.mActivePointerId;
                        if (i5 == i6) {
                            float f = y;
                            float f2 = this.mLastMotionY;
                            i = (int) (this.mDistance + (f - f2));
                            y = (int) (this.mPositionY + (f - f2));
                            this.mPreDistance = i;
                            this.mPrePositionY = y;
                        } else {
                            int i7 = this.mPreDistance;
                            float f3 = y;
                            float f4 = this.mLastMotionY;
                            int i8 = this.mPrePositionY;
                            y = (int) (i8 + (f3 - f4));
                            this.mPreActivePointerId = i6;
                            this.mDistance = i7;
                            this.mPositionY = i8;
                            i = (int) (i7 + (f3 - f4));
                        }
                    } else {
                        i = y - this.mStartY;
                        this.mDistance = i;
                        this.mPreDistance = i;
                        this.mPositionY = y;
                        this.mPrePositionY = y;
                    }
                    if (this.mState != 2 && this.mIsRecored) {
                        processActionMove(i, y);
                        this.mPullDownDistance = i;
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    return;
                }
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                this.mIsMultiPointer = true;
                return;
            case 6:
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.mActivePointerId) {
                    if (actionIndex2 != 0) {
                        i2 = 0;
                    }
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, i2);
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, i2);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i2);
                }
                int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
                if (this.mActivePointerId != -1) {
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, pointerIndex);
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, pointerIndex);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void removeHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c915dbfd", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            this.mEdgeJudger.removeHeaderView(refreshHeadViewManager.getView());
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.mState == 5) {
            this.mState = 3;
            onRefreshStateChanged(3, false);
            changeHeaderViewByState();
        }
    }

    public void setDownRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            this.mDownPullFinish = z;
            refreshHeadViewManager.setFinish(z);
        }
    }

    public void setDownRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0370669", new Object[]{this, strArr});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setTipArray(strArr);
        }
    }

    public void setIsDownRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f897bc", new Object[]{this});
        } else if (this.mHeaderViewManager != null) {
            this.mState = 2;
            onRefreshStateChanged(2, false);
            changeHeaderViewByState();
            this.mHeaderViewManager.setPadding(0, 0, 0, 0);
        }
    }

    public void setOnRefreshListener(PullToRefreshFeatureExt.OnPullToRefreshListenerExt onPullToRefreshListenerExt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb1195c", new Object[]{this, onPullToRefreshListenerExt});
        } else {
            this.mPullRefreshListener = onPullToRefreshListenerExt;
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setRefreshViewColor(i);
        }
    }

    public void enablePullDownRefresh(boolean z, int i, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7438d7c9", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2)});
        } else if (z) {
            ImageView imageView = view;
            if (this.mHeaderViewManager == null) {
                if (view == null) {
                    ImageView imageView2 = new ImageView(this.mContext);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView = imageView2;
                }
                RefreshHeadViewManager refreshHeadViewManager = new RefreshHeadViewManager(this.mContext, i, imageView, z2, 1);
                this.mHeaderViewManager = refreshHeadViewManager;
                refreshHeadViewManager.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
                addHeaderView();
            }
        } else if (this.mHeaderViewManager != null) {
            removeHeaderView();
            this.mHeaderViewManager = null;
        }
    }

    public void onRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3573f5c", new Object[]{this});
            return;
        }
        this.mState = 3;
        onRefreshStateChanged(3, false);
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
            changeHeaderViewByState();
        }
    }

    public void onScrollerStateChanged(int i, boolean z) {
        RefreshHeadViewManager refreshHeadViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c020b4", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mEnableScroll && z && (refreshHeadViewManager = this.mHeaderViewManager) != null) {
            refreshHeadViewManager.setPadding(0, i, 0, 0);
            new StringBuilder("onScrollerStateChanged: ").append(i);
        }
    }

    private void processActionMove(int i, int i2) {
        RefreshHeadViewManager refreshHeadViewManager;
        RefreshHeadViewManager refreshHeadViewManager2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdc6d9d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        int i6 = this.mState;
        if (i6 == 3) {
            if (i > 0 && this.mEdgeJudger.hasArrivedTopEdge()) {
                this.mState = 1;
                onRefreshStateChanged(1, false);
                changeHeaderViewByState();
            }
        } else if (i6 == 1) {
            RefreshHeadViewManager refreshHeadViewManager3 = this.mHeaderViewManager;
            if (refreshHeadViewManager3 != null) {
                if (this.mIsHeadViewHeightContainLogoImage) {
                    i5 = refreshHeadViewManager3.getHeight();
                } else {
                    i5 = refreshHeadViewManager3.getImageHeight();
                }
                if (getTopRealScrollY(i) >= i5) {
                    this.mState = 0;
                    onRefreshStateChanged(0, false);
                    this.mIsBack = true;
                } else if (i2 - this.mStartY <= 0) {
                    this.mState = 3;
                    onRefreshStateChanged(3, false);
                } else {
                    changeHeaderProgressBarState(getTopRealScrollY(i));
                }
                changeHeaderViewByState();
            }
        } else if (i6 == 0) {
            RefreshHeadViewManager refreshHeadViewManager4 = this.mHeaderViewManager;
            if (refreshHeadViewManager4 != null) {
                if (this.mIsHeadViewHeightContainLogoImage) {
                    i4 = refreshHeadViewManager4.getHeight();
                } else {
                    i4 = refreshHeadViewManager4.getImageHeight();
                }
                if (getTopRealScrollY(i) < i4 && i2 - this.mStartY > 0) {
                    this.mState = 1;
                    onRefreshStateChanged(1, false);
                    changeHeaderViewByState();
                } else if (this.mEnableJump && getTopRealScrollY(i) - i4 > displayMetrics.density * 20.0f && getTopRealScrollY(i) - i4 < displayMetrics.density * this.mDistanceToJump) {
                    this.mState = 4;
                    onRefreshStateChanged(4, false);
                    changeHeaderViewByState();
                }
            }
        } else if (i6 == 4 && (refreshHeadViewManager2 = this.mHeaderViewManager) != null) {
            if (this.mIsHeadViewHeightContainLogoImage) {
                i3 = refreshHeadViewManager2.getHeight();
            } else {
                i3 = refreshHeadViewManager2.getImageHeight();
            }
            if (getTopRealScrollY(i) - i3 < displayMetrics.density * 20.0f) {
                this.mState = 0;
                onRefreshStateChanged(0, false);
                changeHeaderViewByState();
            } else if (getTopRealScrollY(i) - i3 > displayMetrics.density * this.mDistanceToJump) {
                this.mState = 5;
                onRefreshStateChanged(5, false);
                changeHeaderViewByState();
                PullToRefreshFeatureExt.OnPullToRefreshListenerExt onPullToRefreshListenerExt = this.mPullRefreshListener;
                if (onPullToRefreshListenerExt != null) {
                    onPullToRefreshListenerExt.onReadyToJump(true, 1.0f);
                }
            } else {
                float f = displayMetrics.density;
                changeHeaderAlpha(1.0f - (((getTopRealScrollY(i) - i3) - (f * 20.0f)) / (f * 20.0f)));
                PullToRefreshFeatureExt.OnPullToRefreshListenerExt onPullToRefreshListenerExt2 = this.mPullRefreshListener;
                if (onPullToRefreshListenerExt2 != null) {
                    float f2 = displayMetrics.density;
                    onPullToRefreshListenerExt2.onReadyToJump(false, ((getTopRealScrollY(i) - i3) - (20.0f * f2)) / (f2 * (this.mDistanceToJump - 20)));
                }
            }
        }
        int i7 = this.mState;
        if ((i7 == 1 || i7 == 0 || i7 == 4) && (refreshHeadViewManager = this.mHeaderViewManager) != null) {
            refreshHeadViewManager.setPadding(0, getTopRealScrollY(i) - this.mHeaderViewManager.getHeight(), 0, 0);
            new StringBuilder("processActionMove: ").append(String.valueOf(getTopRealScrollY(i) - this.mHeaderViewManager.getHeight()));
        }
    }
}
