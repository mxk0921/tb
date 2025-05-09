package com.taobao.downloader.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.TbDownloader;
import java.io.Serializable;
import java.util.HashMap;
import tb.xh4;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaobaoLaunchTbdownloader implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        xh4.f31395a = application;
        TbDownloader.init();
    }
}
