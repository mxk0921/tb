package com.taobao.themis.external.embed;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.woo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/taobao/themis/external/embed/StartParams;", "Ljava/io/Serializable;", "<init>", "()V", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Ltb/woo;", "safeArea", "Ltb/woo;", "getSafeArea", "()Ltb/woo;", "setSafeArea", "(Ltb/woo;)V", "Lcom/taobao/themis/kernel/extension/page/rum/TMSEmbedPresentModeType;", "embedType", "Lcom/taobao/themis/kernel/extension/page/rum/TMSEmbedPresentModeType;", "getEmbedType", "()Lcom/taobao/themis/kernel/extension/page/rum/TMSEmbedPresentModeType;", "setEmbedType", "(Lcom/taobao/themis/kernel/extension/page/rum/TMSEmbedPresentModeType;)V", "customUserAgent", "getCustomUserAgent", "setCustomUserAgent", "themis_kernel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class StartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String customUserAgent;
    private TMSEmbedPresentModeType embedType = TMSEmbedPresentModeType.CARD;
    private woo safeArea;
    private String url;

    static {
        t2o.a(839909379);
    }

    public String getCustomUserAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbe9cd86", new Object[]{this});
        }
        return this.customUserAgent;
    }

    public TMSEmbedPresentModeType getEmbedType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbedPresentModeType) ipChange.ipc$dispatch("3ebe8655", new Object[]{this});
        }
        return this.embedType;
    }

    public woo getSafeArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (woo) ipChange.ipc$dispatch("7ebd29c8", new Object[]{this});
        }
        return this.safeArea;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void setCustomUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b77b818", new Object[]{this, str});
        } else {
            this.customUserAgent = str;
        }
    }

    public void setEmbedType(TMSEmbedPresentModeType tMSEmbedPresentModeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a134e9", new Object[]{this, tMSEmbedPresentModeType});
            return;
        }
        ckf.g(tMSEmbedPresentModeType, "<set-?>");
        this.embedType = tMSEmbedPresentModeType;
    }

    public void setSafeArea(woo wooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64d553e", new Object[]{this, wooVar});
        } else {
            this.safeArea = wooVar;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }
}
