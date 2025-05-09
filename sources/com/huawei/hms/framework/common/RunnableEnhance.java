package com.huawei.hms.framework.common;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RunnableEnhance implements Runnable {
    static final String TRANCELOGO = " -->";
    private String parentName = Thread.currentThread().getName();
    private Runnable proxy;

    public RunnableEnhance(Runnable runnable) {
        this.proxy = runnable;
    }

    public String getParentName() {
        return this.parentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.proxy.run();
    }
}
