package com.taobao.android.tb3dspaceprocessor;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.fsw;
import tb.gts;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XRNativeProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XRNativeProcessor";
    private static int sRetryTimes;

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "t3dnativeprocessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Uri data = intent.getData();
        Log.e(TAG, "process: enter");
        if (data == null || zmjVar == null) {
            TLog.loge("3dprocessor", TAG, "navContext is null");
            return true;
        }
        try {
            z = "true".equals(data.getQueryParameter("forceinstallt3d"));
        } catch (Throwable th) {
            new StringBuilder("process: throwable").append(th);
            z = false;
        }
        try {
            z2 = "true".equals(data.getQueryParameter("installt3d"));
        } catch (Throwable th2) {
            Log.e(TAG, "process: throwable" + th2);
            z2 = false;
        }
        fsw.h("T3DNativeJSAPI", T3DNattiveJS.class);
        StringBuilder sb = new StringBuilder("process: enter process isInstall ");
        sb.append(z2);
        sb.append(" isForceInstall ");
        sb.append(z);
        if (gts.d()) {
            gts.c(null, data.toString());
            return true;
        } else if (z) {
            try {
                String str = "https://go/installxrspace3d?appUrl=" + URLEncoder.encode(data.toString(), "UTF-8");
                int i = sRetryTimes + 1;
                sRetryTimes = i;
                if (i <= 5) {
                    Nav.from(zmjVar.d()).toUri(str);
                    return false;
                }
                TLog.loge("3dprocessor", TAG, "process: install t3d fail");
                return true;
            } catch (UnsupportedEncodingException e) {
                TLog.loge("3dprocessor", TAG, "onCreate: UnsupportedEncodingException" + e);
                return true;
            }
        } else {
            if (z2) {
                gts.e(null);
            }
            return true;
        }
    }
}
