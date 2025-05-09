package com.taobao.themis.pub_kit.teenager_protect;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.Metadata;
import tb.a3w;
import tb.ckf;
import tb.s1c;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/pub_kit/teenager_protect/PubTeenagerEditionSwitchListener;", "Ltb/s1c;", "<init>", "()V", "Ltb/a3w;", "version", "Ltb/xhv;", "onSuccess", "(Ltb/a3w;)V", "", "errorCode", "", "errorMsg", "onFail", "(ILjava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTeenagerEditionSwitchListener implements s1c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final PubTeenagerEditionSwitchListener INSTANCE = new PubTeenagerEditionSwitchListener();
    private static final String TAG = "PubTeenagerEditionSwitchListener";

    static {
        t2o.a(845152345);
        t2o.a(456130607);
    }

    private PubTeenagerEditionSwitchListener() {
    }

    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // tb.s1c
    public void onSuccess(a3w a3wVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
            return;
        }
        if (a3wVar == null) {
            jSONObject = null;
        } else {
            jSONObject = a3wVar.g();
        }
        TMSLogger.f(TAG, ckf.p("Version changed to ", jSONObject));
        PubTimeLock.INSTANCE.A();
    }
}
