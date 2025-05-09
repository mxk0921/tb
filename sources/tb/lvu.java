package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lvu implements kvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dl7 f23599a;
    public final wvu b = (wvu) c62.getInstance(wvu.class);

    static {
        t2o.a(947912725);
        t2o.a(946864135);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f23599a = null;
        }
    }

    @Override // tb.kvu
    public void notifyDownloadError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd84e8", new Object[]{this, str});
            return;
        }
        dl7 dl7Var = this.f23599a;
        if (dl7Var != null) {
            dl7Var.dismiss();
        }
        a();
        wvu wvuVar = this.b;
        if (wvuVar == null) {
            Toast.makeText(UpdateRuntime.getContext(), str, 0).show();
        } else {
            wvuVar.toast(str);
        }
    }

    @Override // tb.kvu
    public void notifyDownloadFinish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909a6275", new Object[]{this, str});
            return;
        }
        try {
            dl7 dl7Var = this.f23599a;
            if (dl7Var != null) {
                dl7Var.dismiss();
            }
        } catch (Throwable unused) {
        }
        a();
    }

    @Override // tb.kvu
    public void notifyDownloadProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2646e5de", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.f23599a == null) {
                Activity peekTopActivity = kc0.getInstance().peekTopActivity();
                if (peekTopActivity != null && !peekTopActivity.isFinishing()) {
                    LayoutInflater from = LayoutInflater.from(peekTopActivity);
                    dl7 dl7Var = new dl7(peekTopActivity, "正在更新", "", false);
                    this.f23599a = dl7Var;
                    dl7Var.setContentView(from.inflate(R.layout.update_coerce, (ViewGroup) null));
                    this.f23599a.show();
                }
                return;
            }
            ((ProgressBar) this.f23599a.getContentView().findViewById(R.id.pb1)).setProgress(i);
            ((TextView) this.f23599a.getContentView().findViewById(R.id.tvUpdatePercent)).setText(i + f7l.MOD);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
