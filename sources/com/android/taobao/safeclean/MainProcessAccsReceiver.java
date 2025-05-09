package com.android.taobao.safeclean;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m70;
import tb.rf2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MainProcessAccsReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311450);
    }

    public static /* synthetic */ Object ipc$super(MainProcessAccsReceiver mainProcessAccsReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/safeclean/MainProcessAccsReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String stringExtra = intent.getStringExtra("command");
        m70 m70Var = new m70((Application) context.getApplicationContext(), false);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if (stringExtra.contains("additionDataList")) {
            m70Var.e(rf2.KEY_ADDITION, "", stringExtra);
        } else {
            m70Var.e("clean", "", stringExtra);
        }
    }
}
