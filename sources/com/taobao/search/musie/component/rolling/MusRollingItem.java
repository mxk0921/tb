package com.taobao.search.musie.component.rolling;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusRollingItem extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean appearState;

    static {
        t2o.a(815792704);
    }

    public MusRollingItem(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MusRollingItem musRollingItem, String str, Object... objArr) {
        if (str.hashCode() == 1676731387) {
            super.fireEvent((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/rolling/MusRollingItem");
    }

    public final void appear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
        } else if (!this.appearState) {
            this.appearState = true;
            if (hasEvent("appear")) {
                getInstance().fireEventOnNode(getNodeId(), "appear", null);
            }
        }
    }

    public final void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
        } else if (this.appearState) {
            this.appearState = false;
            if (hasEvent("disappear")) {
                getInstance().fireEventOnNode(getNodeId(), "disappear", null);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "event");
        if (!ckf.b(str, "appear") && !ckf.b(str, "disappear")) {
            super.fireEvent(str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.LAYOUT;
    }
}
