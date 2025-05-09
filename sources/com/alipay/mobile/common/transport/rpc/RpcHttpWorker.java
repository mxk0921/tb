package com.alipay.mobile.common.transport.rpc;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.http.selfencrypt.ClientRpcPack;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcHttpWorker extends HttpWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcHttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        super(httpManager, httpUrlRequest);
        this.mTransportContext.bizType = (byte) 1;
        if (isUseSelfEncrypt()) {
            this.clientRpcPack = new ClientRpcPack();
        }
    }

    public static /* synthetic */ Object ipc$super(RpcHttpWorker rpcHttpWorker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/rpc/RpcHttpWorker");
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        HttpResponse httpResponse = this.mHttpResponse;
        if (httpResponse != null) {
            try {
                Header firstHeader = httpResponse.getFirstHeader(HeaderConstant.HEADER_KEY_RESULT_STATUS);
                String str = "";
                if (firstHeader != null) {
                    str = firstHeader.getValue();
                }
                if (!TextUtils.isEmpty(str) && !str.equals("1000")) {
                    DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.MOBILEGW_RESULT_STATUS, str);
                }
            } catch (Throwable th) {
                LogCatUtil.warn(HttpWorker.TAG, "[putMonitorLogOfResponseHeader] Exception = " + th.toString());
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void putSubCommonMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1824545", new Object[]{this});
        } else {
            W();
        }
    }
}
