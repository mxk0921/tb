package com.taobao.oversea.mytaobao;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.core.view.NestedScrollingParent2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OvsMTPtrRecyclerView extends MTPtrRecyclerView implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OverScroller childRVOverScroller;
    private RecyclerView childRecyclerView;
    private Object childScrollerYObject;
    private Field childScrollyYField;
    private Field childVelocityYField;
    private View lastRecyclerView;
    private boolean mScrollEnable = false;
    private OverScroller parentRVOverScroller;
    private Field parentScrollYField;
    private Object parentScrollerYObject;
    private Field parentVelocityYField;

    public OvsMTPtrRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(OvsMTPtrRecyclerView ovsMTPtrRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/mytaobao/OvsMTPtrRecyclerView");
    }

    private void stopFling() {
        OverScroller overScroller = this.parentRVOverScroller;
        if (overScroller != null && this.childRVOverScroller != null) {
            overScroller.forceFinished(true);
            this.childRVOverScroller.forceFinished(true);
            try {
                this.parentVelocityYField.set(this.parentScrollerYObject, 0);
                this.childVelocityYField.set(this.childScrollerYObject, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        stopFling();
        if (this.mScrollEnable) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if ((view instanceof RecyclerView) && Math.abs(i2) >= Math.abs(i)) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (!recyclerView.getLayoutManager().canScrollVertically()) {
                scrollBy(0, i2);
                iArr[0] = iArr[0] + i;
                iArr[1] = iArr[1] + i2;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (i2 > 0 && this.lastRecyclerView != null && linearLayoutManager.findFirstVisibleItemPosition() < linearLayoutManager.getPosition(this.lastRecyclerView) && recyclerView.canScrollVertically(1) && getBottom() < this.childRecyclerView.getBottom()) {
                int bottom = this.childRecyclerView.getBottom() - getBottom();
                scrollBy(0, Math.min(bottom, i2));
                iArr[1] = iArr[1] + Math.min(bottom, i2);
            }
            if (i2 < 0 && canScrollVertically(-1) && !recyclerView.canScrollVertically(-1)) {
                scrollBy(0, i2);
                iArr[1] = iArr[1] + i2;
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            if (this.childRecyclerView == null) {
                this.childRecyclerView = getChildRecyclerLayout();
            }
            if (this.childRecyclerView != null) {
                initParentVelocity(this);
                try {
                    int round = Math.round(Float.parseFloat(this.parentVelocityYField.get(this.parentScrollerYObject).toString()));
                    if (round > 0 && this.childRecyclerView.canScrollVertically(1)) {
                        this.childRecyclerView.fling(0, round);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((view2 instanceof RecyclerView) && i == 2 && i2 == 0) {
            this.childRecyclerView = (RecyclerView) view2;
            getChildRecyclerLayout();
            this.mScrollEnable = true;
            if (this.childRVOverScroller == null || this.childVelocityYField == null || this.childScrollyYField == null || this.childScrollerYObject == null) {
                initChildVelocity(this.childRecyclerView);
            }
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        this.mScrollEnable = false;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (!recyclerView.getLayoutManager().canScrollHorizontally() && !recyclerView.canScrollVertically(-1)) {
                try {
                    int round = Math.round(Float.parseFloat(this.childVelocityYField.get(this.childScrollerYObject).toString()));
                    if (round < 0) {
                        fling(0, round);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void scrollChildRVToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68d40ce", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.childRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
            this.parentScrollerYObject = null;
            this.parentVelocityYField = null;
        }
    }

    private RecyclerView getChildRecyclerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("6c27b4fd", new Object[]{this});
        }
        View findViewByPosition = getLayoutManager().findViewByPosition(getLayoutManager().getItemCount() - 1);
        if (findViewByPosition instanceof DXRootView) {
            DXWidgetNode flattenWidgetNode = ((DXRootView) findViewByPosition).getFlattenWidgetNode();
            if (flattenWidgetNode == null) {
                TLog.logw("PAGE_MTB", "OvsMTPtrRecyclerView rootNode is null");
                return null;
            }
            DXWidgetNode queryWidgetNodeByUserId = flattenWidgetNode.queryWidgetNodeByUserId("nestedRecyclerLayout");
            if (queryWidgetNodeByUserId != null && (queryWidgetNodeByUserId instanceof DXRecyclerLayout)) {
                this.lastRecyclerView = findViewByPosition;
                return ((DXRecyclerLayout) queryWidgetNodeByUserId.getReferenceNode()).j0();
            }
        }
        TLog.logw("PAGE_MTB", "OvsMTPtrRecyclerView getChildRecyclerLayout result is null");
        return null;
    }

    private void initChildVelocity(Object obj) {
        Field field;
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Field[] declaredFields = obj2.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if ("mOverScroller".equals(field.getName()) || "mScroller".equals(field.getName())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                field.setAccessible(true);
                OverScroller overScroller = (OverScroller) field.get(obj2);
                this.childRVOverScroller = overScroller;
                Field declaredField2 = overScroller.getClass().getDeclaredField("mScrollerY");
                this.childScrollyYField = declaredField2;
                declaredField2.setAccessible(true);
                Object obj3 = this.childScrollyYField.get(this.childRVOverScroller);
                this.childScrollerYObject = obj3;
                Field declaredField3 = obj3.getClass().getDeclaredField("mCurrVelocity");
                this.childVelocityYField = declaredField3;
                declaredField3.setAccessible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initParentVelocity(Object obj) {
        Field field;
        if (this.parentScrollerYObject == null || this.parentVelocityYField == null) {
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                Field[] declaredFields = obj2.getClass().getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        field = null;
                        break;
                    }
                    field = declaredFields[i];
                    if ("mOverScroller".equals(field.getName()) || "mScroller".equals(field.getName())) {
                        break;
                    }
                    i++;
                }
                if (field != null) {
                    field.setAccessible(true);
                    OverScroller overScroller = (OverScroller) field.get(obj2);
                    this.parentRVOverScroller = overScroller;
                    Field declaredField2 = overScroller.getClass().getDeclaredField("mScrollerY");
                    this.parentScrollYField = declaredField2;
                    declaredField2.setAccessible(true);
                    Object obj3 = this.parentScrollYField.get(this.parentRVOverScroller);
                    this.parentScrollerYObject = obj3;
                    Field declaredField3 = obj3.getClass().getDeclaredField("mCurrVelocity");
                    this.parentVelocityYField = declaredField3;
                    declaredField3.setAccessible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public OvsMTPtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
