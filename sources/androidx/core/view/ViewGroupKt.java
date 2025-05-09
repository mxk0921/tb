package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Metadata;
import tb.aef;
import tb.g1a;
import tb.hfn;
import tb.pg1;
import tb.sbp;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a7\u0010\u0015\u001a\u00020\n*\u00020\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aL\u0010\u0018\u001a\u00020\n*\u00020\u000026\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\n*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001f\u0010 \u001a<\u0010%\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010#\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b%\u0010&\u001a<\u0010)\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010'\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010(\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b)\u0010&\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0016\u0010/\u001a\u00020,*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\u000300*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u000300*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "get", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "", "contains", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Ltb/xhv;", "plusAssign", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "minusAssign", "isEmpty", "(Landroid/view/ViewGroup;)Z", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/view/ViewGroup;Ltb/g1a;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/ViewGroup;Ltb/u1a;)V", "", pg1.ATOM_EXT_iterator, "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "setMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", "left", "top", "right", "bottom", "updateMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)V", "start", "end", "updateMarginsRelative", "getSize", "(Landroid/view/ViewGroup;)I", "Ltb/aef;", "getIndices", "(Landroid/view/ViewGroup;)Ltb/aef;", "indices", "Ltb/sbp;", "getChildren", "(Landroid/view/ViewGroup;)Ltb/sbp;", "children", "getDescendants", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewGroupKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean contains(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2f3f51", new Object[]{viewGroup, view})).booleanValue();
        }
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    public static final void forEach(ViewGroup viewGroup, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b44cf6", new Object[]{viewGroup, g1aVar});
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            g1aVar.invoke(viewGroup.getChildAt(i));
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, u1a<? super Integer, ? super View, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61434892", new Object[]{viewGroup, u1aVar});
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            u1aVar.invoke(Integer.valueOf(i), viewGroup.getChildAt(i));
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbdb84e9", new Object[]{viewGroup, new Integer(i)});
        }
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final sbp<View> getChildren(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbp) ipChange.ipc$dispatch("34681be0", new Object[]{viewGroup});
        }
        return new sbp<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sbp
            public Iterator<View> iterator() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Iterator) ipChange2.ipc$dispatch("8f345362", new Object[]{this});
                }
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final sbp<View> getDescendants(final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbp) ipChange.ipc$dispatch("f559fc0b", new Object[]{viewGroup});
        }
        return new sbp<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sbp
            public Iterator<View> iterator() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Iterator) ipChange2.ipc$dispatch("8f345362", new Object[]{this});
                }
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), ViewGroupKt$descendants$1$1.INSTANCE);
            }
        };
    }

    public static final aef getIndices(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aef) ipChange.ipc$dispatch("92376c55", new Object[]{viewGroup});
        }
        return hfn.n(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d13f4bb0", new Object[]{viewGroup})).intValue();
        }
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7987cb8d", new Object[]{viewGroup})).booleanValue();
        }
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a457b4e", new Object[]{viewGroup})).booleanValue();
        }
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8d9d97c3", new Object[]{viewGroup});
        }
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7347ed", new Object[]{viewGroup, view});
        } else {
            viewGroup.removeView(view);
        }
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f200903", new Object[]{viewGroup, view});
        } else {
            viewGroup.addView(view);
        }
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c443875e", new Object[]{marginLayoutParams, new Integer(i)});
        } else {
            marginLayoutParams.setMargins(i, i, i, i);
        }
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf4d02c", new Object[]{marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            marginLayoutParams.setMargins(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca91e850", new Object[]{marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8abdc0", new Object[]{marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71881e3c", new Object[]{marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
