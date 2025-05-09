package com.alipay.android.app.cctemplate.storage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.app.cctemplate.TemplateValue;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TemplateAssetsStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c5ee84", new Object[]{context});
            return;
        }
        LogUtils.record(2, "TemplateAssetsStorage::sendAssetMissBroadcast", "");
        if (context == null) {
            LogUtils.record(8, "TemplateAssetsStorage::sendAssetMissBroadcast", "context is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(MspGlobalDefine.ASSET_MISS_FILTER);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public static String readAssetsFile(String str, AssetManager assetManager, Context context) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fdb5aab", new Object[]{str, assetManager, context});
        }
        StringBuilder sb = new StringBuilder();
        try {
            inputStream = assetManager.open(str);
        } catch (Throwable th) {
            try {
            } catch (Throwable th2) {
                LogUtils.printExceptionStackTrace(th2);
            }
            if (!TextUtils.equals(str, "amc.js")) {
                if (TextUtils.equals(str, "amc.css")) {
                }
                inputStream = null;
            }
            Object obj = StatisticCollector.GLOBAL_AGENT;
            StatisticCollector.addError(obj, "tpl", TemplateValue.EC_TPL_ES_ASSETS_FIND_EX, str + th.getMessage());
            inputStream = assetManager.openFd(str).createInputStream();
        }
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            char[] cArr = new char[2048];
            while (true) {
                try {
                    int read = bufferedReader.read(cArr);
                    if (read <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                } catch (Exception e) {
                    LogUtils.printExceptionStackTrace(e);
                }
            }
            bufferedReader.close();
            try {
                inputStream.close();
            } catch (Throwable th3) {
                LogUtils.printExceptionStackTrace(th3);
            }
        }
        return sb.toString();
    }
}
