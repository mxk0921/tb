package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class GhostViewHolder extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAttached = true;
    private ViewGroup mParent;

    public GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.mParent = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        ViewGroupUtils.getOverlay(this.mParent).add(this);
    }

    public static GhostViewHolder getHolder(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GhostViewHolder) ipChange.ipc$dispatch("17a1866d", new Object[]{viewGroup});
        }
        return (GhostViewHolder) viewGroup.getTag(R.id.ghost_view_holder);
    }

    private int getInsertIndex(ArrayList<View> arrayList) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68f39c73", new Object[]{this, arrayList})).intValue();
        }
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            getParents(((GhostViewPort) getChildAt(i2)).mView, arrayList2);
            if (isOnTop(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    private static void getParents(View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e53c1f2", new Object[]{view, arrayList});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            getParents((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static /* synthetic */ Object ipc$super(GhostViewHolder ghostViewHolder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1557272881) {
            super.onViewRemoved((View) objArr[0]);
            return null;
        } else if (hashCode == 1361193775) {
            super.onViewAdded((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/transition/GhostViewHolder");
        }
    }

    private static boolean isOnTop(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8af0a4f7", new Object[]{arrayList, arrayList2})).booleanValue();
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return isOnTop(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    public void addGhostView(GhostViewPort ghostViewPort) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551af5e6", new Object[]{this, ghostViewPort});
            return;
        }
        ArrayList<View> arrayList = new ArrayList<>();
        getParents(ghostViewPort.mView, arrayList);
        int insertIndex = getInsertIndex(arrayList);
        if (insertIndex < 0 || insertIndex >= getChildCount()) {
            addView(ghostViewPort);
        } else {
            addView(ghostViewPort, insertIndex);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
        } else if (this.mAttached) {
            super.onViewAdded(view);
        } else {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.mParent.setTag(R.id.ghost_view_holder, null);
            ViewGroupUtils.getOverlay(this.mParent).remove(this);
            this.mAttached = false;
        }
    }

    public void popToOverlayTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6e08b8", new Object[]{this});
        } else if (this.mAttached) {
            ViewGroupUtils.getOverlay(this.mParent).remove(this);
            ViewGroupUtils.getOverlay(this.mParent).add(this);
        } else {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
    }

    private static boolean isOnTop(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd542f7", new Object[]{view, view2})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(ViewGroupUtils.getChildDrawingOrder(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }
}
