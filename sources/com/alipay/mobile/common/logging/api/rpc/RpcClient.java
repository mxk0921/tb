package com.alipay.mobile.common.logging.api.rpc;

import android.os.Bundle;
import com.alipay.mobile.framework.MpaasClassInfo;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface RpcClient {
    LogRpcResult uploadLog(RpcLogRequestParam rpcLogRequestParam, String str, Bundle bundle);
}
