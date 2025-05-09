package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.CustomViewPager;
import tb.mr7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GalleryViewPager extends CustomViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GalleryViewPager";
    public TouchImageView mCurrentView;
    private int mPagingDistance;

    static {
        t2o.a(912262998);
    }

    public GalleryViewPager(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setOverScrollMode(2);
        this.mPagingDistance = mr7.f(context) / 4;
    }

    public static /* synthetic */ Object ipc$super(GalleryViewPager galleryViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/GalleryViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if ((motionEvent.getAction() & 255) == 1) {
            try {
                super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                tgh.c(TAG, "onInterceptTouchEvent", e);
                return false;
            }
        }
        float[] handleMotionEvent = handleMotionEvent(motionEvent);
        TouchImageView touchImageView = this.mCurrentView;
        if (touchImageView == null) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e2) {
                tgh.c(TAG, "onInterceptTouchEvent", e2);
                return false;
            }
        } else if (touchImageView.pagerCanScroll()) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e3) {
                tgh.c(TAG, "onInterceptTouchEvent", e3);
                return false;
            } catch (IllegalArgumentException e4) {
                tgh.c(TAG, "onInterceptTouchEvent", e4);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < 0.0f) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e5) {
                tgh.c(TAG, "onInterceptTouchEvent", e5);
                return false;
            } catch (IllegalArgumentException e6) {
                tgh.c(TAG, "onInterceptTouchEvent", e6);
                return false;
            }
        } else if (handleMotionEvent == null || !this.mCurrentView.onLeftSide || handleMotionEvent[0] <= 0.0f) {
            if (handleMotionEvent == null) {
                TouchImageView touchImageView2 = this.mCurrentView;
                if (touchImageView2.onLeftSide || touchImageView2.onRightSide) {
                    try {
                        return super.onInterceptTouchEvent(motionEvent);
                    } catch (ArrayIndexOutOfBoundsException e7) {
                        tgh.c(TAG, "onInterceptTouchEvent", e7);
                        return false;
                    } catch (IllegalArgumentException e8) {
                        tgh.c(TAG, "onInterceptTouchEvent", e8);
                        return false;
                    }
                }
            }
            tgh.b(TAG, "onInterceptTouchEvent");
            return false;
        } else {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException e9) {
                tgh.c(TAG, "onInterceptTouchEvent", e9);
                return false;
            } catch (IllegalArgumentException e10) {
                tgh.c(TAG, "onInterceptTouchEvent", e10);
                return false;
            }
        }
    }

    public GalleryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCurrentView == null) {
            return super.onTouchEvent(motionEvent);
        }
        float[] handleMotionEvent = handleMotionEvent(motionEvent);
        if ((motionEvent.getAction() & 255) == 1) {
            try {
                int currentItem = getCurrentItem();
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (!this.mCurrentView.pagerCanScroll()) {
                    CustomViewPager.a onPageEdgeScrollLimitListener = getOnPageEdgeScrollLimitListener();
                    if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < (-this.mPagingDistance) && getAdapter().getCount() - 2 <= currentItem && onPageEdgeScrollLimitListener != null) {
                        onPageEdgeScrollLimitListener.onPageLastScrollLimit();
                    }
                    if (handleMotionEvent != null && this.mCurrentView.onLeftSide && handleMotionEvent[0] > 0.0f && currentItem == 0 && onPageEdgeScrollLimitListener != null) {
                        onPageEdgeScrollLimitListener.onPageFirstScrollLimit();
                    }
                }
                return onTouchEvent;
            } catch (Exception e) {
                tgh.c(TAG, "onTouchEvent", e);
                return false;
            }
        } else if (this.mCurrentView.pagerCanScroll()) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e2) {
                tgh.c(TAG, "onTouchEvent", e2);
                return false;
            }
        } else if (handleMotionEvent != null && this.mCurrentView.onRightSide && handleMotionEvent[0] < 0.0f) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e3) {
                tgh.c(TAG, "onTouchEvent", e3);
                return false;
            }
        } else if (handleMotionEvent == null || !this.mCurrentView.onLeftSide || handleMotionEvent[0] <= 0.0f) {
            if (handleMotionEvent == null) {
                TouchImageView touchImageView = this.mCurrentView;
                if (touchImageView.onLeftSide || touchImageView.onRightSide) {
                    try {
                        return super.onTouchEvent(motionEvent);
                    } catch (Exception e4) {
                        tgh.c(TAG, "onTouchEvent", e4);
                    }
                }
            }
            return false;
        } else {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e5) {
                tgh.c(TAG, "onTouchEvent", e5);
                return false;
            }
        }
    }
}
