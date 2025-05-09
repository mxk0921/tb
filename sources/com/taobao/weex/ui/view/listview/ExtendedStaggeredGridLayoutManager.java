package com.taobao.weex.ui.view.listview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExtendedStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661759);
    }

    public ExtendedStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    public static /* synthetic */ Object ipc$super(ExtendedStaggeredGridLayoutManager extendedStaggeredGridLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 2075020241) {
            super.onItemsRemoved((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/listview/ExtendedStaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bae4bd1", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else if (i == -1) {
            WXLogUtils.e("ExtendedStaggeredGridLayoutManager: onItemsRemoved  Error Invalid Index : positionStart :" + i + "  itemCount:" + i2);
        } else {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("ExtendedStaggeredGridLayoutManager: onItemsRemoved  positionStart :" + i + "  itemCount:" + i2);
            }
            super.onItemsRemoved(recyclerView, i, i2);
        }
    }
}
