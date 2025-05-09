package com.taobao.android.pissarro.external;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.ImageChoiceActivity;
import com.taobao.android.pissarro.PissarroShellActivity;
import com.taobao.android.pissarro.remote.RemoteLoadingActivity;
import com.taobao.appbundle.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.ikq;
import tb.mj4;
import tb.q3m;
import tb.rod;
import tb.t2o;
import tb.tep;
import tb.tv2;
import tb.xbt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ServiceImpl implements rod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9167a;
    public tv2 b;
    public final ImageReceiver c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ImageReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(623902776);
        }

        public ImageReceiver() {
        }

        public static /* synthetic */ Object ipc$super(ImageReceiver imageReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/pissarro/external/ServiceImpl$ImageReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            q3m.c().e(false);
            if ("action.cancel".equals(action) || "action.taopai.load.fail".equals(action)) {
                ServiceImpl.a(ServiceImpl.this);
                if (ServiceImpl.b(ServiceImpl.this) != null) {
                    ServiceImpl.b(ServiceImpl.this).onCancel();
                }
            } else if ("action.complete".equals(action)) {
                ServiceImpl.c(ServiceImpl.this);
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("IMAGE_RESULT");
                if (ServiceImpl.b(ServiceImpl.this) != null) {
                    ServiceImpl.b(ServiceImpl.this).onComplete(parcelableArrayListExtra);
                }
            }
        }
    }

    static {
        t2o.a(623902775);
        t2o.a(623902771);
    }

    public ServiceImpl(Context context) {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.c = imageReceiver;
        this.f9167a = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.complete");
        intentFilter.addAction("action.cancel");
        intentFilter.addAction("action.taopai.load.fail");
        LocalBroadcastManager.getInstance(context).registerReceiver(imageReceiver, intentFilter);
    }

    public static /* synthetic */ void a(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf17b80", new Object[]{serviceImpl});
        } else {
            serviceImpl.e();
        }
    }

    public static /* synthetic */ tv2 b(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv2) ipChange.ipc$dispatch("aa8dffe", new Object[]{serviceImpl});
        }
        return serviceImpl.b;
    }

    public static /* synthetic */ void c(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68198d82", new Object[]{serviceImpl});
        } else {
            serviceImpl.f();
        }
    }

    public static void d(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b37798", new Object[]{intent, context});
        } else if ((context instanceof Service) || (context instanceof Application)) {
            intent.addFlags(268435456);
        }
    }

    public static void g(Context context, Config config, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4bcf03", new Object[]{context, config, intent});
            return;
        }
        intent.putExtra("config", config);
        Intent intent2 = new Intent(context, RemoteLoadingActivity.class);
        intent2.putExtra("feature_name", a.TAOPAI_FEATURE);
        intent2.putExtra("orignal_intent", intent);
        d(intent2, context);
        context.startActivity(intent2);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3abce90", new Object[]{this});
            return;
        }
        q3m.c().b().b(mj4.PAGE_NAME, "Cancel", "spm-cnt=a21xm.9439189.0.0");
        mj4.b();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678f2471", new Object[]{this});
            return;
        }
        ikq b = q3m.c().b();
        b.b(mj4.PAGE_NAME, mj4.CONTROL_NAME_OK, "spm-cnt=a21xm.9439189.0.0", "option=" + mj4.a());
        mj4.b();
    }

    @Override // tb.rod
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.rod
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.f9167a).unregisterReceiver(this.c);
        } catch (Exception unused) {
        }
        q3m.c().e(false);
    }

    @Override // tb.rod
    public void openAlbum(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a35e9", new Object[]{this, config, tv2Var});
            return;
        }
        this.b = tv2Var;
        h(this.f9167a, config);
    }

    @Override // tb.rod
    public void openCameraOrAlbum(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deac88e1", new Object[]{this, config, tv2Var});
            return;
        }
        this.b = tv2Var;
        Intent intent = new Intent(this.f9167a, ImageChoiceActivity.class);
        intent.putExtra("config", config);
        d(intent, this.f9167a);
        if (xbt.c()) {
            q3m.c().d(config);
            this.f9167a.startActivity(intent);
            return;
        }
        g(this.f9167a, config, intent);
    }

    public static void h(Context context, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d13ee3", new Object[]{context, config});
            return;
        }
        Intent intent = new Intent(context, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 1);
        d(intent, context);
        if (xbt.c()) {
            q3m.c().d(config);
            context.startActivity(intent);
        } else {
            g(context, config, intent);
        }
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out);
        }
    }

    public static void i(Context context, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d0002d", new Object[]{context, config});
            return;
        }
        Intent intent = new Intent(context, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 0);
        d(intent, context);
        if (!xbt.c()) {
            g(context, config, intent);
        } else {
            q3m.c().d(config);
            context.startActivity(intent);
        }
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_fade_out);
        }
    }

    @Override // tb.rod
    public void openCamera(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1fedb3", new Object[]{this, config, tv2Var});
            return;
        }
        this.b = tv2Var;
        if (xbt.c()) {
            i(this.f9167a, config);
            return;
        }
        Intent intent = new Intent(this.f9167a, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 0);
        d(intent, this.f9167a);
        g(this.f9167a, config, intent);
    }

    @Override // tb.rod
    public void editPicture(Config config, String str, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60de3f6e", new Object[]{this, config, str, tv2Var});
            return;
        }
        this.b = tv2Var;
        Intent intent = new Intent(this.f9167a, PissarroShellActivity.class);
        intent.putExtra(PissarroShellActivity.KEY_FUN, 2);
        intent.putExtra(tep.KEY_IMAGE_PATH, str);
        intent.putExtra("EDIT_PICTURE", true);
        d(intent, this.f9167a);
        Config clone = config.clone();
        if (clone != null) {
            config = clone;
        }
        config.setMultiple(true);
        if (xbt.c()) {
            q3m.c().d(config);
            this.f9167a.startActivity(intent);
            return;
        }
        g(this.f9167a, config, intent);
    }
}
