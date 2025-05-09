package com.taobao.vessel.local;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ask;
import tb.bzo;
import tb.g4w;
import tb.h4w;
import tb.hjj;
import tb.i4w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class VesselNativeFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ask mOnLoadListener;
    public bzo mScrollViewListener;
    public h4w mVesselNativePlugin;
    public i4w mViewCallback;
    public Map<String, Object> mfireEventParams;
    public Object vesselParams;

    static {
        t2o.a(967835667);
        t2o.a(967835665);
    }

    public VesselNativeFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(VesselNativeFrameLayout vesselNativeFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/local/VesselNativeFrameLayout");
    }

    public void callVessel(Map<String, Object> map, hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543ed6ce", new Object[]{this, map, hjjVar});
            return;
        }
        h4w h4wVar = this.mVesselNativePlugin;
        if (h4wVar != null) {
            h4wVar.a(map, hjjVar);
        }
    }

    public Object getVesselParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("64326ef9", new Object[]{this});
        }
        return this.vesselParams;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    public void notifyPageFinish(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05da060", new Object[]{this, view});
            return;
        }
        ask askVar = this.mOnLoadListener;
        if (askVar != null) {
            askVar.onLoadFinish(view);
        }
    }

    public void notifyPositionOnBottom(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ccd8c3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollToBottom(this, i, i2);
        }
    }

    public void notifyPositionOnRightOrLeftEdge(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a2f4f9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollRightOrLeftEdge(this, i, i2);
        }
    }

    public void notifyPositionOnScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca29f05", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollChanged(this, i, i2, i3, i4);
        }
    }

    public void notifyPositionOnTop(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c423a6ab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bzo bzoVar = this.mScrollViewListener;
        if (bzoVar != null) {
            bzoVar.onScrollToBottom(this, i, i2);
        }
    }

    public void notityPageError(g4w g4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25c3c16", new Object[]{this, g4wVar});
            return;
        }
        ask askVar = this.mOnLoadListener;
        if (askVar != null) {
            askVar.onLoadError(g4wVar);
        }
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mOnLoadListener = null;
        this.mScrollViewListener = null;
        this.mViewCallback = null;
        this.mVesselNativePlugin = null;
    }

    public void onFireEvent(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87792119", new Object[]{this, map});
        } else {
            this.mfireEventParams = map;
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (view.getParent() == null) {
            addView(view);
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

    public void setScrollViewListener(bzo bzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39987c48", new Object[]{this, bzoVar});
        } else {
            this.mScrollViewListener = bzoVar;
        }
    }

    public void setVesselParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad17b01", new Object[]{this, obj});
        } else {
            this.vesselParams = obj;
        }
    }

    public void setVesselViewCallback(i4w i4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3178c0d4", new Object[]{this, i4wVar});
            return;
        }
        this.mViewCallback = i4wVar;
        h4w h4wVar = this.mVesselNativePlugin;
        if (h4wVar != null) {
            h4wVar.f20412a = i4wVar;
        }
    }

    public VesselNativeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselNativeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h4w h4wVar = new h4w();
        this.mVesselNativePlugin = h4wVar;
        h4wVar.f20412a = this.mViewCallback;
    }
}
