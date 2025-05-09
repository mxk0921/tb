package tb;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d3k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d3k INSTANCE = new d3k();

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f17551a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        ckf.f(charArray, "(this as java.lang.String).toCharArray()");
        f17551a = charArray;
    }

    public final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dddf1d1d", new Object[]{this, bArr});
        }
        ckf.g(bArr, "bytes");
        char[] cArr = new char[(bArr.length * 3) - 1];
        int length = bArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new String(cArr);
            }
            byte b = bArr[length];
            char[] cArr2 = f17551a;
            cArr[((bArr.length - 1) - length) * 3] = cArr2[(b & 255) >>> 4];
            cArr[(((bArr.length - 1) - length) * 3) + 1] = cArr2[b & 15];
            if (length > 0) {
                cArr[(((bArr.length - 1) - length) * 3) + 2] = f7l.CONDITION_IF_MIDDLE;
            }
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a93c5ae", new Object[]{this, str});
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1288598210:
                    if (str.equals("android.nfc.tech.NdefFormatable")) {
                        return "NdefFormatable";
                    }
                    break;
                case -1244773491:
                    if (str.equals("android.nfc.tech.Ndef")) {
                        return "NDEF";
                    }
                    break;
                case -1244771668:
                    if (str.equals("android.nfc.tech.NfcA")) {
                        return "ISO 14443-3A";
                    }
                    break;
                case -1244771667:
                    if (str.equals("android.nfc.tech.NfcB")) {
                        return "ISO 14443-3B";
                    }
                    break;
                case -1244771663:
                    if (str.equals("android.nfc.tech.NfcF")) {
                        return "JIS 6319-4";
                    }
                    break;
                case -1244771647:
                    if (str.equals("android.nfc.tech.NfcV")) {
                        return "ISO 15693";
                    }
                    break;
                case 1401013770:
                    if (str.equals("android.nfc.tech.MifareUltralight")) {
                        return "MifareUltralight";
                    }
                    break;
                case 1456803698:
                    if (str.equals("android.nfc.tech.MifareClassic")) {
                        return "MifareClassic";
                    }
                    break;
                case 1939526272:
                    if (str.equals("android.nfc.tech.IsoDep")) {
                        return "ISO 14443-4";
                    }
                    break;
            }
        }
        return "unKnown";
    }

    public final boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34176ebf", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        return context.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    public final String d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63f22de7", new Object[]{this, bArr});
        }
        ckf.g(bArr, "bytes");
        char[] cArr = new char[(bArr.length * 3) - 1];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = f17551a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            if (i < bArr.length - 1) {
                cArr[i2 + 2] = f7l.CONDITION_IF_MIDDLE;
            }
        }
        return new String(cArr);
    }

    public final boolean e(Context context) {
        NfcAdapter defaultAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54c3966", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        Object systemService = context.getSystemService("nfc");
        if (!(systemService instanceof NfcManager)) {
            systemService = null;
        }
        NfcManager nfcManager = (NfcManager) systemService;
        if (nfcManager == null || (defaultAdapter = nfcManager.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        return true;
    }
}
