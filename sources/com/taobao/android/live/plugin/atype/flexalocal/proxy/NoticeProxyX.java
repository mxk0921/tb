package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NoticeProxyX implements INoticeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699612);
        t2o.a(806355199);
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INoticeProxy
    public Class<? extends BaseFrame> getNoticeFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("cea56338", new Object[]{this});
        }
        return NoticeFrame3.class;
    }
}
