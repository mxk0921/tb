package com.android.taobao.aop;

import android.content.res.AssetManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.report.ReportType;
import com.android.taobao.aop.report.ResModel;
import java.io.IOException;
import java.io.InputStream;
import tb.gpv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ANDROID_CONTENT_RES_ASSETMANAGER_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static gpv sUsageReporter = gpv.a();

    static {
        t2o.a(497025027);
    }

    public static InputStream proxy_open(AssetManager assetManager, String str) {
        InputStream inputStream;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("ac320ffc", new Object[]{assetManager, str});
        }
        try {
            inputStream = assetManager.open(str);
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        }
        try {
            sUsageReporter.b(ReportType.ASSETS, new ResModel("com.taobao.taobao", "asset", str), 0);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            return inputStream;
        }
        return inputStream;
    }

    public static InputStream proxy_open_1(AssetManager assetManager, String str, int i) {
        InputStream inputStream;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("984168fb", new Object[]{assetManager, str, new Integer(i)});
        }
        try {
            inputStream = assetManager.open(str, i);
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        }
        try {
            sUsageReporter.b(ReportType.ASSETS, new ResModel("com.taobao.taobao", "asset", str), 0);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            return inputStream;
        }
        return inputStream;
    }
}
