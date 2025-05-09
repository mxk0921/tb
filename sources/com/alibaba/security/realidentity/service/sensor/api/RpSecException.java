package com.alibaba.security.realidentity.service.sensor.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpSecException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXCEPTION_NO_COLLECT_STRATEGY = -400;
    public static final int EXCEPTION_NO_DECOR_VIEW_FOUND = -700;
    public static final int EXCEPTION_NO_ENABLED_SENSORS = -500;
    public static final int EXCEPTION_NO_NEED_FOR_COLLECTION = -800;
    public static final int EXCEPTION_NO_WINDOW_FOUND_FROM_ACTIVITY = -600;
    public static final int EXCEPTION_NULL_CONTEXT = -100;
    public static final int EXCEPTION_NULL_SENSOR_DETECTED = -300;
    public static final int EXCEPTION_NULL_SENSOR_MANAGER = -200;
    public int errorCode;

    public RpSecException(int i) {
        this.errorCode = i;
    }

    public static /* synthetic */ Object ipc$super(RpSecException rpSecException, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 485227564) {
            super.printStackTrace((PrintWriter) objArr[0]);
            return null;
        } else if (hashCode == 1575049727) {
            super.printStackTrace((PrintStream) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/security/realidentity/service/sensor/api/RpSecException");
        }
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de159ff", new Object[]{this, printStream});
            return;
        }
        printStream.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printStream);
    }

    public void setErrorCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0c969", new Object[]{this, new Integer(i)});
        } else {
            this.errorCode = i;
        }
    }

    public RpSecException(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cebfc2c", new Object[]{this, printWriter});
            return;
        }
        printWriter.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printWriter);
    }

    public RpSecException(Throwable th, int i) {
        super(th);
        this.errorCode = i;
    }

    public RpSecException(String str, Throwable th, int i) {
        super(str, th);
        this.errorCode = i;
    }
}
