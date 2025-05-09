package com.taobao.browser.nav;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.impl.TMS;
import tb.hds;
import tb.mpj;
import tb.t2o;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserActivityProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserActivityProcessor";
    private static volatile boolean sPreInitUc = true;
    public static String TMS_WHITE_LIST = null;

    static {
        t2o.a(619708620);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return TAG;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        ComponentName component;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Context d = zmjVar.d();
        if (d == null || intent == null || (data = intent.getData()) == null || (component = intent.getComponent()) == null) {
            return true;
        }
        String className = component.getClassName();
        if (!BrowserActivity.class.getName().equals(className) && !BrowserUpperActivity.class.getName().equals(className)) {
            return true;
        }
        try {
            z = hds.INSTANCE.b(new mpj(data.toString(), data, d));
        } catch (Exception unused) {
        }
        if (z) {
            TMS.startApp(intent, zmjVar, TMSSolutionType.WEB_SINGLE_PAGE);
        }
        return true;
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
