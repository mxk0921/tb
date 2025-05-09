package com.taobao.kirinvideoengine.album;

import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/kirinvideoengine/album/LocalPagerSnapHelper;", "Landroidx/recyclerview/widget/PagerSnapHelper;", "<init>", "()V", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocalPagerSnapHelper extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(500170772);
    }

    public static /* synthetic */ Object ipc$super(LocalPagerSnapHelper localPagerSnapHelper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1160778905) {
            return new Integer(super.findTargetSnapPosition((RecyclerView.LayoutManager) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        if (hashCode == -259228053) {
            return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kirinvideoengine/album/LocalPagerSnapHelper");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf93662", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int position;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
        }
        ckf.g(layoutManager, "layoutManager");
        View findSnapView = super.findSnapView(layoutManager);
        if (!(findSnapView == null || (position = layoutManager.getPosition(findSnapView)) == -1)) {
            a(position);
        }
        return findSnapView;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bacfeb67", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
        }
        ckf.g(layoutManager, "layoutManager");
        int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
        if (findTargetSnapPosition != -1) {
            a(findTargetSnapPosition);
        }
        return findTargetSnapPosition;
    }
}
