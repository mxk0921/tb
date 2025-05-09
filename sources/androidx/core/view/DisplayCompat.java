package androidx.core.view;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DisplayCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    private DisplayCompat() {
    }

    public static Point getCurrentDisplaySizeFromWorkarounds(Context context, Display display) {
        Point point;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("e3aa830c", new Object[]{context, display});
        }
        if (Build.VERSION.SDK_INT < 28) {
            point = parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", display);
        } else {
            point = parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", display);
        }
        if (point != null) {
            return point;
        }
        if (!isSonyBravia4kTv(context) || !isCurrentModeTheLargestMode(display)) {
            return null;
        }
        return new Point(DISPLAY_SIZE_4K_WIDTH, DISPLAY_SIZE_4K_HEIGHT);
    }

    private static Point getDisplaySize(Context context, Display display) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("c1abc7ee", new Object[]{context, display});
        }
        Point currentDisplaySizeFromWorkarounds = getCurrentDisplaySizeFromWorkarounds(context, display);
        if (currentDisplaySizeFromWorkarounds != null) {
            return currentDisplaySizeFromWorkarounds;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static ModeCompat getMode(Context context, Display display) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModeCompat) ipChange.ipc$dispatch("71d433eb", new Object[]{context, display});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getMode(context, display);
        }
        return new ModeCompat(getDisplaySize(context, display));
    }

    public static ModeCompat[] getSupportedModes(Context context, Display display) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModeCompat[]) ipChange.ipc$dispatch("4f90abbd", new Object[]{context, display});
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getSupportedModes(context, display);
        }
        return new ModeCompat[]{getMode(context, display)};
    }

    public static boolean isCurrentModeTheLargestMode(Display display) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8775e822", new Object[]{display})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.isCurrentModeTheLargestMode(display);
        }
        return true;
    }

    private static Point parsePhysicalDisplaySizeFromSystemProperties(String str, Display display) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("fd69acec", new Object[]{str, display});
        }
        if (display.getDisplayId() != 0) {
            return null;
        }
        String systemProperty = getSystemProperty(str);
        if (!TextUtils.isEmpty(systemProperty) && systemProperty != null) {
            try {
                return parseDisplaySize(systemProperty);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static ModeCompat getMode(Context context, Display display) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ModeCompat) ipChange.ipc$dispatch("71d433eb", new Object[]{context, display});
            }
            Display.Mode mode = display.getMode();
            Point currentDisplaySizeFromWorkarounds = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds == null || physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                return new ModeCompat(mode, true);
            }
            return new ModeCompat(mode, currentDisplaySizeFromWorkarounds);
        }

        public static ModeCompat[] getSupportedModes(Context context, Display display) {
            ModeCompat modeCompat;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ModeCompat[]) ipChange.ipc$dispatch("4f90abbd", new Object[]{context, display});
            }
            Display.Mode[] supportedModes = display.getSupportedModes();
            ModeCompat[] modeCompatArr = new ModeCompat[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point currentDisplaySizeFromWorkarounds = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds == null || physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    modeCompatArr[i] = new ModeCompat(supportedModes[i], physicalSizeEquals(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    if (physicalSizeEquals(supportedModes[i2], mode)) {
                        modeCompat = new ModeCompat(supportedModes[i2], currentDisplaySizeFromWorkarounds);
                    } else {
                        modeCompat = new ModeCompat(supportedModes[i2], false);
                    }
                    modeCompatArr[i2] = modeCompat;
                }
            }
            return modeCompatArr;
        }

        public static boolean isCurrentModeTheLargestMode(Display display) {
            Display.Mode[] supportedModes;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8775e822", new Object[]{display})).booleanValue();
            }
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean physicalSizeEquals(Display.Mode mode, Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f9db4a9b", new Object[]{mode, point})).booleanValue();
            }
            if (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) {
                return true;
            }
            return mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x;
        }

        public static boolean physicalSizeEquals(Display.Mode mode, Display.Mode mode2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34d436a2", new Object[]{mode, mode2})).booleanValue() : mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isSonyBravia4kTv(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac9004be", new Object[]{context})).booleanValue();
        }
        return isTv(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean isTv(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d1fb59", new Object[]{context})).booleanValue();
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point parseDisplaySize(String str) throws NumberFormatException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("1b38f198", new Object[]{str});
        }
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ModeCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean mIsNative;
        private final Display.Mode mMode;
        private final Point mPhysicalSize;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public static class Api23Impl {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private Api23Impl() {
            }

            public static int getPhysicalHeight(Display.Mode mode) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("e8f686ca", new Object[]{mode})).intValue();
                }
                return mode.getPhysicalHeight();
            }

            public static int getPhysicalWidth(Display.Mode mode) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("41e47885", new Object[]{mode})).intValue();
                }
                return mode.getPhysicalWidth();
            }
        }

        public ModeCompat(Point point) {
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = null;
            this.mIsNative = true;
        }

        public int getPhysicalHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3eb7684e", new Object[]{this})).intValue();
            }
            return this.mPhysicalSize.y;
        }

        public int getPhysicalWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eb802773", new Object[]{this})).intValue();
            }
            return this.mPhysicalSize.x;
        }

        @Deprecated
        public boolean isNative() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a5eedec", new Object[]{this})).booleanValue();
            }
            return this.mIsNative;
        }

        public Display.Mode toMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return cr7.a(ipChange.ipc$dispatch("e812b287", new Object[]{this}));
            }
            return this.mMode;
        }

        public ModeCompat(Display.Mode mode, boolean z) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.mPhysicalSize = new Point(Api23Impl.getPhysicalWidth(mode), Api23Impl.getPhysicalHeight(mode));
            this.mMode = mode;
            this.mIsNative = z;
        }

        public ModeCompat(Display.Mode mode, Point point) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = mode;
            this.mIsNative = true;
        }
    }
}
