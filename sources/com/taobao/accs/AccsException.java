package com.taobao.accs;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.io.PrintWriter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mErrorCode;

    static {
        t2o.a(343932936);
    }

    public AccsException(int i) {
        this.mErrorCode = i;
    }

    public static /* synthetic */ Object ipc$super(AccsException accsException, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 485227564) {
            super.printStackTrace((PrintWriter) objArr[0]);
            return null;
        } else if (hashCode == 1575049727) {
            super.printStackTrace((PrintStream) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/accs/AccsException");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de159ff", new Object[]{this, printStream});
            return;
        }
        printStream.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printStream);
    }

    public AccsException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cebfc2c", new Object[]{this, printWriter});
            return;
        }
        printWriter.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printWriter);
    }

    public AccsException(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public AccsException(String str, Throwable th, int i) {
        super(str, th);
        this.mErrorCode = i;
    }

    public AccsException(Throwable th, int i) {
        super(th);
        this.mErrorCode = i;
    }
}
