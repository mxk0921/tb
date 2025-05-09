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
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.HtmlParse;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FlybirdDialogOneBtn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3742a;
    public String b;
    public String c;
    public DialogInterface.OnClickListener d;
    public TextView e;
    public TextView f;
    public Button g;
    public LinearLayout h;
    public final Context i;
    public final boolean j;
    public long k;

    public FlybirdDialogOneBtn(Context context) {
        super(context);
        this.i = context;
        this.j = FlybirdDialogImpl.antDialogEnable(context);
    }

    public static /* synthetic */ long access$000(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6176324f", new Object[]{flybirdDialogOneBtn})).longValue();
        }
        return flybirdDialogOneBtn.k;
    }

    public static /* synthetic */ long access$002(FlybirdDialogOneBtn flybirdDialogOneBtn, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d3873f", new Object[]{flybirdDialogOneBtn, new Long(j)})).longValue();
        }
        flybirdDialogOneBtn.k = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$100(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("b7ddb1f7", new Object[]{flybirdDialogOneBtn});
        }
        return flybirdDialogOneBtn.d;
    }

    public static /* synthetic */ void access$200(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a522b19", new Object[]{flybirdDialogOneBtn});
            return;
        }
        try {
            if (flybirdDialogOneBtn.isShowing()) {
                flybirdDialogOneBtn.dismiss();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ Button access$300(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("4642eaec", new Object[]{flybirdDialogOneBtn});
        }
        return flybirdDialogOneBtn.g;
    }

    public static /* synthetic */ LinearLayout access$400(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("fe407cae", new Object[]{flybirdDialogOneBtn});
        }
        return flybirdDialogOneBtn.h;
    }

    public static /* synthetic */ String access$500(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3827872a", new Object[]{flybirdDialogOneBtn});
        }
        return flybirdDialogOneBtn.c;
    }

    public static /* synthetic */ Object ipc$super(FlybirdDialogOneBtn flybirdDialogOneBtn, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/widget/dialog/FlybirdDialogOneBtn");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe21038", new Object[]{this});
        } else if (this.e != null) {
            if (!TextUtils.isEmpty(this.f3742a)) {
                this.e.setVisibility(0);
                CharSequence charSequence = null;
                try {
                    if (this.j) {
                        charSequence = HtmlParse.parseHtml(this.i, this.f3742a);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                TextView textView = this.e;
                if (charSequence == null) {
                    charSequence = this.f3742a;
                }
                textView.setText(charSequence);
                return;
            }
            this.e.setText("");
            this.e.setVisibility(8);
        }
    }

    public final void b() {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf027b9", new Object[]{this});
        } else if (this.f != null) {
            try {
                if (this.j) {
                    charSequence = HtmlParse.parseHtml(this.i, this.b);
                } else {
                    charSequence = Html.fromHtml(this.b);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                charSequence = null;
            }
            TextView textView = this.f;
            if (charSequence == null) {
                charSequence = this.b;
            }
            textView.setText(charSequence);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44b4bf", new Object[]{this});
        } else if (this.g != null) {
            CharSequence charSequence = null;
            try {
                if (this.j) {
                    charSequence = HtmlParse.parseHtml(this.i, this.c);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            Button button = this.g;
            if (charSequence == null) {
                charSequence = this.c;
            }
            button.setText(charSequence);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac52cc40", new Object[]{this});
            return;
        }
        Button button = this.g;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogOneBtn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - FlybirdDialogOneBtn.access$000(FlybirdDialogOneBtn.this) >= 3000) {
                        FlybirdDialogOneBtn.access$002(FlybirdDialogOneBtn.this, System.currentTimeMillis());
                        if (FlybirdDialogOneBtn.access$100(FlybirdDialogOneBtn.this) != null) {
                            FlybirdDialogOneBtn.access$100(FlybirdDialogOneBtn.this).onClick(FlybirdDialogOneBtn.this, 0);
                        }
                        FlybirdDialogOneBtn.access$200(FlybirdDialogOneBtn.this);
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
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogOneBtn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FlybirdDialogOneBtn.access$300(FlybirdDialogOneBtn.this).getVisibility() == 0) {
                        if (FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getVisibility() == 0) {
                            if (FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getHeight() < ResUtils.dip2px(FlybirdDialogOneBtn.this.getContext(), 24.0f)) {
                            }
                            LogUtil.record(2, "FlybirdDialogOneBtn:onAttachedToWindow", "mBtnConfirm=" + FlybirdDialogOneBtn.access$300(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer=" + FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer:" + FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getHeight());
                        }
                    }
                    Object obj = StatisticCollector.GLOBAL_AGENT;
                    StatisticCollector.addError(obj, ErrorType.WARNING, "DlgBtnGone", "text=" + FlybirdDialogOneBtn.access$500(FlybirdDialogOneBtn.this));
                    LogUtil.record(2, "FlybirdDialogOneBtn:onAttachedToWindow", "mBtnConfirm=" + FlybirdDialogOneBtn.access$300(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer=" + FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer:" + FlybirdDialogOneBtn.access$400(FlybirdDialogOneBtn.this).getHeight());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
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
        setContentView(R.layout.flybird_dialog_one_btn);
        setCancelable(false);
        this.e = (TextView) findViewById(R.id.flybird_dialog_one_btn_title);
        this.f = (TextView) findViewById(R.id.flybird_dialog_one_btn_text);
        this.g = (Button) findViewById(R.id.flybird_dialog_one_btn_confirm);
        this.h = (LinearLayout) findViewById(R.id.flybird_dialog_one_btn_layout);
        LogUtil.record(2, "FlybirdDialogOneBtn:initializeView", " mBtnConfirm" + this.g + " ,buttonContainer=" + this.h);
        a();
        b();
        c();
        d();
    }

    public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6aadd0b", new Object[]{this, onClickListener});
            return;
        }
        this.d = onClickListener;
        d();
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

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f3742a = str;
        a();
    }

    public void setOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4bfd85", new Object[]{this, str});
            return;
        }
        this.c = str;
        LogUtil.record(2, "FlybirdDialogOneBtn:setOnClickText", "text=" + str + ", mBtnConfirm" + this.g + " ,msg=" + this.b);
        c();
    }
}
