package com.taobao.themis.external.embed;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import java.io.Serializable;
import kotlin.Metadata;
import tb.lce;
import tb.t2o;
import tb.z1x;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108¨\u0006<"}, d2 = {"Lcom/taobao/themis/external/embed/Weex2StartParams;", "Lcom/taobao/themis/external/embed/SinglePageStartParams;", "Ljava/io/Serializable;", "<init>", "()V", "Lcom/alibaba/fastjson/JSONObject;", "initData", "Lcom/alibaba/fastjson/JSONObject;", "getInitData", "()Lcom/alibaba/fastjson/JSONObject;", "setInitData", "(Lcom/alibaba/fastjson/JSONObject;)V", "Lcom/taobao/android/weex/WeexRenderType;", "renderType", "Lcom/taobao/android/weex/WeexRenderType;", "getRenderType", "()Lcom/taobao/android/weex/WeexRenderType;", "setRenderType", "(Lcom/taobao/android/weex/WeexRenderType;)V", "Lcom/taobao/android/weex/config/WeexUnicornConfig$RenderMode;", "renderMode", "Lcom/taobao/android/weex/config/WeexUnicornConfig$RenderMode;", "getRenderMode", "()Lcom/taobao/android/weex/config/WeexUnicornConfig$RenderMode;", "setRenderMode", "(Lcom/taobao/android/weex/config/WeexUnicornConfig$RenderMode;)V", "Lcom/taobao/android/weex/WeexInstanceMode;", "instanceMode", "Lcom/taobao/android/weex/WeexInstanceMode;", "getInstanceMode", "()Lcom/taobao/android/weex/WeexInstanceMode;", "setInstanceMode", "(Lcom/taobao/android/weex/WeexInstanceMode;)V", "Ltb/lce;", "computeScreenAdapter", "Ltb/lce;", "getComputeScreenAdapter", "()Ltb/lce;", "setComputeScreenAdapter", "(Ltb/lce;)V", "", "asyncCreate", "Z", "getAsyncCreate", "()Z", "setAsyncCreate", "(Z)V", z1x.PRE_RENDER, "getPreRender", "setPreRender", "", "width", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "height", "getHeight", "setHeight", "themis_weex_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Weex2StartParams extends SinglePageStartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean asyncCreate;
    private lce computeScreenAdapter;
    private Integer height;
    private JSONObject initData;
    private WeexInstanceMode instanceMode;
    private boolean preRender;
    private WeexUnicornConfig.RenderMode renderMode;
    private WeexRenderType renderType;
    private Integer width;

    static {
        t2o.a(851443713);
    }

    public static /* synthetic */ Object ipc$super(Weex2StartParams weex2StartParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/Weex2StartParams");
    }

    public final boolean getAsyncCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce370ced", new Object[]{this})).booleanValue();
        }
        return this.asyncCreate;
    }

    public final lce getComputeScreenAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lce) ipChange.ipc$dispatch("42d7ad38", new Object[]{this});
        }
        return this.computeScreenAdapter;
    }

    public final Integer getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9786c04b", new Object[]{this});
        }
        return this.height;
    }

    public final JSONObject getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this});
        }
        return this.initData;
    }

    public final WeexInstanceMode getInstanceMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceMode) ipChange.ipc$dispatch("1872515c", new Object[]{this});
        }
        return this.instanceMode;
    }

    public final boolean getPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff4a66e", new Object[]{this})).booleanValue();
        }
        return this.preRender;
    }

    public final WeexUnicornConfig.RenderMode getRenderMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexUnicornConfig.RenderMode) ipChange.ipc$dispatch("8700c731", new Object[]{this});
        }
        return this.renderMode;
    }

    public final WeexRenderType getRenderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexRenderType) ipChange.ipc$dispatch("4d0095ec", new Object[]{this});
        }
        return this.renderType;
    }

    public final Integer getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("ce3617fe", new Object[]{this});
        }
        return this.width;
    }

    public final void setAsyncCreate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca7d817", new Object[]{this, new Boolean(z)});
        } else {
            this.asyncCreate = z;
        }
    }

    public final void setComputeScreenAdapter(lce lceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce706660", new Object[]{this, lceVar});
        } else {
            this.computeScreenAdapter = lceVar;
        }
    }

    public final void setHeight(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fd9c47", new Object[]{this, num});
        } else {
            this.height = num;
        }
    }

    public final void setInitData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ded6d", new Object[]{this, jSONObject});
        } else {
            this.initData = jSONObject;
        }
    }

    public final void setInstanceMode(WeexInstanceMode weexInstanceMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1822bf1c", new Object[]{this, weexInstanceMode});
        } else {
            this.instanceMode = weexInstanceMode;
        }
    }

    public final void setPreRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69741b6", new Object[]{this, new Boolean(z)});
        } else {
            this.preRender = z;
        }
    }

    public final void setRenderMode(WeexUnicornConfig.RenderMode renderMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25776749", new Object[]{this, renderMode});
        } else {
            this.renderMode = renderMode;
        }
    }

    public final void setRenderType(WeexRenderType weexRenderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c536379c", new Object[]{this, weexRenderType});
        } else {
            this.renderType = weexRenderType;
        }
    }

    public final void setWidth(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9df9f8c", new Object[]{this, num});
        } else {
            this.width = num;
        }
    }
}
