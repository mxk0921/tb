package com.taobao.message.lab.comfrm.support.dinamic;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecyclerHoldLastBottomExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity mActivity;
    private DXRootView mDxRootView;
    private ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;

    static {
        t2o.a(537919800);
    }

    public static /* synthetic */ DXRootView access$000(RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("3ff51cdb", new Object[]{recyclerHoldLastBottomExtension});
        }
        return recyclerHoldLastBottomExtension.mDxRootView;
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else if (this.mOnGlobalLayoutListener != null) {
            this.mActivity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
            this.mOnGlobalLayoutListener = null;
        }
    }

    public void tryInit(Activity activity, DXRootView dXRootView, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0caf8ed", new Object[]{this, activity, dXRootView, jSONArray});
        } else if (this.mOnGlobalLayoutListener == null) {
            this.mActivity = activity;
            this.mDxRootView = dXRootView;
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(jSONArray) { // from class: com.taobao.message.lab.comfrm.support.dinamic.RecyclerHoldLastBottomExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private int[] heightArray;
                public final /* synthetic */ JSONArray val$recyclerLayoutNameArray;
                private View[] viewArray;

                {
                    this.val$recyclerLayoutNameArray = jSONArray;
                    this.viewArray = new View[jSONArray.size()];
                    this.heightArray = new int[jSONArray.size()];
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    int i;
                    int i2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getFlattenWidgetNode() != null) {
                        for (int i3 = 0; i3 < this.val$recyclerLayoutNameArray.size(); i3++) {
                            String string = this.val$recyclerLayoutNameArray.getString(i3);
                            DXWidgetNode queryWTByUserId = RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getFlattenWidgetNode().queryWTByUserId(string);
                            if (queryWTByUserId instanceof DXRecyclerLayout) {
                                RecyclerView j0 = ((DXRecyclerLayout) queryWTByUserId).j0();
                                if (j0 == null) {
                                    queryWTByUserId = RecyclerHoldLastBottomExtension.access$000(RecyclerHoldLastBottomExtension.this).getExpandWidgetNode().queryWTByUserId(string);
                                    if (queryWTByUserId instanceof DXRecyclerLayout) {
                                        j0 = ((DXRecyclerLayout) queryWTByUserId).j0();
                                    } else {
                                        return;
                                    }
                                }
                                if (j0 != null) {
                                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) j0.getLayoutManager();
                                    int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                                    if (findLastVisibleItemPositions != null && findLastVisibleItemPositions.length > 0) {
                                        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId;
                                        if (dXRecyclerLayout.x() != null && findLastVisibleItemPositions[0] == dXRecyclerLayout.x().size() - 1) {
                                            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(findLastVisibleItemPositions[0]);
                                            if (findViewByPosition != null) {
                                                i = findViewByPosition.getHeight();
                                            } else {
                                                i = 0;
                                            }
                                            if (findViewByPosition != null) {
                                                i2 = findViewByPosition.getBottom();
                                            } else {
                                                i2 = 0;
                                            }
                                            int height = j0.getHeight();
                                            if (this.viewArray[i3] == findViewByPosition && this.heightArray[i3] != i && i2 + i > height) {
                                                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(j0.getContext()) { // from class: com.taobao.message.lab.comfrm.support.dinamic.RecyclerHoldLastBottomExtension.1.1
                                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                                    public static /* synthetic */ Object ipc$super(C06081 r3, String str, Object... objArr) {
                                                        int hashCode = str.hashCode();
                                                        if (hashCode == -1299653488) {
                                                            return new Integer(super.calculateTimeForScrolling(((Number) objArr[0]).intValue()));
                                                        }
                                                        if (hashCode == 963576506) {
                                                            return new Integer(super.calculateTimeForDeceleration(((Number) objArr[0]).intValue()));
                                                        }
                                                        int hashCode2 = str.hashCode();
                                                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/lab/comfrm/support/dinamic/RecyclerHoldLastBottomExtension$1$1");
                                                    }

                                                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                                                    public int calculateTimeForDeceleration(int i4) {
                                                        IpChange ipChange3 = $ipChange;
                                                        if (ipChange3 instanceof IpChange) {
                                                            return ((Number) ipChange3.ipc$dispatch("396f02ba", new Object[]{this, new Integer(i4)})).intValue();
                                                        }
                                                        return (int) (super.calculateTimeForDeceleration(i4) * 1.5d);
                                                    }

                                                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                                                    public int calculateTimeForScrolling(int i4) {
                                                        IpChange ipChange3 = $ipChange;
                                                        if (ipChange3 instanceof IpChange) {
                                                            return ((Number) ipChange3.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i4)})).intValue();
                                                        }
                                                        return super.calculateTimeForScrolling(i4) * 2;
                                                    }

                                                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                                                    public int getVerticalSnapPreference() {
                                                        IpChange ipChange3 = $ipChange;
                                                        if (ipChange3 instanceof IpChange) {
                                                            return ((Number) ipChange3.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                                                        }
                                                        return 1;
                                                    }
                                                };
                                                linearSmoothScroller.setTargetPosition(findLastVisibleItemPositions[0]);
                                                j0.getLayoutManager().startSmoothScroll(linearSmoothScroller);
                                            }
                                            this.viewArray[i3] = findViewByPosition;
                                            this.heightArray[i3] = i;
                                        }
                                    }
                                    this.viewArray[i3] = null;
                                    this.heightArray[i3] = 0;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            };
            this.mOnGlobalLayoutListener = onGlobalLayoutListener;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
