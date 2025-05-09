package com.taobao.android.weex_framework.util;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import tb.dwh;
import tb.hxh;
import tb.u8x;
import tb.vvh;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WeexTracing$1 extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Application d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/util/WeexTracing$1$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 30 && !vvh.m() && !u8x.d(WeexTracing$1.this.d, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                dwh.s("Weex Timeline 在高版本Android需要 MANAGE_EXTERNAL_STORAGE权限, 请参考最新./test.sh profiling_android的提示");
            }
        }
    }

    public WeexTracing$1(Application application) {
        this.d = application;
    }

    public static /* synthetic */ Object ipc$super(WeexTracing$1 weexTracing$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/util/WeexTracing$1");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.android.weex2.tracing.start");
        intentFilter.addAction("com.taobao.android.weex2.tracing.stop");
        intentFilter.addAction("com.taobao.android.weex2.tracing.permission");
        dwh.e("[Timeline] register android broadcast receiver");
        this.d.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.weex_framework.util.WeexTracing$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/util/WeexTracing$1$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                dwh.e("[Timeline] android broadcast receiver got: " + action);
                if ("com.taobao.android.weex2.tracing.start".equals(action)) {
                    MUSCommonNativeBridge.nativeWx_Trace_startRecord();
                } else if ("com.taobao.android.weex2.tracing.stop".equals(action)) {
                    MUSCommonNativeBridge.nativeWx_Trace_stopRecord();
                } else if ("com.taobao.android.weex2.tracing.permission".equals(action)) {
                    dwh.s("Weex Timeline请求文件权限中, 授予后请重启App");
                    Intent intent2 = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + WeexTracing$1.this.d.getPackageName()));
                    intent2.addFlags(268435456);
                    WeexTracing$1.this.d.startActivity(intent2);
                } else {
                    Application application = WeexTracing$1.this.d;
                    Toast.makeText(application, "Not valid tracing action: " + action, 0).show();
                }
            }
        }, intentFilter);
        hxh.d(new a());
    }
}
