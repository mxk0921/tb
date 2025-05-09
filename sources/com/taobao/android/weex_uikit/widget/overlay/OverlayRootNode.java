package com.taobao.android.weex_uikit.widget.overlay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OverlayRootNode extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSOverlay overlay;

    static {
        t2o.a(986710201);
    }

    public OverlayRootNode(int i, MUSOverlay mUSOverlay) {
        super(i);
        this.overlay = mUSOverlay;
    }

    public static /* synthetic */ Object ipc$super(OverlayRootNode overlayRootNode, String str, Object... objArr) {
        if (str.hashCode() == 56600925) {
            super.onChildrenChanged();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/OverlayRootNode");
    }

    public MUSOverlay getOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlay) ipChange.ipc$dispatch("d265b1bb", new Object[]{this});
        }
        return this.overlay;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        super.onChildrenChanged();
        this.overlay.childrenChanged();
    }
}
