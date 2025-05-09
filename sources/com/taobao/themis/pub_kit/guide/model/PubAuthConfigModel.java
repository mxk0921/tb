package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;", "Ljava/io/Serializable;", "()V", "apiBlackList", "", "", "getApiBlackList", "()Ljava/util/List;", "setApiBlackList", "(Ljava/util/List;)V", "enableHideBackButton", "", "getEnableHideBackButton", "()Ljava/lang/Boolean;", "setEnableHideBackButton", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableHideNavibar", "getEnableHideNavibar", "setEnableHideNavibar", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubAuthConfigModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> apiBlackList;
    private Boolean enableHideBackButton;
    private Boolean enableHideNavibar;

    static {
        t2o.a(845152323);
    }

    public final List<String> getApiBlackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5ab2e787", new Object[]{this});
        }
        return this.apiBlackList;
    }

    public final Boolean getEnableHideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8f77cdf8", new Object[]{this});
        }
        return this.enableHideBackButton;
    }

    public final Boolean getEnableHideNavibar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("736ba596", new Object[]{this});
        }
        return this.enableHideNavibar;
    }

    public final void setApiBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88d1cbd", new Object[]{this, list});
        } else {
            this.apiBlackList = list;
        }
    }

    public final void setEnableHideBackButton(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b345a6", new Object[]{this, bool});
        } else {
            this.enableHideBackButton = bool;
        }
    }

    public final void setEnableHideNavibar(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb0ef60", new Object[]{this, bool});
        } else {
            this.enableHideNavibar = bool;
        }
    }
}
