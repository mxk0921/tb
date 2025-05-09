package com.taobao.android.trade.cart.provider;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.rrh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoteListener2 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String requestId;

    static {
        t2o.a(697303049);
        t2o.a(589299719);
    }

    public RemoteListener2(String str) {
        this.requestId = str;
    }

    private void executeError(String str, boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52614935", new Object[]{this, str, new Boolean(z), mtopResponse});
            return;
        }
        String q = Localization.q(R.string.taobao_app_1028_1_21682);
        String str2 = "";
        if (mtopResponse != null) {
            if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                q = mtopResponse.getRetMsg();
            }
            if (!TextUtils.isEmpty(mtopResponse.getRetCode())) {
                str2 = mtopResponse.getRetCode();
            }
        }
        if (z) {
            rrh.e().i(str, str2, q, null);
        } else {
            rrh.e().g(str, str2, q, null);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            executeError(this.requestId, false, mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", Localization.q(R.string.cart_msg_add_bag_success));
        rrh.e().l(this.requestId, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            executeError(this.requestId, true, mtopResponse);
        }
    }
}
