package tb;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class sv0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static sv0 b = null;

    /* renamed from: a  reason: collision with root package name */
    public final c f28292a = new c(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements qtg<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f28293a;
        public final /* synthetic */ int b;

        public a(sv0 sv0Var, int i, int i2) {
            this.f28293a = i;
            this.b = i2;
        }

        /* renamed from: a */
        public boolean b(Camera.Size size) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6d4de309", new Object[]{this, size})).booleanValue();
            }
            int i3 = size.width;
            int i4 = this.f28293a;
            if (i3 <= i4 && (i = size.height) <= i4 && i3 >= (i2 = this.b) && i >= i2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements Comparable<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f28294a;
        public SizeF b;

        static {
            t2o.a(245366906);
        }

        public b(int i, SizeF sizeF) {
            this.f28294a = i;
            this.b = sizeF;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb0ce1d0", new Object[]{this, bVar})).intValue();
            }
            int i = ((bVar.b() - b()) > 0L ? 1 : ((bVar.b() - b()) == 0L ? 0 : -1));
            if (i == 0) {
                return this.f28294a - bVar.f28294a;
            }
            if (i > 0) {
                return 1;
            }
            return -1;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
            }
            return this.b.getWidth() * 100000.0f * this.b.getHeight() * 100000.0f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(245366907);
        }

        public c(sv0 sv0Var) {
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40f1fdcb", new Object[]{this, size, size2})).intValue();
            }
            int i = size.width;
            int i2 = size2.width;
            if (i == i2) {
                return 0;
            }
            if (i > i2) {
                return 1;
            }
            return -1;
        }
    }

    static {
        t2o.a(245366904);
    }

    public static int a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631d0b85", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 <= 1) {
            return 0;
        }
        if (i2 <= 2) {
            return i;
        }
        return b(context, i, i2);
    }

    public static int b(Context context, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84cca5ef", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            String[] cameraIdList = cameraManager.getCameraIdList();
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                if (i == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (intValue == i3) {
                    arrayList.add(new b(Integer.parseInt(str), (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)));
                }
            }
            Collections.sort(arrayList);
            if (((b) arrayList.get(0)).f28294a >= i2) {
                return i;
            }
            return ((b) arrayList.get(0)).f28294a;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static <T> List<T> c(List<T> list, qtg<T> qtgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("741fc071", new Object[]{list, qtgVar});
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (((a) qtgVar).b(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bc469fa", new Object[0])).intValue();
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static synchronized sv0 f() {
        synchronized (sv0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sv0) ipChange.ipc$dispatch("4c938560", new Object[0]);
            }
            sv0 sv0Var = b;
            if (sv0Var != null) {
                return sv0Var;
            }
            sv0 sv0Var2 = new sv0();
            b = sv0Var2;
            return sv0Var2;
        }
    }

    public Camera.Size e(List<Camera.Size> list, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("d78ac8b", new Object[]{this, list, new Float(f), new Integer(i), new Integer(i2)});
        }
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f28292a);
        List c2 = c(list, new a(this, i2, i));
        if (c2.isEmpty()) {
            return list.get(list.size() - 1);
        }
        for (int size = c2.size() - 1; size >= 0; size--) {
            Camera.Size size2 = (Camera.Size) c2.get(size);
            if (Math.min(Math.abs((size2.width / size2.height) - f), Math.abs((size2.height / size2.width) - f)) <= 0.2f) {
                return size2;
            }
        }
        return (Camera.Size) c2.get(c2.size() - 1);
    }
}
