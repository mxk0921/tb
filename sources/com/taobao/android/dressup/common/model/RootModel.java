package com.taobao.android.dressup.common.model;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/taobao/android/dressup/common/model/RootModel;", "", "()V", "bottomContainerLinkable", "", "getBottomContainerLinkable", "()Z", "setBottomContainerLinkable", "(Z)V", "ceilingImageUrl", "", "getCeilingImageUrl", "()Ljava/lang/String;", "setCeilingImageUrl", "(Ljava/lang/String;)V", "forbidRefreshContainers", "Lcom/alibaba/fastjson/JSONArray;", "getForbidRefreshContainers", "()Lcom/alibaba/fastjson/JSONArray;", "setForbidRefreshContainers", "(Lcom/alibaba/fastjson/JSONArray;)V", "showPullToRefresh", "getShowPullToRefresh", "setShowPullToRefresh", "skeletonImageUrl", "getSkeletonImageUrl", "setSkeletonImageUrl", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class RootModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean bottomContainerLinkable;
    private String ceilingImageUrl;
    private JSONArray forbidRefreshContainers;
    private boolean showPullToRefresh;
    private String skeletonImageUrl;

    static {
        t2o.a(918552676);
    }

    public final boolean getBottomContainerLinkable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cf9b5f", new Object[]{this})).booleanValue();
        }
        return this.bottomContainerLinkable;
    }

    public final String getCeilingImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb9a21e", new Object[]{this});
        }
        return this.ceilingImageUrl;
    }

    public final JSONArray getForbidRefreshContainers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c740d214", new Object[]{this});
        }
        return this.forbidRefreshContainers;
    }

    public final boolean getShowPullToRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835f0af3", new Object[]{this})).booleanValue();
        }
        return this.showPullToRefresh;
    }

    public final String getSkeletonImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a06b662", new Object[]{this});
        }
        return this.skeletonImageUrl;
    }

    public final void setBottomContainerLinkable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10de5e5", new Object[]{this, new Boolean(z)});
        } else {
            this.bottomContainerLinkable = z;
        }
    }

    public final void setCeilingImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a27680", new Object[]{this, str});
        } else {
            this.ceilingImageUrl = str;
        }
    }

    public final void setForbidRefreshContainers(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a05786", new Object[]{this, jSONArray});
        } else {
            this.forbidRefreshContainers = jSONArray;
        }
    }

    public final void setShowPullToRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac6a1d1", new Object[]{this, new Boolean(z)});
        } else {
            this.showPullToRefresh = z;
        }
    }

    public final void setSkeletonImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e312a454", new Object[]{this, str});
        } else {
            this.skeletonImageUrl = str;
        }
    }
}
