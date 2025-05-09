package com.taobao.allspark;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ufs;
import tb.v28;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GuangGuangNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "GuangGuangNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        v28 v28Var = v28.INSTANCE;
        if (zmjVar == null) {
            context = null;
        } else {
            context = zmjVar.d();
        }
        if (v28Var.a(context, intent) || ufs.j(zmjVar, intent)) {
            return true;
        }
        return false;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
