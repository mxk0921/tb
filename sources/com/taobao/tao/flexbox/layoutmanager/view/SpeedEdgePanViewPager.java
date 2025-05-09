package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import java.lang.reflect.Field;
import tb.akt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SpeedEdgePanViewPager extends EdgePanViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DRAG_LEFT = 0;
    private static final int DRAG_NONE = -1;
    private static final int DRAG_RIGHT = 1;
    private a drawOrderDelegate;
    private int scrollState;
    private int dragType = -1;
    private boolean enableDragCrossItems = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class SpeedScroller extends Scroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mDuration;

        static {
            t2o.a(503317484);
        }

        public SpeedScroller(Context context, int i) {
            super(context);
            this.mDuration = i;
        }

        public static /* synthetic */ Object ipc$super(SpeedScroller speedScroller, String str, Object... objArr) {
            if (str.hashCode() == 948268333) {
                super.startScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/SpeedEdgePanViewPager$SpeedScroller");
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38856d2d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            } else {
                super.startScroll(i, i2, i3, i4, this.mDuration);
            }
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af3e1896", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                super.startScroll(i, i2, i3, i4, this.mDuration);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(503317481);
    }

    public SpeedEdgePanViewPager(Context context, int i) {
        super(context);
        if (i > 0) {
            try {
                SpeedScroller speedScroller = new SpeedScroller(context, i);
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                declaredField.set(this, speedScroller);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.SpeedEdgePanViewPager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -188663035) {
                    super.onPageScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode == 1703005214) {
                    super.onPageScrollStateChanged(((Number) objArr[0]).intValue());
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/SpeedEdgePanViewPager$1");
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                    return;
                }
                super.onPageScrollStateChanged(i2);
                SpeedEdgePanViewPager.access$002(SpeedEdgePanViewPager.this, i2);
                if (i2 == 0) {
                    SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, -1);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f), new Integer(i3)});
                    return;
                }
                super.onPageScrolled(i2, f, i3);
                if (i2 < 1 && SpeedEdgePanViewPager.this.getScrollX() < 0 && SpeedEdgePanViewPager.access$100(SpeedEdgePanViewPager.this) == -1) {
                    SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, 0);
                } else if (i2 == 1 && f > 0.0f && SpeedEdgePanViewPager.this.getScrollX() > 0 && SpeedEdgePanViewPager.access$100(SpeedEdgePanViewPager.this) == -1) {
                    SpeedEdgePanViewPager.access$102(SpeedEdgePanViewPager.this, 1);
                }
            }
        });
    }

    public static /* synthetic */ int access$002(SpeedEdgePanViewPager speedEdgePanViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32c35252", new Object[]{speedEdgePanViewPager, new Integer(i)})).intValue();
        }
        speedEdgePanViewPager.scrollState = i;
        return i;
    }

    public static /* synthetic */ int access$100(SpeedEdgePanViewPager speedEdgePanViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c7fb8b8", new Object[]{speedEdgePanViewPager})).intValue();
        }
        return speedEdgePanViewPager.dragType;
    }

    public static /* synthetic */ int access$102(SpeedEdgePanViewPager speedEdgePanViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9cf3953", new Object[]{speedEdgePanViewPager, new Integer(i)})).intValue();
        }
        speedEdgePanViewPager.dragType = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(SpeedEdgePanViewPager speedEdgePanViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode == 2058294000) {
                return new Integer(super.getChildDrawingOrder(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/SpeedEdgePanViewPager");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7aaf12f0", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0 && this.scrollState == 2 && !this.enableDragCrossItems) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!this.enableDragCrossItems && ((i3 = this.scrollState) == 1 || i3 == 2)) {
            if (i < 0 && this.dragType == 1) {
                i = 0;
            }
            if (i > 0 && this.dragType == 0) {
                i = 0;
            }
        }
        super.scrollTo(i, i2);
    }

    public void setDragCrossItemsEnable(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d278f4", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z && !akt.p2("forceDragCrossItems", false)) {
            z2 = false;
        }
        this.enableDragCrossItems = z2;
    }

    public void setDrawOrderDelegate(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea81d2be", new Object[]{this, aVar});
        }
    }
}
