package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.NestedScrollingParent2;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.component.f;
import com.taobao.tao.flexbox.layoutmanager.component.h;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager;
import java.util.HashMap;
import tb.bk2;
import tb.ied;
import tb.t2o;
import tb.ytn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NestViewPager extends EdgePanViewPager implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private n controllerNode;
    private int diffHeight;
    private int lastNestY;
    private int nestScrollDistance;
    private boolean sticky;

    static {
        t2o.a(503317466);
    }

    public NestViewPager(Context context, n nVar) {
        super(context);
        this.controllerNode = nVar;
    }

    public static /* synthetic */ Object ipc$super(NestViewPager nestViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 80153535) {
            super.onRestoreInstanceState((Parcelable) objArr[0]);
            return null;
        } else if (hashCode == 1780171858) {
            return new Boolean(super.pullIntercept((View) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/NestViewPager");
        }
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            bk2.a(this, false);
        }
    }

    public void fireNestScrollEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcf0d26", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nestY", Integer.valueOf(i));
        hashMap.put("maxNestY", Integer.valueOf(i2));
        hashMap.put("group", ((TabBarControllerComponent.j) this.controllerNode.K().getViewParams()).y0);
        this.controllerNode.K().sendMessage(512, this.controllerNode, "onnestscroll", null, hashMap, null);
    }

    public void fullNestScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94435dbb", new Object[]{this});
            return;
        }
        int i = this.nestScrollDistance;
        if (i > 0 && i != this.lastNestY) {
            this.lastNestY = i;
            fireNestScrollEvent(i, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (this.nestScrollDistance > 0 || !this.sticky) {
            int i4 = this.diffHeight * this.lastNestY;
            int i5 = this.nestScrollDistance;
            float f = (-getTranslationY()) - (i4 / i5);
            if ((f == 0.0f && i2 < 0) || f > i5 || !(view instanceof TNodeRecyclerView)) {
                return;
            }
            if (f != i5 || i2 >= 0 || ((TNodeRecyclerView) view).isFirstItemFullVisible()) {
                int min = Math.min((int) (this.nestScrollDistance - f), i2);
                iArr[1] = min;
                int max = Math.max(0, (int) (f + min));
                if (max != this.lastNestY) {
                    this.lastNestY = max;
                    ((TNodeRecyclerView) view).fireNestScrollEvent(0, max, 0, this.nestScrollDistance);
                }
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

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        if (parcelable instanceof ViewPager.SavedState) {
            ytn.e("position", parcelable, Integer.valueOf(getCurrentItem()));
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.nestScrollDistance > 0 && !this.sticky && (view2 instanceof TNodeRecyclerView) && (i & 2) != 0) {
            TNodeRecyclerView tNodeRecyclerView = (TNodeRecyclerView) view2;
            tNodeRecyclerView.setNeedResetOffsetInWindow(false);
            float f = -getTranslationY();
            if (f == 0.0f) {
                this.lastNestY = 0;
            } else {
                int i3 = this.nestScrollDistance;
                if (f >= this.diffHeight + i3) {
                    this.lastNestY = i3;
                }
            }
            int i4 = this.nestScrollDistance;
            int i5 = this.diffHeight;
            if (f < i4 + i5) {
                return true;
            }
            if (f >= i4 + i5) {
                if (tNodeRecyclerView.isFirstItemFullVisible()) {
                    return true;
                }
                tNodeRecyclerView.setNeedResetOffsetInWindow(true);
            }
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.edgepan.EdgePanViewPager
    public boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        try {
            if ((view instanceof ied) && ((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        if (pullIntercept(childAt)) {
                            return true;
                        }
                        if (childAt instanceof ied) {
                            break;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
            return super.pullIntercept(view);
        }
    }

    public void setNestScrollDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22579e80", new Object[]{this, new Integer(i)});
            return;
        }
        this.nestScrollDistance = i;
        if (i > 0) {
            String[] strArr = ((TabBarControllerComponent.j) this.controllerNode.K().getViewParams()).y0;
            e d = h.d(this.controllerNode, strArr);
            if (d != null) {
                this.diffHeight = d.getViewParams().H0;
            }
            f c = h.c(this.controllerNode, strArr, false);
            if (c != null) {
                this.sticky = ((f.b) c.getViewParams()).x0;
            }
        }
    }
}
