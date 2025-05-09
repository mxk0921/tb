package com.alipay.mobile.common.logging.api.abtest;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface AbtestInfoGetterV2 extends AbtestInfoGetter {
    Map<String, String> getExtInfoForSpmID(String str);
}
