package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class QRCode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NUM_MASK_PATTERNS = 8;

    /* renamed from: a  reason: collision with root package name */
    public Mode f3637a;
    public ErrorCorrectionLevel b;
    public Version c;
    public int d = -1;
    public ByteMatrix e;

    public static boolean isValidMaskPattern(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9bc03ee", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= 8) {
            return false;
        }
        return true;
    }

    public final ErrorCorrectionLevel getECLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorCorrectionLevel) ipChange.ipc$dispatch("1fee4b5b", new Object[]{this});
        }
        return this.b;
    }

    public final int getMaskPattern() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17cb4f48", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final ByteMatrix getMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteMatrix) ipChange.ipc$dispatch("2ee1177", new Object[]{this});
        }
        return this.e;
    }

    public final Mode getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("1778701f", new Object[]{this});
        }
        return this.f3637a;
    }

    public final Version getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Version) ipChange.ipc$dispatch("6a098733", new Object[]{this});
        }
        return this.c;
    }

    public final void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7fcc29", new Object[]{this, errorCorrectionLevel});
        } else {
            this.b = errorCorrectionLevel;
        }
    }

    public final void setMaskPattern(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859ba35a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void setMatrix(ByteMatrix byteMatrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137c847f", new Object[]{this, byteMatrix});
        } else {
            this.e = byteMatrix;
        }
    }

    public final void setMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b3dc663", new Object[]{this, mode});
        } else {
            this.f3637a = mode;
        }
    }

    public final void setVersion(Version version) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365ac03", new Object[]{this, version});
        } else {
            this.c = version;
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.f3637a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
