package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class Utf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Utf8 DEFAULT;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DecodeUtil {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void handleFourBytes(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a787a457", new Object[]{new Byte(b), new Byte(b2), new Byte(b3), new Byte(b4), cArr, new Integer(i)});
            } else if (isNotTrailingByte(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || isNotTrailingByte(b3) || isNotTrailingByte(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            } else {
                int trailingByteValue = ((b & 7) << 18) | (trailingByteValue(b2) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4);
                cArr[i] = highSurrogate(trailingByteValue);
                cArr[i + 1] = lowSurrogate(trailingByteValue);
            }
        }

        public static void handleOneByte(byte b, char[] cArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2efb98c", new Object[]{new Byte(b), cArr, new Integer(i)});
            } else {
                cArr[i] = (char) b;
            }
        }

        public static void handleThreeBytes(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98e51b7b", new Object[]{new Byte(b), new Byte(b2), new Byte(b3), cArr, new Integer(i)});
            } else if (isNotTrailingByte(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || isNotTrailingByte(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            } else {
                cArr[i] = (char) (((b & 15) << 12) | (trailingByteValue(b2) << 6) | trailingByteValue(b3));
            }
        }

        public static void handleTwoBytes(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834c03ed", new Object[]{new Byte(b), new Byte(b2), cArr, new Integer(i)});
            } else if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (!isNotTrailingByte(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | trailingByteValue(b2));
            } else {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
        }

        private static char highSurrogate(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Character) ipChange.ipc$dispatch("c27b75b3", new Object[]{new Integer(i)})).charValue();
            }
            return (char) ((i >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("47f6060c", new Object[]{new Byte(b)})).booleanValue();
            }
            if (b > -65) {
                return true;
            }
            return false;
        }

        public static boolean isOneByte(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e3e9f95", new Object[]{new Byte(b)})).booleanValue();
            }
            if (b >= 0) {
                return true;
            }
            return false;
        }

        public static boolean isThreeBytes(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6cf33542", new Object[]{new Byte(b)})).booleanValue();
            }
            if (b < -16) {
                return true;
            }
            return false;
        }

        public static boolean isTwoBytes(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e59b5f0", new Object[]{new Byte(b)})).booleanValue();
            }
            if (b < -32) {
                return true;
            }
            return false;
        }

        private static char lowSurrogate(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Character) ipChange.ipc$dispatch("299f5be5", new Object[]{new Integer(i)})).charValue();
            }
            return (char) ((i & 1023) + 56320);
        }

        private static int trailingByteValue(byte b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6b3309b", new Object[]{new Byte(b)})).intValue() : b & 63;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static Utf8 getDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Utf8) ipChange.ipc$dispatch("7eeb4611", new Object[0]);
        }
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68093d3", new Object[]{utf8});
        } else {
            DEFAULT = utf8;
        }
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i2);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
