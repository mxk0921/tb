package com.android.tools.ir.runtime;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import tb.s11;
import tb.wmc;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Dex2oatService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f4605a;

    public static /* synthetic */ Object ipc$super(Dex2oatService dex2oatService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/android/tools/ir/runtime/Dex2oatService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        stopForeground(true);
        f4605a = false;
        System.exit(0);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (DexFile.loadDex(new File(s11.e).getPath(), s11.i(new File(s11.e), Dex2oatService.this.getCodeCacheDir()), 0) != null) {
                        Log.e("Dex2oatService", "dexoat done! and oat size:" + new File(s11.i(new File(s11.e), Dex2oatService.this.getCodeCacheDir())).length());
                        String str = Dex2oatService.this.getPackageManager().getPackageInfo(Dex2oatService.this.getPackageName(), 0).versionName;
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Dex2oatService.this).edit();
                        edit.putBoolean("fixdex2oat_" + str, true).apply();
                        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(Dex2oatService.this).edit();
                        edit2.putBoolean("need_dex2oat_" + Dex2oatService.this.getPackageManager().getPackageInfo(Dex2oatService.this.getPackageName(), 0).versionName, false).apply();
                    }
                } catch (PackageManager.NameNotFoundException | IOException e) {
                    e.printStackTrace();
                }
            } finally {
                Dex2oatService.this.stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (f4605a) {
            return super.onStartCommand(intent, i, i2);
        }
        f4605a = true;
        new Thread(new a()).start();
        try {
            int i3 = getApplicationInfo().icon;
            Drawable drawable = getPackageManager().getResourcesForApplication(getPackageName()).getDrawable(i3);
            PendingIntent c = ya.c(this, 0, getPackageManager().getLaunchIntentForPackage(getPackageName()), 0);
            if (drawable != null) {
                startForeground(232444, new Notification.Builder(this).setContentTitle(wmc.TIPS).setContentText("正在进行修复......").setSmallIcon(i3).setContentIntent(c).build());
            } else {
                Toast.makeText(this, "您的安装包不完整,请卸载重装!", 1).show();
            }
        } catch (Throwable unused) {
            Toast.makeText(this, "您的安装包不完整,请卸载重装!", 1).show();
        }
        return super.onStartCommand(intent, i, i2);
    }
}
