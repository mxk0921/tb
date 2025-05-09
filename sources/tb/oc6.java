package tb;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oc6 extends mb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596949);
    }

    public static /* synthetic */ Object ipc$super(oc6 oc6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/render/diff/DXSimplePipelineDiff");
    }

    @Override // tb.mb5
    public void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, DXRuntimeContext dXRuntimeContext) {
        DXRuntimeContext dXRuntimeContext2;
        DXRuntimeContext dXRuntimeContext3;
        DXRuntimeContext dXRuntimeContext4;
        DXRuntimeContext dXRuntimeContext5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e7a55d", new Object[]{this, dXWidgetNode, dXWidgetNode2, dXRuntimeContext});
            return;
        }
        if (dXWidgetNode2 != null) {
            dXWidgetNode2.onDiff(dXWidgetNode);
        }
        boolean p4 = zg5.p4();
        if (!(dXWidgetNode == dXWidgetNode2 || dXWidgetNode2 == null)) {
            if (dXWidgetNode == null) {
                if (!p4) {
                    dXRuntimeContext = dXWidgetNode2.getDXRuntimeContext();
                }
                c(dXRuntimeContext, dXWidgetNode2.getWRView());
                return;
            }
            int childrenCount = dXWidgetNode2.getChildrenCount();
            int childrenCount2 = dXWidgetNode.getChildrenCount();
            if (!(childrenCount == 0 && childrenCount2 == 0)) {
                if (childrenCount == 0 && childrenCount2 > 0) {
                    return;
                }
                if (childrenCount <= 0 || childrenCount2 != 0) {
                    SparseArray sparseArray = new SparseArray();
                    for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                        DXWidgetNode sourceWidget = dXWidgetNode.getChildAt(i).getSourceWidget();
                        if (sourceWidget != null) {
                            int autoId = sourceWidget.getAutoId();
                            List list = (List) sparseArray.get(autoId);
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(i));
                                sparseArray.put(autoId, arrayList);
                            } else {
                                list.add(Integer.valueOf(i));
                            }
                        } else if (zg5.q5()) {
                            int sourceAutoId = dXWidgetNode.getChildAt(i).getSourceAutoId();
                            List list2 = (List) sparseArray.get(sourceAutoId);
                            if (list2 == null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(Integer.valueOf(i));
                                sparseArray.put(sourceAutoId, arrayList2);
                            } else {
                                list2.add(Integer.valueOf(i));
                            }
                        }
                    }
                    int[] iArr = new int[childrenCount2];
                    for (int i2 = 0; i2 < childrenCount2; i2++) {
                        iArr[i2] = -1;
                    }
                    for (int i3 = 0; i3 < dXWidgetNode2.getChildrenCount(); i3++) {
                        DXWidgetNode childAt = dXWidgetNode2.getChildAt(i3);
                        if (childAt.getSourceWidget() != null && sparseArray.size() != 0) {
                            List list3 = (List) sparseArray.get(childAt.getSourceWidget().getAutoId());
                            if (list3 == null || list3.isEmpty()) {
                                if (p4) {
                                    dXRuntimeContext5 = dXRuntimeContext;
                                } else {
                                    dXRuntimeContext5 = childAt.getDXRuntimeContext();
                                }
                                c(dXRuntimeContext5, childAt.getWRView());
                            } else {
                                iArr[((Integer) list3.get(0)).intValue()] = i3;
                                list3.remove(0);
                            }
                        } else if (!zg5.q5() || childAt.getSourceAutoId() < 0 || sparseArray.size() == 0) {
                            if (p4) {
                                dXRuntimeContext3 = dXRuntimeContext;
                            } else {
                                dXRuntimeContext3 = childAt.getDXRuntimeContext();
                            }
                            c(dXRuntimeContext3, childAt.getWRView());
                        } else {
                            List list4 = (List) sparseArray.get(childAt.getSourceAutoId());
                            if (list4 == null || list4.isEmpty()) {
                                if (p4) {
                                    dXRuntimeContext4 = dXRuntimeContext;
                                } else {
                                    dXRuntimeContext4 = childAt.getDXRuntimeContext();
                                }
                                c(dXRuntimeContext4, childAt.getWRView());
                            } else {
                                iArr[((Integer) list4.get(0)).intValue()] = i3;
                                list4.remove(0);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < childrenCount2; i4++) {
                        int i5 = iArr[i4];
                        DXWidgetNode childAt2 = dXWidgetNode.getChildAt(i4);
                        if (i5 != -1) {
                            DXWidgetNode childAt3 = dXWidgetNode2.getChildAt(i5);
                            if (childAt2 == null || childAt3.getClass() == childAt2.getClass()) {
                                childAt2.setWRView(childAt3.getWRView());
                                if (!(childAt2.getWRView() == null || childAt2.getWRView().get() == null)) {
                                    kl6.e(childAt2.getWRView().get(), childAt2);
                                }
                                if (childAt2.getChildrenCount() > 0 || childAt3.getChildrenCount() > 0) {
                                    a(childAt2, childAt3, dXRuntimeContext);
                                } else {
                                    childAt3.onDiff(childAt2);
                                }
                            } else {
                                if (p4) {
                                    dXRuntimeContext2 = dXRuntimeContext;
                                } else {
                                    dXRuntimeContext2 = childAt3.getDXRuntimeContext();
                                }
                                c(dXRuntimeContext2, childAt3.getWRView());
                            }
                        }
                    }
                    return;
                }
                WeakReference<View> wRView = dXWidgetNode2.getWRView();
                if (!p4) {
                    dXRuntimeContext = dXWidgetNode2.getDXRuntimeContext();
                }
                b(wRView, dXRuntimeContext);
            }
        }
    }
}
