package com.alipay.mobile.common.logging.impl;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogDAUTracker;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetter;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetterV2;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.common.logging.api.behavor.BehavorLogger;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.render.BehavorRender;
import com.alipay.mobile.common.logging.render.CustomContentRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BehavorloggerImpl implements BehavorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, Boolean> d;

    /* renamed from: a  reason: collision with root package name */
    public final LogContext f3975a;
    public final BehavorRender b;
    public final CustomContentRender c;

    static {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        d = hashMap;
        Boolean bool = Boolean.TRUE;
        hashMap.put("a14.b62.c1226.d1937", bool);
        hashMap.put("a14.b62.c1226.d2202", bool);
        hashMap.put("a14.b62.c1226.d3164", bool);
        hashMap.put("a14.b62.c1226.d3165", bool);
    }

    public BehavorloggerImpl(LogContext logContext) {
        this.f3975a = logContext;
        this.b = new BehavorRender(logContext);
        this.c = new CustomContentRender(logContext);
    }

    public static void a(Behavor behavor) {
        AbtestInfoGetter abtestInfoGetter;
        Map<String, String> extInfoForSpmID;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104c0a3f", new Object[]{behavor});
        } else if (behavor != null && TextUtils.isEmpty(behavor.getAbTestInfo()) && LoggerFactory.getLogContext() != null && (abtestInfoGetter = LoggerFactory.getLogContext().getAbtestInfoGetter()) != null) {
            String seedID = behavor.getSeedID();
            if (!TextUtils.isEmpty(seedID) && seedID.contains(".")) {
                behavor.setAbTestInfo(abtestInfoGetter.getLogForSpmID(seedID));
                if ((abtestInfoGetter instanceof AbtestInfoGetterV2) && (extInfoForSpmID = ((AbtestInfoGetterV2) abtestInfoGetter).getExtInfoForSpmID(seedID)) != null) {
                    for (Map.Entry<String, String> entry : extInfoForSpmID.entrySet()) {
                        behavor.addExtParam(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.length() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void autoClick(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0df60f7", new Object[]{this, behavor});
            return;
        }
        a(behavor);
        this.f3975a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_AUTOUSERBEHAVOR, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, BehavorID.AUTOCLICK, behavor)));
        if (this.f3975a.getBehavorLogListener() != null) {
            this.f3975a.getBehavorLogListener().onAutoClick(behavor);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void autoEvent(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41263389", new Object[]{this, behavor});
            return;
        }
        behavor.setRefViewID("");
        behavor.setViewID("");
        behavor.setTrackId("");
        behavor.setTrackToken("");
        behavor.setTrackDesc("");
        this.f3975a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_AUTOUSERBEHAVOR, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, BehavorID.AUTOEVENT, behavor)));
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void autoOpenPage(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725d5e6", new Object[]{this, behavor});
            return;
        }
        this.f3975a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_AUTOUSERBEHAVOR, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, (Object) BehavorID.AUTOOPENPAGE, (Object) behavor, true)));
        if (this.f3975a.getBehavorLogListener() != null) {
            this.f3975a.getBehavorLogListener().onAutoOpenPage(behavor);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void click(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff3c0a6", new Object[]{this, behavor});
            return;
        }
        a(behavor);
        String behaviourPro = behavor.getBehaviourPro();
        if (b(behaviourPro)) {
            behaviourPro = LogCategory.CATEGORY_USERBEHAVOR;
        }
        LogDAUTracker logDAUTracker = LoggerFactory.getLogContext().getLogDAUTracker();
        String seedID = behavor.getSeedID();
        if (seedID != null && d.containsKey(seedID) && logDAUTracker != null && !logDAUTracker.isUploadedToday(seedID)) {
            behavor.setRenderBizType(behaviourPro);
            behavor.addExtParam("kDAUTag", "Y");
            logDAUTracker.updateSpmUploadState(seedID);
            behaviourPro = LogDAUTracker.BIZ_TYPE;
        }
        behavor.setBehaviourPro(behaviourPro);
        this.f3975a.appendLogEvent(new LogEvent(behaviourPro, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, BehavorID.CLICK, behavor)));
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void customContent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96989e3", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.warn("BehavorLogger", "bizType or content is empty : " + str + " + " + str2);
        } else {
            String b = this.c.b(str2);
            int length = b.getBytes().length;
            if (length > 262144) {
                Behavor behavor = new Behavor();
                behavor.setSeedID("LogLength");
                behavor.setParam1(str);
                behavor.setParam2(str);
                behavor.setParam3(String.valueOf(length));
                behavor.setLoggerLevel(3);
                behavor.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
                event(null, behavor);
                return;
            }
            this.f3975a.appendLogEvent(new LogEvent(str, "BehavorLogger", new LogEvent.Level(2), b));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void longClick(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8d928a", new Object[]{this, behavor});
        } else {
            event(BehavorID.LONGCLICK, behavor);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void slide(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aad038f", new Object[]{this, behavor});
        } else {
            event(BehavorID.SLIDE, behavor);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void submit(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff80e736", new Object[]{this, behavor});
        } else {
            event(BehavorID.SUBMITE, behavor);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void openPage(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b10a3d7", new Object[]{this, behavor});
            return;
        }
        String behaviourPro = behavor.getBehaviourPro();
        if (b(behaviourPro)) {
            behaviourPro = LogCategory.CATEGORY_USERBEHAVOR;
        }
        behavor.setBehaviourPro(behaviourPro);
        this.f3975a.appendLogEvent(new LogEvent(behaviourPro, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, (Object) BehavorID.OPENPAGE, (Object) behavor, true)));
    }

    @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
    public void event(String str, Behavor behavor) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba98b42", new Object[]{this, str, behavor});
            return;
        }
        String behaviourPro = behavor.getBehaviourPro();
        if (!BehavorID.LONGCLICK.equals(str) && !BehavorID.SUBMITE.equals(str) && !BehavorID.CLICK.equals(str) && !"exposure".equals(str) && !BehavorID.SLIDE.equals(str) && !"pageMonitor".equals(str)) {
            z = false;
        }
        if (b(behaviourPro)) {
            behaviourPro = LogCategory.CATEGORY_USERBEHAVOR;
        }
        behavor.setBehaviourPro(behaviourPro);
        this.f3975a.appendLogEvent(new LogEvent(behaviourPro, "BehavorLogger", new LogEvent.Level(behavor.getLoggerLevel()), null, PendingRender.a(this.b, str, behavor, z)));
    }
}
