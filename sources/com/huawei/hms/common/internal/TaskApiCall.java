package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import tb.fdt;
import tb.v23;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final String f5324a;
    private final String b;
    private Parcelable c;
    private String d;
    private v23 e;
    private int f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f = 1;
        this.f5324a = str;
        this.b = str2;
        this.c = null;
        this.d = null;
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, fdt<ResultT> fdtVar);

    public int getApiLevel() {
        return this.f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.c;
    }

    public String getRequestJson() {
        return this.b;
    }

    public v23 getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.d;
    }

    public String getUri() {
        return this.f5324a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, fdt<ResultT> fdtVar) {
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f5324a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.d);
        doExecute(clientt, responseErrorCode, str, fdtVar);
    }

    public void setApiLevel(int i) {
        this.f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.c = parcelable;
    }

    public void setTransactionId(String str) {
        this.d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f = 1;
        this.f5324a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.f5324a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
        this.f = i;
    }

    public void setToken(v23 v23Var) {
    }
}
