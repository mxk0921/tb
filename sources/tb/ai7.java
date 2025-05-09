package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ai7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CPU_ARCH = "cpuArch";
    public static final String KEY_CPU_BRAND = "cpuBrand";
    public static final String KEY_CPU_COUNT = "cpuCount";
    public static final String KEY_CPU_MAX_FREQ = "cpuMaxFreq";
    public static final String KEY_CPU_MIN_FREQ = "cpuMinFreq";
    public static final String KEY_CPU_NAME = "cpuName";
    public static final String KEY_CPU_SCORE = "cpuScore";
    public static final String KEY_DEVICE_LEVEL = "deviceLevel";
    public static final String KEY_DISPLAY_DENSITY = "displayDensity";
    public static final String KEY_DISPLAY_HEIGHT = "displayHeight";
    public static final String KEY_DISPLAY_WIDTH = "displayWidth";
    public static final String KEY_EGL_SCORE = "eglScore";
    public static final String KEY_EGL_VERSION = "eglVersion";
    public static final String KEY_GPU_BRAND = "gpuBrand";
    public static final String KEY_GPU_FREQ = "gpuFreq";
    public static final String KEY_GPU_NAME = "gpuName";
    public static final String KEY_GPU_SCORE = "gpuScore";
    public static final String KEY_MEM_DEVICE_TOTAL = "memDeviceTotal";
    public static final String KEY_MEM_LIMITED_HEAP = "memLimitedHeap";
    public static final String KEY_MEM_LIMITED_LARGE_HEAP = "memLimitedLargeHeap";
    public static final String KEY_MEM_SCORE = "memScore";
    public static final String KEY_MOBILE_MODEL = "mobileModel";
    public static final String KEY_NEW_SCORE = "newDeviceScore";
    public static final String KEY_OLD_SCORE = "oldDeviceScore";

    /* renamed from: a  reason: collision with root package name */
    public final e81 f15758a = e81.b();

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7648ed", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_CPU_ARCH, str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fba512", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_CPU_BRAND, str);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d690e33", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_CPU_COUNT, i);
        }
    }

    public void d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac0f8a3", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_CPU_MAX_FREQ, f);
        }
    }

    public void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77082375", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_CPU_MIN_FREQ, f);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49fb0f34", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_CPU_NAME, str);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9841a90", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_CPU_SCORE, i);
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af9d0", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e("deviceLevel", i);
        }
    }

    public void i(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fba651", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_DISPLAY_DENSITY, f);
        }
    }

    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cef4932", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_DISPLAY_HEIGHT, f);
        }
    }

    public void k(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a3f033", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_DISPLAY_WIDTH, f);
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25410e72", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_EGL_SCORE, i);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d9fa01", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_EGL_VERSION, str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae538e", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_GPU_BRAND, str);
        }
    }

    public void o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e894c6d7", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_GPU_FREQ, f);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cadbdb0", new Object[]{this, str});
        } else {
            this.f15758a.g(KEY_GPU_NAME, str);
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83903494", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_GPU_SCORE, i);
        }
    }

    public void r(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e08d582", new Object[]{this, new Long(j)});
        } else {
            this.f15758a.f(KEY_MEM_DEVICE_TOTAL, j);
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d138a9", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_MEM_LIMITED_HEAP, i);
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0e13dc", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_MEM_LIMITED_LARGE_HEAP, i);
        }
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edaaa7d", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_MEM_SCORE, i);
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b19dab6", new Object[]{this, str});
        } else {
            this.f15758a.g("mobileModel", str);
        }
    }

    public void w(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4ca145", new Object[]{this, new Float(f)});
        } else {
            this.f15758a.d(KEY_NEW_SCORE, f);
        }
    }

    public void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd57385", new Object[]{this, new Integer(i)});
        } else {
            this.f15758a.e(KEY_OLD_SCORE, i);
        }
    }
}
