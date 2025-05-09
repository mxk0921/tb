package com.alipay.android.msp.ui.widget.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ThirdH5PageExitDialog extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3743a;
    public DialogInterface.OnClickListener b;
    public DialogInterface.OnClickListener c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public Button h;
    public Button i;
    public long j;
    public final String k;
    public Activity l;

    public ThirdH5PageExitDialog(Activity activity, String str) {
        super(activity);
        this.k = str;
        this.l = activity;
    }

    public static /* synthetic */ long access$000(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2eff9450", new Object[]{thirdH5PageExitDialog})).longValue();
        }
        return thirdH5PageExitDialog.j;
    }

    public static /* synthetic */ long access$002(ThirdH5PageExitDialog thirdH5PageExitDialog, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93968cde", new Object[]{thirdH5PageExitDialog, new Long(j)})).longValue();
        }
        thirdH5PageExitDialog.j = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$100(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("6ee59238", new Object[]{thirdH5PageExitDialog});
        }
        return thirdH5PageExitDialog.b;
    }

    public static /* synthetic */ Activity access$200(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e4e8e94e", new Object[]{thirdH5PageExitDialog});
        }
        return thirdH5PageExitDialog.l;
    }

    public static /* synthetic */ void access$300(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a0b639", new Object[]{thirdH5PageExitDialog});
            return;
        }
        try {
            thirdH5PageExitDialog.dismiss();
            thirdH5PageExitDialog.l = null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ DialogInterface.OnClickListener access$400(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogInterface.OnClickListener) ipChange.ipc$dispatch("4a2aa615", new Object[]{thirdH5PageExitDialog});
        }
        return thirdH5PageExitDialog.c;
    }

    public static /* synthetic */ Object ipc$super(ThirdH5PageExitDialog thirdH5PageExitDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/dialog/ThirdH5PageExitDialog");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe21038", new Object[]{this});
        } else if (this.d != null) {
            if (!TextUtils.isEmpty(this.f3743a)) {
                this.d.setVisibility(0);
                this.d.setText(this.f3743a);
                return;
            }
            this.d.setText(this.f3743a);
            this.d.setVisibility(8);
        }
    }

    public void setLeftOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8894cb2", new Object[]{this, onClickListener});
            return;
        }
        this.b = onClickListener;
        Button button = this.h;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - ThirdH5PageExitDialog.access$000(ThirdH5PageExitDialog.this) >= 3000) {
                        ThirdH5PageExitDialog.access$002(ThirdH5PageExitDialog.this, System.currentTimeMillis());
                        if (ThirdH5PageExitDialog.access$100(ThirdH5PageExitDialog.this) != null) {
                            ThirdH5PageExitDialog.access$100(ThirdH5PageExitDialog.this).onClick(ThirdH5PageExitDialog.this, 0);
                            EventLogUtil.walletSpmTrack(ThirdH5PageExitDialog.access$200(ThirdH5PageExitDialog.this), "pay", null, "", "a283.b2979.c14592.d27159", null, "click");
                        }
                        ThirdH5PageExitDialog.access$300(ThirdH5PageExitDialog.this);
                    }
                }
            });
        }
    }

    public void setRightOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd04e783", new Object[]{this, onClickListener});
            return;
        }
        this.c = onClickListener;
        Button button = this.i;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - ThirdH5PageExitDialog.access$000(ThirdH5PageExitDialog.this) >= 3000) {
                        ThirdH5PageExitDialog.access$002(ThirdH5PageExitDialog.this, System.currentTimeMillis());
                        if (ThirdH5PageExitDialog.access$400(ThirdH5PageExitDialog.this) != null) {
                            ThirdH5PageExitDialog.access$400(ThirdH5PageExitDialog.this).onClick(ThirdH5PageExitDialog.this, 1);
                            EventLogUtil.walletSpmTrack(ThirdH5PageExitDialog.access$200(ThirdH5PageExitDialog.this), "pay", null, "", "a283.b2979.c14592.d27158", null, "click");
                        }
                        ThirdH5PageExitDialog.access$300(ThirdH5PageExitDialog.this);
                    }
                }
            });
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f3743a = str;
        a();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        TextView textView;
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
        setContentView(R.layout.third_h5page_exit_dialog);
        setCancelable(false);
        this.d = (TextView) findViewById(R.id.third_h5page_exit_dialog_title);
        this.e = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_top);
        this.f = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_middle);
        this.g = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_bottom);
        this.h = (Button) findViewById(R.id.third_h5page_exit_dialog_left_btn);
        this.i = (Button) findViewById(R.id.third_h5page_exit_dialog_right_btn);
        a();
        if (!(this.e == null || this.f == null || (textView = this.g) == null)) {
            textView.setVisibility(8);
            TextView textView2 = this.e;
            Context context = getContext();
            int i = R.string.flybird_thirdwap_tips;
            textView2.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_tips", context.getString(i), new Object[0]));
            if (TextUtils.isEmpty(this.k)) {
                this.e.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_text", getContext().getString(R.string.flybird_thirdwap_text), new Object[0]));
                this.f.setVisibility(8);
            } else {
                this.e.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_tips", getContext().getString(i), new Object[0]));
                this.f.setText(this.k);
            }
        }
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592", null, "exposure");
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592.d27158", null, "exposure");
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592.d27159", null, "exposure");
    }
}
