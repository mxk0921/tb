package com.alipay.mobile.common.logging.api;

import com.alipay.mobile.common.logging.api.customer.LogUploadInfo;
import com.alipay.mobile.common.logging.api.customer.LogWriteInfo;
import com.alipay.mobile.common.logging.api.customer.UploadResultInfo;
import com.alipay.mobile.framework.MpaasClassInfo;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface LogCustomerControl {
    UploadResultInfo isLogUpload(LogUploadInfo logUploadInfo);

    boolean isLogWrite(LogWriteInfo logWriteInfo);
}
