package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.behavix.postureCenter.services.base.bridge.SimpleNetBridge;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class p6a extends it1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_NAME = "gestureModel";
    public static final String MODULE = "BehaviX";
    public static final String TAG = "GestureServices";
    public static p6a e = null;
    public final HashMap<String, String> b;
    public final AtomicIntegerArray j = new AtomicIntegerArray(5);
    public final HashMap<Integer, String> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float[] b;

        /* compiled from: Taobao */
        /* renamed from: tb.p6a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC1025a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.p6a$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class C1026a implements bjj<Integer> {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C1026a() {
                }

                public void a(Integer[] numArr) {
                    String str;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5e57122a", new Object[]{this, numArr});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (Integer num : numArr) {
                        num.intValue();
                        if (p6a.this.d.containsKey(num)) {
                            str = p6a.this.d.get(num);
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        sb.append(",");
                    }
                    TLog.logd("BehaviX", p6a.TAG, "getGesturePredictAsync: " + ((Object) sb));
                    if (numArr.length > 0) {
                        for (int i = 0; i < numArr.length; i++) {
                            p6a.c(p6a.this).set(i, numArr[i].intValue());
                        }
                    }
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
            }

            public RunnableC1025a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SimpleNetBridge.classifyGestures(a.this.b, new C1026a());
                }
            }
        }

        public a(float[] fArr) {
            this.b = fArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/GestureDelegate$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                cet.d().g(new RunnableC1025a());
            }
        }
    }

    static {
        t2o.a(404750594);
    }

    public p6a() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.b = hashMap;
        hashMap.put("down", "0");
        hashMap.put("up", "1");
        hashMap.put("left", "2");
        hashMap.put("right", "3");
    }

    public static /* synthetic */ AtomicIntegerArray c(p6a p6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicIntegerArray) ipChange.ipc$dispatch("d6f453af", new Object[]{p6aVar});
        }
        return p6aVar.j;
    }

    public static p6a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p6a) ipChange.ipc$dispatch("207a900", new Object[0]);
        }
        if (e == null) {
            e = new p6a();
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(p6a p6aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/GestureDelegate");
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

    public final float[] d(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ee003264", new Object[]{this, map});
        }
        String[] strArr = {TBImageFlowMonitor.SPEED_MEASURE, "x1", "y1", "x2", "y2", "angle", "duration", "startTouchPosition", "endTouchPosition", "screenW", "screenH"};
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 11; i++) {
            String str2 = strArr[i];
            if (map.containsKey(str2)) {
                linkedList.add(Float.valueOf(Float.parseFloat(map.get(str2))));
            }
        }
        if (this.b.containsKey(map.get("slideDirection"))) {
            str = this.b.get(map.get("slideDirection"));
        } else {
            str = "-1";
        }
        linkedList.add(Float.valueOf(Float.parseFloat(str)));
        linkedList.add(Float.valueOf(((Float) linkedList.get(4)).floatValue() - ((Float) linkedList.get(2)).floatValue()));
        linkedList.add(Float.valueOf(((Float) linkedList.get(3)).floatValue() - ((Float) linkedList.get(1)).floatValue()));
        linkedList.add(Float.valueOf((float) Math.sqrt(Math.pow(((Float) linkedList.get(4)).floatValue() - ((Float) linkedList.get(2)).floatValue(), 2.0d) + Math.pow(((Float) linkedList.get(3)).floatValue() - ((Float) linkedList.get(1)).floatValue(), 2.0d))));
        String str3 = map.get("path");
        if (TextUtils.isEmpty(str3)) {
            return new float[0];
        }
        String[] split = str3.split("_");
        for (int i2 = 0; i2 < 8; i2++) {
            if (i2 < split.length) {
                String[] split2 = split[i2].split(",");
                if (split2.length >= 2) {
                    linkedList.add(Float.valueOf(Float.parseFloat(split2[0])));
                    linkedList.add(Float.valueOf(Float.parseFloat(split2[1])));
                }
            } else {
                linkedList.add(Float.valueOf(-1.0f));
                linkedList.add(Float.valueOf(-1.0f));
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(((Float) it.next()).floatValue());
            sb.append(",");
        }
        TLog.logd("BehaviX", TAG, "getGestureInfoFeature: " + sb.toString());
        float[] fArr = new float[linkedList.size()];
        for (int i3 = 0; i3 < linkedList.size(); i3++) {
            fArr[i3] = ((Float) linkedList.get(i3)).floatValue();
        }
        return fArr;
    }

    public int[] e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("2b644b5c", new Object[]{this, map});
        }
        this.d.put(0, "左持左滑");
        this.d.put(1, "左持右滑");
        this.d.put(2, "右持左滑");
        this.d.put(3, "右持右滑");
        b.a(new a(d(map)), 100L);
        int[] iArr = new int[this.j.length()];
        for (int i = 0; i < this.j.length(); i++) {
            iArr[i] = this.j.get(i);
        }
        return iArr;
    }
}
