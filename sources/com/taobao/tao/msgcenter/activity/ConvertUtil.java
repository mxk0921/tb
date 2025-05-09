package com.taobao.tao.msgcenter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ConvertUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529531101);
    }

    public static Bundle convertMsgExtras(Intent intent) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d3a64e19", new Object[]{intent});
        }
        Bundle bundle = null;
        if (intent == null) {
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(stringExtra)) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("id", stringExtra);
                String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
                String stringExtra3 = intent.getStringExtra("task_id");
                if (!TextUtils.isEmpty(stringExtra3)) {
                    bundle2.putString("task_id", stringExtra3);
                }
                if (TextUtils.isEmpty(stringExtra2)) {
                    return null;
                }
                bundle2.putString(AgooConstants.MESSAGE_BODY, stringExtra2);
                try {
                    String string = new JSONObject(stringExtra2).getString("url");
                    if (TextUtils.isEmpty(string)) {
                        return bundle2;
                    }
                    bundle2.putString(TaobaoConstants.MESSAGE_URL, string);
                    return bundle2;
                } catch (Throwable unused) {
                    return bundle2;
                }
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
                TLog.loge("agoo_push", Log.getStackTraceString(th));
                return bundle;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
