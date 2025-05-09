package com.alipay.mobile.common.logging.render;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.helper.DeviceHWRenderHelper;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BehavorRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BehavorRender(LogContext logContext) {
        super(logContext);
    }

    public static /* synthetic */ Object ipc$super(BehavorRender behavorRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/render/BehavorRender");
    }

    public final String a(String str, Behavor behavor, PendingRender pendingRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b86e30ba", new Object[]{this, str, behavor, pendingRender});
        }
        StringBuilder sb = new StringBuilder();
        String str2 = behavor.getExtParams() != null ? behavor.getExtParams().get("header") : null;
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        } else {
            sb.append("D-VM");
        }
        String str3 = pendingRender.b;
        if (str3 != null) {
            LoggingUtil.appendParam(sb, str3);
        } else {
            LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        }
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.b.getClientId());
        LoggingUtil.appendParam(sb, this.b.getSessionId());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        if (!TextUtils.isEmpty(str)) {
            LoggingUtil.appendParam(sb, str);
        } else {
            LoggingUtil.appendParam(sb, "event");
        }
        LoggingUtil.appendParam(sb, behavor.getAbTestInfo());
        if (!TextUtils.isEmpty(behavor.getRefer())) {
            LoggingUtil.appendParam(sb, behavor.getRefer());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.h);
        }
        if (behavor.getAppID() != null) {
            LoggingUtil.appendParam(sb, behavor.getAppID());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.g);
        }
        LoggingUtil.appendParam(sb, behavor.getAppVersion());
        LoggingUtil.appendParam(sb, behavor.getxPath());
        LoggingUtil.appendParam(sb, behavor.getEntityContentId());
        LoggingUtil.appendParam(sb, behavor.getSeedID());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(behavor.getLoggerLevel());
        LoggingUtil.appendParam(sb, sb2.toString());
        if (behavor.getRenderBizType() != null) {
            LoggingUtil.appendParam(sb, behavor.getRenderBizType());
        } else {
            LoggingUtil.appendParam(sb, behavor.getBehaviourPro());
        }
        LoggingUtil.appendParam(sb, behavor.getLogPro());
        LoggingUtil.appendParam(sb, behavor.getParam1());
        LoggingUtil.appendParam(sb, behavor.getParam2());
        LoggingUtil.appendParam(sb, behavor.getParam3());
        if (behavor.getLegacyParam() != null) {
            LoggingUtil.appendParam(sb, behavor.getLegacyParam());
        } else {
            LoggingUtil.appendExtParam(sb, behavor.getExtParams());
        }
        LoggingUtil.appendParam(sb, this.b.getSourceId());
        LoggingUtil.appendParam(sb, behavor.getPageStayTime());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendParam(sb, behavor.getUserCaseID());
        LoggingUtil.appendParam(sb, behavor.getPageId());
        if (behavor.getRefViewID() != null) {
            LoggingUtil.appendParam(sb, behavor.getRefViewID());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.c);
        }
        if (behavor.getViewID() != null) {
            LoggingUtil.appendParam(sb, behavor.getViewID());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.d);
        }
        if (behavor.getTrackId() != null) {
            LoggingUtil.appendParam(sb, behavor.getTrackId());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.e);
        }
        if (behavor.getTrackToken() != null) {
            LoggingUtil.appendParam(sb, behavor.getTrackToken());
        } else {
            LoggingUtil.appendParam(sb, pendingRender.f);
        }
        LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(behavor.getBehaviourPro(), behavor.getLoggerLevel()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.d()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b(this.b.getApplicationContext())));
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, behavor.getSpmStatus());
        LoggingUtil.appendParam(sb, DeviceInfo.getInstance(this.b.getApplicationContext()).getResolution());
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, BaseRender.a());
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendExtParam(sb, behavor.getExtParams5());
        sb.append("$$");
        return sb.toString();
    }
}
