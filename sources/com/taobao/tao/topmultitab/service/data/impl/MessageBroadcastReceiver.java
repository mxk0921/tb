package com.taobao.tao.topmultitab.service.data.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import java.lang.ref.WeakReference;
import tb.bqa;
import tb.e0p;
import tb.f4b;
import tb.mll;
import tb.t2o;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MessageBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<wcc> f12807a;
    public JSONObject b;
    public final mll c = new mll();

    static {
        t2o.a(729810182);
    }

    public MessageBroadcastReceiver(wcc wccVar) {
        this.f12807a = new WeakReference<>(wccVar);
    }

    public static /* synthetic */ Object ipc$super(MessageBroadcastReceiver messageBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/data/impl/MessageBroadcastReceiver");
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e4c3a7f", new Object[]{this});
        }
        return this.b;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4671724", new Object[]{this, jSONObject});
            return;
        }
        JSONObject d = e0p.d();
        if (jSONObject != null && d != null) {
            wcc wccVar = this.f12807a.get();
            if (wccVar == null) {
                bqa.d("MessageBroadcastReceiver", "homePageContext == null");
                return;
            }
            IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) wccVar.a(IHomeSearchBarService.class);
            if (iHomeSearchBarService == null) {
                bqa.d("MessageBroadcastReceiver", "homeSearchBarService == null");
            } else {
                iHomeSearchBarService.partialRefreshWidgetNode("messageIcon");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        bqa.d("MessageBroadcastReceiver", "收到广播了");
        if (intent == null) {
            bqa.d("MessageBroadcastReceiver", "intent == null");
            return;
        }
        try {
            this.b = JSON.parseObject(intent.getStringExtra("mpMessageBoxGlobalsTipInfo"));
        } catch (Exception e) {
            bqa.d("MessageBroadcastReceiver", "出现异常： " + e);
        }
        bqa.d("MessageBroadcastReceiver", "mMessageTipInfo: " + this.b);
        boolean b = f4b.b("enableNotLoggedInNotPageBack", true);
        if (this.c.b() || !b) {
            b(this.b);
            bqa.d("MessageBroadcastReceiver", "刷新消息icon");
        }
    }
}
