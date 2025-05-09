package com.taobao.avplayer.component.weex;

import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.WXBridgeManager;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.mvd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXSplayerModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements AliServiceFindedCallback<mvd> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10156a;

        public a(String str) {
            this.f10156a = str;
        }

        /* renamed from: a */
        public void onServiceFinded(mvd mvdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("914c168f", new Object[]{this, mvdVar});
            } else if (mvdVar != null) {
                WXBridgeManager.getInstance().callback(WXSplayerModule.this.mWXSDKInstance.N(), this.f10156a, String.valueOf(mvdVar.isAutoPlayVideoUnderWifi(MediaSystemUtils.sApplication, true)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements AliServiceFindedCallback<mvd> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10157a;

        public b(String str) {
            this.f10157a = str;
        }

        /* renamed from: a */
        public void onServiceFinded(mvd mvdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("914c168f", new Object[]{this, mvdVar});
            } else if (mvdVar != null) {
                WXBridgeManager.getInstance().callback(WXSplayerModule.this.mWXSDKInstance.N(), this.f10157a, String.valueOf(mvdVar.isAutoPlayVideoUnderCurrentNetwork(MediaSystemUtils.sApplication)));
            }
        }
    }

    static {
        t2o.a(451936318);
    }

    public static /* synthetic */ Object ipc$super(WXSplayerModule wXSplayerModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/component/weex/WXSplayerModule");
    }

    @JSMethod
    public void findBestPlay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a77be2", new Object[]{this, str});
        }
    }

    @WXModuleAnno
    public void getAutoPlayUserSettingResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1004505a", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        try {
            AliAdaptServiceManager.getInstance().findAliAdaptService(mvd.class, new b(str));
        } catch (Throwable unused) {
            WXBridgeManager.getInstance().callback(this.mWXSDKInstance.N(), str, "true");
        }
    }

    @WXModuleAnno
    public void getAutoPlayVideoUnderWifi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871e277c", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_WXSplayerModule);
        try {
            AliAdaptServiceManager.getInstance().findAliAdaptService(mvd.class, new a(str));
        } catch (Throwable unused) {
            WXBridgeManager.getInstance().callback(this.mWXSDKInstance.N(), str, "true");
        }
    }

    @JSMethod
    public void pauseAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314d36d2", new Object[]{this});
        }
    }

    @JSMethod
    public void pauseGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40e6ffa", new Object[]{this, str});
        }
    }
}
