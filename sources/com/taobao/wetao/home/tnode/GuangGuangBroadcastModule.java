package com.taobao.wetao.home.tnode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GuangGuangBroadcastModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, NormalBroadcastReceiver> receivers = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class NormalBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<JSCallback> f14157a = new ArrayList<>();

        public NormalBroadcastReceiver(GuangGuangBroadcastModule guangGuangBroadcastModule) {
        }

        public static /* synthetic */ Object ipc$super(NormalBroadcastReceiver normalBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/home/tnode/GuangGuangBroadcastModule$NormalBroadcastReceiver");
        }

        public void a(JSCallback jSCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aacfbfdb", new Object[]{this, jSCallback});
            } else {
                this.f14157a.add(jSCallback);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                Bundle extras = intent.getExtras();
                JSONObject jSONObject = null;
                if (extras != null) {
                    Set<String> keySet = extras.keySet();
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str2 : keySet) {
                        Object obj = extras.get(str2);
                        if (obj == null) {
                            str = null;
                        } else {
                            str = obj.toString();
                        }
                        jSONObject2.put(str2, (Object) str);
                    }
                    jSONObject = jSONObject2;
                }
                Iterator<JSCallback> it = this.f14157a.iterator();
                while (it.hasNext()) {
                    it.next().invokeAndKeepAlive(jSONObject);
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(GuangGuangBroadcastModule guangGuangBroadcastModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/home/tnode/GuangGuangBroadcastModule");
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        Collection<NormalBroadcastReceiver> values = this.receivers.values();
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.mWXSDKInstance.getContext());
        if (values != null) {
            for (NormalBroadcastReceiver normalBroadcastReceiver : values) {
                instance.unregisterReceiver(normalBroadcastReceiver);
            }
        }
        this.receivers.clear();
    }

    @JSMethod(alias = "registerBroadcast")
    public void registerBroadcast(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414520b9", new Object[]{this, str, jSCallback});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.mWXSDKInstance.getContext());
        NormalBroadcastReceiver normalBroadcastReceiver = this.receivers.get(str);
        if (normalBroadcastReceiver == null) {
            normalBroadcastReceiver = new NormalBroadcastReceiver(this);
            this.receivers.put(str, normalBroadcastReceiver);
            instance.registerReceiver(normalBroadcastReceiver, new IntentFilter(str));
        }
        normalBroadcastReceiver.a(jSCallback);
    }

    @JSMethod(alias = "unregisterBroadcast")
    public void unRegisterBroadcast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f893a096", new Object[]{this, str});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.mWXSDKInstance.getContext());
        NormalBroadcastReceiver remove = this.receivers.remove(str);
        if (remove != null) {
            instance.unregisterReceiver(remove);
        }
    }
}
