package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BottomBarContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mEmptyCheck = new a();
    private b mOnCheckListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BottomBarContainer.access$000(BottomBarContainer.this) != null && !BottomBarContainer.access$100(BottomBarContainer.this)) {
                BottomBarContainer.access$000(BottomBarContainer.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a();
    }

    static {
        t2o.a(912262891);
    }

    public BottomBarContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ b access$000(BottomBarContainer bottomBarContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d63143e6", new Object[]{bottomBarContainer});
        }
        return bottomBarContainer.mOnCheckListener;
    }

    public static /* synthetic */ boolean access$100(BottomBarContainer bottomBarContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38beaafa", new Object[]{bottomBarContainer})).booleanValue();
        }
        return bottomBarContainer.hasValidDxChildren();
    }

    private List<DXRootView> findDxRootViews() {
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("93e8e381", new Object[]{this});
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_dinamicx_container);
        ArrayList arrayList = null;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DXRootView) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((DXRootView) childAt);
                }
            }
        }
        return arrayList;
    }

    private boolean hasValidDxChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93658be0", new Object[]{this})).booleanValue();
        }
        List<DXRootView> findDxRootViews = findDxRootViews();
        if (findDxRootViews != null) {
            int size = findDxRootViews.size();
            for (int i = 0; i < size; i++) {
                DXRootView dXRootView = findDxRootViews.get(i);
                if (dXRootView != null && dXRootView.getChildCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(BottomBarContainer bottomBarContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/BottomBarContainer");
    }

    public void setOnCheckListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bac327", new Object[]{this, bVar});
        } else {
            this.mOnCheckListener = bVar;
        }
    }

    public void startEmptyCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2523c4", new Object[]{this});
        } else if (!hasValidDxChildren()) {
            removeCallbacks(this.mEmptyCheck);
            postDelayed(this.mEmptyCheck, 5000L);
        }
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomBarContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
