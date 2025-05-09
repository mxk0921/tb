package tb;

import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qd8 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(str);
            ByteBuffer allocate = ByteBuffer.allocate(str.length() / 2);
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                i += 2;
                allocate.put((byte) (Integer.parseInt(stringBuffer.substring(i2, i), 16) | (Integer.parseInt(stringBuffer.substring(i, i2), 16) << 4)));
            }
            byte[] array = allocate.array();
            for (int i3 = 0; i3 < array.length; i3++) {
                if (i3 == array.length - 1) {
                    int length = array.length - 1;
                    array[length] = (byte) (array[length] ^ 98);
                } else {
                    byte b = array[i3];
                    byte b2 = array[i3 + 1];
                    if (b != b2) {
                        array[i3] = (byte) (b ^ b2);
                    }
                }
            }
            for (int length2 = array.length - 1; length2 >= 0; length2--) {
                if (length2 == 0) {
                    array[0] = (byte) (array[0] ^ 69);
                } else {
                    byte b3 = array[length2];
                    byte b4 = array[length2 - 1];
                    if (b3 != b4) {
                        array[length2] = (byte) (b3 ^ b4);
                    }
                }
            }
            return new String(array, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                bytes[0] = (byte) (bytes[0] ^ 69);
            } else {
                byte b = bytes[i];
                byte b2 = bytes[i - 1];
                if (b != b2) {
                    bytes[i] = (byte) (b ^ b2);
                }
            }
        }
        int i2 = length - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            if (i3 == i2) {
                bytes[i3] = (byte) (bytes[i3] ^ 98);
            } else {
                byte b3 = bytes[i3];
                byte b4 = bytes[i3 + 1];
                if (b3 != b4) {
                    bytes[i3] = (byte) (b3 ^ b4);
                }
            }
        }
        String str2 = "";
        for (int i4 = 0; i4 < length; i4++) {
            str2 = str2 + Integer.toHexString((bytes[i4] & 255) | InputDeviceCompat.SOURCE_ANY).substring(6);
        }
        return str2;
    }
}
