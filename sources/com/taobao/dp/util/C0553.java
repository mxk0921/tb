package com.taobao.dp.util;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;

/* renamed from: com.taobao.dp.util.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0553 implements IUMIDInitListenerEx {

    /* renamed from: д  reason: contains not printable characters */
    private static final String f519 = "SyncHelper";

    /* renamed from: е  reason: contains not printable characters */
    private static final boolean f520 = false;

    /* renamed from: а  reason: contains not printable characters */
    private int f521;

    /* renamed from: б  reason: contains not printable characters */
    private String f522;

    /* renamed from: в  reason: contains not printable characters */
    private int f523 = SecExceptionCode.SEC_ERROR_UMID_TIME_OUT;

    /* renamed from: г  reason: contains not printable characters */
    private volatile boolean f524 = false;

    public C0553(int i) {
        this.f521 = i;
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
    public void onUMIDInitFinishedEx(String str, int i) {
        this.f522 = str;
        this.f523 = i;
        synchronized (this) {
            this.f524 = true;
            notify();
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    public int m330() {
        return this.f523;
    }

    /* renamed from: б  reason: contains not printable characters */
    public boolean m331() {
        boolean z;
        synchronized (this) {
            z = this.f524;
        }
        return z;
    }
}
