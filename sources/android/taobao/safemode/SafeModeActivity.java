package android.taobao.safemode;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.acq;
import tb.kpo;
import tb.lpo;
import tb.rpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SafeModeActivity extends Activity implements View.OnClickListener, lpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public kpo b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1753a = false;
    public boolean c = true;
    public String d = "";
    public boolean e = true;

    public static /* synthetic */ Object ipc$super(SafeModeActivity safeModeActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/safemode/SafeModeActivity");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3aa1c4", new Object[]{this});
            return;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.contains(getPackageName()) && !runningAppProcessInfo.processName.contains(":safemode")) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Throwable unused) {
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        int i = R.id.activity_safemode_btn_fix;
        if (id == i) {
            if (this.e) {
                this.b.b();
            }
            ((TextView) findViewById(i)).setText(R.string.safemode_fixing);
            b();
            return;
        }
        this.b.d(true);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }

    @Override // tb.lpo
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            this.b.d(false);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f1753a) {
            this.f1753a = true;
            this.b.c();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a();
        setContentView(R.layout.activity_safemode);
        this.c = getIntent().getBooleanExtra("Launch", true);
        this.d = getIntent().getStringExtra(HeaderConstant.HEADER_KEY_VERSION);
        this.b = new kpo(getApplication(), this.d, this.c, this);
        ViewProxy.setOnClickListener(findViewById(R.id.activity_safemode_btn_skip), this);
        this.b.a();
        if ("false".equals(getSharedPreferences(rpo.SHARE_PREFERENCES_NAME, 0).getString("downloadPatchAfterClick", "true"))) {
            this.e = false;
        }
        if (this.e || !this.c) {
            this.e = true;
            return;
        }
        this.b.b();
        this.e = false;
    }
}
