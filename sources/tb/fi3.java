package tb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.android.change.app.icon.utils.MtopUtils;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fi3 extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHANGEICON_RESULT_CHECK = 1;
    public ComponentName b;
    public AppIconComponentName c;
    public umb d;
    public long e = 0;
    public long f = 0;
    public long g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Application f19306a = qh3.k();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements wh3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(fi3 fi3Var) {
        }

        @Override // tb.wh3
        public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ecbbf69", new Object[]{this, changeAppIconMtopResponse});
            } else {
                c();
            }
        }

        @Override // tb.wh3
        public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a7254e", new Object[]{this, changeAppIconMtopResponse});
            } else {
                c();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45231709", new Object[]{this});
                return;
            }
            AdapterForTLog.loge("ChangeAppIconHandler", "callbackResult clear infos");
            faq.f().o("");
        }
    }

    static {
        t2o.a(284164100);
    }

    public fi3(Looper looper) {
        super(looper);
    }

    public static /* synthetic */ Object ipc$super(fi3 fi3Var, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/change/app/icon/core/ChangeIconHandler");
    }

    public final void c(boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7718c89", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        int p = qh3.p(this.f19306a);
        AdapterForTLog.loge("ChangeAppIconHandler", "------callbackResult------result:" + z + " timeOut:" + z2 + " enableLaunchers:" + p);
        vh3.f().e();
        final Bundle a2 = tmb.a(z, z2, p);
        fqt.d().c(new Runnable() { // from class: tb.ei3
            @Override // java.lang.Runnable
            public final void run() {
                fi3.this.d(a2);
            }
        });
        Intent intent = new Intent(sh3.ACTION_CHANGE_APP_ICON_RESULT);
        intent.putExtras(a2);
        sh3.a(intent);
        String str2 = this.c.iconName;
        if (z) {
            str = "SUCCESS";
        } else {
            str = "TIMEOUT";
        }
        ChangeAppIconRequest changeAppIconRequest = new ChangeAppIconRequest(str2, str, p);
        changeAppIconRequest.setChangeType(vh3.f().g());
        t4v.a(t4v.PAGE_NAME, vh3.TAG, pg1.ATOM_done, "info:" + changeAppIconRequest.toString(), null);
        MtopUtils.f(changeAppIconRequest, new a(this));
    }

    public final /* synthetic */ void d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eedeb61", new Object[]{this, bundle});
            return;
        }
        umb umbVar = this.d;
        if (umbVar != null) {
            umbVar.onResult(bundle);
        }
    }

    public final /* synthetic */ void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52be1a2b", new Object[]{this, new Float(f)});
        } else {
            this.d.onProgress((int) f);
        }
    }

    public void f(AppIconComponentName appIconComponentName, umb umbVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54df513", new Object[]{this, appIconComponentName, umbVar, new Long(j), new Long(j2)});
            return;
        }
        AdapterForTLog.loge("ChangeAppIconHandler", "startCheck:" + appIconComponentName.toString() + " checkTotalTimeMs:" + j + " checkIntervalTimeMs:" + j2);
        this.c = appIconComponentName;
        this.b = new ComponentName(this.f19306a, appIconComponentName.clzPath);
        this.d = umbVar;
        this.f = j;
        this.g = j2;
        sendEmptyMessageDelayed(1, 300L);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        try {
            super.handleMessage(message);
            AdapterForTLog.loge("ChangeAppIconHandler", "start check change app icon result,progress:0.0");
            if (this.b == null) {
                AdapterForTLog.loge("ChangeAppIconHandler", "kill check change app icon");
            } else if (this.e > this.f) {
                AdapterForTLog.loge("ChangeAppIconHandler", "end check change app icon time out,progress:0.0");
                c(false, true);
            } else if (message.what != 1) {
            } else {
                if (this.f19306a.getPackageManager().getComponentEnabledSetting(this.b) == 1) {
                    c(true, false);
                    return;
                }
                final float max = Math.max(((((float) this.e) * 1.0f) / ((float) this.f)) * 100.0f, 100.0f);
                AdapterForTLog.loge("ChangeAppIconHandler", "check change app icon current progress:" + max);
                if (this.d != null) {
                    fqt.d().c(new Runnable() { // from class: tb.di3
                        @Override // java.lang.Runnable
                        public final void run() {
                            fi3.this.e(max);
                        }
                    });
                }
                long j = this.e;
                long j2 = this.g;
                this.e = j + j2;
                sendEmptyMessageDelayed(1, j2);
            }
        } catch (Exception e) {
            AdapterForTLog.loge("ChangeAppIconHandler", "check change app icon error " + e.getMessage(), e);
        }
    }
}
