package com.taobao.taobao.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.taobao.utils.TradeRealTimeDataTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f12963a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public a(String str, Map<String, String> map) {
        map = map == null ? new HashMap<>() : map;
        this.f = str;
        this.f12963a = UUID.randomUUID().toString();
        this.b = Login.getUserId();
        this.d = map.get("orderids");
        this.c = map.get("realPay");
        this.e = map.get("from");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c21458", new Object[]{this, str});
            return;
        }
        try {
            TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
            aVar.f12962a = this.f12963a;
            aVar.b = this.b;
            aVar.d = this.d;
            aVar.e = this.c;
            aVar.i = this.f;
            aVar.j = this.e;
            aVar.h = str;
            TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.PAY_FAIL, aVar);
        } catch (Throwable unused) {
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa56bd8d", new Object[]{this});
            return;
        }
        try {
            TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
            aVar.f12962a = this.f12963a;
            aVar.b = this.b;
            aVar.d = this.d;
            aVar.e = this.c;
            aVar.i = this.f;
            aVar.j = this.e;
            TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.PAY_REQUEST, aVar);
        } catch (Throwable unused) {
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a313101", new Object[]{this});
            return;
        }
        try {
            TradeRealTimeDataTrace.a aVar = new TradeRealTimeDataTrace.a();
            aVar.f12962a = this.f12963a;
            aVar.b = this.b;
            aVar.d = this.d;
            aVar.e = this.c;
            aVar.i = this.f;
            aVar.j = this.e;
            TradeRealTimeDataTrace.e(TradeRealTimeDataTrace.TradeStage.PAY_SUCCESS, aVar);
        } catch (Throwable unused) {
        }
    }
}
