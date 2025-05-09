package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
/* synthetic */ class an {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f14715a;

    static {
        int[] iArr = new int[ic.values().length];
        f14715a = iArr;
        try {
            iArr[ic.SendMessage.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14715a[ic.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14715a[ic.UnRegistration.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14715a[ic.Subscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14715a[ic.UnSubscription.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14715a[ic.Command.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f14715a[ic.Notification.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
