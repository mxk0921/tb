package com.taobao.android.behavir.solution;

import android.content.Context;
import java.util.Map;
import tb.em1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface BHRSolution<O, R> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Status {
        DEVICE_NOT_SUPPORT(1, "Device is not support."),
        BUSINESS_DEGRADE(2, "Business degrade."),
        CHECK_FATIGUE_FAILED(3, "Check fatigue failed."),
        SCROLL_INSTANCE_NOT_ENOUGH(4, "Scroll instance is not enough."),
        SCROLL_DURATION_NOT_ENOUGH(5, "Scroll duration is not enough."),
        CUSTOM_LOGIC_FAILED(6, "Custom logic check failed.");
        
        private final int code;
        private final String msg;

        Status(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }
    }

    void a(em1 em1Var, Runnable runnable);

    Context b();

    boolean d();

    boolean e();

    O f(em1 em1Var);

    boolean g(em1 em1Var);

    void h(em1 em1Var, R r);

    Map<String, String> i(em1 em1Var);
}
