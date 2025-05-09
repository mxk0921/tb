package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v76 extends mb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596948);
    }

    public static /* synthetic */ Object ipc$super(v76 v76Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/render/diff/DXPipelineDiff");
    }

    @Override // tb.mb5
    public void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, DXRuntimeContext dXRuntimeContext) {
        DXRuntimeContext dXRuntimeContext2;
        DXRuntimeContext dXRuntimeContext3;
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
                    HashMap hashMap = new HashMap(childrenCount2);
                    for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                        hashMap.put(Integer.valueOf(dXWidgetNode.getChildAt(i).getAutoId()), Integer.valueOf(i));
                    }
                    ArrayList arrayList = new ArrayList(childrenCount2);
                    for (int i2 = 0; i2 < childrenCount2; i2++) {
                        arrayList.add(-1);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < dXWidgetNode2.getChildrenCount(); i4++) {
                        DXWidgetNode childAt = dXWidgetNode2.getChildAt(i4);
                        int autoId = childAt.getAutoId();
                        if (!hashMap.containsKey(Integer.valueOf(autoId))) {
                            if (p4) {
                                dXRuntimeContext3 = dXRuntimeContext;
                            } else {
                                dXRuntimeContext3 = childAt.getDXRuntimeContext();
                            }
                            c(dXRuntimeContext3, childAt.getWRView());
                        } else {
                            arrayList.set(((Integer) hashMap.get(Integer.valueOf(autoId))).intValue(), Integer.valueOf(i3));
                        }
                        i3++;
                    }
                    for (int i5 = 0; i5 < childrenCount2; i5++) {
                        int intValue = ((Integer) arrayList.get(i5)).intValue();
                        DXWidgetNode childAt2 = dXWidgetNode.getChildAt(i5);
                        if (intValue != -1) {
                            DXWidgetNode childAt3 = dXWidgetNode2.getChildAt(intValue);
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
