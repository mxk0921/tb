package tb;

import android.app.Application;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver.TbAreaSwitchBroadcastReceiver;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver.TbRevisionSwitchBroadcastReceiver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ul2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TbAreaSwitchBroadcastReceiver f29461a;
    public TbRevisionSwitchBroadcastReceiver b;

    static {
        t2o.a(491782758);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af0e3a", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 == null) {
            fve.e("BroadcastRegister", "context == null || receiver == null,context: " + a2);
            return;
        }
        this.f29461a = new TbAreaSwitchBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
        try {
            a2.registerReceiver(this.f29461a, intentFilter);
        } catch (Exception e) {
            fve.c("BroadcastRegister", "registerAreaChangeReceiver error", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a30488", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 == null) {
            fve.e("BroadcastRegister", "context == null");
            return;
        }
        this.b = new TbRevisionSwitchBroadcastReceiver();
        try {
            LocalBroadcastManager.getInstance(a2).registerReceiver(this.b, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        } catch (Exception e) {
            fve.c("BroadcastRegister", "registerAreaChangeReceiver error", e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2cd733", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 == null) {
            fve.e("BroadcastRegister", "context == null || receiver == null,context: " + a2);
            return;
        }
        try {
            a2.unregisterReceiver(this.f29461a);
        } catch (Exception e) {
            fve.c("BroadcastRegister", "unRegisterAreaChangeReceiver error", e);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b1a901", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 == null) {
            fve.e("BroadcastRegister", "context == null");
            return;
        }
        try {
            LocalBroadcastManager.getInstance(a2).unregisterReceiver(this.b);
        } catch (Exception e) {
            fve.c("BroadcastRegister", "unRegisterAreaChangeReceiver error", e);
        }
    }
}
