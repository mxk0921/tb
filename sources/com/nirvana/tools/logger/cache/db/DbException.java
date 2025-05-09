package com.nirvana.tools.logger.cache.db;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DbException extends Throwable {
    private Throwable originalThrowable;

    public DbException(String str, Throwable th) {
        super(str);
        this.originalThrowable = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        Throwable th = this.originalThrowable;
        if (th != null) {
            return th.getCause();
        }
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        Throwable th = this.originalThrowable;
        if (th != null) {
            return th.getLocalizedMessage();
        }
        return super.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Throwable th = this.originalThrowable;
        if (th != null) {
            return th.getMessage();
        }
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public StackTraceElement[] getStackTrace() {
        Throwable th = this.originalThrowable;
        if (th != null) {
            return th.getStackTrace();
        }
        return super.getStackTrace();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Throwable th = this.originalThrowable;
        if (th != null) {
            th.printStackTrace();
        } else {
            super.printStackTrace();
        }
    }
}
