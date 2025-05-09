package com.taobao.live.timemove.weex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.weex.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLiveVideoRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDetachedFromWindowListener;
    private b mVisibilityChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    static {
        t2o.a(779092245);
    }

    public TBLiveVideoRootView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLiveVideoRootView tBLiveVideoRootView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/timemove/weex/TBLiveVideoRootView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mDetachedFromWindowListener;
        if (aVar != null) {
            ((a.C0582a) aVar).a();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        b bVar = this.mVisibilityChangedListener;
        if (bVar != null) {
            ((a.b) bVar).a(i);
        }
    }

    public TBLiveVideoRootView whenDetachedFromWindow(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveVideoRootView) ipChange.ipc$dispatch("f5e036ea", new Object[]{this, aVar});
        }
        this.mDetachedFromWindowListener = aVar;
        return this;
    }

    public TBLiveVideoRootView whenVisibilityChanged(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveVideoRootView) ipChange.ipc$dispatch("d080dc9a", new Object[]{this, bVar});
        }
        this.mVisibilityChangedListener = bVar;
        return this;
    }

    public TBLiveVideoRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TBLiveVideoRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
