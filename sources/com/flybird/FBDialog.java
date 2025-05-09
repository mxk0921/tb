package com.flybird;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBDialog extends FBView implements DialogInterface.OnKeyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AlertDialog A;
    public FrameLayout B;
    public LinearLayout C = null;
    public boolean D = false;
    public String E;

    public FBDialog(Context context, View view, FBDocument fBDocument) {
        super(context, null, fBDocument);
        this.B = null;
        FrameLayout frameLayout = new FrameLayout(context);
        this.B = frameLayout;
        this.v.gravity = 17;
        frameLayout.addView(getInnerView());
    }

    public static /* synthetic */ Object ipc$super(FBDialog fBDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1807346616:
                super.updateFunc((String) objArr[0], (String) objArr[1]);
                return null;
            case 663633004:
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBDialog");
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.A.isShowing()) {
                Context context = this.A.getContext();
                if ((context instanceof ContextThemeWrapper) && (((ContextThemeWrapper) context).getBaseContext() instanceof Activity)) {
                    Activity activity = (Activity) ((ContextThemeWrapper) context).getBaseContext();
                    if (!activity.isFinishing() && !activity.isDestroyed()) {
                        this.A.dismiss();
                    }
                }
            }
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (this.A != null) {
            d();
            this.A = null;
            this.mDoc.X = null;
        }
        this.B = null;
        this.C = null;
        super.doDestroy();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
        }
        if (isDestroyed() || onKey(getInnerView(), i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
        } else if (str != null && !isDestroyed()) {
            super.updateAttr(str, str2);
            if (str.equals("type")) {
                this.E = str2;
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (TextUtils.equals(str, "event") && TextUtils.equals(str2, "onkeydown")) {
            this.D = true;
            AlertDialog alertDialog = this.A;
            if (alertDialog != null) {
                alertDialog.setOnKeyListener(this);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (getInnerView() != null && getInnerView().getContext() != null) {
            Context context = getInnerView().getContext();
            if (!TextUtils.isEmpty(this.E)) {
                FBLogger.w(FBView.TAG, "showDialog: dlgType is not empty, not for shown. dlgType=" + this.E);
            } else if (this.A == null) {
                if (!(context instanceof Activity)) {
                    Context context2 = this.mDoc.getContext();
                    if (context2 instanceof Activity) {
                        context = context2;
                    }
                }
                LinearLayout linearLayout = new LinearLayout(context);
                this.C = linearLayout;
                linearLayout.setOrientation(1);
                this.C.setId(ResUtils.getId(this.mDoc.k, "dialog_linear_layout"));
                this.B.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                this.C.addView(this.B);
                if (UiUtil.isOppoDevice()) {
                    AlertDialog create = new AlertDialog.Builder(context, 16973940).create();
                    this.A = create;
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } else {
                    this.A = new AlertDialog.Builder(context).create();
                }
                if (this.D) {
                    this.A.setOnKeyListener(this);
                }
                this.A.setCanceledOnTouchOutside(false);
                this.A.show();
                this.A.getWindow().setSoftInputMode(3);
                this.A.getWindow().clearFlags(131080);
                this.A.getWindow().setLayout(-1, -1);
                this.A.getWindow().setGravity(17);
                this.A.setContentView(this.C);
                this.mDoc.X = this.A;
            } else if ((context instanceof Activity) && !((Activity) context).isFinishing() && !this.A.isShowing()) {
                this.A.show();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:10:0x0024, B:15:0x0033, B:20:0x003f, B:27:0x004f, B:29:0x0053, B:31:0x0059, B:33:0x005d, B:35:0x0061, B:37:0x0065, B:38:0x0079), top: B:41:0x0024 }] */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateFunc(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.flybird.FBDialog.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "94461448"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            if (r6 == 0) goto L_0x0082
            boolean r2 = r5.isDestroyed()
            if (r2 == 0) goto L_0x0021
            goto L_0x0082
        L_0x0021:
            super.updateFunc(r6, r7)
            int r7 = r6.hashCode()     // Catch: all -> 0x003d
            r2 = -1920105040(0xffffffff8d8d85b0, float:-8.72198E-31)
            if (r7 == r2) goto L_0x003f
            r1 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r7 == r1) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            java.lang.String r7 = "close"
            boolean r6 = r6.equals(r7)     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x003d:
            r6 = move-exception
            goto L_0x007d
        L_0x003f:
            java.lang.String r7 = "showModal"
            boolean r6 = r6.equals(r7)     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            if (r1 == 0) goto L_0x0079
            if (r1 == r0) goto L_0x004f
            goto L_0x0082
        L_0x004f:
            android.app.AlertDialog r6 = r5.A     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0082
            boolean r6 = r6.isShowing()     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0082
            android.widget.LinearLayout r6 = r5.C     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0082
            android.widget.FrameLayout r6 = r5.B     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0082
            com.flybird.FBDocument r6 = r5.mDoc     // Catch: all -> 0x003d
            if (r6 == 0) goto L_0x0082
            r5.d()     // Catch: all -> 0x003d
            android.widget.LinearLayout r6 = r5.C     // Catch: all -> 0x003d
            android.widget.FrameLayout r7 = r5.B     // Catch: all -> 0x003d
            r6.removeView(r7)     // Catch: all -> 0x003d
            com.flybird.FBDocument r6 = r5.mDoc     // Catch: all -> 0x003d
            r7 = 0
            r6.X = r7     // Catch: all -> 0x003d
            r5.C = r7     // Catch: all -> 0x003d
            r5.A = r7     // Catch: all -> 0x003d
            goto L_0x0082
        L_0x0079:
            r5.e()     // Catch: all -> 0x003d
            goto L_0x0082
        L_0x007d:
            java.lang.String r7 = "FBView"
            com.alipay.birdnest.util.FBLogger.e(r7, r6)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBDialog.updateFunc(java.lang.String, java.lang.String):void");
    }
}
