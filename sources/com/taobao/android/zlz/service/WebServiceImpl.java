package com.taobao.android.zlz.service;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.BaseWebService;
import com.taobao.android.nav.Nav;
import com.taobao.browser.BrowserActivity;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Stack;
import tb.tqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WebServiceImpl extends BaseWebService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    private Stack<String> pageStack = new Stack<>();

    public static /* synthetic */ Object ipc$super(WebServiceImpl webServiceImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/zlz/service/WebServiceImpl");
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void exitPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4ec39e", new Object[]{this, str});
            return;
        }
        Activity activity = (Activity) tqx.b().a();
        if (activity != null && !activity.isFinishing() && (activity instanceof BrowserActivity)) {
            BrowserActivity browserActivity = (BrowserActivity) activity;
            Message obtain = Message.obtain(browserActivity.getHandler());
            obtain.what = 88;
            browserActivity.getHandler().sendMessage(obtain);
            this.pageStack.pop();
        }
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void exitSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c47c1f", new Object[]{this});
            return;
        }
        Activity activity = (Activity) tqx.b().a();
        if (activity != null && !activity.isFinishing() && (activity instanceof BrowserActivity)) {
            while (!this.pageStack.isEmpty()) {
                BrowserActivity browserActivity = (BrowserActivity) activity;
                Message obtain = Message.obtain(browserActivity.getHandler());
                obtain.what = 88;
                browserActivity.getHandler().sendMessage(obtain);
                this.pageStack.pop();
            }
        }
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public boolean isPageAlreadyExisted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5664ec", new Object[]{this, str})).booleanValue();
        }
        return this.pageStack.contains(str);
    }

    @Override // com.ap.zoloz.hummer.common.BaseWebService
    public void openPage(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("445ee9b3", new Object[]{this, hashMap});
        } else if (hashMap != null && tqx.b().a() != null && hashMap.get("url") != null && !TextUtils.isEmpty(hashMap.get("url").toString())) {
            try {
                String obj = hashMap.get("url").toString();
                if (Nav.from(Globals.getApplication()).toUri(obj)) {
                    this.pageStack.push(obj);
                }
            } catch (Exception unused) {
            }
        }
    }
}
