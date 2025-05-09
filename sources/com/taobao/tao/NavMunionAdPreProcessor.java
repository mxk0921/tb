package com.taobao.tao;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import tb.t2o;
import tb.vm2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NavMunionAdPreProcessor implements Nav.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_MODULE_NAME = "AlimamaAd";
    private static final String TAG = "NavMunionAdPreProcessor";

    static {
        t2o.a(775946322);
        t2o.a(578814041);
    }

    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            try {
                if (!vm2.j()) {
                    Uri parse = Uri.parse(AlimamaAdvertising.instance().handleAdUrl(data.toString()));
                    TLog.loge(LOG_MODULE_NAME, TAG, String.format("originUri=[%1$s],newUri=[%2$s]", data.toString(), parse.toString()));
                    intent.setData(parse);
                    intent.putExtra("ad_type", "1.0");
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
