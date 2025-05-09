package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
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
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
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
import tb.acq;
import tb.t2o;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ContainerActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ActivityManager I;
    private IntentFilter C;
    private boolean H;
    public long f;

    /* renamed from: a  reason: collision with root package name */
    public IBXWebview f3447a = null;
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
    public int x = 0;
    public volatile int y = 0;
    public volatile int z = 0;
    public volatile int A = 0;
    public volatile int B = 0;
    private DownloadCompleteReceiver D = null;
    private long E = -1;
    private int F = 0;
    private String G = null;

    static {
        t2o.a(659554391);
    }

    public ContainerActivity() {
        boolean z = false;
        this.H = MidBridge.getWvmlfcdmSwitch() > 0 ? true : z;
    }

    public static /* synthetic */ int a(ContainerActivity containerActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3939f332", new Object[]{containerActivity, new Integer(i)})).intValue();
        }
        containerActivity.F = i;
        return i;
    }

    public static /* synthetic */ int b(ContainerActivity containerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfceb596", new Object[]{containerActivity})).intValue() : containerActivity.F;
    }

    public static /* synthetic */ long c(ContainerActivity containerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e5e2f6", new Object[]{containerActivity})).longValue();
        }
        return containerActivity.E;
    }

    public static /* synthetic */ void d(ContainerActivity containerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fd1061", new Object[]{containerActivity});
        } else {
            containerActivity.a();
        }
    }

    public static /* synthetic */ void e(ContainerActivity containerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86143dc0", new Object[]{containerActivity});
        } else {
            containerActivity.b();
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

    public static /* synthetic */ Object ipc$super(ContainerActivity containerActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/ContainerActivity");
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
        if (this.l && this.z == 0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.A == 0) {
                        this.A = 1;
                    }
                } else if (this.z == 0) {
                    this.z = 1;
                    a(0, "", "Dispatchtouchevent", "" + this.y + "" + this.A + "" + this.z, false, true, 21);
                }
            } else if (this.y == 0) {
                this.y = 1;
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
            this.B = 4;
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
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity.$ipChange
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
            com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview r2 = r12.f3447a
            if (r2 == 0) goto L_0x0023
            r2.bxDestroy()     // Catch: Exception -> 0x0022
            r2 = 0
            r12.f3447a = r2     // Catch: Exception -> 0x0022
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            boolean r2 = r12.H
            if (r2 == 0) goto L_0x003c
            boolean r2 = r12.p
            if (r2 == 0) goto L_0x004c
            boolean r2 = r12.t
            if (r2 == 0) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity$DownloadCompleteReceiver r2 = r12.D     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
        L_0x0037:
            com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity$DownloadCompleteReceiver r3 = r12.D     // Catch: Exception -> 0x003a
            goto L_0x0049
        L_0x003a:
            goto L_0x004c
        L_0x003c:
            boolean r2 = r12.t
            if (r2 != r1) goto L_0x004c
            com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity$DownloadCompleteReceiver r2 = r12.D     // Catch: Exception -> 0x003a
            if (r2 == 0) goto L_0x004c
            android.app.Application r2 = r12.getApplication()     // Catch: Exception -> 0x003a
            goto L_0x0037
        L_0x0049:
            r2.unregisterReceiver(r3)     // Catch: Exception -> 0x003a
        L_0x004c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ondestroy"
            r2.<init>(r3)
            int r3 = r12.B
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            int r2 = r12.B
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity.onDestroy():void");
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
            t2o.a(659554395);
        }

        private DownloadCompleteReceiver() {
        }

        public static /* synthetic */ Object ipc$super(DownloadCompleteReceiver downloadCompleteReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/ContainerActivity$DownloadCompleteReceiver");
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
                    if (longExtra == ContainerActivity.c(ContainerActivity.this) && "android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                        ContainerActivity containerActivity = ContainerActivity.this;
                        if (containerActivity.r) {
                            containerActivity.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                        } else if (containerActivity.u) {
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
                                ContainerActivity.this.startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
                                uri = null;
                            }
                            if (uri != null) {
                                intent2.setDataAndType(uri, mimeTypeForDownloadedFile);
                                ContainerActivity.this.startActivity(intent2);
                            }
                        }
                    }
                } catch (Exception e) {
                    ContainerActivity.this.a(true, 2305, "", 0L, e.getMessage(), "");
                }
            }
            ContainerActivity containerActivity2 = ContainerActivity.this;
            boolean z = containerActivity2.k;
            containerActivity2.a(z, 0, "", 0L, "onReceive", "" + ContainerActivity.c(ContainerActivity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DownloadSerice implements IBXWebview.IBXDownloadService {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554396);
            t2o.a(659554413);
        }

        private DownloadSerice() {
        }

        @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IBXWebview.IBXDownloadService
        public long startDownload(String str, String str2) {
            int i;
            Exception e;
            ContainerActivity containerActivity;
            AlertDialog.Builder positiveButton;
            String str3;
            ContainerActivity containerActivity2;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("181c5f19", new Object[]{this, str, str2})).longValue();
            }
            try {
                Context applicationContext = ContainerActivity.this.getApplicationContext();
                ContainerActivity containerActivity3 = ContainerActivity.this;
                containerActivity3.i = str;
                containerActivity3.j = str2;
                if (!ContainerActivity.a(containerActivity3)) {
                    ContainerActivity.a(ContainerActivity.this, applicationContext.getApplicationInfo().targetSdkVersion);
                    if (ContainerActivity.b(ContainerActivity.this) < 33) {
                        containerActivity2 = ContainerActivity.this;
                        str3 = Environment.DIRECTORY_DOWNLOADS;
                    } else {
                        File externalCacheDir = applicationContext.getExternalCacheDir();
                        ContainerActivity containerActivity4 = ContainerActivity.this;
                        str3 = externalCacheDir.getAbsolutePath();
                        containerActivity2 = containerActivity4;
                    }
                    ContainerActivity.a(containerActivity2, str3);
                }
                containerActivity = ContainerActivity.this;
            } catch (Exception e2) {
                e = e2;
                i2 = 0;
            }
            if (containerActivity.n) {
                final HashMap<String, String> installedMarketPackageName = AppStoreUtils.getInstalledMarketPackageName(containerActivity);
                i2 = installedMarketPackageName.size();
                try {
                } catch (Exception e3) {
                    e = e3;
                    ContainerActivity.this.a(true, 2304, "", 0L, e.getMessage(), "");
                    i = 0;
                    ContainerActivity containerActivity5 = ContainerActivity.this;
                    boolean z = containerActivity5.k;
                    containerActivity5.a(z, 0, "", 0L, "startDownload", ContainerActivity.c(ContainerActivity.this) + "|" + i2 + "|" + i + "|" + ContainerActivity.this.n + "|" + ContainerActivity.this.o + "|" + ContainerActivity.this.p);
                    return ContainerActivity.c(ContainerActivity.this);
                }
                if (installedMarketPackageName.size() > 1) {
                    final String[] strArr = new String[installedMarketPackageName.size()];
                    int i3 = 0;
                    for (String str4 : installedMarketPackageName.keySet()) {
                        i3++;
                        strArr[i3] = str4;
                    }
                    positiveButton = new AlertDialog.Builder(ContainerActivity.this).setTitle(R.string.sg_app_store_select).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity.DownloadSerice.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                                return;
                            }
                            ContainerActivity containerActivity6 = ContainerActivity.this;
                            AppStoreUtils.toMarket(containerActivity6, ContainerActivity.getPackageNameWrapper(containerActivity6), (String) installedMarketPackageName.get(strArr[i4]));
                        }
                    });
                } else if (installedMarketPackageName.size() == 1) {
                    ContainerActivity containerActivity6 = ContainerActivity.this;
                    AppStoreUtils.toMarket(containerActivity6, ContainerActivity.getPackageNameWrapper(containerActivity6), installedMarketPackageName.get(installedMarketPackageName.keySet().iterator().next()));
                    i = 0;
                    ContainerActivity containerActivity52 = ContainerActivity.this;
                    boolean z2 = containerActivity52.k;
                    containerActivity52.a(z2, 0, "", 0L, "startDownload", ContainerActivity.c(ContainerActivity.this) + "|" + i2 + "|" + i + "|" + ContainerActivity.this.n + "|" + ContainerActivity.this.o + "|" + ContainerActivity.this.p);
                    return ContainerActivity.c(ContainerActivity.this);
                } else {
                    containerActivity = ContainerActivity.this;
                    if (!containerActivity.p) {
                        positiveButton = new AlertDialog.Builder(ContainerActivity.this).setMessage(R.string.sg_app_store_not_exist).setPositiveButton(R.string.sg_dialog_ok, (DialogInterface.OnClickListener) null);
                    }
                }
                positiveButton.create().show();
                i = 0;
                ContainerActivity containerActivity522 = ContainerActivity.this;
                boolean z22 = containerActivity522.k;
                containerActivity522.a(z22, 0, "", 0L, "startDownload", ContainerActivity.c(ContainerActivity.this) + "|" + i2 + "|" + i + "|" + ContainerActivity.this.n + "|" + ContainerActivity.this.o + "|" + ContainerActivity.this.p);
                return ContainerActivity.c(ContainerActivity.this);
            }
            if (containerActivity.o) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse(str));
                ContainerActivity.this.startActivity(intent);
            } else if (containerActivity.p) {
                i2 = 0;
            }
            i = 0;
            ContainerActivity containerActivity5222 = ContainerActivity.this;
            boolean z222 = containerActivity5222.k;
            containerActivity5222.a(z222, 0, "", 0L, "startDownload", ContainerActivity.c(ContainerActivity.this) + "|" + i2 + "|" + i + "|" + ContainerActivity.this.n + "|" + ContainerActivity.this.o + "|" + ContainerActivity.this.p);
            return ContainerActivity.c(ContainerActivity.this);
            i = ContainerActivity.a(containerActivity, str, str2);
            ContainerActivity containerActivity52222 = ContainerActivity.this;
            boolean z2222 = containerActivity52222.k;
            containerActivity52222.a(z2222, 0, "", 0L, "startDownload", ContainerActivity.c(ContainerActivity.this) + "|" + i2 + "|" + i + "|" + ContainerActivity.this.n + "|" + ContainerActivity.this.o + "|" + ContainerActivity.this.p);
            return ContainerActivity.c(ContainerActivity.this);
        }
    }

    public static /* synthetic */ int a(ContainerActivity containerActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df8aeb4b", new Object[]{containerActivity, str, str2})).intValue() : containerActivity.a(str, str2);
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
            this.b.postDelayed(new Runnable() { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ContainerActivity containerActivity = ContainerActivity.this;
                    if (!containerActivity.v && ContainerActivity.a((Context) containerActivity)) {
                        ContainerActivity.this.B = 5;
                        ContainerActivity containerActivity2 = ContainerActivity.this;
                        containerActivity2.a(containerActivity2.c, IUIBridge.INTENT_ACTIVITY_RESULT, 1);
                        ContainerActivity.e(ContainerActivity.this);
                        ContainerActivity containerActivity3 = ContainerActivity.this;
                        containerActivity3.a(0, "", "onPause", "", false, containerActivity3.k, 20);
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
            a(0, "", "finishCurrentActivity", "", false, this.k, 23);
            finish();
        }
    }

    public static /* synthetic */ String a(ContainerActivity containerActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70ec952", new Object[]{containerActivity, str});
        }
        containerActivity.G = str;
        return str;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        hashMap.put("url", str);
        hashMap.put("destroyState", String.valueOf(this.B));
        UserTrackMethodJniBridge.addCustomRecord("Page_SGFC", 19999, "FC_onCreate", "", "", hashMap);
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
                    if (!ContainerActivity.class.getName().equals(componentName.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0221  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.fc.ui.ContainerActivity.onCreate(android.os.Bundle):void");
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

    public static /* synthetic */ boolean a(ContainerActivity containerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7db78848", new Object[]{containerActivity})).booleanValue() : containerActivity.H;
    }
}
