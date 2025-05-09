package com.taobao.android.address;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.acq;
import tb.rf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WeexPopEditor extends WeexPopContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BroadcastReceiver s;

    public static /* synthetic */ Object ipc$super(WeexPopEditor weexPopEditor, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/WeexPopEditor");
        }
    }

    @Override // com.taobao.android.address.WeexPopContainer, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.android.address.WeexPopContainer, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.s = new BroadcastReceiver() { // from class: com.taobao.android.address.WeexPopEditor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/WeexPopEditor$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                IpChange ipChange3 = WeexPopContainer.$ipChange;
                LoginTLogAdapter.e("addressMap", "onReceive action=" + intent.getAction());
                IpChange ipChange4 = WeexPopEditor.$ipChange;
                if ("closeActionAddress".equals(intent.getAction())) {
                    LoginTLogAdapter.e("addressMap", "before finish activity,receiver CLOSE_ACTION");
                    WeexPopEditor.this.finish();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("closeActionAddress");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.s, intentFilter);
    }

    @Override // com.taobao.android.address.WeexPopContainer, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.s != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.s);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            try {
                initData(intent);
                AdapterForTLog.loge("addressMap", "on new intent address weex2.0 url:" + this.m);
                if (TextUtils.isEmpty(this.m)) {
                    finish();
                } else if (this.c != null) {
                    Weex2StartParams weex2StartParams = new Weex2StartParams();
                    weex2StartParams.setUrl(this.m);
                    weex2StartParams.setEmbedType(TMSEmbedPresentModeType.POP);
                    weex2StartParams.setBgTransparent(Boolean.TRUE);
                    this.c.s(weex2StartParams, TMSEmbedSolutionType.WEEX);
                    AdapterForTLog.loge("addressMap", "reload url = " + this.m);
                } else {
                    AdapterForTLog.loge("addressMap", "tmsEmbed is null,mBundleUrl=" + this.m);
                    if (rf0.k("finishWhenEmbedNull")) {
                        finish();
                        AdapterForTLog.loge("addressMap", "tmsEmbed is null,finish");
                    }
                }
            } catch (Throwable th) {
                AdapterForTLog.loge("addressMap", "address onNewIntent error,", th);
            }
        }
    }
}
