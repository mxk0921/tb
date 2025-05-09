package com.taobao.android.icart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import tb.f8e;
import tb.hav;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MainAddCartEventHandler extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<f8e> f7947a;

    static {
        t2o.a(478150674);
    }

    public MainAddCartEventHandler(f8e f8eVar) {
        this.f7947a = new WeakReference<>(f8eVar);
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3d42b2", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("isAd");
            String string2 = jSONObject.getString("EURL");
            if (string2 != null && string != null) {
                AlimamaAdvertising.instance().handleAdUrlForClickid(string2, "1".equals(jSONObject.getString("sku")));
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MainAddCartEventHandler mainAddCartEventHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/MainAddCartEventHandler");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        c();
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this, new IntentFilter("DXMainAddCart"));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Fragment R;
        JSONObject jSONObject;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        f8e f8eVar = this.f7947a.get();
        if (f8eVar != null && (R = f8eVar.g().R()) != null && (jSONObject = (JSONObject) intent.getSerializableExtra("data")) != null && (dXRuntimeContext = (DXRuntimeContext) jSONObject.get("runtimeContext")) != null && dXRuntimeContext.D() != null && R.isResumed()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            b(jSONObject2);
            hav.d("MainAddCartEventHandler", "DX本地广播加购");
            AddCartUtil.d(f8eVar.g(), jSONObject2, AddCartUtil.FEED_FLOW_MODULE, true);
        }
    }
}
