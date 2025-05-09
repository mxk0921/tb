package com.taobao.weex.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXScrollView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<WXScrollViewListener> mScrollViewListeners = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface WXScrollViewListener {
        void onScroll(WXScrollView wXScrollView, int i, int i2);

        void onScrollChanged(WXScrollView wXScrollView, int i, int i2, int i3, int i4);

        void onScrollStopped(WXScrollView wXScrollView, int i, int i2);

        void onScrollToBottom(WXScrollView wXScrollView, int i, int i2);
    }

    static {
        t2o.a(985661736);
    }

    public WXScrollView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WXScrollView wXScrollView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/WXScrollView");
    }

    public void addScrollViewListener(WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60fc2065", new Object[]{this, wXScrollViewListener});
        } else if (!this.mScrollViewListeners.contains(wXScrollViewListener)) {
            this.mScrollViewListeners.add(wXScrollViewListener);
        }
    }

    public Rect getContentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("82dbf0fa", new Object[]{this});
        }
        return new Rect(0, 0, computeHorizontalScrollRange(), computeVerticalScrollRange());
    }

    public void removeScrollViewListener(WXScrollViewListener wXScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c99ae2", new Object[]{this, wXScrollViewListener});
        } else {
            this.mScrollViewListeners.remove(wXScrollViewListener);
        }
    }

    public WXScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WXScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
