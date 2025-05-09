package tb;

import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.jsbridge.api.WVBase;
import android.taobao.windvane.jsbridge.api.WVBluetooth;
import android.taobao.windvane.jsbridge.api.WVBluetoothSilence;
import android.taobao.windvane.jsbridge.api.WVBroadcastChannel;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.jsbridge.api.WVContacts;
import android.taobao.windvane.jsbridge.api.WVCookie;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.taobao.windvane.jsbridge.api.WVImage;
import android.taobao.windvane.jsbridge.api.WVLocation;
import android.taobao.windvane.jsbridge.api.WVMotion;
import android.taobao.windvane.jsbridge.api.WVNativeDetector;
import android.taobao.windvane.jsbridge.api.WVNativeLog;
import android.taobao.windvane.jsbridge.api.WVNetwork;
import android.taobao.windvane.jsbridge.api.WVNotification;
import android.taobao.windvane.jsbridge.api.WVPrefetch;
import android.taobao.windvane.jsbridge.api.WVScreen;
import android.taobao.windvane.jsbridge.api.WVUI;
import android.taobao.windvane.jsbridge.api.WVUIActionSheet;
import android.taobao.windvane.jsbridge.api.WVUIDialog;
import android.taobao.windvane.jsbridge.api.WVUIToast;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18004a = false;

    static {
        t2o.a(989856246);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
        } else if (!f18004a) {
            f18004a = true;
            WVJsBridge.g().i();
            fsw.h("Base", WVBase.class);
            fsw.h("WVLocation", WVLocation.class);
            fsw.h("WVMotion", WVMotion.class);
            fsw.h("WVCookie", WVCookie.class);
            fsw.h("WVCamera", WVCamera.class);
            fsw.h("WVUI", WVUI.class);
            fsw.h("WVNotification", WVNotification.class);
            fsw.h("WVNetwork", WVNetwork.class);
            fsw.h("WVUIToast", WVUIToast.class);
            fsw.h("WVUIDialog", WVUIDialog.class);
            fsw.h("WVUIActionSheet", WVUIActionSheet.class);
            fsw.h("WVContacts", WVContacts.class);
            fsw.h("WVStandardEventCenter", WVStandardEventCenter.class);
            fsw.h("WVFile", WVFile.class);
            fsw.h("WVScreen", WVScreen.class);
            fsw.i("WVNativeDetector", WVNativeDetector.class, true);
            fsw.i("WVBluetooth", WVBluetooth.class, true);
            fsw.i("WVBluetoothSilence", WVBluetoothSilence.class, true);
            fsw.i("WVBroadcast", WVBroadcastChannel.class, true);
            fsw.h("Prefetch", WVPrefetch.class);
            fsw.h("WVImage", WVImage.class);
            fsw.h("WVNativeLog", WVNativeLog.class);
            gqw.a();
        }
    }
}
