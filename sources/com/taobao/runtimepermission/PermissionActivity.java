package com.taobao.runtimepermission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.runtimepermission.config.RPConfig;
import com.taobao.runtimepermission.view.MongolianView;
import com.taobao.runtimepermission.view.PermissionBizManagerTipLayout;
import com.taobao.runtimepermission.view.PermissionBizReqLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.DialogAction;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.Theme;
import java.io.File;
import java.util.Arrays;
import tb.acq;
import tb.ean;
import tb.he2;
import tb.ij7;
import tb.ndh;
import tb.ok8;
import tb.u71;
import tb.ub1;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PermissionActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback, ok8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PermissionActivity";

    /* renamed from: a  reason: collision with root package name */
    public MongolianView f11498a;
    public PermissionBizReqLayout b;
    public PermissionBizManagerTipLayout c;
    public RelativeLayout d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String[] l;
    public String[] m;
    public int[] n;
    public final Handler o = new Handler();
    public Runnable p = null;
    public Runnable q = null;
    public boolean r = false;
    public final u71.a s = new u71.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBMaterialDialog.SingleButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f11499a;

        public a(String[] strArr) {
            this.f11499a = strArr;
        }

        @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.SingleButtonCallback
        public void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f46d6f", new Object[]{this, tBMaterialDialog, dialogAction});
                return;
            }
            PermissionActivity.a(PermissionActivity.this, this.f11499a);
            tBMaterialDialog.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PermissionActivity.b(PermissionActivity.this).setTranslucent();
            PermissionActivity.b(PermissionActivity.this).invalidate();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f11501a;
        public final /* synthetic */ TranslateAnimation b;

        public c(RelativeLayout relativeLayout, TranslateAnimation translateAnimation) {
            this.f11501a = relativeLayout;
            this.b = translateAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f11501a.startAnimation(this.b);
            this.f11501a.setVisibility(0);
        }
    }

    public static /* synthetic */ void a(PermissionActivity permissionActivity, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994cb2e", new Object[]{permissionActivity, strArr});
        } else {
            permissionActivity.k(strArr);
        }
    }

    public static /* synthetic */ MongolianView b(PermissionActivity permissionActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MongolianView) ipChange.ipc$dispatch("30057cad", new Object[]{permissionActivity});
        }
        return permissionActivity.f11498a;
    }

    public static /* synthetic */ Object ipc$super(PermissionActivity permissionActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/PermissionActivity");
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

    public final void c(String[] strArr, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e23d0e", new Object[]{this, strArr, str, new Boolean(z)});
            return;
        }
        this.s.d(this.i, this.j);
        this.f11498a.setTranslucent();
        if (z) {
            this.f11498a.invalidate();
        }
        o(strArr, str, true);
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a694b3fc", new Object[]{this, strArr, strArr2})).booleanValue();
        }
        if ((strArr == null || strArr.length <= 0) && (strArr2 == null || strArr2.length <= 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r6.equals(tb.t4p.CAMERA) == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.String[] r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.runtimepermission.PermissionActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "58a4da63"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            r0[r1] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L_0x001c:
            int r3 = r6.length
            if (r3 <= r1) goto L_0x0022
            int r6 = com.taobao.taobao.R.drawable.default_permission_img
            return r6
        L_0x0022:
            r6 = r6[r2]
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1888586689: goto L_0x005b;
                case -63024214: goto L_0x0050;
                case 463403621: goto L_0x0047;
                case 1831139720: goto L_0x003c;
                case 1977429404: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r0 = -1
            goto L_0x0065
        L_0x0031:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r0 = 4
            goto L_0x0065
        L_0x003c:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x002f
        L_0x0045:
            r0 = 3
            goto L_0x0065
        L_0x0047:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0065
            goto L_0x002f
        L_0x0050:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0059
            goto L_0x002f
        L_0x0059:
            r0 = 1
            goto L_0x0065
        L_0x005b:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0064
            goto L_0x002f
        L_0x0064:
            r0 = 0
        L_0x0065:
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0074;
                case 2: goto L_0x0071;
                case 3: goto L_0x006e;
                case 4: goto L_0x006b;
                default: goto L_0x0068;
            }
        L_0x0068:
            int r6 = com.taobao.taobao.R.drawable.default_permission_img
            return r6
        L_0x006b:
            int r6 = com.taobao.taobao.R.drawable.contact_permission_img
            return r6
        L_0x006e:
            int r6 = com.taobao.taobao.R.drawable.record_permission_img
            return r6
        L_0x0071:
            int r6 = com.taobao.taobao.R.drawable.camera_permisson_img
            return r6
        L_0x0074:
            int r6 = com.taobao.taobao.R.drawable.location_permission_img
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.runtimepermission.PermissionActivity.f(java.lang.String[]):int");
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
        Handler handler = this.o;
        if (handler != null) {
            Runnable runnable = this.p;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            Runnable runnable2 = this.q;
            if (runnable2 != null) {
                this.o.removeCallbacks(runnable2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r6.equals(tb.t4p.CAMERA) == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.String[] r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.runtimepermission.PermissionActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "6cdc7ead"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            r0[r1] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L_0x001c:
            int r3 = r6.length
            if (r3 <= r1) goto L_0x0022
            int r6 = com.taobao.taobao.R.string.default_title
            return r6
        L_0x0022:
            r6 = r6[r2]
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1888586689: goto L_0x005b;
                case -63024214: goto L_0x0050;
                case 463403621: goto L_0x0047;
                case 1831139720: goto L_0x003c;
                case 1977429404: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r0 = -1
            goto L_0x0065
        L_0x0031:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r0 = 4
            goto L_0x0065
        L_0x003c:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x002f
        L_0x0045:
            r0 = 3
            goto L_0x0065
        L_0x0047:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0065
            goto L_0x002f
        L_0x0050:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0059
            goto L_0x002f
        L_0x0059:
            r0 = 1
            goto L_0x0065
        L_0x005b:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0064
            goto L_0x002f
        L_0x0064:
            r0 = 0
        L_0x0065:
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0074;
                case 2: goto L_0x0071;
                case 3: goto L_0x006e;
                case 4: goto L_0x006b;
                default: goto L_0x0068;
            }
        L_0x0068:
            int r6 = com.taobao.taobao.R.string.default_title
            return r6
        L_0x006b:
            int r6 = com.taobao.taobao.R.string.read_contact_permission_title
            return r6
        L_0x006e:
            int r6 = com.taobao.taobao.R.string.record_permission_title
            return r6
        L_0x0071:
            int r6 = com.taobao.taobao.R.string.camera_permission_title
            return r6
        L_0x0074:
            int r6 = com.taobao.taobao.R.string.location_permission_title
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.runtimepermission.PermissionActivity.g(java.lang.String[]):int");
    }

    public final void h(String[] strArr, boolean z) {
        int[] iArr;
        String[] strArr2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba2623c", new Object[]{this, strArr, new Boolean(z)});
            return;
        }
        String[] strArr3 = this.m;
        if (strArr3 == null || strArr3.length <= 0) {
            iArr = new int[ub1.a(strArr)];
            if (!z) {
                i = -2;
            }
            Arrays.fill(iArr, i);
            strArr2 = strArr;
        } else {
            int a2 = ub1.a(strArr3);
            int a3 = ub1.a(strArr) + a2;
            String[] strArr4 = new String[a3];
            iArr = new int[a3];
            ub1.d(strArr4, this.m, strArr);
            ub1.c(iArr, this.n, 0, a2);
            if (!z) {
                i = -2;
            }
            Arrays.fill(iArr, a2, a3, i);
            strArr2 = strArr4;
        }
        this.s.b(this.g, this.f, strArr, z, this.k, this.h);
        com.taobao.runtimepermission.a.g(this.e, 123, strArr2, iArr);
        finish();
    }

    public final void i(String str, String[] strArr, String[] strArr2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbb0b2f", new Object[]{this, str, strArr, strArr2});
            return;
        }
        int a2 = ub1.a(strArr);
        int a3 = ub1.a(strArr2) + a2;
        String[] strArr3 = new String[a3];
        int[] iArr = new int[a3];
        for (int i2 = 0; i2 < a2; i2++) {
            String str2 = strArr[i2];
            strArr3[i2] = str2;
            iArr[i2] = ContextCompat.checkSelfPermission(this, str2);
        }
        for (int i3 = a2; i3 < a3; i3++) {
            String str3 = strArr2[i3 - a2];
            strArr3[i3] = str3;
            if (he2.b(this, str, str3)) {
                i = 0;
            } else {
                i = -2;
            }
            iArr[i3] = i;
        }
        com.taobao.runtimepermission.a.g(this.e, 123, strArr3, iArr);
        finish();
    }

    public final void j(String str, boolean z, long j, String[] strArr, String[] strArr2, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9021a", new Object[]{this, str, new Boolean(z), new Long(j), strArr, strArr2, str2, new Boolean(z2)});
        } else if (z && !TextUtils.isEmpty(str2)) {
            boolean exists = new File("/data/local/tmp/permission_silence_off").exists();
            if (j < 0) {
                j = ean.h().i().permissionReqSilenceInterval;
            }
            if (exists || this.r || !d(this.g, j, strArr, strArr2)) {
                if (strArr == null || strArr.length <= 0) {
                    c(strArr2, str2, false);
                } else {
                    r(strArr, str2);
                }
                s(this.g, strArr, strArr2);
                return;
            }
            i(str, strArr, strArr2);
        } else if (!n(strArr) || TextUtils.isEmpty(str2)) {
            k(strArr);
        } else {
            this.f11498a.setTranslucent();
            new TBMaterialDialog.Builder(this).positiveText(Localization.q(R.string.app_i_know)).content(str2).theme(Theme.LIGHT).cancelable(false).onPositive(new a(strArr)).show();
        }
    }

    public final void k(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a2692", new Object[]{this, strArr});
            return;
        }
        this.s.d(this.i, this.j);
        try {
            ActivityCompat.requestPermissions(this, strArr, com.taobao.runtimepermission.a.PERMISSION_REQ_CODE);
        } catch (Throwable th) {
            ndh.a("PermissionActivity", "requestSysPermissions error: " + th);
            int[] iArr = new int[strArr.length];
            Arrays.fill(iArr, -1);
            onRequestPermissionsResult(com.taobao.runtimepermission.a.PERMISSION_REQ_CODE, strArr, iArr);
        }
    }

    public final void l(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570fc0df", new Object[]{this, bundle});
            return;
        }
        if (bundle == null || !ij7.c(this)) {
            z = false;
        }
        this.r = z;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968474b", new Object[]{this});
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    public final boolean n(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27900ad3", new Object[]{this, strArr})).booleanValue();
        }
        for (String str : strArr) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, str)) {
                return true;
            }
        }
        return false;
    }

    public final void o(String[] strArr, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0303a9", new Object[]{this, strArr, str, new Boolean(z)});
            return;
        }
        if (z) {
            int g = g(strArr);
            int f = f(strArr);
            this.b.setRationalTitleText(Localization.q(g));
            this.b.setReqPermissionIconImg(f);
            this.b.setRationalText(str);
            this.b.setEventListener(this);
            this.b.showWithAnimation();
        }
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        this.b.setVisibility(0);
        this.b.autoSizeBottomButtonIfNeeded();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            com.taobao.runtimepermission.a.e(this.e, i, i2, intent);
        }
        finish();
    }

    @Override // tb.ok8
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
            h(this.l, false);
        } else if (i == 0) {
            h(this.l, true);
        } else if (i == 10001) {
            p();
        } else if (i == 10003) {
            o(this.l, this.h, false);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i == 1096) {
            if (!this.r || strArr.length != 0 || iArr.length != 0) {
                this.s.c(this.g, this.f, strArr, iArr, this.k, this.h);
                String[] strArr2 = this.l;
                if (strArr2 == null || strArr2.length <= 0) {
                    com.taobao.runtimepermission.a.g(this.e, i, strArr, iArr);
                    finish();
                    return;
                }
                this.m = strArr;
                this.n = iArr;
                c(strArr2, this.h, true);
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c084f01", new Object[]{this});
            return;
        }
        this.c.setEventListener(this);
        this.d.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    public final void q(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47d9e72", new Object[]{this, strArr, str});
            return;
        }
        RelativeLayout relativeLayout = this.d;
        int g = g(strArr);
        int f = f(strArr);
        ((TextView) findViewById(R.id.reason_tips_title)).setText(Localization.q(g));
        ((ImageView) findViewById(R.id.reason_tips_img)).setImageResource(f);
        ((TextView) findViewById(R.id.reason_tips_explain)).setText(str);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        RPConfig i = ean.h().i();
        long j = i.sameScreenMarkDelayTime;
        b bVar = new b();
        this.q = bVar;
        this.o.postDelayed(bVar, j);
        long j2 = i.sameScreenPopDelayTime;
        c cVar = new c(relativeLayout, translateAnimation);
        this.p = cVar;
        this.o.postDelayed(cVar, j2);
    }

    public final void r(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1332f33b", new Object[]{this, strArr, str});
            return;
        }
        k(strArr);
        q(strArr, str);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.runtime_permission_layout);
        m();
        this.f11498a = (MongolianView) findViewById(R.id.mongolian);
        this.b = (PermissionBizReqLayout) findViewById(R.id.biz_permission_request_layout);
        this.c = (PermissionBizManagerTipLayout) findViewById(R.id.manager_permission_info_layout);
        this.d = (RelativeLayout) findViewById(R.id.permission_reason_layout);
        this.f11498a.setTransparent();
        l(bundle);
        String stringExtra = getIntent().getStringExtra("bizName");
        String stringExtra2 = getIntent().getStringExtra("originBizName");
        boolean booleanExtra = getIntent().getBooleanExtra("showRational", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("transparentBackground", false);
        this.e = getIntent().getIntExtra(v4s.PARAM_TASK_ID, -1);
        this.f = stringExtra;
        this.g = stringExtra2;
        this.h = getIntent().getStringExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME);
        this.m = getIntent().getStringArrayExtra("sysPermissions");
        this.l = getIntent().getStringArrayExtra("bizPermissions");
        this.i = getIntent().getStringExtra("pageName");
        this.j = getIntent().getStringExtra("pageUrl");
        this.k = getIntent().getLongExtra(TBRunTimePermission.SILENCE_INTERVAL_NAME, -1L);
        if (e(this.m, this.l)) {
            ndh.a("PermissionActivity", "onCreate: need request permissions is empty, activity finish!");
            finish();
            return;
        }
        String[] strArr = this.m;
        if (strArr == null || strArr.length != 1 || !strArr[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
            j(stringExtra, booleanExtra, this.k, this.m, this.l, this.h, booleanExtra2);
            return;
        }
        startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 123);
    }

    public final void s(String str, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57aec410", new Object[]{this, str, strArr, strArr2});
            return;
        }
        SharedPreferences.Editor edit = getApplication().getSharedPreferences("permission_silence_mark", 0).edit();
        long currentTimeMillis = System.currentTimeMillis();
        if (strArr != null) {
            for (String str2 : strArr) {
                edit.putLong(str + ":" + str2, currentTimeMillis);
            }
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                edit.putLong(str + ":" + str3, currentTimeMillis);
            }
        }
        edit.apply();
    }

    public final boolean d(String str, long j, String[] strArr, String[] strArr2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db62f62", new Object[]{this, str, new Long(j), strArr, strArr2})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = getApplication().getSharedPreferences("permission_silence_mark", 0);
        String str2 = ":";
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str3 = strArr[i2];
                long j2 = sharedPreferences.getLong(str + str2 + str3, -1L);
                if (j2 == -1 || currentTimeMillis - j2 > j * 1000) {
                    i2++;
                    str2 = str2;
                } else {
                    ndh.a("PermissionActivity", "checkInSilencePeriod: permissions req failed, in silence period.");
                    return true;
                }
            }
        }
        if (strArr2 == null) {
            return false;
        }
        int length2 = strArr2.length;
        int i3 = 0;
        while (i3 < length2) {
            String str4 = strArr2[i3];
            long j3 = sharedPreferences.getLong(str + str2 + str4, -1L);
            if (j3 == -1) {
                i = 1;
            } else if (currentTimeMillis - j3 > j * 1000) {
                i = 1;
            } else {
                ndh.a("PermissionActivity", "checkInSilencePeriod: permissions req failed, in silence period.");
                return true;
            }
            i3 += i;
        }
        return false;
    }
}
