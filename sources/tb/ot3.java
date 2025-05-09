package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ot3 extends Dialog implements DialogInterface.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f25632a = new Handler();
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ot3.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((ot3.a(ot3.this) instanceof Activity) && !((Activity) ot3.a(ot3.this)).isDestroyed()) {
                ot3.this.dismiss();
            }
        }
    }

    static {
        t2o.a(295698565);
    }

    public ot3(Context context) {
        super(context, R.style.TLLive_Permission_Dialog_AType);
        this.b = context;
        setContentView(R.layout.taolive_clear_screen_guide_layout_flexalocal);
        setOnDismissListener(this);
    }

    public static /* synthetic */ Context a(ot3 ot3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("28d606a1", new Object[]{ot3Var});
        }
        return ot3Var.b;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21bf2d54", new Object[0])).longValue();
        }
        return zqq.e(v2s.o().p().b("tblive", "cleanScreenGuideRemoveDelayTime", "5")) * 1000.0f;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e06ff9", new Object[0]);
        }
        return v2s.o().p().b("tblive", "swipeClickScreenIcon", "https://img.alicdn.com/imgextra/i4/O1CN01r13ORS1WJKhb6NoB1_!!6000000002767-54-tps-360-360.apng");
    }

    public static /* synthetic */ Object ipc$super(ot3 ot3Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/clean/ClearScreenGuideDialog");
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        } else {
            this.f25632a.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        this.f25632a.postDelayed(new b(), b());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        ViewProxy.setOnClickListener(findViewById(R.id.root), new a());
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_guide);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setImageUrl(c());
        ((TextView) findViewById(R.id.taolive_text)).setText("信息太多？点击进入清屏");
    }
}
