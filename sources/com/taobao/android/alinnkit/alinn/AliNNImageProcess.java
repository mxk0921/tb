package com.taobao.android.alinnkit.alinn;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNNImageProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Filter {
        NEAREST(0),
        BILINEAL(1),
        BICUBIC(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int type;

        Filter(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(Filter filter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNImageProcess$Filter");
        }

        public static Filter valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Filter) ipChange.ipc$dispatch("9c7ce06d", new Object[]{str});
            }
            return (Filter) Enum.valueOf(Filter.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Format {
        RGBA(0),
        RGB(1),
        BGR(2),
        GRAY(3),
        BGRA(4),
        YUV_420(10),
        YUV_NV21(11);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int type;

        Format(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(Format format, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNImageProcess$Format");
        }

        public static Format valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Format) ipChange.ipc$dispatch("a70b43ce", new Object[]{str});
            }
            return (Format) Enum.valueOf(Format.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Wrap {
        CLAMP_TO_EDGE(0),
        ZERO(1),
        REPEAT(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int type;

        Wrap(int i) {
            this.type = i;
        }

        public static /* synthetic */ Object ipc$super(Wrap wrap, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/alinn/AliNNImageProcess$Wrap");
        }

        public static Wrap valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wrap) ipChange.ipc$dispatch("aa89985b", new Object[]{str});
            }
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float[] f6331a = {0.0f, 0.0f, 0.0f, 0.0f};
        public float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
        public Format c = Format.BGR;
        public Filter d = Filter.NEAREST;
        public final Wrap e = Wrap.CLAMP_TO_EDGE;

        static {
            t2o.a(367001602);
        }

        public a() {
            IpChange ipChange = Format.$ipChange;
        }
    }

    static {
        t2o.a(367001601);
    }

    public static boolean a(Bitmap bitmap, AliNNNetInstance.d.a aVar, a aVar2, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ba74b40", new Object[]{bitmap, aVar, aVar2, matrix})).booleanValue();
        }
        if (matrix == null) {
            matrix = new Matrix();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return AliNNNetNative.nativeConvertBitmapToTensor(bitmap, aVar.d(), aVar2.c.type, aVar2.d.type, aVar2.e.type, fArr, aVar2.f6331a, aVar2.b);
    }
}
