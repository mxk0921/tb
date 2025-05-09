package com.xiaomi.push.service;

import com.xiaomi.push.ic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
/* synthetic */ class cg {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f15096a;

    static {
        int[] iArr = new int[ic.values().length];
        f15096a = iArr;
        try {
            iArr[ic.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15096a[ic.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15096a[ic.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15096a[ic.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15096a[ic.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f15096a[ic.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f15096a[ic.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f15096a[ic.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f15096a[ic.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f15096a[ic.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
