package com.taobao.detail.rate.model.v2;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/taobao/detail/rate/model/v2/AskInfo;", "Ljava/io/Serializable;", "()V", "askIcon", "", "getAskIcon", "()Ljava/lang/String;", "setAskIcon", "(Ljava/lang/String;)V", "askText", "getAskText", "setAskText", "linkUrl", "getLinkUrl", "setLinkUrl", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class AskInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String askText = "";
    private String askIcon = "";
    private String linkUrl = "";

    public final String getAskIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6f1fe1d", new Object[]{this});
        }
        return this.askIcon;
    }

    public final String getAskText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fe92de9", new Object[]{this});
        }
        return this.askText;
    }

    public final String getLinkUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a02c617a", new Object[]{this});
        }
        return this.linkUrl;
    }

    public final void setAskIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe514e61", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.askIcon = str;
    }

    public final void setAskText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4401815", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.askText = str;
    }

    public final void setLinkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6356a4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.linkUrl = str;
    }
}
