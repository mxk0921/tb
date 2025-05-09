package com.mobile.auth.gatewayauth.sdktools.upload.pns.model;

import com.alibaba.evo.internal.database.ExperimentDO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.JsonerTag;
import tb.m09;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PnsUploadLog {
    @JsonerTag(keyName = ExperimentDO.COLUMN_END_TIME)
    private String endTime;
    @JsonerTag(keyName = m09.TASK_TYPE_LEVEL)
    private String level;
    @JsonerTag(keyName = "start_time")
    private String startTime;

    public String getEndTime() {
        try {
            return this.endTime;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getLevel() {
        try {
            return this.level;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getStartTime() {
        try {
            return this.startTime;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void setEndTime(String str) {
        try {
            this.endTime = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setLevel(String str) {
        try {
            this.level = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setStartTime(String str) {
        try {
            this.startTime = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
