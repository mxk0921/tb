package com.taobao.vessel.base;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.utils.VesselType;
import java.util.Map;
import tb.ask;
import tb.bzo;
import tb.g4w;
import tb.i4w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class VesselBaseView extends FrameLayout implements ask, bzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAutoResize;
    public String mDowngradeUrl;
    public a mEventCallback;
    public volatile String mInstanceId;
    public ask mOnLoadListener;
    public Object mOriginParams;
    public String mOriginUrl;
    public bzo mScrollViewListener;
    public i4w mVesselViewCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(967835658);
        t2o.a(967835665);
        t2o.a(967835662);
        t2o.a(967835663);
    }

    public VesselBaseView(Context context) {
        super(context);
        this.mDowngradeUrl = null;
        this.mAutoResize = false;
    }

    public static /* synthetic */ Object ipc$super(VesselBaseView vesselBaseView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/base/VesselBaseView");
    }

    public void createView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c27592", new Object[]{this, str});
            return;
        }
        this.mOriginUrl = str;
        loadUrl(str, null);
    }

    public abstract void fireEvent(String str, Map<String, Object> map);

    public abstract View getChildView();

    public boolean isAutoResize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a2eda18", new Object[]{this})).booleanValue();
        }
        return this.mAutoResize;
    }

    public void loadData(VesselType vesselType, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
        }
    }

    public abstract void loadUrl(String str, Object obj);

    public boolean needIntercept(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3767ac", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public abstract /* synthetic */ void onDestroy();

    @Override // tb.ask
    public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
        }
    }

    public void onLoadError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            return;
        }
        ask askVar = this.mOnLoadListener;
        if (askVar != null) {
            askVar.onLoadError(g4wVar);
        }
    }

    public void onLoadFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            return;
        }
        ask askVar = this.mOnLoadListener;
        if (askVar != null) {
            askVar.onLoadFinish(view);
        }
    }

    public void onLoadStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            return;
        }
        ask askVar = this.mOnLoadListener;
        if (askVar != null) {
            askVar.onLoadStart();
        }
    }

    public abstract /* synthetic */ void onPause();

    public abstract /* synthetic */ void onResume();

    @Override // tb.bzo
    public void onScrollChanged(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75cdfa3", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollChanged(view, i, i2, i3, i4);
        }
    }

    public boolean onScrollEnabled(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a67b062", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollEnabled(view, z);
        }
        return z;
    }

    public void onScrollRightOrLeftEdge(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb0f4f4", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollRightOrLeftEdge(view, i, i2);
        }
    }

    public void onScrollToBottom(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58dac99", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollToBottom(view, i, i2);
        }
    }

    public void onScrollToTop(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a369839d", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollToTop(view, i, i2);
        }
    }

    public abstract /* synthetic */ void onStart();

    public abstract /* synthetic */ void onStop();

    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        return true;
    }

    public abstract void releaseMemory();

    public void setAutoResize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8201508", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoResize = z;
        }
    }

    public void setEventCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca74dbe", new Object[]{this, aVar});
        }
    }

    public void setOnLoadListener(ask askVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf745a62", new Object[]{this, askVar});
        } else {
            this.mOnLoadListener = askVar;
        }
    }

    public void setOnScrollViewListener(bzo bzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49519229", new Object[]{this, bzoVar});
        } else {
            this.mScrollViewListener = bzoVar;
        }
    }

    public void setVesselViewCallback(i4w i4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3178c0d4", new Object[]{this, i4wVar});
        } else {
            this.mVesselViewCallback = i4wVar;
        }
    }

    public void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
        } else {
            loadData(null, str);
        }
    }

    public boolean refresh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad3d31e6", new Object[]{this})).booleanValue() : refresh(null);
    }

    public void loadData(VesselType vesselType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7900d8bc", new Object[]{this, vesselType, str});
        } else {
            loadData(vesselType, str, null);
        }
    }

    public VesselBaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDowngradeUrl = null;
        this.mAutoResize = false;
    }
}
