package com.taobao.taolive.movehighlight.screen.frame;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.axa;
import tb.dxa;
import tb.huk;
import tb.t2o;
import tb.ux9;
import tb.vc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ClearScreenDXFrame extends BaseFrame implements huk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXRootView clearScreenDXRootView;
    private FrameLayout container;

    static {
        t2o.a(779092692);
        t2o.a(806355884);
    }

    public ClearScreenDXFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(ClearScreenDXFrame clearScreenDXFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1777320968) {
            super.onCreateView2((ViewGroup) objArr[0]);
            return null;
        } else if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/movehighlight/screen/frame/ClearScreenDXFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        if (viewGroup instanceof FrameLayout) {
            this.container = (FrameLayout) viewGroup;
        }
        if (!vc.a()) {
            return;
        }
        if (vc.i(this.mContext) || vc.d(this.mContext)) {
            vc.k(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (!vc.a()) {
        } else {
            if (vc.i(this.mContext) || vc.d(this.mContext)) {
                vc.l(this);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        dxa.b(this.mFrameContext).m(null);
    }

    @Override // tb.huk
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (this.clearScreenDXRootView != null) {
            axa f = axa.f();
            DXRootView dXRootView = this.clearScreenDXRootView;
            f.h(dXRootView, dXRootView.getData(), this.mFrameContext);
        }
    }

    public void setVisibility(boolean z) {
        FrameLayout frameLayout;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5ae299", new Object[]{this, new Boolean(z)});
        } else if (dxa.b(this.mFrameContext).c() != null && this.container != null) {
            DXRootView a2 = axa.f().a(this.mContext, "highlight_clear_screen");
            this.clearScreenDXRootView = a2;
            if (a2 != null && (frameLayout = this.container) != null) {
                frameLayout.removeAllViews();
                this.container.addView(this.clearScreenDXRootView);
                axa.f().h(this.clearScreenDXRootView, dxa.b(this.mFrameContext).c(), this.mFrameContext);
                FrameLayout frameLayout2 = this.container;
                if (!z) {
                    i = 8;
                }
                frameLayout2.setVisibility(i);
            }
        }
    }
}
