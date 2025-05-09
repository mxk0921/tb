package com.taobao.tblive.weex;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.ui.TBLiveVideoView;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.HashMap;
import tb.bpr;
import tb.gjr;
import tb.rnr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveWeexComponent extends WXComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLiveWeexComponent";
    private TBLiveVideoView liveView;
    private boolean mIsPlayingBeforeActivityPause;
    private boolean mReceivePM = false;
    private rnr tbLiveWeexVideoController;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements bpr.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bpr.c
        public void onMessageReceived(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                return;
            }
            HashMap hashMap = new HashMap();
            if (i == 1009) {
                i = 10101;
            } else if (i == 102) {
                i = 10103;
            }
            hashMap.put("type", Integer.valueOf(i));
            if (obj instanceof ShareGoodsListMessage) {
                String jSONString = JSON.toJSONString((ShareGoodsListMessage) obj);
                hashMap.put("data", jSONString);
                TBLiveWeexComponent.access$000();
                StringBuilder sb = new StringBuilder("onMessageReceived-------");
                sb.append(i);
                sb.append(" data = ");
                sb.append(jSONString);
            } else if (obj instanceof JoinNotifyMessage) {
                String jSONString2 = JSON.toJSONString((JoinNotifyMessage) obj);
                hashMap.put("data", jSONString2);
                TBLiveWeexComponent.access$000();
                StringBuilder sb2 = new StringBuilder("onMessageReceived-------");
                sb2.append(i);
                sb2.append(" data = ");
                sb2.append(jSONString2);
            } else if (obj instanceof TLiveMsg) {
                String jSONString3 = JSON.toJSONString(obj);
                hashMap.put("data", jSONString3);
                TBLiveWeexComponent.access$000();
                StringBuilder sb3 = new StringBuilder("onMessageReceived-------");
                sb3.append(i);
                sb3.append(" data = ");
                sb3.append(jSONString3);
            }
            WXSDKManager.getInstance().fireEvent(TBLiveWeexComponent.this.getInstanceId(), TBLiveWeexComponent.this.getRef(), "powermsg", hashMap);
        }
    }

    public TBLiveWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    private boolean getAttrsValue(String str, WXAttr wXAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3482ef8f", new Object[]{this, str, wXAttr})).booleanValue();
        }
        if (wXAttr == null || !wXAttr.containsKey(str)) {
            return false;
        }
        return Boolean.valueOf(String.valueOf(wXAttr.get(str))).booleanValue();
    }

    private void initLiveView(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e258", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        rnr rnrVar = new rnr(getContext(), str, str2, new gjr.b().j(getAttrsValue("showFavor", getAttrs())).m(getAttrsValue("showMuteBtn", getAttrs())).n(getAttrsValue("showPauseBtn", getAttrs())).h());
        this.tbLiveWeexVideoController = rnrVar;
        this.liveView = (TBLiveVideoView) rnrVar.c();
        if (this.mReceivePM) {
            this.tbLiveWeexVideoController.i(new a());
        }
    }

    public static /* synthetic */ Object ipc$super(TBLiveWeexComponent tBLiveWeexComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode == 1692842255) {
            super.onActivityPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tblive/weex/TBLiveWeexComponent");
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            rnrVar.a();
        }
    }

    @JSMethod
    public String getLiveDetailData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81a547c", new Object[]{this});
        }
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            return rnrVar.b();
        }
        return null;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public View initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        String str = (String) getAttrs().get("liveId");
        String str2 = (String) getAttrs().get("bizCode");
        String str3 = (String) getAttrs().get("autoplay");
        String str4 = (String) getAttrs().get("receivePM");
        if (!TextUtils.isEmpty(str4)) {
            this.mReceivePM = Boolean.valueOf(str4).booleanValue();
        }
        initLiveView(str, str2, Boolean.valueOf(str3).booleanValue());
        return this.liveView;
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            this.mIsPlayingBeforeActivityPause = rnrVar.e();
            this.tbLiveWeexVideoController.f();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (this.mIsPlayingBeforeActivityPause) {
            rnr rnrVar = this.tbLiveWeexVideoController;
            if (rnrVar != null) {
                rnrVar.l();
                return;
            }
            return;
        }
        rnr rnrVar2 = this.tbLiveWeexVideoController;
        if (rnrVar2 != null) {
            rnrVar2.g();
        }
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            rnrVar.f();
        }
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            rnrVar.l();
        }
    }

    @JSMethod
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        rnr rnrVar = this.tbLiveWeexVideoController;
        if (rnrVar != null) {
            rnrVar.h(z);
        }
    }

    public TBLiveWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
    }
}
