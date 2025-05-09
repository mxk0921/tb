package com.alipay.mobile.common.logging.render;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustomContentRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String c;

    public CustomContentRender(LogContext logContext) {
        super(logContext);
        this.c = "%24%24";
        try {
            this.c = URLEncoder.encode("$$", "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(CustomContentRender customContentRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/render/CustomContentRender");
    }

    @Override // com.alipay.mobile.common.logging.render.BaseRender
    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replaceAll("\\$\\$", this.c);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return a(str) + "$$";
    }
}
