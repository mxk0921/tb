package а.а.а.а.а.б;

/* renamed from: а.а.а.а.а.б.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1122 {

    /* renamed from: а  reason: contains not printable characters */
    private static final char[] f1679 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: а  reason: contains not printable characters */
    public static String m1125(byte[] bArr) {
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

    /* renamed from: б  reason: contains not printable characters */
    public static String m1126(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append(f1679[(bArr[i] >> 4) & 15]);
            sb.append(f1679[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: в  reason: contains not printable characters */
    public static byte[] m1127(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
