package com.taobao.share.core.share.interceptor;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.core.share.ShareBusinessService;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.bwr;
import tb.doc;
import tb.fwr;
import tb.hjp;
import tb.jpd;
import tb.kkp;
import tb.mip;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LoginInterceptor implements jpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ShareLoginBroadcastReceiver f11752a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ShareLoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<String> f11753a;
        public final TBShareContent b;
        public final String d;
        public boolean c = false;
        public final Class e = ClipUrlWatcherControl.z().s().get().getClass();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!(ClipUrlWatcherControl.z().s() == null || ClipUrlWatcherControl.z().s().get() == null || ShareLoginBroadcastReceiver.a(ShareLoginBroadcastReceiver.this) != ClipUrlWatcherControl.z().s().get().getClass())) {
                        ShareBusinessService.a(ShareLoginBroadcastReceiver.b(ShareLoginBroadcastReceiver.this), ShareLoginBroadcastReceiver.c(ShareLoginBroadcastReceiver.this));
                        return;
                    }
                    ShareBizAdapter.getInstance().getLogin().a(ShareLoginBroadcastReceiver.this);
                } catch (Exception e) {
                    e.printStackTrace();
                    fwr.b(jpd.TAG, "ShareLoginBroadcastReceiver.doShare err:" + e.getMessage());
                }
            }
        }

        static {
            t2o.a(664797267);
        }

        public ShareLoginBroadcastReceiver(LoginInterceptor loginInterceptor, ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
            this.f11753a = arrayList;
            this.b = tBShareContent;
            this.d = str;
        }

        public static /* synthetic */ Class a(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("7d0a906e", new Object[]{shareLoginBroadcastReceiver});
            }
            return shareLoginBroadcastReceiver.e;
        }

        public static /* synthetic */ ArrayList b(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("c3092d1c", new Object[]{shareLoginBroadcastReceiver});
            }
            return shareLoginBroadcastReceiver.f11753a;
        }

        public static /* synthetic */ TBShareContent c(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBShareContent) ipChange.ipc$dispatch("9e035ca0", new Object[]{shareLoginBroadcastReceiver});
            }
            return shareLoginBroadcastReceiver.b;
        }

        public static /* synthetic */ Object ipc$super(ShareLoginBroadcastReceiver shareLoginBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/share/interceptor/LoginInterceptor$ShareLoginBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            fwr.a("ShareLoginBroadcastReceiver", "session change+ Sid:" + bwr.h().l() + " sid:" + this.d);
            if (!TextUtils.equals(bwr.h().l(), this.d)) {
                ShareBizAdapter.getInstance().getLogin().a(this);
            } else if ((!this.c || intent != null) && !TextUtils.isEmpty(intent.getAction())) {
                try {
                    if (LoginAction.valueOf(intent.getAction()) == LoginAction.NOTIFY_LOGIN_SUCCESS) {
                        this.c = true;
                        new Handler().postDelayed(new a(), 500L);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    fwr.b(jpd.TAG, "ShareLoginBroadcastReceiver.doShare err:" + e.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(664797266);
        t2o.a(664797264);
    }

    @Override // tb.jpd
    public boolean a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa241d0", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELLOGININTERCEPTORSTART);
        bwr.h().v(str);
        if (mip.p()) {
            Activity activity = ClipUrlWatcherControl.z().s().get();
            if (!ShareBizAdapter.getInstance().getLogin().checkSessionValid()) {
                ShareBizAdapter.getInstance().getLogin().login(true);
                if (activity != null) {
                    doc login = ShareBizAdapter.getInstance().getLogin();
                    ShareLoginBroadcastReceiver shareLoginBroadcastReceiver = new ShareLoginBroadcastReceiver(this, arrayList, tBShareContent, str);
                    this.f11752a = shareLoginBroadcastReceiver;
                    login.b(shareLoginBroadcastReceiver);
                    LocalBroadcastManager.getInstance(activity).sendBroadcast(new Intent("action.share_dialog_close"));
                }
                Toast.makeText(hjp.a(), Localization.q(R.string.taobao_app_1010_1_23577), 0).show();
                fwr.b(jpd.TAG, "return: to login");
                return true;
            } else if (!(activity == null || this.f11752a == null)) {
                ShareBizAdapter.getInstance().getLogin().a(this.f11752a);
            }
        }
        e.a(kkp.KEY_SHAREPANELLOGININTERCEPTOREND);
        return false;
    }
}
