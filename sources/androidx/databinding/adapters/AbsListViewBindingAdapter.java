package androidx.databinding.adapters;

import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AbsListViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnScroll {
        void onScroll(AbsListView absListView, int i, int i2, int i3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView absListView, int i);
    }

    public static void setOnScroll(AbsListView absListView, final OnScroll onScroll, final OnScrollStateChanged onScrollStateChanged) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fbd091", new Object[]{absListView, onScroll, onScrollStateChanged});
        } else {
            absListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: androidx.databinding.adapters.AbsListViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView2, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView2, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    OnScroll onScroll2 = onScroll;
                    if (onScroll2 != null) {
                        onScroll2.onScroll(absListView2, i, i2, i3);
                    }
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("532cfb08", new Object[]{this, absListView2, new Integer(i)});
                        return;
                    }
                    OnScrollStateChanged onScrollStateChanged2 = OnScrollStateChanged.this;
                    if (onScrollStateChanged2 != null) {
                        onScrollStateChanged2.onScrollStateChanged(absListView2, i);
                    }
                }
            });
        }
    }
}
