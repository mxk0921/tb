package com.taobao.tao.sharepanel.weex.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kp6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareChannelView extends AbsListComponent implements kp6.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894596);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new ShareChannelView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    static {
        t2o.a(666894595);
        t2o.a(667942929);
    }

    public ShareChannelView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mDataBinder.j(this);
    }

    public static /* synthetic */ Object ipc$super(ShareChannelView shareChannelView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/ShareChannelView");
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public String getComponentKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this});
        }
        return "channels";
    }
}
