package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Application;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.middletierplugin.open.fc.AbstractC0141;
import com.alibaba.wireless.security.open.middletier.MidBridge;
import com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;
import tb.acq;
import tb.t2o;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Ext2ContainerActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ActivityManager K;
    private boolean J;
    public long f;

    /* renamed from: a  reason: collision with root package name */
    public IBXWebview f3454a = null;
    public Handler b = null;
    public long c = 0;
    public String d = "";
    public String e = "?action=close";
    public String g = "";
    public String h = "";
    public String i = null;
    public String j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = true;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public boolean r = false;
    public boolean s = true;
    public boolean t = true;
    public boolean u = false;
    public boolean v = false;
    public int w = 0;
    public boolean x = false;
    public float y = 1.0f;
    public float z = 1.0f;
    public int A = 0;
    public volatile int B = 0;
    public volatile int C = 0;
    public volatile int D = 0;
    public volatile int E = 0;
    private DownloadCompleteReceiver F = null;
    private long G = -1;
    private int H = 0;
    private String I = null;

    static {
        t2o.a(659554398);
    }

    public Ext2ContainerActivity() {
        boolean z = false;
        this.J = MidBridge.getWvmlfcdmSwitch() > 0 ? true : z;
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : (int) ((i * getResources().getDisplayMetrics().density) + 1.0f);
    }

    public static /* synthetic */ int b(Ext2ContainerActivity ext2ContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af86e3e7", new Object[]{ext2ContainerActivity})).intValue() : ext2ContainerActivity.H;
    }

    public static /* synthetic */ long c(Ext2ContainerActivity ext2ContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d7a49c7", new Object[]{ext2ContainerActivity})).longValue();
        }
        return ext2ContainerActivity.G;
    }

    public static /* synthetic */ void d(Ext2ContainerActivity ext2ContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6dafb2", new Object[]{ext2ContainerActivity});
        } else {
            ext2ContainerActivity.a();
        }
    }

    public static /* synthetic */ void e(Ext2ContainerActivity ext2ContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49611591", new Object[]{ext2ContainerActivity});
        } else {
            ext2ContainerActivity.b();
        }
    }

    public static String getMIMEType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("261116cb", new Object[]{str});
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static String getPackageNameWrapper(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4c10f7", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(Ext2ContainerActivity ext2ContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/Ext2ContainerActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.l && this.C == 0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.D == 0) {
                        this.D = 1;
                    }
                } else if (this.C == 0) {
                    this.C = 1;
                    a(0, "", "Dispatchtouchevent", "" + this.B + "" + this.D + "" + this.C, false, true, 21);
                }
            } else if (this.B == 0) {
                this.B = 1;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (this.x) {
            overridePendingTransition(R.anim.sg_bottom_slide_in, R.anim.sg_bottom_slide_out);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!this.m) {
            super.onBackPressed();
            this.E = 4;
            a();
            a(this.c, IUIBridge.INTENT_ACTIVITY_RESULT, 4);
            a(0, "", "Onbackpressed", "" + this.m, false, this.k, 19);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.x) {
            a(getWindow());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r12 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "a6532022"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r12
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            r12.v = r1
            super.onDestroy()
            com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview r2 = r12.f3454a
            if (r2 == 0) goto L_0x0023
            r2.bxDestroy()     // Catch: Exception -> 0x0022
            r2 = 0
            r12.f3454a = r2     // Catch: Exception -> 0x0022
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            boolean r2 = r12.J
            if (r2 == 0) goto L_0x003c
            boolean r2 = r12.p
            if (r2 == 0) goto L_0x004c
            boolean r2 = r12.t
            if (r2 == 0) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity$DownloadCompleteReceiver r2 = r12.F     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
        L_0x0037:
            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity$DownloadCompleteReceiver r3 = r12.F     // Catch: Exception -> 0x003a
            goto L_0x0049
        L_0x003a:
            goto L_0x004c
        L_0x003c:
            boolean r2 = r12.t
            if (r2 != r1) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity$DownloadCompleteReceiver r2 = r12.F     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
            goto L_0x0037
        L_0x0049:
            r2.unregisterReceiver(r3)     // Catch: Exception -> 0x003a
        L_0x004c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ondestroy"
            r2.<init>(r3)
            int r3 = r12.E
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            int r2 = r12.E
            if (r2 != 0) goto L_0x0062
            r9 = 1
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            r10 = 1
            r11 = 22
            r5 = 0
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r4 = r12
            r4.a(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.onDestroy():void");
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        a(0, "", "onRestart", "onRestart", false, this.k, 25);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        a(0, "", "onStart", "onStart", false, this.k, 24);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        a(0, "", "onStop", "onStop", false, this.k, 26);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DownloadCompleteReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554402);
        }

        private DownloadCompleteReceiver() {
        }

        public static /* synthetic */ Object ipc$super(DownloadCompleteReceiver downloadCompleteReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/Ext2ContainerActivity$DownloadCompleteReceiver");
        }

        private File a(Context context, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("db07a929", new Object[]{this, context, new Long(j)});
            }
            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
            File file = null;
            if (j != -1) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(j);
                query.setFilterByStatus(8);
                Cursor query2 = downloadManager.query(query);
                if (query2 != null) {
                    if (query2.moveToFirst()) {
                        String string = query2.getString(query2.getColumnIndex("local_uri"));
                        if (!TextUtils.isEmpty(string)) {
                            file = new File(Uri.parse(string).getPath());
                        }
                    }
                    query2.close();
                }
            }
            return file;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            if (intent != null) {
                try {
                    long longExtra = intent.getLongExtra("extra_download_id", -1L);
                    if (longExtra == Ext2ContainerActivity.c(Ext2ContainerActivity.this) && "android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                        Ext2ContainerActivity ext2ContainerActivity = Ext2ContainerActivity.this;
                        if (ext2ContainerActivity.r) {
                            ext2ContainerActivity.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                        } else if (ext2ContainerActivity.u) {
                            DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                            String mimeTypeForDownloadedFile = downloadManager.getMimeTypeForDownloadedFile(longExtra);
                            if (TextUtils.isEmpty(mimeTypeForDownloadedFile)) {
                                mimeTypeForDownloadedFile = "*/*";
                            }
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.addFlags(268435456);
                            int i = Build.VERSION.SDK_INT;
                            if (i < 23) {
                                uri = downloadManager.getUriForDownloadedFile(longExtra);
                            } else if (i < 24) {
                                uri = Uri.fromFile(a(context, longExtra));
                            } else {
                                Ext2ContainerActivity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                                uri = null;
                            }
                            if (uri != null) {
                                intent2.setDataAndType(uri, mimeTypeForDownloadedFile);
                                Ext2ContainerActivity.this.startActivity(intent2);
                            }
                        }
                    }
                } catch (Exception e) {
                    Ext2ContainerActivity.this.a(true, 2305, "", 0L, e.getMessage(), "");
                }
            }
            Ext2ContainerActivity ext2ContainerActivity2 = Ext2ContainerActivity.this;
            boolean z = ext2ContainerActivity2.k;
            ext2ContainerActivity2.a(z, 0, "", 0L, "onReceive", "" + Ext2ContainerActivity.c(Ext2ContainerActivity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DownloadSerice implements IBXWebview.IBXDownloadService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554403);
            t2o.a(659554413);
        }

        private DownloadSerice() {
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview.IBXDownloadService
        public long startDownload(String str, String str2) {
            int i;
            Exception e;
            Ext2ContainerActivity ext2ContainerActivity;
            AlertDialog.Builder positiveButton;
            String str3;
            Ext2ContainerActivity ext2ContainerActivity2;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("181c5f19", new Object[]{this, str, str2})).longValue();
            }
            try {
                Context applicationContext = Ext2ContainerActivity.this.getApplicationContext();
                Ext2ContainerActivity ext2ContainerActivity3 = Ext2ContainerActivity.this;
                ext2ContainerActivity3.i = str;
                ext2ContainerActivity3.j = str2;
                if (!Ext2ContainerActivity.a(ext2ContainerActivity3)) {
                    Ext2ContainerActivity.a(Ext2ContainerActivity.this, applicationContext.getApplicationInfo().targetSdkVersion);
                    if (Ext2ContainerActivity.b(Ext2ContainerActivity.this) < 33) {
                        ext2ContainerActivity2 = Ext2ContainerActivity.this;
                        str3 = Environment.DIRECTORY_DOWNLOADS;
                    } else {
                        File externalCacheDir = applicationContext.getExternalCacheDir();
                        Ext2ContainerActivity ext2ContainerActivity4 = Ext2ContainerActivity.this;
                        str3 = externalCacheDir.getAbsolutePath();
                        ext2ContainerActivity2 = ext2ContainerActivity4;
                    }
                    Ext2ContainerActivity.a(ext2ContainerActivity2, str3);
                }
                ext2ContainerActivity = Ext2ContainerActivity.this;
            } catch (Exception e2) {
                e = e2;
                i2 = 0;
            }
            if (ext2ContainerActivity.n) {
                final HashMap<String, String> installedMarketPackageName = AppStoreUtils.getInstalledMarketPackageName(ext2ContainerActivity);
                i2 = installedMarketPackageName.size();
                try {
                } catch (Exception e3) {
                    e = e3;
                    Ext2ContainerActivity.this.a(true, 2304, "", 0L, e.getMessage(), "");
                    i = 0;
                    Ext2ContainerActivity ext2ContainerActivity5 = Ext2ContainerActivity.this;
                    boolean z = ext2ContainerActivity5.k;
                    ext2ContainerActivity5.a(z, 0, "", 0L, "startDownload", Ext2ContainerActivity.c(Ext2ContainerActivity.this) + "|" + i2 + "|" + i + "|" + Ext2ContainerActivity.this.n + "|" + Ext2ContainerActivity.this.o + "|" + Ext2ContainerActivity.this.p);
                    return Ext2ContainerActivity.c(Ext2ContainerActivity.this);
                }
                if (installedMarketPackageName.size() > 1) {
                    final String[] strArr = new String[installedMarketPackageName.size()];
                    int i3 = 0;
                    for (String str4 : installedMarketPackageName.keySet()) {
                        i3++;
                        strArr[i3] = str4;
                    }
                    positiveButton = new AlertDialog.Builder(Ext2ContainerActivity.this).setTitle(R.string.sg_app_store_select).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.DownloadSerice.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                                return;
                            }
                            Ext2ContainerActivity ext2ContainerActivity6 = Ext2ContainerActivity.this;
                            AppStoreUtils.toMarket(ext2ContainerActivity6, Ext2ContainerActivity.getPackageNameWrapper(ext2ContainerActivity6), (String) installedMarketPackageName.get(strArr[i4]));
                        }
                    });
                } else if (installedMarketPackageName.size() == 1) {
                    Ext2ContainerActivity ext2ContainerActivity6 = Ext2ContainerActivity.this;
                    AppStoreUtils.toMarket(ext2ContainerActivity6, Ext2ContainerActivity.getPackageNameWrapper(ext2ContainerActivity6), installedMarketPackageName.get(installedMarketPackageName.keySet().iterator().next()));
                    i = 0;
                    Ext2ContainerActivity ext2ContainerActivity52 = Ext2ContainerActivity.this;
                    boolean z2 = ext2ContainerActivity52.k;
                    ext2ContainerActivity52.a(z2, 0, "", 0L, "startDownload", Ext2ContainerActivity.c(Ext2ContainerActivity.this) + "|" + i2 + "|" + i + "|" + Ext2ContainerActivity.this.n + "|" + Ext2ContainerActivity.this.o + "|" + Ext2ContainerActivity.this.p);
                    return Ext2ContainerActivity.c(Ext2ContainerActivity.this);
                } else {
                    ext2ContainerActivity = Ext2ContainerActivity.this;
                    if (!ext2ContainerActivity.p) {
                        positiveButton = new AlertDialog.Builder(Ext2ContainerActivity.this).setMessage(R.string.sg_app_store_not_exist).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null);
                    }
                }
                positiveButton.create().show();
                i = 0;
                Ext2ContainerActivity ext2ContainerActivity522 = Ext2ContainerActivity.this;
                boolean z22 = ext2ContainerActivity522.k;
                ext2ContainerActivity522.a(z22, 0, "", 0L, "startDownload", Ext2ContainerActivity.c(Ext2ContainerActivity.this) + "|" + i2 + "|" + i + "|" + Ext2ContainerActivity.this.n + "|" + Ext2ContainerActivity.this.o + "|" + Ext2ContainerActivity.this.p);
                return Ext2ContainerActivity.c(Ext2ContainerActivity.this);
            }
            if (ext2ContainerActivity.o) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse(str));
                Ext2ContainerActivity.this.startActivity(intent);
            } else if (ext2ContainerActivity.p) {
                i2 = 0;
            }
            i = 0;
            Ext2ContainerActivity ext2ContainerActivity5222 = Ext2ContainerActivity.this;
            boolean z222 = ext2ContainerActivity5222.k;
            ext2ContainerActivity5222.a(z222, 0, "", 0L, "startDownload", Ext2ContainerActivity.c(Ext2ContainerActivity.this) + "|" + i2 + "|" + i + "|" + Ext2ContainerActivity.this.n + "|" + Ext2ContainerActivity.this.o + "|" + Ext2ContainerActivity.this.p);
            return Ext2ContainerActivity.c(Ext2ContainerActivity.this);
            i = Ext2ContainerActivity.a(ext2ContainerActivity, str, str2);
            Ext2ContainerActivity ext2ContainerActivity52222 = Ext2ContainerActivity.this;
            boolean z2222 = ext2ContainerActivity52222.k;
            ext2ContainerActivity52222.a(z2222, 0, "", 0L, "startDownload", Ext2ContainerActivity.c(Ext2ContainerActivity.this) + "|" + i2 + "|" + i + "|" + Ext2ContainerActivity.this.n + "|" + Ext2ContainerActivity.this.o + "|" + Ext2ContainerActivity.this.p);
            return Ext2ContainerActivity.c(Ext2ContainerActivity.this);
        }
    }

    public static /* synthetic */ int a(Ext2ContainerActivity ext2ContainerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60dcb781", new Object[]{ext2ContainerActivity, new Integer(i)})).intValue();
        }
        ext2ContainerActivity.H = i;
        return i;
    }

    private long b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b871", new Object[]{this, str, str2})).longValue();
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        request.setVisibleInDownloadsUi(true);
        request.setAllowedOverRoaming(true);
        request.setAllowedNetworkTypes(2);
        request.setDestinationInExternalPublicDir(this.J ? Environment.DIRECTORY_DOWNLOADS : this.I, URLUtil.guessFileName(str, str2, getMIMEType(str)));
        DownloadManager downloadManager = (DownloadManager) getSystemService("download");
        if (this.q) {
            Toast.makeText(this, "开始下载更新包", 0).show();
        }
        long enqueue = downloadManager.enqueue(request);
        this.G = enqueue;
        return enqueue;
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        a(0, "", "onPause", "onPause", false, this.k, 14);
        if ((this.w & 1) != 1) {
            this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Ext2ContainerActivity ext2ContainerActivity = Ext2ContainerActivity.this;
                    if (!ext2ContainerActivity.v && Ext2ContainerActivity.a((Context) ext2ContainerActivity)) {
                        Ext2ContainerActivity.this.E = 5;
                        Ext2ContainerActivity ext2ContainerActivity2 = Ext2ContainerActivity.this;
                        ext2ContainerActivity2.a(ext2ContainerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 1);
                        Ext2ContainerActivity.e(Ext2ContainerActivity.this);
                        Ext2ContainerActivity ext2ContainerActivity3 = Ext2ContainerActivity.this;
                        ext2ContainerActivity3.a(0, "", "onPause", "", false, ext2ContainerActivity3.k, 20);
                    }
                }
            }, 1000L);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (((this.w >> 1) & 1) != 1) {
            a(this.c, IUIBridge.INTENT_ACTIVITY_CREATE, 1);
        }
        a(0, "", "onResume", "onResume", false, this.k, 13);
    }

    public static /* synthetic */ int a(Ext2ContainerActivity ext2ContainerActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b540c9c", new Object[]{ext2ContainerActivity, str, str2})).intValue() : ext2ContainerActivity.a(str, str2);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!isFinishing()) {
            a(0, "", "finishCurrentActivity", "", false, this.k, 23);
            finish();
        }
    }

    private int a(String str, String str2) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        boolean z = this.J;
        if ((!z || Build.VERSION.SDK_INT >= 29) && (z || this.H >= 33)) {
            b(str, str2);
            return 1;
        }
        if (ContextCompat.checkSelfPermission(getApplication(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            b(str, str2);
            i = 1;
        } else if (this.s) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1139);
        } else {
            new AlertDialog.Builder(this).setMessage(R.string.sg_permission_failed).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null).create().show();
            i = 3;
        }
        return i;
    }

    public void b(boolean z, int i, String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11adaf6", new Object[]{this, new Boolean(z), new Integer(i), str, new Long(j), str2, str3});
        } else if (z) {
            String num = Integer.toString(100169);
            String str4 = this.g;
            UserTrackMethodJniBridge.addUtRecord(num, i, 7, str4, j, str, str2, str3, "" + this.c, this.h);
        }
    }

    public static /* synthetic */ String a(Ext2ContainerActivity ext2ContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15e3b9e1", new Object[]{ext2ContainerActivity, str});
        }
        ext2ContainerActivity.I = str;
        return str;
    }

    private static boolean b(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            if (K == null) {
                K = (ActivityManager) context.getSystemService("activity");
            }
            ActivityManager activityManager = K;
            if (activityManager != null) {
                String packageName = context.getPackageName();
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() > 0) {
                    componentName = runningTasks.get(0).topActivity;
                    if (!packageName.equals(componentName.getPackageName()) || !context.getPackageManager().getActivityInfo(componentName, 0).processName.equals(context.getApplicationInfo().processName)) {
                        return false;
                    }
                    if (!Ext2ContainerActivity.class.getName().equals(componentName.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i == 1139) {
            if (iArr.length > 0 && iArr[0] == 0) {
                b(this.i, this.j);
                i2 = 1;
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                new AlertDialog.Builder(this).setMessage("应用更新需要授予存储权限，请到设置中开启存储权限").setPositiveButton(wmc.CONFIRM, (DialogInterface.OnClickListener) null).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create().show();
                i2 = 2;
            } else {
                new AlertDialog.Builder(this).setMessage("应用更新需要授予存储权限，请到设置中开启存储权限").setPositiveButton(wmc.CONFIRM, (DialogInterface.OnClickListener) null).create().show();
            }
            boolean z = this.k;
            a(z, 0, "", 0L, "onRequestPermissionsResult", "" + i2);
        }
    }

    private String a(String str) throws MalformedURLException {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String query = new URL(str).getQuery();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(query)) {
            String str2 = null;
            for (String str3 : query.split("&")) {
                if (str3.startsWith("http_referer=")) {
                    this.d = str3.substring(13);
                    str2 = str3;
                } else if (!str3.equalsIgnoreCase("native=1")) {
                    sb.append(str3);
                    sb.append("&");
                }
            }
            sb.append("tmd_nc=1");
            if (str2 != null) {
                sb.append("&");
                sb.append(str2);
            }
            if (this.x) {
                sb.append("&new_ui=1");
            }
            return str.replace(query, sb.toString());
        }
        sb.append(str);
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        sb.append("tmd_nc=1");
        if (this.x) {
            sb.append("&new_ui=1");
        }
        return sb.toString();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Exception e;
        IBXWebview bXWebview;
        IntentFilter intentFilter;
        Application application;
        Application application2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setFinishOnTouchOutside(false);
        this.f = System.currentTimeMillis();
        this.v = false;
        this.b = new Handler(Looper.getMainLooper());
        try {
            Intent intent = getIntent();
            this.k = intent.getBooleanExtra("needUT", false);
            this.l = intent.getBooleanExtra("isSample", false);
            this.c = intent.getLongExtra("sessionId", 0L);
            this.g = intent.getStringExtra("pluginVersion");
            this.h = intent.getStringExtra("bxUUID");
            this.m = intent.getBooleanExtra("hideCloseBtn", false);
            this.A = intent.getIntExtra("apiTimeOut", 0);
            this.y = intent.getFloatExtra("windowHeight", 1.0f);
            this.w = intent.getIntExtra("closeOverLaySw", 0);
            float floatExtra = intent.getFloatExtra("windowHeightNew", 1.0f);
            this.z = floatExtra;
            boolean z = floatExtra > 0.0f && floatExtra < 1.0f;
            this.x = z;
            if (!z) {
                floatExtra = this.y;
            }
            this.y = floatExtra;
            try {
                Window window = getWindow();
                if (this.x) {
                    window.getDecorView().setBackgroundDrawable(getResources().getDrawable(R.drawable.sg_rounded_top));
                    int a2 = a(12);
                    window.getDecorView().setPadding(a2, a2, a2, a2);
                } else {
                    window.getDecorView().setPadding(0, 0, 0, 0);
                }
                a(window);
            } catch (Exception e2) {
                b(true, 2306, "", 0L, e2.getMessage(), "");
            }
            String[] split = intent.getStringExtra("downloadConfig").split(SymbolExpUtil.SYMBOL_VERTICALBAR, -1);
            if (split.length >= 7) {
                this.n = Integer.valueOf(split[0]).intValue() > 0;
                this.o = Integer.valueOf(split[1]).intValue() > 0;
                this.p = Integer.valueOf(split[2]).intValue() > 0;
                this.q = Integer.valueOf(split[3]).intValue() > 0;
                this.r = Integer.valueOf(split[4]).intValue() > 0;
                this.u = Integer.valueOf(split[5]).intValue() > 0;
                this.s = Integer.valueOf(split[6]).intValue() > 0;
            }
            if (split.length >= 8) {
                this.t = Integer.valueOf(split[7]).intValue() > 0;
            }
            String a3 = a(intent.getStringExtra("location"));
            try {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                setContentView(linearLayout);
                if (this.x) {
                    overridePendingTransition(R.anim.sg_bottom_slide_in, R.anim.sg_bottom_slide_out);
                }
                try {
                    IpChange ipChange2 = WVUCWebView.$ipChange;
                    bXWebview = new BXWVWebview(this, a3);
                } catch (Exception unused) {
                    bXWebview = new BXWebview(this, a3);
                }
                this.f3454a = bXWebview;
                if (this.x) {
                    ((View) this.f3454a).setVerticalScrollBarEnabled(false);
                }
                linearLayout.addView((View) this.f3454a, new ViewGroup.LayoutParams(-1, -1));
                if (!this.J) {
                    this.F = new DownloadCompleteReceiver();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
                    if (Build.VERSION.SDK_INT < 34 || MidBridge.getAndroid14Switch() <= 0) {
                        application = getApplication();
                        application.registerReceiver(this.F, intentFilter);
                    } else {
                        application2 = getApplication();
                        application2.registerReceiver(this.F, intentFilter, 4);
                    }
                } else if (this.p) {
                    this.F = new DownloadCompleteReceiver();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
                    if (Build.VERSION.SDK_INT < 34 || MidBridge.getAndroid14Switch() <= 0) {
                        application = getApplication();
                        application.registerReceiver(this.F, intentFilter);
                    } else {
                        application2 = getApplication();
                        application2.registerReceiver(this.F, intentFilter, 4);
                    }
                }
                this.f3454a.bxSetUp(this, new IUrlVerifyCallback() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
                        if (r12.equalsIgnoreCase(r11.f3455a.d + r11.f3455a.e) != false) goto L_0x0061;
                     */
                    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IUrlVerifyCallback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean shouldOverrideUrlLoading(java.lang.String r12) {
                        /*
                            r11 = this;
                            r0 = 1
                            r1 = 0
                            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.AnonymousClass1.$ipChange
                            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                            if (r3 == 0) goto L_0x001c
                            java.lang.String r3 = "c40e7661"
                            r4 = 2
                            java.lang.Object[] r4 = new java.lang.Object[r4]
                            r4[r1] = r11
                            r4[r0] = r12
                            java.lang.Object r12 = r2.ipc$dispatch(r3, r4)
                            java.lang.Boolean r12 = (java.lang.Boolean) r12
                            boolean r12 = r12.booleanValue()
                            return r12
                        L_0x001c:
                            boolean r2 = android.text.TextUtils.isEmpty(r12)
                            if (r2 != 0) goto L_0x0033
                            int r2 = r12.length()
                            r3 = 1000(0x3e8, float:1.401E-42)
                            if (r2 <= r3) goto L_0x0033
                            java.lang.String r2 = r12.substring(r1, r3)     // Catch: Exception -> 0x0030
                        L_0x002e:
                            r7 = r2
                            goto L_0x0034
                        L_0x0030:
                            java.lang.String r2 = ""
                            goto L_0x002e
                        L_0x0033:
                            r7 = r12
                        L_0x0034:
                            boolean r2 = android.text.TextUtils.isEmpty(r12)
                            if (r2 != 0) goto L_0x009a
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r2 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            java.lang.String r2 = r2.d
                            boolean r2 = r12.equalsIgnoreCase(r2)
                            if (r2 != 0) goto L_0x0061
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            java.lang.String r3 = r3.d
                            r2.append(r3)
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            java.lang.String r3 = r3.e
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            boolean r2 = r12.equalsIgnoreCase(r2)
                            if (r2 == 0) goto L_0x009a
                        L_0x0061:
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            java.lang.String r1 = r1.d
                            boolean r12 = r12.equalsIgnoreCase(r1)
                            if (r12 == 0) goto L_0x0074
                            java.lang.String r12 = "Shouldoverrideurlloading|Uisuccess"
                            r1 = 15
                            r6 = r12
                            r12 = 1
                            r10 = 15
                            goto L_0x007c
                        L_0x0074:
                            r12 = 4
                            java.lang.String r1 = "Shouldoverrideurlloading|UICloseAction"
                            r2 = 16
                            r6 = r1
                            r10 = 16
                        L_0x007c:
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            r1.E = r0
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.d(r1)
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            long r2 = r1.c
                            java.lang.String r4 = "com.alibaba.wireless.security.open.middletier.fc.ui.BXIntentResult4323"
                            r1.a(r2, r4, r12)
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            boolean r9 = r3.k
                            java.lang.String r5 = ""
                            r8 = 0
                            r4 = 0
                            r3.a(r4, r5, r6, r7, r8, r9, r10)
                            return r0
                        L_0x009a:
                            com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.this
                            boolean r9 = r3.k
                            r8 = 0
                            r10 = 17
                            r4 = 0
                            java.lang.String r5 = ""
                            java.lang.String r6 = "Shouldoverrideurlloading|Uifail"
                            r3.a(r4, r5, r6, r7, r8, r9, r10)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.AnonymousClass1.shouldOverrideUrlLoading(java.lang.String):boolean");
                    }
                }, new DownloadSerice());
                this.f3454a.bxLoadUrl(a3);
                a(0, "", "Oncreate|Loadurl", a3, false, this.k, 11);
                if (this.A > 0) {
                    this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.Ext2ContainerActivity.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Ext2ContainerActivity ext2ContainerActivity = Ext2ContainerActivity.this;
                            if (!ext2ContainerActivity.v) {
                                ext2ContainerActivity.E = 3;
                                Ext2ContainerActivity.d(Ext2ContainerActivity.this);
                                Ext2ContainerActivity ext2ContainerActivity2 = Ext2ContainerActivity.this;
                                ext2ContainerActivity2.m = false;
                                ext2ContainerActivity2.a(ext2ContainerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 8);
                                Ext2ContainerActivity ext2ContainerActivity3 = Ext2ContainerActivity.this;
                                ext2ContainerActivity3.a(0, "", "Apitimeout", "onCreate", false, ext2ContainerActivity3.k, 18);
                            }
                        }
                    }, this.A);
                }
            } catch (Exception e3) {
                e = e3;
                str = a3;
                this.k = true;
                String concat = "Oncreate".concat("|Exception");
                a(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, "" + e.getMessage(), concat, str, false, this.k, 12);
                this.E = 2;
                a();
            }
        } catch (Exception e4) {
            e = e4;
            str = "";
            this.k = true;
            String concat2 = "Oncreate".concat("|Exception");
            a(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, "" + e.getMessage(), concat2, str, false, this.k, 12);
            this.E = 2;
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.v = true;
        if (!isFinishing()) {
            a(0, "", "finishActivity", "", false, this.k, 23);
            if (isTaskRoot()) {
                finishAndRemoveTask();
            } else {
                finish();
            }
        }
    }

    public void a(int i, String str, String str2, String str3, boolean z, boolean z2, int i2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b934beaa", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z), new Boolean(z2), new Integer(i2)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        if (z2) {
            j = currentTimeMillis;
            a(z2, 0, str, currentTimeMillis, str2, str3);
        } else {
            j = currentTimeMillis;
        }
        Intent intent = new Intent(IUIBridge.INTENT_SEND_LOG);
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra(IUIBridge.KEY_UI_LOG, "{mn:100155,ec:" + i + ",msg:" + str + ",tc:" + j + ",cp:" + str2 + ",ext:" + str3 + ",sid:" + this.c + ",bxuid:" + this.h + "}");
        intent.putExtra(IUIBridge.KEY_UI_LOG_WAY, 6);
        intent.putExtra(IUIBridge.KEY_UI_LOG_SEND, z);
        intent.putExtra(IUIBridge.KEY_UI_INFO, i2 + "&" + this.h);
        intent.putExtra(IUIBridge.KEY_IS_SAMPLE, this.l);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void a(long j, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ba959d", new Object[]{this, new Long(j), str, new Integer(i)});
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra(IUIBridge.KEY_SESSION_ID, j);
        intent.putExtra(IUIBridge.KEY_UI_RESULT, i);
        intent.putExtra(IUIBridge.KEY_IS_SAMPLE, this.l);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private void a(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af06fc7f", new Object[]{this, window});
            return;
        }
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int height = (int) (defaultDisplay.getHeight() * this.y);
        attributes.width = -1;
        attributes.gravity = 80;
        if (attributes.height != height) {
            attributes.height = height;
            window.setAttributes(attributes);
        }
    }

    public void a(boolean z, int i, String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc6b57", new Object[]{this, new Boolean(z), new Integer(i), str, new Long(j), str2, str3});
        } else if (z) {
            String num = Integer.toString(AbstractC0141.f225);
            String str4 = this.g;
            UserTrackMethodJniBridge.addUtRecord(num, i, 7, str4, j, str, str2, str3, "" + this.c, this.h);
        }
    }

    public static /* synthetic */ boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context);
    }

    public static /* synthetic */ boolean a(Ext2ContainerActivity ext2ContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1937e19", new Object[]{ext2ContainerActivity})).booleanValue() : ext2ContainerActivity.J;
    }
}
