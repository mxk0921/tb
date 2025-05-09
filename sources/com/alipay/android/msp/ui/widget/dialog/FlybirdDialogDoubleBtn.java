package com.alipay.android.msp.ui.widget.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.HtmlParse;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FlybirdDialogDoubleBtn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3740a;
    public String b;
    public String c;
    public String d;
    public DialogInterface.OnClickListener e;
    public DialogInterface.OnClickListener f;
    public TextView g;
    public TextView h;
    public Button i;
    public Button j;
    public LinearLayout k;
    public long l;
    public final boolean m;
    public final Context n;

    public FlybirdDialogDoubleBtn(Context context) {
        super(context);
        this.n = context;
        this.m = FlybirdDialogImpl.antDialogEnable(context);
    }

    public static /* synthetic */ long access$000(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc129408", new Object[]{flybirdDialogDoubleBtn})).longValue();
        }
        return flybirdDialogDoubleBtn.l;
    }

    public static /* synthetic */ long access$002(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38012662", new Object[]{flybirdDialogDoubleBtn, new Long(j)})).longValue();
        }
        flybirdDialogDoubleBtn.l = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$100(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("1bf80892", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.e;
    }

    public static /* synthetic */ void access$200(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8269fa96", new Object[]{flybirdDialogDoubleBtn});
            return;
        }
        try {
            flybirdDialogDoubleBtn.dismiss();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$300(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("cf8ba314", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.f;
    }

    public static /* synthetic */ Button access$400(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("dba32c8c", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.i;
    }

    public static /* synthetic */ Button access$500(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("c14e890d", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.j;
    }

    public static /* synthetic */ LinearLayout access$600(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("ed83adf1", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.k;
    }

    public static /* synthetic */ String access$700(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56052b25", new Object[]{flybirdDialogDoubleBtn});
        }
        return flybirdDialogDoubleBtn.d;
    }

    public static /* synthetic */ Object ipc$super(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/widget/dialog/FlybirdDialogDoubleBtn");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe21038", new Object[]{this});
        } else if (this.g != null) {
            if (!TextUtils.isEmpty(this.f3740a)) {
                this.g.setVisibility(0);
                CharSequence charSequence = null;
                try {
                    if (this.m) {
                        charSequence = HtmlParse.parseHtml(this.n, this.f3740a);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                TextView textView = this.g;
                if (charSequence == null) {
                    charSequence = this.f3740a;
                }
                textView.setText(charSequence);
                return;
            }
            this.g.setText("");
            this.g.setVisibility(8);
        }
    }

    public final void b() {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf027b9", new Object[]{this});
        } else if (this.h != null) {
            try {
                if (this.m) {
                    charSequence = HtmlParse.parseHtml(this.n, this.b);
                } else {
                    charSequence = Html.fromHtml(this.b);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                charSequence = null;
            }
            TextView textView = this.h;
            if (charSequence == null) {
                charSequence = this.b;
            }
            textView.setText(charSequence);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfe3f3a", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FlybirdDialogTwoBtn:setLeftOnClickText", "text=" + this.c + ", mBtnConfirm" + this.i + " ,msg=" + this.b);
        if (this.i != null) {
            CharSequence charSequence = null;
            try {
                if (this.m) {
                    charSequence = HtmlParse.parseHtml(this.n, this.c);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            Button button = this.i;
            if (charSequence == null) {
                charSequence = this.c;
            }
            button.setText(charSequence);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0c56bb", new Object[]{this});
            return;
        }
        Button button = this.i;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - FlybirdDialogDoubleBtn.access$000(FlybirdDialogDoubleBtn.this) >= 3000) {
                        FlybirdDialogDoubleBtn.access$002(FlybirdDialogDoubleBtn.this, System.currentTimeMillis());
                        if (FlybirdDialogDoubleBtn.access$100(FlybirdDialogDoubleBtn.this) != null) {
                            FlybirdDialogDoubleBtn.access$100(FlybirdDialogDoubleBtn.this).onClick(FlybirdDialogDoubleBtn.this, 0);
                        }
                        FlybirdDialogDoubleBtn.access$200(FlybirdDialogDoubleBtn.this);
                    }
                }
            });
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1a6e3c", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FlybirdDialogTwoBtn:setRightOnClickText", "text=" + this.d + ", mBtnConfirm" + this.j + " ,msg=" + this.b);
        if (this.j != null) {
            CharSequence charSequence = null;
            try {
                if (this.m) {
                    charSequence = HtmlParse.parseHtml(this.n, this.d);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            Button button = this.j;
            if (charSequence == null) {
                charSequence = this.d;
            }
            button.setText(charSequence);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2885bd", new Object[]{this});
            return;
        }
        Button button = this.j;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - FlybirdDialogDoubleBtn.access$000(FlybirdDialogDoubleBtn.this) >= 3000) {
                        FlybirdDialogDoubleBtn.access$002(FlybirdDialogDoubleBtn.this, System.currentTimeMillis());
                        if (FlybirdDialogDoubleBtn.access$300(FlybirdDialogDoubleBtn.this) != null) {
                            FlybirdDialogDoubleBtn.access$300(FlybirdDialogDoubleBtn.this).onClick(FlybirdDialogDoubleBtn.this, 1);
                        }
                        FlybirdDialogDoubleBtn.access$200(FlybirdDialogDoubleBtn.this);
                    }
                }
            });
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
                if (com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$500(r5.this$0).getVisibility() != 0) goto L_0x0072;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                if (com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r5.this$0).getVisibility() != 0) goto L_0x0072;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
                if (com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r5.this$0).getHeight() < com.alipay.android.msp.utils.ResUtils.dip2px(r5.this$0.getContext(), 24.0f)) goto L_0x0072;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.AnonymousClass3.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = "5c510192"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r5
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0012:
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.Button r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$400(r0)     // Catch: all -> 0x0027
                    if (r0 == 0) goto L_0x002a
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.Button r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$400(r0)     // Catch: all -> 0x0027
                    int r0 = r0.getVisibility()     // Catch: all -> 0x0027
                    if (r0 != 0) goto L_0x0072
                    goto L_0x002a
                L_0x0027:
                    r0 = move-exception
                    goto L_0x00d1
                L_0x002a:
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.Button r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$500(r0)     // Catch: all -> 0x0027
                    if (r0 == 0) goto L_0x003e
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.Button r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$500(r0)     // Catch: all -> 0x0027
                    int r0 = r0.getVisibility()     // Catch: all -> 0x0027
                    if (r0 != 0) goto L_0x0072
                L_0x003e:
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r0)     // Catch: all -> 0x0027
                    if (r0 == 0) goto L_0x0052
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r0)     // Catch: all -> 0x0027
                    int r0 = r0.getVisibility()     // Catch: all -> 0x0027
                    if (r0 != 0) goto L_0x0072
                L_0x0052:
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r0)     // Catch: all -> 0x0027
                    if (r0 == 0) goto L_0x0091
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r0 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r0)     // Catch: all -> 0x0027
                    int r0 = r0.getHeight()     // Catch: all -> 0x0027
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r1 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.content.Context r1 = r1.getContext()     // Catch: all -> 0x0027
                    r2 = 1103101952(0x41c00000, float:24.0)
                    int r1 = com.alipay.android.msp.utils.ResUtils.dip2px(r1, r2)     // Catch: all -> 0x0027
                    if (r0 >= r1) goto L_0x0091
                L_0x0072:
                    java.lang.Object r0 = com.alipay.android.app.safepaylogv2.api.StatisticCollector.GLOBAL_AGENT     // Catch: all -> 0x0027
                    java.lang.String r1 = "wr"
                    java.lang.String r2 = "DlgDoubleBtnGone"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0027
                    java.lang.String r4 = "mRightText="
                    r3.<init>(r4)     // Catch: all -> 0x0027
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r4 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    java.lang.String r4 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$700(r4)     // Catch: all -> 0x0027
                    r3.append(r4)     // Catch: all -> 0x0027
                    java.lang.String r3 = r3.toString()     // Catch: all -> 0x0027
                    com.alipay.android.app.safepaylogv2.api.StatisticCollector.addError(r0, r1, r2, r3)     // Catch: all -> 0x0027
                L_0x0091:
                    java.lang.String r0 = "FlybirdDialogOneBtn:onAttachedToWindow"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0027
                    java.lang.String r2 = "mBtnConfirm="
                    r1.<init>(r2)     // Catch: all -> 0x0027
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.Button r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$500(r2)     // Catch: all -> 0x0027
                    r1.append(r2)     // Catch: all -> 0x0027
                    java.lang.String r2 = " buttonContainer="
                    r1.append(r2)     // Catch: all -> 0x0027
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r2)     // Catch: all -> 0x0027
                    int r2 = r2.getVisibility()     // Catch: all -> 0x0027
                    r1.append(r2)     // Catch: all -> 0x0027
                    java.lang.String r2 = " buttonContainer:"
                    r1.append(r2)     // Catch: all -> 0x0027
                    com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.this     // Catch: all -> 0x0027
                    android.widget.LinearLayout r2 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.access$600(r2)     // Catch: all -> 0x0027
                    int r2 = r2.getHeight()     // Catch: all -> 0x0027
                    r1.append(r2)     // Catch: all -> 0x0027
                    java.lang.String r1 = r1.toString()     // Catch: all -> 0x0027
                    r2 = 2
                    com.alipay.android.msp.utils.LogUtil.record(r2, r0, r1)     // Catch: all -> 0x0027
                    return
                L_0x00d1:
                    com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.AnonymousClass3.run():void");
            }
        }, 1500L);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.flybird_dialog_double_btn);
        setCancelable(false);
        this.g = (TextView) findViewById(R.id.flybird_dialog_double_btn_title);
        this.h = (TextView) findViewById(R.id.flybird_dialog_double_btn_text);
        this.i = (Button) findViewById(R.id.flybird_dialog_double_left_btn);
        this.j = (Button) findViewById(R.id.flybird_dialog_double_right_btn);
        this.k = (LinearLayout) findViewById(R.id.flybird_dialog_two_btn_layout);
        LogUtil.record(2, "FlybirdDialogDoubleBtn:initializeView", " mLeftBtn" + this.i + " ,mRightBtn" + this.j + " ,buttonContainer=" + this.k);
        a();
        b();
        c();
        d();
        e();
        f();
    }

    public void setLeftOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8894cb2", new Object[]{this, onClickListener});
            return;
        }
        this.e = onClickListener;
        d();
    }

    public void setLeftOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c62b3e", new Object[]{this, str});
            return;
        }
        this.c = str;
        c();
    }

    public void setOneMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38960714", new Object[]{this, str});
            return;
        }
        this.b = str;
        b();
    }

    public void setRightOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd04e783", new Object[]{this, onClickListener});
            return;
        }
        this.f = onClickListener;
        f();
    }

    public void setRightOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975ee60d", new Object[]{this, str});
            return;
        }
        this.d = str;
        e();
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f3740a = str;
        a();
    }
}
