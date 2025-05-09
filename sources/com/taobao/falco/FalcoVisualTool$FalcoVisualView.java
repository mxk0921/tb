package com.taobao.falco;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoVisualTool$FalcoVisualView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private FalcoVisualTool$LevitatedSphereView mLevitatedSphere;
    private boolean mLevitatedSphereShowed = true;
    private FalcoVisualTool$SuspendedWindowView mSuspendedWindow;
    public final int sphereHeight;
    public final int sphereWidth;
    public final int windowHeight;
    public final int windowWidth;

    public FalcoVisualTool$FalcoVisualView(Context context) {
        super(context);
        this.mContext = context;
        init();
        FalcoVisualTool$SuspendedWindowView falcoVisualTool$SuspendedWindowView = this.mSuspendedWindow;
        this.windowWidth = falcoVisualTool$SuspendedWindowView.width;
        this.windowHeight = falcoVisualTool$SuspendedWindowView.height;
        FalcoVisualTool$LevitatedSphereView falcoVisualTool$LevitatedSphereView = this.mLevitatedSphere;
        this.sphereWidth = falcoVisualTool$LevitatedSphereView.width;
        this.sphereHeight = falcoVisualTool$LevitatedSphereView.height;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        FalcoVisualTool$SuspendedWindowView falcoVisualTool$SuspendedWindowView = new FalcoVisualTool$SuspendedWindowView(this.mContext);
        this.mSuspendedWindow = falcoVisualTool$SuspendedWindowView;
        falcoVisualTool$SuspendedWindowView.setVisibility(8);
        FalcoVisualTool$SuspendedWindowView falcoVisualTool$SuspendedWindowView2 = this.mSuspendedWindow;
        FalcoVisualTool$SuspendedWindowView falcoVisualTool$SuspendedWindowView3 = this.mSuspendedWindow;
        addView(falcoVisualTool$SuspendedWindowView2, new FrameLayout.LayoutParams(falcoVisualTool$SuspendedWindowView3.width, falcoVisualTool$SuspendedWindowView3.height));
        FalcoVisualTool$LevitatedSphereView falcoVisualTool$LevitatedSphereView = new FalcoVisualTool$LevitatedSphereView(this.mContext);
        this.mLevitatedSphere = falcoVisualTool$LevitatedSphereView;
        falcoVisualTool$LevitatedSphereView.setVisibility(0);
        FalcoVisualTool$LevitatedSphereView falcoVisualTool$LevitatedSphereView2 = this.mLevitatedSphere;
        FalcoVisualTool$LevitatedSphereView falcoVisualTool$LevitatedSphereView3 = this.mLevitatedSphere;
        addView(falcoVisualTool$LevitatedSphereView2, new FrameLayout.LayoutParams(falcoVisualTool$LevitatedSphereView3.width, falcoVisualTool$LevitatedSphereView3.height));
    }

    public static /* synthetic */ Object ipc$super(FalcoVisualTool$FalcoVisualView falcoVisualTool$FalcoVisualView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoVisualTool$FalcoVisualView");
    }

    public void addColorBlock(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b817a6", new Object[]{this, new Long(j), str, str2});
        } else {
            this.mSuspendedWindow.addColorBlock(j, str, str2);
        }
    }

    public void addDetailItem(int i, String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da19ab64", new Object[]{this, new Integer(i), str, map});
        } else {
            this.mSuspendedWindow.addDetailItem(i, str, map);
        }
    }

    public void clearAllColorBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e56fa5", new Object[]{this});
        } else {
            this.mSuspendedWindow.clearAllColorBlock();
        }
    }

    public boolean containColorBlockTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d32c52f", new Object[]{this, str})).booleanValue();
        }
        return this.mSuspendedWindow.containColorBlockTitle(str);
    }

    public String getDetailItemContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8834055a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.mSuspendedWindow.getDetailItemContent(i, i2);
    }

    public void setItemVisibility(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737f516e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mSuspendedWindow.setItemVisibility(i, i2);
        }
    }

    public void setSphereClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4659e5", new Object[]{this, onClickListener});
        } else {
            this.mLevitatedSphere.setCustomClickListener(onClickListener);
        }
    }

    public void setSphereDraggingListener(vz8.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec485ff2", new Object[]{this, gVar});
        } else {
            this.mLevitatedSphere.setCustomDraggingListener(gVar);
        }
    }

    public void setWindowDoubleClickListener(vz8.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207cdfb7", new Object[]{this, fVar});
        } else {
            this.mSuspendedWindow.setCustomDoubleClickListener(fVar);
        }
    }

    public void setWindowDraggingListener(vz8.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d897b2f", new Object[]{this, gVar});
        } else {
            this.mSuspendedWindow.setCustomDraggingListener(gVar);
        }
    }

    public void showLevitatedSphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae9fb51", new Object[]{this});
        } else if (!this.mLevitatedSphereShowed) {
            this.mSuspendedWindow.setVisibility(8);
            this.mLevitatedSphere.setVisibility(0);
            this.mLevitatedSphereShowed = true;
        }
    }

    public void showSuspendedWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526e8675", new Object[]{this});
        } else if (this.mLevitatedSphereShowed) {
            this.mLevitatedSphere.setVisibility(8);
            this.mSuspendedWindow.setVisibility(0);
            this.mLevitatedSphereShowed = false;
        }
    }

    public void updateDetailItem(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa01ade", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else {
            this.mSuspendedWindow.updateDetailItem(i, i2, str);
        }
    }

    public void setItemVisibility(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6b4f55", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mSuspendedWindow.setItemVisibility(i, i2, i3);
        }
    }
}
