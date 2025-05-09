package com.taobao.message.uikit.util;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/message/uikit/util/ViewTraversalHelper;", "", "Landroid/view/ViewGroup;", "rootView", "<init>", "(Landroid/view/ViewGroup;)V", "viewGroup", "", "deep", "Ltb/xhv;", "findDeepestChildOfSameSizeTraversal", "(Landroid/view/ViewGroup;I)V", "Landroid/view/View;", "findDeepestChildOfSameSize", "()Landroid/view/View;", "deepestViewDepth", TLogTracker.LEVEL_INFO, "deepestView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ViewTraversalHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View deepestView;
    private int deepestViewDepth = -1;
    private final ViewGroup rootView;

    static {
        t2o.a(529531099);
    }

    public ViewTraversalHelper(ViewGroup viewGroup) {
        ckf.h(viewGroup, "rootView");
        this.rootView = viewGroup;
    }

    private final void findDeepestChildOfSameSizeTraversal(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce860b8", new Object[]{this, viewGroup, new Integer(i)});
        } else if (viewGroup.getWidth() >= this.rootView.getWidth() && viewGroup.getHeight() >= this.rootView.getHeight()) {
            if (i >= this.deepestViewDepth) {
                this.deepestViewDepth = i;
                this.deepestView = viewGroup;
            }
            if (viewGroup.getChildCount() != 0) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    ViewGroup viewGroup2 = null;
                    if (!(childAt instanceof ViewGroup)) {
                        childAt = null;
                    }
                    ViewGroup viewGroup3 = (ViewGroup) childAt;
                    if (viewGroup3 != null) {
                        if (viewGroup3.getVisibility() == 0) {
                            viewGroup2 = viewGroup3;
                        }
                        if (viewGroup2 != null) {
                            findDeepestChildOfSameSizeTraversal(viewGroup2, i + 1);
                        }
                    }
                }
            }
        }
    }

    public final View findDeepestChildOfSameSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c884d7a2", new Object[]{this});
        }
        if (this.rootView.getWidth() == 0) {
            return this.rootView;
        }
        findDeepestChildOfSameSizeTraversal(this.rootView, 0);
        return this.deepestView;
    }
}
