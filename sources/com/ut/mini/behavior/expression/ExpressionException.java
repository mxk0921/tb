package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ExpressionException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Throwable mRootCause;

    static {
        t2o.a(962593243);
    }

    public ExpressionException() {
    }

    public static /* synthetic */ Object ipc$super(ExpressionException expressionException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/expression/ExpressionException");
    }

    public Throwable getRootCause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("6725fedd", new Object[]{this});
        }
        return this.mRootCause;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getMessage() == null) {
            return this.mRootCause.toString();
        }
        if (this.mRootCause == null) {
            return getMessage();
        }
        return getMessage() + ": " + this.mRootCause;
    }

    public ExpressionException(String str) {
        super(str);
    }

    public ExpressionException(Throwable th) {
        this.mRootCause = th;
    }

    public ExpressionException(String str, Throwable th) {
        super(str);
        this.mRootCause = th;
    }
}
