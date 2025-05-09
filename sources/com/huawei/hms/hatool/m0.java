package com.huawei.hms.hatool;

import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5392a = false;
    private int b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.314" + p.a();
    }

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", str + "=> " + str2);
    }

    public void a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("======================================= ");
        sb.append(System.lineSeparator());
        sb.append(a());
        sb.append("");
        sb.append(System.lineSeparator());
        sb.append("=======================================");
        this.b = i;
        this.f5392a = true;
    }

    public boolean b(int i) {
        return this.f5392a && i >= this.b;
    }

    public void a(int i, String str, String str2) {
        if (i != 3 && i != 5 && i == 6) {
            Log.e(str, str2);
        }
    }
}
