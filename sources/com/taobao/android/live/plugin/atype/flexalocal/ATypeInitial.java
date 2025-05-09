package com.taobao.android.live.plugin.atype.flexalocal;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentSendProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.CommentsProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.GoodProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.InputProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.InteractiveProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.JSBridgeDispatcherProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.Jump302ProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.NoticeProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.OfficialLiveEntryProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.PanelProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.RankProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.ReplayShiftTextProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLandingProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.SmartLayerServiceProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.TaoLiveActionUtilsProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.TopBarProxyX;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.UserTaskProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.android.live.plugin.proxy.jsbridgeDispatcher.IJSBridgeDispatcherProxy;
import com.taobao.android.live.plugin.proxy.jump302.IJump302Proxy;
import com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import com.taobao.android.live.plugin.proxy.officialLive.IOfficialLiveEntryProxy;
import com.taobao.android.live.plugin.proxy.panel.IPanelProxy;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import com.taobao.android.live.plugin.proxy.replayshifttext.IReplaySiftTextProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import com.taobao.android.live.plugin.proxy.taoliveactionutils.ITaoLiveActionUtilsProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bl9;
import tb.p5c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ATypeInitial implements p5c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = ATypeInitial.class.getName();
    private static final AtomicBoolean ONCE = new AtomicBoolean(false);

    static {
        t2o.a(295698433);
    }

    @Override // tb.p5c
    public void init(Application application, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d5e6ac", new Object[]{this, application, bundle});
            return;
        }
        FlexaLiveX.w("[" + TAG + "] init");
        if (ONCE.compareAndSet(false, true)) {
            HashMap hashMap = new HashMap();
            hashMap.put(ITopBarProxy.KEY, new TopBarProxyX());
            hashMap.put(IRankProxy.KEY, new RankProxyX());
            hashMap.put(INoticeProxy.KEY, new NoticeProxyX());
            hashMap.put(IReplaySiftTextProxy.KEY, new ReplayShiftTextProxyX());
            hashMap.put(ICommentsProxy.KEY, new CommentsProxyX());
            hashMap.put(IInputProxy.KEY, new InputProxyX());
            hashMap.put(IPanelProxy.KEY, new PanelProxyX());
            hashMap.put(IBottomProxy.KEY, new BottomProxyX());
            hashMap.put(IJump302Proxy.KEY, new Jump302ProxyX());
            hashMap.put(ICommentSendProxy.KEY, new CommentSendProxyX());
            hashMap.put(ISmartLandingProxy.KEY, new SmartLandingProxyX());
            hashMap.put(ISmartLayerServiceProxy.KEY, new SmartLayerServiceProxyX());
            hashMap.put(IInteractiveProxy.KEY, new InteractiveProxyX());
            hashMap.put(IGoodProxy.KEY, new GoodProxyX());
            hashMap.put(IFullScreenProxy.KEY, new FullScreenProxyX());
            hashMap.put(IUserTaskProxy.KEY, new UserTaskProxyX());
            hashMap.put(IOfficialLiveEntryProxy.KEY, new OfficialLiveEntryProxyX());
            hashMap.put(IJSBridgeDispatcherProxy.KEY, new JSBridgeDispatcherProxyX());
            hashMap.put(ITaoLiveActionUtilsProxy.KEY, new TaoLiveActionUtilsProxyX());
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                FlexaLiveX.w("[" + TAG + "] init, class load success: " + ((IProxy) ((Map.Entry) it.next()).getValue()).getClass().getName());
            }
            bl9.g().k(hashMap);
            bl9.g().j(true);
        }
    }
}
