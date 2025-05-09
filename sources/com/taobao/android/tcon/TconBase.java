package com.taobao.android.tcon;

import android.content.Context;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import tb.ud2;
import tb.vd2;
import tb.wvm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TconBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void clearLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7144bd08", new Object[]{str});
        } else {
            new File(str).delete();
        }
    }

    public static boolean loadRequiredLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccb543e1", new Object[0])).booleanValue();
        }
        try {
            wvm.a();
            System.loadLibrary("tcon");
            Log.e(TconInitializer.TCON_TAG, "prglite initialized");
            return true;
        } catch (Throwable unused) {
            Log.e(TconInitializer.TCON_TAG, "prglite initialization failed");
            return false;
        }
    }

    public static String readLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41f260a1", new Object[]{str});
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void reportException(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49485ee4", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            ud2 ud2Var = new ud2();
            ud2Var.f29301a = str3;
            ud2Var.e = "1.0.0.6";
            ud2Var.b = AggregationType.CONTENT;
            ud2Var.d = str;
            ud2Var.j = str2;
            vd2.a().c(context, ud2Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
