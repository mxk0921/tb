package com.taobao.taolive.room.openarchitecture.openh5;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.uc.webview.export.extension.EmbedViewConfig;
import java.util.HashMap;
import java.util.Map;
import tb.jbt;
import tb.qbt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoliveOpenH5PlatformView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = TaoliveOpenH5PlatformView.class.getSimpleName();
    public static final String ViewType = "TLOVideoPlayer";
    private jbt openContext;
    private TaoliveOpenLiveRoom taoliveOpenLiveRoom;

    static {
        t2o.a(779093058);
    }

    private Object callH5Platform(H5PlatfomListenerEnum h5PlatfomListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff1f0a9", new Object[]{this, h5PlatfomListenerEnum, objArr});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.taoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom != null) {
            return taoliveOpenLiveRoom.invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5Compontent, this.openContext, taoliveOpenLiveRoom.eventCompontent, h5PlatfomListenerEnum, objArr);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TaoliveOpenH5PlatformView taoliveOpenH5PlatformView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/openh5/TaoliveOpenH5PlatformView");
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        new StringBuilder("generateView:  EmbedViewConfig:").append(this.params);
        EmbedViewConfig embedViewConfig = this.params;
        if (!(embedViewConfig == null || (map = embedViewConfig.mObjectParam) == null || !(map.get("bizCode") instanceof String))) {
            String str = (String) this.params.mObjectParam.get("bizCode");
            if (!TextUtils.isEmpty(str)) {
                Object initOpenView = initOpenView(context, str);
                if (initOpenView instanceof TBLOpenPlatformView) {
                    return (TBLOpenPlatformView) initOpenView;
                }
            }
        }
        return new View(context);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return ViewType;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        callH5Platform(H5PlatfomListenerEnum.onDestroy, new HashMap());
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            return;
        }
        super.onDetachedFromWebView();
        callH5Platform(H5PlatfomListenerEnum.onDetachedFromWebView, new HashMap());
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        callH5Platform(H5PlatfomListenerEnum.onPause, new HashMap());
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        callH5Platform(H5PlatfomListenerEnum.onResume, new HashMap());
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        super.onAttachedToWebView();
        HashMap hashMap = new HashMap();
        hashMap.put("embedViewConfig", this.params);
        hashMap.put("params", this.params);
        hashMap.put("id", this.id);
        callH5Platform(H5PlatfomListenerEnum.onAttachedToWebView, hashMap);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("onVisibilityChanged", Integer.valueOf(i));
        callH5Platform(H5PlatfomListenerEnum.onVisibilityChanged, hashMap);
    }

    private Object initOpenView(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("33772326", new Object[]{this, context, str});
        }
        new StringBuilder("initOpenView bizCode:").append(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.openContext == null) {
            this.openContext = qbt.h().b(context, str, null, null, null);
        }
        if (this.taoliveOpenLiveRoom == null) {
            qbt.h().g(this.openContext);
            this.taoliveOpenLiveRoom = qbt.h().c(this.openContext);
        }
        if (this.taoliveOpenLiveRoom == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        hashMap.put("webView", this.webView);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.taoliveOpenLiveRoom;
        return taoliveOpenLiveRoom.invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5PlatformView, this.openContext, taoliveOpenLiveRoom, hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r8.equals("getSessionInfo") == false) goto L_0x006e;
     */
    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.openh5.TaoliveOpenH5PlatformView.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
