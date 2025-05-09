package com.taobao.themis.external.embed;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.themis.external.embed.TMSWidgetInfo;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.uc.webview.export.media.CommandID;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.n51;
import tb.p8s;
import tb.s54;
import tb.t2o;
import tb.tsq;
import tb.uqx;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0005J\b\u0010L\u001a\u0004\u0018\u000100J\u0010\u0010M\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020\u0005J\b\u0010O\u001a\u0004\u0018\u00010\u0005J\u0006\u0010P\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001a\u0010&\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001e\u00108\u001a\u0004\u0018\u00010\u00058VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR\u001c\u0010;\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR\u001c\u0010>\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR\u001c\u0010A\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR\u001c\u0010D\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\tR(\u0010G\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\t¨\u0006Q"}, d2 = {"Lcom/taobao/themis/external/embed/WidgetStartParams;", "Lcom/taobao/themis/external/embed/StartParams;", "Ljava/io/Serializable;", "()V", "debugUrl", "", "getDebugUrl", "()Ljava/lang/String;", "setDebugUrl", "(Ljava/lang/String;)V", "extraData", "getExtraData", "setExtraData", "hasAttached", "", "getHasAttached", "()Z", "setHasAttached", "(Z)V", "hasValidWidgetInfo", "getHasValidWidgetInfo", "setHasValidWidgetInfo", "value", "height", "getHeight", "setHeight", "initData", "getInitData", "setInitData", "lazyInit", "getLazyInit", "setLazyInit", "mSpmOri", "getMSpmOri", "setMSpmOri", "metaInfo", uqx.ZIM_IDENTIFY_GET_META_INFO, "setMetaInfo", "muted", "getMuted", CommandID.setMuted, "relationUrl", "getRelationUrl", "setRelationUrl", "sceneParams", "getSceneParams", "setSceneParams", "sceneParamsObject", "Lcom/alibaba/fastjson/JSONObject;", "getSceneParamsObject", "()Lcom/alibaba/fastjson/JSONObject;", "setSceneParamsObject", "(Lcom/alibaba/fastjson/JSONObject;)V", "spmUrl", "getSpmUrl", "setSpmUrl", "url", "getUrl", "setUrl", "version", "getVersion", "setVersion", "viewId", "getViewId", "setViewId", "widgetId", "getWidgetId", "setWidgetId", "widgetInfo", "getWidgetInfo", "setWidgetInfo", "width", "getWidth", "setWidth", CartRecommendRefreshScene.build, "getRealSpmUrl", "getSceneParamObject", "getSceneParamValue", "key", "getSpmOri", "getWidgetUrl", "themis_interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WidgetStartParams extends StartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String debugUrl;
    private String extraData;
    private boolean hasAttached;
    private boolean hasValidWidgetInfo;
    private String height;
    private String initData;
    private boolean lazyInit;
    private String mSpmOri;
    private String metaInfo;
    private boolean muted;
    private String relationUrl;
    private String sceneParams;
    private JSONObject sceneParamsObject;
    private String spmUrl;
    private String url;
    private String version;
    private String viewId;
    private String widgetId;
    private String widgetInfo;
    private String width;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n51 i = n51.i();
            String widgetId = WidgetStartParams.this.getWidgetId();
            ckf.d(widgetId);
            i.b(widgetId, WidgetStartParams.this.getMetaInfo());
        }
    }

    static {
        t2o.a(838860821);
    }

    public static /* synthetic */ Object ipc$super(WidgetStartParams widgetStartParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/WidgetStartParams");
    }

    public final String getDebugUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4a0ea7", new Object[]{this});
        }
        return this.debugUrl;
    }

    public final String getExtraData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2532c55", new Object[]{this});
        }
        return this.extraData;
    }

    public final boolean getHasAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e831b3", new Object[]{this})).booleanValue();
        }
        return this.hasAttached;
    }

    public final boolean getHasValidWidgetInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a6631b5", new Object[]{this})).booleanValue();
        }
        return this.hasValidWidgetInfo;
    }

    public final String getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6ba1efc", new Object[]{this});
        }
        return this.height;
    }

    public final String getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbad42a9", new Object[]{this});
        }
        return this.initData;
    }

    public final boolean getLazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dacb7a5", new Object[]{this})).booleanValue();
        }
        return this.lazyInit;
    }

    public final String getMSpmOri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("347eaf6c", new Object[]{this});
        }
        return this.mSpmOri;
    }

    public final String getMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8db4d0", new Object[]{this});
        }
        return this.metaInfo;
    }

    public final boolean getMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44bd39c0", new Object[]{this})).booleanValue();
        }
        return this.muted;
    }

    public final String getRealSpmUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("524c006", new Object[]{this});
        }
        String str = this.spmUrl;
        if (str == null || wsq.a0(str)) {
            return ckf.p("MiniApp_", this.widgetId);
        }
        String str2 = this.spmUrl;
        ckf.d(str2);
        return str2;
    }

    public final String getRelationUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd2c1a7c", new Object[]{this});
        }
        return this.relationUrl;
    }

    public final JSONObject getSceneParamObject() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3140021d", new Object[]{this});
        }
        try {
            if (getSceneParamsObject() == null) {
                if (TextUtils.isEmpty(getSceneParams())) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = JSON.parseObject(getSceneParams());
                }
                setSceneParamsObject(jSONObject);
            }
            return getSceneParamsObject();
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return null;
        }
    }

    public final String getSceneParamValue(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d6f5c95", new Object[]{this, str});
        }
        ckf.g(str, "key");
        try {
            if (getSceneParamsObject() == null) {
                if (TextUtils.isEmpty(getSceneParams())) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = JSON.parseObject(getSceneParams());
                }
                setSceneParamsObject(jSONObject);
            }
            JSONObject sceneParamsObject = getSceneParamsObject();
            ckf.d(sceneParamsObject);
            return sceneParamsObject.getString(str);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
            return null;
        }
    }

    public final String getSceneParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c58187d", new Object[]{this});
        }
        return this.sceneParams;
    }

    public final JSONObject getSceneParamsObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("349cd082", new Object[]{this});
        }
        return this.sceneParamsObject;
    }

    public final String getSpmUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf3b984", new Object[]{this});
        }
        return this.spmUrl;
    }

    @Override // com.taobao.themis.external.embed.StartParams
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return getWidgetUrl();
    }

    public final String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    public final String getViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b88d723", new Object[]{this});
        }
        return this.viewId;
    }

    public final String getWidgetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eec0a24", new Object[]{this});
        }
        return this.widgetId;
    }

    public final String getWidgetInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f07af1", new Object[]{this});
        }
        return this.widgetInfo;
    }

    public final String getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfb784e9", new Object[]{this});
        }
        return this.width;
    }

    public final void setDebugUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d520af", new Object[]{this, str});
        } else {
            this.debugUrl = str;
        }
    }

    public final void setExtraData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a501a29", new Object[]{this, str});
        } else {
            this.extraData = str;
        }
    }

    public final void setHasAttached(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1b4c11", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAttached = z;
        }
    }

    public final void setHasValidWidgetInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28909cb7", new Object[]{this, new Boolean(z)});
        } else {
            this.hasValidWidgetInfo = z;
        }
    }

    public final void setInitData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d86ced", new Object[]{this, str});
        } else {
            this.initData = str;
        }
    }

    public final void setLazyInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac155c7", new Object[]{this, new Boolean(z)});
        } else {
            this.lazyInit = z;
        }
    }

    public final void setMSpmOri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625ac6f2", new Object[]{this, str});
        } else {
            this.mSpmOri = str;
        }
    }

    public final void setMetaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2063fa6", new Object[]{this, str});
        } else {
            this.metaInfo = str;
        }
    }

    public final void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
        } else {
            this.muted = z;
        }
    }

    public final void setRelationUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2", new Object[]{this, str});
        } else {
            this.relationUrl = str;
        }
    }

    public final void setSceneParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26622601", new Object[]{this, str});
        } else {
            this.sceneParams = str;
        }
    }

    public final void setSceneParamsObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81052dda", new Object[]{this, jSONObject});
        } else {
            this.sceneParamsObject = jSONObject;
        }
    }

    public final void setSpmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922d6472", new Object[]{this, str});
        } else {
            this.spmUrl = str;
        }
    }

    @Override // com.taobao.themis.external.embed.StartParams
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public final void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
        } else {
            this.version = str;
        }
    }

    public final void setViewId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bfab3", new Object[]{this, str});
        } else {
            this.viewId = str;
        }
    }

    public final void setWidgetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597294d2", new Object[]{this, str});
        } else {
            this.widgetId = str;
        }
    }

    public final void setWidgetInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf086aa5", new Object[]{this, str});
        } else {
            this.widgetInfo = str;
        }
    }

    public final WidgetStartParams build() {
        JSONObject jSONObject;
        String l;
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("ef780bd0", new Object[]{this});
        }
        if (this.widgetInfo != null) {
            try {
                TMSWidgetInfo tMSWidgetInfo = (TMSWidgetInfo) JSON.parseObject(getWidgetInfo(), TMSWidgetInfo.class);
                if (tMSWidgetInfo != null) {
                    setHasValidWidgetInfo(true);
                    Long widgetId = tMSWidgetInfo.getWidgetId();
                    if (!(widgetId == null || (l = widgetId.toString()) == null)) {
                        setWidgetId(l);
                    }
                    String widgetVersion = tMSWidgetInfo.getWidgetVersion();
                    if (widgetVersion != null) {
                        setVersion(widgetVersion);
                    }
                    xhv xhvVar = null;
                    if (getWidth() == null) {
                        TMSWidgetInfo.ViewConfig viewConfig = tMSWidgetInfo.getViewConfig();
                        if (s54.a(viewConfig == null ? null : viewConfig.getWidth())) {
                            TMSWidgetInfo.ViewConfig viewConfig2 = tMSWidgetInfo.getViewConfig();
                            ckf.d(viewConfig2);
                            String width = viewConfig2.getWidth();
                            ckf.d(width);
                            setWidth(width);
                        }
                    }
                    if (getHeight() == null) {
                        TMSWidgetInfo.ViewConfig viewConfig3 = tMSWidgetInfo.getViewConfig();
                        if (s54.a(viewConfig3 == null ? null : viewConfig3.getHeight())) {
                            TMSWidgetInfo.ViewConfig viewConfig4 = tMSWidgetInfo.getViewConfig();
                            ckf.d(viewConfig4);
                            String height = viewConfig4.getHeight();
                            ckf.d(height);
                            setHeight(height);
                        }
                    }
                    String metaInfo = tMSWidgetInfo.getMetaInfo();
                    if (metaInfo != null) {
                        setMetaInfo(metaInfo);
                    }
                    String relationUrl = tMSWidgetInfo.getRelationUrl();
                    if (relationUrl != null) {
                        setRelationUrl(relationUrl);
                    }
                    if (tMSWidgetInfo.getConfigData() != null) {
                        if (TextUtils.isEmpty(getSceneParams())) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = JSON.parseObject(getSceneParams());
                        }
                        setSceneParamsObject(jSONObject);
                        JSONObject sceneParamsObject = getSceneParamsObject();
                        ckf.d(sceneParamsObject);
                        sceneParamsObject.put((JSONObject) "moduleData", (String) JSON.parse(tMSWidgetInfo.getConfigData()));
                        JSONObject sceneParamsObject2 = getSceneParamsObject();
                        ckf.d(sceneParamsObject2);
                        setSceneParams(sceneParamsObject2.toJSONString());
                        xhvVar = xhv.INSTANCE;
                    }
                    Result.m1108constructorimpl(xhvVar);
                }
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
        if (this.debugUrl != null) {
            Uri parse = Uri.parse(getDebugUrl());
            String queryParameter = parse.getQueryParameter("_ariver_appid");
            if (!TextUtils.isEmpty(queryParameter)) {
                setWidgetId(queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("relationUrl");
            if (!TextUtils.isEmpty(queryParameter2)) {
                setRelationUrl(URLDecoder.decode(queryParameter2));
            }
        }
        if (!(this.metaInfo == null || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null)) {
            executor.execute(new a());
        }
        return this;
    }

    public final String getSpmOri() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1059306d", new Object[]{this});
        }
        if (this.mSpmOri == null) {
            String str = "miniapp_" + ((Object) getWidgetId()) + "_scene" + ((Object) getSceneParamValue("sceneId"));
            String spmUrl = getSpmUrl();
            Object obj2 = "0";
            if (spmUrl == null) {
                obj = obj2;
            } else {
                List z0 = wsq.z0(spmUrl, new String[]{"."}, false, 0, 6, null);
                obj = z0.size() > 1 ? z0.get(1) : obj2;
                if (!z0.isEmpty()) {
                    obj2 = z0.get(0);
                }
            }
            setMSpmOri(((String) obj2) + '.' + ((String) obj) + '.' + str + ".0");
        }
        String str2 = this.mSpmOri;
        ckf.d(str2);
        return str2;
    }

    public final String getWidgetUrl() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2f98844", new Object[]{this});
        }
        String str = this.debugUrl;
        if (str == null || wsq.a0(str)) {
            z = true;
        }
        if (z) {
            str = null;
        }
        if (str == null) {
            setDebugUrl(ckf.p("https://m.duanqu.com?isCanal=true&_ariver_appid=", getWidgetId()));
            if (getVersion() != null) {
                setDebugUrl(((Object) getDebugUrl()) + "&nbsv=" + ((Object) getVersion()));
            }
            if (ckf.b(getSceneParamValue("isPreview"), "1")) {
                setDebugUrl(ckf.p(getDebugUrl(), "&&nbsource=debug&nbsn=DEBUG"));
            }
        }
        String str2 = this.debugUrl;
        ckf.d(str2);
        return str2;
    }

    public final void setHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
            return;
        }
        if (str != null && tsq.w(str, "rpx", false, 2, null)) {
            str = str.substring(0, str.length() - 3);
            ckf.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.height = str;
    }

    public final void setWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c411ae15", new Object[]{this, str});
            return;
        }
        if (str != null && tsq.w(str, "rpx", false, 2, null)) {
            str = str.substring(0, str.length() - 3);
            ckf.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.width = str;
    }
}
