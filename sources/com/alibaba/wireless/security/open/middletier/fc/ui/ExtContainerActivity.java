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
public class ExtContainerActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ActivityManager I;
    private boolean H;
    public long f;

    /* renamed from: a  reason: collision with root package name */
    public IBXWebview f3461a = null;
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
    public float x = 1.0f;
    public int y = 0;
    public volatile int z = 0;
    public volatile int A = 0;
    public volatile int B = 0;
    public volatile int C = 0;
    private DownloadCompleteReceiver D = null;
    private long E = -1;
    private int F = 0;
    private String G = null;

    static {
        t2o.a(659554405);
    }

    public ExtContainerActivity() {
        boolean z = false;
        this.H = MidBridge.getWvmlfcdmSwitch() > 0 ? true : z;
    }

    public static /* synthetic */ int a(ExtContainerActivity extContainerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13623869", new Object[]{extContainerActivity, new Integer(i)})).intValue();
        }
        extContainerActivity.F = i;
        return i;
    }

    public static /* synthetic */ int b(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("208f2261", new Object[]{extContainerActivity})).intValue() : extContainerActivity.F;
    }

    public static /* synthetic */ long c(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27b804a3", new Object[]{extContainerActivity})).longValue();
        }
        return extContainerActivity.E;
    }

    public static /* synthetic */ void d(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0e6f0", new Object[]{extContainerActivity});
        } else {
            extContainerActivity.a();
        }
    }

    public static /* synthetic */ void e(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3609c931", new Object[]{extContainerActivity});
        } else {
            extContainerActivity.b();
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

    public static /* synthetic */ Object ipc$super(ExtContainerActivity extContainerActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/ExtContainerActivity");
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
        if (this.l && this.A == 0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.B == 0) {
                        this.B = 1;
                    }
                } else if (this.A == 0) {
                    this.A = 1;
                    a(0, "", "Dispatchtouchevent", "" + this.z + "" + this.B + "" + this.A, false, true, 21);
                }
            } else if (this.z == 0) {
                this.z = 1;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (!this.m) {
            super.onBackPressed();
            this.C = 4;
            a();
            a(this.c, IUIBridge.INTENT_ACTIVITY_RESULT, 4);
            a(0, "", "Onbackpressed", "" + this.m, false, this.k, 19);
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
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.$ipChange
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
            com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview r2 = r12.f3461a
            if (r2 == 0) goto L_0x0023
            r2.bxDestroy()     // Catch: Exception -> 0x0022
            r2 = 0
            r12.f3461a = r2     // Catch: Exception -> 0x0022
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            boolean r2 = r12.H
            if (r2 == 0) goto L_0x003c
            boolean r2 = r12.p
            if (r2 == 0) goto L_0x004c
            boolean r2 = r12.t
            if (r2 == 0) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r2 = r12.D     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
        L_0x0037:
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r3 = r12.D     // Catch: Exception -> 0x003a
            goto L_0x0049
        L_0x003a:
            goto L_0x004c
        L_0x003c:
            boolean r2 = r12.t
            if (r2 != r1) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity$DownloadCompleteReceiver r2 = r12.D     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
            goto L_0x0037
        L_0x0049:
            r2.unregisterReceiver(r3)     // Catch: Exception -> 0x003a
        L_0x004c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ondestroy"
            r2.<init>(r3)
            int r3 = r12.C
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            int r2 = r12.C
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.onDestroy():void");
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
            t2o.a(659554409);
        }

        private DownloadCompleteReceiver() {
        }

        public static /* synthetic */ Object ipc$super(DownloadCompleteReceiver downloadCompleteReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/ExtContainerActivity$DownloadCompleteReceiver");
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
                    if (longExtra == ExtContainerActivity.c(ExtContainerActivity.this) && "android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                        ExtContainerActivity extContainerActivity = ExtContainerActivity.this;
                        if (extContainerActivity.r) {
                            extContainerActivity.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                        } else if (extContainerActivity.u) {
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
                                ExtContainerActivity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                                uri = null;
                            }
                            if (uri != null) {
                                intent2.setDataAndType(uri, mimeTypeForDownloadedFile);
                                ExtContainerActivity.this.startActivity(intent2);
                            }
                        }
                    }
                } catch (Exception e) {
                    ExtContainerActivity.this.a(true, 2305, "", 0L, e.getMessage(), "");
                }
            }
            ExtContainerActivity extContainerActivity2 = ExtContainerActivity.this;
            boolean z = extContainerActivity2.k;
            extContainerActivity2.a(z, 0, "", 0L, "onReceive", "" + ExtContainerActivity.c(ExtContainerActivity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DownloadSerice implements IBXWebview.IBXDownloadService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554410);
            t2o.a(659554413);
        }

        private DownloadSerice() {
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview.IBXDownloadService
        public long startDownload(String str, String str2) {
            int i;
            Exception e;
            ExtContainerActivity extContainerActivity;
            AlertDialog.Builder positiveButton;
            String str3;
            ExtContainerActivity extContainerActivity2;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("181c5f19", new Object[]{this, str, str2})).longValue();
            }
            try {
                Context applicationContext = ExtContainerActivity.this.getApplicationContext();
                ExtContainerActivity extContainerActivity3 = ExtContainerActivity.this;
                extContainerActivity3.i = str;
                extContainerActivity3.j = str2;
                if (!ExtContainerActivity.a(extContainerActivity3)) {
                    ExtContainerActivity.a(ExtContainerActivity.this, applicationContext.getApplicationInfo().targetSdkVersion);
                    if (ExtContainerActivity.b(ExtContainerActivity.this) < 33) {
                        extContainerActivity2 = ExtContainerActivity.this;
                        str3 = Environment.DIRECTORY_DOWNLOADS;
                    } else {
                        File externalCacheDir = applicationContext.getExternalCacheDir();
                        ExtContainerActivity extContainerActivity4 = ExtContainerActivity.this;
                        str3 = externalCacheDir.getAbsolutePath();
                        extContainerActivity2 = extContainerActivity4;
                    }
                    ExtContainerActivity.a(extContainerActivity2, str3);
                }
                extContainerActivity = ExtContainerActivity.this;
            } catch (Exception e2) {
                e = e2;
                i2 = 0;
            }
            if (extContainerActivity.n) {
                final HashMap<String, String> installedMarketPackageName = AppStoreUtils.getInstalledMarketPackageName(extContainerActivity);
                i2 = installedMarketPackageName.size();
                try {
                } catch (Exception e3) {
                    e = e3;
                    ExtContainerActivity.this.a(true, 2304, "", 0L, e.getMessage(), "");
                    i = 0;
                    ExtContainerActivity extContainerActivity5 = ExtContainerActivity.this;
                    boolean z = extContainerActivity5.k;
                    extContainerActivity5.a(z, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i2 + "|" + i + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
                    return ExtContainerActivity.c(ExtContainerActivity.this);
                }
                if (installedMarketPackageName.size() > 1) {
                    final String[] strArr = new String[installedMarketPackageName.size()];
                    int i3 = 0;
                    for (String str4 : installedMarketPackageName.keySet()) {
                        i3++;
                        strArr[i3] = str4;
                    }
                    positiveButton = new AlertDialog.Builder(ExtContainerActivity.this).setTitle(R.string.sg_app_store_select).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.DownloadSerice.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                                return;
                            }
                            ExtContainerActivity extContainerActivity6 = ExtContainerActivity.this;
                            AppStoreUtils.toMarket(extContainerActivity6, ExtContainerActivity.getPackageNameWrapper(extContainerActivity6), (String) installedMarketPackageName.get(strArr[i4]));
                        }
                    });
                } else if (installedMarketPackageName.size() == 1) {
                    ExtContainerActivity extContainerActivity6 = ExtContainerActivity.this;
                    AppStoreUtils.toMarket(extContainerActivity6, ExtContainerActivity.getPackageNameWrapper(extContainerActivity6), installedMarketPackageName.get(installedMarketPackageName.keySet().iterator().next()));
                    i = 0;
                    ExtContainerActivity extContainerActivity52 = ExtContainerActivity.this;
                    boolean z2 = extContainerActivity52.k;
                    extContainerActivity52.a(z2, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i2 + "|" + i + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
                    return ExtContainerActivity.c(ExtContainerActivity.this);
                } else {
                    extContainerActivity = ExtContainerActivity.this;
                    if (!extContainerActivity.p) {
                        positiveButton = new AlertDialog.Builder(ExtContainerActivity.this).setMessage(R.string.sg_app_store_not_exist).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null);
                    }
                }
                positiveButton.create().show();
                i = 0;
                ExtContainerActivity extContainerActivity522 = ExtContainerActivity.this;
                boolean z22 = extContainerActivity522.k;
                extContainerActivity522.a(z22, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i2 + "|" + i + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
                return ExtContainerActivity.c(ExtContainerActivity.this);
            }
            if (extContainerActivity.o) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse(str));
                ExtContainerActivity.this.startActivity(intent);
            } else if (extContainerActivity.p) {
                i2 = 0;
            }
            i = 0;
            ExtContainerActivity extContainerActivity5222 = ExtContainerActivity.this;
            boolean z222 = extContainerActivity5222.k;
            extContainerActivity5222.a(z222, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i2 + "|" + i + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
            return ExtContainerActivity.c(ExtContainerActivity.this);
            i = ExtContainerActivity.a(extContainerActivity, str, str2);
            ExtContainerActivity extContainerActivity52222 = ExtContainerActivity.this;
            boolean z2222 = extContainerActivity52222.k;
            extContainerActivity52222.a(z2222, 0, "", 0L, "startDownload", ExtContainerActivity.c(ExtContainerActivity.this) + "|" + i2 + "|" + i + "|" + ExtContainerActivity.this.n + "|" + ExtContainerActivity.this.o + "|" + ExtContainerActivity.this.p);
            return ExtContainerActivity.c(ExtContainerActivity.this);
        }
    }

    public static /* synthetic */ int a(ExtContainerActivity extContainerActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9829a2b4", new Object[]{extContainerActivity, str, str2})).intValue() : extContainerActivity.a(str, str2);
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
        request.setDestinationInExternalPublicDir(this.H ? Environment.DIRECTORY_DOWNLOADS : this.G, URLUtil.guessFileName(str, str2, getMIMEType(str)));
        DownloadManager downloadManager = (DownloadManager) getSystemService("download");
        if (this.q) {
            Toast.makeText(this, "开始下载更新包", 0).show();
        }
        long enqueue = downloadManager.enqueue(request);
        this.E = enqueue;
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
            this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ExtContainerActivity extContainerActivity = ExtContainerActivity.this;
                    if (!extContainerActivity.v && ExtContainerActivity.a((Context) extContainerActivity)) {
                        ExtContainerActivity.this.C = 5;
                        ExtContainerActivity extContainerActivity2 = ExtContainerActivity.this;
                        extContainerActivity2.a(extContainerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 1);
                        ExtContainerActivity.e(ExtContainerActivity.this);
                        ExtContainerActivity extContainerActivity3 = ExtContainerActivity.this;
                        extContainerActivity3.a(0, "", "onPause", "", false, extContainerActivity3.k, 20);
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

    private int a(String str, String str2) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        boolean z = this.H;
        if ((!z || Build.VERSION.SDK_INT >= 29) && (z || this.F >= 33)) {
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

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!isFinishing()) {
            finish();
        }
    }

    public static /* synthetic */ String a(ExtContainerActivity extContainerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b7700c9", new Object[]{extContainerActivity, str});
        }
        extContainerActivity.G = str;
        return str;
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
            return str.replace(query, sb.toString());
        }
        sb.append(str);
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        sb.append("tmd_nc=1");
        return sb.toString();
    }

    private static boolean b(Context context) {
        ComponentName componentName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            if (I == null) {
                I = (ActivityManager) context.getSystemService("activity");
            }
            ActivityManager activityManager = I;
            if (activityManager != null) {
                String packageName = context.getPackageName();
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && runningTasks.size() > 0) {
                    componentName = runningTasks.get(0).topActivity;
                    if (!packageName.equals(componentName.getPackageName()) || !context.getPackageManager().getActivityInfo(componentName, 0).processName.equals(context.getApplicationInfo().processName)) {
                        return false;
                    }
                    if (!ExtContainerActivity.class.getName().equals(componentName.getClassName())) {
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

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.v = true;
        if (isFinishing()) {
            return;
        }
        if (isTaskRoot()) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Exception e;
        int i;
        IBXWebview bXWebview;
        IntentFilter intentFilter;
        Application application;
        Application application2;
        boolean z = false;
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
            this.y = intent.getIntExtra("apiTimeOut", 0);
            this.x = intent.getFloatExtra("windowHeight", 1.0f);
            this.w = intent.getIntExtra("closeOverLaySw", 0);
            try {
                Display defaultDisplay = getWindowManager().getDefaultDisplay();
                Window window = getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = (int) (defaultDisplay.getHeight() * this.x);
                attributes.gravity = 80;
                window.setAttributes(attributes);
                i = -1;
            } catch (Exception e2) {
                i = -1;
                b(true, 2306, "", 0L, e2.getMessage(), "");
            }
            String[] split = intent.getStringExtra("downloadConfig").split(SymbolExpUtil.SYMBOL_VERTICALBAR, i);
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
                if (Integer.valueOf(split[7]).intValue() > 0) {
                    z = true;
                }
                this.t = z;
            }
            String a2 = a(intent.getStringExtra("location"));
            try {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i));
                setContentView(linearLayout);
                try {
                    IpChange ipChange2 = WVUCWebView.$ipChange;
                    bXWebview = new BXWVWebview(this, a2);
                } catch (Exception unused) {
                    bXWebview = new BXWebview(this, a2);
                }
                this.f3461a = bXWebview;
                linearLayout.addView((View) this.f3461a, new ViewGroup.LayoutParams(i, i));
                if (!this.H) {
                    this.D = new DownloadCompleteReceiver();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
                    if (Build.VERSION.SDK_INT < 34 || MidBridge.getAndroid14Switch() <= 0) {
                        application = getApplication();
                        application.registerReceiver(this.D, intentFilter);
                    } else {
                        application2 = getApplication();
                        application2.registerReceiver(this.D, intentFilter, 4);
                    }
                } else if (this.p) {
                    this.D = new DownloadCompleteReceiver();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
                    if (Build.VERSION.SDK_INT < 34 || MidBridge.getAndroid14Switch() <= 0) {
                        application = getApplication();
                        application.registerReceiver(this.D, intentFilter);
                    } else {
                        application2 = getApplication();
                        application2.registerReceiver(this.D, intentFilter, 4);
                    }
                }
                this.f3461a.bxSetUp(this, new IUrlVerifyCallback() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
                        if (r12.equalsIgnoreCase(r11.f3462a.d + r11.f3462a.e) != false) goto L_0x0061;
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
                            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.AnonymousClass1.$ipChange
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
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r2 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            java.lang.String r2 = r2.d
                            boolean r2 = r12.equalsIgnoreCase(r2)
                            if (r2 != 0) goto L_0x0061
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            java.lang.String r3 = r3.d
                            r2.append(r3)
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            java.lang.String r3 = r3.e
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            boolean r2 = r12.equalsIgnoreCase(r2)
                            if (r2 == 0) goto L_0x009a
                        L_0x0061:
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
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
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            r1.C = r0
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.d(r1)
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r1 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            long r2 = r1.c
                            java.lang.String r4 = "com.alibaba.wireless.security.open.middletier.fc.ui.BXIntentResult4323"
                            r1.a(r2, r4, r12)
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            boolean r9 = r3.k
                            java.lang.String r5 = ""
                            r8 = 0
                            r4 = 0
                            r3.a(r4, r5, r6, r7, r8, r9, r10)
                            return r0
                        L_0x009a:
                            com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity r3 = com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.this
                            boolean r9 = r3.k
                            r8 = 0
                            r10 = 17
                            r4 = 0
                            java.lang.String r5 = ""
                            java.lang.String r6 = "Shouldoverrideurlloading|Uifail"
                            r3.a(r4, r5, r6, r7, r8, r9, r10)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.AnonymousClass1.shouldOverrideUrlLoading(java.lang.String):boolean");
                    }
                }, new DownloadSerice());
                this.f3461a.bxLoadUrl(a2);
                a(0, "", "Oncreate|Loadurl", a2, false, this.k, 11);
                if (this.y > 0) {
                    this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ExtContainerActivity.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            ExtContainerActivity extContainerActivity = ExtContainerActivity.this;
                            if (!extContainerActivity.v) {
                                extContainerActivity.C = 3;
                                ExtContainerActivity.d(ExtContainerActivity.this);
                                ExtContainerActivity extContainerActivity2 = ExtContainerActivity.this;
                                extContainerActivity2.m = false;
                                extContainerActivity2.a(extContainerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 8);
                                ExtContainerActivity extContainerActivity3 = ExtContainerActivity.this;
                                extContainerActivity3.a(0, "", "Apitimeout", "onCreate", false, extContainerActivity3.k, 18);
                            }
                        }
                    }, this.y);
                }
            } catch (Exception e3) {
                e = e3;
                str = a2;
                this.k = true;
                String concat = "Oncreate".concat("|Exception");
                a(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, "" + e.getMessage(), concat, str, false, this.k, 12);
                this.C = 2;
                a();
            }
        } catch (Exception e4) {
            e = e4;
            str = "";
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

    public static /* synthetic */ boolean a(ExtContainerActivity extContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19664031", new Object[]{extContainerActivity})).booleanValue() : extContainerActivity.H;
    }
}
