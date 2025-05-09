package com.taobao.android.behavix.postureCenter.services.info;

import android.hardware.SensorEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a74;
import tb.bjj;
import tb.cqv;
import tb.it1;
import tb.nbp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DevicesDelegate extends it1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DevicesDelegate i = null;
    public nbp e;
    public String b = "none";
    public Integer[] c = {-1, -1};
    public Integer[] d = {-1, -1};
    public boolean f = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final c g = new c(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface OpenSource {
        public static final String GLOBAL = "global";
        public static final String NONE = "none";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/DevicesDelegate$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            if (DevicesDelegate.c(DevicesDelegate.this) != null) {
                DevicesDelegate.c(DevicesDelegate.this).e(DevicesDelegate.e(DevicesDelegate.this));
            }
            DevicesDelegate.c(DevicesDelegate.this).o(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/DevicesDelegate$2");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (DevicesDelegate.c(DevicesDelegate.this) != null) {
                DevicesDelegate.c(DevicesDelegate.this).k();
                DevicesDelegate.c(DevicesDelegate.this).n(DevicesDelegate.e(DevicesDelegate.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements a74.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DevicesDelegate f6461a;
        public final ArrayList<float[]> b = new ArrayList<>();
        public final ArrayList<float[]> c = new ArrayList<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements bjj<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.bjj
            public /* synthetic */ void onSuccess(Integer[] numArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, numArr});
                } else {
                    a(numArr);
                }
            }

            public void a(Integer[] numArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e57122a", new Object[]{this, numArr});
                } else if (numArr != null && numArr.length > 0) {
                    TLog.logd("BX", "DevicesService", "endBatchCollection move res:" + numArr[0]);
                    DevicesDelegate.f(c.this.f6461a, numArr);
                    HashMap hashMap = new HashMap();
                    hashMap.put("move_state", String.valueOf(numArr[0]));
                    hashMap.put("BXInnerCall", "true");
                    cqv.i("BehaviX", "move_states", null, hashMap, "");
                }
            }
        }

        static {
            t2o.a(404750590);
            t2o.a(404750561);
        }

        public c(DevicesDelegate devicesDelegate) {
            this.f6461a = devicesDelegate;
        }

        @Override // tb.a74.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fec0be3d", new Object[]{this});
                return;
            }
            this.b.clear();
            this.c.clear();
            TLog.logd("BX", "DevicesService", "startBatchCollection");
        }

        @Override // tb.a74.d
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9929cd24", new Object[]{this});
                return;
            }
            TLog.logd("BX", "DevicesService", "endBatchCollection");
            float[][] fArr = new float[this.b.size()];
            for (int i = 0; i < this.b.size(); i++) {
                fArr[i] = this.b.get(i);
            }
            SimpleNetBridge.predictDeviceStatusAsync(fArr, new a());
            float[][] fArr2 = new float[this.c.size()];
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                fArr2[i2] = this.c.get(i2);
            }
            SimpleNetBridge.predictMoveStatusAsync(fArr2, new b());
        }

        @Override // tb.a74.d
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (sensorEvent.sensor.getType() == 9) {
                float[] fArr = sensorEvent.values;
                this.b.add(Arrays.copyOf(fArr, fArr.length));
            } else if (sensorEvent.sensor.getType() == 10) {
                float[] fArr2 = sensorEvent.values;
                this.c.add(Arrays.copyOf(fArr2, fArr2.length));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements bjj<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.bjj
            public /* synthetic */ void onSuccess(Integer[] numArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, numArr});
                } else {
                    a(numArr);
                }
            }

            public void a(Integer[] numArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e57122a", new Object[]{this, numArr});
                } else if (numArr != null && numArr.length > 1) {
                    TLog.logd("BX", "DevicesService", "endBatchCollection devices res:" + numArr[0] + "isStable:" + numArr[1]);
                    DevicesDelegate.d(c.this.f6461a, numArr);
                    HashMap hashMap = new HashMap();
                    hashMap.put("device_state", String.valueOf(numArr[0]));
                    hashMap.put("is_stable", String.valueOf(numArr[1]));
                    hashMap.put("BXInnerCall", "true");
                    cqv.i("BehaviX", "device_states", null, hashMap, "");
                }
            }
        }
    }

    static {
        t2o.a(404750587);
    }

    public static /* synthetic */ nbp c(DevicesDelegate devicesDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbp) ipChange.ipc$dispatch("cc08f837", new Object[]{devicesDelegate});
        }
        return devicesDelegate.e;
    }

    public static /* synthetic */ Integer[] d(DevicesDelegate devicesDelegate, Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("6dd62b46", new Object[]{devicesDelegate, numArr});
        }
        devicesDelegate.c = numArr;
        return numArr;
    }

    public static /* synthetic */ c e(DevicesDelegate devicesDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6b386393", new Object[]{devicesDelegate});
        }
        return devicesDelegate.g;
    }

    public static /* synthetic */ Integer[] f(DevicesDelegate devicesDelegate, Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("e3ec4da5", new Object[]{devicesDelegate, numArr});
        }
        devicesDelegate.d = numArr;
        return numArr;
    }

    public static /* synthetic */ Object ipc$super(DevicesDelegate devicesDelegate, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/DevicesDelegate");
    }

    public static DevicesDelegate j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DevicesDelegate) ipChange.ipc$dispatch("5339fec", new Object[0]);
        }
        if (i == null) {
            synchronized (DevicesDelegate.class) {
                try {
                    if (i == null) {
                        i = new DevicesDelegate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // tb.it1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.it1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f) {
            this.f = true;
            this.e = nbp.q();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd05cc86", new Object[]{this});
        } else if (this.h.compareAndSet(true, false)) {
            TLog.logd("BX", "DevicesService", "endCollectGravity");
            com.taobao.android.behavir.util.b.b(new b());
        }
    }

    public Integer[] i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("b5308a58", new Object[]{this});
        }
        return this.c;
    }

    public Integer[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("eb3cf2b8", new Object[]{this});
        }
        return this.d;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9fd96de", new Object[]{this});
        }
        return this.b;
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0968d", new Object[]{this, str});
            return;
        }
        m();
        this.b = str;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ada511", new Object[]{this});
            return;
        }
        if (!this.f) {
            g();
        }
        if (this.h.compareAndSet(false, true)) {
            TLog.logd("BX", "DevicesService", "startLoopCollectGravity");
            com.taobao.android.behavir.util.b.b(new a());
        }
    }
}
