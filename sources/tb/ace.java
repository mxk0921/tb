package tb;

import android.taobao.windvane.extra.uc.pool.PreCreateInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ace {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface a {
        String a(String str, String str2, String str3);
    }

    void addPrerenderAttachEventListener(ycd ycdVar);

    void addPrerenderSuccessEventListener(add addVar);

    void addWebViewPageModel(cce cceVar);

    String getCustomMegaBizId();

    String getCustomMegaNamespace();

    boolean getEnableAsyncJSAPIChannel();

    String getMegaBizId();

    a getMegaHandler();

    PreCreateInfo getPreCreateInfo();

    String getRealUrl();

    cce getWebViewPageModel();

    boolean isClientPrerender();

    boolean isHitSnapshot();

    boolean isThemis();

    void notifyPrerenderSuccess();

    void removePrerenderAttachEventListener();

    void setCustomMegaBizId(String str);

    void setCustomMegaNamespace(String str);

    void setEnableAsyncJSAPIChannel(boolean z);

    void setHitSnapshot(boolean z);

    void setIsClientPrerender(boolean z);

    void setMainFrameResponseInfo(w9o w9oVar);

    void setMegaHandler(a aVar);

    void setPreCreateInfo(PreCreateInfo preCreateInfo);

    void setRealUrl(String str);

    void setThemis(boolean z);
}
