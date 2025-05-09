package com.taobao.uikit.feature.features.internal.pullrefresh;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBSoundPlayer;
import com.taobao.uikit.feature.features.DragToRefreshFeature;
import com.taobao.uikit.feature.features.PullToRefreshFeature;
import com.taobao.uikit.utils.UIKITLog;
import java.util.Date;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RefreshController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DONE = 3;
    public static final int DOWN_PULL = 4;
    private static final int INVALID_POINTER = -1;
    public static final int LEFT_PULL = 7;
    public static final int PULL_TO_REFRESH = 1;
    private static final int RATIO = 3;
    private static final int RATIO_X = 1;
    public static final int REFRESHING = 2;
    public static final int RELEASE_TO_REFRESH = 0;
    public static final int RIGHT_PULL = 6;
    private static final String TAG = "DownRefreshControler";
    public static final int UP_PULL = 5;
    public int mActivePointerId;
    private OnPullDownRefreshCancle mCancle;
    private Context mContext;
    private int mDistance;
    private boolean mDownPullFinish;
    private DragToRefreshFeature.OnDragToRefreshListener mDragRefreshListener;
    private IViewEdgeJudge mEdgeJudge;
    private RefreshHeadViewManager mFooterViewManager;
    private RefreshHeadViewManager mHeaderViewManager;
    private boolean mIsAutoLoading;
    private boolean mIsBack;
    private boolean mIsHeadViewHeightContainLogoImage;
    private boolean mIsMultiPointer;
    private boolean mIsNeedPullUpToRefresh;
    private boolean mIsRecored;
    private boolean mIsRefreshable;
    private boolean mIsScrolling;
    private float mLastMotionX;
    private float mLastMotionY;
    private int mOrientation;
    private int mPositionX;
    private int mPositionY;
    private int mPreActivePointerId;
    private int mPreDistance;
    private int mPrePositionX;
    private int mPrePositionY;
    private int mPullDirection;
    private int mPullDownDistance;
    private PullToRefreshFeature.OnPullToRefreshListener mPullRefreshListener;
    private Scroller mScroller;
    private int mStartX;
    private int mStartY;
    private int mState;
    private boolean mUpPullFinish;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnPullDownRefreshCancle {
        void onRefreshCancle();
    }

    static {
        t2o.a(931135573);
    }

    public RefreshController(IViewEdgeJudge iViewEdgeJudge, Context context, Scroller scroller) {
        this.mActivePointerId = -1;
        this.mIsScrolling = false;
        this.mUpPullFinish = false;
        this.mDownPullFinish = false;
        this.mIsNeedPullUpToRefresh = true;
        this.mIsAutoLoading = false;
        this.mIsHeadViewHeightContainLogoImage = true;
        this.mIsMultiPointer = false;
        this.mPositionY = 0;
        this.mPositionX = 0;
        this.mPrePositionY = 0;
        this.mPrePositionX = 0;
        this.mPreActivePointerId = -1;
        this.mPullDownDistance = 0;
        this.mOrientation = 1;
        this.mEdgeJudge = iViewEdgeJudge;
        this.mScroller = scroller;
        this.mContext = context;
        this.mState = 3;
        this.mIsRefreshable = true;
    }

    private boolean JudgeArrivedRecoredEdge(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f191f9", new Object[]{this, motionEvent})).booleanValue();
        }
        IViewEdgeJudge iViewEdgeJudge = this.mEdgeJudge;
        if (iViewEdgeJudge != null) {
            if (iViewEdgeJudge.hasArrivedTopEdge() && !this.mIsRecored) {
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
            } else if (this.mEdgeJudge.hasArrivedBottomEdge() && !this.mIsRecored) {
                this.mIsRecored = true;
                this.mStartY = (int) motionEvent.getY();
                this.mStartX = (int) motionEvent.getX();
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (this.mActivePointerId == -1) {
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex2);
                    this.mLastMotionY = motionEvent.getY();
                    this.mLastMotionX = motionEvent.getX();
                    this.mPreActivePointerId = this.mActivePointerId;
                }
                return true;
            }
        }
        return false;
    }

    private void changeFooterProgressBarState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32636806", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.changeProgressBarState(i);
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

    private int getLeftRealScrollX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("344db25f", new Object[]{this, new Integer(i)})).intValue();
        }
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager == null) {
            return i;
        }
        int width = this.mHeaderViewManager.getWidth() + refreshHeadViewManager.getPaddingLeft();
        int i2 = displayMetrics.widthPixels;
        return (int) (((float) ((i2 / (i2 + width)) / 1.3d)) * i);
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
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager == null) {
            return i;
        }
        int height = this.mHeaderViewManager.getHeight() + refreshHeadViewManager.getPaddingTop();
        int i2 = displayMetrics.heightPixels;
        return (int) (((float) ((i2 / (i2 + height)) / 1.3d)) * i);
    }

    private void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        int i = this.mPullDirection;
        if (i == 4 || i == 6) {
            if (this.mDownPullFinish) {
                onRefreshComplete();
                return;
            }
            PullToRefreshFeature.OnPullToRefreshListener onPullToRefreshListener = this.mPullRefreshListener;
            if (onPullToRefreshListener != null) {
                onPullToRefreshListener.onPullDownToRefresh();
            }
            DragToRefreshFeature.OnDragToRefreshListener onDragToRefreshListener = this.mDragRefreshListener;
            if (onDragToRefreshListener != null) {
                onDragToRefreshListener.onDragPositive();
            }
        } else if (i != 5 && i != 7) {
        } else {
            if (this.mUpPullFinish) {
                onRefreshComplete();
            } else if (this.mIsNeedPullUpToRefresh) {
                PullToRefreshFeature.OnPullToRefreshListener onPullToRefreshListener2 = this.mPullRefreshListener;
                if (onPullToRefreshListener2 != null) {
                    onPullToRefreshListener2.onPullUpToRefresh();
                }
                DragToRefreshFeature.OnDragToRefreshListener onDragToRefreshListener2 = this.mDragRefreshListener;
                if (onDragToRefreshListener2 != null) {
                    onDragToRefreshListener2.onDragNegative();
                }
            }
        }
    }

    private void processActionMove(int i, int i2) {
        RefreshHeadViewManager refreshHeadViewManager;
        RefreshHeadViewManager refreshHeadViewManager2;
        RefreshHeadViewManager refreshHeadViewManager3;
        RefreshHeadViewManager refreshHeadViewManager4;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdc6d9d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i7 = this.mState;
        if (i7 == 0) {
            int i8 = this.mPullDirection;
            if (i8 == 4 && this.mHeaderViewManager != null) {
                this.mEdgeJudge.keepTop();
                if (this.mIsHeadViewHeightContainLogoImage) {
                    i6 = this.mHeaderViewManager.getHeight();
                } else {
                    i6 = this.mHeaderViewManager.getImageHeight();
                }
                if (getTopRealScrollY(i) < i6 && i2 - this.mStartY > 0) {
                    this.mState = 1;
                    changeHeaderViewByState();
                }
            } else if (i8 == 5 && this.mFooterViewManager != null) {
                this.mEdgeJudge.keepBottom();
                if (Math.abs(i / 3) < this.mFooterViewManager.getHeight() && i2 - this.mStartY < 0) {
                    this.mState = 1;
                    if (this.mIsNeedPullUpToRefresh) {
                        changeFooterViewByState();
                    }
                }
            } else if (i8 == 6 && this.mHeaderViewManager != null) {
                this.mEdgeJudge.keepTop();
                if (getLeftRealScrollX(i) < this.mHeaderViewManager.getWidth() && i2 - this.mStartX > 0) {
                    this.mState = 1;
                    changeHeaderViewByState();
                }
            } else if (i8 == 7 && this.mFooterViewManager != null) {
                this.mEdgeJudge.keepBottom();
                if (Math.abs(i) < this.mFooterViewManager.getWidth() && i2 - this.mStartX < 0) {
                    this.mState = 1;
                    if (this.mIsNeedPullUpToRefresh) {
                        changeFooterViewByState();
                    }
                }
            }
        } else if (i7 == 1) {
            int i9 = this.mPullDirection;
            if (i9 == 4 && this.mHeaderViewManager != null) {
                this.mEdgeJudge.keepTop();
                if (this.mIsHeadViewHeightContainLogoImage) {
                    i5 = this.mHeaderViewManager.getHeight();
                } else {
                    i5 = this.mHeaderViewManager.getImageHeight();
                }
                if (getTopRealScrollY(i) >= i5) {
                    this.mState = 0;
                    this.mIsBack = true;
                } else if (i2 - this.mStartY <= 0) {
                    this.mState = 3;
                }
                changeHeaderViewByState();
                changeHeaderProgressBarState(getTopRealScrollY(i));
            } else if (i9 == 5 && this.mFooterViewManager != null) {
                this.mEdgeJudge.keepBottom();
                if (i / 3 <= this.mFooterViewManager.getHeight() * (-1)) {
                    this.mState = 0;
                    this.mIsBack = true;
                } else if (i2 - this.mStartY >= 0) {
                    this.mState = 3;
                }
                if (this.mIsNeedPullUpToRefresh) {
                    changeFooterViewByState();
                    changeFooterProgressBarState((-i) / 3);
                }
            } else if (i9 == 6 && this.mHeaderViewManager != null) {
                this.mEdgeJudge.keepTop();
                if (getLeftRealScrollX(i) >= this.mHeaderViewManager.getWidth()) {
                    this.mState = 0;
                    this.mIsBack = true;
                } else if (i2 - this.mStartX <= 0) {
                    this.mState = 3;
                }
                changeHeaderViewByState();
                changeHeaderProgressBarState(getLeftRealScrollX(i));
            } else if (i9 == 7 && this.mFooterViewManager != null) {
                this.mEdgeJudge.keepBottom();
                if (i <= this.mFooterViewManager.getWidth() * (-1)) {
                    this.mState = 0;
                    this.mIsBack = true;
                } else if (i2 - this.mStartX >= 0) {
                    this.mState = 3;
                }
                if (this.mIsNeedPullUpToRefresh) {
                    changeFooterViewByState();
                    changeFooterProgressBarState(-i);
                }
            }
        } else if (i7 == 3) {
            if (i > 0 && this.mEdgeJudge.hasArrivedTopEdge()) {
                if (this.mOrientation == 1) {
                    i4 = 4;
                } else {
                    i4 = 6;
                }
                this.mPullDirection = i4;
                this.mState = 1;
                changeHeaderViewByState();
            } else if (i < 0 && this.mEdgeJudge.hasArrivedBottomEdge()) {
                if (this.mOrientation == 1) {
                    i3 = 5;
                } else {
                    i3 = 7;
                }
                this.mPullDirection = i3;
                if (this.mIsNeedPullUpToRefresh) {
                    this.mState = 1;
                    changeFooterViewByState();
                } else {
                    autoLoadingData();
                }
            }
        }
        int i10 = this.mState;
        if (i10 == 1 || i10 == 0) {
            int i11 = this.mPullDirection;
            if (i11 == 4 && (refreshHeadViewManager4 = this.mHeaderViewManager) != null) {
                refreshHeadViewManager4.setPadding(0, getTopRealScrollY(i) - this.mHeaderViewManager.getHeight(), 0, 0);
            } else if (i11 != 5 || (refreshHeadViewManager3 = this.mFooterViewManager) == null || this.mUpPullFinish) {
                if (i11 == 6 && (refreshHeadViewManager2 = this.mHeaderViewManager) != null) {
                    refreshHeadViewManager2.setPadding((refreshHeadViewManager2.getWidth() * (-1)) + getLeftRealScrollX(i), 0, 0, 0);
                } else if (i11 == 7 && (refreshHeadViewManager = this.mFooterViewManager) != null && this.mIsNeedPullUpToRefresh) {
                    refreshHeadViewManager.setPadding(0, 0, (refreshHeadViewManager.getWidth() * (-1)) - i, 0);
                }
            } else if (this.mIsNeedPullUpToRefresh) {
                refreshHeadViewManager3.setPadding(0, 0, 0, (refreshHeadViewManager3.getHeight() * (-1)) - (i / 3));
            }
        }
    }

    private void resetHeadViewPadding(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7dcb1f", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            if (this.mOrientation == 1) {
                i2 = refreshHeadViewManager.getHeight();
            } else {
                i2 = refreshHeadViewManager.getWidth();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.mIsScrolling = true;
                if (this.mOrientation != 1) {
                    this.mScroller.startScroll(this.mHeaderViewManager.getPaddingLeft(), 0, i3 - this.mHeaderViewManager.getPaddingLeft(), 0, 350);
                } else if (this.mIsHeadViewHeightContainLogoImage) {
                    this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, i3 - this.mHeaderViewManager.getPaddingTop(), 350);
                } else if (i == 2) {
                    this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, (this.mHeaderViewManager.getImageHeight() - this.mHeaderViewManager.getPaddingTop()) - this.mHeaderViewManager.getHeight(), 350);
                } else if (i == 3) {
                    this.mScroller.startScroll(0, this.mHeaderViewManager.getPaddingTop(), 0, i3 - this.mHeaderViewManager.getPaddingTop(), 350);
                }
                this.mEdgeJudge.trigger();
            }
        }
    }

    public void addFooterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ac4a68", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            this.mEdgeJudge.setFooterView(refreshHeadViewManager.getView());
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
            this.mEdgeJudge.setHeadView(refreshHeadViewManager.getView());
        }
    }

    public void autoLoadingData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1abede", new Object[]{this});
        } else if (!this.mIsNeedPullUpToRefresh && !this.mIsAutoLoading && !this.mUpPullFinish) {
            this.mIsAutoLoading = true;
            this.mPullDirection = 5;
            RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
            if (refreshHeadViewManager != null) {
                refreshHeadViewManager.changeHeaderViewByState(2);
            }
            PullToRefreshFeature.OnPullToRefreshListener onPullToRefreshListener = this.mPullRefreshListener;
            if (onPullToRefreshListener != null) {
                onPullToRefreshListener.onPullUpToRefresh();
            }
            DragToRefreshFeature.OnDragToRefreshListener onDragToRefreshListener = this.mDragRefreshListener;
            if (onDragToRefreshListener != null) {
                onDragToRefreshListener.onDragNegative();
            }
            RefreshHeadViewManager refreshHeadViewManager2 = this.mFooterViewManager;
            if (refreshHeadViewManager2 != null) {
                refreshHeadViewManager2.setViewPadding(true);
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mPullRefreshListener = null;
        this.mDragRefreshListener = null;
    }

    public void enablePullDownRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9864e86b", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else {
            enablePullDownRefresh(z, i, view, true);
        }
    }

    public void enablePullUpRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a491b064", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else {
            enablePullUpRefresh(z, i, view, true);
        }
    }

    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return this.mPullDirection;
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        return this.mPullDownDistance;
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

    public boolean isScrollStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c167144", new Object[]{this})).booleanValue();
        }
        return this.mScroller.isFinished();
    }

    public void onScrollerStateChanged(int i, boolean z) {
        RefreshHeadViewManager refreshHeadViewManager;
        RefreshHeadViewManager refreshHeadViewManager2;
        RefreshHeadViewManager refreshHeadViewManager3;
        RefreshHeadViewManager refreshHeadViewManager4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c020b4", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mPullDirection;
        if (i2 == 4) {
            if (!this.mIsScrolling) {
                return;
            }
            if (!z || (refreshHeadViewManager4 = this.mHeaderViewManager) == null) {
                this.mIsScrolling = false;
            } else {
                refreshHeadViewManager4.setPadding(0, i, 0, 0);
            }
        } else if (i2 == 5) {
            if (!this.mIsScrolling) {
                return;
            }
            if (!z || (refreshHeadViewManager3 = this.mFooterViewManager) == null) {
                this.mIsScrolling = false;
            } else {
                refreshHeadViewManager3.setPadding(0, 0, 0, i);
            }
        } else if (i2 == 6) {
            if (!this.mIsScrolling) {
                return;
            }
            if (!z || (refreshHeadViewManager2 = this.mHeaderViewManager) == null) {
                this.mIsScrolling = false;
            } else {
                refreshHeadViewManager2.setPadding(i, 0, 0, 0);
            }
        } else if (i2 == 7 && this.mIsScrolling) {
            if (!z || (refreshHeadViewManager = this.mFooterViewManager) == null) {
                this.mIsScrolling = false;
            } else {
                refreshHeadViewManager.setPadding(0, 0, i, 0);
            }
        }
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
        } else if (this.mIsRefreshable && !this.mIsScrolling) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    JudgeArrivedRecoredEdge(motionEvent);
                    return;
                case 1:
                case 3:
                case 4:
                    int i4 = this.mState;
                    if (i4 != 2) {
                        int i5 = this.mPullDirection;
                        if (i5 == 4) {
                            if (i4 == 1) {
                                this.mState = 3;
                                changeHeaderViewByState();
                                OnPullDownRefreshCancle onPullDownRefreshCancle = this.mCancle;
                                if (onPullDownRefreshCancle != null) {
                                    onPullDownRefreshCancle.onRefreshCancle();
                                }
                            }
                            if (this.mState == 0) {
                                this.mState = 2;
                                changeHeaderViewByState();
                                onRefresh();
                            }
                        } else if (i5 == 5) {
                            if (i4 == 1) {
                                this.mState = 3;
                                if (this.mIsNeedPullUpToRefresh) {
                                    changeFooterViewByState();
                                }
                            }
                            if (this.mState == 0) {
                                this.mState = 2;
                                if (this.mIsNeedPullUpToRefresh) {
                                    changeFooterViewByState();
                                }
                                onRefresh();
                            }
                        } else if (i5 == 6) {
                            if (i4 == 1) {
                                this.mState = 3;
                                changeHeaderViewByState();
                                OnPullDownRefreshCancle onPullDownRefreshCancle2 = this.mCancle;
                                if (onPullDownRefreshCancle2 != null) {
                                    onPullDownRefreshCancle2.onRefreshCancle();
                                }
                            }
                            if (this.mState == 0) {
                                this.mState = 2;
                                changeHeaderViewByState();
                                onRefresh();
                            }
                        } else if (i5 == 7) {
                            if (i4 == 1) {
                                this.mState = 3;
                                if (this.mIsNeedPullUpToRefresh) {
                                    changeFooterViewByState();
                                }
                            }
                            if (this.mState == 0) {
                                this.mState = 2;
                                if (this.mIsNeedPullUpToRefresh) {
                                    changeFooterViewByState();
                                }
                                onRefresh();
                            }
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
                        int pointerIndex = getPointerIndex(motionEvent, this.mActivePointerId);
                        int y = (int) MotionEventCompat.getY(motionEvent, pointerIndex);
                        int x = (int) MotionEventCompat.getX(motionEvent, pointerIndex);
                        JudgeArrivedRecoredEdge(motionEvent);
                        if (this.mIsMultiPointer) {
                            int i6 = this.mPreActivePointerId;
                            int i7 = this.mActivePointerId;
                            if (i6 != i7) {
                                if (1 == this.mOrientation) {
                                    int i8 = this.mPreDistance;
                                    float f = y;
                                    float f2 = this.mLastMotionY;
                                    i2 = (int) (i8 + (f - f2));
                                    int i9 = this.mPrePositionY;
                                    y = (int) (i9 + (f - f2));
                                    this.mPreActivePointerId = i7;
                                    this.mDistance = i8;
                                    this.mPositionY = i9;
                                } else {
                                    int i10 = this.mPreDistance;
                                    float f3 = x;
                                    float f4 = this.mLastMotionX;
                                    i2 = (int) (i10 + (f3 - f4));
                                    int i11 = this.mPrePositionX;
                                    x = (int) (i11 + (f3 - f4));
                                    this.mPreActivePointerId = i7;
                                    this.mDistance = i10;
                                    this.mPositionX = i11;
                                }
                                i = i2;
                            } else if (1 == this.mOrientation) {
                                float f5 = y;
                                float f6 = this.mLastMotionY;
                                i = (int) (this.mDistance + (f5 - f6));
                                y = (int) (this.mPositionY + (f5 - f6));
                                this.mPreDistance = i;
                                this.mPrePositionY = y;
                            } else {
                                float f7 = x;
                                float f8 = this.mLastMotionX;
                                i = (int) (this.mDistance + (f7 - f8));
                                x = (int) (this.mPositionX + (f7 - f8));
                                this.mPreDistance = i;
                                this.mPrePositionX = x;
                            }
                        } else if (1 == this.mOrientation) {
                            i = y - this.mStartY;
                            this.mDistance = i;
                            this.mPreDistance = i;
                            this.mPositionY = y;
                            this.mPrePositionY = y;
                        } else {
                            i = x - this.mStartX;
                            this.mDistance = i;
                            this.mPreDistance = i;
                            this.mPositionX = x;
                            this.mPrePositionX = x;
                        }
                        if (this.mState != 2 && this.mIsRecored) {
                            if (this.mOrientation == 1) {
                                x = y;
                            }
                            processActionMove(i, x);
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
                    UIKITLog.i(TAG, "ACTION_POINTER_DOWN : mActivePointerId %d  position : %f", Integer.valueOf(this.mActivePointerId), Float.valueOf(this.mLastMotionY));
                    this.mLastMotionY = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    this.mIsMultiPointer = true;
                    return;
                case 6:
                    int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.mActivePointerId) {
                        if (actionIndex2 == 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        this.mLastMotionY = MotionEventCompat.getY(motionEvent, i3);
                        this.mLastMotionX = MotionEventCompat.getX(motionEvent, i3);
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i3);
                    }
                    int pointerIndex2 = getPointerIndex(motionEvent, this.mActivePointerId);
                    if (this.mActivePointerId != -1) {
                        this.mLastMotionY = MotionEventCompat.getY(motionEvent, pointerIndex2);
                        this.mLastMotionX = MotionEventCompat.getX(motionEvent, pointerIndex2);
                        UIKITLog.i(TAG, "ACTION_POINTER_UP : mActivePointerId %d mLastMotionY position : %f", Integer.valueOf(this.mActivePointerId), Float.valueOf(this.mLastMotionY));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void removeFooterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107ac10b", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            this.mEdgeJudge.removeFooterView(refreshHeadViewManager.getView());
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
            this.mEdgeJudge.removeHeaderView(refreshHeadViewManager.getView());
        }
    }

    public void resetFooterViewPadding(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bd9d1a", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            if (this.mOrientation == 1) {
                i2 = refreshHeadViewManager.getHeight();
            } else {
                i2 = refreshHeadViewManager.getWidth();
            }
            if (i2 != 0) {
                if (i != 2 && i == 3) {
                    i3 = -i2;
                }
                this.mIsScrolling = true;
                if (this.mOrientation == 1) {
                    this.mScroller.startScroll(0, this.mFooterViewManager.getPaddingBottom(), 0, i3 - this.mFooterViewManager.getPaddingBottom(), 350);
                } else {
                    this.mScroller.startScroll(this.mFooterViewManager.getPaddingRight(), 0, i3 - this.mFooterViewManager.getPaddingRight(), 0, 350);
                }
                this.mEdgeJudge.trigger();
            }
        }
    }

    public void setDownRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mHeaderViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setRefreshBackground(i);
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
            changeHeaderViewByState();
            this.mHeaderViewManager.setPadding(0, 0, 0, 0);
            this.mPullDirection = 4;
        }
    }

    public void setIsUpRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
        } else if (this.mFooterViewManager != null) {
            this.mPullDirection = 5;
            this.mState = 2;
            changeHeaderViewByState();
            this.mFooterViewManager.setPadding(0, 0, 0, 0);
        }
    }

    public void setOnRefreshListener(PullToRefreshFeature.OnPullToRefreshListener onPullToRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac053124", new Object[]{this, onPullToRefreshListener});
            return;
        }
        this.mPullRefreshListener = onPullToRefreshListener;
        this.mIsRefreshable = true;
    }

    public void setPullUpRefreshAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db0bd25", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsNeedPullUpToRefresh = !z;
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setProgressBarInitState(z);
            this.mFooterViewManager.changeHeaderViewByState(1);
        }
    }

    public void setRefreshCancle(OnPullDownRefreshCancle onPullDownRefreshCancle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2f8b9", new Object[]{this, onPullDownRefreshCancle});
        } else {
            this.mCancle = onPullDownRefreshCancle;
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
        RefreshHeadViewManager refreshHeadViewManager2 = this.mFooterViewManager;
        if (refreshHeadViewManager2 != null) {
            refreshHeadViewManager2.setRefreshViewColor(i);
        }
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setRefreshBackground(i);
        }
    }

    public void setUpRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            this.mUpPullFinish = z;
            refreshHeadViewManager.setFinish(z);
        }
        this.mIsAutoLoading = false;
    }

    public void setUpRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ac0aa2", new Object[]{this, strArr});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.setTipArray(strArr);
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
                RefreshHeadViewManager refreshHeadViewManager = new RefreshHeadViewManager(this.mContext, i, imageView, z2, this.mOrientation == 1 ? 1 : 3);
                this.mHeaderViewManager = refreshHeadViewManager;
                refreshHeadViewManager.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
                addHeaderView();
            }
        } else if (this.mHeaderViewManager != null) {
            removeHeaderView();
            this.mHeaderViewManager = null;
        }
    }

    public void enablePullUpRefresh(boolean z, int i, View view, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda50ef0", new Object[]{this, new Boolean(z), new Integer(i), view, new Boolean(z2)});
        } else if (z) {
            if (this.mFooterViewManager == null) {
                RefreshHeadViewManager refreshHeadViewManager = new RefreshHeadViewManager(this.mContext, i, view, z2, this.mOrientation == 1 ? 2 : 4);
                this.mFooterViewManager = refreshHeadViewManager;
                refreshHeadViewManager.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
                addFooterView();
            }
        } else if (this.mFooterViewManager != null) {
            removeFooterView();
            this.mFooterViewManager = null;
        }
    }

    public void onRefreshComplete() {
        RefreshHeadViewManager refreshHeadViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3573f5c", new Object[]{this});
            return;
        }
        this.mState = 3;
        int i = this.mPullDirection;
        if (i == 4 || i == 6) {
            TBSoundPlayer.getInstance().playScene(2);
            RefreshHeadViewManager refreshHeadViewManager2 = this.mHeaderViewManager;
            if (refreshHeadViewManager2 != null) {
                refreshHeadViewManager2.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
                changeHeaderViewByState();
            }
        } else if ((i == 5 || i == 7) && (refreshHeadViewManager = this.mFooterViewManager) != null) {
            refreshHeadViewManager.setUpdatedTextView("最近更新:" + new Date().toLocaleString());
            if (this.mIsNeedPullUpToRefresh) {
                changeFooterViewByState();
                return;
            }
            this.mIsAutoLoading = false;
            if (!this.mUpPullFinish) {
                this.mFooterViewManager.changeHeaderViewByState(3);
                resetFooterViewPadding(3);
            }
        }
    }

    private void changeFooterViewByState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f18531", new Object[]{this});
            return;
        }
        RefreshHeadViewManager refreshHeadViewManager = this.mFooterViewManager;
        if (refreshHeadViewManager != null) {
            refreshHeadViewManager.changeHeaderViewByState(this.mState);
            int i = this.mState;
            if (i == 1 && this.mIsBack) {
                this.mIsBack = false;
            } else if (i == 2) {
                UIKITLog.v(TAG, "刷新造成scroll", new Object[0]);
                resetFooterViewPadding(this.mState);
            } else if (i == 3) {
                UIKITLog.v(TAG, "不需要刷新或者刷新完成造成scroll", new Object[0]);
                resetFooterViewPadding(this.mState);
            }
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
                UIKITLog.v(TAG, "刷新造成scroll", new Object[0]);
                resetHeadViewPadding(this.mState);
            } else if (i == 3) {
                UIKITLog.v(TAG, "不需要刷新或者刷新完成造成scroll", new Object[0]);
                resetHeadViewPadding(this.mState);
            }
        }
    }

    public void setOnRefreshListener(DragToRefreshFeature.OnDragToRefreshListener onDragToRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fb0444", new Object[]{this, onDragToRefreshListener});
            return;
        }
        this.mDragRefreshListener = onDragToRefreshListener;
        this.mIsRefreshable = true;
    }

    public RefreshController(IViewEdgeJudge iViewEdgeJudge, Context context, Scroller scroller, int i) {
        this.mActivePointerId = -1;
        this.mIsScrolling = false;
        this.mUpPullFinish = false;
        this.mDownPullFinish = false;
        this.mIsNeedPullUpToRefresh = true;
        this.mIsAutoLoading = false;
        this.mIsHeadViewHeightContainLogoImage = true;
        this.mIsMultiPointer = false;
        this.mPositionY = 0;
        this.mPositionX = 0;
        this.mPrePositionY = 0;
        this.mPrePositionX = 0;
        this.mPreActivePointerId = -1;
        this.mPullDownDistance = 0;
        this.mEdgeJudge = iViewEdgeJudge;
        this.mScroller = scroller;
        this.mContext = context;
        this.mState = 3;
        this.mIsRefreshable = true;
        this.mOrientation = i;
    }
}
