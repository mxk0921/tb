package com.taobao.weaver.prefetch;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PerformanceData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PFResult f14103a = PFResult.SUCCESS;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum PFResult {
        EXCEPT("-1", "exception"),
        SUCCESS("0", "success"),
        INVAILD_URL("101", "Invalid URL"),
        NO_PREFETCH_DATA("102", "No prefetch data"),
        DATA_EXPIRED("201", "Data expired");
        
        String code;
        String msg;

        PFResult(String str, String str2) {
            this.code = str;
            this.msg = str2;
        }

        public String getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setMsg(String str) {
            this.msg = str;
        }
    }

    public PFResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PFResult) ipChange.ipc$dispatch("dd6b5f97", new Object[]{this});
        }
        return this.f14103a;
    }
}
