package com.taobao.tao.sharepanel.weex.component;

import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.tao.sharepanel.weex.bridge.BubbleBridge;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kp6;
import tb.ogs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareFriendView extends AbsListComponent implements kp6.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BubbleTipsBean mTips = this.mDataBinder.h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894598);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new ShareFriendView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    static {
        t2o.a(666894597);
        t2o.a(667942930);
    }

    public ShareFriendView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        IpChange ipChange = ogs.$ipChange;
        this.mDataBinder.k(this);
    }

    public static /* synthetic */ Object ipc$super(ShareFriendView shareFriendView, String str, Object... objArr) {
        if (str.hashCode() == -868167623) {
            super.initDone();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/ShareFriendView");
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public String getComponentKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this});
        }
        return SubstituteConstants.KEY_CHANNEL_FRIENDS;
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public void initDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40d039", new Object[]{this});
            return;
        }
        super.initDone();
        BubbleBridge.a(getHostView(), this.mTips);
    }
}
