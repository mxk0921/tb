package com.taobao.taobaoavsdk.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.WeakHashMap;
import tb.feh;
import tb.kjb;
import tb.t2o;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BluetoothStateBroadcastReceive extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12972a;
    public BLUESTATUS c;
    public BluetoothAdapter d;
    public final feh g;
    public final WeakHashMap<kjb, Boolean> b = new WeakHashMap<>();
    public int e = 0;
    public int f = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum BLUESTATUS {
        NOTOPEN,
        NOTCONNECT,
        NOTCONNECT_NOT_SETAVSYNC,
        CONNECT,
        CONNECT_NOT_SETAVSYNC;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BLUESTATUS bluestatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/util/BluetoothStateBroadcastReceive$BLUESTATUS");
        }

        public static BLUESTATUS valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BLUESTATUS) ipChange.ipc$dispatch("419a3e61", new Object[]{str});
            }
            return (BLUESTATUS) Enum.valueOf(BLUESTATUS.class, str);
        }
    }

    static {
        t2o.a(774897953);
    }

    public BluetoothStateBroadcastReceive(String str) {
        this.f12972a = false;
        this.c = BLUESTATUS.NOTOPEN;
        this.d = null;
        this.g = new feh(toString(), str);
        if (this.d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.d = defaultAdapter;
            int profileConnectionState = defaultAdapter.getProfileConnectionState(1);
            if (this.d.getProfileConnectionState(2) == 2 || profileConnectionState == 2) {
                this.c = BLUESTATUS.CONNECT;
                this.f12972a = true;
                return;
            }
            this.c = BLUESTATUS.NOTCONNECT;
            this.f12972a = false;
        }
    }

    public static /* synthetic */ Object ipc$super(BluetoothStateBroadcastReceive bluetoothStateBroadcastReceive, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/util/BluetoothStateBroadcastReceive");
    }

    public void a(kjb kjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fccb74", new Object[]{this, kjbVar});
            return;
        }
        synchronized (BluetoothStateBroadcastReceive.class) {
            if (kjbVar != null) {
                try {
                    this.b.put(kjbVar, Boolean.TRUE);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public BLUESTATUS b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BLUESTATUS) ipChange.ipc$dispatch("5da1b83b", new Object[]{this});
        }
        if (this.d == null) {
            this.d = BluetoothAdapter.getDefaultAdapter();
        }
        int profileConnectionState = this.d.getProfileConnectionState(1);
        if (this.d.getProfileConnectionState(2) == 2 || profileConnectionState == 2) {
            this.c = BLUESTATUS.CONNECT;
            this.f12972a = true;
        } else {
            this.c = BLUESTATUS.NOTCONNECT;
            this.f12972a = false;
        }
        return this.c;
    }

    public void c(kjb kjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e2beb3", new Object[]{this, kjbVar});
            return;
        }
        synchronized (BluetoothStateBroadcastReceive.class) {
            if (kjbVar != null) {
                try {
                    this.b.remove(kjbVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        feh fehVar = this.g;
        AVSDKLog.e(fehVar, "BluetoothReceiver onReceive" + intent.getAction() + "mListenersWeakMap size is" + this.b.size());
        synchronized (BluetoothStateBroadcastReceive.class) {
            try {
                String action = intent.getAction();
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                switch (action.hashCode()) {
                    case -1692127708:
                        if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1530327060:
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -301431627:
                        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 545516589:
                        if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1821585647:
                        if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c == 3) {
                                this.e = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                                feh fehVar2 = this.g;
                                AVSDKLog.e(fehVar2, "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED: " + this.e);
                                int i = this.e;
                                if (i == 2) {
                                    if (!this.f12972a) {
                                        for (kjb kjbVar : this.b.keySet()) {
                                            if (kjbVar instanceof TaobaoMediaPlayer) {
                                                ((TaobaoMediaPlayer) kjbVar).setBluetoothStatus(true);
                                            }
                                        }
                                        this.c = BLUESTATUS.CONNECT;
                                        this.f12972a = true;
                                    }
                                } else if (i == 0 && this.f12972a) {
                                    for (kjb kjbVar2 : this.b.keySet()) {
                                        if (kjbVar2 instanceof TaobaoMediaPlayer) {
                                            ((TaobaoMediaPlayer) kjbVar2).setBluetoothStatus(false);
                                        }
                                    }
                                    this.c = BLUESTATUS.NOTCONNECT;
                                    this.f12972a = false;
                                }
                            } else if (c == 4) {
                                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                                int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                                feh fehVar3 = this.g;
                                AVSDKLog.e(fehVar3, "ACTION_SCO_AUDIO_STATE_UPDATED, state: " + intExtra + ", prev state: " + intExtra2);
                                if (intExtra == 0 && this.f != -1 && intExtra2 == 1 && this.f12972a) {
                                    AVSDKLog.e(this.g, "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is disconnected");
                                    for (kjb kjbVar3 : this.b.keySet()) {
                                        if (kjbVar3 instanceof TaobaoMediaPlayer) {
                                            ((TaobaoMediaPlayer) kjbVar3).setBluetoothStatus(false);
                                        }
                                    }
                                    this.c = BLUESTATUS.NOTCONNECT;
                                    this.f12972a = false;
                                }
                                this.f = intExtra;
                                if (intExtra == 1 && intExtra2 == 2) {
                                    AVSDKLog.e(this.g, "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is connected");
                                    if (!this.f12972a) {
                                        for (kjb kjbVar4 : this.b.keySet()) {
                                            if (kjbVar4 instanceof TaobaoMediaPlayer) {
                                                ((TaobaoMediaPlayer) kjbVar4).setBluetoothStatus(true);
                                            }
                                        }
                                        this.c = BLUESTATUS.CONNECT;
                                        this.f12972a = true;
                                    }
                                }
                            }
                        } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 10 && this.f12972a) {
                            for (kjb kjbVar5 : this.b.keySet()) {
                                if (kjbVar5 instanceof TaobaoMediaPlayer) {
                                    ((TaobaoMediaPlayer) kjbVar5).setBluetoothStatus(false);
                                }
                            }
                            this.c = BLUESTATUS.NOTCONNECT;
                            this.f12972a = false;
                        }
                    } else if (this.f12972a) {
                        for (kjb kjbVar6 : this.b.keySet()) {
                            if (kjbVar6 instanceof TaobaoMediaPlayer) {
                                ((TaobaoMediaPlayer) kjbVar6).setBluetoothStatus(false);
                            }
                        }
                        this.c = BLUESTATUS.NOTCONNECT;
                        this.f12972a = false;
                    }
                } else if (!this.f12972a) {
                    for (kjb kjbVar7 : this.b.keySet()) {
                        if (kjbVar7 instanceof TaobaoMediaPlayer) {
                            ((TaobaoMediaPlayer) kjbVar7).setBluetoothStatus(true);
                        }
                    }
                    this.c = BLUESTATUS.CONNECT;
                    this.f12972a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
