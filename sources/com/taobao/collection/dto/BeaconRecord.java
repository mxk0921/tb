package com.taobao.collection.dto;

import android.bluetooth.BluetoothDevice;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BeaconRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<IBeacon> f10304a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class IBeacon {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bluetoothAddress;
        public int major;
        public int minor;
        public String name;
        public String proximityUuid;
        public int rssi;
        public int txPower;

        static {
            t2o.a(789577791);
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IBeacon)) {
                return false;
            }
            IBeacon iBeacon = (IBeacon) obj;
            String str5 = this.name;
            String str6 = iBeacon.name;
            if ((str5 == str6 || (str5 != null && str5.equals(str6))) && this.major == iBeacon.major && this.minor == iBeacon.minor && (((str = this.proximityUuid) == (str2 = iBeacon.proximityUuid) || (str != null && str.equals(str2))) && (((str3 = this.bluetoothAddress) == (str4 = iBeacon.bluetoothAddress) || (str3 != null && str3.equals(str4))) && this.txPower == iBeacon.txPower && this.rssi == iBeacon.rssi))) {
                return true;
            }
            return false;
        }

        public int getMajor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("27fd26fd", new Object[]{this})).intValue();
            }
            return this.major;
        }

        public int getMinor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3a9f7af9", new Object[]{this})).intValue();
            }
            return this.minor;
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }

        public String getProximityUuid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c5d3055", new Object[]{this});
            }
            return this.proximityUuid;
        }

        public int getRssi() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ba74ec7", new Object[]{this})).intValue();
            }
            return this.rssi;
        }

        public int getTxPower() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7da46fa5", new Object[]{this})).intValue();
            }
            return this.txPower;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.name;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i4 = (((((217 + i) * 31) + this.major) * 31) + this.minor) * 31;
            String str2 = this.proximityUuid;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int i5 = (i4 + i2) * 31;
            String str3 = this.bluetoothAddress;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return ((((i5 + i3) * 31) + this.txPower) * 31) + this.rssi;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IBeacon [name=" + this.name + ", major=" + this.major + ", minor=" + this.minor + ", proximityUuid=" + this.proximityUuid + ", bluetoothAddress=" + this.bluetoothAddress + ", txPower=" + this.txPower + ", rssi=" + this.rssi + "]";
        }
    }

    static {
        t2o.a(789577790);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static IBeacon b(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBeacon) ipChange.ipc$dispatch("67f21a35", new Object[]{bluetoothDevice, new Integer(i), bArr});
        }
        for (int i2 = 2; i2 <= 5; i2++) {
            int i3 = bArr[i2 + 2] & 255;
            if (i3 == 2 && (bArr[i2 + 3] & 255) == 21) {
                IBeacon iBeacon = new IBeacon();
                iBeacon.major = ((bArr[i2 + 20] & 255) * 256) + (bArr[21 + i2] & 255);
                iBeacon.minor = ((bArr[22 + i2] & 255) * 256) + (bArr[i2 + 23] & 255);
                iBeacon.txPower = bArr[i2 + 24];
                iBeacon.rssi = i;
                byte[] bArr2 = new byte[16];
                System.arraycopy(bArr, i2 + 4, bArr2, 0, 16);
                String a2 = a(bArr2);
                iBeacon.proximityUuid = a2.substring(0, 8) + "-" + a2.substring(8, 12) + "-" + a2.substring(12, 16) + "-" + a2.substring(16, 20) + "-" + a2.substring(20, 32);
                if (bluetoothDevice != null) {
                    iBeacon.bluetoothAddress = bluetoothDevice.getAddress();
                    iBeacon.name = bluetoothDevice.getName();
                }
                return iBeacon;
            }
            int i4 = bArr[i2] & 255;
            if (i4 == 45 && (bArr[i2 + 1] & 255) == 36 && i3 == 191 && (bArr[i2 + 3] & 255) == 22) {
                IBeacon iBeacon2 = new IBeacon();
                iBeacon2.major = 0;
                iBeacon2.minor = 0;
                iBeacon2.proximityUuid = "00000000-0000-0000-0000-000000000000";
                iBeacon2.txPower = -55;
                return iBeacon2;
            } else if (i4 == 173 && (bArr[i2 + 1] & 255) == 119 && i3 == 0 && (bArr[i2 + 3] & 255) == 198) {
                IBeacon iBeacon3 = new IBeacon();
                iBeacon3.major = 0;
                iBeacon3.minor = 0;
                iBeacon3.proximityUuid = "00000000-0000-0000-0000-000000000000";
                iBeacon3.txPower = -55;
                return iBeacon3;
            }
        }
        return null;
    }

    public List<IBeacon> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d6485439", new Object[]{this});
        }
        return this.f10304a;
    }

    public void d(List<IBeacon> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3aff4b", new Object[]{this, list});
        } else {
            this.f10304a = list;
        }
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        }
    }
}
