package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27166a;
    public Bitmap b;
    public long c;
    public List<RectF> d;
    public List<Float> e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i;

    static {
        t2o.a(482345007);
    }

    public r7l(int i) {
        this.f27166a = i;
    }

    public static r7l a(List<RectF> list, List<Float> list2, Bitmap bitmap, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7l) ipChange.ipc$dispatch("ba34347b", new Object[]{list, list2, bitmap, new Long(j), str});
        }
        r7l r7lVar = new r7l(-1);
        r7lVar.b = bitmap;
        r7lVar.d = list;
        r7lVar.e = list2;
        r7lVar.c = j;
        r7lVar.i = str;
        return r7lVar;
    }

    public static r7l b(List<RectF> list, List<Float> list2, Bitmap bitmap, String str, String str2, String str3, long j, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7l) ipChange.ipc$dispatch("67c4c45d", new Object[]{list, list2, bitmap, str, str2, str3, new Long(j), str4});
        }
        r7l a2 = a(list, list2, bitmap, j, str4);
        a2.g = str;
        a2.h = str2;
        a2.f = str3;
        return a2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OptimizeOutput{id=" + this.f27166a + ", branch=false, conf=0.0, bitmap=" + this.b + ", time=" + this.c + ", failedReason='null', className='null', mainPart=null, mBox=" + Arrays.toString((float[]) null) + ", hint='null'}";
    }
}
