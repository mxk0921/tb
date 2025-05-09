package com.taobao.tao.log.logger;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.logger.CustomEventLogger;
import tb.e6s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomEventLogger extends EventLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "biz")
    public final String biz;
    @JSONField(name = "event")
    public final String event;

    static {
        t2o.a(767557670);
    }

    private CustomEventLogger(String str, String str2) {
        super(8);
        this.biz = str;
        this.event = str2;
    }

    public static CustomEventLogger builder(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomEventLogger) ipChange.ipc$dispatch("fea2c9e2", new Object[]{str, str2});
        }
        return new CustomEventLogger(str, str2);
    }

    public static /* synthetic */ Object ipc$super(CustomEventLogger customEventLogger, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/logger/CustomEventLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$log$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95eff2ba", new Object[]{this});
        } else {
            TLogNative.writeLog(LogCategory.EventLog, LogLevel.I, EventLogger.TAG, this.biz, toString());
        }
    }

    @Override // com.taobao.tao.log.logger.EventLogger, tb.znc
    public void log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
        } else {
            e6s.d().e(new Runnable() { // from class: tb.g05
                @Override // java.lang.Runnable
                public final void run() {
                    CustomEventLogger.this.lambda$log$0();
                }
            });
        }
    }
}
