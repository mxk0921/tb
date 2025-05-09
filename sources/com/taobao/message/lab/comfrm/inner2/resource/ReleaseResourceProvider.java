package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.FileUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/ReleaseResourceProvider;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "<init>", "()V", "", "filePartName", "fetchResource", "(Ljava/lang/String;)Ljava/lang/String;", "Ltb/xhv;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "observer", "subscribeResourceChange", "(Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;)V", "", "priority", TLogTracker.LEVEL_INFO, "getPriority", "()I", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ReleaseResourceProvider implements IResourceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int priority;

    static {
        t2o.a(537919734);
        t2o.a(537919730);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public String fetchResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59f10447", new Object[]{this, str});
        }
        ckf.g(str, "filePartName");
        return FileUtil.readAssetsTextFile(ApplicationUtil.getApplication(), str);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
        } else {
            ckf.g(iResourceChangeObserver, "observer");
        }
    }
}
