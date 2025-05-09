package com.uc.webview.export.extension;

import com.uc.webview.base.Log;
import com.uc.webview.internal.interfaces.IWebSettingsExtension;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UCSettings {
    public static final int FORCE_USER_SCALABLE_DEFAULT = 0;
    public static final int FORCE_USER_SCALABLE_DISABLE = 2;
    public static final int FORCE_USER_SCALABLE_ENABLE = 1;
    private IWebSettingsExtension mImpl;

    public UCSettings(IWebSettingsExtension iWebSettingsExtension) {
        this.mImpl = iWebSettingsExtension;
    }

    @Deprecated
    public static void updateBussinessInfo(int i, int i2, String str, Object obj) {
        if ("crwp_hybrid_render_embed_view_enable_list".equals(str)) {
            str = SettingKeys.EmbedViewHybridRenderEnableList;
        } else if ("crwp_embed_surface_embed_view_enable_list".equals(str)) {
            str = SettingKeys.EmbedViewEmbedSurfaceEnableList;
        }
        if (obj instanceof String[]) {
            GlobalSettings.setValue(str, (String[]) obj);
        } else if (obj instanceof String) {
            GlobalSettings.setValue(str, (String) obj);
        }
    }

    public boolean getKeywordHyperlinkEnabled() {
        return this.mImpl.getKeywordHyperlinkEnabled();
    }

    public void setBlockNavigationPattern(int i, String str) {
        this.mImpl.setBlockNavigationPattern(i, str);
    }

    public void setDisableBlinkFeatureStopInBackground(boolean z) {
        this.mImpl.setDisableBlinkFeatureStopInBackground(z);
    }

    public void setDisableHistoryCorsLimit(boolean z) {
        this.mImpl.invoke(IWebSettingsExtension.IExtenderID.SET_DISABLE_HISTORY_CORS_LIMIT, new Boolean[]{Boolean.valueOf(z)});
    }

    public void setExportWebViewHashCode(int i) {
        this.mImpl.setExportWebViewHashCode(i);
    }

    public void setExposeMainFrameCallingStack(boolean z) {
        this.mImpl.setExposeMainFrameCallingStack(z);
    }

    public void setForceUserSelect(boolean z) {
        this.mImpl.setForceUserSelect(z);
    }

    public void setKeywordHyperlinkEnabled(boolean z) {
        this.mImpl.setKeywordHyperlinkEnabled(z);
    }

    public void setRenderProcStrategy(int i) {
        this.mImpl.invoke(1, new Integer[]{Integer.valueOf(i)});
    }

    public void setTracingInfo(Map<String, String> map) {
        try {
            this.mImpl.invoke(IWebSettingsExtension.IExtenderID.SET_TRACING_INFO, new Object[]{map});
        } catch (Exception e) {
            Log.e("UCSettings", "setTracingInfo", e);
        }
    }

    public void setWebCompassInfo(boolean z, String str) {
        this.mImpl.setWebCompassInfo(z, str);
    }

    @Deprecated
    public void setBusinessMode(int i) {
    }

    @Deprecated
    public void setEnableFastScroller(boolean z) {
    }

    @Deprecated
    public static void setGlobalBoolValue(String str, boolean z) {
    }

    @Deprecated
    public static void setGlobalStringValue(String str, String str2) {
    }
}
